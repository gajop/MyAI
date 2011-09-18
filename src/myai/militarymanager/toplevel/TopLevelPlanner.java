package myai.militarymanager.toplevel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

import myai.militarymanager.MilitaryManager;
import myai.militarymanager.battlegroup.BattleGroup;
import myai.militarymanager.battlegroup.BattleGroupListener;
import myai.militarymanager.toplevel.clustering.deterministic.DeterministicForceGenerator;
import myai.militarymanager.toplevel.clustering.deterministic.kmeans.MinDistanceBasedKMeansWrapper;
import myai.militarymanager.toplevel.clustering.force.Force;
import myai.militarymanager.toplevel.clustering.force.simpleforce.SimpleForce;
import myai.militarymanager.toplevel.clustering.force.simpleforce.SimpleForceFactory;
import myai.militarymanager.toplevel.orders.AttackForceBattleGroupOrder;
import myai.militarymanager.toplevel.orders.MoveBattleGroupOrder;
import myai.utility.SpringCommunications;
import myai.utility.VectorUtil;

public class TopLevelPlanner implements BattleGroupListener {
	SpringCommunications spring;
	MilitaryManager militaryManager;
    DeterministicForceGenerator forceGenerator;
    List<Force> myForces = new LinkedList<Force>(); //simplified look on owned battlegroups 
	
	public TopLevelPlanner(SpringCommunications spring,
			MilitaryManager militaryManager) {
		super();
		this.spring = spring;
		this.militaryManager = militaryManager;
		this.militaryManager.getBattleGroups().registerListener(this);
        this.forceGenerator = new DeterministicForceGenerator(spring, 
        		militaryManager, new SimpleForceFactory(spring),
        		new MinDistanceBasedKMeansWrapper(400));
	}

	public void update(int frame) {		
		battleGroupOrderAssignments();
		combineBattleGroups();
	}
	
	void combineBattleGroups() {
		Set<BattleGroup> battleGroups = militaryManager.getBattleGroups().getBattleGroups();
		Set<BattleGroup> toRemove = new HashSet<BattleGroup>();
		for (Iterator<BattleGroup> i = battleGroups.iterator(); i.hasNext();) {
			BattleGroup first = i.next();
			if (toRemove.contains(first)) {
				continue;
			}
			for (Iterator<BattleGroup> j = i; j.hasNext();) {
				BattleGroup second = j.next();
				if (!first.getOrder().equals(second.getOrder())) {
					continue;
				}
				if (toRemove.contains(second)) {
					continue;
				}
				if (first.equals(second) || first.getUnits().isEmpty() || second.getUnits().isEmpty()) {
					continue;
				}
				AIFloat3 firstCenter = VectorUtil.averageFromUnits(first.getUnits());
				AIFloat3 secondCenter = VectorUtil.averageFromUnits(second.getUnits());
				if (VectorUtil.distance(firstCenter, secondCenter) < 400) {
					boolean same = false;
					for (Unit firstUnit : first.getUnits()) { //UGLY, DIE
						for (Unit secondUnit: second.getUnits()) {
							if (firstUnit.getDef().equals(secondUnit.getDef())) {
								same = true;
							}
							break;
						}	
						break;
					}
					if (same) {
						for (Unit unit : second.getUnits()) {
							militaryManager.getBattleGroups().addUnit(unit, first);
						}
						toRemove.add(second);	
					}
				}				
			}			
		}
	}
	
	void battleGroupOrderAssignments() {
		List<Force> enemyForces = forceGenerator.generateEnemyForces();
        for (Force myForce: myForces) {
        	BattleGroup battleGroup = myForce.getOriginalBattleGroup();
            if (!myForce.getOriginalBattleGroup().getUnits().isEmpty()) {
            	boolean isFlash = false;
                for (Unit unit : battleGroup.getUnits()) {
                	if (unit == null || unit.getDef() == null) {
                		continue;
                	}
                	if (unit.getDef().getName().equals("armflash")) {
                		isFlash = true;
                	}
                	break;
                }
                AIFloat3 center = VectorUtil.averageFromUnits(battleGroup.getUnits());
                if (isFlash) {
                	double DISTANCE_OF_ENGAGEMENT = 1500;  
                	if (battleGroup.getUnits().size() < 20) {
		                Force closest = null;
		                double closestDistance = Double.POSITIVE_INFINITY;
		                for (Force enemyForce : enemyForces) {
		                    SimpleForce simpleForce = (SimpleForce) enemyForce;
		                    AIFloat3 position = simpleForce.getOriginalPosition();
		                    double distance = VectorUtil.distance(position, center);
		                    if (distance < closestDistance) {
		                        closest = simpleForce;
		                        closestDistance = distance;
		                    }
		                }
		                if (closest != null) {		                                      
		                    if (closestDistance < DISTANCE_OF_ENGAGEMENT || battleGroup.getUnits().size() > 4 || battleGroup.isSent()) {
		                    	battleGroup.setOrder(new AttackForceBattleGroupOrder(battleGroup, closest));	
		                    	battleGroup.setSent(true);
		                    }
		                }
                	} else {
                		double highestValue = Double.NEGATIVE_INFINITY;
                		Force best = null;
                		Force closest = null;
                		double closestDistance = Double.POSITIVE_INFINITY;
                		for (Force enemyForce : enemyForces) {
                			SimpleForce simpleForce = (SimpleForce) enemyForce;
		                    AIFloat3 position = simpleForce.getOriginalPosition();
		                    double distance = VectorUtil.distance(position, center);
		                    double value = simpleForce.getValue();
		                    if (value > highestValue) {
		                    	best = simpleForce;
		                    	highestValue = value;
		                    } 
		                    if (distance < closestDistance) {
		                        closest = simpleForce;
		                        closestDistance = distance;
		                    }
                		}
                		if (closest != null) {
	                		if (closestDistance < DISTANCE_OF_ENGAGEMENT) {
	                			battleGroup.setOrder(new AttackForceBattleGroupOrder(battleGroup, closest));	
		                    	battleGroup.setSent(true);
	                		} else {
	                			battleGroup.setOrder(new AttackForceBattleGroupOrder(battleGroup, best));	
		                    	battleGroup.setSent(true);
	                		}
                		}
                	}
                } else {
                	Force best = null;
                	double bestEstimate = Double.NEGATIVE_INFINITY;
                	double bestDistance = 0;
                	for (Force enemyForce: enemyForces) {
                		SimpleForce simpleForce = (SimpleForce) enemyForce;
                		if (simpleForce.getOwner() == spring.getClb().getTeamId()) {
	                        continue;
	                    }                		
                		double distance = VectorUtil.distance(center, simpleForce.getOriginalPosition());
                		double strength = simpleForce.getHp() * simpleForce.getDpf();
                		double estimate = simpleForce.getValue() / (strength * distance);
                		if (estimate > bestEstimate || best == null || (strength == 0 && distance < bestDistance)) {
                			bestDistance = distance;
                			bestEstimate = estimate;
                			best = simpleForce;
                		}
                	}
                	if (best != null) {
                		if (battleGroup.getUnits().size() >= 1 || battleGroup.isSent()) {
	                		battleGroup.setOrder(new AttackForceBattleGroupOrder(battleGroup, best));
	                		battleGroup.setSent(true);
                		}
                	}
                }
             }
         }		
	}

	public SpringCommunications getSpring() {
		return spring;
	}

	public void setSpring(SpringCommunications spring) {
		this.spring = spring;
	}

	public MilitaryManager getMilitaryManager() {
		return militaryManager;
	}

	public void setMilitaryManager(MilitaryManager militaryManager) {
		this.militaryManager = militaryManager;
	}

	public DeterministicForceGenerator getForceGenerator() {
		return forceGenerator;
	}

	public void setForceGenerator(DeterministicForceGenerator forceGenerator) {
		this.forceGenerator = forceGenerator;
	}

	@Override
	public void battleGroupAdded(BattleGroup battleGroup) {
		Force newForce = this.forceGenerator.getForceFactory().generate(battleGroup);
		myForces.add(newForce);
	}

	@Override
	public void battleGroupRemoved(BattleGroup battleGroup) {
		for (Iterator<Force> i = myForces.iterator(); i.hasNext();) {
			Force force = i.next();
			if (force.getOriginalBattleGroup().equals(battleGroup)) {
				i.remove();
				break;
			}
		}
	}

	@Override
	public void battleGroupChanged(BattleGroup battleGroup) {
		for (Iterator<Force> i = myForces.iterator(); i.hasNext();) {
			Force force = i.next();
			if (force.getOriginalBattleGroup().equals(battleGroup)) {
				i.remove();
				break;
			}
		}
		Force newForce = this.forceGenerator.getForceFactory().generate(battleGroup);
		myForces.add(newForce);
	}
}

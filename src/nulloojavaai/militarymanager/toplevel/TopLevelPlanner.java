package nulloojavaai.militarymanager.toplevel;

import java.util.List;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

import nulloojavaai.militarymanager.MilitaryManager;
import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.militarymanager.toplevel.orders.MoveBattleGroupOrder;
import nulloojavaai.militarymanager.toplevel.simpleforce.SimpleForce;
import nulloojavaai.militarymanager.toplevel.simpleforce.SimpleForceFactory;
import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.VectorUtil;

public class TopLevelPlanner {
	SpringCommunications spring;
	MilitaryManager militaryManager;
    DeterministicForceGenerator forceGenerator;
	
	public TopLevelPlanner(SpringCommunications spring,
			MilitaryManager militaryManager) {
		super();
		this.spring = spring;
		this.militaryManager = militaryManager;
        this.forceGenerator = new DeterministicForceGenerator(spring, 
        		militaryManager, new SimpleForceFactory(spring));
	}

	public void update(int frame) {
		List<Force> forces = forceGenerator.generateForces();
        for (BattleGroup battleGroup : militaryManager.getBattleGroups()) {
            if (!battleGroup.getUnits().isEmpty()) {
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
	                AIFloat3 closest = null;
	                double closestDistance = Double.MAX_VALUE;
	                for (Force force : forces) {
	                    SimpleForce simpleForce = (SimpleForce) force;
	                    if (simpleForce.getOwner() == spring.getClb().getTeamId()) {
	                        continue;
	                    }
	                    AIFloat3 position = simpleForce.getOriginalPosition();
	                    double distance = VectorUtil.distance(position, center);
	                    if (distance < closestDistance) {
	                        closest = position;
	                        closestDistance = distance;
	                    }
	                }
	                if (closest != null) {
	                    double DISTANCE_OF_ENGAGEMENT = 1000;                    
	                    if (closestDistance < DISTANCE_OF_ENGAGEMENT || battleGroup.getUnits().size() > 4 || battleGroup.isSent()) {
	                    	battleGroup.setOrder(new MoveBattleGroupOrder(battleGroup, closest));	
	                    	battleGroup.setSent(true);
	                    }
	                }
                } else {
                	AIFloat3 best = null;
                	double bestEstimate = Double.NEGATIVE_INFINITY;
                	double bestDistance = 0;
                	for (Force force : forces) {
                		SimpleForce simpleForce = (SimpleForce) force;
                		if (simpleForce.getOwner() == spring.getClb().getTeamId()) {
	                        continue;
	                    }                		
                		double distance = VectorUtil.distance(center, simpleForce.getOriginalPosition());
                		double strength = simpleForce.getHp() * simpleForce.getDpf();
                		double estimate = simpleForce.getValue() / (strength * distance);
                		if (estimate > bestEstimate || best == null || (strength == 0 && distance < bestDistance)) {
                			bestDistance = distance;
                			bestEstimate = estimate;
                			best = simpleForce.getOriginalPosition();
                		}
                	}
                	if (best != null) {
                		if (battleGroup.getUnits().size() >= 1 || battleGroup.isSent()) {
	                		battleGroup.setOrder(new MoveBattleGroupOrder(battleGroup, best));
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
}

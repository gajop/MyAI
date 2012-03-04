/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.build;

//import com.springrts.ai.AICommand;
import com.springrts.ai.oo.Enumerations;
import com.springrts.ai.oo.AIFloat3;
//import com.springrts.ai.command.*;
import com.springrts.ai.oo.clb.OOAICallback;
import com.springrts.ai.oo.clb.Resource;
import com.springrts.ai.oo.clb.Unit;
import com.springrts.ai.oo.clb.UnitDef;

import java.util.*;
import java.util.logging.Logger;

import myai.Module;
import myai.MyAI;
import myai.build.scheduler.BuildScheduler;
import myai.unitmanager.UnitManager;
import myai.unitmanager.UnitManagerListener;
import myai.utility.SpringCommunications;
import myai.utility.UnitDefUtil;
import myai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public class BuildManager extends Module implements UnitManagerListener {
    private Unit commander = null;
    private LinkedList<UnitDef>  initialBuildOrder = new LinkedList<UnitDef>();
    private LinkedList<UnitDef>  repeatingBuildOrder = new LinkedList<UnitDef>();
    int repeatingBOPos = 0;
    private UnitDef solarPlant = null, mex = null, vehPlantType = null, 
            flash = null, vehcon = null, nano = null, jeffy = null;
    boolean busy = false;
    private LinkedList<AIFloat3> takenResources = new LinkedList<AIFloat3>();
    private Unit vehPlant = null;
    BuildScheduler buildScheduler;
    SpringCommunications spring;
    Logger log;
    UnitManager unitManager;
    int failed = Integer.MIN_VALUE;

    public void setUnitManager(UnitManager unitManager) {
        this.unitManager = unitManager;
    }

    public BuildManager(SpringCommunications spring) {
        this.spring = spring;
        log = spring.getLogger("build-manager");
    }

    @Override
    public int init(int teamId, OOAICallback callback) {
         initialize();
         buildScheduler = new BuildScheduler(spring);
         for (UnitDef unitDef : spring.getClb().getUnitDefs()) {
            if (unitDef.getName().equals("armsolar")) {
                solarPlant = unitDef;
            } else if (unitDef.getName().equals("armmex")) {
                mex = unitDef;
            } else if (unitDef.getName().equals("armvp")) {
                vehPlantType = unitDef;
            } else if (unitDef.getName().equals("armflash")) {
                flash = unitDef;                
            } else if (unitDef.getName().equals("armcv")) {
                vehcon = unitDef;
            } else if (unitDef.getName().equals("armnanotc")) {
                nano = unitDef;
            } else if (unitDef.getName().equals("armfav")) {
            	jeffy = unitDef;
            }
        }
        initialBuildOrder.addAll(Arrays.asList(mex, mex, mex, solarPlant,
                solarPlant, vehPlantType, solarPlant));
        repeatingBuildOrder.addAll(Arrays.asList(vehcon, jeffy, jeffy, 
        		flash, flash, flash, flash, flash));
        return 0;
    }

    private List<AIFloat3> metalSpots;

    private void initialize() {
        for (Resource resource : spring.getClb().getResources()) {
            if (resource.getName().equals("Metal")) {
                metalSpots = spring.getClb().
                        getMap().getResourceMapSpotsPositions(resource);
            }
        }
    }

    private AIFloat3 findNearestMetalSpot(AIFloat3 position,
            List<AIFloat3> metalSpots) {
        AIFloat3 best = null;
        double bestDistance = Double.MAX_VALUE;
        for (AIFloat3 metalSpot : metalSpots) {
            double dx = position.x - metalSpot.x;
            double dz = position.z - metalSpot.z;
            double distance = dx * dx + dz * dz;
            if (bestDistance > distance) {
                bestDistance = distance;
                best = metalSpot;
            }
        }
        return best;
    }

    public AIFloat3 findNearestMetalSpot(AIFloat3 position) {
        return findNearestMetalSpot(position, metalSpots);
    }

    public AIFloat3 findNearestUnusedMetalSpot(AIFloat3 position) {
        List<AIFloat3> unusedMetalSpots = new LinkedList<AIFloat3>(metalSpots);
        unusedMetalSpots.removeAll(takenResources);
        return findNearestMetalSpot(position, unusedMetalSpots);
    }

    @Override
    public int update(int frame) {
    	if (frame == 1) {
	        AIFloat3 centerEnemy = VectorUtil.averageFromUnits(spring.getClb().getEnemyUnits());
	        AIFloat3 centerMe = VectorUtil.averageFromUnits(spring.getClb().getTeamUnits());
	        double dx = centerMe.x - centerEnemy.x;
	        double dz = centerMe.z - centerEnemy.z;
	        spring.sendTextMsg(String.valueOf(dx) + " "  + String.valueOf(dz));
	        if (Math.abs(dx) > Math.abs(dz)) {
	        	if (dx > 0) {
	        		buildScheduler.setFacing(3); //left
	        	} else {
	        		buildScheduler.setFacing(1); //right
	        	}
	        } else {
	        	if (dz > 0) {
	        		buildScheduler.setFacing(2); //up        		
	        	} else {
	        		buildScheduler.setFacing(0); //down    		
	        	}
	        }
    	}        	
        if (this.commander != null) {
            if (!initialBuildOrder.isEmpty()) {
                UnitDef currentUnitDef = initialBuildOrder.getFirst();
                if (buildScheduler.canBuild(currentUnitDef, this.commander)) {
                    AIFloat3 position;
                    if (!currentUnitDef.equals(mex)) {
                    	position = this.buildScheduler.findClosestBuildSite(currentUnitDef,
                                this.commander.getPos(), 3000);
                        /*position = spring.getClb().getMap().findClosestBuildSite(currentUnitDef,
                                this.commander.getPos(), 300, 8, buildScheduler.getFacing());*/
                    } else {
                        position = findNearestUnusedMetalSpot(this.commander.getPos());
                        takenResources.add(position);                        
                    }
                    if (position != null) {
                        buildScheduler.build(currentUnitDef, commander, position);
                        initialBuildOrder.removeFirst();
                    }
                }
            } else {
                List<AIFloat3> resourcePositions = null;
                double eCurrent = 0;
                double eMax = 0;
                double mCurrent = 0;
                double mMax = 0;
                for (Resource resource : spring.getClb().getResources()) {
                    if (resource.getName().equals("Metal")) {
                        resourcePositions = spring.getClb().
                                getMap().getResourceMapSpotsPositions(resource);
                        mCurrent = spring.getClb().getEconomy().
                                getCurrent(resource);
                        mMax = spring.getClb().getEconomy().
                                getStorage(resource);
                    } else if (resource.getName().equals("Energy")) {
                        eCurrent = spring.getClb().getEconomy().
                                getCurrent(resource);
                        eMax = spring.getClb().getEconomy().
                                getStorage(resource);
                    }
                    
                }
                if (failed + 500 < frame) {
		            for (Unit builder : buildScheduler.getIdleBuilders()) {
		                if (!builder.getDef().equals(this.vehcon)) {
		                    continue;
		                } else if (VectorUtil.distance(builder.getPos(), vehPlant.getPos()) < 60) {
		                    continue;
		                }                    
		                if (eCurrent < eMax / 4) { //25% total energy, need more
		                    if (buildScheduler.canBuild(solarPlant, builder)) {
		                    	AIFloat3 position = buildScheduler.findClosestBuildSite(solarPlant, this.commander.getPos(), 3000);
		                      /*  AIFloat3 position = spring.getClb().
		                                getMap().findClosestBuildSite(solarPlant,
		                                this.commander.getPos(), 300, 8, this.buildScheduler.getFacing());*/
		                        if (buildScheduler.canBuild(solarPlant, builder, position)) {
		                            boolean ownershipGranted = unitManager.requestUnit(builder, this);
		                            if (ownershipGranted) {
		                                buildScheduler.build(solarPlant, builder, position);
		                            }
		                        }
		                    }
		                } else if (mCurrent < mMax / 3) {  //33% total metal, need more
		                    if (resourcePositions.isEmpty()) {
		                        break;
		                    }
		                    if (buildScheduler.canBuild(mex, builder)) {
		                        AIFloat3 builderPos = builder.getPos();
		                        AIFloat3 bestPos = findNearestUnusedMetalSpot(builderPos);
		                        if (buildScheduler.canBuild(mex, builder, bestPos)) {
		                            boolean ownershipGranted = unitManager.requestUnit(builder, this);
		                            if (ownershipGranted) {
		                                buildScheduler.build(mex, builder, bestPos);
		                                takenResources.add(bestPos);
		                            }
		                        }
		                    }
		                } else if (mCurrent > mMax / 2) {
		                    if (buildScheduler.canBuild(nano, builder)) {
		                       /* AIFloat3 position = spring.getClb().getMap().findClosestBuildSite(nano, vehPlant.getPos(), 300, 8, this.buildScheduler.getFacing());*/
		                        AIFloat3 position = this.buildScheduler.findClosestBuildSite(nano, vehPlant.getPos(), 3000);
		                        if (buildScheduler.canBuild(nano, builder, position)) {
		                            boolean ownershipGranted = unitManager.requestUnit(builder, this);
		                            if (ownershipGranted) {
		                                buildScheduler.build(nano, builder, position);
		                            }
		                        } else {
		                            if (resourcePositions.isEmpty()) {
		                                break;
		                            }
		                            if (buildScheduler.canBuild(mex, builder)) {
		                                AIFloat3 builderPos = builder.getPos();
		                                AIFloat3 bestPos = findNearestUnusedMetalSpot(builderPos);
		                                if (buildScheduler.canBuild(mex, builder, bestPos)) {
		                                    boolean ownershipGranted = unitManager.requestUnit(builder, this);
		                                    if (ownershipGranted) {
		                                        buildScheduler.build(mex, builder, bestPos);
		                                        takenResources.add(bestPos);
		                                    }
		                                }
		                            }
		                        }
		                    }
		                } else {
	                    	failed = frame;
	                    }
		            }
                }
                UnitDef currentUnitDef = repeatingBuildOrder.get(repeatingBOPos);
                if (vehPlant != null && buildScheduler.
                    canBuild(currentUnitDef, this.vehPlant)) {
                    buildScheduler.build(this.vehPlant, currentUnitDef);
                    repeatingBOPos++;
                    if (repeatingBOPos >= repeatingBuildOrder.size()) {
                        repeatingBOPos = 0;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public int unitFinished(Unit unit) {    	
    	buildScheduler.unitFinished(unit);
        if (unit.getDef().getName().equals("armcom")) {
            this.commander = unit;
        } else if (unit.getDef().equals(this.vehPlantType)) {
            this.vehPlant = unit;            
        } else if (UnitDefUtil.isNano(unit.getDef())) {
            boolean ownershipGranted = unitManager.requestUnit(unit, this);
            if (ownershipGranted) {
                AIFloat3 patrolPos = new AIFloat3(unit.getPos());
                patrolPos.x -= 50;
                unit.patrolTo(patrolPos, MyAI.getOpts(), MyAI.getTimeout());
                log.info("sending unit to patrol");
                unit.setRepeat(true, MyAI.getOpts(), MyAI.getTimeout());
                log.info("sending unit to repeat");
                unit.setFireState(3, MyAI.getOpts(), MyAI.getTimeout());
                log.info("sending unit to repeat");
            }
        }        
        return 0; 
    }
    
    @Override
    public int unitIdle(Unit unit) {
    	buildScheduler.unitIdle(unit);
        if (this.commander.equals(unit)) {
            this.busy = false;
            if (initialBuildOrder.isEmpty()) {            	
            	this.commander.guard(this.vehPlant, MyAI.getOpts(), MyAI.getTimeout());
            }
        }        
        return 0; 
    }

    @Override
    public int commandFinished(Unit unit, int commandId, int commandTopicId) {
    	System.out.println("Command finished " + commandTopicId);
        if (unit.getDef().getName().equals("armcv")) {
        	if (Enumerations.CommandTopic.COMMAND_UNIT_BUILD.getValue() == commandTopicId) {
                unitManager.releaseUnit(unit, this);
        	}
        }
        return 0; 
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        buildScheduler.unitDestroyed(unit);
        if (unit.getDef().equals(mex)) {
            AIFloat3 nearestMetalSpot = findNearestMetalSpot(unit.getPos());
            if (nearestMetalSpot != null) {
                takenResources.remove(nearestMetalSpot);
            }
        }
        return 0;
    }

    @Override
    public String getModuleName() {
        return "BuildManager";
    }

    public void unitOwnershipGained(Unit unit) {
        buildScheduler.unitOwnershipGained(unit);
    }

    public void unitOwnershipLost(Unit unit) {
        buildScheduler.unitOwnershipLost(unit);
    }

	@Override
	public int unitCreated(Unit unit, Unit builder) {
		this.buildScheduler.unitCreated(unit, builder);
		return 0;
	}
}

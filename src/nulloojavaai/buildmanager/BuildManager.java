/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.*;
import com.springrts.ai.oo.OOAICallback;
import com.springrts.ai.oo.Resource;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import nulloojavaai.Module;
import nulloojavaai.unitmanager.UnitManager;
import nulloojavaai.unitmanager.UnitManagerListener;
import nulloojavaai.buildmanager.buildscheduler.BuildScheduler;
import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.VectorUtil;

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
            flash = null, vehcon = null, nano = null;
    boolean busy = false;
    private LinkedList<AIFloat3> takenResources = new LinkedList<AIFloat3>();
    private Unit vehPlant = null;
    BuildScheduler buildScheduler;
    SpringCommunications spring;
    Logger log;
    UnitManager unitManager;

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
            }
        }
        initialBuildOrder.addAll(Arrays.asList(mex, mex, mex, solarPlant,
                solarPlant, vehPlantType, solarPlant));
        repeatingBuildOrder.addAll(Arrays.asList(vehcon, flash, flash, flash,
                flash, flash));
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
        if (this.commander != null) {
            if (!initialBuildOrder.isEmpty()) {
                UnitDef currentUnitDef = initialBuildOrder.getFirst();
                if (buildScheduler.canBuild(currentUnitDef, this.commander)) {
                    AIFloat3 position;
                    if (!currentUnitDef.equals(mex)) {
                        position = spring.getClb().getMap().findClosestBuildSite(currentUnitDef,
                                this.commander.getPos(), 300, 5, 0);
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
                for (Unit builder : buildScheduler.getIdleBuilders()) {
                    if (!builder.getDef().equals(this.vehcon)) {
                        continue;
                    } else if (VectorUtil.distance(builder.getPos(), vehPlant.getPos()) < 60) {
                        continue;
                    }
                    if (eCurrent < eMax / 4) { //25% total energy, need more
                        if (buildScheduler.canBuild(solarPlant, builder)) {
                            AIFloat3 position = spring.getClb().
                                    getMap().findClosestBuildSite(solarPlant,
                                    builder.getPos(), 300, 5, 0);
                            if (buildScheduler.canBuild(solarPlant, builder, position)) {
                                buildScheduler.build(solarPlant, builder, position);
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
                                buildScheduler.build(mex, builder, bestPos);
                                takenResources.add(bestPos);
                            }
                        }
                    } else if (mCurrent > mMax / 2) {
                        if (buildScheduler.canBuild(nano, builder)) {
                            AIFloat3 position = spring.getClb().
                                    getMap().findClosestBuildSite(nano,
                                    vehPlant.getPos(), 300, 8, 0);
                            if (buildScheduler.canBuild(nano, builder, position)) {
                                buildScheduler.build(nano, builder, position);
                            }
                        }
                    } /*else {
                        if (this.vehPlant != null) {
                            buildScheduler.assist(builder, vehPlant);
                        }
                    }  */
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
        if (unit.getDef().getName().equals("armcom")) {
            this.commander = unit;
        } else if (unit.getDef().equals(this.vehPlantType)) {
            this.vehPlant = unit;            
        } else if (unit.getDef().equals(nano)) {
            AIFloat3 patrolPos = new AIFloat3(unit.getPos());
            patrolPos.x -= 50;
            AICommand command = new PatrolUnitAICommand(unit,
                    -1, new ArrayList<AICommand.Option>(),
                    10000, patrolPos);
            spring.handleEngineCommand(command);
            log.info("sending unit to patrol");
            command = new SetRepeatUnitAICommand(unit,
                    -1, new ArrayList<AICommand.Option>(),
                    10000, true);
            spring.handleEngineCommand(command);
            log.info("sending unit to repeat");
            command = new SetFireStateUnitAICommand(unit,
                    -1, new ArrayList<AICommand.Option>(),
                    10000, 3);
            spring.handleEngineCommand(command);
            log.info("sending unit to repeat");
        }
        buildScheduler.unitFinished(unit);
        return 0; 
    }
    
    @Override
    public int unitIdle(Unit unit) {
        if (this.commander.equals(unit)) {
            this.busy = false;
            if (initialBuildOrder.isEmpty()) {
                GuardUnitAICommand command = new GuardUnitAICommand(this.commander,
                          -1, new ArrayList<AICommand.Option>(),
                          10000, this.vehPlant);
                spring.handleEngineCommand(command);
            }
        }
        buildScheduler.unitIdle(unit);
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

    public void onUnitOwnershipGained(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void onUnitOwnershipLost(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

package nulloojavaai.economymanager;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.ReclaimAreaUnitAICommand;
import com.springrts.ai.command.ReclaimUnitAICommand;
import com.springrts.ai.oo.Feature;
import com.springrts.ai.oo.Resource;
import com.springrts.ai.oo.Unit;
import nulloojavaai.Module;
import nulloojavaai.unitmanager.UnitManager;
import nulloojavaai.unitmanager.UnitManagerListener;
import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.VectorUtil;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class EconomyManager extends Module implements UnitManagerListener {
    UnitManager unitManager;
    SpringCommunications spring;
    Logger log;
    List<Unit> potentialGatherers = new LinkedList<Unit>();
    List<Unit> usedGatherers = new LinkedList<Unit>();    

    public EconomyManager(SpringCommunications spring) {
        this.spring = spring;
        this.log = spring.getLogger("economy");
    }

    @Override
    public String getModuleName() {
        return "EconomyManager";
    }

    public void onUnitOwnershipGained(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void onUnitOwnershipLost(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setUnitManager(UnitManager unitManager) {
        this.unitManager = unitManager;
    }

    @Override
    public int update(int frame) {
        if (true || frame % 50 != 0) return 0;        
        if (potentialGatherers.isEmpty()) {
            return 0;
        }
        List<Feature> features = spring.getClb().getFeatures();
        Resource metal = null;
        for (Resource resource : this.spring.getClb().getResources()) {
            if (resource.getName().equals("Metal")) {
                metal = resource;
                break;
            }
        }
        if (metal == null) {
            return -1;
        }
        List<Feature> metalFeatures = new LinkedList<Feature>();
        for (Feature feature : features) {
            if (feature.getDef().getContainedResource(metal) > 0) {
                metalFeatures.add(feature);
            }
        }
        if (metalFeatures.isEmpty()) {
            return 0;
        }
        for (Unit gatherer : potentialGatherers) {
            if (usedGatherers.contains(gatherer) || unitManager.isOwned(gatherer)) {
                continue;
            }
            double closestDistance = Double.MAX_VALUE;
            Feature closest = null;
            for (Feature feature : metalFeatures) {
                double distance = VectorUtil.distance(feature.getPosition(),
                        gatherer.getPos());
                if (distance < closestDistance) {
                    closestDistance = distance;
                    closest = feature;
                }
            }
            double MAX_GATHERING_RANGE = 1000;
            if (closest != null) {
                boolean ownershipGranted = unitManager.requestUnit(gatherer, this);
                if (ownershipGranted) {
                    log.info("sending unit to reclaim resource");
                    /*ReclaimUnitAICommand command = new ReclaimUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getFeatureId());*/
                    ReclaimAreaUnitAICommand command = new ReclaimAreaUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getPosition(), 100);
                    this.spring.handleEngineCommand(command);
                    //this.spring.drawLine(gatherer.getPos(), closest.getPosition());
                    usedGatherers.add(gatherer);
                }
            }
        }
        return 0;
    }

    @Override
    public int commandFinished(Unit unit, int commandId, int commandTopicId) {
        if (commandTopicId == ReclaimUnitAICommand.TOPIC && usedGatherers.contains(unit)) {
            usedGatherers.remove(unit);
            unitManager.releaseUnit(unit, this);
        }
        return 0;
    }

    @Override
    public int unitFinished(Unit unit) {
        if (isGatherer(unit)) {
            potentialGatherers.add(unit);
        }
        return 0;
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        if (isGatherer(unit)) {
            potentialGatherers.remove(unit);
            usedGatherers.remove(unit);
        }
        return 0;
    }

    public boolean isGatherer(Unit unit) {
        if (unit.getDef().getName().equals("armcv")) {
            return true;
        }
        return false;
    }
}

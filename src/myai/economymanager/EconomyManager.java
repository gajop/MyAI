package myai.economymanager;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.ReclaimAreaUnitAICommand;
import com.springrts.ai.command.ReclaimUnitAICommand;
import com.springrts.ai.oo.Feature;
import com.springrts.ai.oo.Resource;
import com.springrts.ai.oo.Unit;

import myai.Module;
import myai.unitmanager.UnitManager;
import myai.unitmanager.UnitManagerListener;
import myai.utility.SpringCommunications;
import myai.utility.VectorUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class EconomyManager extends Module implements UnitManagerListener {
    UnitManager unitManager;
    SpringCommunications spring;
    Logger log;
    List<Unit> potentialGatherers = new LinkedList<Unit>();
    List<FeatureAssignment> usedGatherers = new LinkedList<FeatureAssignment>();    
    List<Feature> usedFeatures = new LinkedList<Feature>();
    class FeatureAssignment {
    	Unit unit;
    	Feature feature;
		public FeatureAssignment(Unit unit, Feature feature) {
			super();
			this.unit = unit;
			this.feature = feature;
		}
		public Unit getUnit() {
			return unit;
		}
		public void setUnit(Unit unit) {
			this.unit = unit;
		}
		public Feature getFeature() {
			return feature;
		}
		public void setFeature(Feature feature) {
			this.feature = feature;
		}
    	
    }

    public EconomyManager(SpringCommunications spring) {
        this.spring = spring;
        this.log = spring.getLogger("economy");
    }

    @Override
    public String getModuleName() {
        return "EconomyManager";
    }

    public void unitOwnershipGained(Unit unit) {
    	List<Feature> features = spring.getClb().getFeatures();
        Resource metal = null;
        for (Resource resource : this.spring.getClb().getResources()) {
            if (resource.getName().equals("Metal")) {
                metal = resource;
                break;
            }
        }
        if (metal == null) {
            return;
        }
        List<Feature> metalFeatures = new LinkedList<Feature>();
        for (Feature feature : features) {
            if (feature.getDef().getContainedResource(metal) > 0) {
                metalFeatures.add(feature);
            }
        }
        if (metalFeatures.isEmpty()) {
            return;
        }
        for (Unit gatherer : potentialGatherers) {
            if (usedGatherers.contains(gatherer) || unitManager.isOwned(gatherer)) {
                continue;
            }
            double closestDistance = Double.MAX_VALUE;
            Feature closest = null;
            for (Feature feature : metalFeatures) {
            	if (usedFeatures.contains(feature)) {
            		continue;
            	}
                double distance = VectorUtil.distance(feature.getPosition(),
                        gatherer.getPos());
                if (distance < closestDistance) {
                    closestDistance = distance;
                    closest = feature;
                }
            }
            double MAX_GATHERING_RANGE = 1000;
            if (closest != null && closestDistance < MAX_GATHERING_RANGE) {
                boolean ownershipGranted = unitManager.requestUnit(gatherer, this);
                if (ownershipGranted) {
                    log.info("sending unit to reclaim resource");
                    /*ReclaimUnitAICommand command = new ReclaimUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getFeatureId());*/
                    ReclaimAreaUnitAICommand command = new ReclaimAreaUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getPosition(), 100);
                    this.spring.handleEngineCommand(command);
                    //this.spring.drawLine(gatherer.getPos(), closest.getPosition());
                    usedGatherers.add(new FeatureAssignment(gatherer, closest));
                    usedFeatures.add(closest);
                }
            }
        }    	
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void unitOwnershipLost(Unit unit) {
    	for (Iterator<FeatureAssignment> i = usedGatherers.iterator(); i.hasNext();) {
    		FeatureAssignment featureAssignment = i.next();
    		if (featureAssignment.getUnit().equals(unit)) {
    			i.remove();
    			usedFeatures.remove(featureAssignment.getFeature());
    			break;
    		}
    	}
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setUnitManager(UnitManager unitManager) {
        this.unitManager = unitManager;
    }
    
    @Override
    public int update(int frame) {
    	/*if ((frame < 100 && frame % 10 == 0) || frame % 100 == 0) { //update more frequently the first 10 frames, then do an update each 10 frames
    		updatePredictions();
    	}
    	if (frame % 100 == 0) {
    		spring.sendTextMsg(String.valueOf(getMetalPrediction(100)));
    		spring.sendTextMsg(String.valueOf(getEnergyPrediction(100)));
    	}*/
        if (frame % 50 != 0) return 0;        
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
            if (feature.getDef() != null && feature.getDef().getContainedResource(metal) > 0) {
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
            	if (usedFeatures.contains(feature)) {
            		continue;
            	}
                double distance = VectorUtil.distance(feature.getPosition(),
                        gatherer.getPos());
                if (distance < closestDistance) {
                    closestDistance = distance;
                    closest = feature;
                }
            }
            double MAX_GATHERING_RANGE = 1000;
            if (closest != null && closestDistance < MAX_GATHERING_RANGE) {
                boolean ownershipGranted = unitManager.requestUnit(gatherer, this);
                if (ownershipGranted) {
                    log.info("sending unit to reclaim resource");
                    /*ReclaimUnitAICommand command = new ReclaimUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getFeatureId());*/
                    ReclaimAreaUnitAICommand command = new ReclaimAreaUnitAICommand(gatherer, -1, new LinkedList<AICommand.Option>(),
                            10000, closest.getPosition(), 100);
                    this.spring.handleEngineCommand(command);
                    //this.spring.drawLine(gatherer.getPos(), closest.getPosition());
                    usedGatherers.add(new FeatureAssignment(gatherer, closest));
                    usedFeatures.add(closest);
                }
            }
        }
        return 0;
    }

    @Override
    public int commandFinished(Unit unit, int commandId, int commandTopicId) {
        if (commandTopicId == ReclaimUnitAICommand.TOPIC || commandTopicId == ReclaimAreaUnitAICommand.TOPIC) {
        	boolean contained = false;
        	for (Iterator<FeatureAssignment> i = usedGatherers.iterator(); i.hasNext();) {
        		FeatureAssignment featureAssignment = i.next();
        		if (featureAssignment.getUnit().equals(unit)) {
        			i.remove();
        			usedFeatures.remove(featureAssignment.getFeature());
        			contained = true;
        			break;
        		}
        	}        	
        	if (contained) {
        		unitManager.releaseUnit(unit, this);
        	}
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

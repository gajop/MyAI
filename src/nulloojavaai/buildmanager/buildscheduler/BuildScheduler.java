/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.BuildUnitAICommand;
import com.springrts.ai.command.GuardUnitAICommand;
import com.springrts.ai.oo.Feature;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

import java.util.*;
import java.util.logging.Logger;

import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.UnitDefUtil;

/**
 *
 * @author gajop
 */
public class BuildScheduler {
    Set<Unit> builders = new HashSet<Unit>();
    Set<Unit> idleBuilders = new HashSet<Unit>();
    Set<Unit> busyBuilders = new HashSet<Unit>();
    Set<BuildJob> activeJobs = new HashSet<BuildJob>();
    Set<BuildJob> finishedJobs = new HashSet<BuildJob>();
    Set<BuildJob> failedJobs = new HashSet<BuildJob>();
    Map<Unit, BuildJob> connectedBuildJob = new HashMap<Unit, BuildJob>();
    SpringCommunications spring;
    Logger log;
    int facing = 0;

    public BuildScheduler(SpringCommunications spring) {
        this.spring = spring;
        log = spring.getLogger("build-scheduler");
    }

    public final Set<Unit> getBuilders() {
        return Collections.unmodifiableSet(new HashSet<Unit>(builders));
    }

    public Set<Unit> getBusyBuilders() {
        return Collections.unmodifiableSet(new HashSet<Unit>(busyBuilders));
    }

    public Set<Unit> getIdleBuilders() {
        return Collections.unmodifiableSet(new HashSet<Unit>(idleBuilders));
    }
    
    public boolean canBuild(UnitDef unitDef) {
        for (Unit builder : idleBuilders) {
            if (builder.getDef().getBuildOptions().contains(unitDef)) {
                return true;
            }
        }
        return false;
    }

    public boolean canBuild(UnitDef unitDef, Unit builder) {
        return idleBuilders.contains(builder) &&
                builder.getDef().getBuildOptions().contains(unitDef);
    }

    public boolean canBuild(UnitDef unitDef, Unit builder, AIFloat3 position) {
        if (position == null || (position.x < 0 || position.y < 0 || position.z < 0)) {
            return false;
        }
        return canBuild(unitDef, builder) && spring.getClb().
                getMap().isPossibleToBuildAt(unitDef, position, facing);
    }
    
    AIFloat3 findClosestBuildSite(UnitDef unitDef, AIFloat3 center) {
    	AIFloat3 result = new AIFloat3();
    	return result;
    }
         
    private static Vector<SearchOffset> searchOffsets = new Vector<SearchOffset>(); //do not access directly... TODO: create a seperate class later 
    
    static Vector<SearchOffset> getSearchOffsetTable(int radius) {    	 
    	int size = radius * radius * 4;
    	if (size > searchOffsets.size()) {
    		int oldSize = searchOffsets.size();
    		searchOffsets.setSize(size);    		
    		for (int i = oldSize; i < searchOffsets.size(); ++i) {
    			searchOffsets.set(i, new SearchOffset());
    		}    		
    		for (int y = 0; y < radius * 2; y++) {
    			for (int x = 0; x < radius * 2 ; x++) {
    				SearchOffset i = searchOffsets.get(y * radius + x);
    				i.dx = x - radius;
    				i.dy = y - radius;
    				i.qdist = i.dx * i.dx + i.dy * i.dy;    				
    			}
    		}
    		Collections.sort(searchOffsets, new Comparator<SearchOffset>(){
				@Override
				public int compare(SearchOffset first, SearchOffset second) {
					return (new Integer(first.qdist)).compareTo(second.qdist);
				}
    			
    		});
    	}
    	return searchOffsets;
    }
  //! only used by the AI callback of the same name
    int SQUARE_SIZE = 8; //hah ok
    public AIFloat3 findClosestBuildSite(UnitDef unitDef, AIFloat3 pos, double searchRadius) {
    	return this.spring.getClb().getMap().findClosestBuildSite(unitDef, pos, (float) searchRadius, 8, facing);
    /*	if (unitDef == null) {
    		return null;
    	}
 	
    	int endr = (int) (searchRadius / (SQUARE_SIZE * 2));    	
    	Vector<SearchOffset> ofs = getSearchOffsetTable(endr);

    	for (int so = 0; so < endr * endr * 4; so++) {
    		float x = pos.x + ofs.get(so).dx * SQUARE_SIZE * 2;
    		float z = pos.z + ofs.get(so).dy * SQUARE_SIZE * 2;

    		AIFloat3 newPos = new AIFloat3(x, 0.0f, z);
    		AIFloat3 foundPos = this.spring.getClb().getMap().findClosestBuildSite(unitDef, newPos, 16, 0, this.getFacing());
    		if (foundPos.x != -1) {
    			boolean good = true;
    			for (Unit unit : this.spring.getClb().getFriendlyUnitsIn(foundPos, 8)) {
    				if (!unit.getDef().isAbleToMove()) {
    					good = false;
    					break;
    				}
    			}
    			if (!good) {
    				break;
    			} else {
    				for (Unit unit : this.spring.getClb().getEnemyUnitsIn(foundPos, 8)) {
        				if (!unit.getDef().isAbleToMove()) {
        					good = false;
        					break;
        				}
        			}
    			}
    			if (!good) {
    				break;
    			} else {
    				for (Unit unit : this.spring.getClb().getNeutralUnitsIn(foundPos, 8)) {
        				if (!unit.getDef().isAbleToMove()) {
        					good = false;
        					break;
        				}
        			}
    			}
    			if (good) {
    				return foundPos;
    			}
    		}
    	}

    	return null;*/
    }

    private AIFloat3 Pos2BuildPos(BuildInfo buildInfo) {
    	AIFloat3 pos = new AIFloat3();
    	if ((buildInfo.GetXSize() & 2) == 1)
    		pos.x = (float) (Math.floor((buildInfo.pos.x    ) / (SQUARE_SIZE * 2)) * SQUARE_SIZE * 2 + 8);
    	else
    		pos.x = (float) (Math.floor((buildInfo.pos.x + 8) / (SQUARE_SIZE * 2)) * SQUARE_SIZE * 2);
    	if ((buildInfo.GetZSize() & 2) == 1)
    		pos.z = (float) (Math.floor((buildInfo.pos.z    ) / (SQUARE_SIZE * 2)) * SQUARE_SIZE * 2 + 8);
    	else
    		pos.z = (float) (Math.floor((buildInfo.pos.z + 8) / (SQUARE_SIZE * 2)) * SQUARE_SIZE * 2);
    	//pos.y = uh->GetBuildHeight(pos,buildInfo.def); shh, don't tell anyone
    	if (buildInfo.def.isFloater() && pos.y < 0)
    		pos.y = -buildInfo.def.getWaterline();
    	return pos;
	}

    public boolean addJob(BuildingBuildJob buildJob) {    	
    	if (!canBuild(buildJob.getUnitToBuild(), buildJob.getActor(), buildJob.getPosition())) {
    		return false;
    	}
    	activeJobs.add(buildJob);
    	return true;
    }
    
	public boolean build(UnitDef unitDef, Unit builder, AIFloat3 position) {
        if (!canBuild(unitDef, builder, position)) {
            return false;
        }
        AICommand command = new BuildUnitAICommand(builder, -1,
                new ArrayList<AICommand.Option>(), 10000, unitDef,
                position, facing);
        spring.handleEngineCommand(command);
        idleBuilders.remove(builder);
        busyBuilders.add(builder);
        log.info("issuing command to build " +
                unitDef.getName());
        return true;
    }

    public boolean build(Unit builder, UnitDef unitDef) {
        if (!canBuild(unitDef, builder)) {
            return false;
        }
        AICommand command = new BuildUnitAICommand(builder, -1,
                new ArrayList<AICommand.Option>(), 10000, unitDef,
                new AIFloat3(), facing);
        spring.handleEngineCommand(command);
        idleBuilders.remove(builder);
        busyBuilders.add(builder);
        log.info("issuing command to build " +
                unitDef.getName());
        return true;
    }

    public boolean assist(Unit assistant, Unit toBeAssisted) {
        AICommand command = new GuardUnitAICommand(assistant, -1, new LinkedList<AICommand.Option>(), 1000, toBeAssisted);
        spring.handleEngineCommand(command);
        idleBuilders.remove(assistant);
        busyBuilders.add(assistant);
        log.info("issuing command to unit " + assistant.getDef().getName() + " to assist " + toBeAssisted.getDef().getName());
        return true;
    }

    public void unitFinished(Unit unit) {
    	BuildJob buildJob = connectedBuildJob.get(unit);
    	if (buildJob != null) {
    		activeJobs.remove(buildJob);
    		finishedJobs.add(buildJob);
    		connectedBuildJob.remove(unit);
    		buildJob.setStatus(BuildJob.Status.FINISHED);
    	}
        if (UnitDefUtil.isBuilder(unit.getDef())) {
            builders.add(unit);
            idleBuilders.add(unit);
        }
    }

    public void unitDestroyed(Unit unit) {
        if (UnitDefUtil.isBuilder(unit.getDef())) {
        	for (Iterator<BuildJob> i = activeJobs.iterator(); i.hasNext();) {
        		BuildJob buildJob = i.next();
        		if (buildJob.getActor().equals(unit) && !buildJob.getStatus().equals(BuildJob.Status.FINISHED)) {
        			buildJob.setStatus(BuildJob.Status.FAILED);
        			activeJobs.remove(buildJob);
        			failedJobs.add(buildJob);
        		}
        	}
            builders.remove(unit);
            busyBuilders.remove(unit);
            idleBuilders.remove(unit);
        }
    }
    
    public void unitIdle(Unit unit) {    	
        if (UnitDefUtil.isBuilder(unit.getDef())) {
        	for (Iterator<BuildJob> i = activeJobs.iterator(); i.hasNext();) {
        		BuildJob buildJob = i.next();
        		if (buildJob.getActor().equals(unit) && !buildJob.getStatus().equals(BuildJob.Status.FINISHED)) {
        			buildJob.setStatus(BuildJob.Status.FAILED);
        			activeJobs.remove(buildJob);
        			failedJobs.add(buildJob);
        		}
        	}
            idleBuilders.add(unit);
            busyBuilders.remove(unit);
        }
    }
    
    public void unitOwnershipGained(Unit unit) {
    	if (UnitDefUtil.isBuilder(unit.getDef())) {
    		idleBuilders.add(unit);
    		builders.add(unit);
    	}
    }
    
    public void unitOwnershipLost(Unit unit) {
    	if (UnitDefUtil.isBuilder(unit.getDef())) {
    		BuildJob matchingJob = connectedBuildJob.get(unit);
        	if (matchingJob != null) {
        		if (!matchingJob.getStatus().equals(BuildJob.Status.FINISHED)) {
        			matchingJob.setStatus(BuildJob.Status.FAILED);
        			activeJobs.remove(matchingJob);
        			failedJobs.add(matchingJob);
        		}
        	}
    		idleBuilders.remove(unit);
    		builders.remove(unit);
    	}
    }
    

	public int getFacing() {
		return facing;
	}

	public void setFacing(int facing) {
		this.facing = facing;
	}

	public void unitCreated(Unit unit, Unit builder) {
		BuildJob matchingJob = null;
		for (BuildJob job : activeJobs) {
			if (job.getActor().equals(builder) && job.getUnitToBuild().equals(unit.getDef())) {
				matchingJob = job;
				break;
			}
		}
		if (matchingJob != null) {
			matchingJob.setStatus(BuildJob.Status.STARTED);
		}
		connectedBuildJob.put(unit, matchingJob);
	}
}

class SearchOffset {
	int dx,dy;
	public SearchOffset() {
		super();
	}
	int qdist; // dx*dx+dy*dy
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public int getDy() {
		return dy;
	}
	public void setDy(int dy) {
		this.dy = dy;
	}
	public int getQdist() {
		return qdist;
	}
	public void setQdist(int qdist) {
		this.qdist = qdist;
	}
};
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.BuildUnitAICommand;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import nulloojavaai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class BuildScheduler {
    Set<Unit> builders = new HashSet<Unit>();
    Set<Unit> idleBuilders = new HashSet<Unit>();
    Set<Unit> busyBuilders = new HashSet<Unit>();
    SpringCommunications spring;
    Logger log;

    public BuildScheduler(SpringCommunications spring) {
        this.spring = spring;
        log = spring.getLogger("build-scheduler");
    }

    public final Set<Unit> getBuilders() {
        return Collections.unmodifiableSet(builders);
    }

    public Set<Unit> getBusyBuilders() {
        return Collections.unmodifiableSet(busyBuilders);
    }

    public Set<Unit> getIdleBuilders() {
        return Collections.unmodifiableSet(idleBuilders);
    }
    
    public static boolean isBuilder(Unit unit) {
        return unit.getDef().getBuildOptions().size() > 0;
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
        return canBuild(unitDef, builder) && spring.getClb().
                getMap().isPossibleToBuildAt(unitDef, position, 0);
    }

    public boolean build(UnitDef unitDef, Unit builder, AIFloat3 position) {
        if (!canBuild(unitDef, builder, position)) {
            return false;
        }
        AICommand command = new BuildUnitAICommand(builder, -1,
                new ArrayList<AICommand.Option>(), 10000, unitDef,
                position, 0);
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
                new AIFloat3(), 0);
        spring.handleEngineCommand(command);
        idleBuilders.remove(builder);
        busyBuilders.add(builder);
        log.info("issuing command to build " +
                unitDef.getName());
        return true;
    }

    public int unitFinished(Unit unit) {
        if (!unit.getDef().getName().equals("vehcon") && isBuilder(unit)) {
            builders.add(unit);
            idleBuilders.add(unit);
        }
        return 0;
    }

    public int unitDestroyed(Unit unit) {
        if (isBuilder(unit)) {
            builders.remove(unit);
            busyBuilders.remove(unit);
            idleBuilders.remove(unit);
        }
        return 0;
    }
    
    public int unitIdle(Unit unit) {
        if (isBuilder(unit)) {
            builders.add(unit); //hmm
            idleBuilders.add(unit);
            busyBuilders.remove(unit);
        }
        return 0; 
    }

}

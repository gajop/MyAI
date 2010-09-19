/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.BuildUnitAICommand;
import com.springrts.ai.command.GuardUnitAICommand;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

import java.util.*;
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
    Set<Unit> ownedUnits = new HashSet<Unit>();
    SpringCommunications spring;
    Logger log;

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
        if (position == null) {
            return false;
        }
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

    public boolean assist(Unit assistant, Unit toBeAssisted) {
        AICommand command = new GuardUnitAICommand(assistant, -1, new LinkedList<AICommand.Option>(), 1000, toBeAssisted);
        spring.handleEngineCommand(command);
        idleBuilders.remove(assistant);
        busyBuilders.add(assistant);
        log.info("issuing command to unit " + assistant.getDef().getName() + " to assist " + toBeAssisted.getDef().getName());
        return true;
    }

    public void unitFinished(Unit unit) {
        if (!unit.getDef().getName().equals("vehcon") && isBuilder(unit)) {
            builders.add(unit);
            idleBuilders.add(unit);
        }
    }

    public void unitDestroyed(Unit unit) {
        if (isBuilder(unit)) {
            builders.remove(unit);
            busyBuilders.remove(unit);
            idleBuilders.remove(unit);
            ownedUnits.remove(unit);
        }
    }
    
    public void unitIdle(Unit unit) {
        if (isBuilder(unit)) {
            idleBuilders.add(unit);
            busyBuilders.remove(unit);
        }
    }

    public void unitLostOwnership(Unit unit) {
        if (isBuilder(unit)) {
            ownedUnits.remove(unit);
        }
    }

    public void unitGainedOwnership(Unit unit) {
        if (isBuilder(unit)) {
            ownedUnits.add(unit);
        }
    }
}

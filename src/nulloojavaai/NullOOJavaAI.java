/*
Copyright (c) 2008 Robin Vobruba <hoijui.quaero@gmail.com>

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package nulloojavaai;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nulloojavaai.buildmanager.BuildManager;
import nulloojavaai.military.Military;
import nulloojavaai.utility.SpringCommunications;

/**
 * Serves as Interface for a Java Skirmish AIs for the Spring engine.
 *
 * @author hoijui
 * @version 0.1
 */
public class NullOOJavaAI extends AbstractOOAI implements OOAI {

    public void setSpring(SpringCommunications spring) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private int teamId = -1;
    private List<Module> modules = new LinkedList<Module>();
    SpringCommunications spring;
    Logger log;

    NullOOJavaAI(int teamId, OOAICallback callback) {
        spring = new SpringCommunications(callback);
        log = spring.getLogger("general");
        this.teamId = teamId;
        Military military = new Military(spring);
        BuildManager buildManager = new BuildManager(spring);
        modules.addAll(Arrays.asList(military, buildManager));        
    }

    @Override
    public int init(int teamId, OOAICallback callback) {
        this.spring.setClb(callback);
        spring.getClb().getCheats().setEnabled(true);
        
        for (Module module : modules) {
            module.init(teamId, callback);
            log.info(module.getModuleName() + "initialized");
        }
        return 0;
    }

    @Override
    public int update(int frame) {
        for (Module module : modules) {
            module.update(frame);
        }
        return 0; // signaling: OK
    }

    @Override
    public int message(int player, String message) {
        log.info("message from " + String.valueOf(player) + ":" + message);
        for (Module module : modules) {
            module.message(player, message);            
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitCreated(Unit unit, Unit builder) {
        log.info("unitCreated: " + unit.toString());
        for (Module module : modules) {
            module.unitCreated(unit, builder);
        }
        return 0;
    }

    @Override
    public int unitFinished(Unit unit) {     
        log.info("unitFinished " + unit.getDef().getName());
        for (Module module : modules) {
            module.unitFinished(unit);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitIdle(Unit unit) {
        for (Module module : modules) {
            module.unitIdle(unit);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitMoveFailed(Unit unit) {
        for (Module module : modules) {
            module.unitMoveFailed(unit);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitDamaged(Unit unit, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzed) {
        for (Module module : modules) {
            module.unitDamaged(unit, attacker, damage, dir, weaponDef, paralyzed);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        for (Module module : modules) {
            module.unitDestroyed(unit, attacker);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitGiven(Unit unit, int oldTeamId, int newTeamId) {
        for (Module module : modules) {
            module.unitGiven(unit, oldTeamId, newTeamId);
        }
        return 0; // signaling: OK
    }

    @Override
    public int unitCaptured(Unit unit, int oldTeamId, int newTeamId) {
        for (Module module : modules) {
            module.unitCaptured(unit, oldTeamId, newTeamId);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyEnterLOS(Unit enemy) {
        for (Module module : modules) {
            module.enemyEnterLOS(enemy);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyLeaveLOS(Unit enemy) {
        for (Module module : modules) {
            module.enemyLeaveLOS(enemy);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyEnterRadar(Unit enemy) {
        for (Module module : modules) {
            module.enemyEnterRadar(enemy);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyLeaveRadar(Unit enemy) {
        for (Module module : modules) {
            module.enemyLeaveRadar(enemy);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyDamaged(Unit enemy, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzed) {
        for (Module module : modules) {
            module.enemyDamaged(enemy, attacker, damage, dir, weaponDef, paralyzed);
        }
        return 0; // signaling: OK
    }

    @Override
    public int enemyDestroyed(Unit enemy, Unit attacker) {
        for (Module module : modules) {
            module.enemyDestroyed(enemy, attacker);
        }
        return 0; // signaling: OK
    }

    @Override
    public int weaponFired(Unit unit, WeaponDef weaponDef) {
        for (Module module : modules) {
            module.weaponFired(unit, weaponDef);
        }
        return 0; // signaling: OK
    }

    @Override
    public int playerCommand(List<Unit> units, AICommand command, int playerId) {
        for (Module module : modules) {
            module.playerCommand(units, command, playerId);
        }
        return 0; // signaling: OK
    }

    @Override
    public int commandFinished(Unit unit, int commandId, int commandTopicId) {
        for (Module module : modules) {
            module.commandFinished(unit, commandId, commandTopicId);
        }
        return 0; // signaling: OK
    }

    @Override
    public int seismicPing(AIFloat3 pos, float strength) {
        for (Module module : modules) {
            module.seismicPing(pos, strength);
        }
        return 0; // signaling: OK
    }
}

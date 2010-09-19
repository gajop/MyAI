/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.MoveUnitAICommand;
import com.springrts.ai.oo.Unit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import nulloojavaai.Module;
import nulloojavaai.unitmanager.UnitManager;
import nulloojavaai.unitmanager.UnitManagerListener;
import nulloojavaai.militarymanager.toplevel.DeterministicForceGenerator;
import nulloojavaai.militarymanager.toplevel.Force;
import nulloojavaai.militarymanager.toplevel.simpleforce.SimpleForceFactory;
import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public class MilitaryManager extends Module implements UnitManagerListener {
    LinkedList<BattleGroup> battleGroups = new LinkedList<BattleGroup>();
    SpringCommunications spring;
    UnitManager unitManager;

    public LinkedList<BattleGroup> getBattleGroups() {
        return battleGroups;
    }

    public MilitaryManager(SpringCommunications spring) {
        this.spring = spring;
    }

    @Override
    public int update(int frame) {
        if (frame % 20 == 0) {
            for (BattleGroup battleGroup : battleGroups) {
                if (!battleGroup.units.isEmpty()) {
                    AIFloat3 center = VectorUtil.averageFromUnits(battleGroup.units);
                    AIFloat3 closest = null;
                    double closestDistance = Double.MAX_VALUE;
                    for (Unit enemyUnit :  spring.getClb().getEnemyUnits()) {
                        AIFloat3 position = enemyUnit.getPos();
                        double distance = VectorUtil.distance(position, center);
                        if (distance < closestDistance) {
                            closest = position;
                            closestDistance = distance;
                        }
                    }
                    if (closest != null) {
                        double DISTANCE_OF_ENGAGEMENT = 1000;
                        if (closestDistance < DISTANCE_OF_ENGAGEMENT || battleGroup.units.size() > 4 || battleGroup.isSent()) {
                        //    sendTextMsg("sending to enemy units");
                            battleGroup.setSent(true);
                            for (Unit bgUnit : battleGroup.units) {
                                MoveUnitAICommand command = new MoveUnitAICommand(bgUnit, -1,
                                   new ArrayList<AICommand.Option>(), 10000, closest);
                                spring.handleEngineCommand(command);
                            }
                        }
                    }
                }
            }
        }
        if (false && frame % 50 == 0) {
            DeterministicForceGenerator forceGen = new
                    DeterministicForceGenerator(spring, this,
                    new SimpleForceFactory(spring));
            spring.sendTextMsg(String.valueOf(frame));
            for (Force force : forceGen.generateForces()) {
                spring.sendTextMsg(force.toString());
            }
        }
        return 0;
    }
    
    @Override
    public int unitFinished(Unit unit) {
        if (unit.getDef().getName().equals("armflash")) {
            BattleGroup selected = null;
            for (BattleGroup battleGroup : battleGroups) {
                if (!battleGroup.isSent()) {
                    selected = battleGroup;
                    break;
                }
            }
            if (selected != null) {
                selected.units.add(unit);
            } else {
                battleGroups.add(new BattleGroup(new LinkedList<Unit>(Arrays.asList(unit))));
            }
        }
        return 0;
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        for (BattleGroup battleGroup : battleGroups) {
            battleGroup.units.remove(unit);
        }
        LinkedList<BattleGroup> newBattleGroups = new LinkedList<BattleGroup>();
        for (BattleGroup battleGroup : battleGroups) {
            if (!battleGroup.units.isEmpty()) {
                newBattleGroups.add(battleGroup);
            }
        }
        battleGroups = newBattleGroups;
        return 0; // signaling: OK
    }

    @Override
    public String getModuleName() {
        return "MilitaryManager";
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
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.MoveUnitAICommand;
import com.springrts.ai.oo.Unit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import javax.vecmath.Vector3f;
import nulloojavaai.Module;
import nulloojavaai.military.toplevel.DeterministicForceGenerator;
import nulloojavaai.military.toplevel.Force;
import nulloojavaai.military.toplevel.simpleforce.SimpleForceFactory;
import nulloojavaai.utility.SpringCommunications;
/**
 *
 * @author gajop
 */
public class Military extends Module {
    LinkedList<BattleGroup> battleGroups = new LinkedList<BattleGroup>();
    SpringCommunications spring;

    public LinkedList<BattleGroup> getBattleGroups() {
        return battleGroups;
    }

    public Military(SpringCommunications spring) {
        this.spring = spring;
    }

    @Override
    public int update(int frame) {
        if (frame % 20 == 0) {
            for (BattleGroup battleGroup : battleGroups) {
                if (battleGroup.units.size() > 4 || (battleGroup.isSent() && battleGroup.units.size() > 0)) {
                    Vector3f center = new Vector3f(0, 0, 0);
                    for (Unit unit : battleGroup.units) {
                        center.add(unit.getPos().toVector3f());
                    }
                    center.scale((float) (1.0 / battleGroup.units.size()));
                    AIFloat3 centerPos = new AIFloat3(center.x, center.y, center.z);
                    AIFloat3 closest = null;
                    double closestDistance = 0;
                    for (Unit enemyUnit :  spring.getClb().getEnemyUnits()) {
                        AIFloat3 position = enemyUnit.getPos();
                        double dx = position.x - centerPos.x;
                        double dy = position.y - centerPos.y;
                        double dz = position.z - centerPos.z;
                        double distance = Math.sqrt(dx * dx + dz * dz + dy * dy);
                        if (closest == null) {
                            closest = position;
                            closestDistance = distance;
                        } else if (distance < closestDistance) {
                            closest = position;
                            closestDistance = distance;
                        }
                    }
                    if (closest != null) {
                    //    sendTextMsg("sending to enemy units");
                        battleGroup.setSent(true);
                        for (Unit bgUnit : battleGroup.units) {
                            MoveUnitAICommand command = new MoveUnitAICommand(bgUnit, -1,
                               new ArrayList<AICommand.Option>(), 10000, closest);
                            spring.handleEngineCommand(command);
                        }
                    } else {
                       // sendTextMsg("no enemy units");
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
                battleGroups.add(new BattleGroup(new LinkedList(Arrays.asList(unit))));
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


}

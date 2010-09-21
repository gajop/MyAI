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
import java.util.List;

import nulloojavaai.Module;
import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.militarymanager.battlegroup.BattleGroupPlanner;
import nulloojavaai.militarymanager.battlegroup.BattleGroupScheduler;
import nulloojavaai.militarymanager.battlegroup.SimpleBattleGroupPlanner;
import nulloojavaai.militarymanager.battlegroup.SimpleBattleGroupScheduler;
import nulloojavaai.militarymanager.toplevel.orders.MoveBattleGroupOrder;
import nulloojavaai.militarymanager.toplevel.simpleforce.SimpleForce;
import nulloojavaai.unitmanager.UnitManager;
import nulloojavaai.unitmanager.UnitManagerListener;
import nulloojavaai.militarymanager.toplevel.DeterministicForceGenerator;
import nulloojavaai.militarymanager.toplevel.Force;
import nulloojavaai.militarymanager.toplevel.ForceGenerator;
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
    DeterministicForceGenerator forceGenerator; 

    public LinkedList<BattleGroup> getBattleGroups() {
        return battleGroups;
    }

    public MilitaryManager(SpringCommunications spring) {
        this.spring = spring;
        this.forceGenerator = new DeterministicForceGenerator(spring, 
        		this, new SimpleForceFactory(spring));
    }

    @Override
    public int update(int frame) {
        if (frame % 50 == 0) {            
            List<Force> forces = forceGenerator.generateForces();
            for (BattleGroup battleGroup : battleGroups) {
                if (!battleGroup.getUnits().isEmpty()) {
                    AIFloat3 center = VectorUtil.averageFromUnits(battleGroup.getUnits());
                    AIFloat3 closest = null;
                    double closestDistance = Double.MAX_VALUE;
                    for (Force force : forces) {
                        SimpleForce simpleForce = (SimpleForce) force;
                        if (simpleForce.getOwner() == spring.getClb().getTeamId()) {
                            continue;
                        }
                        AIFloat3 position = simpleForce.getOriginalPosition();
                        double distance = VectorUtil.distance(position, center);
                        if (distance < closestDistance) {
                            closest = position;
                            closestDistance = distance;
                        }
                    }
                    if (closest != null) {
                        double DISTANCE_OF_ENGAGEMENT = 1000;
                        if (closestDistance < DISTANCE_OF_ENGAGEMENT || battleGroup.getUnits().size() > 4 || battleGroup.isSent()) {
                        	battleGroup.setOrder(new MoveBattleGroupOrder(battleGroup, closest));
                        	BattleGroupPlanner bgPlanner = new SimpleBattleGroupPlanner(spring, battleGroup);
                        	BattleGroupScheduler bgScheduler = new SimpleBattleGroupScheduler(spring);
                        	bgScheduler.execute(bgPlanner.plan());
                            battleGroup.setSent(true);
                            /*for (Unit bgUnit : battleGroup.getUnits()) {
                                MoveUnitAICommand command = new MoveUnitAICommand(bgUnit, -1,
                                   new ArrayList<AICommand.Option>(), 10000, closest);
                                spring.handleEngineCommand(command);
                            }*/
                        }
                    }
                }
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
                selected.getUnits().add(unit);
            } else {
            	BattleGroup battleGroup = new BattleGroup();
            	battleGroup.addUnit(unit);
                battleGroups.add(battleGroup);
            }
        }
        return 0;
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        for (BattleGroup battleGroup : battleGroups) {
            battleGroup.getUnits().remove(unit);
        }
        LinkedList<BattleGroup> newBattleGroups = new LinkedList<BattleGroup>();
        for (BattleGroup battleGroup : battleGroups) {
            if (!battleGroup.getUnits().isEmpty()) {
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

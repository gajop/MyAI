/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.MoveUnitAICommand;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
import nulloojavaai.militarymanager.toplevel.TopLevelPlanner;
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
    TopLevelPlanner topLevelPlanner;

    public LinkedList<BattleGroup> getBattleGroups() {
        return battleGroups;
    }

    public MilitaryManager(SpringCommunications spring) {
        this.spring = spring;
        this.topLevelPlanner = new TopLevelPlanner(spring, this);
    }    

    @Override
    public int update(int frame) {
    	if (frame % 51 == 0) { //do stuff on a high level planning level
    		topLevelPlanner.update(frame);
    	}
        if (frame % 50 == 0) { //do stuff on a battlegroup level
        	for (BattleGroup battleGroup : battleGroups) {            
            	BattleGroupPlanner bgPlanner = new SimpleBattleGroupPlanner(spring, battleGroup);
            	BattleGroupScheduler bgScheduler = new SimpleBattleGroupScheduler(spring);
            	bgScheduler.execute(bgPlanner.plan());
        	}
                           
        }
        return 0;
    }
    
    @Override
    public int unitFinished(Unit unit) {
    	UnitDef unitDef = unit.getDef();
    	boolean isFlash = unitDef.getName().equals("armflash");
    	boolean isJeffy = unitDef.getName().equals("armfav");
        if (isFlash || isJeffy) {
            BattleGroup selected = null;
            for (BattleGroup battleGroup : battleGroups) {            	
                if (!battleGroup.isSent()) {
                	for (Unit bgUnit : battleGroup.getUnits()) {
                		 if (unitDef.equals(bgUnit.getDef())) {
                             selected = battleGroup;
                		 }
                		 break;
                	}
                }
            }
            if (selected != null) {
                selected.addUnit(unit);
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
    	for (Iterator<BattleGroup> bgIter = battleGroups.iterator(); bgIter.hasNext();) {
    		BattleGroup battleGroup = bgIter.next();
		    battleGroup.getUnits().remove(unit);
		    if (battleGroup.getUnits().isEmpty()) {
		    	bgIter.remove();
		    }
    	}        
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

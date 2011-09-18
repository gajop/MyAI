/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.militarymanager;

import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;


import java.util.Iterator;
import java.util.LinkedList;


import myai.Module;
import myai.militarymanager.battlegroup.BattleGroup;
import myai.militarymanager.battlegroup.BattleGroupPlanner;
import myai.militarymanager.battlegroup.BattleGroupScheduler;
import myai.militarymanager.battlegroup.BattleGroups;
import myai.militarymanager.battlegroup.SimpleBattleGroupPlanner;
import myai.militarymanager.battlegroup.SimpleBattleGroupScheduler;
import myai.militarymanager.toplevel.TopLevelPlanner;
import myai.unitmanager.UnitManager;
import myai.unitmanager.UnitManagerListener;
import myai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class MilitaryManager extends Module implements UnitManagerListener {
    //LinkedList<BattleGroup> battleGroups = new LinkedList<BattleGroup>();
    BattleGroups battleGroups = new BattleGroups();
    SpringCommunications spring;
    UnitManager unitManager;
    TopLevelPlanner topLevelPlanner;

    public BattleGroups getBattleGroups() {
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
        	for (BattleGroup battleGroup : battleGroups.getBattleGroups()) {            
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
            for (BattleGroup battleGroup : battleGroups.getBattleGroups()) {            	
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
            	battleGroups.addUnit(unit, selected);
            } else {
            	BattleGroup battleGroup = new BattleGroup();
            	battleGroups.addBattleGroup(battleGroup);
            	battleGroups.addUnit(unit, battleGroup);
            }
        }
        return 0;
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
    	battleGroups.removeUnit(unit);    	       
        return 0; // signaling: OK
    }

    @Override
    public String getModuleName() {
        return "MilitaryManager";
    }


    public void unitOwnershipGained(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void unitOwnershipLost(Unit unit) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setUnitManager(UnitManager unitManager) {
        this.unitManager = unitManager;
    }
}

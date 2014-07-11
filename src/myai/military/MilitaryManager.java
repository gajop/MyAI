/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military;

import com.springrts.ai.oo.clb.Unit;
import com.springrts.ai.oo.clb.UnitDef;

import myai.Module;
import myai.build.BuildManager;
import myai.military.battlegroup.BattleGroup;
import myai.military.battlegroup.BattleGroupPlanner;
import myai.military.battlegroup.BattleGroupScheduler;
import myai.military.battlegroup.BattleGroups;
import myai.military.battlegroup.SimpleBattleGroupPlanner;
import myai.military.battlegroup.SimpleBattleGroupScheduler;
import myai.military.toplevel.TopLevelPlanner;
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
    	boolean isFlash = unitDef.equals(BuildManager.flash);
    	boolean isJeffy = unitDef.equals(BuildManager.jeffy);
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
    }

    public void unitOwnershipLost(Unit unit) {
    }

    public void setUnitManager(UnitManager unitManager) {
        this.unitManager = unitManager;
    }
}

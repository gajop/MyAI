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
package myai;

//import com.springrts.ai.AICommand;
import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;
import com.springrts.ai.oo.*;
import com.springrts.ai.oo.clb.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import myai.build.BuildManager;
import myai.economy.EconomyManager;
import myai.military.MilitaryManager;
import myai.unitmanager.PrioritizedUnitManager;
import myai.unitmanager.UnitManager;
import myai.unitmanager.UnitManagerListener;
import myai.utility.SpringCommunications;

/**
 * Serves as Interface for a Java Skirmish AIs for the Spring engine.
 *
 * @author hoijui
 * @version 0.1
 */
public class MyAI extends OOAI implements IOOAI {

    private List<Module> modules = new LinkedList<Module>();
    SpringCommunications spring;
    Logger log;
    UnitManager unitManager;
    static int timeout = 10000;
    static short opts = 0;
    
    static double testStaticness = -1;
    
    public MyAI() {}

    @Override
    public int init(int teamId, OOAICallback callback) {
        this.spring = new SpringCommunications(callback);
        this.log = spring.getLogger("general");
        MilitaryManager militaryManager = new MilitaryManager(spring);
        BuildManager buildManager = new BuildManager(spring);
        EconomyManager economyManager = new EconomyManager(spring);
        HashMap<UnitManagerListener, Integer> unitPriorityMapping = new HashMap<UnitManagerListener, Integer>();
        unitPriorityMapping.put(militaryManager, 3);
        unitPriorityMapping.put(buildManager, 2);
        unitPriorityMapping.put(economyManager, 4);
        this.unitManager = new PrioritizedUnitManager(spring, unitPriorityMapping);
        buildManager.setUnitManager(unitManager);
        militaryManager.setUnitManager(unitManager);
        economyManager.setUnitManager(unitManager);
        modules.add(militaryManager);
        modules.add(buildManager);
        modules.add(economyManager);    	
    	
        this.spring.setClb(callback);        
        try {        	       
        	spring.getClb().getCheats().setEnabled(true);
        } catch (Throwable e) {
        	spring.logError(getStackTrace(e));
        }
        for (Module module : modules) {
        	try {
        		module.init(teamId, callback);
        		log.info(module.getModuleName() + "initialized");
        	} catch (Throwable e) {
            	spring.logError(getStackTrace(e));
            }
        }
        {
        	Random rand = new Random();
        	testStaticness = rand.nextDouble();
        	log.info("Initializing AI of team: " + teamId + " with random (static): " + testStaticness);
        }                 
        return 0;
    }

    @Override
    public int update(int frame) {
    	if (frame == 1) { 
    		log.info("Frame 1 static random value (should be different): " + testStaticness);
    	}
    	spring.update(frame);
        for (Module module : modules) {
        	try {
        		module.update(frame);
        	} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }

    @Override
    public int message(int player, String message) {
        log.info("message from " + String.valueOf(player) + ":" + message);        
	    for (Module module : modules) {
	    	try {
	            module.message(player, message);
	    	} catch (Throwable e) {
	    		spring.logError(getStackTrace(e));
	    	}
        }	        
        return 0; // signaling: OK
    }

    @Override
    public int unitCreated(Unit unit, Unit builder) {
        log.info("unitCreated: " + unit.toString());                
	    for (Module module : modules) {
	    	try {
	            module.unitCreated(unit, builder);
	        } catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }
	    } 
        return 0;
    }

    @Override
    public int unitFinished(Unit unit) {
        log.info("unitFinished: " + unit.getDef().getName());                
        this.unitManager.registerUnit(unit);
	    for (Module module : modules) {
	        try {
	            module.unitFinished(unit);
	        } catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }
	    }
        return 0; // signaling: OK
    }

    @Override
    public int unitIdle(Unit unit) {
        log.info("unitIdle: " + unit.getDef().getName());
	    for (Module module : modules) {
	    	try {
	    		module.unitIdle(unit);
	    	} catch (Throwable e) {
	    	   	spring.logError(getStackTrace(e));
	        }
	    } 
        return 0; // signaling: OK
    }

    @Override
    public int unitMoveFailed(Unit unit) {
        log.info("unitMoveFailed: " + unit.getDef().getName());        
	    for (Module module : modules) {
	    	try {
	            module.unitMoveFailed(unit);
	        } catch (Throwable e) {
	        	spring.logError(getStackTrace(e));
	        }
	    }
        return 0; // signaling: OK
    }

    @Override
    public int unitDamaged(Unit unit, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzed) {
        //log.info("unitDamaged: " + unit.getDef().getName());
	    for (Module module : modules) {
        	try {
        		module.unitDamaged(unit, attacker, damage, dir, weaponDef, paralyzed);
        	} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        } 
        return 0; // signaling: OK
    }

    @Override
    public int unitDestroyed(Unit unit, Unit attacker) {
        log.info("unitDestroyed: " + unit.getDef().getName());        
        try {
        	this.unitManager.deRegisterUnit(unit);
        } catch (Throwable e) {
	    	spring.logError(getStackTrace(e));
	    }
	    for (Module module : modules) {
	    	try {
	            module.unitDestroyed(unit, attacker);
	    	} catch (Throwable e) {
	        	spring.logError(getStackTrace(e));
	        }    
	    }	    
        return 0; // signaling: OK
    }

    @Override
    public int unitGiven(Unit unit, int oldTeamId, int newTeamId) {
        log.info("unitGiven: " + unit.getDef().getName());        
        try {
        	this.unitManager.registerUnit(unit);
        } catch (Throwable e) {
	    	spring.logError(getStackTrace(e));
	    }
        for (Module module : modules) {
        	try {
        		module.unitGiven(unit, oldTeamId, newTeamId);
        	} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	  
        return 0; // signaling: OK
    }

    @Override
    public int unitCaptured(Unit unit, int oldTeamId, int newTeamId) {
        log.info("unitCaptured: " + unit.getDef().getName());        
        try {
        	int myTeamId = this.spring.getClb().getGame().getMyTeam(); 
            if (myTeamId == newTeamId) {
            	this.unitManager.registerUnit(unit);
            } else if (myTeamId == oldTeamId) {
            	this.unitManager.registerUnit(unit);
            }
        } catch (Throwable e) {
	    	spring.logError(getStackTrace(e));
	    }
        for (Module module : modules) {
        	try {
            	module.unitCaptured(unit, oldTeamId, newTeamId);
	        } catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }
        }
	    
        return 0; // signaling: OK
    }

    @Override
    public int enemyEnterLOS(Unit enemy) {        
	    for (Module module : modules) {
	    	try {
	    		module.enemyEnterLOS(enemy);
	    	} catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }	    	 
	    }	    
        return 0; // signaling: OK
    }

    @Override
    public int enemyLeaveLOS(Unit enemy) {
    	for (Module module : modules) {
            try {
            	module.enemyLeaveLOS(enemy);
            } catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }

    @Override
    public int enemyEnterRadar(Unit enemy) {        
    	for (Module module : modules) {
    		try {
    			module.enemyEnterRadar(enemy);
    		} catch (Throwable e) {
    			spring.logError(getStackTrace(e));
    		}
        }	   
        return 0; // signaling: OK
    }

    @Override
    public int enemyLeaveRadar(Unit enemy) {        
		for (Module module : modules) {
			try {
				module.enemyLeaveRadar(enemy);
			} catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }		        
	    }	    
        return 0; // signaling: OK
    }

    @Override
    public int enemyDamaged(Unit enemy, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzed) {        
    	for (Module module : modules) {
    		try {
    			module.enemyDamaged(enemy, attacker, damage, dir, weaponDef, paralyzed);
    		} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }

    @Override
    public int enemyDestroyed(Unit enemy, Unit attacker) {        
    	for (Module module : modules) {
    		try {
    			module.enemyDestroyed(enemy, attacker);
    		} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }

    @Override
    public int weaponFired(Unit unit, WeaponDef weaponDef) {        
    	for (Module module : modules) {
    		try {
    			module.weaponFired(unit, weaponDef);
    		} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }			
        }	    
        return 0; // signaling: OK
    }
/*
    @Override
    public int playerCommand(List<Unit> units, AICommand command, int playerId) {        
    	for (Module module : modules) {
    		try {
    			module.playerCommand(units, command, playerId);
    		} catch (Throwable e) {
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }
    */

    @Override
    public int commandFinished(Unit unit, int commandId, int commandTopicId) {        
    	log.info("commandFinished, unit:" + unit.getDef().getName() + " command: " + commandTopicId);        
	    for (Module module : modules) {
	    	try {
	    		module.commandFinished(unit, commandId, commandTopicId);
	    	} catch (Throwable e) {
		    	spring.logError(getStackTrace(e));
		    }
	    }	    
        return 0; // signaling: OK
    }

    @Override
    public int seismicPing(AIFloat3 pos, float strength) {        
    	for (Module module : modules) {
    		try {
    			module.seismicPing(pos, strength);
    		} catch (Throwable e) {	    	    	 
    	    	spring.logError(getStackTrace(e));
    	    }
        }	    
        return 0; // signaling: OK
    }
    
    
    @Override
    public int luaMessage(String inData) {
    	log.info("lua message:" + inData);
    	
    	if(inData.startsWith("METAL_SPOTS:")){
    		String json = inData.substring(12);
			JsonParserFactory factory=JsonParserFactory.getInstance();
			JSONParser parser=factory.newJsonParser();
			ArrayList<HashMap> jsonData=(ArrayList)parser.parseJson(json).values().toArray()[0];
			
			ArrayList<AIFloat3> metalSpots = new ArrayList<AIFloat3>(); 
			for (HashMap s:jsonData){
				float x = Float.parseFloat((String)s.get("x"));
				float y = Float.parseFloat((String)s.get("y"));
				float z = Float.parseFloat((String)s.get("z"));
				//float m = Float.parseFloat((String)s.get("metal"));

				AIFloat3 metalSpot = new AIFloat3(x,y,z);
				metalSpots.add(metalSpot);
			}
			BuildManager.metalSpots = metalSpots;
    	}
    	
    	return super.luaMessage(inData);
    }
    String getStackTrace(Throwable e) {
    	StringWriter sw = new StringWriter();
    	e.printStackTrace(new PrintWriter(sw));
    	return sw.toString();
    }

	public static int getTimeout() {
		return timeout;
	}

	public static short getOpts() {
		return opts;
	}
}

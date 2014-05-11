/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo;


import com.springrts.ai.AI;
import com.springrts.ai.oo.OOAI;
import com.springrts.ai.oo.evt.*;
import com.springrts.ai.oo.clb.*;

/**
 * TODO: Add description here
 *
 * @author	hoijui
 * @version	GENERATED
 */
public abstract class OOEventAI extends OOAI implements IOOEventAI, AI {

	/**
	 * TODO: Add description here
	 *
	 * @param  event  the AI event to handle, sent by the engine
	 * @throws AIException
	 */
	public abstract void handleEvent(AIEvent event) throws EventAIException;

	@Override
	public final int init(int skirmishAIId, OOAICallback callback) {

		AIEvent evt = new InitAIEvent(skirmishAIId, callback);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int release(int reason) {

		AIEvent evt = new ReleaseAIEvent(reason);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int update(int frame) {

		AIEvent evt = new UpdateAIEvent(frame);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int message(int player, String message) {

		AIEvent evt = new MessageAIEvent(player, message);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int luaMessage(String inData) {

		AIEvent evt = new LuaMessageAIEvent(inData);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitCreated(Unit unit, Unit builder) {

		AIEvent evt = new UnitCreatedAIEvent(unit, builder);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitFinished(Unit unit) {

		AIEvent evt = new UnitFinishedAIEvent(unit);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitIdle(Unit unit) {

		AIEvent evt = new UnitIdleAIEvent(unit);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitMoveFailed(Unit unit) {

		AIEvent evt = new UnitMoveFailedAIEvent(unit);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitDamaged(Unit unit, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzer) {

		AIEvent evt = new UnitDamagedAIEvent(unit, attacker, damage, dir, weaponDef, paralyzer);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitDestroyed(Unit unit, Unit attacker) {

		AIEvent evt = new UnitDestroyedAIEvent(unit, attacker);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitGiven(Unit unit, int oldTeamId, int newTeamId) {

		AIEvent evt = new UnitGivenAIEvent(unit, oldTeamId, newTeamId);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int unitCaptured(Unit unit, int oldTeamId, int newTeamId) {

		AIEvent evt = new UnitCapturedAIEvent(unit, oldTeamId, newTeamId);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyEnterLOS(Unit enemy) {

		AIEvent evt = new EnemyEnterLOSAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyLeaveLOS(Unit enemy) {

		AIEvent evt = new EnemyLeaveLOSAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyEnterRadar(Unit enemy) {

		AIEvent evt = new EnemyEnterRadarAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyLeaveRadar(Unit enemy) {

		AIEvent evt = new EnemyLeaveRadarAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyDamaged(Unit enemy, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzer) {

		AIEvent evt = new EnemyDamagedAIEvent(enemy, attacker, damage, dir, weaponDef, paralyzer);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyDestroyed(Unit enemy, Unit attacker) {

		AIEvent evt = new EnemyDestroyedAIEvent(enemy, attacker);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int weaponFired(Unit unit, WeaponDef weaponDef) {

		AIEvent evt = new WeaponFiredAIEvent(unit, weaponDef);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int playerCommand(java.util.List<Unit> units, int commandTopicId, int playerId) {

		AIEvent evt = new PlayerCommandAIEvent(units, commandTopicId, playerId);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int commandFinished(Unit unit, int commandId, int commandTopicId) {

		AIEvent evt = new CommandFinishedAIEvent(unit, commandId, commandTopicId);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int seismicPing(AIFloat3 pos, float strength) {

		AIEvent evt = new SeismicPingAIEvent(pos, strength);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int load(String file) {

		AIEvent evt = new LoadAIEvent(file);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int save(String file) {

		AIEvent evt = new SaveAIEvent(file);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyCreated(Unit enemy) {

		AIEvent evt = new EnemyCreatedAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

	@Override
	public final int enemyFinished(Unit enemy) {

		AIEvent evt = new EnemyFinishedAIEvent(enemy);
		try {
			this.handleEvent(evt);
			return 0; // everything OK
		} catch (EventAIException ex) {
			return ex.getErrorNumber();
		}
	}

}


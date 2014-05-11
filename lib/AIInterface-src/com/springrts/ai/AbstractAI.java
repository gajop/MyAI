/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai;


/**
 * This is the Java entry point from events comming from the engine.
 * We are using JNI for best in speed.
 *
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractAI implements AI {


	@Override
	public int init(int skirmishAIId, AICallback callback) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int release(int reason) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int update(int frame) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int message(int player, String message) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int luaMessage(String inData) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitCreated(int unit, int builder) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitFinished(int unit) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitIdle(int unit) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitMoveFailed(int unit) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitDamaged(int unit, int attacker, float damage, float[] dir_posF3, int weaponDefId, boolean paralyzer) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitDestroyed(int unit, int attacker) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitGiven(int unitId, int oldTeamId, int newTeamId) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int unitCaptured(int unitId, int oldTeamId, int newTeamId) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyEnterLOS(int enemy) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyLeaveLOS(int enemy) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyEnterRadar(int enemy) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyLeaveRadar(int enemy) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyDamaged(int enemy, int attacker, float damage, float[] dir_posF3, int weaponDefId, boolean paralyzer) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyDestroyed(int enemy, int attacker) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int weaponFired(int unitId, int weaponDefId) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int playerCommand(int[] unitIds, int unitIds_size, int commandTopicId, int playerId) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int commandFinished(int unitId, int commandId, int commandTopicId) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int seismicPing(float[] pos_posF3, float strength) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int load(String file) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int save(String file) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyCreated(int enemy) {

		// signal: event handled OK
		return 0;
	}

	@Override
	public int enemyFinished(int enemy) {

		// signal: event handled OK
		return 0;
	}
}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo;


import com.springrts.ai.AI;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.OOAICallback;
import com.springrts.ai.oo.clb.Unit;
import com.springrts.ai.oo.clb.WeaponDef;

/**
 * TODO: Add description here
 *
 * @author	hoijui
 * @version	GENERATED
 */
public abstract class AbstractOOAI extends OOAI implements IOOAI, AI {


	/**
	 * This AI event initializes a Skirmish AI instance.
	 * It is sent only once per AI instance and game, as the very first event.
	 */
	@Override
	public int init(int skirmishAIId, OOAICallback callback) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event tells a Skirmish AI instance, that it is no longer needed. It
	 * can be used to free memory or do other cleanup work.
	 * It is sent only once per AI instance and game, as the very last event.
	 * Values description for reason:
	 * 0: unspecified
	 * 1: game ended
	 * 2: team died
	 * 3: AI killed
	 * 4: AI crashed
	 * 5: AI failed to init
	 * 6: connection lost
	 * 7: other reason
	 */
	@Override
	public int release(int reason) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent once per game frame, which is about 30 times per second
	 * by default.
	 */
	@Override
	public int update(int frame) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is a notification about a chat message sent by one of the
	 * participants of this game, which may be a player or an AI, including this AI.
	 */
	@Override
	public int message(int player, String message) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event triggers whenever any message
	 * is sent by a Lua widget or unsynced gadget.
	 */
	@Override
	public int luaMessage(String inData) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent whenever a unit of this team is created, and contains
	 * the created unit. Usually, the unit has only 1 HP at this time, and consists
	 * only of a nano frame (-> will not accept commands yet).
	 * See also the unit-finished event.
	 */
	@Override
	public int unitCreated(Unit unit, Unit builder) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent whenever a unit is fully built, and contains the
	 * finished unit. Usually, the unit has full health at this time, and is ready
	 * to accept commands.
	 * See also the unit-created event.
	 */
	@Override
	public int unitFinished(Unit unit) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit finished processing a command or just
	 * finished building, and it has currently no commands in it's queue.
	 */
	@Override
	public int unitIdle(Unit unit) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit received a move command and is not able to
	 * fullfill it. Reasons for this are:
	 * - The unit is not able to move
	 * - The path to the target location is blocked
	 * - The unit can not move on the terain of the target location (for example,
	 *   the target is on land, and the unit is a ship)
	 */
	@Override
	public int unitMoveFailed(Unit unit) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit was damaged. It contains the attacked unit,
	 * the attacking unit, the ammount of damage and the direction from where the
	 * damage was inflickted. In case of a laser weapon, the direction will point
	 * directly from the attacker to the attacked unit, while with artillery it will
	 * rather be from somewhere up in the sky to the attacked unit.
	 * See also the unit-destroyed event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not visible and cheat events are off
	 * @param paralyzer  if true, then damage is paralyzation damage, otherwise it is real damage
	 */
	@Override
	public int unitDamaged(Unit unit, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzer) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit was destroyed; see also the unit-damaged
	 * event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not visible and cheat events are off
	 */
	@Override
	public int unitDestroyed(Unit unit, Unit attacker) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit changed from one team to another,
	 * either because the old owner gave it to the new one, or because the
	 * new one took it from the old one; see the /take command.
	 * Both giving and receiving team will get this event.
	 */
	@Override
	public int unitGiven(Unit unit, int oldTeamId, int newTeamId) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit changed from one team to an other through
	 * capturing.
	 * Both giving and receiving team will get this event.
	 */
	@Override
	public int unitCaptured(Unit unit, int oldTeamId, int newTeamId) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit entered the LOS of this team.
	 */
	@Override
	public int enemyEnterLOS(Unit enemy) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit left the LOS of this team.
	 */
	@Override
	public int enemyLeaveLOS(Unit enemy) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit entered the radar covered area of
	 * this team.
	 */
	@Override
	public int enemyEnterRadar(Unit enemy) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit left the radar covered area of this
	 * team.
	 */
	@Override
	public int enemyLeaveRadar(Unit enemy) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit was damaged. It contains the
	 * attacked unit, the attacking unit, the ammount of damage and the direction
	 * from where the damage was inflickted. In case of a laser weapon, the
	 * direction will point directly from the attacker to the attacked unit, while
	 * with artillery it will rather be from somewhere up in the sky to the attacked
	 * unit.
	 * See also the enemy-destroyed event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not allied with the team receiving this event
	 * @param paralyzer  if true, then damage is paralyzation damage, otherwise it is real damage
	 */
	@Override
	public int enemyDamaged(Unit enemy, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzer) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when an enemy unit was destroyed; see also the
	 * enemy-damaged event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not allied with the team receiving this event
	 */
	@Override
	public int enemyDestroyed(Unit enemy, Unit attacker) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when certain weapons are fired.
	 * For performance reasons, it is not possible to send this event
	 * for all weapons. Therefore, it is currently only sent for manuall-fire
	 * weapons like for example the TA Commanders D-Gun or the Nuke.
	 */
	@Override
	public int weaponFired(Unit unit, WeaponDef weaponDef) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a user gives a command to one or multiple units
	 * belonging to a team controlled by the AI.
	 * For more info about the given commands, please use the
	 * Unit.getCurrentCommands() method of the callback.
	 * @param commandTopicId  see COMMAND_* defines in AISCommands.h
	 * @param playerId  Id of the player that issued the command
	 */
	@Override
	public int playerCommand(java.util.List<Unit> units, int commandTopicId, int playerId) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit finished processing a command.
	 * @param commandId      used on asynchronous commands only (is -1 for regular commands).
	 *                       this allows the AI to identify a possible result event,
	 *                       which would come with the same id
	 * @param commandTopicId unique identifier of a command
	 *                       (see COMMAND_* defines in AISCommands.h)
	 * @see callback.handleCommand(..., int commandId, ...)
	 */
	@Override
	public int commandFinished(Unit unit, int commandId, int commandTopicId) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when a unit movement is detected by means of a seismic
	 * event. A seismic event means erruption/movement/shakings of the ground. This
	 * can be detected by only by special units usually, eg by the seismic detector
	 * building in Balanced Annihilation.
	 */
	@Override
	public int seismicPing(AIFloat3 pos, float strength) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when the AI should be loading its full state from a
	 * file.
	 * @param   Absolute file path, should be treated read-only
	 */
	@Override
	public int load(String file) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent when the AI should be saving its full state to a file.
	 * @param   Absolute file path, writable
	 */
	@Override
	public int save(String file) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent whenever a unit of an enemy team is created,
	 * and contains the created unit. Usually, the unit has only 1 HP at this time,
	 * and consists only of a nano frame.
	 * See also the enemy-finished event.
	 */
	@Override
	public int enemyCreated(Unit enemy) {
		return 0; // signaling: OK
	}

	/**
	 * This AI event is sent whenever an enemy unit is fully built, and contains the
	 * finished unit. Usually, the unit has full health at this time.
	 * See also the unit-created event.
	 */
	@Override
	public int enemyFinished(Unit enemy) {
		return 0; // signaling: OK
	}
}


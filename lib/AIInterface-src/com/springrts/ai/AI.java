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
public interface AI {


	/**
	 * This AI event initializes a Skirmish AI instance.
	 * It is sent only once per AI instance and game, as the very first event.
	 */
	public int init(int skirmishAIId, AICallback callback);

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
	public int release(int reason);

	/**
	 * This AI event is sent once per game frame, which is about 30 times per second
	 * by default.
	 */
	public int update(int frame);

	/**
	 * This AI event is a notification about a chat message sent by one of the
	 * participants of this game, which may be a player or an AI, including this AI.
	 */
	public int message(int player, String message);

	/**
	 * This AI event triggers whenever any message
	 * is sent by a Lua widget or unsynced gadget.
	 */
	public int luaMessage(String inData);

	/**
	 * This AI event is sent whenever a unit of this team is created, and contains
	 * the created unit. Usually, the unit has only 1 HP at this time, and consists
	 * only of a nano frame (-> will not accept commands yet).
	 * See also the unit-finished event.
	 */
	public int unitCreated(int unit, int builder); // INTERFACES:Unit(unit),UnitLifeState()

	/**
	 * This AI event is sent whenever a unit is fully built, and contains the
	 * finished unit. Usually, the unit has full health at this time, and is ready
	 * to accept commands.
	 * See also the unit-created event.
	 */
	public int unitFinished(int unit); // INTERFACES:Unit(unit),UnitLifeState()

	/**
	 * This AI event is sent when a unit finished processing a command or just
	 * finished building, and it has currently no commands in it's queue.
	 */
	public int unitIdle(int unit); // INTERFACES:Unit(unit)

	/**
	 * This AI event is sent when a unit received a move command and is not able to
	 * fullfill it. Reasons for this are:
	 * - The unit is not able to move
	 * - The path to the target location is blocked
	 * - The unit can not move on the terain of the target location (for example,
	 *   the target is on land, and the unit is a ship)
	 */
	public int unitMoveFailed(int unit); // INTERFACES:Unit(unit)

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
	public int unitDamaged(int unit, int attacker, float damage, float[] dir_posF3, int weaponDefId, boolean paralyzer); // INTERFACES:Unit(unit)

	/**
	 * This AI event is sent when a unit was destroyed; see also the unit-damaged
	 * event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not visible and cheat events are off
	 */
	public int unitDestroyed(int unit, int attacker); // INTERFACES:Unit(unit),UnitLifeState()

	/**
	 * This AI event is sent when a unit changed from one team to another,
	 * either because the old owner gave it to the new one, or because the
	 * new one took it from the old one; see the /take command.
	 * Both giving and receiving team will get this event.
	 */
	public int unitGiven(int unitId, int oldTeamId, int newTeamId); // INTERFACES:Unit(unitId),UnitLifeState(),UnitTeamChange(oldTeamId,newTeamId)

	/**
	 * This AI event is sent when a unit changed from one team to an other through
	 * capturing.
	 * Both giving and receiving team will get this event.
	 */
	public int unitCaptured(int unitId, int oldTeamId, int newTeamId); // INTERFACES:Unit(unitId),UnitLifeState(),UnitTeamChange(oldTeamId,newTeamId)

	/**
	 * This AI event is sent when an enemy unit entered the LOS of this team.
	 */
	public int enemyEnterLOS(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)

	/**
	 * This AI event is sent when an enemy unit left the LOS of this team.
	 */
	public int enemyLeaveLOS(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)

	/**
	 * This AI event is sent when an enemy unit entered the radar covered area of
	 * this team.
	 */
	public int enemyEnterRadar(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)

	/**
	 * This AI event is sent when an enemy unit left the radar covered area of this
	 * team.
	 */
	public int enemyLeaveRadar(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)

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
	public int enemyDamaged(int enemy, int attacker, float damage, float[] dir_posF3, int weaponDefId, boolean paralyzer); // INTERFACES:Unit(enemy),Enemy(enemy)

	/**
	 * This AI event is sent when an enemy unit was destroyed; see also the
	 * enemy-damaged event.
	 * @param attacker  may be -1, which means no attacker was directly involveld,
	 *                  or the attacker is not allied with the team receiving this event
	 */
	public int enemyDestroyed(int enemy, int attacker); // INTERFACES:Unit(enemy),Enemy(enemy),UnitLifeState()

	/**
	 * This AI event is sent when certain weapons are fired.
	 * For performance reasons, it is not possible to send this event
	 * for all weapons. Therefore, it is currently only sent for manuall-fire
	 * weapons like for example the TA Commanders D-Gun or the Nuke.
	 */
	public int weaponFired(int unitId, int weaponDefId); // INTERFACES:Unit(unitId)

	/**
	 * This AI event is sent when a user gives a command to one or multiple units
	 * belonging to a team controlled by the AI.
	 * For more info about the given commands, please use the
	 * Unit.getCurrentCommands() method of the callback.
	 * @param commandTopicId  see COMMAND_* defines in AISCommands.h
	 * @param playerId  Id of the player that issued the command
	 */
	public int playerCommand(int[] unitIds, int unitIds_size, int commandTopicId, int playerId);

	/**
	 * This AI event is sent when a unit finished processing a command.
	 * @param commandId      used on asynchronous commands only (is -1 for regular commands).
	 *                       this allows the AI to identify a possible result event,
	 *                       which would come with the same id
	 * @param commandTopicId unique identifier of a command
	 *                       (see COMMAND_* defines in AISCommands.h)
	 * @see callback.handleCommand(..., int commandId, ...)
	 */
	public int commandFinished(int unitId, int commandId, int commandTopicId); // INTERFACES:Unit(unitId)

	/**
	 * This AI event is sent when a unit movement is detected by means of a seismic
	 * event. A seismic event means erruption/movement/shakings of the ground. This
	 * can be detected by only by special units usually, eg by the seismic detector
	 * building in Balanced Annihilation.
	 */
	public int seismicPing(float[] pos_posF3, float strength);

	/**
	 * This AI event is sent when the AI should be loading its full state from a
	 * file.
	 * @param   Absolute file path, should be treated read-only
	 */
	public int load(String file); // INTERFACES:LoadSave(file)

	/**
	 * This AI event is sent when the AI should be saving its full state to a file.
	 * @param   Absolute file path, writable
	 */
	public int save(String file); // INTERFACES:LoadSave(file)

	/**
	 * This AI event is sent whenever a unit of an enemy team is created,
	 * and contains the created unit. Usually, the unit has only 1 HP at this time,
	 * and consists only of a nano frame.
	 * See also the enemy-finished event.
	 */
	public int enemyCreated(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)

	/**
	 * This AI event is sent whenever an enemy unit is fully built, and contains the
	 * finished unit. Usually, the unit has full health at this time.
	 * See also the unit-created event.
	 */
	public int enemyFinished(int enemy); // INTERFACES:Unit(enemy),Enemy(enemy)
}


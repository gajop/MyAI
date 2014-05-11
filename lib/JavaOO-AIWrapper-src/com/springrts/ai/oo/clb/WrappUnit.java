/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.AICallback;
import com.springrts.ai.Util;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class WrappUnit extends AbstractUnit implements Unit {

	private AICallback innerCallback = null;
	private int unitId = -1;

	public WrappUnit(AICallback innerCallback, int unitId) {

		this.innerCallback = innerCallback;
		this.unitId = unitId;
	}

	@Override
	public int getUnitId() {

		return unitId;
	}

	public static Unit getInstance(AICallback innerCallback, int unitId) {

		if (unitId < 0) {
			return null;
		}

		Unit _ret = null;
		_ret = new WrappUnit(innerCallback, unitId);
		return _ret;
	}


	/**
	 * Returns the number of units a team can have, after which it can not build
	 * any more. It is possible that a team has more units then this value at
	 * some point in the game. This is possible for example with taking,
	 * reclaiming or capturing units.
	 * This value is usefull for controlling game performance, and will
	 * therefore often be set on games with old hardware to prevent lagging
	 * because of too many units.
	 */
	@Override
	public int getLimit() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getLimit();
		return _ret_int;
	}

	/**
	 * Returns the maximum total number of units that may exist at any one point
	 * in time induring the current game.
	 */
	@Override
	public int getMax() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getMax();
		return _ret_int;
	}

	/**
	 * Returns the unit's unitdef struct from which you can read all
	 * the statistics of the unit, do NOT try to change any values in it.
	 */
	@Override
	public UnitDef getDef() {

		UnitDef _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.Unit_getDef(this.getUnitId());
		_ret_int_out = WrappUnitDef.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	/**
	 * This is a set of parameters that is initialized
	 * in CreateUnitRulesParams() and may change during the game.
	 * Each parameter is uniquely identified only by its id
	 * (which is the index in the vector).
	 * Parameters may or may not have a name.
	 */
	@Override
	public java.util.List<ModParam> getModParams() {

		java.util.List<ModParam> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Unit_getModParams(this.getUnitId());
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<ModParam>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappModParam.getInstance(innerCallback, unitId, i));
		}

		return RETURN_SIZE_list;
	}

	@Override
	public int getTeam() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getTeam(this.getUnitId());
		return _ret_int;
	}

	@Override
	public int getAllyTeam() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getAllyTeam(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Indicates the units main function.
	 * This can be used as help for (skirmish) AIs.
	 * 
	 * example:
	 * A unit can shoot, build and transport other units.
	 * To human players, it is obvious that transportation is the units
	 * main function, as it can transport a lot of units,
	 * but has only weak build- and fire-power.
	 * Instead of letting the AI developers write complex
	 * algorithms to find out the same, mod developers can set this value.
	 * 
	 * @return  0: ???
	 *          1: ???
	 *          2: ???
	 *          ...
	 * @deprecated
	 */
	@Override
	public int getAiHint() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getAiHint(this.getUnitId());
		return _ret_int;
	}

	@Override
	public int getStockpile() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getStockpile(this.getUnitId());
		return _ret_int;
	}

	@Override
	public int getStockpileQueued() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getStockpileQueued(this.getUnitId());
		return _ret_int;
	}

	@Override
	public float getCurrentFuel() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getCurrentFuel(this.getUnitId());
		return _ret_int;
	}

	/**
	 * The unit's max speed
	 */
	@Override
	public float getMaxSpeed() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getMaxSpeed(this.getUnitId());
		return _ret_int;
	}

	/**
	 * The furthest any weapon of the unit can fire
	 */
	@Override
	public float getMaxRange() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getMaxRange(this.getUnitId());
		return _ret_int;
	}

	/**
	 * The unit's max health
	 */
	@Override
	public float getMaxHealth() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getMaxHealth(this.getUnitId());
		return _ret_int;
	}

	/**
	 * How experienced the unit is (0.0f - 1.0f)
	 */
	@Override
	public float getExperience() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getExperience(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Returns the group a unit belongs to, -1 if none
	 */
	@Override
	public int getGroup() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getGroup(this.getUnitId());
		return _ret_int;
	}

	@Override
	public java.util.List<Command> getCurrentCommands() {

		java.util.List<Command> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Unit_getCurrentCommands(this.getUnitId());
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<Command>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappCurrentCommand.getInstance(innerCallback, unitId, i));
		}

		return RETURN_SIZE_list;
	}

	/**
	 * The commands that this unit can understand, other commands will be ignored
	 */
	@Override
	public java.util.List<CommandDescription> getSupportedCommands() {

		java.util.List<CommandDescription> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Unit_getSupportedCommands(this.getUnitId());
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<CommandDescription>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappUnitSupportedCommand.getInstance(innerCallback, unitId, i));
		}

		return RETURN_SIZE_list;
	}

	/**
	 * The unit's current health
	 */
	@Override
	public float getHealth() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getHealth(this.getUnitId());
		return _ret_int;
	}

	@Override
	public float getSpeed() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getSpeed(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Indicate the relative power of the unit,
	 * used for experience calulations etc.
	 * This is sort of the measure of the units overall power.
	 */
	@Override
	public float getPower() {

		float _ret_int;

		_ret_int = innerCallback.Unit_getPower(this.getUnitId());
		return _ret_int;
	}

	@Override
	public float getResourceUse(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Unit_getResourceUse(this.getUnitId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getResourceMake(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Unit_getResourceMake(this.getUnitId(), resourceId);
		return _ret_int;
	}

	@Override
	public AIFloat3 getPos() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Unit_getPos(this.getUnitId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public AIFloat3 getVel() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Unit_getVel(this.getUnitId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public boolean isActivated() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_isActivated(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Returns true if the unit is currently being built
	 */
	@Override
	public boolean isBeingBuilt() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_isBeingBuilt(this.getUnitId());
		return _ret_int;
	}

	@Override
	public boolean isCloaked() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_isCloaked(this.getUnitId());
		return _ret_int;
	}

	@Override
	public boolean isParalyzed() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_isParalyzed(this.getUnitId());
		return _ret_int;
	}

	@Override
	public boolean isNeutral() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_isNeutral(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Returns the unit's build facing (0-3)
	 */
	@Override
	public int getBuildingFacing() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getBuildingFacing(this.getUnitId());
		return _ret_int;
	}

	/**
	 * Number of the last frame this unit received an order from a player.
	 */
	@Override
	public int getLastUserOrderFrame() {

		int _ret_int;

		_ret_int = innerCallback.Unit_getLastUserOrderFrame(this.getUnitId());
		return _ret_int;
	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param facing  set it to UNIT_COMMAND_BUILD_NO_FACING, if you do not want to specify a certain facing
	 */
	@Override
	public void build(UnitDef toBuildUnitDef, AIFloat3 buildPos, int facing, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] buildPos_posF3 = buildPos.toFloatArray();
		int toBuildUnitDefId = toBuildUnitDef.getUnitDefId();

		_ret_int = innerCallback.Unit_build(this.getUnitId(), toBuildUnitDefId, buildPos_posF3, facing, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("build", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void stop(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_stop(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("stop", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void wait(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_wait(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("wait", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param time  the time in seconds to wait
	 */
	@Override
	public void waitFor(int time, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_waitFor(this.getUnitId(), time, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("waitFor", _ret_int);
		}

	}

	/**
	 * Wait until another unit is dead, units will not wait on themselves.
	 * Example:
	 * A group of aircrafts waits for an enemy's anti-air defenses to die,
	 * before passing over their ruins to attack.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param toDieUnitId  wait until this unit is dead
	 */
	@Override
	public void waitForDeathOf(Unit toDieUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toDieUnitId = toDieUnit.getUnitId();

		_ret_int = innerCallback.Unit_waitForDeathOf(this.getUnitId(), toDieUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("waitForDeathOf", _ret_int);
		}

	}

	/**
	 * Wait for a specific ammount of units.
	 * Usually used with factories, but does work on groups without a factory too.
	 * Example:
	 * Pick a factory and give it a rallypoint, then add a SquadWait command
	 * with the number of units you want in your squads.
	 * Units will wait at the initial rally point until enough of them
	 * have arrived to make up a squad, then they will continue along their queue.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void waitForSquadSize(int numUnits, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_waitForSquadSize(this.getUnitId(), numUnits, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("waitForSquadSize", _ret_int);
		}

	}

	/**
	 * Wait for the arrival of all units included in the command.
	 * Only makes sense for a group of units.
	 * Use it after a movement command of some sort (move / fight).
	 * Units will wait until all members of the GatherWait command have arrived
	 * at their destinations before continuing.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void waitForAll(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_waitForAll(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("waitForAll", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void moveTo(AIFloat3 toPos, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toPos_posF3 = toPos.toFloatArray();

		_ret_int = innerCallback.Unit_moveTo(this.getUnitId(), toPos_posF3, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("moveTo", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void patrolTo(AIFloat3 toPos, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toPos_posF3 = toPos.toFloatArray();

		_ret_int = innerCallback.Unit_patrolTo(this.getUnitId(), toPos_posF3, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("patrolTo", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void fight(AIFloat3 toPos, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toPos_posF3 = toPos.toFloatArray();

		_ret_int = innerCallback.Unit_fight(this.getUnitId(), toPos_posF3, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("fight", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void attack(Unit toAttackUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toAttackUnitId = toAttackUnit.getUnitId();

		_ret_int = innerCallback.Unit_attack(this.getUnitId(), toAttackUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("attack", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void attackArea(AIFloat3 toAttackPos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toAttackPos_posF3 = toAttackPos.toFloatArray();

		_ret_int = innerCallback.Unit_attackArea(this.getUnitId(), toAttackPos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("attackArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void guard(Unit toGuardUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toGuardUnitId = toGuardUnit.getUnitId();

		_ret_int = innerCallback.Unit_guard(this.getUnitId(), toGuardUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("guard", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void aiSelect(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_aiSelect(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("aiSelect", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void addToGroup(Group toGroup, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toGroupId = toGroup.getGroupId();

		_ret_int = innerCallback.Unit_addToGroup(this.getUnitId(), toGroupId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("addToGroup", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void removeFromGroup(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_removeFromGroup(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("removeFromGroup", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void repair(Unit toRepairUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toRepairUnitId = toRepairUnit.getUnitId();

		_ret_int = innerCallback.Unit_repair(this.getUnitId(), toRepairUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("repair", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param fireState  can be: 0=hold fire, 1=return fire, 2=fire at will
	 */
	@Override
	public void setFireState(int fireState, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setFireState(this.getUnitId(), fireState, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setFireState", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param moveState  0=hold pos, 1=maneuvre, 2=roam
	 */
	@Override
	public void setMoveState(int moveState, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setMoveState(this.getUnitId(), moveState, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setMoveState", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void setBase(AIFloat3 basePos, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] basePos_posF3 = basePos.toFloatArray();

		_ret_int = innerCallback.Unit_setBase(this.getUnitId(), basePos_posF3, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setBase", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void selfDestruct(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_selfDestruct(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("selfDestruct", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void setWantedMaxSpeed(float wantedMaxSpeed, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setWantedMaxSpeed(this.getUnitId(), wantedMaxSpeed, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setWantedMaxSpeed", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 */
	@Override
	public void loadUnits(java.util.List<Unit> toLoadUnitIds_list, short options, int timeOut) throws CallbackAIException {

		int toLoadUnitIds_raw_size;
		int[] toLoadUnitIds;
		int toLoadUnitIds_size;
		int _ret_int;

		toLoadUnitIds_size = toLoadUnitIds_list.size();
		int _size = toLoadUnitIds_size;
		toLoadUnitIds_raw_size = toLoadUnitIds_size;
		toLoadUnitIds = new int[toLoadUnitIds_raw_size];
		for (int i=0; i < _size; i++) {
			toLoadUnitIds[i] = toLoadUnitIds_list.get(i).getUnitId();
		}

		_ret_int = innerCallback.Unit_loadUnits(this.getUnitId(), toLoadUnitIds, toLoadUnitIds_size, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("loadUnits", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void loadUnitsInArea(AIFloat3 pos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_loadUnitsInArea(this.getUnitId(), pos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("loadUnitsInArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void loadOnto(Unit transporterUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int transporterUnitId = transporterUnit.getUnitId();

		_ret_int = innerCallback.Unit_loadOnto(this.getUnitId(), transporterUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("loadOnto", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void unload(AIFloat3 toPos, Unit toUnloadUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toPos_posF3 = toPos.toFloatArray();
		int toUnloadUnitId = toUnloadUnit.getUnitId();

		_ret_int = innerCallback.Unit_unload(this.getUnitId(), toPos_posF3, toUnloadUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("unload", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void unloadUnitsInArea(AIFloat3 toPos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] toPos_posF3 = toPos.toFloatArray();

		_ret_int = innerCallback.Unit_unloadUnitsInArea(this.getUnitId(), toPos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("unloadUnitsInArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void setOn(boolean on, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setOn(this.getUnitId(), on, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setOn", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void reclaimUnit(Unit toReclaimUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toReclaimUnitId = toReclaimUnit.getUnitId();

		_ret_int = innerCallback.Unit_reclaimUnit(this.getUnitId(), toReclaimUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("reclaimUnit", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void reclaimFeature(Feature toReclaimFeature, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toReclaimFeatureId = toReclaimFeature.getFeatureId();

		_ret_int = innerCallback.Unit_reclaimFeature(this.getUnitId(), toReclaimFeatureId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("reclaimFeature", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void reclaimInArea(AIFloat3 pos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_reclaimInArea(this.getUnitId(), pos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("reclaimInArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void cloak(boolean cloak, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_cloak(this.getUnitId(), cloak, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("cloak", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void stockpile(short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_stockpile(this.getUnitId(), options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("stockpile", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void dGun(Unit toAttackUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toAttackUnitId = toAttackUnit.getUnitId();

		_ret_int = innerCallback.Unit_dGun(this.getUnitId(), toAttackUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("dGun", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void dGunPosition(AIFloat3 pos, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_dGunPosition(this.getUnitId(), pos_posF3, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("dGunPosition", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void restoreArea(AIFloat3 pos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_restoreArea(this.getUnitId(), pos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("restoreArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void setRepeat(boolean repeat, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setRepeat(this.getUnitId(), repeat, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setRepeat", _ret_int);
		}

	}

	/**
	 * Tells weapons that support it to try to use a high trajectory
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param trajectory  0: low-trajectory, 1: high-trajectory
	 */
	@Override
	public void setTrajectory(int trajectory, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setTrajectory(this.getUnitId(), trajectory, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setTrajectory", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void resurrect(Feature toResurrectFeature, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toResurrectFeatureId = toResurrectFeature.getFeatureId();

		_ret_int = innerCallback.Unit_resurrect(this.getUnitId(), toResurrectFeatureId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("resurrect", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void resurrectInArea(AIFloat3 pos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_resurrectInArea(this.getUnitId(), pos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("resurrectInArea", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void capture(Unit toCaptureUnit, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		int toCaptureUnitId = toCaptureUnit.getUnitId();

		_ret_int = innerCallback.Unit_capture(this.getUnitId(), toCaptureUnitId, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("capture", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void captureInArea(AIFloat3 pos, float radius, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Unit_captureInArea(this.getUnitId(), pos_posF3, radius, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("captureInArea", _ret_int);
		}

	}

	/**
	 * Set the percentage of health at which a unit will return to a save place.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param autoRepairLevel  0: 0%, 1: 30%, 2: 50%, 3: 80%
	 */
	@Override
	public void setAutoRepairLevel(int autoRepairLevel, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setAutoRepairLevel(this.getUnitId(), autoRepairLevel, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setAutoRepairLevel", _ret_int);
		}

	}

	/**
	 * Set what a unit should do when it is idle.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param idleMode  0: fly, 1: land
	 */
	@Override
	public void setIdleMode(int idleMode, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Unit_setIdleMode(this.getUnitId(), idleMode, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("setIdleMode", _ret_int);
		}

	}

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	@Override
	public void executeCustomCommand(int cmdId, java.util.List<Float> params_list, short options, int timeOut) throws CallbackAIException {

		int params_raw_size;
		float[] params;
		int params_size;
		int _ret_int;

		params_size = params_list.size();
		int _size = params_size;
		params_raw_size = params_size;
		params = new float[params_raw_size];
		for (int i=0; i < _size; i++) {
			params[i] = params_list.get(i);
		}

		_ret_int = innerCallback.Unit_executeCustomCommand(this.getUnitId(), cmdId, params, params_size, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("executeCustomCommand", _ret_int);
		}

	}
}


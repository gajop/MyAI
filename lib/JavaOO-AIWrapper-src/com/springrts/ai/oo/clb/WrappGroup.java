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
public class WrappGroup extends AbstractGroup implements Group {

	private AICallback innerCallback = null;
	private int groupId = -1;

	public WrappGroup(AICallback innerCallback, int groupId) {

		this.innerCallback = innerCallback;
		this.groupId = groupId;
	}

	@Override
	public int getGroupId() {

		return groupId;
	}

	public static Group getInstance(AICallback innerCallback, int groupId) {

		if (groupId < 0) {
			return null;
		}

		Group _ret = null;
		_ret = new WrappGroup(innerCallback, groupId);
		return _ret;
	}


	@Override
	public java.util.List<CommandDescription> getSupportedCommands() {

		java.util.List<CommandDescription> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.Group_getSupportedCommands(this.getGroupId());
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<CommandDescription>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappGroupSupportedCommand.getInstance(innerCallback, groupId, i));
		}

		return RETURN_SIZE_list;
	}

	@Override
	public boolean isSelected() {

		boolean _ret_int;

		_ret_int = innerCallback.Group_isSelected(this.getGroupId());
		return _ret_int;
	}

	/**
	 * Creates a group and returns the id it was given, returns -1 on failure
	 */
	@Override
	public Group create() {

		Group _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.Group_create();
		_ret_int_out = WrappGroup.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	/**
	 * Erases a specified group
	 */
	@Override
	public void erase() throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Group_erase(this.getGroupId());
		if (_ret_int != 0) {
			throw new CallbackAIException("erase", _ret_int);
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
	 * @param facing  set it to UNIT_COMMAND_BUILD_NO_FACING, if you do not want to specify a certain facing
	 */
	@Override
	public void build(UnitDef toBuildUnitDef, AIFloat3 buildPos, int facing, short options, int timeOut) throws CallbackAIException {

		int _ret_int;

		float[] buildPos_posF3 = buildPos.toFloatArray();
		int toBuildUnitDefId = toBuildUnitDef.getUnitDefId();

		_ret_int = innerCallback.Group_build(this.getGroupId(), toBuildUnitDefId, buildPos_posF3, facing, options, timeOut);
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

		_ret_int = innerCallback.Group_stop(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_wait(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_waitFor(this.getGroupId(), time, options, timeOut);
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

		_ret_int = innerCallback.Group_waitForDeathOf(this.getGroupId(), toDieUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_waitForSquadSize(this.getGroupId(), numUnits, options, timeOut);
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

		_ret_int = innerCallback.Group_waitForAll(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_moveTo(this.getGroupId(), toPos_posF3, options, timeOut);
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

		_ret_int = innerCallback.Group_patrolTo(this.getGroupId(), toPos_posF3, options, timeOut);
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

		_ret_int = innerCallback.Group_fight(this.getGroupId(), toPos_posF3, options, timeOut);
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

		_ret_int = innerCallback.Group_attack(this.getGroupId(), toAttackUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_attackArea(this.getGroupId(), toAttackPos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_guard(this.getGroupId(), toGuardUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_aiSelect(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_addToGroup(this.getGroupId(), toGroupId, options, timeOut);
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

		_ret_int = innerCallback.Group_removeFromGroup(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_repair(this.getGroupId(), toRepairUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_setFireState(this.getGroupId(), fireState, options, timeOut);
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

		_ret_int = innerCallback.Group_setMoveState(this.getGroupId(), moveState, options, timeOut);
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

		_ret_int = innerCallback.Group_setBase(this.getGroupId(), basePos_posF3, options, timeOut);
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

		_ret_int = innerCallback.Group_selfDestruct(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_setWantedMaxSpeed(this.getGroupId(), wantedMaxSpeed, options, timeOut);
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

		_ret_int = innerCallback.Group_loadUnits(this.getGroupId(), toLoadUnitIds, toLoadUnitIds_size, options, timeOut);
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

		_ret_int = innerCallback.Group_loadUnitsInArea(this.getGroupId(), pos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_loadOnto(this.getGroupId(), transporterUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_unload(this.getGroupId(), toPos_posF3, toUnloadUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_unloadUnitsInArea(this.getGroupId(), toPos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_setOn(this.getGroupId(), on, options, timeOut);
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

		_ret_int = innerCallback.Group_reclaimUnit(this.getGroupId(), toReclaimUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_reclaimFeature(this.getGroupId(), toReclaimFeatureId, options, timeOut);
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

		_ret_int = innerCallback.Group_reclaimInArea(this.getGroupId(), pos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_cloak(this.getGroupId(), cloak, options, timeOut);
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

		_ret_int = innerCallback.Group_stockpile(this.getGroupId(), options, timeOut);
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

		_ret_int = innerCallback.Group_dGun(this.getGroupId(), toAttackUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_dGunPosition(this.getGroupId(), pos_posF3, options, timeOut);
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

		_ret_int = innerCallback.Group_restoreArea(this.getGroupId(), pos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_setRepeat(this.getGroupId(), repeat, options, timeOut);
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

		_ret_int = innerCallback.Group_setTrajectory(this.getGroupId(), trajectory, options, timeOut);
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

		_ret_int = innerCallback.Group_resurrect(this.getGroupId(), toResurrectFeatureId, options, timeOut);
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

		_ret_int = innerCallback.Group_resurrectInArea(this.getGroupId(), pos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_capture(this.getGroupId(), toCaptureUnitId, options, timeOut);
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

		_ret_int = innerCallback.Group_captureInArea(this.getGroupId(), pos_posF3, radius, options, timeOut);
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

		_ret_int = innerCallback.Group_setAutoRepairLevel(this.getGroupId(), autoRepairLevel, options, timeOut);
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

		_ret_int = innerCallback.Group_setIdleMode(this.getGroupId(), idleMode, options, timeOut);
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

		_ret_int = innerCallback.Group_executeCustomCommand(this.getGroupId(), cmdId, params, params_size, options, timeOut);
		if (_ret_int != 0) {
			throw new CallbackAIException("executeCustomCommand", _ret_int);
		}

	}

	@Override
	public OrderPreview getOrderPreview() {

		OrderPreview _ret_int_out;

		_ret_int_out = WrappOrderPreview.getInstance(innerCallback, groupId);

		return _ret_int_out;
	}
}


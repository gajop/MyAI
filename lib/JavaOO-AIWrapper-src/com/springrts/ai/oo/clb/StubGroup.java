/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubGroup extends AbstractGroup implements Group {

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	private int groupId = 0;
	@Override
	public int getGroupId() {
		return groupId;
	}

	public void setSupportedCommands(java.util.List<CommandDescription> supportedCommands) {
		this.supportedCommands = supportedCommands;
	}
	private java.util.List<CommandDescription> supportedCommands = null;
	@Override
	public java.util.List<CommandDescription> getSupportedCommands() {
		return supportedCommands;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	private boolean isSelected = false;
	@Override
	public boolean isSelected() {
		return isSelected;
	}

	/**
	 * Creates a group and returns the id it was given, returns -1 on failure
	 */
	@Override
	public Group create() {
		return null;
	}

	/**
	 * Erases a specified group
	 */
	@Override
	public void erase() throws CallbackAIException {
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
	}

	/**
	 * @param options  see enum UnitCommandOptions
	 */
	@Override
	public void loadUnits(java.util.List<Unit> toLoadUnitIds_list, short options, int timeOut) throws CallbackAIException {
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
	}

	public void setOrderPreview(OrderPreview orderPreview) {
		this.orderPreview = orderPreview;
	}
	private OrderPreview orderPreview = null;
	@Override
	public OrderPreview getOrderPreview() {
		return orderPreview;
	}

}


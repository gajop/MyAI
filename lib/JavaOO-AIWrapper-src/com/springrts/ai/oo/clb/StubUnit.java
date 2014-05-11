/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubUnit extends AbstractUnit implements Unit {

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	private int unitId = 0;
	@Override
	public int getUnitId() {
		return unitId;
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
	public void setLimit(int limit) {
		this.limit = limit;
	}
	private int limit = 0;
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * Returns the maximum total number of units that may exist at any one point
	 * in time induring the current game.
	 */
	public void setMax(int max) {
		this.max = max;
	}
	private int max = 0;
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * Returns the unit's unitdef struct from which you can read all
	 * the statistics of the unit, do NOT try to change any values in it.
	 */
	public void setDef(UnitDef def) {
		this.def = def;
	}
	private UnitDef def = null;
	@Override
	public UnitDef getDef() {
		return def;
	}

	/**
	 * This is a set of parameters that is initialized
	 * in CreateUnitRulesParams() and may change during the game.
	 * Each parameter is uniquely identified only by its id
	 * (which is the index in the vector).
	 * Parameters may or may not have a name.
	 */
	public void setModParams(java.util.List<ModParam> modParams) {
		this.modParams = modParams;
	}
	private java.util.List<ModParam> modParams = null;
	@Override
	public java.util.List<ModParam> getModParams() {
		return modParams;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	private int team = 0;
	@Override
	public int getTeam() {
		return team;
	}

	public void setAllyTeam(int allyTeam) {
		this.allyTeam = allyTeam;
	}
	private int allyTeam = 0;
	@Override
	public int getAllyTeam() {
		return allyTeam;
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
	public void setAiHint(int aiHint) {
		this.aiHint = aiHint;
	}
	private int aiHint = 0;
	/** @deprecated */
	@Override
	public int getAiHint() {
		return aiHint;
	}

	public void setStockpile(int stockpile) {
		this.stockpile = stockpile;
	}
	private int stockpile = 0;
	@Override
	public int getStockpile() {
		return stockpile;
	}

	public void setStockpileQueued(int stockpileQueued) {
		this.stockpileQueued = stockpileQueued;
	}
	private int stockpileQueued = 0;
	@Override
	public int getStockpileQueued() {
		return stockpileQueued;
	}

	public void setCurrentFuel(float currentFuel) {
		this.currentFuel = currentFuel;
	}
	private float currentFuel = 0;
	@Override
	public float getCurrentFuel() {
		return currentFuel;
	}

	/**
	 * The unit's max speed
	 */
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private float maxSpeed = 0;
	@Override
	public float getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * The furthest any weapon of the unit can fire
	 */
	public void setMaxRange(float maxRange) {
		this.maxRange = maxRange;
	}
	private float maxRange = 0;
	@Override
	public float getMaxRange() {
		return maxRange;
	}

	/**
	 * The unit's max health
	 */
	public void setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
	}
	private float maxHealth = 0;
	@Override
	public float getMaxHealth() {
		return maxHealth;
	}

	/**
	 * How experienced the unit is (0.0f - 1.0f)
	 */
	public void setExperience(float experience) {
		this.experience = experience;
	}
	private float experience = 0;
	@Override
	public float getExperience() {
		return experience;
	}

	/**
	 * Returns the group a unit belongs to, -1 if none
	 */
	public void setGroup(int group) {
		this.group = group;
	}
	private int group = 0;
	@Override
	public int getGroup() {
		return group;
	}

	public void setCurrentCommands(java.util.List<Command> currentCommands) {
		this.currentCommands = currentCommands;
	}
	private java.util.List<Command> currentCommands = null;
	@Override
	public java.util.List<Command> getCurrentCommands() {
		return currentCommands;
	}

	/**
	 * The commands that this unit can understand, other commands will be ignored
	 */
	public void setSupportedCommands(java.util.List<CommandDescription> supportedCommands) {
		this.supportedCommands = supportedCommands;
	}
	private java.util.List<CommandDescription> supportedCommands = null;
	@Override
	public java.util.List<CommandDescription> getSupportedCommands() {
		return supportedCommands;
	}

	/**
	 * The unit's current health
	 */
	public void setHealth(float health) {
		this.health = health;
	}
	private float health = 0;
	@Override
	public float getHealth() {
		return health;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	private float speed = 0;
	@Override
	public float getSpeed() {
		return speed;
	}

	/**
	 * Indicate the relative power of the unit,
	 * used for experience calulations etc.
	 * This is sort of the measure of the units overall power.
	 */
	public void setPower(float power) {
		this.power = power;
	}
	private float power = 0;
	@Override
	public float getPower() {
		return power;
	}

	@Override
	public float getResourceUse(Resource resource) {
		return 0;
	}

	@Override
	public float getResourceMake(Resource resource) {
		return 0;
	}

	public void setPos(AIFloat3 pos) {
		this.pos = pos;
	}
	private AIFloat3 pos = null;
	@Override
	public AIFloat3 getPos() {
		return pos;
	}

	public void setVel(AIFloat3 vel) {
		this.vel = vel;
	}
	private AIFloat3 vel = null;
	@Override
	public AIFloat3 getVel() {
		return vel;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	private boolean isActivated = false;
	@Override
	public boolean isActivated() {
		return isActivated;
	}

	/**
	 * Returns true if the unit is currently being built
	 */
	public void setBeingBuilt(boolean isBeingBuilt) {
		this.isBeingBuilt = isBeingBuilt;
	}
	private boolean isBeingBuilt = false;
	@Override
	public boolean isBeingBuilt() {
		return isBeingBuilt;
	}

	public void setCloaked(boolean isCloaked) {
		this.isCloaked = isCloaked;
	}
	private boolean isCloaked = false;
	@Override
	public boolean isCloaked() {
		return isCloaked;
	}

	public void setParalyzed(boolean isParalyzed) {
		this.isParalyzed = isParalyzed;
	}
	private boolean isParalyzed = false;
	@Override
	public boolean isParalyzed() {
		return isParalyzed;
	}

	public void setNeutral(boolean isNeutral) {
		this.isNeutral = isNeutral;
	}
	private boolean isNeutral = false;
	@Override
	public boolean isNeutral() {
		return isNeutral;
	}

	/**
	 * Returns the unit's build facing (0-3)
	 */
	public void setBuildingFacing(int buildingFacing) {
		this.buildingFacing = buildingFacing;
	}
	private int buildingFacing = 0;
	@Override
	public int getBuildingFacing() {
		return buildingFacing;
	}

	/**
	 * Number of the last frame this unit received an order from a player.
	 */
	public void setLastUserOrderFrame(int lastUserOrderFrame) {
		this.lastUserOrderFrame = lastUserOrderFrame;
	}
	private int lastUserOrderFrame = 0;
	@Override
	public int getLastUserOrderFrame() {
		return lastUserOrderFrame;
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

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubUnitDef extends AbstractUnitDef implements UnitDef {

	public void setUnitDefId(int unitDefId) {
		this.unitDefId = unitDefId;
	}
	private int unitDefId = 0;
	@Override
	public int getUnitDefId() {
		return unitDefId;
	}

	/**
	 * Forces loading of the unit model
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	private float height = 0;
	@Override
	public float getHeight() {
		return height;
	}

	/**
	 * Forces loading of the unit model
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	private float radius = 0;
	@Override
	public float getRadius() {
		return radius;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	private String humanName = "";
	@Override
	public String getHumanName() {
		return humanName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	private String fileName = "";
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
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

	public void setCobId(int cobId) {
		this.cobId = cobId;
	}
	private int cobId = 0;
	@Override
	public int getCobId() {
		return cobId;
	}

	public void setTechLevel(int techLevel) {
		this.techLevel = techLevel;
	}
	private int techLevel = 0;
	@Override
	public int getTechLevel() {
		return techLevel;
	}

	/**
	 * @deprecated
	 */
	public void setGaia(String gaia) {
		this.gaia = gaia;
	}
	private String gaia = "";
	/** @deprecated */
	@Override
	public String getGaia() {
		return gaia;
	}

	@Override
	public float getUpkeep(Resource resource) {
		return 0;
	}

	/**
	 * This amount of the resource will always be created.
	 */
	@Override
	public float getResourceMake(Resource resource) {
		return 0;
	}

	/**
	 * This amount of the resource will be created when the unit is on and enough
	 * energy can be drained.
	 */
	@Override
	public float getMakesResource(Resource resource) {
		return 0;
	}

	@Override
	public float getCost(Resource resource) {
		return 0;
	}

	@Override
	public float getExtractsResource(Resource resource) {
		return 0;
	}

	@Override
	public float getResourceExtractorRange(Resource resource) {
		return 0;
	}

	@Override
	public float getWindResourceGenerator(Resource resource) {
		return 0;
	}

	@Override
	public float getTidalResourceGenerator(Resource resource) {
		return 0;
	}

	@Override
	public float getStorage(Resource resource) {
		return 0;
	}

	@Override
	public boolean isSquareResourceExtractor(Resource resource) {
		return false;
	}

	public void setBuildTime(float buildTime) {
		this.buildTime = buildTime;
	}
	private float buildTime = 0;
	@Override
	public float getBuildTime() {
		return buildTime;
	}

	/**
	 * This amount of auto-heal will always be applied.
	 */
	public void setAutoHeal(float autoHeal) {
		this.autoHeal = autoHeal;
	}
	private float autoHeal = 0;
	@Override
	public float getAutoHeal() {
		return autoHeal;
	}

	/**
	 * This amount of auto-heal will only be applied while the unit is idling.
	 */
	public void setIdleAutoHeal(float idleAutoHeal) {
		this.idleAutoHeal = idleAutoHeal;
	}
	private float idleAutoHeal = 0;
	@Override
	public float getIdleAutoHeal() {
		return idleAutoHeal;
	}

	/**
	 * Time a unit needs to idle before it is considered idling.
	 */
	public void setIdleTime(int idleTime) {
		this.idleTime = idleTime;
	}
	private int idleTime = 0;
	@Override
	public int getIdleTime() {
		return idleTime;
	}

	public void setPower(float power) {
		this.power = power;
	}
	private float power = 0;
	@Override
	public float getPower() {
		return power;
	}

	public void setHealth(float health) {
		this.health = health;
	}
	private float health = 0;
	@Override
	public float getHealth() {
		return health;
	}

	/**
	 * Returns the bit field value denoting the categories this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setCategory(int category) {
		this.category = category;
	}
	private int category = 0;
	@Override
	public int getCategory() {
		return category;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	private float speed = 0;
	@Override
	public float getSpeed() {
		return speed;
	}

	public void setTurnRate(float turnRate) {
		this.turnRate = turnRate;
	}
	private float turnRate = 0;
	@Override
	public float getTurnRate() {
		return turnRate;
	}

	public void setTurnInPlace(boolean isTurnInPlace) {
		this.isTurnInPlace = isTurnInPlace;
	}
	private boolean isTurnInPlace = false;
	@Override
	public boolean isTurnInPlace() {
		return isTurnInPlace;
	}

	/**
	 * Units above this distance to goal will try to turn while keeping
	 * some of their speed.
	 * 0 to disable
	 */
	public void setTurnInPlaceDistance(float turnInPlaceDistance) {
		this.turnInPlaceDistance = turnInPlaceDistance;
	}
	private float turnInPlaceDistance = 0;
	@Override
	public float getTurnInPlaceDistance() {
		return turnInPlaceDistance;
	}

	/**
	 * Units below this speed will turn in place regardless of their
	 * turnInPlace setting.
	 */
	public void setTurnInPlaceSpeedLimit(float turnInPlaceSpeedLimit) {
		this.turnInPlaceSpeedLimit = turnInPlaceSpeedLimit;
	}
	private float turnInPlaceSpeedLimit = 0;
	@Override
	public float getTurnInPlaceSpeedLimit() {
		return turnInPlaceSpeedLimit;
	}

	public void setUpright(boolean isUpright) {
		this.isUpright = isUpright;
	}
	private boolean isUpright = false;
	@Override
	public boolean isUpright() {
		return isUpright;
	}

	public void setCollide(boolean isCollide) {
		this.isCollide = isCollide;
	}
	private boolean isCollide = false;
	@Override
	public boolean isCollide() {
		return isCollide;
	}

	public void setLosRadius(float losRadius) {
		this.losRadius = losRadius;
	}
	private float losRadius = 0;
	@Override
	public float getLosRadius() {
		return losRadius;
	}

	public void setAirLosRadius(float airLosRadius) {
		this.airLosRadius = airLosRadius;
	}
	private float airLosRadius = 0;
	@Override
	public float getAirLosRadius() {
		return airLosRadius;
	}

	public void setLosHeight(float losHeight) {
		this.losHeight = losHeight;
	}
	private float losHeight = 0;
	@Override
	public float getLosHeight() {
		return losHeight;
	}

	public void setRadarRadius(int radarRadius) {
		this.radarRadius = radarRadius;
	}
	private int radarRadius = 0;
	@Override
	public int getRadarRadius() {
		return radarRadius;
	}

	public void setSonarRadius(int sonarRadius) {
		this.sonarRadius = sonarRadius;
	}
	private int sonarRadius = 0;
	@Override
	public int getSonarRadius() {
		return sonarRadius;
	}

	public void setJammerRadius(int jammerRadius) {
		this.jammerRadius = jammerRadius;
	}
	private int jammerRadius = 0;
	@Override
	public int getJammerRadius() {
		return jammerRadius;
	}

	public void setSonarJamRadius(int sonarJamRadius) {
		this.sonarJamRadius = sonarJamRadius;
	}
	private int sonarJamRadius = 0;
	@Override
	public int getSonarJamRadius() {
		return sonarJamRadius;
	}

	public void setSeismicRadius(int seismicRadius) {
		this.seismicRadius = seismicRadius;
	}
	private int seismicRadius = 0;
	@Override
	public int getSeismicRadius() {
		return seismicRadius;
	}

	public void setSeismicSignature(float seismicSignature) {
		this.seismicSignature = seismicSignature;
	}
	private float seismicSignature = 0;
	@Override
	public float getSeismicSignature() {
		return seismicSignature;
	}

	public void setStealth(boolean isStealth) {
		this.isStealth = isStealth;
	}
	private boolean isStealth = false;
	@Override
	public boolean isStealth() {
		return isStealth;
	}

	public void setSonarStealth(boolean isSonarStealth) {
		this.isSonarStealth = isSonarStealth;
	}
	private boolean isSonarStealth = false;
	@Override
	public boolean isSonarStealth() {
		return isSonarStealth;
	}

	public void setBuildRange3D(boolean isBuildRange3D) {
		this.isBuildRange3D = isBuildRange3D;
	}
	private boolean isBuildRange3D = false;
	@Override
	public boolean isBuildRange3D() {
		return isBuildRange3D;
	}

	public void setBuildDistance(float buildDistance) {
		this.buildDistance = buildDistance;
	}
	private float buildDistance = 0;
	@Override
	public float getBuildDistance() {
		return buildDistance;
	}

	public void setBuildSpeed(float buildSpeed) {
		this.buildSpeed = buildSpeed;
	}
	private float buildSpeed = 0;
	@Override
	public float getBuildSpeed() {
		return buildSpeed;
	}

	public void setReclaimSpeed(float reclaimSpeed) {
		this.reclaimSpeed = reclaimSpeed;
	}
	private float reclaimSpeed = 0;
	@Override
	public float getReclaimSpeed() {
		return reclaimSpeed;
	}

	public void setRepairSpeed(float repairSpeed) {
		this.repairSpeed = repairSpeed;
	}
	private float repairSpeed = 0;
	@Override
	public float getRepairSpeed() {
		return repairSpeed;
	}

	public void setMaxRepairSpeed(float maxRepairSpeed) {
		this.maxRepairSpeed = maxRepairSpeed;
	}
	private float maxRepairSpeed = 0;
	@Override
	public float getMaxRepairSpeed() {
		return maxRepairSpeed;
	}

	public void setResurrectSpeed(float resurrectSpeed) {
		this.resurrectSpeed = resurrectSpeed;
	}
	private float resurrectSpeed = 0;
	@Override
	public float getResurrectSpeed() {
		return resurrectSpeed;
	}

	public void setCaptureSpeed(float captureSpeed) {
		this.captureSpeed = captureSpeed;
	}
	private float captureSpeed = 0;
	@Override
	public float getCaptureSpeed() {
		return captureSpeed;
	}

	public void setTerraformSpeed(float terraformSpeed) {
		this.terraformSpeed = terraformSpeed;
	}
	private float terraformSpeed = 0;
	@Override
	public float getTerraformSpeed() {
		return terraformSpeed;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}
	private float mass = 0;
	@Override
	public float getMass() {
		return mass;
	}

	public void setPushResistant(boolean isPushResistant) {
		this.isPushResistant = isPushResistant;
	}
	private boolean isPushResistant = false;
	@Override
	public boolean isPushResistant() {
		return isPushResistant;
	}

	/**
	 * Should the unit move sideways when it can not shoot?
	 */
	public void setStrafeToAttack(boolean isStrafeToAttack) {
		this.isStrafeToAttack = isStrafeToAttack;
	}
	private boolean isStrafeToAttack = false;
	@Override
	public boolean isStrafeToAttack() {
		return isStrafeToAttack;
	}

	public void setMinCollisionSpeed(float minCollisionSpeed) {
		this.minCollisionSpeed = minCollisionSpeed;
	}
	private float minCollisionSpeed = 0;
	@Override
	public float getMinCollisionSpeed() {
		return minCollisionSpeed;
	}

	public void setSlideTolerance(float slideTolerance) {
		this.slideTolerance = slideTolerance;
	}
	private float slideTolerance = 0;
	@Override
	public float getSlideTolerance() {
		return slideTolerance;
	}

	/**
	 * Build location relevant maximum steepness of the underlaying terrain.
	 * Used to calculate the maxHeightDif.
	 */
	public void setMaxSlope(float maxSlope) {
		this.maxSlope = maxSlope;
	}
	private float maxSlope = 0;
	@Override
	public float getMaxSlope() {
		return maxSlope;
	}

	/**
	 * Maximum terra-form height this building allows.
	 * If this value is 0.0, you can only build this structure on
	 * totally flat terrain.
	 */
	public void setMaxHeightDif(float maxHeightDif) {
		this.maxHeightDif = maxHeightDif;
	}
	private float maxHeightDif = 0;
	@Override
	public float getMaxHeightDif() {
		return maxHeightDif;
	}

	public void setMinWaterDepth(float minWaterDepth) {
		this.minWaterDepth = minWaterDepth;
	}
	private float minWaterDepth = 0;
	@Override
	public float getMinWaterDepth() {
		return minWaterDepth;
	}

	public void setWaterline(float waterline) {
		this.waterline = waterline;
	}
	private float waterline = 0;
	@Override
	public float getWaterline() {
		return waterline;
	}

	public void setMaxWaterDepth(float maxWaterDepth) {
		this.maxWaterDepth = maxWaterDepth;
	}
	private float maxWaterDepth = 0;
	@Override
	public float getMaxWaterDepth() {
		return maxWaterDepth;
	}

	public void setArmoredMultiple(float armoredMultiple) {
		this.armoredMultiple = armoredMultiple;
	}
	private float armoredMultiple = 0;
	@Override
	public float getArmoredMultiple() {
		return armoredMultiple;
	}

	public void setArmorType(int armorType) {
		this.armorType = armorType;
	}
	private int armorType = 0;
	@Override
	public int getArmorType() {
		return armorType;
	}

	public void setMaxWeaponRange(float maxWeaponRange) {
		this.maxWeaponRange = maxWeaponRange;
	}
	private float maxWeaponRange = 0;
	@Override
	public float getMaxWeaponRange() {
		return maxWeaponRange;
	}

	/**
	 * @deprecated
	 */
	public void setType(String type) {
		this.type = type;
	}
	private String type = "";
	/** @deprecated */
	@Override
	public String getType() {
		return type;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	private String tooltip = "";
	@Override
	public String getTooltip() {
		return tooltip;
	}

	public void setWreckName(String wreckName) {
		this.wreckName = wreckName;
	}
	private String wreckName = "";
	@Override
	public String getWreckName() {
		return wreckName;
	}

	public void setDeathExplosion(String deathExplosion) {
		this.deathExplosion = deathExplosion;
	}
	private String deathExplosion = "";
	@Override
	public String getDeathExplosion() {
		return deathExplosion;
	}

	public void setSelfDExplosion(String selfDExplosion) {
		this.selfDExplosion = selfDExplosion;
	}
	private String selfDExplosion = "";
	@Override
	public String getSelfDExplosion() {
		return selfDExplosion;
	}

	/**
	 * Returns the name of the category this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setCategoryString(String categoryString) {
		this.categoryString = categoryString;
	}
	private String categoryString = "";
	@Override
	public String getCategoryString() {
		return categoryString;
	}

	public void setAbleToSelfD(boolean isAbleToSelfD) {
		this.isAbleToSelfD = isAbleToSelfD;
	}
	private boolean isAbleToSelfD = false;
	@Override
	public boolean isAbleToSelfD() {
		return isAbleToSelfD;
	}

	public void setSelfDCountdown(int selfDCountdown) {
		this.selfDCountdown = selfDCountdown;
	}
	private int selfDCountdown = 0;
	@Override
	public int getSelfDCountdown() {
		return selfDCountdown;
	}

	public void setAbleToSubmerge(boolean isAbleToSubmerge) {
		this.isAbleToSubmerge = isAbleToSubmerge;
	}
	private boolean isAbleToSubmerge = false;
	@Override
	public boolean isAbleToSubmerge() {
		return isAbleToSubmerge;
	}

	public void setAbleToFly(boolean isAbleToFly) {
		this.isAbleToFly = isAbleToFly;
	}
	private boolean isAbleToFly = false;
	@Override
	public boolean isAbleToFly() {
		return isAbleToFly;
	}

	public void setAbleToMove(boolean isAbleToMove) {
		this.isAbleToMove = isAbleToMove;
	}
	private boolean isAbleToMove = false;
	@Override
	public boolean isAbleToMove() {
		return isAbleToMove;
	}

	public void setAbleToHover(boolean isAbleToHover) {
		this.isAbleToHover = isAbleToHover;
	}
	private boolean isAbleToHover = false;
	@Override
	public boolean isAbleToHover() {
		return isAbleToHover;
	}

	public void setFloater(boolean isFloater) {
		this.isFloater = isFloater;
	}
	private boolean isFloater = false;
	@Override
	public boolean isFloater() {
		return isFloater;
	}

	public void setBuilder(boolean isBuilder) {
		this.isBuilder = isBuilder;
	}
	private boolean isBuilder = false;
	@Override
	public boolean isBuilder() {
		return isBuilder;
	}

	public void setActivateWhenBuilt(boolean isActivateWhenBuilt) {
		this.isActivateWhenBuilt = isActivateWhenBuilt;
	}
	private boolean isActivateWhenBuilt = false;
	@Override
	public boolean isActivateWhenBuilt() {
		return isActivateWhenBuilt;
	}

	public void setOnOffable(boolean isOnOffable) {
		this.isOnOffable = isOnOffable;
	}
	private boolean isOnOffable = false;
	@Override
	public boolean isOnOffable() {
		return isOnOffable;
	}

	public void setFullHealthFactory(boolean isFullHealthFactory) {
		this.isFullHealthFactory = isFullHealthFactory;
	}
	private boolean isFullHealthFactory = false;
	@Override
	public boolean isFullHealthFactory() {
		return isFullHealthFactory;
	}

	public void setFactoryHeadingTakeoff(boolean isFactoryHeadingTakeoff) {
		this.isFactoryHeadingTakeoff = isFactoryHeadingTakeoff;
	}
	private boolean isFactoryHeadingTakeoff = false;
	@Override
	public boolean isFactoryHeadingTakeoff() {
		return isFactoryHeadingTakeoff;
	}

	public void setReclaimable(boolean isReclaimable) {
		this.isReclaimable = isReclaimable;
	}
	private boolean isReclaimable = false;
	@Override
	public boolean isReclaimable() {
		return isReclaimable;
	}

	public void setCapturable(boolean isCapturable) {
		this.isCapturable = isCapturable;
	}
	private boolean isCapturable = false;
	@Override
	public boolean isCapturable() {
		return isCapturable;
	}

	public void setAbleToRestore(boolean isAbleToRestore) {
		this.isAbleToRestore = isAbleToRestore;
	}
	private boolean isAbleToRestore = false;
	@Override
	public boolean isAbleToRestore() {
		return isAbleToRestore;
	}

	public void setAbleToRepair(boolean isAbleToRepair) {
		this.isAbleToRepair = isAbleToRepair;
	}
	private boolean isAbleToRepair = false;
	@Override
	public boolean isAbleToRepair() {
		return isAbleToRepair;
	}

	public void setAbleToSelfRepair(boolean isAbleToSelfRepair) {
		this.isAbleToSelfRepair = isAbleToSelfRepair;
	}
	private boolean isAbleToSelfRepair = false;
	@Override
	public boolean isAbleToSelfRepair() {
		return isAbleToSelfRepair;
	}

	public void setAbleToReclaim(boolean isAbleToReclaim) {
		this.isAbleToReclaim = isAbleToReclaim;
	}
	private boolean isAbleToReclaim = false;
	@Override
	public boolean isAbleToReclaim() {
		return isAbleToReclaim;
	}

	public void setAbleToAttack(boolean isAbleToAttack) {
		this.isAbleToAttack = isAbleToAttack;
	}
	private boolean isAbleToAttack = false;
	@Override
	public boolean isAbleToAttack() {
		return isAbleToAttack;
	}

	public void setAbleToPatrol(boolean isAbleToPatrol) {
		this.isAbleToPatrol = isAbleToPatrol;
	}
	private boolean isAbleToPatrol = false;
	@Override
	public boolean isAbleToPatrol() {
		return isAbleToPatrol;
	}

	public void setAbleToFight(boolean isAbleToFight) {
		this.isAbleToFight = isAbleToFight;
	}
	private boolean isAbleToFight = false;
	@Override
	public boolean isAbleToFight() {
		return isAbleToFight;
	}

	public void setAbleToGuard(boolean isAbleToGuard) {
		this.isAbleToGuard = isAbleToGuard;
	}
	private boolean isAbleToGuard = false;
	@Override
	public boolean isAbleToGuard() {
		return isAbleToGuard;
	}

	public void setAbleToAssist(boolean isAbleToAssist) {
		this.isAbleToAssist = isAbleToAssist;
	}
	private boolean isAbleToAssist = false;
	@Override
	public boolean isAbleToAssist() {
		return isAbleToAssist;
	}

	public void setAssistable(boolean isAssistable) {
		this.isAssistable = isAssistable;
	}
	private boolean isAssistable = false;
	@Override
	public boolean isAssistable() {
		return isAssistable;
	}

	public void setAbleToRepeat(boolean isAbleToRepeat) {
		this.isAbleToRepeat = isAbleToRepeat;
	}
	private boolean isAbleToRepeat = false;
	@Override
	public boolean isAbleToRepeat() {
		return isAbleToRepeat;
	}

	public void setAbleToFireControl(boolean isAbleToFireControl) {
		this.isAbleToFireControl = isAbleToFireControl;
	}
	private boolean isAbleToFireControl = false;
	@Override
	public boolean isAbleToFireControl() {
		return isAbleToFireControl;
	}

	public void setFireState(int fireState) {
		this.fireState = fireState;
	}
	private int fireState = 0;
	@Override
	public int getFireState() {
		return fireState;
	}

	public void setMoveState(int moveState) {
		this.moveState = moveState;
	}
	private int moveState = 0;
	@Override
	public int getMoveState() {
		return moveState;
	}

	public void setWingDrag(float wingDrag) {
		this.wingDrag = wingDrag;
	}
	private float wingDrag = 0;
	@Override
	public float getWingDrag() {
		return wingDrag;
	}

	public void setWingAngle(float wingAngle) {
		this.wingAngle = wingAngle;
	}
	private float wingAngle = 0;
	@Override
	public float getWingAngle() {
		return wingAngle;
	}

	public void setDrag(float drag) {
		this.drag = drag;
	}
	private float drag = 0;
	@Override
	public float getDrag() {
		return drag;
	}

	public void setFrontToSpeed(float frontToSpeed) {
		this.frontToSpeed = frontToSpeed;
	}
	private float frontToSpeed = 0;
	@Override
	public float getFrontToSpeed() {
		return frontToSpeed;
	}

	public void setSpeedToFront(float speedToFront) {
		this.speedToFront = speedToFront;
	}
	private float speedToFront = 0;
	@Override
	public float getSpeedToFront() {
		return speedToFront;
	}

	public void setMyGravity(float myGravity) {
		this.myGravity = myGravity;
	}
	private float myGravity = 0;
	@Override
	public float getMyGravity() {
		return myGravity;
	}

	public void setMaxBank(float maxBank) {
		this.maxBank = maxBank;
	}
	private float maxBank = 0;
	@Override
	public float getMaxBank() {
		return maxBank;
	}

	public void setMaxPitch(float maxPitch) {
		this.maxPitch = maxPitch;
	}
	private float maxPitch = 0;
	@Override
	public float getMaxPitch() {
		return maxPitch;
	}

	public void setTurnRadius(float turnRadius) {
		this.turnRadius = turnRadius;
	}
	private float turnRadius = 0;
	@Override
	public float getTurnRadius() {
		return turnRadius;
	}

	public void setWantedHeight(float wantedHeight) {
		this.wantedHeight = wantedHeight;
	}
	private float wantedHeight = 0;
	@Override
	public float getWantedHeight() {
		return wantedHeight;
	}

	public void setVerticalSpeed(float verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}
	private float verticalSpeed = 0;
	@Override
	public float getVerticalSpeed() {
		return verticalSpeed;
	}

	/**
	 * @deprecated
	 */
	public void setAbleToCrash(boolean isAbleToCrash) {
		this.isAbleToCrash = isAbleToCrash;
	}
	private boolean isAbleToCrash = false;
	/** @deprecated */
	@Override
	public boolean isAbleToCrash() {
		return isAbleToCrash;
	}

	/**
	 * @deprecated
	 */
	public void setHoverAttack(boolean isHoverAttack) {
		this.isHoverAttack = isHoverAttack;
	}
	private boolean isHoverAttack = false;
	/** @deprecated */
	@Override
	public boolean isHoverAttack() {
		return isHoverAttack;
	}

	public void setAirStrafe(boolean isAirStrafe) {
		this.isAirStrafe = isAirStrafe;
	}
	private boolean isAirStrafe = false;
	@Override
	public boolean isAirStrafe() {
		return isAirStrafe;
	}

	/**
	 * @return  < 0:  it can land
	 *          >= 0: how much the unit will move during hovering on the spot
	 */
	public void setDlHoverFactor(float dlHoverFactor) {
		this.dlHoverFactor = dlHoverFactor;
	}
	private float dlHoverFactor = 0;
	@Override
	public float getDlHoverFactor() {
		return dlHoverFactor;
	}

	public void setMaxAcceleration(float maxAcceleration) {
		this.maxAcceleration = maxAcceleration;
	}
	private float maxAcceleration = 0;
	@Override
	public float getMaxAcceleration() {
		return maxAcceleration;
	}

	public void setMaxDeceleration(float maxDeceleration) {
		this.maxDeceleration = maxDeceleration;
	}
	private float maxDeceleration = 0;
	@Override
	public float getMaxDeceleration() {
		return maxDeceleration;
	}

	public void setMaxAileron(float maxAileron) {
		this.maxAileron = maxAileron;
	}
	private float maxAileron = 0;
	@Override
	public float getMaxAileron() {
		return maxAileron;
	}

	public void setMaxElevator(float maxElevator) {
		this.maxElevator = maxElevator;
	}
	private float maxElevator = 0;
	@Override
	public float getMaxElevator() {
		return maxElevator;
	}

	public void setMaxRudder(float maxRudder) {
		this.maxRudder = maxRudder;
	}
	private float maxRudder = 0;
	@Override
	public float getMaxRudder() {
		return maxRudder;
	}

	/**
	 * The yard map defines which parts of the square a unit occupies
	 * can still be walked on by other units.
	 * Example:
	 * In the BA Arm T2 K-Bot lab, htere is a line in hte middle where units
	 * walk, otherwise they would not be able ot exit the lab once they are
	 * built.
	 * @return 0 if invalid facing or the unit has no yard-map defined,
	 *         the size of the yard-map otherwise: getXSize() * getXSize()
	 */
	@Override
	public java.util.List<Short> getYardMap(int facing) {
		return null;
	}

	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
	private int xSize = 0;
	@Override
	public int getXSize() {
		return xSize;
	}

	public void setZSize(int zSize) {
		this.zSize = zSize;
	}
	private int zSize = 0;
	@Override
	public int getZSize() {
		return zSize;
	}

	/**
	 * @deprecated
	 */
	public void setBuildAngle(int buildAngle) {
		this.buildAngle = buildAngle;
	}
	private int buildAngle = 0;
	/** @deprecated */
	@Override
	public int getBuildAngle() {
		return buildAngle;
	}

	public void setLoadingRadius(float loadingRadius) {
		this.loadingRadius = loadingRadius;
	}
	private float loadingRadius = 0;
	@Override
	public float getLoadingRadius() {
		return loadingRadius;
	}

	public void setUnloadSpread(float unloadSpread) {
		this.unloadSpread = unloadSpread;
	}
	private float unloadSpread = 0;
	@Override
	public float getUnloadSpread() {
		return unloadSpread;
	}

	public void setTransportCapacity(int transportCapacity) {
		this.transportCapacity = transportCapacity;
	}
	private int transportCapacity = 0;
	@Override
	public int getTransportCapacity() {
		return transportCapacity;
	}

	public void setTransportSize(int transportSize) {
		this.transportSize = transportSize;
	}
	private int transportSize = 0;
	@Override
	public int getTransportSize() {
		return transportSize;
	}

	public void setMinTransportSize(int minTransportSize) {
		this.minTransportSize = minTransportSize;
	}
	private int minTransportSize = 0;
	@Override
	public int getMinTransportSize() {
		return minTransportSize;
	}

	public void setAirBase(boolean isAirBase) {
		this.isAirBase = isAirBase;
	}
	private boolean isAirBase = false;
	@Override
	public boolean isAirBase() {
		return isAirBase;
	}

	public void setFirePlatform(boolean isFirePlatform) {
		this.isFirePlatform = isFirePlatform;
	}
	private boolean isFirePlatform = false;
	@Override
	public boolean isFirePlatform() {
		return isFirePlatform;
	}

	public void setTransportMass(float transportMass) {
		this.transportMass = transportMass;
	}
	private float transportMass = 0;
	@Override
	public float getTransportMass() {
		return transportMass;
	}

	public void setMinTransportMass(float minTransportMass) {
		this.minTransportMass = minTransportMass;
	}
	private float minTransportMass = 0;
	@Override
	public float getMinTransportMass() {
		return minTransportMass;
	}

	public void setHoldSteady(boolean isHoldSteady) {
		this.isHoldSteady = isHoldSteady;
	}
	private boolean isHoldSteady = false;
	@Override
	public boolean isHoldSteady() {
		return isHoldSteady;
	}

	public void setReleaseHeld(boolean isReleaseHeld) {
		this.isReleaseHeld = isReleaseHeld;
	}
	private boolean isReleaseHeld = false;
	@Override
	public boolean isReleaseHeld() {
		return isReleaseHeld;
	}

	public void setNotTransportable(boolean isNotTransportable) {
		this.isNotTransportable = isNotTransportable;
	}
	private boolean isNotTransportable = false;
	@Override
	public boolean isNotTransportable() {
		return isNotTransportable;
	}

	public void setTransportByEnemy(boolean isTransportByEnemy) {
		this.isTransportByEnemy = isTransportByEnemy;
	}
	private boolean isTransportByEnemy = false;
	@Override
	public boolean isTransportByEnemy() {
		return isTransportByEnemy;
	}

	/**
	 * @return  0: land unload
	 *          1: fly-over drop
	 *          2: land flood
	 */
	public void setTransportUnloadMethod(int transportUnloadMethod) {
		this.transportUnloadMethod = transportUnloadMethod;
	}
	private int transportUnloadMethod = 0;
	@Override
	public int getTransportUnloadMethod() {
		return transportUnloadMethod;
	}

	/**
	 * Dictates fall speed of all transported units.
	 * This only makes sense for air transports,
	 * if they an drop units while in the air.
	 */
	public void setFallSpeed(float fallSpeed) {
		this.fallSpeed = fallSpeed;
	}
	private float fallSpeed = 0;
	@Override
	public float getFallSpeed() {
		return fallSpeed;
	}

	/**
	 * Sets the transported units FBI, overrides fallSpeed
	 */
	public void setUnitFallSpeed(float unitFallSpeed) {
		this.unitFallSpeed = unitFallSpeed;
	}
	private float unitFallSpeed = 0;
	@Override
	public float getUnitFallSpeed() {
		return unitFallSpeed;
	}

	/**
	 * If the unit can cloak
	 */
	public void setAbleToCloak(boolean isAbleToCloak) {
		this.isAbleToCloak = isAbleToCloak;
	}
	private boolean isAbleToCloak = false;
	@Override
	public boolean isAbleToCloak() {
		return isAbleToCloak;
	}

	/**
	 * If the unit wants to start out cloaked
	 */
	public void setStartCloaked(boolean isStartCloaked) {
		this.isStartCloaked = isStartCloaked;
	}
	private boolean isStartCloaked = false;
	@Override
	public boolean isStartCloaked() {
		return isStartCloaked;
	}

	/**
	 * Energy cost per second to stay cloaked when stationary
	 */
	public void setCloakCost(float cloakCost) {
		this.cloakCost = cloakCost;
	}
	private float cloakCost = 0;
	@Override
	public float getCloakCost() {
		return cloakCost;
	}

	/**
	 * Energy cost per second to stay cloaked when moving
	 */
	public void setCloakCostMoving(float cloakCostMoving) {
		this.cloakCostMoving = cloakCostMoving;
	}
	private float cloakCostMoving = 0;
	@Override
	public float getCloakCostMoving() {
		return cloakCostMoving;
	}

	/**
	 * If enemy unit comes within this range, decloaking is forced
	 */
	public void setDecloakDistance(float decloakDistance) {
		this.decloakDistance = decloakDistance;
	}
	private float decloakDistance = 0;
	@Override
	public float getDecloakDistance() {
		return decloakDistance;
	}

	/**
	 * Use a spherical, instead of a cylindrical test?
	 */
	public void setDecloakSpherical(boolean isDecloakSpherical) {
		this.isDecloakSpherical = isDecloakSpherical;
	}
	private boolean isDecloakSpherical = false;
	@Override
	public boolean isDecloakSpherical() {
		return isDecloakSpherical;
	}

	/**
	 * Will the unit decloak upon firing?
	 */
	public void setDecloakOnFire(boolean isDecloakOnFire) {
		this.isDecloakOnFire = isDecloakOnFire;
	}
	private boolean isDecloakOnFire = false;
	@Override
	public boolean isDecloakOnFire() {
		return isDecloakOnFire;
	}

	/**
	 * Will the unit self destruct if an enemy comes to close?
	 */
	public void setAbleToKamikaze(boolean isAbleToKamikaze) {
		this.isAbleToKamikaze = isAbleToKamikaze;
	}
	private boolean isAbleToKamikaze = false;
	@Override
	public boolean isAbleToKamikaze() {
		return isAbleToKamikaze;
	}

	public void setKamikazeDist(float kamikazeDist) {
		this.kamikazeDist = kamikazeDist;
	}
	private float kamikazeDist = 0;
	@Override
	public float getKamikazeDist() {
		return kamikazeDist;
	}

	public void setTargetingFacility(boolean isTargetingFacility) {
		this.isTargetingFacility = isTargetingFacility;
	}
	private boolean isTargetingFacility = false;
	@Override
	public boolean isTargetingFacility() {
		return isTargetingFacility;
	}

	@Override
	public boolean canManualFire() {
		return false;
	}

	public void setNeedGeo(boolean isNeedGeo) {
		this.isNeedGeo = isNeedGeo;
	}
	private boolean isNeedGeo = false;
	@Override
	public boolean isNeedGeo() {
		return isNeedGeo;
	}

	public void setFeature(boolean isFeature) {
		this.isFeature = isFeature;
	}
	private boolean isFeature = false;
	@Override
	public boolean isFeature() {
		return isFeature;
	}

	public void setHideDamage(boolean isHideDamage) {
		this.isHideDamage = isHideDamage;
	}
	private boolean isHideDamage = false;
	@Override
	public boolean isHideDamage() {
		return isHideDamage;
	}

	public void setCommander(boolean isCommander) {
		this.isCommander = isCommander;
	}
	private boolean isCommander = false;
	@Override
	public boolean isCommander() {
		return isCommander;
	}

	public void setShowPlayerName(boolean isShowPlayerName) {
		this.isShowPlayerName = isShowPlayerName;
	}
	private boolean isShowPlayerName = false;
	@Override
	public boolean isShowPlayerName() {
		return isShowPlayerName;
	}

	public void setAbleToResurrect(boolean isAbleToResurrect) {
		this.isAbleToResurrect = isAbleToResurrect;
	}
	private boolean isAbleToResurrect = false;
	@Override
	public boolean isAbleToResurrect() {
		return isAbleToResurrect;
	}

	public void setAbleToCapture(boolean isAbleToCapture) {
		this.isAbleToCapture = isAbleToCapture;
	}
	private boolean isAbleToCapture = false;
	@Override
	public boolean isAbleToCapture() {
		return isAbleToCapture;
	}

	/**
	 * Indicates the trajectory types supported by this unit.
	 * 
	 * @return  0: (default) = only low
	 *          1: only high
	 *          2: choose
	 */
	public void setHighTrajectoryType(int highTrajectoryType) {
		this.highTrajectoryType = highTrajectoryType;
	}
	private int highTrajectoryType = 0;
	@Override
	public int getHighTrajectoryType() {
		return highTrajectoryType;
	}

	/**
	 * Returns the bit field value denoting the categories this unit shall not
	 * chase.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setNoChaseCategory(int noChaseCategory) {
		this.noChaseCategory = noChaseCategory;
	}
	private int noChaseCategory = 0;
	@Override
	public int getNoChaseCategory() {
		return noChaseCategory;
	}

	public void setLeaveTracks(boolean isLeaveTracks) {
		this.isLeaveTracks = isLeaveTracks;
	}
	private boolean isLeaveTracks = false;
	@Override
	public boolean isLeaveTracks() {
		return isLeaveTracks;
	}

	public void setTrackWidth(float trackWidth) {
		this.trackWidth = trackWidth;
	}
	private float trackWidth = 0;
	@Override
	public float getTrackWidth() {
		return trackWidth;
	}

	public void setTrackOffset(float trackOffset) {
		this.trackOffset = trackOffset;
	}
	private float trackOffset = 0;
	@Override
	public float getTrackOffset() {
		return trackOffset;
	}

	public void setTrackStrength(float trackStrength) {
		this.trackStrength = trackStrength;
	}
	private float trackStrength = 0;
	@Override
	public float getTrackStrength() {
		return trackStrength;
	}

	public void setTrackStretch(float trackStretch) {
		this.trackStretch = trackStretch;
	}
	private float trackStretch = 0;
	@Override
	public float getTrackStretch() {
		return trackStretch;
	}

	public void setTrackType(int trackType) {
		this.trackType = trackType;
	}
	private int trackType = 0;
	@Override
	public int getTrackType() {
		return trackType;
	}

	public void setAbleToDropFlare(boolean isAbleToDropFlare) {
		this.isAbleToDropFlare = isAbleToDropFlare;
	}
	private boolean isAbleToDropFlare = false;
	@Override
	public boolean isAbleToDropFlare() {
		return isAbleToDropFlare;
	}

	public void setFlareReloadTime(float flareReloadTime) {
		this.flareReloadTime = flareReloadTime;
	}
	private float flareReloadTime = 0;
	@Override
	public float getFlareReloadTime() {
		return flareReloadTime;
	}

	public void setFlareEfficiency(float flareEfficiency) {
		this.flareEfficiency = flareEfficiency;
	}
	private float flareEfficiency = 0;
	@Override
	public float getFlareEfficiency() {
		return flareEfficiency;
	}

	public void setFlareDelay(float flareDelay) {
		this.flareDelay = flareDelay;
	}
	private float flareDelay = 0;
	@Override
	public float getFlareDelay() {
		return flareDelay;
	}

	public void setFlareDropVector(AIFloat3 flareDropVector) {
		this.flareDropVector = flareDropVector;
	}
	private AIFloat3 flareDropVector = null;
	@Override
	public AIFloat3 getFlareDropVector() {
		return flareDropVector;
	}

	public void setFlareTime(int flareTime) {
		this.flareTime = flareTime;
	}
	private int flareTime = 0;
	@Override
	public int getFlareTime() {
		return flareTime;
	}

	public void setFlareSalvoSize(int flareSalvoSize) {
		this.flareSalvoSize = flareSalvoSize;
	}
	private int flareSalvoSize = 0;
	@Override
	public int getFlareSalvoSize() {
		return flareSalvoSize;
	}

	public void setFlareSalvoDelay(int flareSalvoDelay) {
		this.flareSalvoDelay = flareSalvoDelay;
	}
	private int flareSalvoDelay = 0;
	@Override
	public int getFlareSalvoDelay() {
		return flareSalvoDelay;
	}

	/**
	 * Only matters for fighter aircraft
	 */
	public void setAbleToLoopbackAttack(boolean isAbleToLoopbackAttack) {
		this.isAbleToLoopbackAttack = isAbleToLoopbackAttack;
	}
	private boolean isAbleToLoopbackAttack = false;
	@Override
	public boolean isAbleToLoopbackAttack() {
		return isAbleToLoopbackAttack;
	}

	/**
	 * Indicates whether the ground will be leveled/flattened out
	 * after this building has been built on it.
	 * Only matters for buildings.
	 */
	public void setLevelGround(boolean isLevelGround) {
		this.isLevelGround = isLevelGround;
	}
	private boolean isLevelGround = false;
	@Override
	public boolean isLevelGround() {
		return isLevelGround;
	}

	public void setUseBuildingGroundDecal(boolean isUseBuildingGroundDecal) {
		this.isUseBuildingGroundDecal = isUseBuildingGroundDecal;
	}
	private boolean isUseBuildingGroundDecal = false;
	@Override
	public boolean isUseBuildingGroundDecal() {
		return isUseBuildingGroundDecal;
	}

	public void setBuildingDecalType(int buildingDecalType) {
		this.buildingDecalType = buildingDecalType;
	}
	private int buildingDecalType = 0;
	@Override
	public int getBuildingDecalType() {
		return buildingDecalType;
	}

	public void setBuildingDecalSizeX(int buildingDecalSizeX) {
		this.buildingDecalSizeX = buildingDecalSizeX;
	}
	private int buildingDecalSizeX = 0;
	@Override
	public int getBuildingDecalSizeX() {
		return buildingDecalSizeX;
	}

	public void setBuildingDecalSizeY(int buildingDecalSizeY) {
		this.buildingDecalSizeY = buildingDecalSizeY;
	}
	private int buildingDecalSizeY = 0;
	@Override
	public int getBuildingDecalSizeY() {
		return buildingDecalSizeY;
	}

	public void setBuildingDecalDecaySpeed(float buildingDecalDecaySpeed) {
		this.buildingDecalDecaySpeed = buildingDecalDecaySpeed;
	}
	private float buildingDecalDecaySpeed = 0;
	@Override
	public float getBuildingDecalDecaySpeed() {
		return buildingDecalDecaySpeed;
	}

	/**
	 * Maximum flight time in seconds before the aircraft needs
	 * to return to an air repair bay to refuel.
	 */
	public void setMaxFuel(float maxFuel) {
		this.maxFuel = maxFuel;
	}
	private float maxFuel = 0;
	@Override
	public float getMaxFuel() {
		return maxFuel;
	}

	/**
	 * Time to fully refuel the unit
	 */
	public void setRefuelTime(float refuelTime) {
		this.refuelTime = refuelTime;
	}
	private float refuelTime = 0;
	@Override
	public float getRefuelTime() {
		return refuelTime;
	}

	/**
	 * Minimum build power of airbases that this aircraft can land on
	 */
	public void setMinAirBasePower(float minAirBasePower) {
		this.minAirBasePower = minAirBasePower;
	}
	private float minAirBasePower = 0;
	@Override
	public float getMinAirBasePower() {
		return minAirBasePower;
	}

	/**
	 * Number of units of this type allowed simultaneously in the game
	 */
	public void setMaxThisUnit(int maxThisUnit) {
		this.maxThisUnit = maxThisUnit;
	}
	private int maxThisUnit = 0;
	@Override
	public int getMaxThisUnit() {
		return maxThisUnit;
	}

	public void setDecoyDef(UnitDef decoyDef) {
		this.decoyDef = decoyDef;
	}
	private UnitDef decoyDef = null;
	@Override
	public UnitDef getDecoyDef() {
		return decoyDef;
	}

	public void setDontLand(boolean isDontLand) {
		this.isDontLand = isDontLand;
	}
	private boolean isDontLand = false;
	@Override
	public boolean isDontLand() {
		return isDontLand;
	}

	public void setShieldDef(WeaponDef shieldDef) {
		this.shieldDef = shieldDef;
	}
	private WeaponDef shieldDef = null;
	@Override
	public WeaponDef getShieldDef() {
		return shieldDef;
	}

	public void setStockpileDef(WeaponDef stockpileDef) {
		this.stockpileDef = stockpileDef;
	}
	private WeaponDef stockpileDef = null;
	@Override
	public WeaponDef getStockpileDef() {
		return stockpileDef;
	}

	public void setBuildOptions(java.util.List<UnitDef> buildOptions) {
		this.buildOptions = buildOptions;
	}
	private java.util.List<UnitDef> buildOptions = null;
	@Override
	public java.util.List<UnitDef> getBuildOptions() {
		return buildOptions;
	}

	public void setCustomParams(java.util.Map<String, String> customParams) {
		this.customParams = customParams;
	}
	private java.util.Map<String, String> customParams = null;
	@Override
	public java.util.Map<String, String> getCustomParams() {
		return customParams;
	}

	public void setWeaponMounts(java.util.List<WeaponMount> weaponMounts) {
		this.weaponMounts = weaponMounts;
	}
	private java.util.List<WeaponMount> weaponMounts = null;
	@Override
	public java.util.List<WeaponMount> getWeaponMounts() {
		return weaponMounts;
	}

	public void setMoveData(MoveData moveData) {
		this.moveData = moveData;
	}
	private MoveData moveData = null;
	@Override
	public MoveData getMoveData() {
		return moveData;
	}

	public void setFlankingBonus(FlankingBonus flankingBonus) {
		this.flankingBonus = flankingBonus;
	}
	private FlankingBonus flankingBonus = null;
	@Override
	public FlankingBonus getFlankingBonus() {
		return flankingBonus;
	}

}


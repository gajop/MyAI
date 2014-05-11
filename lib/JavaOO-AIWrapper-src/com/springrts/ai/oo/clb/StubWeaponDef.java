/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubWeaponDef extends AbstractWeaponDef implements WeaponDef {

	public void setWeaponDefId(int weaponDefId) {
		this.weaponDefId = weaponDefId;
	}
	private int weaponDefId = 0;
	@Override
	public int getWeaponDefId() {
		return weaponDefId;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}
	private String type = "";
	@Override
	public String getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private String description = "";
	@Override
	public String getDescription() {
		return description;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	private String fileName = "";
	@Override
	public String getFileName() {
		return fileName;
	}

	public void setCegTag(String cegTag) {
		this.cegTag = cegTag;
	}
	private String cegTag = "";
	@Override
	public String getCegTag() {
		return cegTag;
	}

	public void setRange(float range) {
		this.range = range;
	}
	private float range = 0;
	@Override
	public float getRange() {
		return range;
	}

	public void setHeightMod(float heightMod) {
		this.heightMod = heightMod;
	}
	private float heightMod = 0;
	@Override
	public float getHeightMod() {
		return heightMod;
	}

	/**
	 * Inaccuracy of whole burst
	 */
	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}
	private float accuracy = 0;
	@Override
	public float getAccuracy() {
		return accuracy;
	}

	/**
	 * Inaccuracy of individual shots inside burst
	 */
	public void setSprayAngle(float sprayAngle) {
		this.sprayAngle = sprayAngle;
	}
	private float sprayAngle = 0;
	@Override
	public float getSprayAngle() {
		return sprayAngle;
	}

	/**
	 * Inaccuracy while owner moving
	 */
	public void setMovingAccuracy(float movingAccuracy) {
		this.movingAccuracy = movingAccuracy;
	}
	private float movingAccuracy = 0;
	@Override
	public float getMovingAccuracy() {
		return movingAccuracy;
	}

	/**
	 * Fraction of targets move speed that is used as error offset
	 */
	public void setTargetMoveError(float targetMoveError) {
		this.targetMoveError = targetMoveError;
	}
	private float targetMoveError = 0;
	@Override
	public float getTargetMoveError() {
		return targetMoveError;
	}

	/**
	 * Maximum distance the weapon will lead the target
	 */
	public void setLeadLimit(float leadLimit) {
		this.leadLimit = leadLimit;
	}
	private float leadLimit = 0;
	@Override
	public float getLeadLimit() {
		return leadLimit;
	}

	/**
	 * Factor for increasing the leadLimit with experience
	 */
	public void setLeadBonus(float leadBonus) {
		this.leadBonus = leadBonus;
	}
	private float leadBonus = 0;
	@Override
	public float getLeadBonus() {
		return leadBonus;
	}

	/**
	 * Replaces hardcoded behaviour for burnblow cannons
	 */
	public void setPredictBoost(float predictBoost) {
		this.predictBoost = predictBoost;
	}
	private float predictBoost = 0;
	@Override
	public float getPredictBoost() {
		return predictBoost;
	}

	public void setNumDamageTypes(int numDamageTypes) {
		this.numDamageTypes = numDamageTypes;
	}
	private int numDamageTypes = 0;
	@Override
	public int getNumDamageTypes() {
		return numDamageTypes;
	}

	public void setAreaOfEffect(float areaOfEffect) {
		this.areaOfEffect = areaOfEffect;
	}
	private float areaOfEffect = 0;
	@Override
	public float getAreaOfEffect() {
		return areaOfEffect;
	}

	public void setNoSelfDamage(boolean isNoSelfDamage) {
		this.isNoSelfDamage = isNoSelfDamage;
	}
	private boolean isNoSelfDamage = false;
	@Override
	public boolean isNoSelfDamage() {
		return isNoSelfDamage;
	}

	public void setFireStarter(float fireStarter) {
		this.fireStarter = fireStarter;
	}
	private float fireStarter = 0;
	@Override
	public float getFireStarter() {
		return fireStarter;
	}

	public void setEdgeEffectiveness(float edgeEffectiveness) {
		this.edgeEffectiveness = edgeEffectiveness;
	}
	private float edgeEffectiveness = 0;
	@Override
	public float getEdgeEffectiveness() {
		return edgeEffectiveness;
	}

	public void setSize(float size) {
		this.size = size;
	}
	private float size = 0;
	@Override
	public float getSize() {
		return size;
	}

	public void setSizeGrowth(float sizeGrowth) {
		this.sizeGrowth = sizeGrowth;
	}
	private float sizeGrowth = 0;
	@Override
	public float getSizeGrowth() {
		return sizeGrowth;
	}

	public void setCollisionSize(float collisionSize) {
		this.collisionSize = collisionSize;
	}
	private float collisionSize = 0;
	@Override
	public float getCollisionSize() {
		return collisionSize;
	}

	public void setSalvoSize(int salvoSize) {
		this.salvoSize = salvoSize;
	}
	private int salvoSize = 0;
	@Override
	public int getSalvoSize() {
		return salvoSize;
	}

	public void setSalvoDelay(float salvoDelay) {
		this.salvoDelay = salvoDelay;
	}
	private float salvoDelay = 0;
	@Override
	public float getSalvoDelay() {
		return salvoDelay;
	}

	public void setReload(float reload) {
		this.reload = reload;
	}
	private float reload = 0;
	@Override
	public float getReload() {
		return reload;
	}

	public void setBeamTime(float beamTime) {
		this.beamTime = beamTime;
	}
	private float beamTime = 0;
	@Override
	public float getBeamTime() {
		return beamTime;
	}

	public void setBeamBurst(boolean isBeamBurst) {
		this.isBeamBurst = isBeamBurst;
	}
	private boolean isBeamBurst = false;
	@Override
	public boolean isBeamBurst() {
		return isBeamBurst;
	}

	public void setWaterBounce(boolean isWaterBounce) {
		this.isWaterBounce = isWaterBounce;
	}
	private boolean isWaterBounce = false;
	@Override
	public boolean isWaterBounce() {
		return isWaterBounce;
	}

	public void setGroundBounce(boolean isGroundBounce) {
		this.isGroundBounce = isGroundBounce;
	}
	private boolean isGroundBounce = false;
	@Override
	public boolean isGroundBounce() {
		return isGroundBounce;
	}

	public void setBounceRebound(float bounceRebound) {
		this.bounceRebound = bounceRebound;
	}
	private float bounceRebound = 0;
	@Override
	public float getBounceRebound() {
		return bounceRebound;
	}

	public void setBounceSlip(float bounceSlip) {
		this.bounceSlip = bounceSlip;
	}
	private float bounceSlip = 0;
	@Override
	public float getBounceSlip() {
		return bounceSlip;
	}

	public void setNumBounce(int numBounce) {
		this.numBounce = numBounce;
	}
	private int numBounce = 0;
	@Override
	public int getNumBounce() {
		return numBounce;
	}

	public void setMaxAngle(float maxAngle) {
		this.maxAngle = maxAngle;
	}
	private float maxAngle = 0;
	@Override
	public float getMaxAngle() {
		return maxAngle;
	}

	public void setUpTime(float upTime) {
		this.upTime = upTime;
	}
	private float upTime = 0;
	@Override
	public float getUpTime() {
		return upTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}
	private int flightTime = 0;
	@Override
	public int getFlightTime() {
		return flightTime;
	}

	@Override
	public float getCost(Resource resource) {
		return 0;
	}

	public void setProjectilesPerShot(int projectilesPerShot) {
		this.projectilesPerShot = projectilesPerShot;
	}
	private int projectilesPerShot = 0;
	@Override
	public int getProjectilesPerShot() {
		return projectilesPerShot;
	}

	public void setTurret(boolean isTurret) {
		this.isTurret = isTurret;
	}
	private boolean isTurret = false;
	@Override
	public boolean isTurret() {
		return isTurret;
	}

	public void setOnlyForward(boolean isOnlyForward) {
		this.isOnlyForward = isOnlyForward;
	}
	private boolean isOnlyForward = false;
	@Override
	public boolean isOnlyForward() {
		return isOnlyForward;
	}

	public void setFixedLauncher(boolean isFixedLauncher) {
		this.isFixedLauncher = isFixedLauncher;
	}
	private boolean isFixedLauncher = false;
	@Override
	public boolean isFixedLauncher() {
		return isFixedLauncher;
	}

	public void setWaterWeapon(boolean isWaterWeapon) {
		this.isWaterWeapon = isWaterWeapon;
	}
	private boolean isWaterWeapon = false;
	@Override
	public boolean isWaterWeapon() {
		return isWaterWeapon;
	}

	public void setFireSubmersed(boolean isFireSubmersed) {
		this.isFireSubmersed = isFireSubmersed;
	}
	private boolean isFireSubmersed = false;
	@Override
	public boolean isFireSubmersed() {
		return isFireSubmersed;
	}

	/**
	 * Lets a torpedo travel above water like it does below water
	 */
	public void setSubMissile(boolean isSubMissile) {
		this.isSubMissile = isSubMissile;
	}
	private boolean isSubMissile = false;
	@Override
	public boolean isSubMissile() {
		return isSubMissile;
	}

	public void setTracks(boolean isTracks) {
		this.isTracks = isTracks;
	}
	private boolean isTracks = false;
	@Override
	public boolean isTracks() {
		return isTracks;
	}

	public void setDropped(boolean isDropped) {
		this.isDropped = isDropped;
	}
	private boolean isDropped = false;
	@Override
	public boolean isDropped() {
		return isDropped;
	}

	/**
	 * The weapon will only paralyze, not do real damage.
	 */
	public void setParalyzer(boolean isParalyzer) {
		this.isParalyzer = isParalyzer;
	}
	private boolean isParalyzer = false;
	@Override
	public boolean isParalyzer() {
		return isParalyzer;
	}

	/**
	 * The weapon damages by impacting, not by exploding.
	 */
	public void setImpactOnly(boolean isImpactOnly) {
		this.isImpactOnly = isImpactOnly;
	}
	private boolean isImpactOnly = false;
	@Override
	public boolean isImpactOnly() {
		return isImpactOnly;
	}

	/**
	 * Can not target anything (for example: anti-nuke, D-Gun)
	 */
	public void setNoAutoTarget(boolean isNoAutoTarget) {
		this.isNoAutoTarget = isNoAutoTarget;
	}
	private boolean isNoAutoTarget = false;
	@Override
	public boolean isNoAutoTarget() {
		return isNoAutoTarget;
	}

	/**
	 * Has to be fired manually (by the player or an AI, example: D-Gun)
	 */
	public void setManualFire(boolean isManualFire) {
		this.isManualFire = isManualFire;
	}
	private boolean isManualFire = false;
	@Override
	public boolean isManualFire() {
		return isManualFire;
	}

	/**
	 * Can intercept targetable weapons shots.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getTargetable()
	 */
	public void setInterceptor(int interceptor) {
		this.interceptor = interceptor;
	}
	private int interceptor = 0;
	@Override
	public int getInterceptor() {
		return interceptor;
	}

	/**
	 * Shoots interceptable projectiles.
	 * Shots can be intercepted by interceptors.
	 * 
	 * example: nuke
	 * 
	 * @see  getInterceptor()
	 */
	public void setTargetable(int targetable) {
		this.targetable = targetable;
	}
	private int targetable = 0;
	@Override
	public int getTargetable() {
		return targetable;
	}

	public void setStockpileable(boolean isStockpileable) {
		this.isStockpileable = isStockpileable;
	}
	private boolean isStockpileable = false;
	@Override
	public boolean isStockpileable() {
		return isStockpileable;
	}

	/**
	 * Range of interceptors.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getInterceptor()
	 */
	public void setCoverageRange(float coverageRange) {
		this.coverageRange = coverageRange;
	}
	private float coverageRange = 0;
	@Override
	public float getCoverageRange() {
		return coverageRange;
	}

	/**
	 * Build time of a missile
	 */
	public void setStockpileTime(float stockpileTime) {
		this.stockpileTime = stockpileTime;
	}
	private float stockpileTime = 0;
	@Override
	public float getStockpileTime() {
		return stockpileTime;
	}

	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}
	private float intensity = 0;
	@Override
	public float getIntensity() {
		return intensity;
	}

	/**
	 * @deprecated only relevant for visualization
	 */
	public void setThickness(float thickness) {
		this.thickness = thickness;
	}
	private float thickness = 0;
	/** @deprecated */
	@Override
	public float getThickness() {
		return thickness;
	}

	/**
	 * @deprecated only relevant for visualization
	 */
	public void setLaserFlareSize(float laserFlareSize) {
		this.laserFlareSize = laserFlareSize;
	}
	private float laserFlareSize = 0;
	/** @deprecated */
	@Override
	public float getLaserFlareSize() {
		return laserFlareSize;
	}

	/**
	 * @deprecated only relevant for visualization
	 */
	public void setCoreThickness(float coreThickness) {
		this.coreThickness = coreThickness;
	}
	private float coreThickness = 0;
	/** @deprecated */
	@Override
	public float getCoreThickness() {
		return coreThickness;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	private float duration = 0;
	@Override
	public float getDuration() {
		return duration;
	}

	/**
	 * @deprecated only relevant for visualization
	 */
	public void setLodDistance(int lodDistance) {
		this.lodDistance = lodDistance;
	}
	private int lodDistance = 0;
	/** @deprecated */
	@Override
	public int getLodDistance() {
		return lodDistance;
	}

	public void setFalloffRate(float falloffRate) {
		this.falloffRate = falloffRate;
	}
	private float falloffRate = 0;
	@Override
	public float getFalloffRate() {
		return falloffRate;
	}

	/**
	 * @deprecated only relevant for visualization
	 */
	public void setGraphicsType(int graphicsType) {
		this.graphicsType = graphicsType;
	}
	private int graphicsType = 0;
	/** @deprecated */
	@Override
	public int getGraphicsType() {
		return graphicsType;
	}

	public void setSoundTrigger(boolean isSoundTrigger) {
		this.isSoundTrigger = isSoundTrigger;
	}
	private boolean isSoundTrigger = false;
	@Override
	public boolean isSoundTrigger() {
		return isSoundTrigger;
	}

	public void setSelfExplode(boolean isSelfExplode) {
		this.isSelfExplode = isSelfExplode;
	}
	private boolean isSelfExplode = false;
	@Override
	public boolean isSelfExplode() {
		return isSelfExplode;
	}

	public void setGravityAffected(boolean isGravityAffected) {
		this.isGravityAffected = isGravityAffected;
	}
	private boolean isGravityAffected = false;
	@Override
	public boolean isGravityAffected() {
		return isGravityAffected;
	}

	/**
	 * Per weapon high trajectory setting.
	 * UnitDef also has this property.
	 * 
	 * @return  0: low
	 *          1: high
	 *          2: unit
	 */
	public void setHighTrajectory(int highTrajectory) {
		this.highTrajectory = highTrajectory;
	}
	private int highTrajectory = 0;
	@Override
	public int getHighTrajectory() {
		return highTrajectory;
	}

	public void setMyGravity(float myGravity) {
		this.myGravity = myGravity;
	}
	private float myGravity = 0;
	@Override
	public float getMyGravity() {
		return myGravity;
	}

	public void setNoExplode(boolean isNoExplode) {
		this.isNoExplode = isNoExplode;
	}
	private boolean isNoExplode = false;
	@Override
	public boolean isNoExplode() {
		return isNoExplode;
	}

	public void setStartVelocity(float startVelocity) {
		this.startVelocity = startVelocity;
	}
	private float startVelocity = 0;
	@Override
	public float getStartVelocity() {
		return startVelocity;
	}

	public void setWeaponAcceleration(float weaponAcceleration) {
		this.weaponAcceleration = weaponAcceleration;
	}
	private float weaponAcceleration = 0;
	@Override
	public float getWeaponAcceleration() {
		return weaponAcceleration;
	}

	public void setTurnRate(float turnRate) {
		this.turnRate = turnRate;
	}
	private float turnRate = 0;
	@Override
	public float getTurnRate() {
		return turnRate;
	}

	public void setMaxVelocity(float maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	private float maxVelocity = 0;
	@Override
	public float getMaxVelocity() {
		return maxVelocity;
	}

	public void setProjectileSpeed(float projectileSpeed) {
		this.projectileSpeed = projectileSpeed;
	}
	private float projectileSpeed = 0;
	@Override
	public float getProjectileSpeed() {
		return projectileSpeed;
	}

	public void setExplosionSpeed(float explosionSpeed) {
		this.explosionSpeed = explosionSpeed;
	}
	private float explosionSpeed = 0;
	@Override
	public float getExplosionSpeed() {
		return explosionSpeed;
	}

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setOnlyTargetCategory(int onlyTargetCategory) {
		this.onlyTargetCategory = onlyTargetCategory;
	}
	private int onlyTargetCategory = 0;
	@Override
	public int getOnlyTargetCategory() {
		return onlyTargetCategory;
	}

	/**
	 * How much the missile will wobble around its course.
	 */
	public void setWobble(float wobble) {
		this.wobble = wobble;
	}
	private float wobble = 0;
	@Override
	public float getWobble() {
		return wobble;
	}

	/**
	 * How much the missile will dance.
	 */
	public void setDance(float dance) {
		this.dance = dance;
	}
	private float dance = 0;
	@Override
	public float getDance() {
		return dance;
	}

	/**
	 * How high trajectory missiles will try to fly in.
	 */
	public void setTrajectoryHeight(float trajectoryHeight) {
		this.trajectoryHeight = trajectoryHeight;
	}
	private float trajectoryHeight = 0;
	@Override
	public float getTrajectoryHeight() {
		return trajectoryHeight;
	}

	public void setLargeBeamLaser(boolean isLargeBeamLaser) {
		this.isLargeBeamLaser = isLargeBeamLaser;
	}
	private boolean isLargeBeamLaser = false;
	@Override
	public boolean isLargeBeamLaser() {
		return isLargeBeamLaser;
	}

	/**
	 * If the weapon is a shield rather than a weapon.
	 */
	public void setShield(boolean isShield) {
		this.isShield = isShield;
	}
	private boolean isShield = false;
	@Override
	public boolean isShield() {
		return isShield;
	}

	/**
	 * If the weapon should be repulsed or absorbed.
	 */
	public void setShieldRepulser(boolean isShieldRepulser) {
		this.isShieldRepulser = isShieldRepulser;
	}
	private boolean isShieldRepulser = false;
	@Override
	public boolean isShieldRepulser() {
		return isShieldRepulser;
	}

	/**
	 * If the shield only affects enemy projectiles.
	 */
	public void setSmartShield(boolean isSmartShield) {
		this.isSmartShield = isSmartShield;
	}
	private boolean isSmartShield = false;
	@Override
	public boolean isSmartShield() {
		return isSmartShield;
	}

	/**
	 * If the shield only affects stuff coming from outside shield radius.
	 */
	public void setExteriorShield(boolean isExteriorShield) {
		this.isExteriorShield = isExteriorShield;
	}
	private boolean isExteriorShield = false;
	@Override
	public boolean isExteriorShield() {
		return isExteriorShield;
	}

	/**
	 * If the shield should be graphically shown.
	 */
	public void setVisibleShield(boolean isVisibleShield) {
		this.isVisibleShield = isVisibleShield;
	}
	private boolean isVisibleShield = false;
	@Override
	public boolean isVisibleShield() {
		return isVisibleShield;
	}

	/**
	 * If a small graphic should be shown at each repulse.
	 */
	public void setVisibleShieldRepulse(boolean isVisibleShieldRepulse) {
		this.isVisibleShieldRepulse = isVisibleShieldRepulse;
	}
	private boolean isVisibleShieldRepulse = false;
	@Override
	public boolean isVisibleShieldRepulse() {
		return isVisibleShieldRepulse;
	}

	/**
	 * The number of frames to draw the shield after it has been hit.
	 */
	public void setVisibleShieldHitFrames(int visibleShieldHitFrames) {
		this.visibleShieldHitFrames = visibleShieldHitFrames;
	}
	private int visibleShieldHitFrames = 0;
	@Override
	public int getVisibleShieldHitFrames() {
		return visibleShieldHitFrames;
	}

	/**
	 * The type of shields that can intercept this weapon (bitfield).
	 * The weapon can be affected by shields if:
	 * (shield.getInterceptType() & weapon.getInterceptedByShieldType()) != 0
	 * 
	 * @see  getInterceptType()
	 */
	public void setInterceptedByShieldType(int interceptedByShieldType) {
		this.interceptedByShieldType = interceptedByShieldType;
	}
	private int interceptedByShieldType = 0;
	@Override
	public int getInterceptedByShieldType() {
		return interceptedByShieldType;
	}

	/**
	 * Tries to avoid friendly units while aiming?
	 */
	public void setAvoidFriendly(boolean isAvoidFriendly) {
		this.isAvoidFriendly = isAvoidFriendly;
	}
	private boolean isAvoidFriendly = false;
	@Override
	public boolean isAvoidFriendly() {
		return isAvoidFriendly;
	}

	/**
	 * Tries to avoid features while aiming?
	 */
	public void setAvoidFeature(boolean isAvoidFeature) {
		this.isAvoidFeature = isAvoidFeature;
	}
	private boolean isAvoidFeature = false;
	@Override
	public boolean isAvoidFeature() {
		return isAvoidFeature;
	}

	/**
	 * Tries to avoid neutral units while aiming?
	 */
	public void setAvoidNeutral(boolean isAvoidNeutral) {
		this.isAvoidNeutral = isAvoidNeutral;
	}
	private boolean isAvoidNeutral = false;
	@Override
	public boolean isAvoidNeutral() {
		return isAvoidNeutral;
	}

	/**
	 * If nonzero, targetting units will TryTarget at the edge of collision sphere
	 * (radius*tag value, [-1;1]) instead of its centre.
	 */
	public void setTargetBorder(float targetBorder) {
		this.targetBorder = targetBorder;
	}
	private float targetBorder = 0;
	@Override
	public float getTargetBorder() {
		return targetBorder;
	}

	/**
	 * If greater than 0, the range will be checked in a cylinder
	 * (height=range*cylinderTargetting) instead of a sphere.
	 */
	public void setCylinderTargetting(float cylinderTargetting) {
		this.cylinderTargetting = cylinderTargetting;
	}
	private float cylinderTargetting = 0;
	@Override
	public float getCylinderTargetting() {
		return cylinderTargetting;
	}

	/**
	 * For beam-lasers only - always hit with some minimum intensity
	 * (a damage coeffcient normally dependent on distance).
	 * Do not confuse this with the intensity tag, it i completely unrelated.
	 */
	public void setMinIntensity(float minIntensity) {
		this.minIntensity = minIntensity;
	}
	private float minIntensity = 0;
	@Override
	public float getMinIntensity() {
		return minIntensity;
	}

	/**
	 * Controls cannon range height boost.
	 * 
	 * default: -1: automatically calculate a more or less sane value
	 */
	public void setHeightBoostFactor(float heightBoostFactor) {
		this.heightBoostFactor = heightBoostFactor;
	}
	private float heightBoostFactor = 0;
	@Override
	public float getHeightBoostFactor() {
		return heightBoostFactor;
	}

	/**
	 * Multiplier for the distance to the target for priority calculations.
	 */
	public void setProximityPriority(float proximityPriority) {
		this.proximityPriority = proximityPriority;
	}
	private float proximityPriority = 0;
	@Override
	public float getProximityPriority() {
		return proximityPriority;
	}

	public void setCollisionFlags(int collisionFlags) {
		this.collisionFlags = collisionFlags;
	}
	private int collisionFlags = 0;
	@Override
	public int getCollisionFlags() {
		return collisionFlags;
	}

	public void setSweepFire(boolean isSweepFire) {
		this.isSweepFire = isSweepFire;
	}
	private boolean isSweepFire = false;
	@Override
	public boolean isSweepFire() {
		return isSweepFire;
	}

	public void setAbleToAttackGround(boolean isAbleToAttackGround) {
		this.isAbleToAttackGround = isAbleToAttackGround;
	}
	private boolean isAbleToAttackGround = false;
	@Override
	public boolean isAbleToAttackGround() {
		return isAbleToAttackGround;
	}

	public void setCameraShake(float cameraShake) {
		this.cameraShake = cameraShake;
	}
	private float cameraShake = 0;
	@Override
	public float getCameraShake() {
		return cameraShake;
	}

	public void setDynDamageExp(float dynDamageExp) {
		this.dynDamageExp = dynDamageExp;
	}
	private float dynDamageExp = 0;
	@Override
	public float getDynDamageExp() {
		return dynDamageExp;
	}

	public void setDynDamageMin(float dynDamageMin) {
		this.dynDamageMin = dynDamageMin;
	}
	private float dynDamageMin = 0;
	@Override
	public float getDynDamageMin() {
		return dynDamageMin;
	}

	public void setDynDamageRange(float dynDamageRange) {
		this.dynDamageRange = dynDamageRange;
	}
	private float dynDamageRange = 0;
	@Override
	public float getDynDamageRange() {
		return dynDamageRange;
	}

	public void setDynDamageInverted(boolean isDynDamageInverted) {
		this.isDynDamageInverted = isDynDamageInverted;
	}
	private boolean isDynDamageInverted = false;
	@Override
	public boolean isDynDamageInverted() {
		return isDynDamageInverted;
	}

	public void setCustomParams(java.util.Map<String, String> customParams) {
		this.customParams = customParams;
	}
	private java.util.Map<String, String> customParams = null;
	@Override
	public java.util.Map<String, String> getCustomParams() {
		return customParams;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}
	private Damage damage = null;
	@Override
	public Damage getDamage() {
		return damage;
	}

	public void setShield(Shield shield) {
		this.shield = shield;
	}
	private Shield shield = null;
	@Override
	public Shield getShield() {
		return shield;
	}

}


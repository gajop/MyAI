/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface WeaponDef extends Comparable<WeaponDef> {

	public int getWeaponDefId();

	public String getName();

	public String getType();

	public String getDescription();

	public String getFileName();

	public String getCegTag();

	public float getRange();

	public float getHeightMod();

	/**
	 * Inaccuracy of whole burst
	 */
	public float getAccuracy();

	/**
	 * Inaccuracy of individual shots inside burst
	 */
	public float getSprayAngle();

	/**
	 * Inaccuracy while owner moving
	 */
	public float getMovingAccuracy();

	/**
	 * Fraction of targets move speed that is used as error offset
	 */
	public float getTargetMoveError();

	/**
	 * Maximum distance the weapon will lead the target
	 */
	public float getLeadLimit();

	/**
	 * Factor for increasing the leadLimit with experience
	 */
	public float getLeadBonus();

	/**
	 * Replaces hardcoded behaviour for burnblow cannons
	 */
	public float getPredictBoost();

	public int getNumDamageTypes();

	public float getAreaOfEffect();

	public boolean isNoSelfDamage();

	public float getFireStarter();

	public float getEdgeEffectiveness();

	public float getSize();

	public float getSizeGrowth();

	public float getCollisionSize();

	public int getSalvoSize();

	public float getSalvoDelay();

	public float getReload();

	public float getBeamTime();

	public boolean isBeamBurst();

	public boolean isWaterBounce();

	public boolean isGroundBounce();

	public float getBounceRebound();

	public float getBounceSlip();

	public int getNumBounce();

	public float getMaxAngle();

	public float getUpTime();

	public int getFlightTime();

	public float getCost(Resource resource);

	public int getProjectilesPerShot();

	public boolean isTurret();

	public boolean isOnlyForward();

	public boolean isFixedLauncher();

	public boolean isWaterWeapon();

	public boolean isFireSubmersed();

	/**
	 * Lets a torpedo travel above water like it does below water
	 */
	public boolean isSubMissile();

	public boolean isTracks();

	public boolean isDropped();

	/**
	 * The weapon will only paralyze, not do real damage.
	 */
	public boolean isParalyzer();

	/**
	 * The weapon damages by impacting, not by exploding.
	 */
	public boolean isImpactOnly();

	/**
	 * Can not target anything (for example: anti-nuke, D-Gun)
	 */
	public boolean isNoAutoTarget();

	/**
	 * Has to be fired manually (by the player or an AI, example: D-Gun)
	 */
	public boolean isManualFire();

	/**
	 * Can intercept targetable weapons shots.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getTargetable()
	 */
	public int getInterceptor();

	/**
	 * Shoots interceptable projectiles.
	 * Shots can be intercepted by interceptors.
	 * 
	 * example: nuke
	 * 
	 * @see  getInterceptor()
	 */
	public int getTargetable();

	public boolean isStockpileable();

	/**
	 * Range of interceptors.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getInterceptor()
	 */
	public float getCoverageRange();

	/**
	 * Build time of a missile
	 */
	public float getStockpileTime();

	public float getIntensity();

	/**
	 * @deprecated only relevant for visualization
	 */
	public float getThickness();

	/**
	 * @deprecated only relevant for visualization
	 */
	public float getLaserFlareSize();

	/**
	 * @deprecated only relevant for visualization
	 */
	public float getCoreThickness();

	public float getDuration();

	/**
	 * @deprecated only relevant for visualization
	 */
	public int getLodDistance();

	public float getFalloffRate();

	/**
	 * @deprecated only relevant for visualization
	 */
	public int getGraphicsType();

	public boolean isSoundTrigger();

	public boolean isSelfExplode();

	public boolean isGravityAffected();

	/**
	 * Per weapon high trajectory setting.
	 * UnitDef also has this property.
	 * 
	 * @return  0: low
	 *          1: high
	 *          2: unit
	 */
	public int getHighTrajectory();

	public float getMyGravity();

	public boolean isNoExplode();

	public float getStartVelocity();

	public float getWeaponAcceleration();

	public float getTurnRate();

	public float getMaxVelocity();

	public float getProjectileSpeed();

	public float getExplosionSpeed();

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int getOnlyTargetCategory();

	/**
	 * How much the missile will wobble around its course.
	 */
	public float getWobble();

	/**
	 * How much the missile will dance.
	 */
	public float getDance();

	/**
	 * How high trajectory missiles will try to fly in.
	 */
	public float getTrajectoryHeight();

	public boolean isLargeBeamLaser();

	/**
	 * If the weapon is a shield rather than a weapon.
	 */
	public boolean isShield();

	/**
	 * If the weapon should be repulsed or absorbed.
	 */
	public boolean isShieldRepulser();

	/**
	 * If the shield only affects enemy projectiles.
	 */
	public boolean isSmartShield();

	/**
	 * If the shield only affects stuff coming from outside shield radius.
	 */
	public boolean isExteriorShield();

	/**
	 * If the shield should be graphically shown.
	 */
	public boolean isVisibleShield();

	/**
	 * If a small graphic should be shown at each repulse.
	 */
	public boolean isVisibleShieldRepulse();

	/**
	 * The number of frames to draw the shield after it has been hit.
	 */
	public int getVisibleShieldHitFrames();

	/**
	 * The type of shields that can intercept this weapon (bitfield).
	 * The weapon can be affected by shields if:
	 * (shield.getInterceptType() & weapon.getInterceptedByShieldType()) != 0
	 * 
	 * @see  getInterceptType()
	 */
	public int getInterceptedByShieldType();

	/**
	 * Tries to avoid friendly units while aiming?
	 */
	public boolean isAvoidFriendly();

	/**
	 * Tries to avoid features while aiming?
	 */
	public boolean isAvoidFeature();

	/**
	 * Tries to avoid neutral units while aiming?
	 */
	public boolean isAvoidNeutral();

	/**
	 * If nonzero, targetting units will TryTarget at the edge of collision sphere
	 * (radius*tag value, [-1;1]) instead of its centre.
	 */
	public float getTargetBorder();

	/**
	 * If greater than 0, the range will be checked in a cylinder
	 * (height=range*cylinderTargetting) instead of a sphere.
	 */
	public float getCylinderTargetting();

	/**
	 * For beam-lasers only - always hit with some minimum intensity
	 * (a damage coeffcient normally dependent on distance).
	 * Do not confuse this with the intensity tag, it i completely unrelated.
	 */
	public float getMinIntensity();

	/**
	 * Controls cannon range height boost.
	 * 
	 * default: -1: automatically calculate a more or less sane value
	 */
	public float getHeightBoostFactor();

	/**
	 * Multiplier for the distance to the target for priority calculations.
	 */
	public float getProximityPriority();

	public int getCollisionFlags();

	public boolean isSweepFire();

	public boolean isAbleToAttackGround();

	public float getCameraShake();

	public float getDynDamageExp();

	public float getDynDamageMin();

	public float getDynDamageRange();

	public boolean isDynDamageInverted();

	public java.util.Map<String, String> getCustomParams();

	public Damage getDamage();

	public Shield getShield();

}


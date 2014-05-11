/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface UnitDef extends Comparable<UnitDef> {

	public int getUnitDefId();

	/**
	 * Forces loading of the unit model
	 */
	public float getHeight();

	/**
	 * Forces loading of the unit model
	 */
	public float getRadius();

	public String getName();

	public String getHumanName();

	public String getFileName();

	/**
	 * @deprecated
	 */
	public int getAiHint();

	public int getCobId();

	public int getTechLevel();

	/**
	 * @deprecated
	 */
	public String getGaia();

	public float getUpkeep(Resource resource);

	/**
	 * This amount of the resource will always be created.
	 */
	public float getResourceMake(Resource resource);

	/**
	 * This amount of the resource will be created when the unit is on and enough
	 * energy can be drained.
	 */
	public float getMakesResource(Resource resource);

	public float getCost(Resource resource);

	public float getExtractsResource(Resource resource);

	public float getResourceExtractorRange(Resource resource);

	public float getWindResourceGenerator(Resource resource);

	public float getTidalResourceGenerator(Resource resource);

	public float getStorage(Resource resource);

	public boolean isSquareResourceExtractor(Resource resource);

	public float getBuildTime();

	/**
	 * This amount of auto-heal will always be applied.
	 */
	public float getAutoHeal();

	/**
	 * This amount of auto-heal will only be applied while the unit is idling.
	 */
	public float getIdleAutoHeal();

	/**
	 * Time a unit needs to idle before it is considered idling.
	 */
	public int getIdleTime();

	public float getPower();

	public float getHealth();

	/**
	 * Returns the bit field value denoting the categories this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int getCategory();

	public float getSpeed();

	public float getTurnRate();

	public boolean isTurnInPlace();

	/**
	 * Units above this distance to goal will try to turn while keeping
	 * some of their speed.
	 * 0 to disable
	 */
	public float getTurnInPlaceDistance();

	/**
	 * Units below this speed will turn in place regardless of their
	 * turnInPlace setting.
	 */
	public float getTurnInPlaceSpeedLimit();

	public boolean isUpright();

	public boolean isCollide();

	public float getLosRadius();

	public float getAirLosRadius();

	public float getLosHeight();

	public int getRadarRadius();

	public int getSonarRadius();

	public int getJammerRadius();

	public int getSonarJamRadius();

	public int getSeismicRadius();

	public float getSeismicSignature();

	public boolean isStealth();

	public boolean isSonarStealth();

	public boolean isBuildRange3D();

	public float getBuildDistance();

	public float getBuildSpeed();

	public float getReclaimSpeed();

	public float getRepairSpeed();

	public float getMaxRepairSpeed();

	public float getResurrectSpeed();

	public float getCaptureSpeed();

	public float getTerraformSpeed();

	public float getMass();

	public boolean isPushResistant();

	/**
	 * Should the unit move sideways when it can not shoot?
	 */
	public boolean isStrafeToAttack();

	public float getMinCollisionSpeed();

	public float getSlideTolerance();

	/**
	 * Build location relevant maximum steepness of the underlaying terrain.
	 * Used to calculate the maxHeightDif.
	 */
	public float getMaxSlope();

	/**
	 * Maximum terra-form height this building allows.
	 * If this value is 0.0, you can only build this structure on
	 * totally flat terrain.
	 */
	public float getMaxHeightDif();

	public float getMinWaterDepth();

	public float getWaterline();

	public float getMaxWaterDepth();

	public float getArmoredMultiple();

	public int getArmorType();

	public float getMaxWeaponRange();

	/**
	 * @deprecated
	 */
	public String getType();

	public String getTooltip();

	public String getWreckName();

	public String getDeathExplosion();

	public String getSelfDExplosion();

	/**
	 * Returns the name of the category this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public String getCategoryString();

	public boolean isAbleToSelfD();

	public int getSelfDCountdown();

	public boolean isAbleToSubmerge();

	public boolean isAbleToFly();

	public boolean isAbleToMove();

	public boolean isAbleToHover();

	public boolean isFloater();

	public boolean isBuilder();

	public boolean isActivateWhenBuilt();

	public boolean isOnOffable();

	public boolean isFullHealthFactory();

	public boolean isFactoryHeadingTakeoff();

	public boolean isReclaimable();

	public boolean isCapturable();

	public boolean isAbleToRestore();

	public boolean isAbleToRepair();

	public boolean isAbleToSelfRepair();

	public boolean isAbleToReclaim();

	public boolean isAbleToAttack();

	public boolean isAbleToPatrol();

	public boolean isAbleToFight();

	public boolean isAbleToGuard();

	public boolean isAbleToAssist();

	public boolean isAssistable();

	public boolean isAbleToRepeat();

	public boolean isAbleToFireControl();

	public int getFireState();

	public int getMoveState();

	public float getWingDrag();

	public float getWingAngle();

	public float getDrag();

	public float getFrontToSpeed();

	public float getSpeedToFront();

	public float getMyGravity();

	public float getMaxBank();

	public float getMaxPitch();

	public float getTurnRadius();

	public float getWantedHeight();

	public float getVerticalSpeed();

	/**
	 * @deprecated
	 */
	public boolean isAbleToCrash();

	/**
	 * @deprecated
	 */
	public boolean isHoverAttack();

	public boolean isAirStrafe();

	/**
	 * @return  < 0:  it can land
	 *          >= 0: how much the unit will move during hovering on the spot
	 */
	public float getDlHoverFactor();

	public float getMaxAcceleration();

	public float getMaxDeceleration();

	public float getMaxAileron();

	public float getMaxElevator();

	public float getMaxRudder();

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
	public java.util.List<Short> getYardMap(int facing);

	public int getXSize();

	public int getZSize();

	/**
	 * @deprecated
	 */
	public int getBuildAngle();

	public float getLoadingRadius();

	public float getUnloadSpread();

	public int getTransportCapacity();

	public int getTransportSize();

	public int getMinTransportSize();

	public boolean isAirBase();

	public boolean isFirePlatform();

	public float getTransportMass();

	public float getMinTransportMass();

	public boolean isHoldSteady();

	public boolean isReleaseHeld();

	public boolean isNotTransportable();

	public boolean isTransportByEnemy();

	/**
	 * @return  0: land unload
	 *          1: fly-over drop
	 *          2: land flood
	 */
	public int getTransportUnloadMethod();

	/**
	 * Dictates fall speed of all transported units.
	 * This only makes sense for air transports,
	 * if they an drop units while in the air.
	 */
	public float getFallSpeed();

	/**
	 * Sets the transported units FBI, overrides fallSpeed
	 */
	public float getUnitFallSpeed();

	/**
	 * If the unit can cloak
	 */
	public boolean isAbleToCloak();

	/**
	 * If the unit wants to start out cloaked
	 */
	public boolean isStartCloaked();

	/**
	 * Energy cost per second to stay cloaked when stationary
	 */
	public float getCloakCost();

	/**
	 * Energy cost per second to stay cloaked when moving
	 */
	public float getCloakCostMoving();

	/**
	 * If enemy unit comes within this range, decloaking is forced
	 */
	public float getDecloakDistance();

	/**
	 * Use a spherical, instead of a cylindrical test?
	 */
	public boolean isDecloakSpherical();

	/**
	 * Will the unit decloak upon firing?
	 */
	public boolean isDecloakOnFire();

	/**
	 * Will the unit self destruct if an enemy comes to close?
	 */
	public boolean isAbleToKamikaze();

	public float getKamikazeDist();

	public boolean isTargetingFacility();

	public boolean canManualFire();

	public boolean isNeedGeo();

	public boolean isFeature();

	public boolean isHideDamage();

	public boolean isCommander();

	public boolean isShowPlayerName();

	public boolean isAbleToResurrect();

	public boolean isAbleToCapture();

	/**
	 * Indicates the trajectory types supported by this unit.
	 * 
	 * @return  0: (default) = only low
	 *          1: only high
	 *          2: choose
	 */
	public int getHighTrajectoryType();

	/**
	 * Returns the bit field value denoting the categories this unit shall not
	 * chase.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int getNoChaseCategory();

	public boolean isLeaveTracks();

	public float getTrackWidth();

	public float getTrackOffset();

	public float getTrackStrength();

	public float getTrackStretch();

	public int getTrackType();

	public boolean isAbleToDropFlare();

	public float getFlareReloadTime();

	public float getFlareEfficiency();

	public float getFlareDelay();

	public AIFloat3 getFlareDropVector();

	public int getFlareTime();

	public int getFlareSalvoSize();

	public int getFlareSalvoDelay();

	/**
	 * Only matters for fighter aircraft
	 */
	public boolean isAbleToLoopbackAttack();

	/**
	 * Indicates whether the ground will be leveled/flattened out
	 * after this building has been built on it.
	 * Only matters for buildings.
	 */
	public boolean isLevelGround();

	public boolean isUseBuildingGroundDecal();

	public int getBuildingDecalType();

	public int getBuildingDecalSizeX();

	public int getBuildingDecalSizeY();

	public float getBuildingDecalDecaySpeed();

	/**
	 * Maximum flight time in seconds before the aircraft needs
	 * to return to an air repair bay to refuel.
	 */
	public float getMaxFuel();

	/**
	 * Time to fully refuel the unit
	 */
	public float getRefuelTime();

	/**
	 * Minimum build power of airbases that this aircraft can land on
	 */
	public float getMinAirBasePower();

	/**
	 * Number of units of this type allowed simultaneously in the game
	 */
	public int getMaxThisUnit();

	public UnitDef getDecoyDef();

	public boolean isDontLand();

	public WeaponDef getShieldDef();

	public WeaponDef getStockpileDef();

	public java.util.List<UnitDef> getBuildOptions();

	public java.util.Map<String, String> getCustomParams();

	public java.util.List<WeaponMount> getWeaponMounts();

	public MoveData getMoveData();

	public FlankingBonus getFlankingBonus();

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Mod extends Comparable<Mod> {

	/**
	 * Returns the mod archive file name.
	 * CAUTION:
	 * Never use this as reference in eg. cache- or config-file names,
	 * as one and the same mod can be packaged in different ways.
	 * Use the human name instead.
	 * @see getHumanName()
	 * @deprecated
	 */
	public String getFileName();

	/**
	 * Returns the archive hash of the mod.
	 * Use this for reference to the mod, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two mods not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getHumanName()
	 */
	public int getHash();

	/**
	 * Returns the human readable name of the mod, which includes the version.
	 * Use this for reference to the mod (including version), eg. in cache- or
	 * config-file names which are mod related, and wherever humans may come
	 * in contact with the reference.
	 * Be aware though, that this may contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Alternatively, you may use the short name only, or the short name plus
	 * version. You should generally never use the file name.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getHash()
	 * @see getShortName()
	 * @see getFileName()
	 * @see getVersion()
	 */
	public String getHumanName();

	/**
	 * Returns the short name of the mod, which does not include the version.
	 * Use this for reference to the mod in general, eg. as version independent
	 * reference.
	 * Be aware though, that this still contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getVersion()
	 * @see getHumanName()
	 */
	public String getShortName();

	public String getVersion();

	public String getMutator();

	public String getDescription();

	public boolean getAllowTeamColors();

	/**
	 * Should constructions without builders decay?
	 */
	public boolean getConstructionDecay();

	/**
	 * How long until they start decaying?
	 */
	public int getConstructionDecayTime();

	/**
	 * How fast do they decay?
	 */
	public float getConstructionDecaySpeed();

	/**
	 * 0 = 1 reclaimer per feature max, otherwise unlimited
	 */
	public int getMultiReclaim();

	/**
	 * 0 = gradual reclaim, 1 = all reclaimed at end, otherwise reclaim in reclaimMethod chunks
	 */
	public int getReclaimMethod();

	/**
	 * 0 = Revert to wireframe, gradual reclaim, 1 = Subtract HP, give full metal at end, default 1
	 */
	public int getReclaimUnitMethod();

	/**
	 * How much energy should reclaiming a unit cost, default 0.0
	 */
	public float getReclaimUnitEnergyCostFactor();

	/**
	 * How much metal should reclaim return, default 1.0
	 */
	public float getReclaimUnitEfficiency();

	/**
	 * How much should energy should reclaiming a feature cost, default 0.0
	 */
	public float getReclaimFeatureEnergyCostFactor();

	/**
	 * Allow reclaiming enemies? default true
	 */
	public boolean getReclaimAllowEnemies();

	/**
	 * Allow reclaiming allies? default true
	 */
	public boolean getReclaimAllowAllies();

	/**
	 * How much should energy should repair cost, default 0.0
	 */
	public float getRepairEnergyCostFactor();

	/**
	 * How much should energy should resurrect cost, default 0.5
	 */
	public float getResurrectEnergyCostFactor();

	/**
	 * How much should energy should capture cost, default 0.0
	 */
	public float getCaptureEnergyCostFactor();

	/**
	 * 0 = all ground units cannot be transported,
	 * 1 = all ground units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 1.
	 */
	public int getTransportGround();

	/**
	 * 0 = all hover units cannot be transported,
	 * 1 = all hover units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int getTransportHover();

	/**
	 * 0 = all naval units cannot be transported,
	 * 1 = all naval units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int getTransportShip();

	/**
	 * 0 = all air units cannot be transported,
	 * 1 = all air units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int getTransportAir();

	/**
	 * 1 = units fire at enemies running Killed() script, 0 = units ignore such enemies
	 */
	public int getFireAtKilled();

	/**
	 * 1 = units fire at crashing aircrafts, 0 = units ignore crashing aircrafts
	 */
	public int getFireAtCrashing();

	/**
	 * 0=no flanking bonus;  1=global coords, mobile;  2=unit coords, mobile;  3=unit coords, locked
	 */
	public int getFlankingBonusModeDefault();

	/**
	 * miplevel for los
	 */
	public int getLosMipLevel();

	/**
	 * miplevel to use for airlos
	 */
	public int getAirMipLevel();

	/**
	 * units sightdistance will be multiplied with this, for testing purposes
	 */
	public float getLosMul();

	/**
	 * units airsightdistance will be multiplied with this, for testing purposes
	 */
	public float getAirLosMul();

	/**
	 * when underwater, units are not in LOS unless also in sonar
	 */
	public boolean getRequireSonarUnderWater();

}


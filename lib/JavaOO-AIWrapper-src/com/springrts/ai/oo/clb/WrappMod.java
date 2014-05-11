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
public class WrappMod extends AbstractMod implements Mod {

	private AICallback innerCallback = null;

	public WrappMod(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Mod getInstance(AICallback innerCallback) {

		Mod _ret = null;
		_ret = new WrappMod(innerCallback);
		return _ret;
	}


	/**
	 * Returns the mod archive file name.
	 * CAUTION:
	 * Never use this as reference in eg. cache- or config-file names,
	 * as one and the same mod can be packaged in different ways.
	 * Use the human name instead.
	 * @see getHumanName()
	 * @deprecated
	 */
	@Override
	public String getFileName() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getFileName();
		return _ret_int;
	}

	/**
	 * Returns the archive hash of the mod.
	 * Use this for reference to the mod, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two mods not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getHumanName()
	 */
	@Override
	public int getHash() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getHash();
		return _ret_int;
	}

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
	@Override
	public String getHumanName() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getHumanName();
		return _ret_int;
	}

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
	@Override
	public String getShortName() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getShortName();
		return _ret_int;
	}

	@Override
	public String getVersion() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getVersion();
		return _ret_int;
	}

	@Override
	public String getMutator() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getMutator();
		return _ret_int;
	}

	@Override
	public String getDescription() {

		String _ret_int;

		_ret_int = innerCallback.Mod_getDescription();
		return _ret_int;
	}

	@Override
	public boolean getAllowTeamColors() {

		boolean _ret_int;

		_ret_int = innerCallback.Mod_getAllowTeamColors();
		return _ret_int;
	}

	/**
	 * Should constructions without builders decay?
	 */
	@Override
	public boolean getConstructionDecay() {

		boolean _ret_int;

		_ret_int = innerCallback.Mod_getConstructionDecay();
		return _ret_int;
	}

	/**
	 * How long until they start decaying?
	 */
	@Override
	public int getConstructionDecayTime() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getConstructionDecayTime();
		return _ret_int;
	}

	/**
	 * How fast do they decay?
	 */
	@Override
	public float getConstructionDecaySpeed() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getConstructionDecaySpeed();
		return _ret_int;
	}

	/**
	 * 0 = 1 reclaimer per feature max, otherwise unlimited
	 */
	@Override
	public int getMultiReclaim() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getMultiReclaim();
		return _ret_int;
	}

	/**
	 * 0 = gradual reclaim, 1 = all reclaimed at end, otherwise reclaim in reclaimMethod chunks
	 */
	@Override
	public int getReclaimMethod() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getReclaimMethod();
		return _ret_int;
	}

	/**
	 * 0 = Revert to wireframe, gradual reclaim, 1 = Subtract HP, give full metal at end, default 1
	 */
	@Override
	public int getReclaimUnitMethod() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getReclaimUnitMethod();
		return _ret_int;
	}

	/**
	 * How much energy should reclaiming a unit cost, default 0.0
	 */
	@Override
	public float getReclaimUnitEnergyCostFactor() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getReclaimUnitEnergyCostFactor();
		return _ret_int;
	}

	/**
	 * How much metal should reclaim return, default 1.0
	 */
	@Override
	public float getReclaimUnitEfficiency() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getReclaimUnitEfficiency();
		return _ret_int;
	}

	/**
	 * How much should energy should reclaiming a feature cost, default 0.0
	 */
	@Override
	public float getReclaimFeatureEnergyCostFactor() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getReclaimFeatureEnergyCostFactor();
		return _ret_int;
	}

	/**
	 * Allow reclaiming enemies? default true
	 */
	@Override
	public boolean getReclaimAllowEnemies() {

		boolean _ret_int;

		_ret_int = innerCallback.Mod_getReclaimAllowEnemies();
		return _ret_int;
	}

	/**
	 * Allow reclaiming allies? default true
	 */
	@Override
	public boolean getReclaimAllowAllies() {

		boolean _ret_int;

		_ret_int = innerCallback.Mod_getReclaimAllowAllies();
		return _ret_int;
	}

	/**
	 * How much should energy should repair cost, default 0.0
	 */
	@Override
	public float getRepairEnergyCostFactor() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getRepairEnergyCostFactor();
		return _ret_int;
	}

	/**
	 * How much should energy should resurrect cost, default 0.5
	 */
	@Override
	public float getResurrectEnergyCostFactor() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getResurrectEnergyCostFactor();
		return _ret_int;
	}

	/**
	 * How much should energy should capture cost, default 0.0
	 */
	@Override
	public float getCaptureEnergyCostFactor() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getCaptureEnergyCostFactor();
		return _ret_int;
	}

	/**
	 * 0 = all ground units cannot be transported,
	 * 1 = all ground units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 1.
	 */
	@Override
	public int getTransportGround() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getTransportGround();
		return _ret_int;
	}

	/**
	 * 0 = all hover units cannot be transported,
	 * 1 = all hover units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	@Override
	public int getTransportHover() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getTransportHover();
		return _ret_int;
	}

	/**
	 * 0 = all naval units cannot be transported,
	 * 1 = all naval units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	@Override
	public int getTransportShip() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getTransportShip();
		return _ret_int;
	}

	/**
	 * 0 = all air units cannot be transported,
	 * 1 = all air units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	@Override
	public int getTransportAir() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getTransportAir();
		return _ret_int;
	}

	/**
	 * 1 = units fire at enemies running Killed() script, 0 = units ignore such enemies
	 */
	@Override
	public int getFireAtKilled() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getFireAtKilled();
		return _ret_int;
	}

	/**
	 * 1 = units fire at crashing aircrafts, 0 = units ignore crashing aircrafts
	 */
	@Override
	public int getFireAtCrashing() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getFireAtCrashing();
		return _ret_int;
	}

	/**
	 * 0=no flanking bonus;  1=global coords, mobile;  2=unit coords, mobile;  3=unit coords, locked
	 */
	@Override
	public int getFlankingBonusModeDefault() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getFlankingBonusModeDefault();
		return _ret_int;
	}

	/**
	 * miplevel for los
	 */
	@Override
	public int getLosMipLevel() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getLosMipLevel();
		return _ret_int;
	}

	/**
	 * miplevel to use for airlos
	 */
	@Override
	public int getAirMipLevel() {

		int _ret_int;

		_ret_int = innerCallback.Mod_getAirMipLevel();
		return _ret_int;
	}

	/**
	 * units sightdistance will be multiplied with this, for testing purposes
	 */
	@Override
	public float getLosMul() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getLosMul();
		return _ret_int;
	}

	/**
	 * units airsightdistance will be multiplied with this, for testing purposes
	 */
	@Override
	public float getAirLosMul() {

		float _ret_int;

		_ret_int = innerCallback.Mod_getAirLosMul();
		return _ret_int;
	}

	/**
	 * when underwater, units are not in LOS unless also in sonar
	 */
	@Override
	public boolean getRequireSonarUnderWater() {

		boolean _ret_int;

		_ret_int = innerCallback.Mod_getRequireSonarUnderWater();
		return _ret_int;
	}
}


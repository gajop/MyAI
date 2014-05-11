/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubMod extends AbstractMod implements Mod {

	/**
	 * Returns the mod archive file name.
	 * CAUTION:
	 * Never use this as reference in eg. cache- or config-file names,
	 * as one and the same mod can be packaged in different ways.
	 * Use the human name instead.
	 * @see getHumanName()
	 * @deprecated
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	private String fileName = "";
	/** @deprecated */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * Returns the archive hash of the mod.
	 * Use this for reference to the mod, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two mods not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getHumanName()
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}
	private int hash = 0;
	@Override
	public int getHash() {
		return hash;
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
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	private String humanName = "";
	@Override
	public String getHumanName() {
		return humanName;
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
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	private String shortName = "";
	@Override
	public String getShortName() {
		return shortName;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	private String version = "";
	@Override
	public String getVersion() {
		return version;
	}

	public void setMutator(String mutator) {
		this.mutator = mutator;
	}
	private String mutator = "";
	@Override
	public String getMutator() {
		return mutator;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private String description = "";
	@Override
	public String getDescription() {
		return description;
	}

	public void setAllowTeamColors(boolean allowTeamColors) {
		this.allowTeamColors = allowTeamColors;
	}
	private boolean allowTeamColors = false;
	@Override
	public boolean getAllowTeamColors() {
		return allowTeamColors;
	}

	/**
	 * Should constructions without builders decay?
	 */
	public void setConstructionDecay(boolean constructionDecay) {
		this.constructionDecay = constructionDecay;
	}
	private boolean constructionDecay = false;
	@Override
	public boolean getConstructionDecay() {
		return constructionDecay;
	}

	/**
	 * How long until they start decaying?
	 */
	public void setConstructionDecayTime(int constructionDecayTime) {
		this.constructionDecayTime = constructionDecayTime;
	}
	private int constructionDecayTime = 0;
	@Override
	public int getConstructionDecayTime() {
		return constructionDecayTime;
	}

	/**
	 * How fast do they decay?
	 */
	public void setConstructionDecaySpeed(float constructionDecaySpeed) {
		this.constructionDecaySpeed = constructionDecaySpeed;
	}
	private float constructionDecaySpeed = 0;
	@Override
	public float getConstructionDecaySpeed() {
		return constructionDecaySpeed;
	}

	/**
	 * 0 = 1 reclaimer per feature max, otherwise unlimited
	 */
	public void setMultiReclaim(int multiReclaim) {
		this.multiReclaim = multiReclaim;
	}
	private int multiReclaim = 0;
	@Override
	public int getMultiReclaim() {
		return multiReclaim;
	}

	/**
	 * 0 = gradual reclaim, 1 = all reclaimed at end, otherwise reclaim in reclaimMethod chunks
	 */
	public void setReclaimMethod(int reclaimMethod) {
		this.reclaimMethod = reclaimMethod;
	}
	private int reclaimMethod = 0;
	@Override
	public int getReclaimMethod() {
		return reclaimMethod;
	}

	/**
	 * 0 = Revert to wireframe, gradual reclaim, 1 = Subtract HP, give full metal at end, default 1
	 */
	public void setReclaimUnitMethod(int reclaimUnitMethod) {
		this.reclaimUnitMethod = reclaimUnitMethod;
	}
	private int reclaimUnitMethod = 0;
	@Override
	public int getReclaimUnitMethod() {
		return reclaimUnitMethod;
	}

	/**
	 * How much energy should reclaiming a unit cost, default 0.0
	 */
	public void setReclaimUnitEnergyCostFactor(float reclaimUnitEnergyCostFactor) {
		this.reclaimUnitEnergyCostFactor = reclaimUnitEnergyCostFactor;
	}
	private float reclaimUnitEnergyCostFactor = 0;
	@Override
	public float getReclaimUnitEnergyCostFactor() {
		return reclaimUnitEnergyCostFactor;
	}

	/**
	 * How much metal should reclaim return, default 1.0
	 */
	public void setReclaimUnitEfficiency(float reclaimUnitEfficiency) {
		this.reclaimUnitEfficiency = reclaimUnitEfficiency;
	}
	private float reclaimUnitEfficiency = 0;
	@Override
	public float getReclaimUnitEfficiency() {
		return reclaimUnitEfficiency;
	}

	/**
	 * How much should energy should reclaiming a feature cost, default 0.0
	 */
	public void setReclaimFeatureEnergyCostFactor(float reclaimFeatureEnergyCostFactor) {
		this.reclaimFeatureEnergyCostFactor = reclaimFeatureEnergyCostFactor;
	}
	private float reclaimFeatureEnergyCostFactor = 0;
	@Override
	public float getReclaimFeatureEnergyCostFactor() {
		return reclaimFeatureEnergyCostFactor;
	}

	/**
	 * Allow reclaiming enemies? default true
	 */
	public void setReclaimAllowEnemies(boolean reclaimAllowEnemies) {
		this.reclaimAllowEnemies = reclaimAllowEnemies;
	}
	private boolean reclaimAllowEnemies = false;
	@Override
	public boolean getReclaimAllowEnemies() {
		return reclaimAllowEnemies;
	}

	/**
	 * Allow reclaiming allies? default true
	 */
	public void setReclaimAllowAllies(boolean reclaimAllowAllies) {
		this.reclaimAllowAllies = reclaimAllowAllies;
	}
	private boolean reclaimAllowAllies = false;
	@Override
	public boolean getReclaimAllowAllies() {
		return reclaimAllowAllies;
	}

	/**
	 * How much should energy should repair cost, default 0.0
	 */
	public void setRepairEnergyCostFactor(float repairEnergyCostFactor) {
		this.repairEnergyCostFactor = repairEnergyCostFactor;
	}
	private float repairEnergyCostFactor = 0;
	@Override
	public float getRepairEnergyCostFactor() {
		return repairEnergyCostFactor;
	}

	/**
	 * How much should energy should resurrect cost, default 0.5
	 */
	public void setResurrectEnergyCostFactor(float resurrectEnergyCostFactor) {
		this.resurrectEnergyCostFactor = resurrectEnergyCostFactor;
	}
	private float resurrectEnergyCostFactor = 0;
	@Override
	public float getResurrectEnergyCostFactor() {
		return resurrectEnergyCostFactor;
	}

	/**
	 * How much should energy should capture cost, default 0.0
	 */
	public void setCaptureEnergyCostFactor(float captureEnergyCostFactor) {
		this.captureEnergyCostFactor = captureEnergyCostFactor;
	}
	private float captureEnergyCostFactor = 0;
	@Override
	public float getCaptureEnergyCostFactor() {
		return captureEnergyCostFactor;
	}

	/**
	 * 0 = all ground units cannot be transported,
	 * 1 = all ground units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 1.
	 */
	public void setTransportGround(int transportGround) {
		this.transportGround = transportGround;
	}
	private int transportGround = 0;
	@Override
	public int getTransportGround() {
		return transportGround;
	}

	/**
	 * 0 = all hover units cannot be transported,
	 * 1 = all hover units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public void setTransportHover(int transportHover) {
		this.transportHover = transportHover;
	}
	private int transportHover = 0;
	@Override
	public int getTransportHover() {
		return transportHover;
	}

	/**
	 * 0 = all naval units cannot be transported,
	 * 1 = all naval units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public void setTransportShip(int transportShip) {
		this.transportShip = transportShip;
	}
	private int transportShip = 0;
	@Override
	public int getTransportShip() {
		return transportShip;
	}

	/**
	 * 0 = all air units cannot be transported,
	 * 1 = all air units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public void setTransportAir(int transportAir) {
		this.transportAir = transportAir;
	}
	private int transportAir = 0;
	@Override
	public int getTransportAir() {
		return transportAir;
	}

	/**
	 * 1 = units fire at enemies running Killed() script, 0 = units ignore such enemies
	 */
	public void setFireAtKilled(int fireAtKilled) {
		this.fireAtKilled = fireAtKilled;
	}
	private int fireAtKilled = 0;
	@Override
	public int getFireAtKilled() {
		return fireAtKilled;
	}

	/**
	 * 1 = units fire at crashing aircrafts, 0 = units ignore crashing aircrafts
	 */
	public void setFireAtCrashing(int fireAtCrashing) {
		this.fireAtCrashing = fireAtCrashing;
	}
	private int fireAtCrashing = 0;
	@Override
	public int getFireAtCrashing() {
		return fireAtCrashing;
	}

	/**
	 * 0=no flanking bonus;  1=global coords, mobile;  2=unit coords, mobile;  3=unit coords, locked
	 */
	public void setFlankingBonusModeDefault(int flankingBonusModeDefault) {
		this.flankingBonusModeDefault = flankingBonusModeDefault;
	}
	private int flankingBonusModeDefault = 0;
	@Override
	public int getFlankingBonusModeDefault() {
		return flankingBonusModeDefault;
	}

	/**
	 * miplevel for los
	 */
	public void setLosMipLevel(int losMipLevel) {
		this.losMipLevel = losMipLevel;
	}
	private int losMipLevel = 0;
	@Override
	public int getLosMipLevel() {
		return losMipLevel;
	}

	/**
	 * miplevel to use for airlos
	 */
	public void setAirMipLevel(int airMipLevel) {
		this.airMipLevel = airMipLevel;
	}
	private int airMipLevel = 0;
	@Override
	public int getAirMipLevel() {
		return airMipLevel;
	}

	/**
	 * units sightdistance will be multiplied with this, for testing purposes
	 */
	public void setLosMul(float losMul) {
		this.losMul = losMul;
	}
	private float losMul = 0;
	@Override
	public float getLosMul() {
		return losMul;
	}

	/**
	 * units airsightdistance will be multiplied with this, for testing purposes
	 */
	public void setAirLosMul(float airLosMul) {
		this.airLosMul = airLosMul;
	}
	private float airLosMul = 0;
	@Override
	public float getAirLosMul() {
		return airLosMul;
	}

	/**
	 * when underwater, units are not in LOS unless also in sonar
	 */
	public void setRequireSonarUnderWater(boolean requireSonarUnderWater) {
		this.requireSonarUnderWater = requireSonarUnderWater;
	}
	private boolean requireSonarUnderWater = false;
	@Override
	public boolean getRequireSonarUnderWater() {
		return requireSonarUnderWater;
	}

}


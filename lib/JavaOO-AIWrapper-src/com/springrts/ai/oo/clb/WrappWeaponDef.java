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
public class WrappWeaponDef extends AbstractWeaponDef implements WeaponDef {

	private AICallback innerCallback = null;
	private int weaponDefId = -1;

	public WrappWeaponDef(AICallback innerCallback, int weaponDefId) {

		this.innerCallback = innerCallback;
		this.weaponDefId = weaponDefId;
	}

	@Override
	public int getWeaponDefId() {

		return weaponDefId;
	}

	private static java.util.Map<Integer, WeaponDef> _buffer_instances = new java.util.HashMap<Integer, WeaponDef>();

	public static WeaponDef getInstance(AICallback innerCallback, int weaponDefId) {

		if (weaponDefId < 0) {
			return null;
		}

		WeaponDef _ret = null;
		_ret = new WrappWeaponDef(innerCallback, weaponDefId);
		{
			Integer indexHash = _ret.hashCode();
			if (_buffer_instances.containsKey(indexHash)) {
				_ret = _buffer_instances.get(indexHash);
			} else {
				_buffer_instances.put(indexHash, _ret);
			}
		}
		return _ret;
	}


	String _buffer_getName;
	boolean _buffer_isInitialized_getName = false;
	@Override
	public String getName() {

		if (!_buffer_isInitialized_getName) {
		String _ret_int;

			_ret_int = innerCallback.WeaponDef_getName(this.getWeaponDefId());
			_buffer_getName = _ret_int;
			_buffer_isInitialized_getName = true;
		}

		return _buffer_getName;
	}

	String _buffer_getType;
	boolean _buffer_isInitialized_getType = false;
	@Override
	public String getType() {

		if (!_buffer_isInitialized_getType) {
		String _ret_int;

			_ret_int = innerCallback.WeaponDef_getType(this.getWeaponDefId());
			_buffer_getType = _ret_int;
			_buffer_isInitialized_getType = true;
		}

		return _buffer_getType;
	}

	String _buffer_getDescription;
	boolean _buffer_isInitialized_getDescription = false;
	@Override
	public String getDescription() {

		if (!_buffer_isInitialized_getDescription) {
		String _ret_int;

			_ret_int = innerCallback.WeaponDef_getDescription(this.getWeaponDefId());
			_buffer_getDescription = _ret_int;
			_buffer_isInitialized_getDescription = true;
		}

		return _buffer_getDescription;
	}

	String _buffer_getFileName;
	boolean _buffer_isInitialized_getFileName = false;
	@Override
	public String getFileName() {

		if (!_buffer_isInitialized_getFileName) {
		String _ret_int;

			_ret_int = innerCallback.WeaponDef_getFileName(this.getWeaponDefId());
			_buffer_getFileName = _ret_int;
			_buffer_isInitialized_getFileName = true;
		}

		return _buffer_getFileName;
	}

	String _buffer_getCegTag;
	boolean _buffer_isInitialized_getCegTag = false;
	@Override
	public String getCegTag() {

		if (!_buffer_isInitialized_getCegTag) {
		String _ret_int;

			_ret_int = innerCallback.WeaponDef_getCegTag(this.getWeaponDefId());
			_buffer_getCegTag = _ret_int;
			_buffer_isInitialized_getCegTag = true;
		}

		return _buffer_getCegTag;
	}

	float _buffer_getRange;
	boolean _buffer_isInitialized_getRange = false;
	@Override
	public float getRange() {

		if (!_buffer_isInitialized_getRange) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getRange(this.getWeaponDefId());
			_buffer_getRange = _ret_int;
			_buffer_isInitialized_getRange = true;
		}

		return _buffer_getRange;
	}

	float _buffer_getHeightMod;
	boolean _buffer_isInitialized_getHeightMod = false;
	@Override
	public float getHeightMod() {

		if (!_buffer_isInitialized_getHeightMod) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getHeightMod(this.getWeaponDefId());
			_buffer_getHeightMod = _ret_int;
			_buffer_isInitialized_getHeightMod = true;
		}

		return _buffer_getHeightMod;
	}

	float _buffer_getAccuracy;
	boolean _buffer_isInitialized_getAccuracy = false;
	/**
	 * Inaccuracy of whole burst
	 */
	@Override
	public float getAccuracy() {

		if (!_buffer_isInitialized_getAccuracy) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getAccuracy(this.getWeaponDefId());
			_buffer_getAccuracy = _ret_int;
			_buffer_isInitialized_getAccuracy = true;
		}

		return _buffer_getAccuracy;
	}

	float _buffer_getSprayAngle;
	boolean _buffer_isInitialized_getSprayAngle = false;
	/**
	 * Inaccuracy of individual shots inside burst
	 */
	@Override
	public float getSprayAngle() {

		if (!_buffer_isInitialized_getSprayAngle) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getSprayAngle(this.getWeaponDefId());
			_buffer_getSprayAngle = _ret_int;
			_buffer_isInitialized_getSprayAngle = true;
		}

		return _buffer_getSprayAngle;
	}

	float _buffer_getMovingAccuracy;
	boolean _buffer_isInitialized_getMovingAccuracy = false;
	/**
	 * Inaccuracy while owner moving
	 */
	@Override
	public float getMovingAccuracy() {

		if (!_buffer_isInitialized_getMovingAccuracy) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getMovingAccuracy(this.getWeaponDefId());
			_buffer_getMovingAccuracy = _ret_int;
			_buffer_isInitialized_getMovingAccuracy = true;
		}

		return _buffer_getMovingAccuracy;
	}

	float _buffer_getTargetMoveError;
	boolean _buffer_isInitialized_getTargetMoveError = false;
	/**
	 * Fraction of targets move speed that is used as error offset
	 */
	@Override
	public float getTargetMoveError() {

		if (!_buffer_isInitialized_getTargetMoveError) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getTargetMoveError(this.getWeaponDefId());
			_buffer_getTargetMoveError = _ret_int;
			_buffer_isInitialized_getTargetMoveError = true;
		}

		return _buffer_getTargetMoveError;
	}

	float _buffer_getLeadLimit;
	boolean _buffer_isInitialized_getLeadLimit = false;
	/**
	 * Maximum distance the weapon will lead the target
	 */
	@Override
	public float getLeadLimit() {

		if (!_buffer_isInitialized_getLeadLimit) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getLeadLimit(this.getWeaponDefId());
			_buffer_getLeadLimit = _ret_int;
			_buffer_isInitialized_getLeadLimit = true;
		}

		return _buffer_getLeadLimit;
	}

	float _buffer_getLeadBonus;
	boolean _buffer_isInitialized_getLeadBonus = false;
	/**
	 * Factor for increasing the leadLimit with experience
	 */
	@Override
	public float getLeadBonus() {

		if (!_buffer_isInitialized_getLeadBonus) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getLeadBonus(this.getWeaponDefId());
			_buffer_getLeadBonus = _ret_int;
			_buffer_isInitialized_getLeadBonus = true;
		}

		return _buffer_getLeadBonus;
	}

	float _buffer_getPredictBoost;
	boolean _buffer_isInitialized_getPredictBoost = false;
	/**
	 * Replaces hardcoded behaviour for burnblow cannons
	 */
	@Override
	public float getPredictBoost() {

		if (!_buffer_isInitialized_getPredictBoost) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getPredictBoost(this.getWeaponDefId());
			_buffer_getPredictBoost = _ret_int;
			_buffer_isInitialized_getPredictBoost = true;
		}

		return _buffer_getPredictBoost;
	}

	int _buffer_getNumDamageTypes;
	boolean _buffer_isInitialized_getNumDamageTypes = false;
	@Override
	public int getNumDamageTypes() {

		if (!_buffer_isInitialized_getNumDamageTypes) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getNumDamageTypes();
			_buffer_getNumDamageTypes = _ret_int;
			_buffer_isInitialized_getNumDamageTypes = true;
		}

		return _buffer_getNumDamageTypes;
	}

	float _buffer_getAreaOfEffect;
	boolean _buffer_isInitialized_getAreaOfEffect = false;
	@Override
	public float getAreaOfEffect() {

		if (!_buffer_isInitialized_getAreaOfEffect) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getAreaOfEffect(this.getWeaponDefId());
			_buffer_getAreaOfEffect = _ret_int;
			_buffer_isInitialized_getAreaOfEffect = true;
		}

		return _buffer_getAreaOfEffect;
	}

	boolean _buffer_isNoSelfDamage;
	boolean _buffer_isInitialized_isNoSelfDamage = false;
	@Override
	public boolean isNoSelfDamage() {

		if (!_buffer_isInitialized_isNoSelfDamage) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isNoSelfDamage(this.getWeaponDefId());
			_buffer_isNoSelfDamage = _ret_int;
			_buffer_isInitialized_isNoSelfDamage = true;
		}

		return _buffer_isNoSelfDamage;
	}

	float _buffer_getFireStarter;
	boolean _buffer_isInitialized_getFireStarter = false;
	@Override
	public float getFireStarter() {

		if (!_buffer_isInitialized_getFireStarter) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getFireStarter(this.getWeaponDefId());
			_buffer_getFireStarter = _ret_int;
			_buffer_isInitialized_getFireStarter = true;
		}

		return _buffer_getFireStarter;
	}

	float _buffer_getEdgeEffectiveness;
	boolean _buffer_isInitialized_getEdgeEffectiveness = false;
	@Override
	public float getEdgeEffectiveness() {

		if (!_buffer_isInitialized_getEdgeEffectiveness) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getEdgeEffectiveness(this.getWeaponDefId());
			_buffer_getEdgeEffectiveness = _ret_int;
			_buffer_isInitialized_getEdgeEffectiveness = true;
		}

		return _buffer_getEdgeEffectiveness;
	}

	float _buffer_getSize;
	boolean _buffer_isInitialized_getSize = false;
	@Override
	public float getSize() {

		if (!_buffer_isInitialized_getSize) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getSize(this.getWeaponDefId());
			_buffer_getSize = _ret_int;
			_buffer_isInitialized_getSize = true;
		}

		return _buffer_getSize;
	}

	float _buffer_getSizeGrowth;
	boolean _buffer_isInitialized_getSizeGrowth = false;
	@Override
	public float getSizeGrowth() {

		if (!_buffer_isInitialized_getSizeGrowth) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getSizeGrowth(this.getWeaponDefId());
			_buffer_getSizeGrowth = _ret_int;
			_buffer_isInitialized_getSizeGrowth = true;
		}

		return _buffer_getSizeGrowth;
	}

	float _buffer_getCollisionSize;
	boolean _buffer_isInitialized_getCollisionSize = false;
	@Override
	public float getCollisionSize() {

		if (!_buffer_isInitialized_getCollisionSize) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getCollisionSize(this.getWeaponDefId());
			_buffer_getCollisionSize = _ret_int;
			_buffer_isInitialized_getCollisionSize = true;
		}

		return _buffer_getCollisionSize;
	}

	int _buffer_getSalvoSize;
	boolean _buffer_isInitialized_getSalvoSize = false;
	@Override
	public int getSalvoSize() {

		if (!_buffer_isInitialized_getSalvoSize) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getSalvoSize(this.getWeaponDefId());
			_buffer_getSalvoSize = _ret_int;
			_buffer_isInitialized_getSalvoSize = true;
		}

		return _buffer_getSalvoSize;
	}

	float _buffer_getSalvoDelay;
	boolean _buffer_isInitialized_getSalvoDelay = false;
	@Override
	public float getSalvoDelay() {

		if (!_buffer_isInitialized_getSalvoDelay) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getSalvoDelay(this.getWeaponDefId());
			_buffer_getSalvoDelay = _ret_int;
			_buffer_isInitialized_getSalvoDelay = true;
		}

		return _buffer_getSalvoDelay;
	}

	float _buffer_getReload;
	boolean _buffer_isInitialized_getReload = false;
	@Override
	public float getReload() {

		if (!_buffer_isInitialized_getReload) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getReload(this.getWeaponDefId());
			_buffer_getReload = _ret_int;
			_buffer_isInitialized_getReload = true;
		}

		return _buffer_getReload;
	}

	float _buffer_getBeamTime;
	boolean _buffer_isInitialized_getBeamTime = false;
	@Override
	public float getBeamTime() {

		if (!_buffer_isInitialized_getBeamTime) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getBeamTime(this.getWeaponDefId());
			_buffer_getBeamTime = _ret_int;
			_buffer_isInitialized_getBeamTime = true;
		}

		return _buffer_getBeamTime;
	}

	boolean _buffer_isBeamBurst;
	boolean _buffer_isInitialized_isBeamBurst = false;
	@Override
	public boolean isBeamBurst() {

		if (!_buffer_isInitialized_isBeamBurst) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isBeamBurst(this.getWeaponDefId());
			_buffer_isBeamBurst = _ret_int;
			_buffer_isInitialized_isBeamBurst = true;
		}

		return _buffer_isBeamBurst;
	}

	boolean _buffer_isWaterBounce;
	boolean _buffer_isInitialized_isWaterBounce = false;
	@Override
	public boolean isWaterBounce() {

		if (!_buffer_isInitialized_isWaterBounce) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isWaterBounce(this.getWeaponDefId());
			_buffer_isWaterBounce = _ret_int;
			_buffer_isInitialized_isWaterBounce = true;
		}

		return _buffer_isWaterBounce;
	}

	boolean _buffer_isGroundBounce;
	boolean _buffer_isInitialized_isGroundBounce = false;
	@Override
	public boolean isGroundBounce() {

		if (!_buffer_isInitialized_isGroundBounce) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isGroundBounce(this.getWeaponDefId());
			_buffer_isGroundBounce = _ret_int;
			_buffer_isInitialized_isGroundBounce = true;
		}

		return _buffer_isGroundBounce;
	}

	float _buffer_getBounceRebound;
	boolean _buffer_isInitialized_getBounceRebound = false;
	@Override
	public float getBounceRebound() {

		if (!_buffer_isInitialized_getBounceRebound) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getBounceRebound(this.getWeaponDefId());
			_buffer_getBounceRebound = _ret_int;
			_buffer_isInitialized_getBounceRebound = true;
		}

		return _buffer_getBounceRebound;
	}

	float _buffer_getBounceSlip;
	boolean _buffer_isInitialized_getBounceSlip = false;
	@Override
	public float getBounceSlip() {

		if (!_buffer_isInitialized_getBounceSlip) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getBounceSlip(this.getWeaponDefId());
			_buffer_getBounceSlip = _ret_int;
			_buffer_isInitialized_getBounceSlip = true;
		}

		return _buffer_getBounceSlip;
	}

	int _buffer_getNumBounce;
	boolean _buffer_isInitialized_getNumBounce = false;
	@Override
	public int getNumBounce() {

		if (!_buffer_isInitialized_getNumBounce) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getNumBounce(this.getWeaponDefId());
			_buffer_getNumBounce = _ret_int;
			_buffer_isInitialized_getNumBounce = true;
		}

		return _buffer_getNumBounce;
	}

	float _buffer_getMaxAngle;
	boolean _buffer_isInitialized_getMaxAngle = false;
	@Override
	public float getMaxAngle() {

		if (!_buffer_isInitialized_getMaxAngle) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getMaxAngle(this.getWeaponDefId());
			_buffer_getMaxAngle = _ret_int;
			_buffer_isInitialized_getMaxAngle = true;
		}

		return _buffer_getMaxAngle;
	}

	float _buffer_getUpTime;
	boolean _buffer_isInitialized_getUpTime = false;
	@Override
	public float getUpTime() {

		if (!_buffer_isInitialized_getUpTime) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getUpTime(this.getWeaponDefId());
			_buffer_getUpTime = _ret_int;
			_buffer_isInitialized_getUpTime = true;
		}

		return _buffer_getUpTime;
	}

	int _buffer_getFlightTime;
	boolean _buffer_isInitialized_getFlightTime = false;
	@Override
	public int getFlightTime() {

		if (!_buffer_isInitialized_getFlightTime) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getFlightTime(this.getWeaponDefId());
			_buffer_getFlightTime = _ret_int;
			_buffer_isInitialized_getFlightTime = true;
		}

		return _buffer_getFlightTime;
	}

	@Override
	public float getCost(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.WeaponDef_getCost(this.getWeaponDefId(), resourceId);
		return _ret_int;
	}

	int _buffer_getProjectilesPerShot;
	boolean _buffer_isInitialized_getProjectilesPerShot = false;
	@Override
	public int getProjectilesPerShot() {

		if (!_buffer_isInitialized_getProjectilesPerShot) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getProjectilesPerShot(this.getWeaponDefId());
			_buffer_getProjectilesPerShot = _ret_int;
			_buffer_isInitialized_getProjectilesPerShot = true;
		}

		return _buffer_getProjectilesPerShot;
	}

	boolean _buffer_isTurret;
	boolean _buffer_isInitialized_isTurret = false;
	@Override
	public boolean isTurret() {

		if (!_buffer_isInitialized_isTurret) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isTurret(this.getWeaponDefId());
			_buffer_isTurret = _ret_int;
			_buffer_isInitialized_isTurret = true;
		}

		return _buffer_isTurret;
	}

	boolean _buffer_isOnlyForward;
	boolean _buffer_isInitialized_isOnlyForward = false;
	@Override
	public boolean isOnlyForward() {

		if (!_buffer_isInitialized_isOnlyForward) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isOnlyForward(this.getWeaponDefId());
			_buffer_isOnlyForward = _ret_int;
			_buffer_isInitialized_isOnlyForward = true;
		}

		return _buffer_isOnlyForward;
	}

	boolean _buffer_isFixedLauncher;
	boolean _buffer_isInitialized_isFixedLauncher = false;
	@Override
	public boolean isFixedLauncher() {

		if (!_buffer_isInitialized_isFixedLauncher) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isFixedLauncher(this.getWeaponDefId());
			_buffer_isFixedLauncher = _ret_int;
			_buffer_isInitialized_isFixedLauncher = true;
		}

		return _buffer_isFixedLauncher;
	}

	boolean _buffer_isWaterWeapon;
	boolean _buffer_isInitialized_isWaterWeapon = false;
	@Override
	public boolean isWaterWeapon() {

		if (!_buffer_isInitialized_isWaterWeapon) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isWaterWeapon(this.getWeaponDefId());
			_buffer_isWaterWeapon = _ret_int;
			_buffer_isInitialized_isWaterWeapon = true;
		}

		return _buffer_isWaterWeapon;
	}

	boolean _buffer_isFireSubmersed;
	boolean _buffer_isInitialized_isFireSubmersed = false;
	@Override
	public boolean isFireSubmersed() {

		if (!_buffer_isInitialized_isFireSubmersed) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isFireSubmersed(this.getWeaponDefId());
			_buffer_isFireSubmersed = _ret_int;
			_buffer_isInitialized_isFireSubmersed = true;
		}

		return _buffer_isFireSubmersed;
	}

	boolean _buffer_isSubMissile;
	boolean _buffer_isInitialized_isSubMissile = false;
	/**
	 * Lets a torpedo travel above water like it does below water
	 */
	@Override
	public boolean isSubMissile() {

		if (!_buffer_isInitialized_isSubMissile) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isSubMissile(this.getWeaponDefId());
			_buffer_isSubMissile = _ret_int;
			_buffer_isInitialized_isSubMissile = true;
		}

		return _buffer_isSubMissile;
	}

	boolean _buffer_isTracks;
	boolean _buffer_isInitialized_isTracks = false;
	@Override
	public boolean isTracks() {

		if (!_buffer_isInitialized_isTracks) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isTracks(this.getWeaponDefId());
			_buffer_isTracks = _ret_int;
			_buffer_isInitialized_isTracks = true;
		}

		return _buffer_isTracks;
	}

	boolean _buffer_isDropped;
	boolean _buffer_isInitialized_isDropped = false;
	@Override
	public boolean isDropped() {

		if (!_buffer_isInitialized_isDropped) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isDropped(this.getWeaponDefId());
			_buffer_isDropped = _ret_int;
			_buffer_isInitialized_isDropped = true;
		}

		return _buffer_isDropped;
	}

	boolean _buffer_isParalyzer;
	boolean _buffer_isInitialized_isParalyzer = false;
	/**
	 * The weapon will only paralyze, not do real damage.
	 */
	@Override
	public boolean isParalyzer() {

		if (!_buffer_isInitialized_isParalyzer) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isParalyzer(this.getWeaponDefId());
			_buffer_isParalyzer = _ret_int;
			_buffer_isInitialized_isParalyzer = true;
		}

		return _buffer_isParalyzer;
	}

	boolean _buffer_isImpactOnly;
	boolean _buffer_isInitialized_isImpactOnly = false;
	/**
	 * The weapon damages by impacting, not by exploding.
	 */
	@Override
	public boolean isImpactOnly() {

		if (!_buffer_isInitialized_isImpactOnly) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isImpactOnly(this.getWeaponDefId());
			_buffer_isImpactOnly = _ret_int;
			_buffer_isInitialized_isImpactOnly = true;
		}

		return _buffer_isImpactOnly;
	}

	boolean _buffer_isNoAutoTarget;
	boolean _buffer_isInitialized_isNoAutoTarget = false;
	/**
	 * Can not target anything (for example: anti-nuke, D-Gun)
	 */
	@Override
	public boolean isNoAutoTarget() {

		if (!_buffer_isInitialized_isNoAutoTarget) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isNoAutoTarget(this.getWeaponDefId());
			_buffer_isNoAutoTarget = _ret_int;
			_buffer_isInitialized_isNoAutoTarget = true;
		}

		return _buffer_isNoAutoTarget;
	}

	boolean _buffer_isManualFire;
	boolean _buffer_isInitialized_isManualFire = false;
	/**
	 * Has to be fired manually (by the player or an AI, example: D-Gun)
	 */
	@Override
	public boolean isManualFire() {

		if (!_buffer_isInitialized_isManualFire) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isManualFire(this.getWeaponDefId());
			_buffer_isManualFire = _ret_int;
			_buffer_isInitialized_isManualFire = true;
		}

		return _buffer_isManualFire;
	}

	int _buffer_getInterceptor;
	boolean _buffer_isInitialized_getInterceptor = false;
	/**
	 * Can intercept targetable weapons shots.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getTargetable()
	 */
	@Override
	public int getInterceptor() {

		if (!_buffer_isInitialized_getInterceptor) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getInterceptor(this.getWeaponDefId());
			_buffer_getInterceptor = _ret_int;
			_buffer_isInitialized_getInterceptor = true;
		}

		return _buffer_getInterceptor;
	}

	int _buffer_getTargetable;
	boolean _buffer_isInitialized_getTargetable = false;
	/**
	 * Shoots interceptable projectiles.
	 * Shots can be intercepted by interceptors.
	 * 
	 * example: nuke
	 * 
	 * @see  getInterceptor()
	 */
	@Override
	public int getTargetable() {

		if (!_buffer_isInitialized_getTargetable) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getTargetable(this.getWeaponDefId());
			_buffer_getTargetable = _ret_int;
			_buffer_isInitialized_getTargetable = true;
		}

		return _buffer_getTargetable;
	}

	boolean _buffer_isStockpileable;
	boolean _buffer_isInitialized_isStockpileable = false;
	@Override
	public boolean isStockpileable() {

		if (!_buffer_isInitialized_isStockpileable) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isStockpileable(this.getWeaponDefId());
			_buffer_isStockpileable = _ret_int;
			_buffer_isInitialized_isStockpileable = true;
		}

		return _buffer_isStockpileable;
	}

	float _buffer_getCoverageRange;
	boolean _buffer_isInitialized_getCoverageRange = false;
	/**
	 * Range of interceptors.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getInterceptor()
	 */
	@Override
	public float getCoverageRange() {

		if (!_buffer_isInitialized_getCoverageRange) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getCoverageRange(this.getWeaponDefId());
			_buffer_getCoverageRange = _ret_int;
			_buffer_isInitialized_getCoverageRange = true;
		}

		return _buffer_getCoverageRange;
	}

	float _buffer_getStockpileTime;
	boolean _buffer_isInitialized_getStockpileTime = false;
	/**
	 * Build time of a missile
	 */
	@Override
	public float getStockpileTime() {

		if (!_buffer_isInitialized_getStockpileTime) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getStockpileTime(this.getWeaponDefId());
			_buffer_getStockpileTime = _ret_int;
			_buffer_isInitialized_getStockpileTime = true;
		}

		return _buffer_getStockpileTime;
	}

	float _buffer_getIntensity;
	boolean _buffer_isInitialized_getIntensity = false;
	@Override
	public float getIntensity() {

		if (!_buffer_isInitialized_getIntensity) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getIntensity(this.getWeaponDefId());
			_buffer_getIntensity = _ret_int;
			_buffer_isInitialized_getIntensity = true;
		}

		return _buffer_getIntensity;
	}

	float _buffer_getThickness;
	boolean _buffer_isInitialized_getThickness = false;
	/**
	 * @deprecated only relevant for visualization
	 */
	@Override
	public float getThickness() {

		if (!_buffer_isInitialized_getThickness) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getThickness(this.getWeaponDefId());
			_buffer_getThickness = _ret_int;
			_buffer_isInitialized_getThickness = true;
		}

		return _buffer_getThickness;
	}

	float _buffer_getLaserFlareSize;
	boolean _buffer_isInitialized_getLaserFlareSize = false;
	/**
	 * @deprecated only relevant for visualization
	 */
	@Override
	public float getLaserFlareSize() {

		if (!_buffer_isInitialized_getLaserFlareSize) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getLaserFlareSize(this.getWeaponDefId());
			_buffer_getLaserFlareSize = _ret_int;
			_buffer_isInitialized_getLaserFlareSize = true;
		}

		return _buffer_getLaserFlareSize;
	}

	float _buffer_getCoreThickness;
	boolean _buffer_isInitialized_getCoreThickness = false;
	/**
	 * @deprecated only relevant for visualization
	 */
	@Override
	public float getCoreThickness() {

		if (!_buffer_isInitialized_getCoreThickness) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getCoreThickness(this.getWeaponDefId());
			_buffer_getCoreThickness = _ret_int;
			_buffer_isInitialized_getCoreThickness = true;
		}

		return _buffer_getCoreThickness;
	}

	float _buffer_getDuration;
	boolean _buffer_isInitialized_getDuration = false;
	@Override
	public float getDuration() {

		if (!_buffer_isInitialized_getDuration) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getDuration(this.getWeaponDefId());
			_buffer_getDuration = _ret_int;
			_buffer_isInitialized_getDuration = true;
		}

		return _buffer_getDuration;
	}

	int _buffer_getLodDistance;
	boolean _buffer_isInitialized_getLodDistance = false;
	/**
	 * @deprecated only relevant for visualization
	 */
	@Override
	public int getLodDistance() {

		if (!_buffer_isInitialized_getLodDistance) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getLodDistance(this.getWeaponDefId());
			_buffer_getLodDistance = _ret_int;
			_buffer_isInitialized_getLodDistance = true;
		}

		return _buffer_getLodDistance;
	}

	float _buffer_getFalloffRate;
	boolean _buffer_isInitialized_getFalloffRate = false;
	@Override
	public float getFalloffRate() {

		if (!_buffer_isInitialized_getFalloffRate) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getFalloffRate(this.getWeaponDefId());
			_buffer_getFalloffRate = _ret_int;
			_buffer_isInitialized_getFalloffRate = true;
		}

		return _buffer_getFalloffRate;
	}

	int _buffer_getGraphicsType;
	boolean _buffer_isInitialized_getGraphicsType = false;
	/**
	 * @deprecated only relevant for visualization
	 */
	@Override
	public int getGraphicsType() {

		if (!_buffer_isInitialized_getGraphicsType) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getGraphicsType(this.getWeaponDefId());
			_buffer_getGraphicsType = _ret_int;
			_buffer_isInitialized_getGraphicsType = true;
		}

		return _buffer_getGraphicsType;
	}

	boolean _buffer_isSoundTrigger;
	boolean _buffer_isInitialized_isSoundTrigger = false;
	@Override
	public boolean isSoundTrigger() {

		if (!_buffer_isInitialized_isSoundTrigger) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isSoundTrigger(this.getWeaponDefId());
			_buffer_isSoundTrigger = _ret_int;
			_buffer_isInitialized_isSoundTrigger = true;
		}

		return _buffer_isSoundTrigger;
	}

	boolean _buffer_isSelfExplode;
	boolean _buffer_isInitialized_isSelfExplode = false;
	@Override
	public boolean isSelfExplode() {

		if (!_buffer_isInitialized_isSelfExplode) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isSelfExplode(this.getWeaponDefId());
			_buffer_isSelfExplode = _ret_int;
			_buffer_isInitialized_isSelfExplode = true;
		}

		return _buffer_isSelfExplode;
	}

	boolean _buffer_isGravityAffected;
	boolean _buffer_isInitialized_isGravityAffected = false;
	@Override
	public boolean isGravityAffected() {

		if (!_buffer_isInitialized_isGravityAffected) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isGravityAffected(this.getWeaponDefId());
			_buffer_isGravityAffected = _ret_int;
			_buffer_isInitialized_isGravityAffected = true;
		}

		return _buffer_isGravityAffected;
	}

	int _buffer_getHighTrajectory;
	boolean _buffer_isInitialized_getHighTrajectory = false;
	/**
	 * Per weapon high trajectory setting.
	 * UnitDef also has this property.
	 * 
	 * @return  0: low
	 *          1: high
	 *          2: unit
	 */
	@Override
	public int getHighTrajectory() {

		if (!_buffer_isInitialized_getHighTrajectory) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getHighTrajectory(this.getWeaponDefId());
			_buffer_getHighTrajectory = _ret_int;
			_buffer_isInitialized_getHighTrajectory = true;
		}

		return _buffer_getHighTrajectory;
	}

	float _buffer_getMyGravity;
	boolean _buffer_isInitialized_getMyGravity = false;
	@Override
	public float getMyGravity() {

		if (!_buffer_isInitialized_getMyGravity) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getMyGravity(this.getWeaponDefId());
			_buffer_getMyGravity = _ret_int;
			_buffer_isInitialized_getMyGravity = true;
		}

		return _buffer_getMyGravity;
	}

	boolean _buffer_isNoExplode;
	boolean _buffer_isInitialized_isNoExplode = false;
	@Override
	public boolean isNoExplode() {

		if (!_buffer_isInitialized_isNoExplode) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isNoExplode(this.getWeaponDefId());
			_buffer_isNoExplode = _ret_int;
			_buffer_isInitialized_isNoExplode = true;
		}

		return _buffer_isNoExplode;
	}

	float _buffer_getStartVelocity;
	boolean _buffer_isInitialized_getStartVelocity = false;
	@Override
	public float getStartVelocity() {

		if (!_buffer_isInitialized_getStartVelocity) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getStartVelocity(this.getWeaponDefId());
			_buffer_getStartVelocity = _ret_int;
			_buffer_isInitialized_getStartVelocity = true;
		}

		return _buffer_getStartVelocity;
	}

	float _buffer_getWeaponAcceleration;
	boolean _buffer_isInitialized_getWeaponAcceleration = false;
	@Override
	public float getWeaponAcceleration() {

		if (!_buffer_isInitialized_getWeaponAcceleration) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getWeaponAcceleration(this.getWeaponDefId());
			_buffer_getWeaponAcceleration = _ret_int;
			_buffer_isInitialized_getWeaponAcceleration = true;
		}

		return _buffer_getWeaponAcceleration;
	}

	float _buffer_getTurnRate;
	boolean _buffer_isInitialized_getTurnRate = false;
	@Override
	public float getTurnRate() {

		if (!_buffer_isInitialized_getTurnRate) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getTurnRate(this.getWeaponDefId());
			_buffer_getTurnRate = _ret_int;
			_buffer_isInitialized_getTurnRate = true;
		}

		return _buffer_getTurnRate;
	}

	float _buffer_getMaxVelocity;
	boolean _buffer_isInitialized_getMaxVelocity = false;
	@Override
	public float getMaxVelocity() {

		if (!_buffer_isInitialized_getMaxVelocity) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getMaxVelocity(this.getWeaponDefId());
			_buffer_getMaxVelocity = _ret_int;
			_buffer_isInitialized_getMaxVelocity = true;
		}

		return _buffer_getMaxVelocity;
	}

	float _buffer_getProjectileSpeed;
	boolean _buffer_isInitialized_getProjectileSpeed = false;
	@Override
	public float getProjectileSpeed() {

		if (!_buffer_isInitialized_getProjectileSpeed) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getProjectileSpeed(this.getWeaponDefId());
			_buffer_getProjectileSpeed = _ret_int;
			_buffer_isInitialized_getProjectileSpeed = true;
		}

		return _buffer_getProjectileSpeed;
	}

	float _buffer_getExplosionSpeed;
	boolean _buffer_isInitialized_getExplosionSpeed = false;
	@Override
	public float getExplosionSpeed() {

		if (!_buffer_isInitialized_getExplosionSpeed) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getExplosionSpeed(this.getWeaponDefId());
			_buffer_getExplosionSpeed = _ret_int;
			_buffer_isInitialized_getExplosionSpeed = true;
		}

		return _buffer_getExplosionSpeed;
	}

	int _buffer_getOnlyTargetCategory;
	boolean _buffer_isInitialized_getOnlyTargetCategory = false;
	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	@Override
	public int getOnlyTargetCategory() {

		if (!_buffer_isInitialized_getOnlyTargetCategory) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getOnlyTargetCategory(this.getWeaponDefId());
			_buffer_getOnlyTargetCategory = _ret_int;
			_buffer_isInitialized_getOnlyTargetCategory = true;
		}

		return _buffer_getOnlyTargetCategory;
	}

	float _buffer_getWobble;
	boolean _buffer_isInitialized_getWobble = false;
	/**
	 * How much the missile will wobble around its course.
	 */
	@Override
	public float getWobble() {

		if (!_buffer_isInitialized_getWobble) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getWobble(this.getWeaponDefId());
			_buffer_getWobble = _ret_int;
			_buffer_isInitialized_getWobble = true;
		}

		return _buffer_getWobble;
	}

	float _buffer_getDance;
	boolean _buffer_isInitialized_getDance = false;
	/**
	 * How much the missile will dance.
	 */
	@Override
	public float getDance() {

		if (!_buffer_isInitialized_getDance) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getDance(this.getWeaponDefId());
			_buffer_getDance = _ret_int;
			_buffer_isInitialized_getDance = true;
		}

		return _buffer_getDance;
	}

	float _buffer_getTrajectoryHeight;
	boolean _buffer_isInitialized_getTrajectoryHeight = false;
	/**
	 * How high trajectory missiles will try to fly in.
	 */
	@Override
	public float getTrajectoryHeight() {

		if (!_buffer_isInitialized_getTrajectoryHeight) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getTrajectoryHeight(this.getWeaponDefId());
			_buffer_getTrajectoryHeight = _ret_int;
			_buffer_isInitialized_getTrajectoryHeight = true;
		}

		return _buffer_getTrajectoryHeight;
	}

	boolean _buffer_isLargeBeamLaser;
	boolean _buffer_isInitialized_isLargeBeamLaser = false;
	@Override
	public boolean isLargeBeamLaser() {

		if (!_buffer_isInitialized_isLargeBeamLaser) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isLargeBeamLaser(this.getWeaponDefId());
			_buffer_isLargeBeamLaser = _ret_int;
			_buffer_isInitialized_isLargeBeamLaser = true;
		}

		return _buffer_isLargeBeamLaser;
	}

	boolean _buffer_isShield;
	boolean _buffer_isInitialized_isShield = false;
	/**
	 * If the weapon is a shield rather than a weapon.
	 */
	@Override
	public boolean isShield() {

		if (!_buffer_isInitialized_isShield) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isShield(this.getWeaponDefId());
			_buffer_isShield = _ret_int;
			_buffer_isInitialized_isShield = true;
		}

		return _buffer_isShield;
	}

	boolean _buffer_isShieldRepulser;
	boolean _buffer_isInitialized_isShieldRepulser = false;
	/**
	 * If the weapon should be repulsed or absorbed.
	 */
	@Override
	public boolean isShieldRepulser() {

		if (!_buffer_isInitialized_isShieldRepulser) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isShieldRepulser(this.getWeaponDefId());
			_buffer_isShieldRepulser = _ret_int;
			_buffer_isInitialized_isShieldRepulser = true;
		}

		return _buffer_isShieldRepulser;
	}

	boolean _buffer_isSmartShield;
	boolean _buffer_isInitialized_isSmartShield = false;
	/**
	 * If the shield only affects enemy projectiles.
	 */
	@Override
	public boolean isSmartShield() {

		if (!_buffer_isInitialized_isSmartShield) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isSmartShield(this.getWeaponDefId());
			_buffer_isSmartShield = _ret_int;
			_buffer_isInitialized_isSmartShield = true;
		}

		return _buffer_isSmartShield;
	}

	boolean _buffer_isExteriorShield;
	boolean _buffer_isInitialized_isExteriorShield = false;
	/**
	 * If the shield only affects stuff coming from outside shield radius.
	 */
	@Override
	public boolean isExteriorShield() {

		if (!_buffer_isInitialized_isExteriorShield) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isExteriorShield(this.getWeaponDefId());
			_buffer_isExteriorShield = _ret_int;
			_buffer_isInitialized_isExteriorShield = true;
		}

		return _buffer_isExteriorShield;
	}

	boolean _buffer_isVisibleShield;
	boolean _buffer_isInitialized_isVisibleShield = false;
	/**
	 * If the shield should be graphically shown.
	 */
	@Override
	public boolean isVisibleShield() {

		if (!_buffer_isInitialized_isVisibleShield) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isVisibleShield(this.getWeaponDefId());
			_buffer_isVisibleShield = _ret_int;
			_buffer_isInitialized_isVisibleShield = true;
		}

		return _buffer_isVisibleShield;
	}

	boolean _buffer_isVisibleShieldRepulse;
	boolean _buffer_isInitialized_isVisibleShieldRepulse = false;
	/**
	 * If a small graphic should be shown at each repulse.
	 */
	@Override
	public boolean isVisibleShieldRepulse() {

		if (!_buffer_isInitialized_isVisibleShieldRepulse) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isVisibleShieldRepulse(this.getWeaponDefId());
			_buffer_isVisibleShieldRepulse = _ret_int;
			_buffer_isInitialized_isVisibleShieldRepulse = true;
		}

		return _buffer_isVisibleShieldRepulse;
	}

	int _buffer_getVisibleShieldHitFrames;
	boolean _buffer_isInitialized_getVisibleShieldHitFrames = false;
	/**
	 * The number of frames to draw the shield after it has been hit.
	 */
	@Override
	public int getVisibleShieldHitFrames() {

		if (!_buffer_isInitialized_getVisibleShieldHitFrames) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getVisibleShieldHitFrames(this.getWeaponDefId());
			_buffer_getVisibleShieldHitFrames = _ret_int;
			_buffer_isInitialized_getVisibleShieldHitFrames = true;
		}

		return _buffer_getVisibleShieldHitFrames;
	}

	int _buffer_getInterceptedByShieldType;
	boolean _buffer_isInitialized_getInterceptedByShieldType = false;
	/**
	 * The type of shields that can intercept this weapon (bitfield).
	 * The weapon can be affected by shields if:
	 * (shield.getInterceptType() & weapon.getInterceptedByShieldType()) != 0
	 * 
	 * @see  getInterceptType()
	 */
	@Override
	public int getInterceptedByShieldType() {

		if (!_buffer_isInitialized_getInterceptedByShieldType) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getInterceptedByShieldType(this.getWeaponDefId());
			_buffer_getInterceptedByShieldType = _ret_int;
			_buffer_isInitialized_getInterceptedByShieldType = true;
		}

		return _buffer_getInterceptedByShieldType;
	}

	boolean _buffer_isAvoidFriendly;
	boolean _buffer_isInitialized_isAvoidFriendly = false;
	/**
	 * Tries to avoid friendly units while aiming?
	 */
	@Override
	public boolean isAvoidFriendly() {

		if (!_buffer_isInitialized_isAvoidFriendly) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isAvoidFriendly(this.getWeaponDefId());
			_buffer_isAvoidFriendly = _ret_int;
			_buffer_isInitialized_isAvoidFriendly = true;
		}

		return _buffer_isAvoidFriendly;
	}

	boolean _buffer_isAvoidFeature;
	boolean _buffer_isInitialized_isAvoidFeature = false;
	/**
	 * Tries to avoid features while aiming?
	 */
	@Override
	public boolean isAvoidFeature() {

		if (!_buffer_isInitialized_isAvoidFeature) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isAvoidFeature(this.getWeaponDefId());
			_buffer_isAvoidFeature = _ret_int;
			_buffer_isInitialized_isAvoidFeature = true;
		}

		return _buffer_isAvoidFeature;
	}

	boolean _buffer_isAvoidNeutral;
	boolean _buffer_isInitialized_isAvoidNeutral = false;
	/**
	 * Tries to avoid neutral units while aiming?
	 */
	@Override
	public boolean isAvoidNeutral() {

		if (!_buffer_isInitialized_isAvoidNeutral) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isAvoidNeutral(this.getWeaponDefId());
			_buffer_isAvoidNeutral = _ret_int;
			_buffer_isInitialized_isAvoidNeutral = true;
		}

		return _buffer_isAvoidNeutral;
	}

	float _buffer_getTargetBorder;
	boolean _buffer_isInitialized_getTargetBorder = false;
	/**
	 * If nonzero, targetting units will TryTarget at the edge of collision sphere
	 * (radius*tag value, [-1;1]) instead of its centre.
	 */
	@Override
	public float getTargetBorder() {

		if (!_buffer_isInitialized_getTargetBorder) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getTargetBorder(this.getWeaponDefId());
			_buffer_getTargetBorder = _ret_int;
			_buffer_isInitialized_getTargetBorder = true;
		}

		return _buffer_getTargetBorder;
	}

	float _buffer_getCylinderTargetting;
	boolean _buffer_isInitialized_getCylinderTargetting = false;
	/**
	 * If greater than 0, the range will be checked in a cylinder
	 * (height=range*cylinderTargetting) instead of a sphere.
	 */
	@Override
	public float getCylinderTargetting() {

		if (!_buffer_isInitialized_getCylinderTargetting) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getCylinderTargetting(this.getWeaponDefId());
			_buffer_getCylinderTargetting = _ret_int;
			_buffer_isInitialized_getCylinderTargetting = true;
		}

		return _buffer_getCylinderTargetting;
	}

	float _buffer_getMinIntensity;
	boolean _buffer_isInitialized_getMinIntensity = false;
	/**
	 * For beam-lasers only - always hit with some minimum intensity
	 * (a damage coeffcient normally dependent on distance).
	 * Do not confuse this with the intensity tag, it i completely unrelated.
	 */
	@Override
	public float getMinIntensity() {

		if (!_buffer_isInitialized_getMinIntensity) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getMinIntensity(this.getWeaponDefId());
			_buffer_getMinIntensity = _ret_int;
			_buffer_isInitialized_getMinIntensity = true;
		}

		return _buffer_getMinIntensity;
	}

	float _buffer_getHeightBoostFactor;
	boolean _buffer_isInitialized_getHeightBoostFactor = false;
	/**
	 * Controls cannon range height boost.
	 * 
	 * default: -1: automatically calculate a more or less sane value
	 */
	@Override
	public float getHeightBoostFactor() {

		if (!_buffer_isInitialized_getHeightBoostFactor) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getHeightBoostFactor(this.getWeaponDefId());
			_buffer_getHeightBoostFactor = _ret_int;
			_buffer_isInitialized_getHeightBoostFactor = true;
		}

		return _buffer_getHeightBoostFactor;
	}

	float _buffer_getProximityPriority;
	boolean _buffer_isInitialized_getProximityPriority = false;
	/**
	 * Multiplier for the distance to the target for priority calculations.
	 */
	@Override
	public float getProximityPriority() {

		if (!_buffer_isInitialized_getProximityPriority) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getProximityPriority(this.getWeaponDefId());
			_buffer_getProximityPriority = _ret_int;
			_buffer_isInitialized_getProximityPriority = true;
		}

		return _buffer_getProximityPriority;
	}

	int _buffer_getCollisionFlags;
	boolean _buffer_isInitialized_getCollisionFlags = false;
	@Override
	public int getCollisionFlags() {

		if (!_buffer_isInitialized_getCollisionFlags) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_getCollisionFlags(this.getWeaponDefId());
			_buffer_getCollisionFlags = _ret_int;
			_buffer_isInitialized_getCollisionFlags = true;
		}

		return _buffer_getCollisionFlags;
	}

	boolean _buffer_isSweepFire;
	boolean _buffer_isInitialized_isSweepFire = false;
	@Override
	public boolean isSweepFire() {

		if (!_buffer_isInitialized_isSweepFire) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isSweepFire(this.getWeaponDefId());
			_buffer_isSweepFire = _ret_int;
			_buffer_isInitialized_isSweepFire = true;
		}

		return _buffer_isSweepFire;
	}

	boolean _buffer_isAbleToAttackGround;
	boolean _buffer_isInitialized_isAbleToAttackGround = false;
	@Override
	public boolean isAbleToAttackGround() {

		if (!_buffer_isInitialized_isAbleToAttackGround) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isAbleToAttackGround(this.getWeaponDefId());
			_buffer_isAbleToAttackGround = _ret_int;
			_buffer_isInitialized_isAbleToAttackGround = true;
		}

		return _buffer_isAbleToAttackGround;
	}

	float _buffer_getCameraShake;
	boolean _buffer_isInitialized_getCameraShake = false;
	@Override
	public float getCameraShake() {

		if (!_buffer_isInitialized_getCameraShake) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getCameraShake(this.getWeaponDefId());
			_buffer_getCameraShake = _ret_int;
			_buffer_isInitialized_getCameraShake = true;
		}

		return _buffer_getCameraShake;
	}

	float _buffer_getDynDamageExp;
	boolean _buffer_isInitialized_getDynDamageExp = false;
	@Override
	public float getDynDamageExp() {

		if (!_buffer_isInitialized_getDynDamageExp) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getDynDamageExp(this.getWeaponDefId());
			_buffer_getDynDamageExp = _ret_int;
			_buffer_isInitialized_getDynDamageExp = true;
		}

		return _buffer_getDynDamageExp;
	}

	float _buffer_getDynDamageMin;
	boolean _buffer_isInitialized_getDynDamageMin = false;
	@Override
	public float getDynDamageMin() {

		if (!_buffer_isInitialized_getDynDamageMin) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getDynDamageMin(this.getWeaponDefId());
			_buffer_getDynDamageMin = _ret_int;
			_buffer_isInitialized_getDynDamageMin = true;
		}

		return _buffer_getDynDamageMin;
	}

	float _buffer_getDynDamageRange;
	boolean _buffer_isInitialized_getDynDamageRange = false;
	@Override
	public float getDynDamageRange() {

		if (!_buffer_isInitialized_getDynDamageRange) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_getDynDamageRange(this.getWeaponDefId());
			_buffer_getDynDamageRange = _ret_int;
			_buffer_isInitialized_getDynDamageRange = true;
		}

		return _buffer_getDynDamageRange;
	}

	boolean _buffer_isDynDamageInverted;
	boolean _buffer_isInitialized_isDynDamageInverted = false;
	@Override
	public boolean isDynDamageInverted() {

		if (!_buffer_isInitialized_isDynDamageInverted) {
		boolean _ret_int;

			_ret_int = innerCallback.WeaponDef_isDynDamageInverted(this.getWeaponDefId());
			_buffer_isDynDamageInverted = _ret_int;
			_buffer_isInitialized_isDynDamageInverted = true;
		}

		return _buffer_isDynDamageInverted;
	}

	java.util.Map<String, String> _buffer_getCustomParams;
	boolean _buffer_isInitialized_getCustomParams = false;
	@Override
	public java.util.Map<String, String> getCustomParams() {

		if (!_buffer_isInitialized_getCustomParams) {
		String[] values;
		String[] keys;
		java.util.Map<String, String> _map;
		int _size;
		int _ret_int;

		keys = null;
		values = null;
		_size = innerCallback.WeaponDef_getCustomParams(this.getWeaponDefId(), keys, values);
		keys = new String[_size];
		values = new String[_size];

			_ret_int = innerCallback.WeaponDef_getCustomParams(this.getWeaponDefId(), keys, values);
		_map = new java.util.HashMap<String, String>();
		for (int i=0; i < _size; i++) {
		}

			_buffer_getCustomParams = _map;
			_buffer_isInitialized_getCustomParams = true;
		}

		return _buffer_getCustomParams;
	}

	Damage _buffer_getDamage;
	boolean _buffer_isInitialized_getDamage = false;
	@Override
	public Damage getDamage() {

		if (!_buffer_isInitialized_getDamage) {
		Damage _ret_int_out;

		_ret_int_out = WrappDamage.getInstance(innerCallback, weaponDefId);

			_buffer_getDamage = _ret_int_out;
			_buffer_isInitialized_getDamage = true;
		}

		return _buffer_getDamage;
	}

	Shield _buffer_getShield;
	boolean _buffer_isInitialized_getShield = false;
	@Override
	public Shield getShield() {

		if (!_buffer_isInitialized_getShield) {
		Shield _ret_int_out;

		_ret_int_out = WrappShield.getInstance(innerCallback, weaponDefId);

			_buffer_getShield = _ret_int_out;
			_buffer_isInitialized_getShield = true;
		}

		return _buffer_getShield;
	}
}


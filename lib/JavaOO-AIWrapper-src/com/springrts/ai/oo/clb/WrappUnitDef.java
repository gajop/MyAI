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
public class WrappUnitDef extends AbstractUnitDef implements UnitDef {

	private AICallback innerCallback = null;
	private int unitDefId = -1;

	public WrappUnitDef(AICallback innerCallback, int unitDefId) {

		this.innerCallback = innerCallback;
		this.unitDefId = unitDefId;
	}

	@Override
	public int getUnitDefId() {

		return unitDefId;
	}

	private static java.util.Map<Integer, UnitDef> _buffer_instances = new java.util.HashMap<Integer, UnitDef>();

	public static UnitDef getInstance(AICallback innerCallback, int unitDefId) {

		if (unitDefId < 0) {
			return null;
		}

		UnitDef _ret = null;
		_ret = new WrappUnitDef(innerCallback, unitDefId);
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


	float _buffer_getHeight;
	boolean _buffer_isInitialized_getHeight = false;
	/**
	 * Forces loading of the unit model
	 */
	@Override
	public float getHeight() {

		if (!_buffer_isInitialized_getHeight) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getHeight(this.getUnitDefId());
			_buffer_getHeight = _ret_int;
			_buffer_isInitialized_getHeight = true;
		}

		return _buffer_getHeight;
	}

	float _buffer_getRadius;
	boolean _buffer_isInitialized_getRadius = false;
	/**
	 * Forces loading of the unit model
	 */
	@Override
	public float getRadius() {

		if (!_buffer_isInitialized_getRadius) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getRadius(this.getUnitDefId());
			_buffer_getRadius = _ret_int;
			_buffer_isInitialized_getRadius = true;
		}

		return _buffer_getRadius;
	}

	String _buffer_getName;
	boolean _buffer_isInitialized_getName = false;
	@Override
	public String getName() {

		if (!_buffer_isInitialized_getName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getName(this.getUnitDefId());
			_buffer_getName = _ret_int;
			_buffer_isInitialized_getName = true;
		}

		return _buffer_getName;
	}

	String _buffer_getHumanName;
	boolean _buffer_isInitialized_getHumanName = false;
	@Override
	public String getHumanName() {

		if (!_buffer_isInitialized_getHumanName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getHumanName(this.getUnitDefId());
			_buffer_getHumanName = _ret_int;
			_buffer_isInitialized_getHumanName = true;
		}

		return _buffer_getHumanName;
	}

	String _buffer_getFileName;
	boolean _buffer_isInitialized_getFileName = false;
	@Override
	public String getFileName() {

		if (!_buffer_isInitialized_getFileName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getFileName(this.getUnitDefId());
			_buffer_getFileName = _ret_int;
			_buffer_isInitialized_getFileName = true;
		}

		return _buffer_getFileName;
	}

	int _buffer_getAiHint;
	boolean _buffer_isInitialized_getAiHint = false;
	/**
	 * @deprecated
	 */
	@Override
	public int getAiHint() {

		if (!_buffer_isInitialized_getAiHint) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getAiHint(this.getUnitDefId());
			_buffer_getAiHint = _ret_int;
			_buffer_isInitialized_getAiHint = true;
		}

		return _buffer_getAiHint;
	}

	int _buffer_getCobId;
	boolean _buffer_isInitialized_getCobId = false;
	@Override
	public int getCobId() {

		if (!_buffer_isInitialized_getCobId) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getCobId(this.getUnitDefId());
			_buffer_getCobId = _ret_int;
			_buffer_isInitialized_getCobId = true;
		}

		return _buffer_getCobId;
	}

	int _buffer_getTechLevel;
	boolean _buffer_isInitialized_getTechLevel = false;
	@Override
	public int getTechLevel() {

		if (!_buffer_isInitialized_getTechLevel) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getTechLevel(this.getUnitDefId());
			_buffer_getTechLevel = _ret_int;
			_buffer_isInitialized_getTechLevel = true;
		}

		return _buffer_getTechLevel;
	}

	String _buffer_getGaia;
	boolean _buffer_isInitialized_getGaia = false;
	/**
	 * @deprecated
	 */
	@Override
	public String getGaia() {

		if (!_buffer_isInitialized_getGaia) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getGaia(this.getUnitDefId());
			_buffer_getGaia = _ret_int;
			_buffer_isInitialized_getGaia = true;
		}

		return _buffer_getGaia;
	}

	@Override
	public float getUpkeep(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getUpkeep(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	/**
	 * This amount of the resource will always be created.
	 */
	@Override
	public float getResourceMake(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getResourceMake(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	/**
	 * This amount of the resource will be created when the unit is on and enough
	 * energy can be drained.
	 */
	@Override
	public float getMakesResource(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getMakesResource(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getCost(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getCost(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getExtractsResource(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getExtractsResource(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getResourceExtractorRange(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getResourceExtractorRange(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getWindResourceGenerator(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getWindResourceGenerator(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getTidalResourceGenerator(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getTidalResourceGenerator(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public float getStorage(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_getStorage(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	@Override
	public boolean isSquareResourceExtractor(Resource resource) {

		boolean _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.UnitDef_isSquareResourceExtractor(this.getUnitDefId(), resourceId);
		return _ret_int;
	}

	float _buffer_getBuildTime;
	boolean _buffer_isInitialized_getBuildTime = false;
	@Override
	public float getBuildTime() {

		if (!_buffer_isInitialized_getBuildTime) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildTime(this.getUnitDefId());
			_buffer_getBuildTime = _ret_int;
			_buffer_isInitialized_getBuildTime = true;
		}

		return _buffer_getBuildTime;
	}

	float _buffer_getAutoHeal;
	boolean _buffer_isInitialized_getAutoHeal = false;
	/**
	 * This amount of auto-heal will always be applied.
	 */
	@Override
	public float getAutoHeal() {

		if (!_buffer_isInitialized_getAutoHeal) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getAutoHeal(this.getUnitDefId());
			_buffer_getAutoHeal = _ret_int;
			_buffer_isInitialized_getAutoHeal = true;
		}

		return _buffer_getAutoHeal;
	}

	float _buffer_getIdleAutoHeal;
	boolean _buffer_isInitialized_getIdleAutoHeal = false;
	/**
	 * This amount of auto-heal will only be applied while the unit is idling.
	 */
	@Override
	public float getIdleAutoHeal() {

		if (!_buffer_isInitialized_getIdleAutoHeal) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getIdleAutoHeal(this.getUnitDefId());
			_buffer_getIdleAutoHeal = _ret_int;
			_buffer_isInitialized_getIdleAutoHeal = true;
		}

		return _buffer_getIdleAutoHeal;
	}

	int _buffer_getIdleTime;
	boolean _buffer_isInitialized_getIdleTime = false;
	/**
	 * Time a unit needs to idle before it is considered idling.
	 */
	@Override
	public int getIdleTime() {

		if (!_buffer_isInitialized_getIdleTime) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getIdleTime(this.getUnitDefId());
			_buffer_getIdleTime = _ret_int;
			_buffer_isInitialized_getIdleTime = true;
		}

		return _buffer_getIdleTime;
	}

	float _buffer_getPower;
	boolean _buffer_isInitialized_getPower = false;
	@Override
	public float getPower() {

		if (!_buffer_isInitialized_getPower) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getPower(this.getUnitDefId());
			_buffer_getPower = _ret_int;
			_buffer_isInitialized_getPower = true;
		}

		return _buffer_getPower;
	}

	float _buffer_getHealth;
	boolean _buffer_isInitialized_getHealth = false;
	@Override
	public float getHealth() {

		if (!_buffer_isInitialized_getHealth) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getHealth(this.getUnitDefId());
			_buffer_getHealth = _ret_int;
			_buffer_isInitialized_getHealth = true;
		}

		return _buffer_getHealth;
	}

	int _buffer_getCategory;
	boolean _buffer_isInitialized_getCategory = false;
	/**
	 * Returns the bit field value denoting the categories this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	@Override
	public int getCategory() {

		if (!_buffer_isInitialized_getCategory) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getCategory(this.getUnitDefId());
			_buffer_getCategory = _ret_int;
			_buffer_isInitialized_getCategory = true;
		}

		return _buffer_getCategory;
	}

	float _buffer_getSpeed;
	boolean _buffer_isInitialized_getSpeed = false;
	@Override
	public float getSpeed() {

		if (!_buffer_isInitialized_getSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getSpeed(this.getUnitDefId());
			_buffer_getSpeed = _ret_int;
			_buffer_isInitialized_getSpeed = true;
		}

		return _buffer_getSpeed;
	}

	float _buffer_getTurnRate;
	boolean _buffer_isInitialized_getTurnRate = false;
	@Override
	public float getTurnRate() {

		if (!_buffer_isInitialized_getTurnRate) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTurnRate(this.getUnitDefId());
			_buffer_getTurnRate = _ret_int;
			_buffer_isInitialized_getTurnRate = true;
		}

		return _buffer_getTurnRate;
	}

	boolean _buffer_isTurnInPlace;
	boolean _buffer_isInitialized_isTurnInPlace = false;
	@Override
	public boolean isTurnInPlace() {

		if (!_buffer_isInitialized_isTurnInPlace) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isTurnInPlace(this.getUnitDefId());
			_buffer_isTurnInPlace = _ret_int;
			_buffer_isInitialized_isTurnInPlace = true;
		}

		return _buffer_isTurnInPlace;
	}

	float _buffer_getTurnInPlaceDistance;
	boolean _buffer_isInitialized_getTurnInPlaceDistance = false;
	/**
	 * Units above this distance to goal will try to turn while keeping
	 * some of their speed.
	 * 0 to disable
	 */
	@Override
	public float getTurnInPlaceDistance() {

		if (!_buffer_isInitialized_getTurnInPlaceDistance) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTurnInPlaceDistance(this.getUnitDefId());
			_buffer_getTurnInPlaceDistance = _ret_int;
			_buffer_isInitialized_getTurnInPlaceDistance = true;
		}

		return _buffer_getTurnInPlaceDistance;
	}

	float _buffer_getTurnInPlaceSpeedLimit;
	boolean _buffer_isInitialized_getTurnInPlaceSpeedLimit = false;
	/**
	 * Units below this speed will turn in place regardless of their
	 * turnInPlace setting.
	 */
	@Override
	public float getTurnInPlaceSpeedLimit() {

		if (!_buffer_isInitialized_getTurnInPlaceSpeedLimit) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTurnInPlaceSpeedLimit(this.getUnitDefId());
			_buffer_getTurnInPlaceSpeedLimit = _ret_int;
			_buffer_isInitialized_getTurnInPlaceSpeedLimit = true;
		}

		return _buffer_getTurnInPlaceSpeedLimit;
	}

	boolean _buffer_isUpright;
	boolean _buffer_isInitialized_isUpright = false;
	@Override
	public boolean isUpright() {

		if (!_buffer_isInitialized_isUpright) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isUpright(this.getUnitDefId());
			_buffer_isUpright = _ret_int;
			_buffer_isInitialized_isUpright = true;
		}

		return _buffer_isUpright;
	}

	boolean _buffer_isCollide;
	boolean _buffer_isInitialized_isCollide = false;
	@Override
	public boolean isCollide() {

		if (!_buffer_isInitialized_isCollide) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isCollide(this.getUnitDefId());
			_buffer_isCollide = _ret_int;
			_buffer_isInitialized_isCollide = true;
		}

		return _buffer_isCollide;
	}

	float _buffer_getLosRadius;
	boolean _buffer_isInitialized_getLosRadius = false;
	@Override
	public float getLosRadius() {

		if (!_buffer_isInitialized_getLosRadius) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getLosRadius(this.getUnitDefId());
			_buffer_getLosRadius = _ret_int;
			_buffer_isInitialized_getLosRadius = true;
		}

		return _buffer_getLosRadius;
	}

	float _buffer_getAirLosRadius;
	boolean _buffer_isInitialized_getAirLosRadius = false;
	@Override
	public float getAirLosRadius() {

		if (!_buffer_isInitialized_getAirLosRadius) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getAirLosRadius(this.getUnitDefId());
			_buffer_getAirLosRadius = _ret_int;
			_buffer_isInitialized_getAirLosRadius = true;
		}

		return _buffer_getAirLosRadius;
	}

	float _buffer_getLosHeight;
	boolean _buffer_isInitialized_getLosHeight = false;
	@Override
	public float getLosHeight() {

		if (!_buffer_isInitialized_getLosHeight) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getLosHeight(this.getUnitDefId());
			_buffer_getLosHeight = _ret_int;
			_buffer_isInitialized_getLosHeight = true;
		}

		return _buffer_getLosHeight;
	}

	int _buffer_getRadarRadius;
	boolean _buffer_isInitialized_getRadarRadius = false;
	@Override
	public int getRadarRadius() {

		if (!_buffer_isInitialized_getRadarRadius) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getRadarRadius(this.getUnitDefId());
			_buffer_getRadarRadius = _ret_int;
			_buffer_isInitialized_getRadarRadius = true;
		}

		return _buffer_getRadarRadius;
	}

	int _buffer_getSonarRadius;
	boolean _buffer_isInitialized_getSonarRadius = false;
	@Override
	public int getSonarRadius() {

		if (!_buffer_isInitialized_getSonarRadius) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getSonarRadius(this.getUnitDefId());
			_buffer_getSonarRadius = _ret_int;
			_buffer_isInitialized_getSonarRadius = true;
		}

		return _buffer_getSonarRadius;
	}

	int _buffer_getJammerRadius;
	boolean _buffer_isInitialized_getJammerRadius = false;
	@Override
	public int getJammerRadius() {

		if (!_buffer_isInitialized_getJammerRadius) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getJammerRadius(this.getUnitDefId());
			_buffer_getJammerRadius = _ret_int;
			_buffer_isInitialized_getJammerRadius = true;
		}

		return _buffer_getJammerRadius;
	}

	int _buffer_getSonarJamRadius;
	boolean _buffer_isInitialized_getSonarJamRadius = false;
	@Override
	public int getSonarJamRadius() {

		if (!_buffer_isInitialized_getSonarJamRadius) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getSonarJamRadius(this.getUnitDefId());
			_buffer_getSonarJamRadius = _ret_int;
			_buffer_isInitialized_getSonarJamRadius = true;
		}

		return _buffer_getSonarJamRadius;
	}

	int _buffer_getSeismicRadius;
	boolean _buffer_isInitialized_getSeismicRadius = false;
	@Override
	public int getSeismicRadius() {

		if (!_buffer_isInitialized_getSeismicRadius) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getSeismicRadius(this.getUnitDefId());
			_buffer_getSeismicRadius = _ret_int;
			_buffer_isInitialized_getSeismicRadius = true;
		}

		return _buffer_getSeismicRadius;
	}

	float _buffer_getSeismicSignature;
	boolean _buffer_isInitialized_getSeismicSignature = false;
	@Override
	public float getSeismicSignature() {

		if (!_buffer_isInitialized_getSeismicSignature) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getSeismicSignature(this.getUnitDefId());
			_buffer_getSeismicSignature = _ret_int;
			_buffer_isInitialized_getSeismicSignature = true;
		}

		return _buffer_getSeismicSignature;
	}

	boolean _buffer_isStealth;
	boolean _buffer_isInitialized_isStealth = false;
	@Override
	public boolean isStealth() {

		if (!_buffer_isInitialized_isStealth) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isStealth(this.getUnitDefId());
			_buffer_isStealth = _ret_int;
			_buffer_isInitialized_isStealth = true;
		}

		return _buffer_isStealth;
	}

	boolean _buffer_isSonarStealth;
	boolean _buffer_isInitialized_isSonarStealth = false;
	@Override
	public boolean isSonarStealth() {

		if (!_buffer_isInitialized_isSonarStealth) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isSonarStealth(this.getUnitDefId());
			_buffer_isSonarStealth = _ret_int;
			_buffer_isInitialized_isSonarStealth = true;
		}

		return _buffer_isSonarStealth;
	}

	boolean _buffer_isBuildRange3D;
	boolean _buffer_isInitialized_isBuildRange3D = false;
	@Override
	public boolean isBuildRange3D() {

		if (!_buffer_isInitialized_isBuildRange3D) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isBuildRange3D(this.getUnitDefId());
			_buffer_isBuildRange3D = _ret_int;
			_buffer_isInitialized_isBuildRange3D = true;
		}

		return _buffer_isBuildRange3D;
	}

	float _buffer_getBuildDistance;
	boolean _buffer_isInitialized_getBuildDistance = false;
	@Override
	public float getBuildDistance() {

		if (!_buffer_isInitialized_getBuildDistance) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildDistance(this.getUnitDefId());
			_buffer_getBuildDistance = _ret_int;
			_buffer_isInitialized_getBuildDistance = true;
		}

		return _buffer_getBuildDistance;
	}

	float _buffer_getBuildSpeed;
	boolean _buffer_isInitialized_getBuildSpeed = false;
	@Override
	public float getBuildSpeed() {

		if (!_buffer_isInitialized_getBuildSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildSpeed(this.getUnitDefId());
			_buffer_getBuildSpeed = _ret_int;
			_buffer_isInitialized_getBuildSpeed = true;
		}

		return _buffer_getBuildSpeed;
	}

	float _buffer_getReclaimSpeed;
	boolean _buffer_isInitialized_getReclaimSpeed = false;
	@Override
	public float getReclaimSpeed() {

		if (!_buffer_isInitialized_getReclaimSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getReclaimSpeed(this.getUnitDefId());
			_buffer_getReclaimSpeed = _ret_int;
			_buffer_isInitialized_getReclaimSpeed = true;
		}

		return _buffer_getReclaimSpeed;
	}

	float _buffer_getRepairSpeed;
	boolean _buffer_isInitialized_getRepairSpeed = false;
	@Override
	public float getRepairSpeed() {

		if (!_buffer_isInitialized_getRepairSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getRepairSpeed(this.getUnitDefId());
			_buffer_getRepairSpeed = _ret_int;
			_buffer_isInitialized_getRepairSpeed = true;
		}

		return _buffer_getRepairSpeed;
	}

	float _buffer_getMaxRepairSpeed;
	boolean _buffer_isInitialized_getMaxRepairSpeed = false;
	@Override
	public float getMaxRepairSpeed() {

		if (!_buffer_isInitialized_getMaxRepairSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxRepairSpeed(this.getUnitDefId());
			_buffer_getMaxRepairSpeed = _ret_int;
			_buffer_isInitialized_getMaxRepairSpeed = true;
		}

		return _buffer_getMaxRepairSpeed;
	}

	float _buffer_getResurrectSpeed;
	boolean _buffer_isInitialized_getResurrectSpeed = false;
	@Override
	public float getResurrectSpeed() {

		if (!_buffer_isInitialized_getResurrectSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getResurrectSpeed(this.getUnitDefId());
			_buffer_getResurrectSpeed = _ret_int;
			_buffer_isInitialized_getResurrectSpeed = true;
		}

		return _buffer_getResurrectSpeed;
	}

	float _buffer_getCaptureSpeed;
	boolean _buffer_isInitialized_getCaptureSpeed = false;
	@Override
	public float getCaptureSpeed() {

		if (!_buffer_isInitialized_getCaptureSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getCaptureSpeed(this.getUnitDefId());
			_buffer_getCaptureSpeed = _ret_int;
			_buffer_isInitialized_getCaptureSpeed = true;
		}

		return _buffer_getCaptureSpeed;
	}

	float _buffer_getTerraformSpeed;
	boolean _buffer_isInitialized_getTerraformSpeed = false;
	@Override
	public float getTerraformSpeed() {

		if (!_buffer_isInitialized_getTerraformSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTerraformSpeed(this.getUnitDefId());
			_buffer_getTerraformSpeed = _ret_int;
			_buffer_isInitialized_getTerraformSpeed = true;
		}

		return _buffer_getTerraformSpeed;
	}

	float _buffer_getMass;
	boolean _buffer_isInitialized_getMass = false;
	@Override
	public float getMass() {

		if (!_buffer_isInitialized_getMass) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMass(this.getUnitDefId());
			_buffer_getMass = _ret_int;
			_buffer_isInitialized_getMass = true;
		}

		return _buffer_getMass;
	}

	boolean _buffer_isPushResistant;
	boolean _buffer_isInitialized_isPushResistant = false;
	@Override
	public boolean isPushResistant() {

		if (!_buffer_isInitialized_isPushResistant) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isPushResistant(this.getUnitDefId());
			_buffer_isPushResistant = _ret_int;
			_buffer_isInitialized_isPushResistant = true;
		}

		return _buffer_isPushResistant;
	}

	boolean _buffer_isStrafeToAttack;
	boolean _buffer_isInitialized_isStrafeToAttack = false;
	/**
	 * Should the unit move sideways when it can not shoot?
	 */
	@Override
	public boolean isStrafeToAttack() {

		if (!_buffer_isInitialized_isStrafeToAttack) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isStrafeToAttack(this.getUnitDefId());
			_buffer_isStrafeToAttack = _ret_int;
			_buffer_isInitialized_isStrafeToAttack = true;
		}

		return _buffer_isStrafeToAttack;
	}

	float _buffer_getMinCollisionSpeed;
	boolean _buffer_isInitialized_getMinCollisionSpeed = false;
	@Override
	public float getMinCollisionSpeed() {

		if (!_buffer_isInitialized_getMinCollisionSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMinCollisionSpeed(this.getUnitDefId());
			_buffer_getMinCollisionSpeed = _ret_int;
			_buffer_isInitialized_getMinCollisionSpeed = true;
		}

		return _buffer_getMinCollisionSpeed;
	}

	float _buffer_getSlideTolerance;
	boolean _buffer_isInitialized_getSlideTolerance = false;
	@Override
	public float getSlideTolerance() {

		if (!_buffer_isInitialized_getSlideTolerance) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getSlideTolerance(this.getUnitDefId());
			_buffer_getSlideTolerance = _ret_int;
			_buffer_isInitialized_getSlideTolerance = true;
		}

		return _buffer_getSlideTolerance;
	}

	float _buffer_getMaxSlope;
	boolean _buffer_isInitialized_getMaxSlope = false;
	/**
	 * Build location relevant maximum steepness of the underlaying terrain.
	 * Used to calculate the maxHeightDif.
	 */
	@Override
	public float getMaxSlope() {

		if (!_buffer_isInitialized_getMaxSlope) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxSlope(this.getUnitDefId());
			_buffer_getMaxSlope = _ret_int;
			_buffer_isInitialized_getMaxSlope = true;
		}

		return _buffer_getMaxSlope;
	}

	float _buffer_getMaxHeightDif;
	boolean _buffer_isInitialized_getMaxHeightDif = false;
	/**
	 * Maximum terra-form height this building allows.
	 * If this value is 0.0, you can only build this structure on
	 * totally flat terrain.
	 */
	@Override
	public float getMaxHeightDif() {

		if (!_buffer_isInitialized_getMaxHeightDif) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxHeightDif(this.getUnitDefId());
			_buffer_getMaxHeightDif = _ret_int;
			_buffer_isInitialized_getMaxHeightDif = true;
		}

		return _buffer_getMaxHeightDif;
	}

	float _buffer_getMinWaterDepth;
	boolean _buffer_isInitialized_getMinWaterDepth = false;
	@Override
	public float getMinWaterDepth() {

		if (!_buffer_isInitialized_getMinWaterDepth) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMinWaterDepth(this.getUnitDefId());
			_buffer_getMinWaterDepth = _ret_int;
			_buffer_isInitialized_getMinWaterDepth = true;
		}

		return _buffer_getMinWaterDepth;
	}

	float _buffer_getWaterline;
	boolean _buffer_isInitialized_getWaterline = false;
	@Override
	public float getWaterline() {

		if (!_buffer_isInitialized_getWaterline) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getWaterline(this.getUnitDefId());
			_buffer_getWaterline = _ret_int;
			_buffer_isInitialized_getWaterline = true;
		}

		return _buffer_getWaterline;
	}

	float _buffer_getMaxWaterDepth;
	boolean _buffer_isInitialized_getMaxWaterDepth = false;
	@Override
	public float getMaxWaterDepth() {

		if (!_buffer_isInitialized_getMaxWaterDepth) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxWaterDepth(this.getUnitDefId());
			_buffer_getMaxWaterDepth = _ret_int;
			_buffer_isInitialized_getMaxWaterDepth = true;
		}

		return _buffer_getMaxWaterDepth;
	}

	float _buffer_getArmoredMultiple;
	boolean _buffer_isInitialized_getArmoredMultiple = false;
	@Override
	public float getArmoredMultiple() {

		if (!_buffer_isInitialized_getArmoredMultiple) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getArmoredMultiple(this.getUnitDefId());
			_buffer_getArmoredMultiple = _ret_int;
			_buffer_isInitialized_getArmoredMultiple = true;
		}

		return _buffer_getArmoredMultiple;
	}

	int _buffer_getArmorType;
	boolean _buffer_isInitialized_getArmorType = false;
	@Override
	public int getArmorType() {

		if (!_buffer_isInitialized_getArmorType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getArmorType(this.getUnitDefId());
			_buffer_getArmorType = _ret_int;
			_buffer_isInitialized_getArmorType = true;
		}

		return _buffer_getArmorType;
	}

	float _buffer_getMaxWeaponRange;
	boolean _buffer_isInitialized_getMaxWeaponRange = false;
	@Override
	public float getMaxWeaponRange() {

		if (!_buffer_isInitialized_getMaxWeaponRange) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxWeaponRange(this.getUnitDefId());
			_buffer_getMaxWeaponRange = _ret_int;
			_buffer_isInitialized_getMaxWeaponRange = true;
		}

		return _buffer_getMaxWeaponRange;
	}

	String _buffer_getType;
	boolean _buffer_isInitialized_getType = false;
	/**
	 * @deprecated
	 */
	@Override
	public String getType() {

		if (!_buffer_isInitialized_getType) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getType(this.getUnitDefId());
			_buffer_getType = _ret_int;
			_buffer_isInitialized_getType = true;
		}

		return _buffer_getType;
	}

	String _buffer_getTooltip;
	boolean _buffer_isInitialized_getTooltip = false;
	@Override
	public String getTooltip() {

		if (!_buffer_isInitialized_getTooltip) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getTooltip(this.getUnitDefId());
			_buffer_getTooltip = _ret_int;
			_buffer_isInitialized_getTooltip = true;
		}

		return _buffer_getTooltip;
	}

	String _buffer_getWreckName;
	boolean _buffer_isInitialized_getWreckName = false;
	@Override
	public String getWreckName() {

		if (!_buffer_isInitialized_getWreckName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getWreckName(this.getUnitDefId());
			_buffer_getWreckName = _ret_int;
			_buffer_isInitialized_getWreckName = true;
		}

		return _buffer_getWreckName;
	}

	String _buffer_getDeathExplosion;
	boolean _buffer_isInitialized_getDeathExplosion = false;
	@Override
	public String getDeathExplosion() {

		if (!_buffer_isInitialized_getDeathExplosion) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getDeathExplosion(this.getUnitDefId());
			_buffer_getDeathExplosion = _ret_int;
			_buffer_isInitialized_getDeathExplosion = true;
		}

		return _buffer_getDeathExplosion;
	}

	String _buffer_getSelfDExplosion;
	boolean _buffer_isInitialized_getSelfDExplosion = false;
	@Override
	public String getSelfDExplosion() {

		if (!_buffer_isInitialized_getSelfDExplosion) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getSelfDExplosion(this.getUnitDefId());
			_buffer_getSelfDExplosion = _ret_int;
			_buffer_isInitialized_getSelfDExplosion = true;
		}

		return _buffer_getSelfDExplosion;
	}

	String _buffer_getCategoryString;
	boolean _buffer_isInitialized_getCategoryString = false;
	/**
	 * Returns the name of the category this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	@Override
	public String getCategoryString() {

		if (!_buffer_isInitialized_getCategoryString) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_getCategoryString(this.getUnitDefId());
			_buffer_getCategoryString = _ret_int;
			_buffer_isInitialized_getCategoryString = true;
		}

		return _buffer_getCategoryString;
	}

	boolean _buffer_isAbleToSelfD;
	boolean _buffer_isInitialized_isAbleToSelfD = false;
	@Override
	public boolean isAbleToSelfD() {

		if (!_buffer_isInitialized_isAbleToSelfD) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToSelfD(this.getUnitDefId());
			_buffer_isAbleToSelfD = _ret_int;
			_buffer_isInitialized_isAbleToSelfD = true;
		}

		return _buffer_isAbleToSelfD;
	}

	int _buffer_getSelfDCountdown;
	boolean _buffer_isInitialized_getSelfDCountdown = false;
	@Override
	public int getSelfDCountdown() {

		if (!_buffer_isInitialized_getSelfDCountdown) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getSelfDCountdown(this.getUnitDefId());
			_buffer_getSelfDCountdown = _ret_int;
			_buffer_isInitialized_getSelfDCountdown = true;
		}

		return _buffer_getSelfDCountdown;
	}

	boolean _buffer_isAbleToSubmerge;
	boolean _buffer_isInitialized_isAbleToSubmerge = false;
	@Override
	public boolean isAbleToSubmerge() {

		if (!_buffer_isInitialized_isAbleToSubmerge) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToSubmerge(this.getUnitDefId());
			_buffer_isAbleToSubmerge = _ret_int;
			_buffer_isInitialized_isAbleToSubmerge = true;
		}

		return _buffer_isAbleToSubmerge;
	}

	boolean _buffer_isAbleToFly;
	boolean _buffer_isInitialized_isAbleToFly = false;
	@Override
	public boolean isAbleToFly() {

		if (!_buffer_isInitialized_isAbleToFly) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToFly(this.getUnitDefId());
			_buffer_isAbleToFly = _ret_int;
			_buffer_isInitialized_isAbleToFly = true;
		}

		return _buffer_isAbleToFly;
	}

	boolean _buffer_isAbleToMove;
	boolean _buffer_isInitialized_isAbleToMove = false;
	@Override
	public boolean isAbleToMove() {

		if (!_buffer_isInitialized_isAbleToMove) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToMove(this.getUnitDefId());
			_buffer_isAbleToMove = _ret_int;
			_buffer_isInitialized_isAbleToMove = true;
		}

		return _buffer_isAbleToMove;
	}

	boolean _buffer_isAbleToHover;
	boolean _buffer_isInitialized_isAbleToHover = false;
	@Override
	public boolean isAbleToHover() {

		if (!_buffer_isInitialized_isAbleToHover) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToHover(this.getUnitDefId());
			_buffer_isAbleToHover = _ret_int;
			_buffer_isInitialized_isAbleToHover = true;
		}

		return _buffer_isAbleToHover;
	}

	boolean _buffer_isFloater;
	boolean _buffer_isInitialized_isFloater = false;
	@Override
	public boolean isFloater() {

		if (!_buffer_isInitialized_isFloater) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isFloater(this.getUnitDefId());
			_buffer_isFloater = _ret_int;
			_buffer_isInitialized_isFloater = true;
		}

		return _buffer_isFloater;
	}

	boolean _buffer_isBuilder;
	boolean _buffer_isInitialized_isBuilder = false;
	@Override
	public boolean isBuilder() {

		if (!_buffer_isInitialized_isBuilder) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isBuilder(this.getUnitDefId());
			_buffer_isBuilder = _ret_int;
			_buffer_isInitialized_isBuilder = true;
		}

		return _buffer_isBuilder;
	}

	boolean _buffer_isActivateWhenBuilt;
	boolean _buffer_isInitialized_isActivateWhenBuilt = false;
	@Override
	public boolean isActivateWhenBuilt() {

		if (!_buffer_isInitialized_isActivateWhenBuilt) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isActivateWhenBuilt(this.getUnitDefId());
			_buffer_isActivateWhenBuilt = _ret_int;
			_buffer_isInitialized_isActivateWhenBuilt = true;
		}

		return _buffer_isActivateWhenBuilt;
	}

	boolean _buffer_isOnOffable;
	boolean _buffer_isInitialized_isOnOffable = false;
	@Override
	public boolean isOnOffable() {

		if (!_buffer_isInitialized_isOnOffable) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isOnOffable(this.getUnitDefId());
			_buffer_isOnOffable = _ret_int;
			_buffer_isInitialized_isOnOffable = true;
		}

		return _buffer_isOnOffable;
	}

	boolean _buffer_isFullHealthFactory;
	boolean _buffer_isInitialized_isFullHealthFactory = false;
	@Override
	public boolean isFullHealthFactory() {

		if (!_buffer_isInitialized_isFullHealthFactory) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isFullHealthFactory(this.getUnitDefId());
			_buffer_isFullHealthFactory = _ret_int;
			_buffer_isInitialized_isFullHealthFactory = true;
		}

		return _buffer_isFullHealthFactory;
	}

	boolean _buffer_isFactoryHeadingTakeoff;
	boolean _buffer_isInitialized_isFactoryHeadingTakeoff = false;
	@Override
	public boolean isFactoryHeadingTakeoff() {

		if (!_buffer_isInitialized_isFactoryHeadingTakeoff) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isFactoryHeadingTakeoff(this.getUnitDefId());
			_buffer_isFactoryHeadingTakeoff = _ret_int;
			_buffer_isInitialized_isFactoryHeadingTakeoff = true;
		}

		return _buffer_isFactoryHeadingTakeoff;
	}

	boolean _buffer_isReclaimable;
	boolean _buffer_isInitialized_isReclaimable = false;
	@Override
	public boolean isReclaimable() {

		if (!_buffer_isInitialized_isReclaimable) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isReclaimable(this.getUnitDefId());
			_buffer_isReclaimable = _ret_int;
			_buffer_isInitialized_isReclaimable = true;
		}

		return _buffer_isReclaimable;
	}

	boolean _buffer_isCapturable;
	boolean _buffer_isInitialized_isCapturable = false;
	@Override
	public boolean isCapturable() {

		if (!_buffer_isInitialized_isCapturable) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isCapturable(this.getUnitDefId());
			_buffer_isCapturable = _ret_int;
			_buffer_isInitialized_isCapturable = true;
		}

		return _buffer_isCapturable;
	}

	boolean _buffer_isAbleToRestore;
	boolean _buffer_isInitialized_isAbleToRestore = false;
	@Override
	public boolean isAbleToRestore() {

		if (!_buffer_isInitialized_isAbleToRestore) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToRestore(this.getUnitDefId());
			_buffer_isAbleToRestore = _ret_int;
			_buffer_isInitialized_isAbleToRestore = true;
		}

		return _buffer_isAbleToRestore;
	}

	boolean _buffer_isAbleToRepair;
	boolean _buffer_isInitialized_isAbleToRepair = false;
	@Override
	public boolean isAbleToRepair() {

		if (!_buffer_isInitialized_isAbleToRepair) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToRepair(this.getUnitDefId());
			_buffer_isAbleToRepair = _ret_int;
			_buffer_isInitialized_isAbleToRepair = true;
		}

		return _buffer_isAbleToRepair;
	}

	boolean _buffer_isAbleToSelfRepair;
	boolean _buffer_isInitialized_isAbleToSelfRepair = false;
	@Override
	public boolean isAbleToSelfRepair() {

		if (!_buffer_isInitialized_isAbleToSelfRepair) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToSelfRepair(this.getUnitDefId());
			_buffer_isAbleToSelfRepair = _ret_int;
			_buffer_isInitialized_isAbleToSelfRepair = true;
		}

		return _buffer_isAbleToSelfRepair;
	}

	boolean _buffer_isAbleToReclaim;
	boolean _buffer_isInitialized_isAbleToReclaim = false;
	@Override
	public boolean isAbleToReclaim() {

		if (!_buffer_isInitialized_isAbleToReclaim) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToReclaim(this.getUnitDefId());
			_buffer_isAbleToReclaim = _ret_int;
			_buffer_isInitialized_isAbleToReclaim = true;
		}

		return _buffer_isAbleToReclaim;
	}

	boolean _buffer_isAbleToAttack;
	boolean _buffer_isInitialized_isAbleToAttack = false;
	@Override
	public boolean isAbleToAttack() {

		if (!_buffer_isInitialized_isAbleToAttack) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToAttack(this.getUnitDefId());
			_buffer_isAbleToAttack = _ret_int;
			_buffer_isInitialized_isAbleToAttack = true;
		}

		return _buffer_isAbleToAttack;
	}

	boolean _buffer_isAbleToPatrol;
	boolean _buffer_isInitialized_isAbleToPatrol = false;
	@Override
	public boolean isAbleToPatrol() {

		if (!_buffer_isInitialized_isAbleToPatrol) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToPatrol(this.getUnitDefId());
			_buffer_isAbleToPatrol = _ret_int;
			_buffer_isInitialized_isAbleToPatrol = true;
		}

		return _buffer_isAbleToPatrol;
	}

	boolean _buffer_isAbleToFight;
	boolean _buffer_isInitialized_isAbleToFight = false;
	@Override
	public boolean isAbleToFight() {

		if (!_buffer_isInitialized_isAbleToFight) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToFight(this.getUnitDefId());
			_buffer_isAbleToFight = _ret_int;
			_buffer_isInitialized_isAbleToFight = true;
		}

		return _buffer_isAbleToFight;
	}

	boolean _buffer_isAbleToGuard;
	boolean _buffer_isInitialized_isAbleToGuard = false;
	@Override
	public boolean isAbleToGuard() {

		if (!_buffer_isInitialized_isAbleToGuard) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToGuard(this.getUnitDefId());
			_buffer_isAbleToGuard = _ret_int;
			_buffer_isInitialized_isAbleToGuard = true;
		}

		return _buffer_isAbleToGuard;
	}

	boolean _buffer_isAbleToAssist;
	boolean _buffer_isInitialized_isAbleToAssist = false;
	@Override
	public boolean isAbleToAssist() {

		if (!_buffer_isInitialized_isAbleToAssist) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToAssist(this.getUnitDefId());
			_buffer_isAbleToAssist = _ret_int;
			_buffer_isInitialized_isAbleToAssist = true;
		}

		return _buffer_isAbleToAssist;
	}

	boolean _buffer_isAssistable;
	boolean _buffer_isInitialized_isAssistable = false;
	@Override
	public boolean isAssistable() {

		if (!_buffer_isInitialized_isAssistable) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAssistable(this.getUnitDefId());
			_buffer_isAssistable = _ret_int;
			_buffer_isInitialized_isAssistable = true;
		}

		return _buffer_isAssistable;
	}

	boolean _buffer_isAbleToRepeat;
	boolean _buffer_isInitialized_isAbleToRepeat = false;
	@Override
	public boolean isAbleToRepeat() {

		if (!_buffer_isInitialized_isAbleToRepeat) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToRepeat(this.getUnitDefId());
			_buffer_isAbleToRepeat = _ret_int;
			_buffer_isInitialized_isAbleToRepeat = true;
		}

		return _buffer_isAbleToRepeat;
	}

	boolean _buffer_isAbleToFireControl;
	boolean _buffer_isInitialized_isAbleToFireControl = false;
	@Override
	public boolean isAbleToFireControl() {

		if (!_buffer_isInitialized_isAbleToFireControl) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToFireControl(this.getUnitDefId());
			_buffer_isAbleToFireControl = _ret_int;
			_buffer_isInitialized_isAbleToFireControl = true;
		}

		return _buffer_isAbleToFireControl;
	}

	int _buffer_getFireState;
	boolean _buffer_isInitialized_getFireState = false;
	@Override
	public int getFireState() {

		if (!_buffer_isInitialized_getFireState) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getFireState(this.getUnitDefId());
			_buffer_getFireState = _ret_int;
			_buffer_isInitialized_getFireState = true;
		}

		return _buffer_getFireState;
	}

	int _buffer_getMoveState;
	boolean _buffer_isInitialized_getMoveState = false;
	@Override
	public int getMoveState() {

		if (!_buffer_isInitialized_getMoveState) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getMoveState(this.getUnitDefId());
			_buffer_getMoveState = _ret_int;
			_buffer_isInitialized_getMoveState = true;
		}

		return _buffer_getMoveState;
	}

	float _buffer_getWingDrag;
	boolean _buffer_isInitialized_getWingDrag = false;
	@Override
	public float getWingDrag() {

		if (!_buffer_isInitialized_getWingDrag) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getWingDrag(this.getUnitDefId());
			_buffer_getWingDrag = _ret_int;
			_buffer_isInitialized_getWingDrag = true;
		}

		return _buffer_getWingDrag;
	}

	float _buffer_getWingAngle;
	boolean _buffer_isInitialized_getWingAngle = false;
	@Override
	public float getWingAngle() {

		if (!_buffer_isInitialized_getWingAngle) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getWingAngle(this.getUnitDefId());
			_buffer_getWingAngle = _ret_int;
			_buffer_isInitialized_getWingAngle = true;
		}

		return _buffer_getWingAngle;
	}

	float _buffer_getDrag;
	boolean _buffer_isInitialized_getDrag = false;
	@Override
	public float getDrag() {

		if (!_buffer_isInitialized_getDrag) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getDrag(this.getUnitDefId());
			_buffer_getDrag = _ret_int;
			_buffer_isInitialized_getDrag = true;
		}

		return _buffer_getDrag;
	}

	float _buffer_getFrontToSpeed;
	boolean _buffer_isInitialized_getFrontToSpeed = false;
	@Override
	public float getFrontToSpeed() {

		if (!_buffer_isInitialized_getFrontToSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getFrontToSpeed(this.getUnitDefId());
			_buffer_getFrontToSpeed = _ret_int;
			_buffer_isInitialized_getFrontToSpeed = true;
		}

		return _buffer_getFrontToSpeed;
	}

	float _buffer_getSpeedToFront;
	boolean _buffer_isInitialized_getSpeedToFront = false;
	@Override
	public float getSpeedToFront() {

		if (!_buffer_isInitialized_getSpeedToFront) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getSpeedToFront(this.getUnitDefId());
			_buffer_getSpeedToFront = _ret_int;
			_buffer_isInitialized_getSpeedToFront = true;
		}

		return _buffer_getSpeedToFront;
	}

	float _buffer_getMyGravity;
	boolean _buffer_isInitialized_getMyGravity = false;
	@Override
	public float getMyGravity() {

		if (!_buffer_isInitialized_getMyGravity) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMyGravity(this.getUnitDefId());
			_buffer_getMyGravity = _ret_int;
			_buffer_isInitialized_getMyGravity = true;
		}

		return _buffer_getMyGravity;
	}

	float _buffer_getMaxBank;
	boolean _buffer_isInitialized_getMaxBank = false;
	@Override
	public float getMaxBank() {

		if (!_buffer_isInitialized_getMaxBank) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxBank(this.getUnitDefId());
			_buffer_getMaxBank = _ret_int;
			_buffer_isInitialized_getMaxBank = true;
		}

		return _buffer_getMaxBank;
	}

	float _buffer_getMaxPitch;
	boolean _buffer_isInitialized_getMaxPitch = false;
	@Override
	public float getMaxPitch() {

		if (!_buffer_isInitialized_getMaxPitch) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxPitch(this.getUnitDefId());
			_buffer_getMaxPitch = _ret_int;
			_buffer_isInitialized_getMaxPitch = true;
		}

		return _buffer_getMaxPitch;
	}

	float _buffer_getTurnRadius;
	boolean _buffer_isInitialized_getTurnRadius = false;
	@Override
	public float getTurnRadius() {

		if (!_buffer_isInitialized_getTurnRadius) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTurnRadius(this.getUnitDefId());
			_buffer_getTurnRadius = _ret_int;
			_buffer_isInitialized_getTurnRadius = true;
		}

		return _buffer_getTurnRadius;
	}

	float _buffer_getWantedHeight;
	boolean _buffer_isInitialized_getWantedHeight = false;
	@Override
	public float getWantedHeight() {

		if (!_buffer_isInitialized_getWantedHeight) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getWantedHeight(this.getUnitDefId());
			_buffer_getWantedHeight = _ret_int;
			_buffer_isInitialized_getWantedHeight = true;
		}

		return _buffer_getWantedHeight;
	}

	float _buffer_getVerticalSpeed;
	boolean _buffer_isInitialized_getVerticalSpeed = false;
	@Override
	public float getVerticalSpeed() {

		if (!_buffer_isInitialized_getVerticalSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getVerticalSpeed(this.getUnitDefId());
			_buffer_getVerticalSpeed = _ret_int;
			_buffer_isInitialized_getVerticalSpeed = true;
		}

		return _buffer_getVerticalSpeed;
	}

	boolean _buffer_isAbleToCrash;
	boolean _buffer_isInitialized_isAbleToCrash = false;
	/**
	 * @deprecated
	 */
	@Override
	public boolean isAbleToCrash() {

		if (!_buffer_isInitialized_isAbleToCrash) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToCrash(this.getUnitDefId());
			_buffer_isAbleToCrash = _ret_int;
			_buffer_isInitialized_isAbleToCrash = true;
		}

		return _buffer_isAbleToCrash;
	}

	boolean _buffer_isHoverAttack;
	boolean _buffer_isInitialized_isHoverAttack = false;
	/**
	 * @deprecated
	 */
	@Override
	public boolean isHoverAttack() {

		if (!_buffer_isInitialized_isHoverAttack) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isHoverAttack(this.getUnitDefId());
			_buffer_isHoverAttack = _ret_int;
			_buffer_isInitialized_isHoverAttack = true;
		}

		return _buffer_isHoverAttack;
	}

	boolean _buffer_isAirStrafe;
	boolean _buffer_isInitialized_isAirStrafe = false;
	@Override
	public boolean isAirStrafe() {

		if (!_buffer_isInitialized_isAirStrafe) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAirStrafe(this.getUnitDefId());
			_buffer_isAirStrafe = _ret_int;
			_buffer_isInitialized_isAirStrafe = true;
		}

		return _buffer_isAirStrafe;
	}

	float _buffer_getDlHoverFactor;
	boolean _buffer_isInitialized_getDlHoverFactor = false;
	/**
	 * @return  < 0:  it can land
	 *          >= 0: how much the unit will move during hovering on the spot
	 */
	@Override
	public float getDlHoverFactor() {

		if (!_buffer_isInitialized_getDlHoverFactor) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getDlHoverFactor(this.getUnitDefId());
			_buffer_getDlHoverFactor = _ret_int;
			_buffer_isInitialized_getDlHoverFactor = true;
		}

		return _buffer_getDlHoverFactor;
	}

	float _buffer_getMaxAcceleration;
	boolean _buffer_isInitialized_getMaxAcceleration = false;
	@Override
	public float getMaxAcceleration() {

		if (!_buffer_isInitialized_getMaxAcceleration) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxAcceleration(this.getUnitDefId());
			_buffer_getMaxAcceleration = _ret_int;
			_buffer_isInitialized_getMaxAcceleration = true;
		}

		return _buffer_getMaxAcceleration;
	}

	float _buffer_getMaxDeceleration;
	boolean _buffer_isInitialized_getMaxDeceleration = false;
	@Override
	public float getMaxDeceleration() {

		if (!_buffer_isInitialized_getMaxDeceleration) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxDeceleration(this.getUnitDefId());
			_buffer_getMaxDeceleration = _ret_int;
			_buffer_isInitialized_getMaxDeceleration = true;
		}

		return _buffer_getMaxDeceleration;
	}

	float _buffer_getMaxAileron;
	boolean _buffer_isInitialized_getMaxAileron = false;
	@Override
	public float getMaxAileron() {

		if (!_buffer_isInitialized_getMaxAileron) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxAileron(this.getUnitDefId());
			_buffer_getMaxAileron = _ret_int;
			_buffer_isInitialized_getMaxAileron = true;
		}

		return _buffer_getMaxAileron;
	}

	float _buffer_getMaxElevator;
	boolean _buffer_isInitialized_getMaxElevator = false;
	@Override
	public float getMaxElevator() {

		if (!_buffer_isInitialized_getMaxElevator) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxElevator(this.getUnitDefId());
			_buffer_getMaxElevator = _ret_int;
			_buffer_isInitialized_getMaxElevator = true;
		}

		return _buffer_getMaxElevator;
	}

	float _buffer_getMaxRudder;
	boolean _buffer_isInitialized_getMaxRudder = false;
	@Override
	public float getMaxRudder() {

		if (!_buffer_isInitialized_getMaxRudder) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxRudder(this.getUnitDefId());
			_buffer_getMaxRudder = _ret_int;
			_buffer_isInitialized_getMaxRudder = true;
		}

		return _buffer_getMaxRudder;
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

		int yardMap_sizeMax;
		int yardMap_raw_size;
		short[] yardMap;
		java.util.List<Short> yardMap_list;
		int yardMap_size;
		int _ret_int;

		yardMap_sizeMax = Integer.MAX_VALUE;
		yardMap = null;
		yardMap_size = innerCallback.UnitDef_getYardMap(this.getUnitDefId(), facing, yardMap, yardMap_sizeMax);
		yardMap_sizeMax = yardMap_size;
		yardMap_raw_size = yardMap_size;
		yardMap = new short[yardMap_raw_size];

		_ret_int = innerCallback.UnitDef_getYardMap(this.getUnitDefId(), facing, yardMap, yardMap_sizeMax);
		yardMap_list = new java.util.ArrayList<Short>(yardMap_size);
		for (int i=0; i < yardMap_sizeMax; i++) {
			yardMap_list.add(yardMap[i]);
		}

		return yardMap_list;
	}

	int _buffer_getXSize;
	boolean _buffer_isInitialized_getXSize = false;
	@Override
	public int getXSize() {

		if (!_buffer_isInitialized_getXSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getXSize(this.getUnitDefId());
			_buffer_getXSize = _ret_int;
			_buffer_isInitialized_getXSize = true;
		}

		return _buffer_getXSize;
	}

	int _buffer_getZSize;
	boolean _buffer_isInitialized_getZSize = false;
	@Override
	public int getZSize() {

		if (!_buffer_isInitialized_getZSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getZSize(this.getUnitDefId());
			_buffer_getZSize = _ret_int;
			_buffer_isInitialized_getZSize = true;
		}

		return _buffer_getZSize;
	}

	int _buffer_getBuildAngle;
	boolean _buffer_isInitialized_getBuildAngle = false;
	/**
	 * @deprecated
	 */
	@Override
	public int getBuildAngle() {

		if (!_buffer_isInitialized_getBuildAngle) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildAngle(this.getUnitDefId());
			_buffer_getBuildAngle = _ret_int;
			_buffer_isInitialized_getBuildAngle = true;
		}

		return _buffer_getBuildAngle;
	}

	float _buffer_getLoadingRadius;
	boolean _buffer_isInitialized_getLoadingRadius = false;
	@Override
	public float getLoadingRadius() {

		if (!_buffer_isInitialized_getLoadingRadius) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getLoadingRadius(this.getUnitDefId());
			_buffer_getLoadingRadius = _ret_int;
			_buffer_isInitialized_getLoadingRadius = true;
		}

		return _buffer_getLoadingRadius;
	}

	float _buffer_getUnloadSpread;
	boolean _buffer_isInitialized_getUnloadSpread = false;
	@Override
	public float getUnloadSpread() {

		if (!_buffer_isInitialized_getUnloadSpread) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getUnloadSpread(this.getUnitDefId());
			_buffer_getUnloadSpread = _ret_int;
			_buffer_isInitialized_getUnloadSpread = true;
		}

		return _buffer_getUnloadSpread;
	}

	int _buffer_getTransportCapacity;
	boolean _buffer_isInitialized_getTransportCapacity = false;
	@Override
	public int getTransportCapacity() {

		if (!_buffer_isInitialized_getTransportCapacity) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getTransportCapacity(this.getUnitDefId());
			_buffer_getTransportCapacity = _ret_int;
			_buffer_isInitialized_getTransportCapacity = true;
		}

		return _buffer_getTransportCapacity;
	}

	int _buffer_getTransportSize;
	boolean _buffer_isInitialized_getTransportSize = false;
	@Override
	public int getTransportSize() {

		if (!_buffer_isInitialized_getTransportSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getTransportSize(this.getUnitDefId());
			_buffer_getTransportSize = _ret_int;
			_buffer_isInitialized_getTransportSize = true;
		}

		return _buffer_getTransportSize;
	}

	int _buffer_getMinTransportSize;
	boolean _buffer_isInitialized_getMinTransportSize = false;
	@Override
	public int getMinTransportSize() {

		if (!_buffer_isInitialized_getMinTransportSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getMinTransportSize(this.getUnitDefId());
			_buffer_getMinTransportSize = _ret_int;
			_buffer_isInitialized_getMinTransportSize = true;
		}

		return _buffer_getMinTransportSize;
	}

	boolean _buffer_isAirBase;
	boolean _buffer_isInitialized_isAirBase = false;
	@Override
	public boolean isAirBase() {

		if (!_buffer_isInitialized_isAirBase) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAirBase(this.getUnitDefId());
			_buffer_isAirBase = _ret_int;
			_buffer_isInitialized_isAirBase = true;
		}

		return _buffer_isAirBase;
	}

	boolean _buffer_isFirePlatform;
	boolean _buffer_isInitialized_isFirePlatform = false;
	@Override
	public boolean isFirePlatform() {

		if (!_buffer_isInitialized_isFirePlatform) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isFirePlatform(this.getUnitDefId());
			_buffer_isFirePlatform = _ret_int;
			_buffer_isInitialized_isFirePlatform = true;
		}

		return _buffer_isFirePlatform;
	}

	float _buffer_getTransportMass;
	boolean _buffer_isInitialized_getTransportMass = false;
	@Override
	public float getTransportMass() {

		if (!_buffer_isInitialized_getTransportMass) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTransportMass(this.getUnitDefId());
			_buffer_getTransportMass = _ret_int;
			_buffer_isInitialized_getTransportMass = true;
		}

		return _buffer_getTransportMass;
	}

	float _buffer_getMinTransportMass;
	boolean _buffer_isInitialized_getMinTransportMass = false;
	@Override
	public float getMinTransportMass() {

		if (!_buffer_isInitialized_getMinTransportMass) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMinTransportMass(this.getUnitDefId());
			_buffer_getMinTransportMass = _ret_int;
			_buffer_isInitialized_getMinTransportMass = true;
		}

		return _buffer_getMinTransportMass;
	}

	boolean _buffer_isHoldSteady;
	boolean _buffer_isInitialized_isHoldSteady = false;
	@Override
	public boolean isHoldSteady() {

		if (!_buffer_isInitialized_isHoldSteady) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isHoldSteady(this.getUnitDefId());
			_buffer_isHoldSteady = _ret_int;
			_buffer_isInitialized_isHoldSteady = true;
		}

		return _buffer_isHoldSteady;
	}

	boolean _buffer_isReleaseHeld;
	boolean _buffer_isInitialized_isReleaseHeld = false;
	@Override
	public boolean isReleaseHeld() {

		if (!_buffer_isInitialized_isReleaseHeld) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isReleaseHeld(this.getUnitDefId());
			_buffer_isReleaseHeld = _ret_int;
			_buffer_isInitialized_isReleaseHeld = true;
		}

		return _buffer_isReleaseHeld;
	}

	boolean _buffer_isNotTransportable;
	boolean _buffer_isInitialized_isNotTransportable = false;
	@Override
	public boolean isNotTransportable() {

		if (!_buffer_isInitialized_isNotTransportable) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isNotTransportable(this.getUnitDefId());
			_buffer_isNotTransportable = _ret_int;
			_buffer_isInitialized_isNotTransportable = true;
		}

		return _buffer_isNotTransportable;
	}

	boolean _buffer_isTransportByEnemy;
	boolean _buffer_isInitialized_isTransportByEnemy = false;
	@Override
	public boolean isTransportByEnemy() {

		if (!_buffer_isInitialized_isTransportByEnemy) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isTransportByEnemy(this.getUnitDefId());
			_buffer_isTransportByEnemy = _ret_int;
			_buffer_isInitialized_isTransportByEnemy = true;
		}

		return _buffer_isTransportByEnemy;
	}

	int _buffer_getTransportUnloadMethod;
	boolean _buffer_isInitialized_getTransportUnloadMethod = false;
	/**
	 * @return  0: land unload
	 *          1: fly-over drop
	 *          2: land flood
	 */
	@Override
	public int getTransportUnloadMethod() {

		if (!_buffer_isInitialized_getTransportUnloadMethod) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getTransportUnloadMethod(this.getUnitDefId());
			_buffer_getTransportUnloadMethod = _ret_int;
			_buffer_isInitialized_getTransportUnloadMethod = true;
		}

		return _buffer_getTransportUnloadMethod;
	}

	float _buffer_getFallSpeed;
	boolean _buffer_isInitialized_getFallSpeed = false;
	/**
	 * Dictates fall speed of all transported units.
	 * This only makes sense for air transports,
	 * if they an drop units while in the air.
	 */
	@Override
	public float getFallSpeed() {

		if (!_buffer_isInitialized_getFallSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getFallSpeed(this.getUnitDefId());
			_buffer_getFallSpeed = _ret_int;
			_buffer_isInitialized_getFallSpeed = true;
		}

		return _buffer_getFallSpeed;
	}

	float _buffer_getUnitFallSpeed;
	boolean _buffer_isInitialized_getUnitFallSpeed = false;
	/**
	 * Sets the transported units FBI, overrides fallSpeed
	 */
	@Override
	public float getUnitFallSpeed() {

		if (!_buffer_isInitialized_getUnitFallSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getUnitFallSpeed(this.getUnitDefId());
			_buffer_getUnitFallSpeed = _ret_int;
			_buffer_isInitialized_getUnitFallSpeed = true;
		}

		return _buffer_getUnitFallSpeed;
	}

	boolean _buffer_isAbleToCloak;
	boolean _buffer_isInitialized_isAbleToCloak = false;
	/**
	 * If the unit can cloak
	 */
	@Override
	public boolean isAbleToCloak() {

		if (!_buffer_isInitialized_isAbleToCloak) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToCloak(this.getUnitDefId());
			_buffer_isAbleToCloak = _ret_int;
			_buffer_isInitialized_isAbleToCloak = true;
		}

		return _buffer_isAbleToCloak;
	}

	boolean _buffer_isStartCloaked;
	boolean _buffer_isInitialized_isStartCloaked = false;
	/**
	 * If the unit wants to start out cloaked
	 */
	@Override
	public boolean isStartCloaked() {

		if (!_buffer_isInitialized_isStartCloaked) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isStartCloaked(this.getUnitDefId());
			_buffer_isStartCloaked = _ret_int;
			_buffer_isInitialized_isStartCloaked = true;
		}

		return _buffer_isStartCloaked;
	}

	float _buffer_getCloakCost;
	boolean _buffer_isInitialized_getCloakCost = false;
	/**
	 * Energy cost per second to stay cloaked when stationary
	 */
	@Override
	public float getCloakCost() {

		if (!_buffer_isInitialized_getCloakCost) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getCloakCost(this.getUnitDefId());
			_buffer_getCloakCost = _ret_int;
			_buffer_isInitialized_getCloakCost = true;
		}

		return _buffer_getCloakCost;
	}

	float _buffer_getCloakCostMoving;
	boolean _buffer_isInitialized_getCloakCostMoving = false;
	/**
	 * Energy cost per second to stay cloaked when moving
	 */
	@Override
	public float getCloakCostMoving() {

		if (!_buffer_isInitialized_getCloakCostMoving) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getCloakCostMoving(this.getUnitDefId());
			_buffer_getCloakCostMoving = _ret_int;
			_buffer_isInitialized_getCloakCostMoving = true;
		}

		return _buffer_getCloakCostMoving;
	}

	float _buffer_getDecloakDistance;
	boolean _buffer_isInitialized_getDecloakDistance = false;
	/**
	 * If enemy unit comes within this range, decloaking is forced
	 */
	@Override
	public float getDecloakDistance() {

		if (!_buffer_isInitialized_getDecloakDistance) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getDecloakDistance(this.getUnitDefId());
			_buffer_getDecloakDistance = _ret_int;
			_buffer_isInitialized_getDecloakDistance = true;
		}

		return _buffer_getDecloakDistance;
	}

	boolean _buffer_isDecloakSpherical;
	boolean _buffer_isInitialized_isDecloakSpherical = false;
	/**
	 * Use a spherical, instead of a cylindrical test?
	 */
	@Override
	public boolean isDecloakSpherical() {

		if (!_buffer_isInitialized_isDecloakSpherical) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isDecloakSpherical(this.getUnitDefId());
			_buffer_isDecloakSpherical = _ret_int;
			_buffer_isInitialized_isDecloakSpherical = true;
		}

		return _buffer_isDecloakSpherical;
	}

	boolean _buffer_isDecloakOnFire;
	boolean _buffer_isInitialized_isDecloakOnFire = false;
	/**
	 * Will the unit decloak upon firing?
	 */
	@Override
	public boolean isDecloakOnFire() {

		if (!_buffer_isInitialized_isDecloakOnFire) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isDecloakOnFire(this.getUnitDefId());
			_buffer_isDecloakOnFire = _ret_int;
			_buffer_isInitialized_isDecloakOnFire = true;
		}

		return _buffer_isDecloakOnFire;
	}

	boolean _buffer_isAbleToKamikaze;
	boolean _buffer_isInitialized_isAbleToKamikaze = false;
	/**
	 * Will the unit self destruct if an enemy comes to close?
	 */
	@Override
	public boolean isAbleToKamikaze() {

		if (!_buffer_isInitialized_isAbleToKamikaze) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToKamikaze(this.getUnitDefId());
			_buffer_isAbleToKamikaze = _ret_int;
			_buffer_isInitialized_isAbleToKamikaze = true;
		}

		return _buffer_isAbleToKamikaze;
	}

	float _buffer_getKamikazeDist;
	boolean _buffer_isInitialized_getKamikazeDist = false;
	@Override
	public float getKamikazeDist() {

		if (!_buffer_isInitialized_getKamikazeDist) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getKamikazeDist(this.getUnitDefId());
			_buffer_getKamikazeDist = _ret_int;
			_buffer_isInitialized_getKamikazeDist = true;
		}

		return _buffer_getKamikazeDist;
	}

	boolean _buffer_isTargetingFacility;
	boolean _buffer_isInitialized_isTargetingFacility = false;
	@Override
	public boolean isTargetingFacility() {

		if (!_buffer_isInitialized_isTargetingFacility) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isTargetingFacility(this.getUnitDefId());
			_buffer_isTargetingFacility = _ret_int;
			_buffer_isInitialized_isTargetingFacility = true;
		}

		return _buffer_isTargetingFacility;
	}

	boolean _buffer_canManualFire;
	boolean _buffer_isInitialized_canManualFire = false;
	@Override
	public boolean canManualFire() {

		if (!_buffer_isInitialized_canManualFire) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_canManualFire(this.getUnitDefId());
			_buffer_canManualFire = _ret_int;
			_buffer_isInitialized_canManualFire = true;
		}

		return _buffer_canManualFire;
	}

	boolean _buffer_isNeedGeo;
	boolean _buffer_isInitialized_isNeedGeo = false;
	@Override
	public boolean isNeedGeo() {

		if (!_buffer_isInitialized_isNeedGeo) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isNeedGeo(this.getUnitDefId());
			_buffer_isNeedGeo = _ret_int;
			_buffer_isInitialized_isNeedGeo = true;
		}

		return _buffer_isNeedGeo;
	}

	boolean _buffer_isFeature;
	boolean _buffer_isInitialized_isFeature = false;
	@Override
	public boolean isFeature() {

		if (!_buffer_isInitialized_isFeature) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isFeature(this.getUnitDefId());
			_buffer_isFeature = _ret_int;
			_buffer_isInitialized_isFeature = true;
		}

		return _buffer_isFeature;
	}

	boolean _buffer_isHideDamage;
	boolean _buffer_isInitialized_isHideDamage = false;
	@Override
	public boolean isHideDamage() {

		if (!_buffer_isInitialized_isHideDamage) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isHideDamage(this.getUnitDefId());
			_buffer_isHideDamage = _ret_int;
			_buffer_isInitialized_isHideDamage = true;
		}

		return _buffer_isHideDamage;
	}

	boolean _buffer_isCommander;
	boolean _buffer_isInitialized_isCommander = false;
	@Override
	public boolean isCommander() {

		if (!_buffer_isInitialized_isCommander) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isCommander(this.getUnitDefId());
			_buffer_isCommander = _ret_int;
			_buffer_isInitialized_isCommander = true;
		}

		return _buffer_isCommander;
	}

	boolean _buffer_isShowPlayerName;
	boolean _buffer_isInitialized_isShowPlayerName = false;
	@Override
	public boolean isShowPlayerName() {

		if (!_buffer_isInitialized_isShowPlayerName) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isShowPlayerName(this.getUnitDefId());
			_buffer_isShowPlayerName = _ret_int;
			_buffer_isInitialized_isShowPlayerName = true;
		}

		return _buffer_isShowPlayerName;
	}

	boolean _buffer_isAbleToResurrect;
	boolean _buffer_isInitialized_isAbleToResurrect = false;
	@Override
	public boolean isAbleToResurrect() {

		if (!_buffer_isInitialized_isAbleToResurrect) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToResurrect(this.getUnitDefId());
			_buffer_isAbleToResurrect = _ret_int;
			_buffer_isInitialized_isAbleToResurrect = true;
		}

		return _buffer_isAbleToResurrect;
	}

	boolean _buffer_isAbleToCapture;
	boolean _buffer_isInitialized_isAbleToCapture = false;
	@Override
	public boolean isAbleToCapture() {

		if (!_buffer_isInitialized_isAbleToCapture) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToCapture(this.getUnitDefId());
			_buffer_isAbleToCapture = _ret_int;
			_buffer_isInitialized_isAbleToCapture = true;
		}

		return _buffer_isAbleToCapture;
	}

	int _buffer_getHighTrajectoryType;
	boolean _buffer_isInitialized_getHighTrajectoryType = false;
	/**
	 * Indicates the trajectory types supported by this unit.
	 * 
	 * @return  0: (default) = only low
	 *          1: only high
	 *          2: choose
	 */
	@Override
	public int getHighTrajectoryType() {

		if (!_buffer_isInitialized_getHighTrajectoryType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getHighTrajectoryType(this.getUnitDefId());
			_buffer_getHighTrajectoryType = _ret_int;
			_buffer_isInitialized_getHighTrajectoryType = true;
		}

		return _buffer_getHighTrajectoryType;
	}

	int _buffer_getNoChaseCategory;
	boolean _buffer_isInitialized_getNoChaseCategory = false;
	/**
	 * Returns the bit field value denoting the categories this unit shall not
	 * chase.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	@Override
	public int getNoChaseCategory() {

		if (!_buffer_isInitialized_getNoChaseCategory) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getNoChaseCategory(this.getUnitDefId());
			_buffer_getNoChaseCategory = _ret_int;
			_buffer_isInitialized_getNoChaseCategory = true;
		}

		return _buffer_getNoChaseCategory;
	}

	boolean _buffer_isLeaveTracks;
	boolean _buffer_isInitialized_isLeaveTracks = false;
	@Override
	public boolean isLeaveTracks() {

		if (!_buffer_isInitialized_isLeaveTracks) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isLeaveTracks(this.getUnitDefId());
			_buffer_isLeaveTracks = _ret_int;
			_buffer_isInitialized_isLeaveTracks = true;
		}

		return _buffer_isLeaveTracks;
	}

	float _buffer_getTrackWidth;
	boolean _buffer_isInitialized_getTrackWidth = false;
	@Override
	public float getTrackWidth() {

		if (!_buffer_isInitialized_getTrackWidth) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTrackWidth(this.getUnitDefId());
			_buffer_getTrackWidth = _ret_int;
			_buffer_isInitialized_getTrackWidth = true;
		}

		return _buffer_getTrackWidth;
	}

	float _buffer_getTrackOffset;
	boolean _buffer_isInitialized_getTrackOffset = false;
	@Override
	public float getTrackOffset() {

		if (!_buffer_isInitialized_getTrackOffset) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTrackOffset(this.getUnitDefId());
			_buffer_getTrackOffset = _ret_int;
			_buffer_isInitialized_getTrackOffset = true;
		}

		return _buffer_getTrackOffset;
	}

	float _buffer_getTrackStrength;
	boolean _buffer_isInitialized_getTrackStrength = false;
	@Override
	public float getTrackStrength() {

		if (!_buffer_isInitialized_getTrackStrength) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTrackStrength(this.getUnitDefId());
			_buffer_getTrackStrength = _ret_int;
			_buffer_isInitialized_getTrackStrength = true;
		}

		return _buffer_getTrackStrength;
	}

	float _buffer_getTrackStretch;
	boolean _buffer_isInitialized_getTrackStretch = false;
	@Override
	public float getTrackStretch() {

		if (!_buffer_isInitialized_getTrackStretch) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getTrackStretch(this.getUnitDefId());
			_buffer_getTrackStretch = _ret_int;
			_buffer_isInitialized_getTrackStretch = true;
		}

		return _buffer_getTrackStretch;
	}

	int _buffer_getTrackType;
	boolean _buffer_isInitialized_getTrackType = false;
	@Override
	public int getTrackType() {

		if (!_buffer_isInitialized_getTrackType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getTrackType(this.getUnitDefId());
			_buffer_getTrackType = _ret_int;
			_buffer_isInitialized_getTrackType = true;
		}

		return _buffer_getTrackType;
	}

	boolean _buffer_isAbleToDropFlare;
	boolean _buffer_isInitialized_isAbleToDropFlare = false;
	@Override
	public boolean isAbleToDropFlare() {

		if (!_buffer_isInitialized_isAbleToDropFlare) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToDropFlare(this.getUnitDefId());
			_buffer_isAbleToDropFlare = _ret_int;
			_buffer_isInitialized_isAbleToDropFlare = true;
		}

		return _buffer_isAbleToDropFlare;
	}

	float _buffer_getFlareReloadTime;
	boolean _buffer_isInitialized_getFlareReloadTime = false;
	@Override
	public float getFlareReloadTime() {

		if (!_buffer_isInitialized_getFlareReloadTime) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareReloadTime(this.getUnitDefId());
			_buffer_getFlareReloadTime = _ret_int;
			_buffer_isInitialized_getFlareReloadTime = true;
		}

		return _buffer_getFlareReloadTime;
	}

	float _buffer_getFlareEfficiency;
	boolean _buffer_isInitialized_getFlareEfficiency = false;
	@Override
	public float getFlareEfficiency() {

		if (!_buffer_isInitialized_getFlareEfficiency) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareEfficiency(this.getUnitDefId());
			_buffer_getFlareEfficiency = _ret_int;
			_buffer_isInitialized_getFlareEfficiency = true;
		}

		return _buffer_getFlareEfficiency;
	}

	float _buffer_getFlareDelay;
	boolean _buffer_isInitialized_getFlareDelay = false;
	@Override
	public float getFlareDelay() {

		if (!_buffer_isInitialized_getFlareDelay) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareDelay(this.getUnitDefId());
			_buffer_getFlareDelay = _ret_int;
			_buffer_isInitialized_getFlareDelay = true;
		}

		return _buffer_getFlareDelay;
	}

	AIFloat3 _buffer_getFlareDropVector;
	boolean _buffer_isInitialized_getFlareDropVector = false;
	@Override
	public AIFloat3 getFlareDropVector() {

		if (!_buffer_isInitialized_getFlareDropVector) {
		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

			innerCallback.UnitDef_getFlareDropVector(this.getUnitDefId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

			_buffer_getFlareDropVector = _ret;
			_buffer_isInitialized_getFlareDropVector = true;
		}

		return _buffer_getFlareDropVector;
	}

	int _buffer_getFlareTime;
	boolean _buffer_isInitialized_getFlareTime = false;
	@Override
	public int getFlareTime() {

		if (!_buffer_isInitialized_getFlareTime) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareTime(this.getUnitDefId());
			_buffer_getFlareTime = _ret_int;
			_buffer_isInitialized_getFlareTime = true;
		}

		return _buffer_getFlareTime;
	}

	int _buffer_getFlareSalvoSize;
	boolean _buffer_isInitialized_getFlareSalvoSize = false;
	@Override
	public int getFlareSalvoSize() {

		if (!_buffer_isInitialized_getFlareSalvoSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareSalvoSize(this.getUnitDefId());
			_buffer_getFlareSalvoSize = _ret_int;
			_buffer_isInitialized_getFlareSalvoSize = true;
		}

		return _buffer_getFlareSalvoSize;
	}

	int _buffer_getFlareSalvoDelay;
	boolean _buffer_isInitialized_getFlareSalvoDelay = false;
	@Override
	public int getFlareSalvoDelay() {

		if (!_buffer_isInitialized_getFlareSalvoDelay) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getFlareSalvoDelay(this.getUnitDefId());
			_buffer_getFlareSalvoDelay = _ret_int;
			_buffer_isInitialized_getFlareSalvoDelay = true;
		}

		return _buffer_getFlareSalvoDelay;
	}

	boolean _buffer_isAbleToLoopbackAttack;
	boolean _buffer_isInitialized_isAbleToLoopbackAttack = false;
	/**
	 * Only matters for fighter aircraft
	 */
	@Override
	public boolean isAbleToLoopbackAttack() {

		if (!_buffer_isInitialized_isAbleToLoopbackAttack) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isAbleToLoopbackAttack(this.getUnitDefId());
			_buffer_isAbleToLoopbackAttack = _ret_int;
			_buffer_isInitialized_isAbleToLoopbackAttack = true;
		}

		return _buffer_isAbleToLoopbackAttack;
	}

	boolean _buffer_isLevelGround;
	boolean _buffer_isInitialized_isLevelGround = false;
	/**
	 * Indicates whether the ground will be leveled/flattened out
	 * after this building has been built on it.
	 * Only matters for buildings.
	 */
	@Override
	public boolean isLevelGround() {

		if (!_buffer_isInitialized_isLevelGround) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isLevelGround(this.getUnitDefId());
			_buffer_isLevelGround = _ret_int;
			_buffer_isInitialized_isLevelGround = true;
		}

		return _buffer_isLevelGround;
	}

	boolean _buffer_isUseBuildingGroundDecal;
	boolean _buffer_isInitialized_isUseBuildingGroundDecal = false;
	@Override
	public boolean isUseBuildingGroundDecal() {

		if (!_buffer_isInitialized_isUseBuildingGroundDecal) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isUseBuildingGroundDecal(this.getUnitDefId());
			_buffer_isUseBuildingGroundDecal = _ret_int;
			_buffer_isInitialized_isUseBuildingGroundDecal = true;
		}

		return _buffer_isUseBuildingGroundDecal;
	}

	int _buffer_getBuildingDecalType;
	boolean _buffer_isInitialized_getBuildingDecalType = false;
	@Override
	public int getBuildingDecalType() {

		if (!_buffer_isInitialized_getBuildingDecalType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildingDecalType(this.getUnitDefId());
			_buffer_getBuildingDecalType = _ret_int;
			_buffer_isInitialized_getBuildingDecalType = true;
		}

		return _buffer_getBuildingDecalType;
	}

	int _buffer_getBuildingDecalSizeX;
	boolean _buffer_isInitialized_getBuildingDecalSizeX = false;
	@Override
	public int getBuildingDecalSizeX() {

		if (!_buffer_isInitialized_getBuildingDecalSizeX) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildingDecalSizeX(this.getUnitDefId());
			_buffer_getBuildingDecalSizeX = _ret_int;
			_buffer_isInitialized_getBuildingDecalSizeX = true;
		}

		return _buffer_getBuildingDecalSizeX;
	}

	int _buffer_getBuildingDecalSizeY;
	boolean _buffer_isInitialized_getBuildingDecalSizeY = false;
	@Override
	public int getBuildingDecalSizeY() {

		if (!_buffer_isInitialized_getBuildingDecalSizeY) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildingDecalSizeY(this.getUnitDefId());
			_buffer_getBuildingDecalSizeY = _ret_int;
			_buffer_isInitialized_getBuildingDecalSizeY = true;
		}

		return _buffer_getBuildingDecalSizeY;
	}

	float _buffer_getBuildingDecalDecaySpeed;
	boolean _buffer_isInitialized_getBuildingDecalDecaySpeed = false;
	@Override
	public float getBuildingDecalDecaySpeed() {

		if (!_buffer_isInitialized_getBuildingDecalDecaySpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getBuildingDecalDecaySpeed(this.getUnitDefId());
			_buffer_getBuildingDecalDecaySpeed = _ret_int;
			_buffer_isInitialized_getBuildingDecalDecaySpeed = true;
		}

		return _buffer_getBuildingDecalDecaySpeed;
	}

	float _buffer_getMaxFuel;
	boolean _buffer_isInitialized_getMaxFuel = false;
	/**
	 * Maximum flight time in seconds before the aircraft needs
	 * to return to an air repair bay to refuel.
	 */
	@Override
	public float getMaxFuel() {

		if (!_buffer_isInitialized_getMaxFuel) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxFuel(this.getUnitDefId());
			_buffer_getMaxFuel = _ret_int;
			_buffer_isInitialized_getMaxFuel = true;
		}

		return _buffer_getMaxFuel;
	}

	float _buffer_getRefuelTime;
	boolean _buffer_isInitialized_getRefuelTime = false;
	/**
	 * Time to fully refuel the unit
	 */
	@Override
	public float getRefuelTime() {

		if (!_buffer_isInitialized_getRefuelTime) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getRefuelTime(this.getUnitDefId());
			_buffer_getRefuelTime = _ret_int;
			_buffer_isInitialized_getRefuelTime = true;
		}

		return _buffer_getRefuelTime;
	}

	float _buffer_getMinAirBasePower;
	boolean _buffer_isInitialized_getMinAirBasePower = false;
	/**
	 * Minimum build power of airbases that this aircraft can land on
	 */
	@Override
	public float getMinAirBasePower() {

		if (!_buffer_isInitialized_getMinAirBasePower) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_getMinAirBasePower(this.getUnitDefId());
			_buffer_getMinAirBasePower = _ret_int;
			_buffer_isInitialized_getMinAirBasePower = true;
		}

		return _buffer_getMinAirBasePower;
	}

	int _buffer_getMaxThisUnit;
	boolean _buffer_isInitialized_getMaxThisUnit = false;
	/**
	 * Number of units of this type allowed simultaneously in the game
	 */
	@Override
	public int getMaxThisUnit() {

		if (!_buffer_isInitialized_getMaxThisUnit) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getMaxThisUnit(this.getUnitDefId());
			_buffer_getMaxThisUnit = _ret_int;
			_buffer_isInitialized_getMaxThisUnit = true;
		}

		return _buffer_getMaxThisUnit;
	}

	UnitDef _buffer_getDecoyDef;
	boolean _buffer_isInitialized_getDecoyDef = false;
	@Override
	public UnitDef getDecoyDef() {

		if (!_buffer_isInitialized_getDecoyDef) {
		UnitDef _ret_int_out;
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getDecoyDef(this.getUnitDefId());
		_ret_int_out = WrappUnitDef.getInstance(innerCallback, _ret_int);

			_buffer_getDecoyDef = _ret_int_out;
			_buffer_isInitialized_getDecoyDef = true;
		}

		return _buffer_getDecoyDef;
	}

	boolean _buffer_isDontLand;
	boolean _buffer_isInitialized_isDontLand = false;
	@Override
	public boolean isDontLand() {

		if (!_buffer_isInitialized_isDontLand) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_isDontLand(this.getUnitDefId());
			_buffer_isDontLand = _ret_int;
			_buffer_isInitialized_isDontLand = true;
		}

		return _buffer_isDontLand;
	}

	WeaponDef _buffer_getShieldDef;
	boolean _buffer_isInitialized_getShieldDef = false;
	@Override
	public WeaponDef getShieldDef() {

		if (!_buffer_isInitialized_getShieldDef) {
		WeaponDef _ret_int_out;
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getShieldDef(this.getUnitDefId());
		_ret_int_out = WrappWeaponDef.getInstance(innerCallback, _ret_int);

			_buffer_getShieldDef = _ret_int_out;
			_buffer_isInitialized_getShieldDef = true;
		}

		return _buffer_getShieldDef;
	}

	WeaponDef _buffer_getStockpileDef;
	boolean _buffer_isInitialized_getStockpileDef = false;
	@Override
	public WeaponDef getStockpileDef() {

		if (!_buffer_isInitialized_getStockpileDef) {
		WeaponDef _ret_int_out;
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getStockpileDef(this.getUnitDefId());
		_ret_int_out = WrappWeaponDef.getInstance(innerCallback, _ret_int);

			_buffer_getStockpileDef = _ret_int_out;
			_buffer_isInitialized_getStockpileDef = true;
		}

		return _buffer_getStockpileDef;
	}

	java.util.List<UnitDef> _buffer_getBuildOptions;
	boolean _buffer_isInitialized_getBuildOptions = false;
	@Override
	public java.util.List<UnitDef> getBuildOptions() {

		if (!_buffer_isInitialized_getBuildOptions) {
		int unitDefIds_sizeMax;
		int unitDefIds_raw_size;
		int[] unitDefIds;
		java.util.List<UnitDef> unitDefIds_list;
		int unitDefIds_size;
		int _ret_int;

		unitDefIds_sizeMax = Integer.MAX_VALUE;
		unitDefIds = null;
		unitDefIds_size = innerCallback.UnitDef_getBuildOptions(this.getUnitDefId(), unitDefIds, unitDefIds_sizeMax);
		unitDefIds_sizeMax = unitDefIds_size;
		unitDefIds_raw_size = unitDefIds_size;
		unitDefIds = new int[unitDefIds_raw_size];

			_ret_int = innerCallback.UnitDef_getBuildOptions(this.getUnitDefId(), unitDefIds, unitDefIds_sizeMax);
		unitDefIds_list = new java.util.ArrayList<UnitDef>(unitDefIds_size);
		for (int i=0; i < unitDefIds_sizeMax; i++) {
			unitDefIds_list.add(com.springrts.ai.oo.clb.WrappUnitDef.getInstance(innerCallback, unitDefIds[i]));
		}

			_buffer_getBuildOptions = unitDefIds_list;
			_buffer_isInitialized_getBuildOptions = true;
		}

		return _buffer_getBuildOptions;
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
		_size = innerCallback.UnitDef_getCustomParams(this.getUnitDefId(), keys, values);
		keys = new String[_size];
		values = new String[_size];

			_ret_int = innerCallback.UnitDef_getCustomParams(this.getUnitDefId(), keys, values);
		_map = new java.util.HashMap<String, String>();
		for (int i=0; i < _size; i++) {
		}

			_buffer_getCustomParams = _map;
			_buffer_isInitialized_getCustomParams = true;
		}

		return _buffer_getCustomParams;
	}

	java.util.List<WeaponMount> _buffer_getWeaponMounts;
	boolean _buffer_isInitialized_getWeaponMounts = false;
	@Override
	public java.util.List<WeaponMount> getWeaponMounts() {

		if (!_buffer_isInitialized_getWeaponMounts) {
		java.util.List<WeaponMount> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

			_ret_int = innerCallback.UnitDef_getWeaponMounts(this.getUnitDefId());
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<WeaponMount>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappWeaponMount.getInstance(innerCallback, unitDefId, i));
		}

			_buffer_getWeaponMounts = RETURN_SIZE_list;
			_buffer_isInitialized_getWeaponMounts = true;
		}

		return _buffer_getWeaponMounts;
	}

	MoveData _buffer_getMoveData;
	boolean _buffer_isInitialized_getMoveData = false;
	@Override
	public MoveData getMoveData() {

		if (!_buffer_isInitialized_getMoveData) {
		MoveData _ret_int_out;

		_ret_int_out = WrappMoveData.getInstance(innerCallback, unitDefId);

			_buffer_getMoveData = _ret_int_out;
			_buffer_isInitialized_getMoveData = true;
		}

		return _buffer_getMoveData;
	}

	FlankingBonus _buffer_getFlankingBonus;
	boolean _buffer_isInitialized_getFlankingBonus = false;
	@Override
	public FlankingBonus getFlankingBonus() {

		if (!_buffer_isInitialized_getFlankingBonus) {
		FlankingBonus _ret_int_out;

		_ret_int_out = WrappFlankingBonus.getInstance(innerCallback, unitDefId);

			_buffer_getFlankingBonus = _ret_int_out;
			_buffer_isInitialized_getFlankingBonus = true;
		}

		return _buffer_getFlankingBonus;
	}
}


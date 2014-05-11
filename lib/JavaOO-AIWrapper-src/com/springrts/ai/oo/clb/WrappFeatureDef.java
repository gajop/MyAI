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
public class WrappFeatureDef extends AbstractFeatureDef implements FeatureDef {

	private AICallback innerCallback = null;
	private int featureDefId = -1;

	public WrappFeatureDef(AICallback innerCallback, int featureDefId) {

		this.innerCallback = innerCallback;
		this.featureDefId = featureDefId;
	}

	@Override
	public int getFeatureDefId() {

		return featureDefId;
	}

	private static java.util.Map<Integer, FeatureDef> _buffer_instances = new java.util.HashMap<Integer, FeatureDef>();

	public static FeatureDef getInstance(AICallback innerCallback, int featureDefId) {

		if (featureDefId < 0) {
			return null;
		}

		FeatureDef _ret = null;
		_ret = new WrappFeatureDef(innerCallback, featureDefId);
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

			_ret_int = innerCallback.FeatureDef_getName(this.getFeatureDefId());
			_buffer_getName = _ret_int;
			_buffer_isInitialized_getName = true;
		}

		return _buffer_getName;
	}

	String _buffer_getDescription;
	boolean _buffer_isInitialized_getDescription = false;
	@Override
	public String getDescription() {

		if (!_buffer_isInitialized_getDescription) {
		String _ret_int;

			_ret_int = innerCallback.FeatureDef_getDescription(this.getFeatureDefId());
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

			_ret_int = innerCallback.FeatureDef_getFileName(this.getFeatureDefId());
			_buffer_getFileName = _ret_int;
			_buffer_isInitialized_getFileName = true;
		}

		return _buffer_getFileName;
	}

	@Override
	public float getContainedResource(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.FeatureDef_getContainedResource(this.getFeatureDefId(), resourceId);
		return _ret_int;
	}

	float _buffer_getMaxHealth;
	boolean _buffer_isInitialized_getMaxHealth = false;
	@Override
	public float getMaxHealth() {

		if (!_buffer_isInitialized_getMaxHealth) {
		float _ret_int;

			_ret_int = innerCallback.FeatureDef_getMaxHealth(this.getFeatureDefId());
			_buffer_getMaxHealth = _ret_int;
			_buffer_isInitialized_getMaxHealth = true;
		}

		return _buffer_getMaxHealth;
	}

	float _buffer_getReclaimTime;
	boolean _buffer_isInitialized_getReclaimTime = false;
	@Override
	public float getReclaimTime() {

		if (!_buffer_isInitialized_getReclaimTime) {
		float _ret_int;

			_ret_int = innerCallback.FeatureDef_getReclaimTime(this.getFeatureDefId());
			_buffer_getReclaimTime = _ret_int;
			_buffer_isInitialized_getReclaimTime = true;
		}

		return _buffer_getReclaimTime;
	}

	float _buffer_getMass;
	boolean _buffer_isInitialized_getMass = false;
	/**
	 * Used to see if the object can be overrun by units of a certain heavyness
	 */
	@Override
	public float getMass() {

		if (!_buffer_isInitialized_getMass) {
		float _ret_int;

			_ret_int = innerCallback.FeatureDef_getMass(this.getFeatureDefId());
			_buffer_getMass = _ret_int;
			_buffer_isInitialized_getMass = true;
		}

		return _buffer_getMass;
	}

	boolean _buffer_isUpright;
	boolean _buffer_isInitialized_isUpright = false;
	@Override
	public boolean isUpright() {

		if (!_buffer_isInitialized_isUpright) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isUpright(this.getFeatureDefId());
			_buffer_isUpright = _ret_int;
			_buffer_isInitialized_isUpright = true;
		}

		return _buffer_isUpright;
	}

	int _buffer_getDrawType;
	boolean _buffer_isInitialized_getDrawType = false;
	@Override
	public int getDrawType() {

		if (!_buffer_isInitialized_getDrawType) {
		int _ret_int;

			_ret_int = innerCallback.FeatureDef_getDrawType(this.getFeatureDefId());
			_buffer_getDrawType = _ret_int;
			_buffer_isInitialized_getDrawType = true;
		}

		return _buffer_getDrawType;
	}

	String _buffer_getModelName;
	boolean _buffer_isInitialized_getModelName = false;
	@Override
	public String getModelName() {

		if (!_buffer_isInitialized_getModelName) {
		String _ret_int;

			_ret_int = innerCallback.FeatureDef_getModelName(this.getFeatureDefId());
			_buffer_getModelName = _ret_int;
			_buffer_isInitialized_getModelName = true;
		}

		return _buffer_getModelName;
	}

	int _buffer_getResurrectable;
	boolean _buffer_isInitialized_getResurrectable = false;
	/**
	 * Used to determine whether the feature is resurrectable.
	 * 
	 * @return  -1: (default) only if it is the 1st wreckage of
	 *              the UnitDef it originates from
	 *           0: no, never
	 *           1: yes, always
	 */
	@Override
	public int getResurrectable() {

		if (!_buffer_isInitialized_getResurrectable) {
		int _ret_int;

			_ret_int = innerCallback.FeatureDef_getResurrectable(this.getFeatureDefId());
			_buffer_getResurrectable = _ret_int;
			_buffer_isInitialized_getResurrectable = true;
		}

		return _buffer_getResurrectable;
	}

	int _buffer_getSmokeTime;
	boolean _buffer_isInitialized_getSmokeTime = false;
	@Override
	public int getSmokeTime() {

		if (!_buffer_isInitialized_getSmokeTime) {
		int _ret_int;

			_ret_int = innerCallback.FeatureDef_getSmokeTime(this.getFeatureDefId());
			_buffer_getSmokeTime = _ret_int;
			_buffer_isInitialized_getSmokeTime = true;
		}

		return _buffer_getSmokeTime;
	}

	boolean _buffer_isDestructable;
	boolean _buffer_isInitialized_isDestructable = false;
	@Override
	public boolean isDestructable() {

		if (!_buffer_isInitialized_isDestructable) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isDestructable(this.getFeatureDefId());
			_buffer_isDestructable = _ret_int;
			_buffer_isInitialized_isDestructable = true;
		}

		return _buffer_isDestructable;
	}

	boolean _buffer_isReclaimable;
	boolean _buffer_isInitialized_isReclaimable = false;
	@Override
	public boolean isReclaimable() {

		if (!_buffer_isInitialized_isReclaimable) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isReclaimable(this.getFeatureDefId());
			_buffer_isReclaimable = _ret_int;
			_buffer_isInitialized_isReclaimable = true;
		}

		return _buffer_isReclaimable;
	}

	boolean _buffer_isBlocking;
	boolean _buffer_isInitialized_isBlocking = false;
	@Override
	public boolean isBlocking() {

		if (!_buffer_isInitialized_isBlocking) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isBlocking(this.getFeatureDefId());
			_buffer_isBlocking = _ret_int;
			_buffer_isInitialized_isBlocking = true;
		}

		return _buffer_isBlocking;
	}

	boolean _buffer_isBurnable;
	boolean _buffer_isInitialized_isBurnable = false;
	@Override
	public boolean isBurnable() {

		if (!_buffer_isInitialized_isBurnable) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isBurnable(this.getFeatureDefId());
			_buffer_isBurnable = _ret_int;
			_buffer_isInitialized_isBurnable = true;
		}

		return _buffer_isBurnable;
	}

	boolean _buffer_isFloating;
	boolean _buffer_isInitialized_isFloating = false;
	@Override
	public boolean isFloating() {

		if (!_buffer_isInitialized_isFloating) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isFloating(this.getFeatureDefId());
			_buffer_isFloating = _ret_int;
			_buffer_isInitialized_isFloating = true;
		}

		return _buffer_isFloating;
	}

	boolean _buffer_isNoSelect;
	boolean _buffer_isInitialized_isNoSelect = false;
	@Override
	public boolean isNoSelect() {

		if (!_buffer_isInitialized_isNoSelect) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isNoSelect(this.getFeatureDefId());
			_buffer_isNoSelect = _ret_int;
			_buffer_isInitialized_isNoSelect = true;
		}

		return _buffer_isNoSelect;
	}

	boolean _buffer_isGeoThermal;
	boolean _buffer_isInitialized_isGeoThermal = false;
	@Override
	public boolean isGeoThermal() {

		if (!_buffer_isInitialized_isGeoThermal) {
		boolean _ret_int;

			_ret_int = innerCallback.FeatureDef_isGeoThermal(this.getFeatureDefId());
			_buffer_isGeoThermal = _ret_int;
			_buffer_isInitialized_isGeoThermal = true;
		}

		return _buffer_isGeoThermal;
	}

	String _buffer_getDeathFeature;
	boolean _buffer_isInitialized_getDeathFeature = false;
	/**
	 * Name of the FeatureDef that this turns into when killed (not reclaimed).
	 */
	@Override
	public String getDeathFeature() {

		if (!_buffer_isInitialized_getDeathFeature) {
		String _ret_int;

			_ret_int = innerCallback.FeatureDef_getDeathFeature(this.getFeatureDefId());
			_buffer_getDeathFeature = _ret_int;
			_buffer_isInitialized_getDeathFeature = true;
		}

		return _buffer_getDeathFeature;
	}

	int _buffer_getXSize;
	boolean _buffer_isInitialized_getXSize = false;
	/**
	 * Size of the feature along the X axis - in other words: height.
	 * each size is 8 units
	 */
	@Override
	public int getXSize() {

		if (!_buffer_isInitialized_getXSize) {
		int _ret_int;

			_ret_int = innerCallback.FeatureDef_getXSize(this.getFeatureDefId());
			_buffer_getXSize = _ret_int;
			_buffer_isInitialized_getXSize = true;
		}

		return _buffer_getXSize;
	}

	int _buffer_getZSize;
	boolean _buffer_isInitialized_getZSize = false;
	/**
	 * Size of the feature along the Z axis - in other words: width.
	 * each size is 8 units
	 */
	@Override
	public int getZSize() {

		if (!_buffer_isInitialized_getZSize) {
		int _ret_int;

			_ret_int = innerCallback.FeatureDef_getZSize(this.getFeatureDefId());
			_buffer_getZSize = _ret_int;
			_buffer_isInitialized_getZSize = true;
		}

		return _buffer_getZSize;
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
		_size = innerCallback.FeatureDef_getCustomParams(this.getFeatureDefId(), keys, values);
		keys = new String[_size];
		values = new String[_size];

			_ret_int = innerCallback.FeatureDef_getCustomParams(this.getFeatureDefId(), keys, values);
		_map = new java.util.HashMap<String, String>();
		for (int i=0; i < _size; i++) {
		}

			_buffer_getCustomParams = _map;
			_buffer_isInitialized_getCustomParams = true;
		}

		return _buffer_getCustomParams;
	}
}


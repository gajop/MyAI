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
public class WrappDamage extends AbstractDamage implements Damage {

	private AICallback innerCallback = null;
	private int weaponDefId = -1;

	public WrappDamage(AICallback innerCallback, int weaponDefId) {

		this.innerCallback = innerCallback;
		this.weaponDefId = weaponDefId;
	}

	@Override
	public int getWeaponDefId() {

		return weaponDefId;
	}

	@Override
	public WeaponDef getWeaponDef() {

		return WrappWeaponDef.getInstance(innerCallback, weaponDefId);
	}

	public static Damage getInstance(AICallback innerCallback, int weaponDefId) {

		if (weaponDefId < 0) {
			return null;
		}

		Damage _ret = null;
		_ret = new WrappDamage(innerCallback, weaponDefId);
		return _ret;
	}


	int _buffer_getParalyzeDamageTime;
	boolean _buffer_isInitialized_getParalyzeDamageTime = false;
	@Override
	public int getParalyzeDamageTime() {

		if (!_buffer_isInitialized_getParalyzeDamageTime) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_Damage_getParalyzeDamageTime(this.getWeaponDefId());
			_buffer_getParalyzeDamageTime = _ret_int;
			_buffer_isInitialized_getParalyzeDamageTime = true;
		}

		return _buffer_getParalyzeDamageTime;
	}

	float _buffer_getImpulseFactor;
	boolean _buffer_isInitialized_getImpulseFactor = false;
	@Override
	public float getImpulseFactor() {

		if (!_buffer_isInitialized_getImpulseFactor) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Damage_getImpulseFactor(this.getWeaponDefId());
			_buffer_getImpulseFactor = _ret_int;
			_buffer_isInitialized_getImpulseFactor = true;
		}

		return _buffer_getImpulseFactor;
	}

	float _buffer_getImpulseBoost;
	boolean _buffer_isInitialized_getImpulseBoost = false;
	@Override
	public float getImpulseBoost() {

		if (!_buffer_isInitialized_getImpulseBoost) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Damage_getImpulseBoost(this.getWeaponDefId());
			_buffer_getImpulseBoost = _ret_int;
			_buffer_isInitialized_getImpulseBoost = true;
		}

		return _buffer_getImpulseBoost;
	}

	float _buffer_getCraterMult;
	boolean _buffer_isInitialized_getCraterMult = false;
	@Override
	public float getCraterMult() {

		if (!_buffer_isInitialized_getCraterMult) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Damage_getCraterMult(this.getWeaponDefId());
			_buffer_getCraterMult = _ret_int;
			_buffer_isInitialized_getCraterMult = true;
		}

		return _buffer_getCraterMult;
	}

	float _buffer_getCraterBoost;
	boolean _buffer_isInitialized_getCraterBoost = false;
	@Override
	public float getCraterBoost() {

		if (!_buffer_isInitialized_getCraterBoost) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Damage_getCraterBoost(this.getWeaponDefId());
			_buffer_getCraterBoost = _ret_int;
			_buffer_isInitialized_getCraterBoost = true;
		}

		return _buffer_getCraterBoost;
	}

	java.util.List<Float> _buffer_getTypes;
	boolean _buffer_isInitialized_getTypes = false;
	@Override
	public java.util.List<Float> getTypes() {

		if (!_buffer_isInitialized_getTypes) {
		int types_sizeMax;
		int types_raw_size;
		float[] types;
		java.util.List<Float> types_list;
		int types_size;
		int _ret_int;

		types_sizeMax = Integer.MAX_VALUE;
		types = null;
		types_size = innerCallback.WeaponDef_Damage_getTypes(this.getWeaponDefId(), types, types_sizeMax);
		types_sizeMax = types_size;
		types_raw_size = types_size;
		types = new float[types_raw_size];

			_ret_int = innerCallback.WeaponDef_Damage_getTypes(this.getWeaponDefId(), types, types_sizeMax);
		types_list = new java.util.ArrayList<Float>(types_size);
		for (int i=0; i < types_sizeMax; i++) {
			types_list.add(types[i]);
		}

			_buffer_getTypes = types_list;
			_buffer_isInitialized_getTypes = true;
		}

		return _buffer_getTypes;
	}
}


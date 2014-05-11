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
public class WrappWeaponMount extends AbstractWeaponMount implements WeaponMount {

	private AICallback innerCallback = null;
	private int unitDefId = -1;
	private int weaponMountId = -1;

	public WrappWeaponMount(AICallback innerCallback, int unitDefId, int weaponMountId) {

		this.innerCallback = innerCallback;
		this.unitDefId = unitDefId;
		this.weaponMountId = weaponMountId;
	}

	@Override
	public int getUnitDefId() {

		return unitDefId;
	}

	@Override
	public UnitDef getUnitDef() {

		return WrappUnitDef.getInstance(innerCallback, unitDefId);
	}

	@Override
	public int getWeaponMountId() {

		return weaponMountId;
	}

	public static WeaponMount getInstance(AICallback innerCallback, int unitDefId, int weaponMountId) {

		if (weaponMountId < 0) {
			return null;
		}

		WeaponMount _ret = null;
		_ret = new WrappWeaponMount(innerCallback, unitDefId, weaponMountId);
		return _ret;
	}


	String _buffer_getName;
	boolean _buffer_isInitialized_getName = false;
	@Override
	public String getName() {

		if (!_buffer_isInitialized_getName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getName(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getName = _ret_int;
			_buffer_isInitialized_getName = true;
		}

		return _buffer_getName;
	}

	WeaponDef _buffer_getWeaponDef;
	boolean _buffer_isInitialized_getWeaponDef = false;
	@Override
	public WeaponDef getWeaponDef() {

		if (!_buffer_isInitialized_getWeaponDef) {
		WeaponDef _ret_int_out;
		int _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getWeaponDef(this.getUnitDefId(), this.getWeaponMountId());
		_ret_int_out = WrappWeaponDef.getInstance(innerCallback, _ret_int);

			_buffer_getWeaponDef = _ret_int_out;
			_buffer_isInitialized_getWeaponDef = true;
		}

		return _buffer_getWeaponDef;
	}

	int _buffer_getSlavedTo;
	boolean _buffer_isInitialized_getSlavedTo = false;
	@Override
	public int getSlavedTo() {

		if (!_buffer_isInitialized_getSlavedTo) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getSlavedTo(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getSlavedTo = _ret_int;
			_buffer_isInitialized_getSlavedTo = true;
		}

		return _buffer_getSlavedTo;
	}

	AIFloat3 _buffer_getMainDir;
	boolean _buffer_isInitialized_getMainDir = false;
	@Override
	public AIFloat3 getMainDir() {

		if (!_buffer_isInitialized_getMainDir) {
		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

			innerCallback.UnitDef_WeaponMount_getMainDir(this.getUnitDefId(), this.getWeaponMountId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

			_buffer_getMainDir = _ret;
			_buffer_isInitialized_getMainDir = true;
		}

		return _buffer_getMainDir;
	}

	float _buffer_getMaxAngleDif;
	boolean _buffer_isInitialized_getMaxAngleDif = false;
	@Override
	public float getMaxAngleDif() {

		if (!_buffer_isInitialized_getMaxAngleDif) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getMaxAngleDif(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getMaxAngleDif = _ret_int;
			_buffer_isInitialized_getMaxAngleDif = true;
		}

		return _buffer_getMaxAngleDif;
	}

	float _buffer_getFuelUsage;
	boolean _buffer_isInitialized_getFuelUsage = false;
	/**
	 * How many seconds of fuel it costs for the owning unit to fire this weapon.
	 */
	@Override
	public float getFuelUsage() {

		if (!_buffer_isInitialized_getFuelUsage) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getFuelUsage(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getFuelUsage = _ret_int;
			_buffer_isInitialized_getFuelUsage = true;
		}

		return _buffer_getFuelUsage;
	}

	int _buffer_getBadTargetCategory;
	boolean _buffer_isInitialized_getBadTargetCategory = false;
	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * not target.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	@Override
	public int getBadTargetCategory() {

		if (!_buffer_isInitialized_getBadTargetCategory) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_WeaponMount_getBadTargetCategory(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getBadTargetCategory = _ret_int;
			_buffer_isInitialized_getBadTargetCategory = true;
		}

		return _buffer_getBadTargetCategory;
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

			_ret_int = innerCallback.UnitDef_WeaponMount_getOnlyTargetCategory(this.getUnitDefId(), this.getWeaponMountId());
			_buffer_getOnlyTargetCategory = _ret_int;
			_buffer_isInitialized_getOnlyTargetCategory = true;
		}

		return _buffer_getOnlyTargetCategory;
	}
}


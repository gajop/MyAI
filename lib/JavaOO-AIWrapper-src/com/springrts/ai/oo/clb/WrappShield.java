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
public class WrappShield extends AbstractShield implements Shield {

	private AICallback innerCallback = null;
	private int weaponDefId = -1;

	public WrappShield(AICallback innerCallback, int weaponDefId) {

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

	public static Shield getInstance(AICallback innerCallback, int weaponDefId) {

		if (weaponDefId < 0) {
			return null;
		}

		Shield _ret = null;
		_ret = new WrappShield(innerCallback, weaponDefId);
		return _ret;
	}


	/**
	 * Amount of the resource used per shot or per second,
	 * depending on the type of projectile.
	 */
	@Override
	public float getResourceUse(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.WeaponDef_Shield_getResourceUse(this.getWeaponDefId(), resourceId);
		return _ret_int;
	}

	float _buffer_getRadius;
	boolean _buffer_isInitialized_getRadius = false;
	/**
	 * Size of shield covered area
	 */
	@Override
	public float getRadius() {

		if (!_buffer_isInitialized_getRadius) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getRadius(this.getWeaponDefId());
			_buffer_getRadius = _ret_int;
			_buffer_isInitialized_getRadius = true;
		}

		return _buffer_getRadius;
	}

	float _buffer_getForce;
	boolean _buffer_isInitialized_getForce = false;
	/**
	 * Shield acceleration on plasma stuff.
	 * How much will plasma be accelerated into the other direction
	 * when it hits the shield.
	 */
	@Override
	public float getForce() {

		if (!_buffer_isInitialized_getForce) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getForce(this.getWeaponDefId());
			_buffer_getForce = _ret_int;
			_buffer_isInitialized_getForce = true;
		}

		return _buffer_getForce;
	}

	float _buffer_getMaxSpeed;
	boolean _buffer_isInitialized_getMaxSpeed = false;
	/**
	 * Maximum speed to which the shield can repulse plasma.
	 */
	@Override
	public float getMaxSpeed() {

		if (!_buffer_isInitialized_getMaxSpeed) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getMaxSpeed(this.getWeaponDefId());
			_buffer_getMaxSpeed = _ret_int;
			_buffer_isInitialized_getMaxSpeed = true;
		}

		return _buffer_getMaxSpeed;
	}

	float _buffer_getPower;
	boolean _buffer_isInitialized_getPower = false;
	/**
	 * Amount of damage the shield can reflect. (0=infinite)
	 */
	@Override
	public float getPower() {

		if (!_buffer_isInitialized_getPower) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getPower(this.getWeaponDefId());
			_buffer_getPower = _ret_int;
			_buffer_isInitialized_getPower = true;
		}

		return _buffer_getPower;
	}

	float _buffer_getPowerRegen;
	boolean _buffer_isInitialized_getPowerRegen = false;
	/**
	 * Amount of power that is regenerated per second.
	 */
	@Override
	public float getPowerRegen() {

		if (!_buffer_isInitialized_getPowerRegen) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getPowerRegen(this.getWeaponDefId());
			_buffer_getPowerRegen = _ret_int;
			_buffer_isInitialized_getPowerRegen = true;
		}

		return _buffer_getPowerRegen;
	}

	/**
	 * How much of a given resource is needed to regenerate power
	 * with max speed per second.
	 */
	@Override
	public float getPowerRegenResource(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.WeaponDef_Shield_getPowerRegenResource(this.getWeaponDefId(), resourceId);
		return _ret_int;
	}

	float _buffer_getStartingPower;
	boolean _buffer_isInitialized_getStartingPower = false;
	/**
	 * How much power the shield has when it is created.
	 */
	@Override
	public float getStartingPower() {

		if (!_buffer_isInitialized_getStartingPower) {
		float _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getStartingPower(this.getWeaponDefId());
			_buffer_getStartingPower = _ret_int;
			_buffer_isInitialized_getStartingPower = true;
		}

		return _buffer_getStartingPower;
	}

	int _buffer_getRechargeDelay;
	boolean _buffer_isInitialized_getRechargeDelay = false;
	/**
	 * Number of frames to delay recharging by after each hit.
	 */
	@Override
	public int getRechargeDelay() {

		if (!_buffer_isInitialized_getRechargeDelay) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getRechargeDelay(this.getWeaponDefId());
			_buffer_getRechargeDelay = _ret_int;
			_buffer_isInitialized_getRechargeDelay = true;
		}

		return _buffer_getRechargeDelay;
	}

	java.awt.Color _buffer_getGoodColor;
	boolean _buffer_isInitialized_getGoodColor = false;
	/**
	 * The color of the shield when it is at full power.
	 */
	@Override
	public java.awt.Color getGoodColor() {

		if (!_buffer_isInitialized_getGoodColor) {
		java.awt.Color _ret;

		short[] return_colorS3_out = new short[3];

			innerCallback.WeaponDef_Shield_getGoodColor(this.getWeaponDefId(), return_colorS3_out);
		_ret = Util.toColor(return_colorS3_out);

			_buffer_getGoodColor = _ret;
			_buffer_isInitialized_getGoodColor = true;
		}

		return _buffer_getGoodColor;
	}

	java.awt.Color _buffer_getBadColor;
	boolean _buffer_isInitialized_getBadColor = false;
	/**
	 * The color of the shield when it is empty.
	 */
	@Override
	public java.awt.Color getBadColor() {

		if (!_buffer_isInitialized_getBadColor) {
		java.awt.Color _ret;

		short[] return_colorS3_out = new short[3];

			innerCallback.WeaponDef_Shield_getBadColor(this.getWeaponDefId(), return_colorS3_out);
		_ret = Util.toColor(return_colorS3_out);

			_buffer_getBadColor = _ret;
			_buffer_isInitialized_getBadColor = true;
		}

		return _buffer_getBadColor;
	}

	short _buffer_getAlpha;
	boolean _buffer_isInitialized_getAlpha = false;
	/**
	 * The shields alpha value.
	 */
	@Override
	public short getAlpha() {

		if (!_buffer_isInitialized_getAlpha) {
		short _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getAlpha(this.getWeaponDefId());
			_buffer_getAlpha = _ret_int;
			_buffer_isInitialized_getAlpha = true;
		}

		return _buffer_getAlpha;
	}

	int _buffer_getInterceptType;
	boolean _buffer_isInitialized_getInterceptType = false;
	/**
	 * The type of the shield (bitfield).
	 * Defines what weapons can be intercepted by the shield.
	 * 
	 * @see  getInterceptedByShieldType()
	 */
	@Override
	public int getInterceptType() {

		if (!_buffer_isInitialized_getInterceptType) {
		int _ret_int;

			_ret_int = innerCallback.WeaponDef_Shield_getInterceptType(this.getWeaponDefId());
			_buffer_getInterceptType = _ret_int;
			_buffer_isInitialized_getInterceptType = true;
		}

		return _buffer_getInterceptType;
	}
}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubShield extends AbstractShield implements Shield {

	public void setWeaponDefId(int weaponDefId) {
		this.weaponDefId = weaponDefId;
	}
	private int weaponDefId = 0;
	@Override
	public int getWeaponDefId() {
		return weaponDefId;
	}

	public void setWeaponDef(WeaponDef weaponDef) {
		this.weaponDef = weaponDef;
	}
	private WeaponDef weaponDef = null;
	@Override
	public WeaponDef getWeaponDef() {
		return weaponDef;
	}

	/**
	 * Amount of the resource used per shot or per second,
	 * depending on the type of projectile.
	 */
	@Override
	public float getResourceUse(Resource resource) {
		return 0;
	}

	/**
	 * Size of shield covered area
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	private float radius = 0;
	@Override
	public float getRadius() {
		return radius;
	}

	/**
	 * Shield acceleration on plasma stuff.
	 * How much will plasma be accelerated into the other direction
	 * when it hits the shield.
	 */
	public void setForce(float force) {
		this.force = force;
	}
	private float force = 0;
	@Override
	public float getForce() {
		return force;
	}

	/**
	 * Maximum speed to which the shield can repulse plasma.
	 */
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private float maxSpeed = 0;
	@Override
	public float getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Amount of damage the shield can reflect. (0=infinite)
	 */
	public void setPower(float power) {
		this.power = power;
	}
	private float power = 0;
	@Override
	public float getPower() {
		return power;
	}

	/**
	 * Amount of power that is regenerated per second.
	 */
	public void setPowerRegen(float powerRegen) {
		this.powerRegen = powerRegen;
	}
	private float powerRegen = 0;
	@Override
	public float getPowerRegen() {
		return powerRegen;
	}

	/**
	 * How much of a given resource is needed to regenerate power
	 * with max speed per second.
	 */
	@Override
	public float getPowerRegenResource(Resource resource) {
		return 0;
	}

	/**
	 * How much power the shield has when it is created.
	 */
	public void setStartingPower(float startingPower) {
		this.startingPower = startingPower;
	}
	private float startingPower = 0;
	@Override
	public float getStartingPower() {
		return startingPower;
	}

	/**
	 * Number of frames to delay recharging by after each hit.
	 */
	public void setRechargeDelay(int rechargeDelay) {
		this.rechargeDelay = rechargeDelay;
	}
	private int rechargeDelay = 0;
	@Override
	public int getRechargeDelay() {
		return rechargeDelay;
	}

	/**
	 * The color of the shield when it is at full power.
	 */
	public void setGoodColor(java.awt.Color goodColor) {
		this.goodColor = goodColor;
	}
	private java.awt.Color goodColor = null;
	@Override
	public java.awt.Color getGoodColor() {
		return goodColor;
	}

	/**
	 * The color of the shield when it is empty.
	 */
	public void setBadColor(java.awt.Color badColor) {
		this.badColor = badColor;
	}
	private java.awt.Color badColor = null;
	@Override
	public java.awt.Color getBadColor() {
		return badColor;
	}

	/**
	 * The shields alpha value.
	 */
	public void setAlpha(short alpha) {
		this.alpha = alpha;
	}
	private short alpha = 0;
	@Override
	public short getAlpha() {
		return alpha;
	}

	/**
	 * The type of the shield (bitfield).
	 * Defines what weapons can be intercepted by the shield.
	 * 
	 * @see  getInterceptedByShieldType()
	 */
	public void setInterceptType(int interceptType) {
		this.interceptType = interceptType;
	}
	private int interceptType = 0;
	@Override
	public int getInterceptType() {
		return interceptType;
	}

}


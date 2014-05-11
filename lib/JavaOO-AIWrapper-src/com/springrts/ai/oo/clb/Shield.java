/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Shield extends Comparable<Shield> {

	public int getWeaponDefId();

	public WeaponDef getWeaponDef();

	/**
	 * Amount of the resource used per shot or per second,
	 * depending on the type of projectile.
	 */
	public float getResourceUse(Resource resource);

	/**
	 * Size of shield covered area
	 */
	public float getRadius();

	/**
	 * Shield acceleration on plasma stuff.
	 * How much will plasma be accelerated into the other direction
	 * when it hits the shield.
	 */
	public float getForce();

	/**
	 * Maximum speed to which the shield can repulse plasma.
	 */
	public float getMaxSpeed();

	/**
	 * Amount of damage the shield can reflect. (0=infinite)
	 */
	public float getPower();

	/**
	 * Amount of power that is regenerated per second.
	 */
	public float getPowerRegen();

	/**
	 * How much of a given resource is needed to regenerate power
	 * with max speed per second.
	 */
	public float getPowerRegenResource(Resource resource);

	/**
	 * How much power the shield has when it is created.
	 */
	public float getStartingPower();

	/**
	 * Number of frames to delay recharging by after each hit.
	 */
	public int getRechargeDelay();

	/**
	 * The color of the shield when it is at full power.
	 */
	public java.awt.Color getGoodColor();

	/**
	 * The color of the shield when it is empty.
	 */
	public java.awt.Color getBadColor();

	/**
	 * The shields alpha value.
	 */
	public short getAlpha();

	/**
	 * The type of the shield (bitfield).
	 * Defines what weapons can be intercepted by the shield.
	 * 
	 * @see  getInterceptedByShieldType()
	 */
	public int getInterceptType();

}


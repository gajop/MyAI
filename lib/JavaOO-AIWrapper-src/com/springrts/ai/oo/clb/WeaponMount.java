/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface WeaponMount extends Comparable<WeaponMount> {

	public int getUnitDefId();

	public UnitDef getUnitDef();

	public int getWeaponMountId();

	public String getName();

	public WeaponDef getWeaponDef();

	public int getSlavedTo();

	public AIFloat3 getMainDir();

	public float getMaxAngleDif();

	/**
	 * How many seconds of fuel it costs for the owning unit to fire this weapon.
	 */
	public float getFuelUsage();

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * not target.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int getBadTargetCategory();

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int getOnlyTargetCategory();

}


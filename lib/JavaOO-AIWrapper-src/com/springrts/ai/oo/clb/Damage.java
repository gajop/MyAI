/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Damage extends Comparable<Damage> {

	public int getWeaponDefId();

	public WeaponDef getWeaponDef();

	public int getParalyzeDamageTime();

	public float getImpulseFactor();

	public float getImpulseBoost();

	public float getCraterMult();

	public float getCraterBoost();

	public java.util.List<Float> getTypes();

}


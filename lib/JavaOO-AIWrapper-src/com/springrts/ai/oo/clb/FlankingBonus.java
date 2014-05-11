/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface FlankingBonus extends Comparable<FlankingBonus> {

	public int getUnitDefId();

	public UnitDef getUnitDef();

	/**
	 * The flanking bonus indicates how much additional damage you can inflict to
	 * a unit, if it gets attacked from different directions.
	 * See the spring source code if you want to know it more precisely.
	 * 
	 * @return  0: no flanking bonus
	 *          1: global coords, mobile
	 *          2: unit coords, mobile
	 *          3: unit coords, locked
	 */
	public int getMode();

	/**
	 * The unit takes less damage when attacked from this direction.
	 * This encourage flanking fire.
	 */
	public AIFloat3 getDir();

	/**
	 * Damage factor for the least protected direction
	 */
	public float getMax();

	/**
	 * Damage factor for the most protected direction
	 */
	public float getMin();

	/**
	 * How much the ability of the flanking bonus direction to move builds up each
	 * frame.
	 */
	public float getMobilityAdd();

}


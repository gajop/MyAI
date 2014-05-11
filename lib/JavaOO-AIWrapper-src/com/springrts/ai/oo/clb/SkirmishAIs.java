/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface SkirmishAIs extends Comparable<SkirmishAIs> {

	/**
	 * Returns the number of skirmish AIs in this game
	 */
	public int getSize();

	/**
	 * Returns the maximum number of skirmish AIs in any game
	 */
	public int getMax();

}


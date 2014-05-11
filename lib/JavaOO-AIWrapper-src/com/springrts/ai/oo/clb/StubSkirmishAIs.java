/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubSkirmishAIs extends AbstractSkirmishAIs implements SkirmishAIs {

	/**
	 * Returns the number of skirmish AIs in this game
	 */
	public void setSize(int size) {
		this.size = size;
	}
	private int size = 0;
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * Returns the maximum number of skirmish AIs in any game
	 */
	public void setMax(int max) {
		this.max = max;
	}
	private int max = 0;
	@Override
	public int getMax() {
		return max;
	}

}


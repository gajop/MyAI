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
public class WrappSkirmishAIs extends AbstractSkirmishAIs implements SkirmishAIs {

	private AICallback innerCallback = null;

	public WrappSkirmishAIs(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static SkirmishAIs getInstance(AICallback innerCallback) {

		SkirmishAIs _ret = null;
		_ret = new WrappSkirmishAIs(innerCallback);
		return _ret;
	}


	/**
	 * Returns the number of skirmish AIs in this game
	 */
	@Override
	public int getSize() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAIs_getSize();
		return _ret_int;
	}

	/**
	 * Returns the maximum number of skirmish AIs in any game
	 */
	@Override
	public int getMax() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAIs_getMax();
		return _ret_int;
	}
}


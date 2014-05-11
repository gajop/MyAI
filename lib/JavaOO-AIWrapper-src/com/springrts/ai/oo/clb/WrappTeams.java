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
public class WrappTeams extends AbstractTeams implements Teams {

	private AICallback innerCallback = null;

	public WrappTeams(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Teams getInstance(AICallback innerCallback) {

		Teams _ret = null;
		_ret = new WrappTeams(innerCallback);
		return _ret;
	}


	/**
	 * Returns the number of teams in this game
	 */
	@Override
	public int getSize() {

		int _ret_int;

		_ret_int = innerCallback.Teams_getSize();
		return _ret_int;
	}
}


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
public class WrappSkirmishAI extends AbstractSkirmishAI implements SkirmishAI {

	private AICallback innerCallback = null;

	public WrappSkirmishAI(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static SkirmishAI getInstance(AICallback innerCallback) {

		SkirmishAI _ret = null;
		_ret = new WrappSkirmishAI(innerCallback);
		return _ret;
	}


	@Override
	public int getSkirmishAIId() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAI_getSkirmishAIId();
		return _ret_int;
	}

	/**
	 * Returns the ID of the team controled by this Skirmish AI.
	 */
	@Override
	public int getTeamId() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAI_getTeamId();
		return _ret_int;
	}

	@Override
	public OptionValues getOptionValues() {

		OptionValues _ret_int_out;

		_ret_int_out = WrappOptionValues.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Info getInfo() {

		Info _ret_int_out;

		_ret_int_out = WrappInfo.getInstance(innerCallback);

		return _ret_int_out;
	}
}


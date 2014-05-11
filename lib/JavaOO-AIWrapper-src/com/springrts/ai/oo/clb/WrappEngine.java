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
public class WrappEngine extends AbstractEngine implements Engine {

	private AICallback innerCallback = null;

	public WrappEngine(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Engine getInstance(AICallback innerCallback) {

		Engine _ret = null;
		_ret = new WrappEngine(innerCallback);
		return _ret;
	}


	@Override
	public Version getVersion() {

		Version _ret_int_out;

		_ret_int_out = WrappVersion.getInstance(innerCallback);

		return _ret_int_out;
	}
}


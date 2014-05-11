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
public class WrappDebug extends AbstractDebug implements Debug {

	private AICallback innerCallback = null;

	public WrappDebug(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Debug getInstance(AICallback innerCallback) {

		Debug _ret = null;
		_ret = new WrappDebug(innerCallback);
		return _ret;
	}


	@Override
	public int addOverlayTexture(float[] texData, int w, int h) {

		int _ret_int;

		_ret_int = innerCallback.Debug_addOverlayTexture(texData, w, h);
		return _ret_int;
	}

	@Override
	public GraphDrawer getGraphDrawer() {

		GraphDrawer _ret_int_out;

		_ret_int_out = WrappGraphDrawer.getInstance(innerCallback);

		return _ret_int_out;
	}
}


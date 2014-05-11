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
public class WrappGraphDrawer extends AbstractGraphDrawer implements GraphDrawer {

	private AICallback innerCallback = null;

	public WrappGraphDrawer(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static GraphDrawer getInstance(AICallback innerCallback) {

		GraphDrawer _ret = null;
		_ret = new WrappGraphDrawer(innerCallback);
		return _ret;
	}


	@Override
	public boolean isEnabled() {

		boolean _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_isEnabled();
		return _ret_int;
	}

	@Override
	public void setPosition(float x, float y) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_setPosition(x, y);
		if (_ret_int != 0) {
			throw new CallbackAIException("setPosition", _ret_int);
		}

	}

	@Override
	public void setSize(float w, float h) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_setSize(w, h);
		if (_ret_int != 0) {
			throw new CallbackAIException("setSize", _ret_int);
		}

	}

	@Override
	public GraphLine getGraphLine() {

		GraphLine _ret_int_out;

		_ret_int_out = WrappGraphLine.getInstance(innerCallback);

		return _ret_int_out;
	}
}


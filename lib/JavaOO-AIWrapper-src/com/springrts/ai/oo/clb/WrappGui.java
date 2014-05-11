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
public class WrappGui extends AbstractGui implements Gui {

	private AICallback innerCallback = null;

	public WrappGui(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Gui getInstance(AICallback innerCallback) {

		Gui _ret = null;
		_ret = new WrappGui(innerCallback);
		return _ret;
	}


	@Override
	public float getViewRange() {

		float _ret_int;

		_ret_int = innerCallback.Gui_getViewRange();
		return _ret_int;
	}

	@Override
	public float getScreenX() {

		float _ret_int;

		_ret_int = innerCallback.Gui_getScreenX();
		return _ret_int;
	}

	@Override
	public float getScreenY() {

		float _ret_int;

		_ret_int = innerCallback.Gui_getScreenY();
		return _ret_int;
	}

	@Override
	public Camera getCamera() {

		Camera _ret_int_out;

		_ret_int_out = WrappCamera.getInstance(innerCallback);

		return _ret_int_out;
	}
}


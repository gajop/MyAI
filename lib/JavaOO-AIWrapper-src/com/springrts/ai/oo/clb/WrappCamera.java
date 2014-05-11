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
public class WrappCamera extends AbstractCamera implements Camera {

	private AICallback innerCallback = null;

	public WrappCamera(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Camera getInstance(AICallback innerCallback) {

		Camera _ret = null;
		_ret = new WrappCamera(innerCallback);
		return _ret;
	}


	@Override
	public AIFloat3 getDirection() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Gui_Camera_getDirection(return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public AIFloat3 getPosition() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Gui_Camera_getPosition(return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}
}


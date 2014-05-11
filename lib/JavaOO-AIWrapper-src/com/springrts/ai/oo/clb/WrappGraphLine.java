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
public class WrappGraphLine extends AbstractGraphLine implements GraphLine {

	private AICallback innerCallback = null;

	public WrappGraphLine(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static GraphLine getInstance(AICallback innerCallback) {

		GraphLine _ret = null;
		_ret = new WrappGraphLine(innerCallback);
		return _ret;
	}


	@Override
	public void addPoint(int lineId, float x, float y) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_GraphLine_addPoint(lineId, x, y);
		if (_ret_int != 0) {
			throw new CallbackAIException("addPoint", _ret_int);
		}

	}

	@Override
	public void deletePoints(int lineId, int numPoints) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_GraphLine_deletePoints(lineId, numPoints);
		if (_ret_int != 0) {
			throw new CallbackAIException("deletePoints", _ret_int);
		}

	}

	@Override
	public void setColor(int lineId, java.awt.Color color) throws CallbackAIException {

		int _ret_int;

		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Debug_GraphDrawer_GraphLine_setColor(lineId, color_colorS3);
		if (_ret_int != 0) {
			throw new CallbackAIException("setColor", _ret_int);
		}

	}

	@Override
	public void setLabel(int lineId, String label) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_GraphDrawer_GraphLine_setLabel(lineId, label);
		if (_ret_int != 0) {
			throw new CallbackAIException("setLabel", _ret_int);
		}

	}
}


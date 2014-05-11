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
public class WrappPathDrawer extends AbstractPathDrawer implements PathDrawer {

	private AICallback innerCallback = null;

	public WrappPathDrawer(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static PathDrawer getInstance(AICallback innerCallback) {

		PathDrawer _ret = null;
		_ret = new WrappPathDrawer(innerCallback);
		return _ret;
	}


	@Override
	public void start(AIFloat3 pos, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Map_Drawer_PathDrawer_start(pos_posF3, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("start", _ret_int);
		}

	}

	@Override
	public void finish(boolean iAmUseless) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Map_Drawer_PathDrawer_finish(iAmUseless);
		if (_ret_int != 0) {
			throw new CallbackAIException("finish", _ret_int);
		}

	}

	@Override
	public void drawLine(AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		float[] endPos_posF3 = endPos.toFloatArray();
		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Map_Drawer_PathDrawer_drawLine(endPos_posF3, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("drawLine", _ret_int);
		}

	}

	@Override
	public void drawLineAndCommandIcon(Command cmd, AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		float[] endPos_posF3 = endPos.toFloatArray();
		short[] color_colorS3 = Util.toShort3Array(color);
		int cmdId = cmd.getCommandId();

		_ret_int = innerCallback.Map_Drawer_PathDrawer_drawLineAndCommandIcon(cmdId, endPos_posF3, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("drawLineAndCommandIcon", _ret_int);
		}

	}

	@Override
	public void drawIcon(Command cmd) throws CallbackAIException {

		int _ret_int;

		int cmdId = cmd.getCommandId();

		_ret_int = innerCallback.Map_Drawer_PathDrawer_drawIcon(cmdId);
		if (_ret_int != 0) {
			throw new CallbackAIException("drawIcon", _ret_int);
		}

	}

	@Override
	public void suspend(AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		float[] endPos_posF3 = endPos.toFloatArray();
		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Map_Drawer_PathDrawer_suspend(endPos_posF3, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("suspend", _ret_int);
		}

	}

	@Override
	public void restart(boolean sameColor) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Map_Drawer_PathDrawer_restart(sameColor);
		if (_ret_int != 0) {
			throw new CallbackAIException("restart", _ret_int);
		}

	}
}


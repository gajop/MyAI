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
public class WrappOverlayTexture extends AbstractOverlayTexture implements OverlayTexture {

	private AICallback innerCallback = null;
	private int overlayTextureId = -1;

	public WrappOverlayTexture(AICallback innerCallback, int overlayTextureId) {

		this.innerCallback = innerCallback;
		this.overlayTextureId = overlayTextureId;
	}

	@Override
	public int getOverlayTextureId() {

		return overlayTextureId;
	}

	public static OverlayTexture getInstance(AICallback innerCallback, int overlayTextureId) {

		if (overlayTextureId < 0) {
			return null;
		}

		OverlayTexture _ret = null;
		_ret = new WrappOverlayTexture(innerCallback, overlayTextureId);
		return _ret;
	}


	@Override
	public void update(float[] texData, int x, int y, int w, int h) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_OverlayTexture_update(this.getOverlayTextureId(), texData, x, y, w, h);
		if (_ret_int != 0) {
			throw new CallbackAIException("update", _ret_int);
		}

	}

	@Override
	public void remove() throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_OverlayTexture_remove(this.getOverlayTextureId());
		if (_ret_int != 0) {
			throw new CallbackAIException("remove", _ret_int);
		}

	}

	@Override
	public void setPosition(float x, float y) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_OverlayTexture_setPosition(this.getOverlayTextureId(), x, y);
		if (_ret_int != 0) {
			throw new CallbackAIException("setPosition", _ret_int);
		}

	}

	@Override
	public void setSize(float w, float h) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_OverlayTexture_setSize(this.getOverlayTextureId(), w, h);
		if (_ret_int != 0) {
			throw new CallbackAIException("setSize", _ret_int);
		}

	}

	@Override
	public void setLabel(String label) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Debug_OverlayTexture_setLabel(this.getOverlayTextureId(), label);
		if (_ret_int != 0) {
			throw new CallbackAIException("setLabel", _ret_int);
		}

	}
}


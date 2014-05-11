/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubOverlayTexture extends AbstractOverlayTexture implements OverlayTexture {

	public void setOverlayTextureId(int overlayTextureId) {
		this.overlayTextureId = overlayTextureId;
	}
	private int overlayTextureId = 0;
	@Override
	public int getOverlayTextureId() {
		return overlayTextureId;
	}

	@Override
	public void update(float[] texData, int x, int y, int w, int h) throws CallbackAIException {
	}

	@Override
	public void remove() throws CallbackAIException {
	}

	@Override
	public void setPosition(float x, float y) throws CallbackAIException {
	}

	@Override
	public void setSize(float w, float h) throws CallbackAIException {
	}

	@Override
	public void setLabel(String label) throws CallbackAIException {
	}

}


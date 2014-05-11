/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubGui extends AbstractGui implements Gui {

	public void setViewRange(float viewRange) {
		this.viewRange = viewRange;
	}
	private float viewRange = 0;
	@Override
	public float getViewRange() {
		return viewRange;
	}

	public void setScreenX(float screenX) {
		this.screenX = screenX;
	}
	private float screenX = 0;
	@Override
	public float getScreenX() {
		return screenX;
	}

	public void setScreenY(float screenY) {
		this.screenY = screenY;
	}
	private float screenY = 0;
	@Override
	public float getScreenY() {
		return screenY;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	private Camera camera = null;
	@Override
	public Camera getCamera() {
		return camera;
	}

}


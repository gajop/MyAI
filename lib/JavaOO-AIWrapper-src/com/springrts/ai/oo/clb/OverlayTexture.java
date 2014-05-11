/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface OverlayTexture extends Comparable<OverlayTexture> {

	public int getOverlayTextureId();

	public void update(float[] texData, int x, int y, int w, int h) throws CallbackAIException;

	public void remove() throws CallbackAIException;

	public void setPosition(float x, float y) throws CallbackAIException;

	public void setSize(float w, float h) throws CallbackAIException;

	public void setLabel(String label) throws CallbackAIException;

}


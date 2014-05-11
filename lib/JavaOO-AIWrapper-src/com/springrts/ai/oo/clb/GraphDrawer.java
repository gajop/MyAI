/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface GraphDrawer extends Comparable<GraphDrawer> {

	public boolean isEnabled();

	public void setPosition(float x, float y) throws CallbackAIException;

	public void setSize(float w, float h) throws CallbackAIException;

	public GraphLine getGraphLine();

}


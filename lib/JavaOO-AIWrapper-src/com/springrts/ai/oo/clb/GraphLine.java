/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface GraphLine extends Comparable<GraphLine> {

	public void addPoint(int lineId, float x, float y) throws CallbackAIException;

	public void deletePoints(int lineId, int numPoints) throws CallbackAIException;

	public void setColor(int lineId, java.awt.Color color) throws CallbackAIException;

	public void setLabel(int lineId, String label) throws CallbackAIException;

}


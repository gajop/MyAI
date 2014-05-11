/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubPoint extends AbstractPoint implements Point {

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	private int pointId = 0;
	@Override
	public int getPointId() {
		return pointId;
	}

	public void setPosition(AIFloat3 position) {
		this.position = position;
	}
	private AIFloat3 position = null;
	@Override
	public AIFloat3 getPosition() {
		return position;
	}

	public void setColor(java.awt.Color color) {
		this.color = color;
	}
	private java.awt.Color color = null;
	@Override
	public java.awt.Color getColor() {
		return color;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	private String label = "";
	@Override
	public String getLabel() {
		return label;
	}

}


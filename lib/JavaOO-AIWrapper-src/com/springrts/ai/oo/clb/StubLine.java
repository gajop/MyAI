/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubLine extends AbstractLine implements Line {

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	private int lineId = 0;
	@Override
	public int getLineId() {
		return lineId;
	}

	public void setFirstPosition(AIFloat3 firstPosition) {
		this.firstPosition = firstPosition;
	}
	private AIFloat3 firstPosition = null;
	@Override
	public AIFloat3 getFirstPosition() {
		return firstPosition;
	}

	public void setSecondPosition(AIFloat3 secondPosition) {
		this.secondPosition = secondPosition;
	}
	private AIFloat3 secondPosition = null;
	@Override
	public AIFloat3 getSecondPosition() {
		return secondPosition;
	}

	public void setColor(java.awt.Color color) {
		this.color = color;
	}
	private java.awt.Color color = null;
	@Override
	public java.awt.Color getColor() {
		return color;
	}

}


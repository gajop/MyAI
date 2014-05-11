/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubCamera extends AbstractCamera implements Camera {

	public void setDirection(AIFloat3 direction) {
		this.direction = direction;
	}
	private AIFloat3 direction = null;
	@Override
	public AIFloat3 getDirection() {
		return direction;
	}

	public void setPosition(AIFloat3 position) {
		this.position = position;
	}
	private AIFloat3 position = null;
	@Override
	public AIFloat3 getPosition() {
		return position;
	}

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent once per game frame, which is about 30 times per second
 * by default.
 */
public class UpdateAIEvent implements AIEvent {

	private int frame;

	public UpdateAIEvent(int frame) {

		this.frame = frame;
	}

	public int getFrame() {
		return this.frame;
	}

}

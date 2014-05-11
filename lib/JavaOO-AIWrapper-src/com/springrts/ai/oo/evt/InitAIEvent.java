/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event initializes a Skirmish AI instance.
 * It is sent only once per AI instance and game, as the very first event.
 */
public class InitAIEvent implements AIEvent {

	private int skirmishAIId;
	private OOAICallback callback;

	public InitAIEvent(int skirmishAIId, OOAICallback callback) {

		this.skirmishAIId = skirmishAIId;
		this.callback = callback;
	}

	public int getSkirmishAIId() {
		return this.skirmishAIId;
	}

	public OOAICallback getCallback() {
		return this.callback;
	}

}

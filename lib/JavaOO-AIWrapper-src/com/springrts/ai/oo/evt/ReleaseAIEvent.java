/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event tells a Skirmish AI instance, that it is no longer needed. It
 * can be used to free memory or do other cleanup work.
 * It is sent only once per AI instance and game, as the very last event.
 * Values description for reason:
 * 0: unspecified
 * 1: game ended
 * 2: team died
 * 3: AI killed
 * 4: AI crashed
 * 5: AI failed to init
 * 6: connection lost
 * 7: other reason
 */
public class ReleaseAIEvent implements AIEvent {

	private int reason;

	public ReleaseAIEvent(int reason) {

		this.reason = reason;
	}

	public int getReason() {
		return this.reason;
	}

}

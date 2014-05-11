/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit finished processing a command or just
 * finished building, and it has currently no commands in it's queue.
 */
public class UnitIdleAIEvent implements AIEvent, UnitAIEvent {

	private Unit unit;

	public UnitIdleAIEvent(Unit unit) {

		this.unit = unit;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

}

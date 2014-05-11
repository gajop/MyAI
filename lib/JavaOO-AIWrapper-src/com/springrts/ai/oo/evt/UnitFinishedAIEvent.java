/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent whenever a unit is fully built, and contains the
 * finished unit. Usually, the unit has full health at this time, and is ready
 * to accept commands.
 * See also the unit-created event.
 */
public class UnitFinishedAIEvent implements AIEvent, UnitAIEvent, UnitLifeStateAIEvent {

	private Unit unit;

	public UnitFinishedAIEvent(Unit unit) {

		this.unit = unit;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

}

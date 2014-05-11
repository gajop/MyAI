/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent whenever a unit of this team is created, and contains
 * the created unit. Usually, the unit has only 1 HP at this time, and consists
 * only of a nano frame (-> will not accept commands yet).
 * See also the unit-finished event.
 */
public class UnitCreatedAIEvent implements AIEvent, UnitAIEvent, UnitLifeStateAIEvent {

	private Unit unit;
	private Unit builder;

	public UnitCreatedAIEvent(Unit unit, Unit builder) {

		this.unit = unit;
		this.builder = builder;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	public Unit getBuilder() {
		return this.builder;
	}

}

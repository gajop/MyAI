/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit was destroyed; see also the unit-damaged
 * event.
 * @param attacker  may be -1, which means no attacker was directly involveld,
 *                  or the attacker is not visible and cheat events are off
 */
public class UnitDestroyedAIEvent implements AIEvent, UnitAIEvent, UnitLifeStateAIEvent {

	private Unit unit;
	private Unit attacker;

	public UnitDestroyedAIEvent(Unit unit, Unit attacker) {

		this.unit = unit;
		this.attacker = attacker;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	public Unit getAttacker() {
		return this.attacker;
	}

}

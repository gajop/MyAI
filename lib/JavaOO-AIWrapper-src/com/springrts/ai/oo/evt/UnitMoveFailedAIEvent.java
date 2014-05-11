/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit received a move command and is not able to
 * fullfill it. Reasons for this are:
 * - The unit is not able to move
 * - The path to the target location is blocked
 * - The unit can not move on the terain of the target location (for example,
 *   the target is on land, and the unit is a ship)
 */
public class UnitMoveFailedAIEvent implements AIEvent, UnitAIEvent {

	private Unit unit;

	public UnitMoveFailedAIEvent(Unit unit) {

		this.unit = unit;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

}

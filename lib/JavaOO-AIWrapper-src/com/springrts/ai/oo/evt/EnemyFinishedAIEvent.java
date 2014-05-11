/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent whenever an enemy unit is fully built, and contains the
 * finished unit. Usually, the unit has full health at this time.
 * See also the unit-created event.
 */
public class EnemyFinishedAIEvent implements AIEvent, UnitAIEvent, EnemyAIEvent {

	private Unit enemy;

	public EnemyFinishedAIEvent(Unit enemy) {

		this.enemy = enemy;
	}

	@Override
	public Unit getEnemy() {
		return this.enemy;
	}
	@Override
	public Unit getUnit() {
		return this.getEnemy();
	}

}

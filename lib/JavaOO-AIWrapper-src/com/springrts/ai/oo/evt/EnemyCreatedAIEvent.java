/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent whenever a unit of an enemy team is created,
 * and contains the created unit. Usually, the unit has only 1 HP at this time,
 * and consists only of a nano frame.
 * See also the enemy-finished event.
 */
public class EnemyCreatedAIEvent implements AIEvent, UnitAIEvent, EnemyAIEvent {

	private Unit enemy;

	public EnemyCreatedAIEvent(Unit enemy) {

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

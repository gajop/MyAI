/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when an enemy unit was destroyed; see also the
 * enemy-damaged event.
 * @param attacker  may be -1, which means no attacker was directly involveld,
 *                  or the attacker is not allied with the team receiving this event
 */
public class EnemyDestroyedAIEvent implements AIEvent, UnitAIEvent, EnemyAIEvent, UnitLifeStateAIEvent {

	private Unit enemy;
	private Unit attacker;

	public EnemyDestroyedAIEvent(Unit enemy, Unit attacker) {

		this.enemy = enemy;
		this.attacker = attacker;
	}

	@Override
	public Unit getEnemy() {
		return this.enemy;
	}
	@Override
	public Unit getUnit() {
		return this.getEnemy();
	}

	public Unit getAttacker() {
		return this.attacker;
	}

}

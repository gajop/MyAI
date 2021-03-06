/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when an enemy unit entered the radar covered area of
 * this team.
 */
public class EnemyEnterRadarAIEvent implements AIEvent, UnitAIEvent, EnemyAIEvent {

	private Unit enemy;

	public EnemyEnterRadarAIEvent(Unit enemy) {

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

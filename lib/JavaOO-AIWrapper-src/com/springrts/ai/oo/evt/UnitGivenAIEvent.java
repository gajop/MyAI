/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit changed from one team to another,
 * either because the old owner gave it to the new one, or because the
 * new one took it from the old one; see the /take command.
 * Both giving and receiving team will get this event.
 */
public class UnitGivenAIEvent implements AIEvent, UnitAIEvent, UnitLifeStateAIEvent, UnitTeamChangeAIEvent {

	private Unit unit;
	private int oldTeamId;
	private int newTeamId;

	public UnitGivenAIEvent(Unit unit, int oldTeamId, int newTeamId) {

		this.unit = unit;
		this.oldTeamId = oldTeamId;
		this.newTeamId = newTeamId;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	@Override
	public int getOldTeamId() {
		return this.oldTeamId;
	}

	@Override
	public int getNewTeamId() {
		return this.newTeamId;
	}

}

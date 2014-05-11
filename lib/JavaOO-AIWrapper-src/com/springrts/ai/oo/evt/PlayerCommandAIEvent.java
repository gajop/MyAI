/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a user gives a command to one or multiple units
 * belonging to a team controlled by the AI.
 * For more info about the given commands, please use the
 * Unit.getCurrentCommands() method of the callback.
 * @param commandTopicId  see COMMAND_* defines in AISCommands.h
 * @param playerId  Id of the player that issued the command
 */
public class PlayerCommandAIEvent implements AIEvent {

	private java.util.List<Unit> units;
	private int commandTopicId;
	private int playerId;

	public PlayerCommandAIEvent(java.util.List<Unit> units, int commandTopicId, int playerId) {

		this.units = units;
		this.commandTopicId = commandTopicId;
		this.playerId = playerId;
	}

	public java.util.List<Unit> getUnits() {
		return this.units;
	}

	public int getCommandTopicId() {
		return this.commandTopicId;
	}

	public int getPlayerId() {
		return this.playerId;
	}

}

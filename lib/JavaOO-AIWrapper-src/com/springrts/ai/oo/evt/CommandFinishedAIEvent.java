/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit finished processing a command.
 * @param commandId      used on asynchronous commands only (is -1 for regular commands).
 *                       this allows the AI to identify a possible result event,
 *                       which would come with the same id
 * @param commandTopicId unique identifier of a command
 *                       (see COMMAND_* defines in AISCommands.h)
 * @see callback.handleCommand(..., int commandId, ...)
 */
public class CommandFinishedAIEvent implements AIEvent, UnitAIEvent {

	private Unit unit;
	private int commandId;
	private int commandTopicId;

	public CommandFinishedAIEvent(Unit unit, int commandId, int commandTopicId) {

		this.unit = unit;
		this.commandId = commandId;
		this.commandTopicId = commandTopicId;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	public int getCommandId() {
		return this.commandId;
	}

	public int getCommandTopicId() {
		return this.commandTopicId;
	}

}

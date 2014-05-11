/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is a notification about a chat message sent by one of the
 * participants of this game, which may be a player or an AI, including this AI.
 */
public class MessageAIEvent implements AIEvent {

	private int player;
	private String message;

	public MessageAIEvent(int player, String message) {

		this.player = player;
		this.message = message;
	}

	public int getPlayer() {
		return this.player;
	}

	public String getMessage() {
		return this.message;
	}

}

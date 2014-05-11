/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event triggers whenever any message
 * is sent by a Lua widget or unsynced gadget.
 */
public class LuaMessageAIEvent implements AIEvent {

	private String inData;

	public LuaMessageAIEvent(String inData) {

		this.inData = inData;
	}

	public String getInData() {
		return this.inData;
	}

}

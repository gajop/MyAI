/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when the AI should be loading its full state from a
 * file.
 * @param   Absolute file path, should be treated read-only
 */
public class LoadAIEvent implements AIEvent, LoadSaveAIEvent {

	private String file;

	public LoadAIEvent(String file) {

		this.file = file;
	}

	@Override
	public String getFile() {
		return this.file;
	}

}

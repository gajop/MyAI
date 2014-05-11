/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit movement is detected by means of a seismic
 * event. A seismic event means erruption/movement/shakings of the ground. This
 * can be detected by only by special units usually, eg by the seismic detector
 * building in Balanced Annihilation.
 */
public class SeismicPingAIEvent implements AIEvent {

	private AIFloat3 pos;
	private float strength;

	public SeismicPingAIEvent(AIFloat3 pos, float strength) {

		this.pos = pos;
		this.strength = strength;
	}

	public AIFloat3 getPos() {
		return this.pos;
	}

	public float getStrength() {
		return this.strength;
	}

}

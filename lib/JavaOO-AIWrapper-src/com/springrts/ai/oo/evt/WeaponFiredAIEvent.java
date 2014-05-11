/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when certain weapons are fired.
 * For performance reasons, it is not possible to send this event
 * for all weapons. Therefore, it is currently only sent for manuall-fire
 * weapons like for example the TA Commanders D-Gun or the Nuke.
 */
public class WeaponFiredAIEvent implements AIEvent, UnitAIEvent {

	private Unit unit;
	private WeaponDef weaponDef;

	public WeaponFiredAIEvent(Unit unit, WeaponDef weaponDef) {

		this.unit = unit;
		this.weaponDef = weaponDef;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	public WeaponDef getWeaponDef() {
		return this.weaponDef;
	}

}

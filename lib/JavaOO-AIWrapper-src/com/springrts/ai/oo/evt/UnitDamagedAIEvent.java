/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.evt;


import com.springrts.ai.oo.AIEvent;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.*;

/**
 * This AI event is sent when a unit was damaged. It contains the attacked unit,
 * the attacking unit, the ammount of damage and the direction from where the
 * damage was inflickted. In case of a laser weapon, the direction will point
 * directly from the attacker to the attacked unit, while with artillery it will
 * rather be from somewhere up in the sky to the attacked unit.
 * See also the unit-destroyed event.
 * @param attacker  may be -1, which means no attacker was directly involveld,
 *                  or the attacker is not visible and cheat events are off
 * @param paralyzer  if true, then damage is paralyzation damage, otherwise it is real damage
 */
public class UnitDamagedAIEvent implements AIEvent, UnitAIEvent {

	private Unit unit;
	private Unit attacker;
	private float damage;
	private AIFloat3 dir;
	private WeaponDef weaponDef;
	private boolean paralyzer;

	public UnitDamagedAIEvent(Unit unit, Unit attacker, float damage, AIFloat3 dir, WeaponDef weaponDef, boolean paralyzer) {

		this.unit = unit;
		this.attacker = attacker;
		this.damage = damage;
		this.dir = dir;
		this.weaponDef = weaponDef;
		this.paralyzer = paralyzer;
	}

	@Override
	public Unit getUnit() {
		return this.unit;
	}

	public Unit getAttacker() {
		return this.attacker;
	}

	public float getDamage() {
		return this.damage;
	}

	public AIFloat3 getDir() {
		return this.dir;
	}

	public WeaponDef getWeaponDef() {
		return this.weaponDef;
	}

	public boolean getParalyzer() {
		return this.paralyzer;
	}

}

/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubDamage extends AbstractDamage implements Damage {

	public void setWeaponDefId(int weaponDefId) {
		this.weaponDefId = weaponDefId;
	}
	private int weaponDefId = 0;
	@Override
	public int getWeaponDefId() {
		return weaponDefId;
	}

	public void setWeaponDef(WeaponDef weaponDef) {
		this.weaponDef = weaponDef;
	}
	private WeaponDef weaponDef = null;
	@Override
	public WeaponDef getWeaponDef() {
		return weaponDef;
	}

	public void setParalyzeDamageTime(int paralyzeDamageTime) {
		this.paralyzeDamageTime = paralyzeDamageTime;
	}
	private int paralyzeDamageTime = 0;
	@Override
	public int getParalyzeDamageTime() {
		return paralyzeDamageTime;
	}

	public void setImpulseFactor(float impulseFactor) {
		this.impulseFactor = impulseFactor;
	}
	private float impulseFactor = 0;
	@Override
	public float getImpulseFactor() {
		return impulseFactor;
	}

	public void setImpulseBoost(float impulseBoost) {
		this.impulseBoost = impulseBoost;
	}
	private float impulseBoost = 0;
	@Override
	public float getImpulseBoost() {
		return impulseBoost;
	}

	public void setCraterMult(float craterMult) {
		this.craterMult = craterMult;
	}
	private float craterMult = 0;
	@Override
	public float getCraterMult() {
		return craterMult;
	}

	public void setCraterBoost(float craterBoost) {
		this.craterBoost = craterBoost;
	}
	private float craterBoost = 0;
	@Override
	public float getCraterBoost() {
		return craterBoost;
	}

	public void setTypes(java.util.List<Float> types) {
		this.types = types;
	}
	private java.util.List<Float> types = null;
	@Override
	public java.util.List<Float> getTypes() {
		return types;
	}

}


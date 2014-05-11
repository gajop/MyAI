/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubModParam extends AbstractModParam implements ModParam {

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	private int unitId = 0;
	@Override
	public int getUnitId() {
		return unitId;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	private Unit unit = null;
	@Override
	public Unit getUnit() {
		return unit;
	}

	public void setModParamId(int modParamId) {
		this.modParamId = modParamId;
	}
	private int modParamId = 0;
	@Override
	public int getModParamId() {
		return modParamId;
	}

	/**
	 * Not every mod parameter has a name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setValue(float value) {
		this.value = value;
	}
	private float value = 0;
	@Override
	public float getValue() {
		return value;
	}

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubFlankingBonus extends AbstractFlankingBonus implements FlankingBonus {

	public void setUnitDefId(int unitDefId) {
		this.unitDefId = unitDefId;
	}
	private int unitDefId = 0;
	@Override
	public int getUnitDefId() {
		return unitDefId;
	}

	public void setUnitDef(UnitDef unitDef) {
		this.unitDef = unitDef;
	}
	private UnitDef unitDef = null;
	@Override
	public UnitDef getUnitDef() {
		return unitDef;
	}

	/**
	 * The flanking bonus indicates how much additional damage you can inflict to
	 * a unit, if it gets attacked from different directions.
	 * See the spring source code if you want to know it more precisely.
	 * 
	 * @return  0: no flanking bonus
	 *          1: global coords, mobile
	 *          2: unit coords, mobile
	 *          3: unit coords, locked
	 */
	public void setMode(int mode) {
		this.mode = mode;
	}
	private int mode = 0;
	@Override
	public int getMode() {
		return mode;
	}

	/**
	 * The unit takes less damage when attacked from this direction.
	 * This encourage flanking fire.
	 */
	public void setDir(AIFloat3 dir) {
		this.dir = dir;
	}
	private AIFloat3 dir = null;
	@Override
	public AIFloat3 getDir() {
		return dir;
	}

	/**
	 * Damage factor for the least protected direction
	 */
	public void setMax(float max) {
		this.max = max;
	}
	private float max = 0;
	@Override
	public float getMax() {
		return max;
	}

	/**
	 * Damage factor for the most protected direction
	 */
	public void setMin(float min) {
		this.min = min;
	}
	private float min = 0;
	@Override
	public float getMin() {
		return min;
	}

	/**
	 * How much the ability of the flanking bonus direction to move builds up each
	 * frame.
	 */
	public void setMobilityAdd(float mobilityAdd) {
		this.mobilityAdd = mobilityAdd;
	}
	private float mobilityAdd = 0;
	@Override
	public float getMobilityAdd() {
		return mobilityAdd;
	}

}


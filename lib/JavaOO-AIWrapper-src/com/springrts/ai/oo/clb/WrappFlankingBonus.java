/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.AICallback;
import com.springrts.ai.Util;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class WrappFlankingBonus extends AbstractFlankingBonus implements FlankingBonus {

	private AICallback innerCallback = null;
	private int unitDefId = -1;

	public WrappFlankingBonus(AICallback innerCallback, int unitDefId) {

		this.innerCallback = innerCallback;
		this.unitDefId = unitDefId;
	}

	@Override
	public int getUnitDefId() {

		return unitDefId;
	}

	@Override
	public UnitDef getUnitDef() {

		return WrappUnitDef.getInstance(innerCallback, unitDefId);
	}

	public static FlankingBonus getInstance(AICallback innerCallback, int unitDefId) {

		if (unitDefId < 0) {
			return null;
		}

		FlankingBonus _ret = null;
		_ret = new WrappFlankingBonus(innerCallback, unitDefId);
		return _ret;
	}


	int _buffer_getMode;
	boolean _buffer_isInitialized_getMode = false;
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
	@Override
	public int getMode() {

		if (!_buffer_isInitialized_getMode) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_FlankingBonus_getMode(this.getUnitDefId());
			_buffer_getMode = _ret_int;
			_buffer_isInitialized_getMode = true;
		}

		return _buffer_getMode;
	}

	AIFloat3 _buffer_getDir;
	boolean _buffer_isInitialized_getDir = false;
	/**
	 * The unit takes less damage when attacked from this direction.
	 * This encourage flanking fire.
	 */
	@Override
	public AIFloat3 getDir() {

		if (!_buffer_isInitialized_getDir) {
		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

			innerCallback.UnitDef_FlankingBonus_getDir(this.getUnitDefId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

			_buffer_getDir = _ret;
			_buffer_isInitialized_getDir = true;
		}

		return _buffer_getDir;
	}

	float _buffer_getMax;
	boolean _buffer_isInitialized_getMax = false;
	/**
	 * Damage factor for the least protected direction
	 */
	@Override
	public float getMax() {

		if (!_buffer_isInitialized_getMax) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_FlankingBonus_getMax(this.getUnitDefId());
			_buffer_getMax = _ret_int;
			_buffer_isInitialized_getMax = true;
		}

		return _buffer_getMax;
	}

	float _buffer_getMin;
	boolean _buffer_isInitialized_getMin = false;
	/**
	 * Damage factor for the most protected direction
	 */
	@Override
	public float getMin() {

		if (!_buffer_isInitialized_getMin) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_FlankingBonus_getMin(this.getUnitDefId());
			_buffer_getMin = _ret_int;
			_buffer_isInitialized_getMin = true;
		}

		return _buffer_getMin;
	}

	float _buffer_getMobilityAdd;
	boolean _buffer_isInitialized_getMobilityAdd = false;
	/**
	 * How much the ability of the flanking bonus direction to move builds up each
	 * frame.
	 */
	@Override
	public float getMobilityAdd() {

		if (!_buffer_isInitialized_getMobilityAdd) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_FlankingBonus_getMobilityAdd(this.getUnitDefId());
			_buffer_getMobilityAdd = _ret_int;
			_buffer_isInitialized_getMobilityAdd = true;
		}

		return _buffer_getMobilityAdd;
	}
}


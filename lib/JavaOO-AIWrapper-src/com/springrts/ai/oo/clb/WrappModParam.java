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
public class WrappModParam extends AbstractModParam implements ModParam {

	private AICallback innerCallback = null;
	private int unitId = -1;
	private int modParamId = -1;

	public WrappModParam(AICallback innerCallback, int unitId, int modParamId) {

		this.innerCallback = innerCallback;
		this.unitId = unitId;
		this.modParamId = modParamId;
	}

	@Override
	public int getUnitId() {

		return unitId;
	}

	@Override
	public Unit getUnit() {

		return WrappUnit.getInstance(innerCallback, unitId);
	}

	@Override
	public int getModParamId() {

		return modParamId;
	}

	public static ModParam getInstance(AICallback innerCallback, int unitId, int modParamId) {

		if (modParamId < 0) {
			return null;
		}

		ModParam _ret = null;
		_ret = new WrappModParam(innerCallback, unitId, modParamId);
		return _ret;
	}


	/**
	 * Not every mod parameter has a name.
	 */
	@Override
	public String getName() {

		String _ret_int;

		_ret_int = innerCallback.Unit_ModParam_getName(this.getUnitId(), this.getModParamId());
		return _ret_int;
	}

	@Override
	public float getValue() {

		float _ret_int;

		_ret_int = innerCallback.Unit_ModParam_getValue(this.getUnitId(), this.getModParamId());
		return _ret_int;
	}
}


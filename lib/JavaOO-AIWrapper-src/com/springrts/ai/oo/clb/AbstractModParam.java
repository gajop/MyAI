/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractModParam implements ModParam {

	@Override
	public int compareTo(ModParam other) {
		final int BEFORE = -1;
		final int EQUAL  =  0;
		final int AFTER  =  1;

		if (this == other) return EQUAL;

		if (this.getUnitId() < other.getUnitId()) return BEFORE;
		if (this.getUnitId() > other.getUnitId()) return AFTER;
		if (this.getModParamId() < other.getModParamId()) return BEFORE;
		if (this.getModParamId() > other.getModParamId()) return AFTER;
		return 0;
	}

	@Override
	public boolean equals(Object otherObject) {

		if (this == otherObject) return true;
		if (!(otherObject instanceof ModParam)) return false;
		ModParam other = (ModParam) otherObject;

		if (this.getUnitId() != other.getUnitId()) return false;
		if (this.getModParamId() != other.getModParamId()) return false;
		return true;
	}

	@Override
	public int hashCode() {

		int _res = 23;

		_res += this.getUnitId() * (int) (10E6);
		_res += this.getModParamId() * (int) (10E5);

		return _res;
	}

	@Override
	public String toString() {

		String _res = this.getClass().toString();

		_res = _res + "unitId=" + this.getUnitId() + ", ";
		_res = _res + "modParamId=" + this.getModParamId() + ", ";
		_res = _res + ")";

		return _res;
	}

}


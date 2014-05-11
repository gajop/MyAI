/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractLine implements Line {

	@Override
	public int compareTo(Line other) {
		final int BEFORE = -1;
		final int EQUAL  =  0;
		final int AFTER  =  1;

		if (this == other) return EQUAL;

		if (this.getLineId() < other.getLineId()) return BEFORE;
		if (this.getLineId() > other.getLineId()) return AFTER;
		return 0;
	}

	@Override
	public boolean equals(Object otherObject) {

		if (this == otherObject) return true;
		if (!(otherObject instanceof Line)) return false;
		Line other = (Line) otherObject;

		if (this.getLineId() != other.getLineId()) return false;
		return true;
	}

	@Override
	public int hashCode() {

		int _res = 23;

		_res += this.getLineId() * (int) (10E6);

		return _res;
	}

	@Override
	public String toString() {

		String _res = this.getClass().toString();

		_res = _res + "lineId=" + this.getLineId() + ", ";
		_res = _res + ")";

		return _res;
	}

}


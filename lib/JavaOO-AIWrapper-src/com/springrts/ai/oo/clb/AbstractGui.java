/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractGui implements Gui {

	@Override
	public int compareTo(Gui other) {
		final int BEFORE = -1;
		final int EQUAL  =  0;
		final int AFTER  =  1;

		if (this == other) return EQUAL;

		return 0;
	}

	@Override
	public boolean equals(Object otherObject) {

		if (this == otherObject) return true;
		if (!(otherObject instanceof Gui)) return false;
		Gui other = (Gui) otherObject;

		return true;
	}

	@Override
	public int hashCode() {

		int _res = 23;


		return _res;
	}

	@Override
	public String toString() {

		String _res = this.getClass().toString();

		_res = _res + ")";

		return _res;
	}

}


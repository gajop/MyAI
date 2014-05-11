/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractShield implements Shield {

	@Override
	public int compareTo(Shield other) {
		final int BEFORE = -1;
		final int EQUAL  =  0;
		final int AFTER  =  1;

		if (this == other) return EQUAL;

		if (this.getWeaponDefId() < other.getWeaponDefId()) return BEFORE;
		if (this.getWeaponDefId() > other.getWeaponDefId()) return AFTER;
		return 0;
	}

	@Override
	public boolean equals(Object otherObject) {

		if (this == otherObject) return true;
		if (!(otherObject instanceof Shield)) return false;
		Shield other = (Shield) otherObject;

		if (this.getWeaponDefId() != other.getWeaponDefId()) return false;
		return true;
	}

	@Override
	public int hashCode() {

		int _res = 23;

		_res += this.getWeaponDefId() * (int) (10E6);

		return _res;
	}

	@Override
	public String toString() {

		String _res = this.getClass().toString();

		_res = _res + "weaponDefId=" + this.getWeaponDefId() + ", ";
		_res = _res + ")";

		return _res;
	}

}


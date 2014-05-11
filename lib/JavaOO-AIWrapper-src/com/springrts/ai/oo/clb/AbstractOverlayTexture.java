/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public abstract class AbstractOverlayTexture implements OverlayTexture {

	@Override
	public int compareTo(OverlayTexture other) {
		final int BEFORE = -1;
		final int EQUAL  =  0;
		final int AFTER  =  1;

		if (this == other) return EQUAL;

		if (this.getOverlayTextureId() < other.getOverlayTextureId()) return BEFORE;
		if (this.getOverlayTextureId() > other.getOverlayTextureId()) return AFTER;
		return 0;
	}

	@Override
	public boolean equals(Object otherObject) {

		if (this == otherObject) return true;
		if (!(otherObject instanceof OverlayTexture)) return false;
		OverlayTexture other = (OverlayTexture) otherObject;

		if (this.getOverlayTextureId() != other.getOverlayTextureId()) return false;
		return true;
	}

	@Override
	public int hashCode() {

		int _res = 23;

		_res += this.getOverlayTextureId() * (int) (10E6);

		return _res;
	}

	@Override
	public String toString() {

		String _res = this.getClass().toString();

		_res = _res + "overlayTextureId=" + this.getOverlayTextureId() + ", ";
		_res = _res + ")";

		return _res;
	}

}


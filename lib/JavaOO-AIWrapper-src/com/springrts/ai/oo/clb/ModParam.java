/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface ModParam extends Comparable<ModParam> {

	public int getUnitId();

	public Unit getUnit();

	public int getModParamId();

	/**
	 * Not every mod parameter has a name.
	 */
	public String getName();

	public float getValue();

}

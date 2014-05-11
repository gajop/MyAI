/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubResource extends AbstractResource implements Resource {

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	private int resourceId = 0;
	@Override
	public int getResourceId() {
		return resourceId;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setOptimum(float optimum) {
		this.optimum = optimum;
	}
	private float optimum = 0;
	@Override
	public float getOptimum() {
		return optimum;
	}

}


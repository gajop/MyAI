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
public class WrappResource extends AbstractResource implements Resource {

	private AICallback innerCallback = null;
	private int resourceId = -1;

	public WrappResource(AICallback innerCallback, int resourceId) {

		this.innerCallback = innerCallback;
		this.resourceId = resourceId;
	}

	@Override
	public int getResourceId() {

		return resourceId;
	}

	public static Resource getInstance(AICallback innerCallback, int resourceId) {

		if (resourceId < 0) {
			return null;
		}

		Resource _ret = null;
		_ret = new WrappResource(innerCallback, resourceId);
		return _ret;
	}


	@Override
	public String getName() {

		String _ret_int;

		_ret_int = innerCallback.Resource_getName(this.getResourceId());
		return _ret_int;
	}

	@Override
	public float getOptimum() {

		float _ret_int;

		_ret_int = innerCallback.Resource_getOptimum(this.getResourceId());
		return _ret_int;
	}
}


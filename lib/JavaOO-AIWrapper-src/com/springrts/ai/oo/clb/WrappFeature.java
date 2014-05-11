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
public class WrappFeature extends AbstractFeature implements Feature {

	private AICallback innerCallback = null;
	private int featureId = -1;

	public WrappFeature(AICallback innerCallback, int featureId) {

		this.innerCallback = innerCallback;
		this.featureId = featureId;
	}

	@Override
	public int getFeatureId() {

		return featureId;
	}

	public static Feature getInstance(AICallback innerCallback, int featureId) {

		if (featureId < 0) {
			return null;
		}

		Feature _ret = null;
		_ret = new WrappFeature(innerCallback, featureId);
		return _ret;
	}


	@Override
	public FeatureDef getDef() {

		FeatureDef _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.Feature_getDef(this.getFeatureId());
		_ret_int_out = WrappFeatureDef.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	@Override
	public float getHealth() {

		float _ret_int;

		_ret_int = innerCallback.Feature_getHealth(this.getFeatureId());
		return _ret_int;
	}

	@Override
	public float getReclaimLeft() {

		float _ret_int;

		_ret_int = innerCallback.Feature_getReclaimLeft(this.getFeatureId());
		return _ret_int;
	}

	@Override
	public AIFloat3 getPosition() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Feature_getPosition(this.getFeatureId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}
}


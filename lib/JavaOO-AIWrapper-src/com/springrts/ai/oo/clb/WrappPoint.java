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
public class WrappPoint extends AbstractPoint implements Point {

	private AICallback innerCallback = null;
	private int pointId = -1;

	public WrappPoint(AICallback innerCallback, int pointId) {

		this.innerCallback = innerCallback;
		this.pointId = pointId;
	}

	@Override
	public int getPointId() {

		return pointId;
	}

	public static Point getInstance(AICallback innerCallback, int pointId) {

		if (pointId < 0) {
			return null;
		}

		Point _ret = null;
		_ret = new WrappPoint(innerCallback, pointId);
		return _ret;
	}


	@Override
	public AIFloat3 getPosition() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Map_Point_getPosition(this.getPointId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public java.awt.Color getColor() {

		java.awt.Color _ret;

		short[] return_colorS3_out = new short[3];

		innerCallback.Map_Point_getColor(this.getPointId(), return_colorS3_out);
		_ret = Util.toColor(return_colorS3_out);

		return _ret;
	}

	@Override
	public String getLabel() {

		String _ret_int;

		_ret_int = innerCallback.Map_Point_getLabel(this.getPointId());
		return _ret_int;
	}
}


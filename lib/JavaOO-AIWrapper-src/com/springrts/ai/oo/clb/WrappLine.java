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
public class WrappLine extends AbstractLine implements Line {

	private AICallback innerCallback = null;
	private int lineId = -1;

	public WrappLine(AICallback innerCallback, int lineId) {

		this.innerCallback = innerCallback;
		this.lineId = lineId;
	}

	@Override
	public int getLineId() {

		return lineId;
	}

	public static Line getInstance(AICallback innerCallback, int lineId) {

		if (lineId < 0) {
			return null;
		}

		Line _ret = null;
		_ret = new WrappLine(innerCallback, lineId);
		return _ret;
	}


	@Override
	public AIFloat3 getFirstPosition() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Map_Line_getFirstPosition(this.getLineId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public AIFloat3 getSecondPosition() {

		AIFloat3 _ret;

		float[] return_posF3_out = new float[3];

		innerCallback.Map_Line_getSecondPosition(this.getLineId(), return_posF3_out);
		_ret = new AIFloat3(return_posF3_out[0], return_posF3_out[1],return_posF3_out[2]);

		return _ret;
	}

	@Override
	public java.awt.Color getColor() {

		java.awt.Color _ret;

		short[] return_colorS3_out = new short[3];

		innerCallback.Map_Line_getColor(this.getLineId(), return_colorS3_out);
		_ret = Util.toColor(return_colorS3_out);

		return _ret;
	}
}


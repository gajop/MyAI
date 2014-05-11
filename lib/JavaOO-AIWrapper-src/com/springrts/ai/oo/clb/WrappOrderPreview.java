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
public class WrappOrderPreview extends AbstractOrderPreview implements OrderPreview {

	private AICallback innerCallback = null;
	private int groupId = -1;

	public WrappOrderPreview(AICallback innerCallback, int groupId) {

		this.innerCallback = innerCallback;
		this.groupId = groupId;
	}

	@Override
	public int getGroupId() {

		return groupId;
	}

	@Override
	public Group getGroup() {

		return WrappGroup.getInstance(innerCallback, groupId);
	}

	public static OrderPreview getInstance(AICallback innerCallback, int groupId) {

		if (groupId < 0) {
			return null;
		}

		OrderPreview _ret = null;
		_ret = new WrappOrderPreview(innerCallback, groupId);
		return _ret;
	}


	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	@Override
	public int getId() {

		int _ret_int;

		_ret_int = innerCallback.Group_OrderPreview_getId(this.getGroupId());
		return _ret_int;
	}

	@Override
	public short getOptions() {

		short _ret_int;

		_ret_int = innerCallback.Group_OrderPreview_getOptions(this.getGroupId());
		return _ret_int;
	}

	@Override
	public int getTag() {

		int _ret_int;

		_ret_int = innerCallback.Group_OrderPreview_getTag(this.getGroupId());
		return _ret_int;
	}

	@Override
	public int getTimeOut() {

		int _ret_int;

		_ret_int = innerCallback.Group_OrderPreview_getTimeOut(this.getGroupId());
		return _ret_int;
	}

	@Override
	public java.util.List<Float> getParams() {

		int params_sizeMax;
		int params_raw_size;
		float[] params;
		java.util.List<Float> params_list;
		int params_size;
		int _ret_int;

		params_sizeMax = Integer.MAX_VALUE;
		params = null;
		params_size = innerCallback.Group_OrderPreview_getParams(this.getGroupId(), params, params_sizeMax);
		params_sizeMax = params_size;
		params_raw_size = params_size;
		params = new float[params_raw_size];

		_ret_int = innerCallback.Group_OrderPreview_getParams(this.getGroupId(), params, params_sizeMax);
		params_list = new java.util.ArrayList<Float>(params_size);
		for (int i=0; i < params_sizeMax; i++) {
			params_list.add(params[i]);
		}

		return params_list;
	}
}


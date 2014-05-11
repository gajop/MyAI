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
public class WrappUnitSupportedCommand extends AbstractCommandDescription implements CommandDescription {

	private AICallback innerCallback = null;
	private int unitId = -1;
	private int supportedCommandId = -1;

	public WrappUnitSupportedCommand(AICallback innerCallback, int unitId, int supportedCommandId) {

		this.innerCallback = innerCallback;
		this.unitId = unitId;
		this.supportedCommandId = supportedCommandId;
	}

	public int getUnitId() {

		return unitId;
	}

	public Unit getUnit() {

		return WrappUnit.getInstance(innerCallback, unitId);
	}

	@Override
	public int getSupportedCommandId() {

		return supportedCommandId;
	}

	public static CommandDescription getInstance(AICallback innerCallback, int unitId, int supportedCommandId) {

		if (supportedCommandId < 0) {
			return null;
		}

		CommandDescription _ret = null;
		_ret = new WrappUnitSupportedCommand(innerCallback, unitId, supportedCommandId);
		return _ret;
	}


	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	@Override
	public int getId() {

		int _ret_int;

		_ret_int = innerCallback.Unit_SupportedCommand_getId(this.getUnitId(), this.getSupportedCommandId());
		return _ret_int;
	}

	@Override
	public String getName() {

		String _ret_int;

		_ret_int = innerCallback.Unit_SupportedCommand_getName(this.getUnitId(), this.getSupportedCommandId());
		return _ret_int;
	}

	@Override
	public String getToolTip() {

		String _ret_int;

		_ret_int = innerCallback.Unit_SupportedCommand_getToolTip(this.getUnitId(), this.getSupportedCommandId());
		return _ret_int;
	}

	@Override
	public boolean isShowUnique() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_SupportedCommand_isShowUnique(this.getUnitId(), this.getSupportedCommandId());
		return _ret_int;
	}

	@Override
	public boolean isDisabled() {

		boolean _ret_int;

		_ret_int = innerCallback.Unit_SupportedCommand_isDisabled(this.getUnitId(), this.getSupportedCommandId());
		return _ret_int;
	}

	@Override
	public java.util.List<String> getParams() {

		int params_sizeMax;
		int params_raw_size;
		String[] params;
		java.util.List<String> params_list;
		int params_size;
		int _ret_int;

		params_sizeMax = Integer.MAX_VALUE;
		params = null;
		params_size = innerCallback.Unit_SupportedCommand_getParams(this.getUnitId(), this.getSupportedCommandId(), params, params_sizeMax);
		params_sizeMax = params_size;
		params_raw_size = params_size;
		params = new String[params_raw_size];

		_ret_int = innerCallback.Unit_SupportedCommand_getParams(this.getUnitId(), this.getSupportedCommandId(), params, params_sizeMax);
		params_list = new java.util.ArrayList<String>(params_size);
		for (int i=0; i < params_sizeMax; i++) {
			params_list.add(params[i]);
		}

		return params_list;
	}
}


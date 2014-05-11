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
public class WrappCurrentCommand extends AbstractCommand implements Command {

	private AICallback innerCallback = null;
	private int unitId = -1;
	private int commandId = -1;

	public WrappCurrentCommand(AICallback innerCallback, int unitId, int commandId) {

		this.innerCallback = innerCallback;
		this.unitId = unitId;
		this.commandId = commandId;
	}

	public int getUnitId() {

		return unitId;
	}

	public Unit getUnit() {

		return WrappUnit.getInstance(innerCallback, unitId);
	}

	@Override
	public int getCommandId() {

		return commandId;
	}

	public static Command getInstance(AICallback innerCallback, int unitId, int commandId) {

		if (commandId < 0) {
			return null;
		}

		Command _ret = null;
		_ret = new WrappCurrentCommand(innerCallback, unitId, commandId);
		return _ret;
	}


	/**
	 * For the type of the command queue, see CCommandQueue::CommandQueueType
	 * in Sim/Unit/CommandAI/CommandQueue.h
	 */
	@Override
	public int getType() {

		int _ret_int;

		_ret_int = innerCallback.Unit_CurrentCommand_getType(this.getUnitId());
		return _ret_int;
	}

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	@Override
	public int getId() {

		int _ret_int;

		_ret_int = innerCallback.Unit_CurrentCommand_getId(this.getUnitId(), this.getCommandId());
		return _ret_int;
	}

	@Override
	public short getOptions() {

		short _ret_int;

		_ret_int = innerCallback.Unit_CurrentCommand_getOptions(this.getUnitId(), this.getCommandId());
		return _ret_int;
	}

	@Override
	public int getTag() {

		int _ret_int;

		_ret_int = innerCallback.Unit_CurrentCommand_getTag(this.getUnitId(), this.getCommandId());
		return _ret_int;
	}

	@Override
	public int getTimeOut() {

		int _ret_int;

		_ret_int = innerCallback.Unit_CurrentCommand_getTimeOut(this.getUnitId(), this.getCommandId());
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
		params_size = innerCallback.Unit_CurrentCommand_getParams(this.getUnitId(), this.getCommandId(), params, params_sizeMax);
		params_sizeMax = params_size;
		params_raw_size = params_size;
		params = new float[params_raw_size];

		_ret_int = innerCallback.Unit_CurrentCommand_getParams(this.getUnitId(), this.getCommandId(), params, params_sizeMax);
		params_list = new java.util.ArrayList<Float>(params_size);
		for (int i=0; i < params_sizeMax; i++) {
			params_list.add(params[i]);
		}

		return params_list;
	}
}


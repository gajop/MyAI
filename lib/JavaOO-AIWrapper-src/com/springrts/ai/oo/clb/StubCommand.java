/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubCommand extends AbstractCommand implements Command {

	public void setCommandId(int commandId) {
		this.commandId = commandId;
	}
	private int commandId = 0;
	@Override
	public int getCommandId() {
		return commandId;
	}

	/**
	 * For the type of the command queue, see CCommandQueue::CommandQueueType
	 * in Sim/Unit/CommandAI/CommandQueue.h
	 */
	public void setType(int type) {
		this.type = type;
	}
	private int type = 0;
	@Override
	public int getType() {
		return type;
	}

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public void setId(int id) {
		this.id = id;
	}
	private int id = 0;
	@Override
	public int getId() {
		return id;
	}

	public void setOptions(short options) {
		this.options = options;
	}
	private short options = 0;
	@Override
	public short getOptions() {
		return options;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
	private int tag = 0;
	@Override
	public int getTag() {
		return tag;
	}

	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}
	private int timeOut = 0;
	@Override
	public int getTimeOut() {
		return timeOut;
	}

	public void setParams(java.util.List<Float> params) {
		this.params = params;
	}
	private java.util.List<Float> params = null;
	@Override
	public java.util.List<Float> getParams() {
		return params;
	}

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface OrderPreview extends Comparable<OrderPreview> {

	public int getGroupId();

	public Group getGroup();

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int getId();

	public short getOptions();

	public int getTag();

	public int getTimeOut();

	public java.util.List<Float> getParams();

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface CommandDescription extends Comparable<CommandDescription> {

	public int getSupportedCommandId();

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int getId();

	public String getName();

	public String getToolTip();

	public boolean isShowUnique();

	public boolean isDisabled();

	public java.util.List<String> getParams();

}


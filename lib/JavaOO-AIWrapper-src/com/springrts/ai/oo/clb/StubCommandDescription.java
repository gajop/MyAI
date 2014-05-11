/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubCommandDescription extends AbstractCommandDescription implements CommandDescription {

	public void setSupportedCommandId(int supportedCommandId) {
		this.supportedCommandId = supportedCommandId;
	}
	private int supportedCommandId = 0;
	@Override
	public int getSupportedCommandId() {
		return supportedCommandId;
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

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}
	private String toolTip = "";
	@Override
	public String getToolTip() {
		return toolTip;
	}

	public void setShowUnique(boolean isShowUnique) {
		this.isShowUnique = isShowUnique;
	}
	private boolean isShowUnique = false;
	@Override
	public boolean isShowUnique() {
		return isShowUnique;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	private boolean isDisabled = false;
	@Override
	public boolean isDisabled() {
		return isDisabled;
	}

	public void setParams(java.util.List<String> params) {
		this.params = params;
	}
	private java.util.List<String> params = null;
	@Override
	public java.util.List<String> getParams() {
		return params;
	}

}


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubSkirmishAI extends AbstractSkirmishAI implements SkirmishAI {

	public void setSkirmishAIId(int skirmishAIId) {
		this.skirmishAIId = skirmishAIId;
	}
	private int skirmishAIId = 0;
	@Override
	public int getSkirmishAIId() {
		return skirmishAIId;
	}

	/**
	 * Returns the ID of the team controled by this Skirmish AI.
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	private int teamId = 0;
	@Override
	public int getTeamId() {
		return teamId;
	}

	public void setOptionValues(OptionValues optionValues) {
		this.optionValues = optionValues;
	}
	private OptionValues optionValues = null;
	@Override
	public OptionValues getOptionValues() {
		return optionValues;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
	private Info info = null;
	@Override
	public Info getInfo() {
		return info;
	}

}


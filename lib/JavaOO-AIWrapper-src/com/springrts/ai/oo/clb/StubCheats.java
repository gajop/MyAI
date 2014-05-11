/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubCheats extends AbstractCheats implements Cheats {

	/**
	 * Returns whether this AI may use active cheats.
	 */
	@Override
	public boolean isEnabled() {
		return false;
	}

	/**
	 * Set whether this AI may use active cheats.
	 */
	@Override
	public boolean setEnabled(boolean enable) {
		return false;
	}

	/**
	 * Set whether this AI may receive cheat events.
	 * When enabled, you would for example get informed when enemy units are
	 * created, even without sensor coverage.
	 */
	@Override
	public boolean setEventsEnabled(boolean enabled) {
		return false;
	}

	/**
	 * Returns whether cheats will desync if used by an AI.
	 * @return always true, unless we are both the host and the only client.
	 */
	public void setOnlyPassive(boolean isOnlyPassive) {
		this.isOnlyPassive = isOnlyPassive;
	}
	private boolean isOnlyPassive = false;
	@Override
	public boolean isOnlyPassive() {
		return isOnlyPassive;
	}

	/**
	 * Allows one to give an income (dis-)advantage to the team
	 * controlled by the Skirmish AI.
	 * This value can also be set through the GameSetup script,
	 * with the difference that it causes an instant desync when set here.
	 * @param factor  default: 1.0; common: [0.0, 2.0]; valid: [0.0, FLOAT_MAX]
	 */
	@Override
	public void setMyIncomeMultiplier(float factor) throws CallbackAIException {
	}

	/**
	 * The AI team receives the specified amount of units of the specified resource.
	 */
	@Override
	public void giveMeResource(Resource resource, float amount) throws CallbackAIException {
	}

	/**
	 * Creates a new unit with the selected name at pos,
	 * and returns its unit ID in ret_newUnitId.
	 */
	@Override
	public Unit giveMeUnit(UnitDef unitDef, AIFloat3 pos) {
		return null;
	}

}


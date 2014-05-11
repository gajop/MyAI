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
public class WrappCheats extends AbstractCheats implements Cheats {

	private AICallback innerCallback = null;

	public WrappCheats(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Cheats getInstance(AICallback innerCallback) {

		Cheats _ret = null;
		_ret = new WrappCheats(innerCallback);
		return _ret;
	}


	/**
	 * Returns whether this AI may use active cheats.
	 */
	@Override
	public boolean isEnabled() {

		boolean _ret_int;

		_ret_int = innerCallback.Cheats_isEnabled();
		return _ret_int;
	}

	/**
	 * Set whether this AI may use active cheats.
	 */
	@Override
	public boolean setEnabled(boolean enable) {

		boolean _ret_int;

		_ret_int = innerCallback.Cheats_setEnabled(enable);
		return _ret_int;
	}

	/**
	 * Set whether this AI may receive cheat events.
	 * When enabled, you would for example get informed when enemy units are
	 * created, even without sensor coverage.
	 */
	@Override
	public boolean setEventsEnabled(boolean enabled) {

		boolean _ret_int;

		_ret_int = innerCallback.Cheats_setEventsEnabled(enabled);
		return _ret_int;
	}

	/**
	 * Returns whether cheats will desync if used by an AI.
	 * @return always true, unless we are both the host and the only client.
	 */
	@Override
	public boolean isOnlyPassive() {

		boolean _ret_int;

		_ret_int = innerCallback.Cheats_isOnlyPassive();
		return _ret_int;
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

		int _ret_int;

		_ret_int = innerCallback.Cheats_setMyIncomeMultiplier(factor);
		if (_ret_int != 0) {
			throw new CallbackAIException("setMyIncomeMultiplier", _ret_int);
		}

	}

	/**
	 * The AI team receives the specified amount of units of the specified resource.
	 */
	@Override
	public void giveMeResource(Resource resource, float amount) throws CallbackAIException {

		int _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Cheats_giveMeResource(resourceId, amount);
		if (_ret_int != 0) {
			throw new CallbackAIException("giveMeResource", _ret_int);
		}

	}

	/**
	 * Creates a new unit with the selected name at pos,
	 * and returns its unit ID in ret_newUnitId.
	 */
	@Override
	public Unit giveMeUnit(UnitDef unitDef, AIFloat3 pos) {

		Unit _ret_int_out;
		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		int unitDefId = unitDef.getUnitDefId();

		_ret_int = innerCallback.Cheats_giveMeUnit(unitDefId, pos_posF3);
		_ret_int_out = WrappUnit.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}
}


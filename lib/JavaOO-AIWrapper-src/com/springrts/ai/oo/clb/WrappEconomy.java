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
public class WrappEconomy extends AbstractEconomy implements Economy {

	private AICallback innerCallback = null;

	public WrappEconomy(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Economy getInstance(AICallback innerCallback) {

		Economy _ret = null;
		_ret = new WrappEconomy(innerCallback);
		return _ret;
	}


	@Override
	public float getCurrent(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Economy_getCurrent(resourceId);
		return _ret_int;
	}

	@Override
	public float getIncome(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Economy_getIncome(resourceId);
		return _ret_int;
	}

	@Override
	public float getUsage(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Economy_getUsage(resourceId);
		return _ret_int;
	}

	@Override
	public float getStorage(Resource resource) {

		float _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Economy_getStorage(resourceId);
		return _ret_int;
	}

	/**
	 * Give \<amount\> units of resource \<resourceId\> to team \<receivingTeam\>.
	 * - the amount is capped to the AI team's resource levels
	 * - does not check for alliance with \<receivingTeam\>
	 * - LuaRules might not allow resource transfers, AI's must verify the deduction
	 */
	@Override
	public boolean sendResource(Resource resource, float amount, int receivingTeamId) {

		boolean _ret_int;

		int resourceId = resource.getResourceId();

		_ret_int = innerCallback.Economy_sendResource(resourceId, amount, receivingTeamId);
		return _ret_int;
	}

	/**
	 * Give units specified by \<unitIds\> to team \<receivingTeam\>.
	 * \<ret_sentUnits\> represents how many actually were transferred.
	 * Make sure this always matches the size of \<unitIds\> you passed in.
	 * If it does not, then some unitId's were filtered out.
	 * - does not check for alliance with \<receivingTeam\>
	 * - AI's should check each unit if it is still under control of their
	 *   team after the transaction via UnitTaken() and UnitGiven(), since
	 *   LuaRules might block part of it
	 */
	@Override
	public int sendUnits(java.util.List<Unit> unitIds_list, int receivingTeamId) {

		int unitIds_raw_size;
		int[] unitIds;
		int unitIds_size;
		int _ret_int;

		unitIds_size = unitIds_list.size();
		int _size = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];
		for (int i=0; i < _size; i++) {
			unitIds[i] = unitIds_list.get(i).getUnitId();
		}

		_ret_int = innerCallback.Economy_sendUnits(unitIds, unitIds_size, receivingTeamId);
		return _ret_int;
	}
}


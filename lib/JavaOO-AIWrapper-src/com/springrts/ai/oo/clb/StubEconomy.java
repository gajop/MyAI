/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubEconomy extends AbstractEconomy implements Economy {

	@Override
	public float getCurrent(Resource resource) {
		return 0;
	}

	@Override
	public float getIncome(Resource resource) {
		return 0;
	}

	@Override
	public float getUsage(Resource resource) {
		return 0;
	}

	@Override
	public float getStorage(Resource resource) {
		return 0;
	}

	/**
	 * Give \<amount\> units of resource \<resourceId\> to team \<receivingTeam\>.
	 * - the amount is capped to the AI team's resource levels
	 * - does not check for alliance with \<receivingTeam\>
	 * - LuaRules might not allow resource transfers, AI's must verify the deduction
	 */
	@Override
	public boolean sendResource(Resource resource, float amount, int receivingTeamId) {
		return false;
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
		return 0;
	}

}


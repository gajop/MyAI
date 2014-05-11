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
public class WrappPathing extends AbstractPathing implements Pathing {

	private AICallback innerCallback = null;

	public WrappPathing(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Pathing getInstance(AICallback innerCallback) {

		Pathing _ret = null;
		_ret = new WrappPathing(innerCallback);
		return _ret;
	}


	/**
	 * The following functions allow the AI to use the built-in path-finder.
	 * 
	 * - call InitPath and you get a pathId back
	 * - use this to call GetNextWaypoint to get subsequent waypoints;
	 *   the waypoints are centered on 8*8 squares
	 * - note that the pathfinder calculates the waypoints as needed,
	 *   so do not retrieve them until they are needed
	 * - the waypoint's x and z coordinates are returned in x and z,
	 *   while y is used for status codes:
	 *   y =  0: legal path waypoint IFF x >= 0 and z >= 0
	 *   y = -1: temporary waypoint, path not yet available
	 * - for pathType, @see UnitDef_MoveData_getPathType()
	 * - goalRadius defines a goal area within which any square could be accepted as
	 *   path target. If a singular goal position is wanted, use 0.0f.
	 *   default: 8.0f
	 * @param start_posF3  The starting location of the requested path
	 * @param end_posF3  The goal location of the requested path
	 * @param pathType  For what type of unit should the path be calculated
	 * @param goalRadius  default: 8.0f
	 */
	@Override
	public int initPath(AIFloat3 start, AIFloat3 end, int pathType, float goalRadius) {

		int _ret_int;

		float[] start_posF3 = start.toFloatArray();
		float[] end_posF3 = end.toFloatArray();

		_ret_int = innerCallback.Pathing_initPath(start_posF3, end_posF3, pathType, goalRadius);
		return _ret_int;
	}

	/**
	 * Returns the approximate path cost between two points.
	 * - for pathType {Ground_Move=0, Hover_Move=1, Ship_Move=2},
	 *   @see UnitDef_MoveData_getMoveType()
	 * - goalRadius defines a goal area within which any square could be accepted as
	 *   path target. If a singular goal position is wanted, use 0.0f.
	 *   default: 8.0f
	 * @param start_posF3  The starting location of the requested path
	 * @param end_posF3  The goal location of the requested path
	 * @param pathType  For what type of unit should the path be calculated
	 * @param goalRadius  default: 8.0f
	 */
	@Override
	public int getApproximateLength(AIFloat3 start, AIFloat3 end, int pathType, float goalRadius) {

		int _ret_int;

		float[] start_posF3 = start.toFloatArray();
		float[] end_posF3 = end.toFloatArray();

		_ret_int = innerCallback.Pathing_getApproximateLength(start_posF3, end_posF3, pathType, goalRadius);
		return _ret_int;
	}

	@Override
	public AIFloat3 getNextWaypoint(int pathId) throws CallbackAIException {

		AIFloat3 _ret;
		int _ret_int;

		float[] ret_nextWaypoint_posF3_out = new float[3];

		_ret_int = innerCallback.Pathing_getNextWaypoint(pathId, ret_nextWaypoint_posF3_out);
		if (_ret_int != 0) {
			throw new CallbackAIException("getNextWaypoint", _ret_int);
		}
		_ret = new AIFloat3(ret_nextWaypoint_posF3_out[0], ret_nextWaypoint_posF3_out[1],ret_nextWaypoint_posF3_out[2]);

		return _ret;
	}

	@Override
	public void freePath(int pathId) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Pathing_freePath(pathId);
		if (_ret_int != 0) {
			throw new CallbackAIException("freePath", _ret_int);
		}

	}
}


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
public class WrappDrawer extends AbstractDrawer implements Drawer {

	private AICallback innerCallback = null;

	public WrappDrawer(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Drawer getInstance(AICallback innerCallback) {

		Drawer _ret = null;
		_ret = new WrappDrawer(innerCallback);
		return _ret;
	}


	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	@Override
	public void addNotification(AIFloat3 pos, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Map_Drawer_addNotification(pos_posF3, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("addNotification", _ret_int);
		}

	}

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 * @param label  create this text on pos in my team color
	 */
	@Override
	public void addPoint(AIFloat3 pos, String label) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Map_Drawer_addPoint(pos_posF3, label);
		if (_ret_int != 0) {
			throw new CallbackAIException("addPoint", _ret_int);
		}

	}

	/**
	 * @param pos_posF3  remove map points and lines near this point (100 distance)
	 */
	@Override
	public void deletePointsAndLines(AIFloat3 pos) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Map_Drawer_deletePointsAndLines(pos_posF3);
		if (_ret_int != 0) {
			throw new CallbackAIException("deletePointsAndLines", _ret_int);
		}

	}

	/**
	 * @param posFrom_posF3  draw line from this pos
	 * @param posTo_posF3  to this pos, again only x and z matter
	 */
	@Override
	public void addLine(AIFloat3 posFrom, AIFloat3 posTo) throws CallbackAIException {

		int _ret_int;

		float[] posFrom_posF3 = posFrom.toFloatArray();
		float[] posTo_posF3 = posTo.toFloatArray();

		_ret_int = innerCallback.Map_Drawer_addLine(posFrom_posF3, posTo_posF3);
		if (_ret_int != 0) {
			throw new CallbackAIException("addLine", _ret_int);
		}

	}

	/**
	 * This function allows you to draw units onto the map.
	 * - they only show up on the local player's screen
	 * - they will be drawn in the "standard pose" (as if before any COB scripts are run)
	 * @param rotation  in radians
	 * @param lifeTime  specifies how many frames a figure should live before being auto-removed; 0 means no removal
	 * @param teamId  teamId affects the color of the unit
	 */
	@Override
	public void drawUnit(UnitDef toDrawUnitDef, AIFloat3 pos, float rotation, int lifeTime, int teamId, boolean transparent, boolean drawBorder, int facing) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		int toDrawUnitDefId = toDrawUnitDef.getUnitDefId();

		_ret_int = innerCallback.Map_Drawer_drawUnit(toDrawUnitDefId, pos_posF3, rotation, lifeTime, teamId, transparent, drawBorder, facing);
		if (_ret_int != 0) {
			throw new CallbackAIException("drawUnit", _ret_int);
		}

	}

	@Override
	public Unit traceRay(AIFloat3 rayPos, AIFloat3 rayDir, float rayLen, Unit srcUnit, int flags) {

		Unit _ret_int_out;
		int _ret_int;

		float[] rayPos_posF3 = rayPos.toFloatArray();
		float[] rayDir_posF3 = rayDir.toFloatArray();
		int srcUnitId = srcUnit.getUnitId();

		_ret_int = innerCallback.Map_Drawer_traceRay(rayPos_posF3, rayDir_posF3, rayLen, srcUnitId, flags);
		_ret_int_out = WrappUnit.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	@Override
	public Feature traceRayFeature(AIFloat3 rayPos, AIFloat3 rayDir, float rayLen, Unit srcUnit, int flags) {

		Feature _ret_int_out;
		int _ret_int;

		float[] rayPos_posF3 = rayPos.toFloatArray();
		float[] rayDir_posF3 = rayDir.toFloatArray();
		int srcUnitId = srcUnit.getUnitId();

		_ret_int = innerCallback.Map_Drawer_traceRayFeature(rayPos_posF3, rayDir_posF3, rayLen, srcUnitId, flags);
		_ret_int_out = WrappFeature.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	@Override
	public Figure getFigure() {

		Figure _ret_int_out;

		_ret_int_out = WrappFigure.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public PathDrawer getPathDrawer() {

		PathDrawer _ret_int_out;

		_ret_int_out = WrappPathDrawer.getInstance(innerCallback);

		return _ret_int_out;
	}
}


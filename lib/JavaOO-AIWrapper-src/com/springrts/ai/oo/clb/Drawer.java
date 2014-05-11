/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Drawer extends Comparable<Drawer> {

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	public void addNotification(AIFloat3 pos, java.awt.Color color, short alpha) throws CallbackAIException;

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 * @param label  create this text on pos in my team color
	 */
	public void addPoint(AIFloat3 pos, String label) throws CallbackAIException;

	/**
	 * @param pos_posF3  remove map points and lines near this point (100 distance)
	 */
	public void deletePointsAndLines(AIFloat3 pos) throws CallbackAIException;

	/**
	 * @param posFrom_posF3  draw line from this pos
	 * @param posTo_posF3  to this pos, again only x and z matter
	 */
	public void addLine(AIFloat3 posFrom, AIFloat3 posTo) throws CallbackAIException;

	/**
	 * This function allows you to draw units onto the map.
	 * - they only show up on the local player's screen
	 * - they will be drawn in the "standard pose" (as if before any COB scripts are run)
	 * @param rotation  in radians
	 * @param lifeTime  specifies how many frames a figure should live before being auto-removed; 0 means no removal
	 * @param teamId  teamId affects the color of the unit
	 */
	public void drawUnit(UnitDef toDrawUnitDef, AIFloat3 pos, float rotation, int lifeTime, int teamId, boolean transparent, boolean drawBorder, int facing) throws CallbackAIException;

	public Unit traceRay(AIFloat3 rayPos, AIFloat3 rayDir, float rayLen, Unit srcUnit, int flags);

	public Feature traceRayFeature(AIFloat3 rayPos, AIFloat3 rayDir, float rayLen, Unit srcUnit, int flags);

	public Figure getFigure();

	public PathDrawer getPathDrawer();

}


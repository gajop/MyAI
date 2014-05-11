/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Figure extends Comparable<Figure> {

	/**
	 * Creates a cubic Bezier spline figure
	 * Creates a cubic Bezier spline figure from pos1 to pos4,
	 * with control points pos2 and pos3.
	 * 
	 * - Each figure is part of a figure group
	 * - When creating figures, use 0 as \<figureGroupId\> to create
	 *   a new figure group.
	 *   The id of this figure group is returned in \<ret_newFigureGroupId\>
	 * - \<lifeTime\> specifies how many frames a figure should live
	 *   before being auto-removed; 0 means no removal
	 * - \<arrow\> == true means that the figure will get an arrow at the end
	 * @param arrow  true: means that the figure will get an arrow at the end
	 * @param lifeTime  how many frames a figure should live before being autoremoved, 0 means no removal
	 * @param figureGroupId  use 0 to get a new group
	 * @param ret_newFigureGroupId  the new group
	 */
	public int drawSpline(AIFloat3 pos1, AIFloat3 pos2, AIFloat3 pos3, AIFloat3 pos4, float width, boolean arrow, int lifeTime, int figureGroupId);

	/**
	 * Creates a straight line
	 * Creates a straight line from pos1 to pos2.
	 * 
	 * - Each figure is part of a figure group
	 * - When creating figures, use 0 as \<figureGroupId\> to create a new figure group.
	 *   The id of this figure group is returned in \<ret_newFigureGroupId\>
	 * @param lifeTime specifies how many frames a figure should live before being auto-removed;
	 *                 0 means no removal
	 * @param arrow true means that the figure will get an arrow at the end
	 * @param arrow  true: means that the figure will get an arrow at the end
	 * @param lifeTime  how many frames a figure should live before being autoremoved, 0 means no removal
	 * @param figureGroupId  use 0 to get a new group
	 * @param ret_newFigureGroupId  the new group
	 */
	public int drawLine(AIFloat3 pos1, AIFloat3 pos2, float width, boolean arrow, int lifeTime, int figureGroupId);

	/**
	 * Sets the color used to draw all lines of figures in a figure group.
	 * @param color_colorS3  (x, y, z) -> (red, green, blue)
	 */
	public void setColor(int figureGroupId, java.awt.Color color, short alpha) throws CallbackAIException;

	/**
	 * Removes a figure group, which means it will not be drawn anymore.
	 */
	public void remove(int figureGroupId) throws CallbackAIException;

}


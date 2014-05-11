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
public class WrappFigure extends AbstractFigure implements Figure {

	private AICallback innerCallback = null;

	public WrappFigure(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Figure getInstance(AICallback innerCallback) {

		Figure _ret = null;
		_ret = new WrappFigure(innerCallback);
		return _ret;
	}


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
	@Override
	public int drawSpline(AIFloat3 pos1, AIFloat3 pos2, AIFloat3 pos3, AIFloat3 pos4, float width, boolean arrow, int lifeTime, int figureGroupId) {

		int _ret_int;

		float[] pos1_posF3 = pos1.toFloatArray();
		float[] pos2_posF3 = pos2.toFloatArray();
		float[] pos3_posF3 = pos3.toFloatArray();
		float[] pos4_posF3 = pos4.toFloatArray();

		_ret_int = innerCallback.Map_Drawer_Figure_drawSpline(pos1_posF3, pos2_posF3, pos3_posF3, pos4_posF3, width, arrow, lifeTime, figureGroupId);
		return _ret_int;
	}

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
	@Override
	public int drawLine(AIFloat3 pos1, AIFloat3 pos2, float width, boolean arrow, int lifeTime, int figureGroupId) {

		int _ret_int;

		float[] pos1_posF3 = pos1.toFloatArray();
		float[] pos2_posF3 = pos2.toFloatArray();

		_ret_int = innerCallback.Map_Drawer_Figure_drawLine(pos1_posF3, pos2_posF3, width, arrow, lifeTime, figureGroupId);
		return _ret_int;
	}

	/**
	 * Sets the color used to draw all lines of figures in a figure group.
	 * @param color_colorS3  (x, y, z) -> (red, green, blue)
	 */
	@Override
	public void setColor(int figureGroupId, java.awt.Color color, short alpha) throws CallbackAIException {

		int _ret_int;

		short[] color_colorS3 = Util.toShort3Array(color);

		_ret_int = innerCallback.Map_Drawer_Figure_setColor(figureGroupId, color_colorS3, alpha);
		if (_ret_int != 0) {
			throw new CallbackAIException("setColor", _ret_int);
		}

	}

	/**
	 * Removes a figure group, which means it will not be drawn anymore.
	 */
	@Override
	public void remove(int figureGroupId) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Map_Drawer_Figure_remove(figureGroupId);
		if (_ret_int != 0) {
			throw new CallbackAIException("remove", _ret_int);
		}

	}
}


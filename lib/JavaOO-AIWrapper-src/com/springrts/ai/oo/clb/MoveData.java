/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface MoveData extends Comparable<MoveData> {

	public int getUnitDefId();

	public UnitDef getUnitDef();

	/**
	 * @deprecated
	 */
	public float getMaxAcceleration();

	/**
	 * @deprecated
	 */
	public float getMaxBreaking();

	/**
	 * @deprecated
	 */
	public float getMaxSpeed();

	/**
	 * @deprecated
	 */
	public short getMaxTurnRate();

	public int getXSize();

	public int getZSize();

	public float getDepth();

	public float getMaxSlope();

	public float getSlopeMod();

	public float getDepthMod();

	public int getPathType();

	public float getCrushStrength();

	/**
	 * enum MoveType { Ground_Move=0, Hover_Move=1, Ship_Move=2 };
	 */
	public int getMoveType();

	/**
	 * enum MoveFamily { Tank=0, KBot=1, Hover=2, Ship=3 };
	 */
	public int getMoveFamily();

	public int getTerrainClass();

	public boolean getFollowGround();

	public boolean isSubMarine();

	public String getName();

}


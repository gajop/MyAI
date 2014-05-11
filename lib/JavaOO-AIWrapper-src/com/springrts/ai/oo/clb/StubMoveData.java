/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubMoveData extends AbstractMoveData implements MoveData {

	public void setUnitDefId(int unitDefId) {
		this.unitDefId = unitDefId;
	}
	private int unitDefId = 0;
	@Override
	public int getUnitDefId() {
		return unitDefId;
	}

	public void setUnitDef(UnitDef unitDef) {
		this.unitDef = unitDef;
	}
	private UnitDef unitDef = null;
	@Override
	public UnitDef getUnitDef() {
		return unitDef;
	}

	/**
	 * @deprecated
	 */
	public void setMaxAcceleration(float maxAcceleration) {
		this.maxAcceleration = maxAcceleration;
	}
	private float maxAcceleration = 0;
	/** @deprecated */
	@Override
	public float getMaxAcceleration() {
		return maxAcceleration;
	}

	/**
	 * @deprecated
	 */
	public void setMaxBreaking(float maxBreaking) {
		this.maxBreaking = maxBreaking;
	}
	private float maxBreaking = 0;
	/** @deprecated */
	@Override
	public float getMaxBreaking() {
		return maxBreaking;
	}

	/**
	 * @deprecated
	 */
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private float maxSpeed = 0;
	/** @deprecated */
	@Override
	public float getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @deprecated
	 */
	public void setMaxTurnRate(short maxTurnRate) {
		this.maxTurnRate = maxTurnRate;
	}
	private short maxTurnRate = 0;
	/** @deprecated */
	@Override
	public short getMaxTurnRate() {
		return maxTurnRate;
	}

	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
	private int xSize = 0;
	@Override
	public int getXSize() {
		return xSize;
	}

	public void setZSize(int zSize) {
		this.zSize = zSize;
	}
	private int zSize = 0;
	@Override
	public int getZSize() {
		return zSize;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	private float depth = 0;
	@Override
	public float getDepth() {
		return depth;
	}

	public void setMaxSlope(float maxSlope) {
		this.maxSlope = maxSlope;
	}
	private float maxSlope = 0;
	@Override
	public float getMaxSlope() {
		return maxSlope;
	}

	public void setSlopeMod(float slopeMod) {
		this.slopeMod = slopeMod;
	}
	private float slopeMod = 0;
	@Override
	public float getSlopeMod() {
		return slopeMod;
	}

	public void setDepthMod(float depthMod) {
		this.depthMod = depthMod;
	}
	private float depthMod = 0;
	@Override
	public float getDepthMod() {
		return depthMod;
	}

	public void setPathType(int pathType) {
		this.pathType = pathType;
	}
	private int pathType = 0;
	@Override
	public int getPathType() {
		return pathType;
	}

	public void setCrushStrength(float crushStrength) {
		this.crushStrength = crushStrength;
	}
	private float crushStrength = 0;
	@Override
	public float getCrushStrength() {
		return crushStrength;
	}

	/**
	 * enum MoveType { Ground_Move=0, Hover_Move=1, Ship_Move=2 };
	 */
	public void setMoveType(int moveType) {
		this.moveType = moveType;
	}
	private int moveType = 0;
	@Override
	public int getMoveType() {
		return moveType;
	}

	/**
	 * enum MoveFamily { Tank=0, KBot=1, Hover=2, Ship=3 };
	 */
	public void setMoveFamily(int moveFamily) {
		this.moveFamily = moveFamily;
	}
	private int moveFamily = 0;
	@Override
	public int getMoveFamily() {
		return moveFamily;
	}

	public void setTerrainClass(int terrainClass) {
		this.terrainClass = terrainClass;
	}
	private int terrainClass = 0;
	@Override
	public int getTerrainClass() {
		return terrainClass;
	}

	public void setFollowGround(boolean followGround) {
		this.followGround = followGround;
	}
	private boolean followGround = false;
	@Override
	public boolean getFollowGround() {
		return followGround;
	}

	public void setSubMarine(boolean isSubMarine) {
		this.isSubMarine = isSubMarine;
	}
	private boolean isSubMarine = false;
	@Override
	public boolean isSubMarine() {
		return isSubMarine;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

}


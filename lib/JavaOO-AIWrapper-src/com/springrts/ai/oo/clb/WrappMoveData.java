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
public class WrappMoveData extends AbstractMoveData implements MoveData {

	private AICallback innerCallback = null;
	private int unitDefId = -1;

	public WrappMoveData(AICallback innerCallback, int unitDefId) {

		this.innerCallback = innerCallback;
		this.unitDefId = unitDefId;
	}

	@Override
	public int getUnitDefId() {

		return unitDefId;
	}

	@Override
	public UnitDef getUnitDef() {

		return WrappUnitDef.getInstance(innerCallback, unitDefId);
	}

	public static MoveData getInstance(AICallback innerCallback, int unitDefId) {

		if (unitDefId < 0) {
			return null;
		}

		MoveData _ret = null;
		boolean isAvailable = innerCallback.UnitDef_isMoveDataAvailable(unitDefId);
		if (isAvailable) {
			_ret = new WrappMoveData(innerCallback, unitDefId);
		}
		return _ret;
	}


	float _buffer_getMaxAcceleration;
	boolean _buffer_isInitialized_getMaxAcceleration = false;
	/**
	 * @deprecated
	 */
	@Override
	public float getMaxAcceleration() {

		if (!_buffer_isInitialized_getMaxAcceleration) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMaxAcceleration(this.getUnitDefId());
			_buffer_getMaxAcceleration = _ret_int;
			_buffer_isInitialized_getMaxAcceleration = true;
		}

		return _buffer_getMaxAcceleration;
	}

	float _buffer_getMaxBreaking;
	boolean _buffer_isInitialized_getMaxBreaking = false;
	/**
	 * @deprecated
	 */
	@Override
	public float getMaxBreaking() {

		if (!_buffer_isInitialized_getMaxBreaking) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMaxBreaking(this.getUnitDefId());
			_buffer_getMaxBreaking = _ret_int;
			_buffer_isInitialized_getMaxBreaking = true;
		}

		return _buffer_getMaxBreaking;
	}

	float _buffer_getMaxSpeed;
	boolean _buffer_isInitialized_getMaxSpeed = false;
	/**
	 * @deprecated
	 */
	@Override
	public float getMaxSpeed() {

		if (!_buffer_isInitialized_getMaxSpeed) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMaxSpeed(this.getUnitDefId());
			_buffer_getMaxSpeed = _ret_int;
			_buffer_isInitialized_getMaxSpeed = true;
		}

		return _buffer_getMaxSpeed;
	}

	short _buffer_getMaxTurnRate;
	boolean _buffer_isInitialized_getMaxTurnRate = false;
	/**
	 * @deprecated
	 */
	@Override
	public short getMaxTurnRate() {

		if (!_buffer_isInitialized_getMaxTurnRate) {
		short _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMaxTurnRate(this.getUnitDefId());
			_buffer_getMaxTurnRate = _ret_int;
			_buffer_isInitialized_getMaxTurnRate = true;
		}

		return _buffer_getMaxTurnRate;
	}

	int _buffer_getXSize;
	boolean _buffer_isInitialized_getXSize = false;
	@Override
	public int getXSize() {

		if (!_buffer_isInitialized_getXSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getXSize(this.getUnitDefId());
			_buffer_getXSize = _ret_int;
			_buffer_isInitialized_getXSize = true;
		}

		return _buffer_getXSize;
	}

	int _buffer_getZSize;
	boolean _buffer_isInitialized_getZSize = false;
	@Override
	public int getZSize() {

		if (!_buffer_isInitialized_getZSize) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getZSize(this.getUnitDefId());
			_buffer_getZSize = _ret_int;
			_buffer_isInitialized_getZSize = true;
		}

		return _buffer_getZSize;
	}

	float _buffer_getDepth;
	boolean _buffer_isInitialized_getDepth = false;
	@Override
	public float getDepth() {

		if (!_buffer_isInitialized_getDepth) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getDepth(this.getUnitDefId());
			_buffer_getDepth = _ret_int;
			_buffer_isInitialized_getDepth = true;
		}

		return _buffer_getDepth;
	}

	float _buffer_getMaxSlope;
	boolean _buffer_isInitialized_getMaxSlope = false;
	@Override
	public float getMaxSlope() {

		if (!_buffer_isInitialized_getMaxSlope) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMaxSlope(this.getUnitDefId());
			_buffer_getMaxSlope = _ret_int;
			_buffer_isInitialized_getMaxSlope = true;
		}

		return _buffer_getMaxSlope;
	}

	float _buffer_getSlopeMod;
	boolean _buffer_isInitialized_getSlopeMod = false;
	@Override
	public float getSlopeMod() {

		if (!_buffer_isInitialized_getSlopeMod) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getSlopeMod(this.getUnitDefId());
			_buffer_getSlopeMod = _ret_int;
			_buffer_isInitialized_getSlopeMod = true;
		}

		return _buffer_getSlopeMod;
	}

	float _buffer_getDepthMod;
	boolean _buffer_isInitialized_getDepthMod = false;
	@Override
	public float getDepthMod() {

		if (!_buffer_isInitialized_getDepthMod) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getDepthMod(this.getUnitDefId());
			_buffer_getDepthMod = _ret_int;
			_buffer_isInitialized_getDepthMod = true;
		}

		return _buffer_getDepthMod;
	}

	int _buffer_getPathType;
	boolean _buffer_isInitialized_getPathType = false;
	@Override
	public int getPathType() {

		if (!_buffer_isInitialized_getPathType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getPathType(this.getUnitDefId());
			_buffer_getPathType = _ret_int;
			_buffer_isInitialized_getPathType = true;
		}

		return _buffer_getPathType;
	}

	float _buffer_getCrushStrength;
	boolean _buffer_isInitialized_getCrushStrength = false;
	@Override
	public float getCrushStrength() {

		if (!_buffer_isInitialized_getCrushStrength) {
		float _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getCrushStrength(this.getUnitDefId());
			_buffer_getCrushStrength = _ret_int;
			_buffer_isInitialized_getCrushStrength = true;
		}

		return _buffer_getCrushStrength;
	}

	int _buffer_getMoveType;
	boolean _buffer_isInitialized_getMoveType = false;
	/**
	 * enum MoveType { Ground_Move=0, Hover_Move=1, Ship_Move=2 };
	 */
	@Override
	public int getMoveType() {

		if (!_buffer_isInitialized_getMoveType) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMoveType(this.getUnitDefId());
			_buffer_getMoveType = _ret_int;
			_buffer_isInitialized_getMoveType = true;
		}

		return _buffer_getMoveType;
	}

	int _buffer_getMoveFamily;
	boolean _buffer_isInitialized_getMoveFamily = false;
	/**
	 * enum MoveFamily { Tank=0, KBot=1, Hover=2, Ship=3 };
	 */
	@Override
	public int getMoveFamily() {

		if (!_buffer_isInitialized_getMoveFamily) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getMoveFamily(this.getUnitDefId());
			_buffer_getMoveFamily = _ret_int;
			_buffer_isInitialized_getMoveFamily = true;
		}

		return _buffer_getMoveFamily;
	}

	int _buffer_getTerrainClass;
	boolean _buffer_isInitialized_getTerrainClass = false;
	@Override
	public int getTerrainClass() {

		if (!_buffer_isInitialized_getTerrainClass) {
		int _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getTerrainClass(this.getUnitDefId());
			_buffer_getTerrainClass = _ret_int;
			_buffer_isInitialized_getTerrainClass = true;
		}

		return _buffer_getTerrainClass;
	}

	boolean _buffer_getFollowGround;
	boolean _buffer_isInitialized_getFollowGround = false;
	@Override
	public boolean getFollowGround() {

		if (!_buffer_isInitialized_getFollowGround) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getFollowGround(this.getUnitDefId());
			_buffer_getFollowGround = _ret_int;
			_buffer_isInitialized_getFollowGround = true;
		}

		return _buffer_getFollowGround;
	}

	boolean _buffer_isSubMarine;
	boolean _buffer_isInitialized_isSubMarine = false;
	@Override
	public boolean isSubMarine() {

		if (!_buffer_isInitialized_isSubMarine) {
		boolean _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_isSubMarine(this.getUnitDefId());
			_buffer_isSubMarine = _ret_int;
			_buffer_isInitialized_isSubMarine = true;
		}

		return _buffer_isSubMarine;
	}

	String _buffer_getName;
	boolean _buffer_isInitialized_getName = false;
	@Override
	public String getName() {

		if (!_buffer_isInitialized_getName) {
		String _ret_int;

			_ret_int = innerCallback.UnitDef_MoveData_getName(this.getUnitDefId());
			_buffer_getName = _ret_int;
			_buffer_isInitialized_getName = true;
		}

		return _buffer_getName;
	}
}


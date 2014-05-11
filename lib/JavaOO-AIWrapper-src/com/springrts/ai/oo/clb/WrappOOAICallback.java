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
public class WrappOOAICallback extends AbstractOOAICallback implements OOAICallback {

	private AICallback innerCallback = null;

	public WrappOOAICallback(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static OOAICallback getInstance(AICallback innerCallback) {

		OOAICallback _ret = null;
		_ret = new WrappOOAICallback(innerCallback);
		return _ret;
	}


	@Override
	public java.util.List<Resource> getResources() {

		java.util.List<Resource> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

		_ret_int = innerCallback.getResources();
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<Resource>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappResource.getInstance(innerCallback, i));
		}

		return RETURN_SIZE_list;
	}

	@Override
	public Resource getResourceByName(String resourceName) {

		Resource _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.getResourceByName(resourceName);
		_ret_int_out = WrappResource.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	java.util.List<UnitDef> _buffer_getUnitDefs;
	boolean _buffer_isInitialized_getUnitDefs = false;
	/**
	 * A UnitDef contains all properties of a unit that are specific to its type,
	 * for example the number and type of weapons or max-speed.
	 * These properties are usually fixed, and not meant to change during a game.
	 * The unitId is a unique id for this type of unit.
	 */
	@Override
	public java.util.List<UnitDef> getUnitDefs() {

		if (!_buffer_isInitialized_getUnitDefs) {
		int unitDefIds_sizeMax;
		int unitDefIds_raw_size;
		int[] unitDefIds;
		java.util.List<UnitDef> unitDefIds_list;
		int unitDefIds_size;
		int _ret_int;

		unitDefIds_sizeMax = Integer.MAX_VALUE;
		unitDefIds = null;
		unitDefIds_size = innerCallback.getUnitDefs(unitDefIds, unitDefIds_sizeMax);
		unitDefIds_sizeMax = unitDefIds_size;
		unitDefIds_raw_size = unitDefIds_size;
		unitDefIds = new int[unitDefIds_raw_size];

			_ret_int = innerCallback.getUnitDefs(unitDefIds, unitDefIds_sizeMax);
		unitDefIds_list = new java.util.ArrayList<UnitDef>(unitDefIds_size);
		for (int i=0; i < unitDefIds_sizeMax; i++) {
			unitDefIds_list.add(com.springrts.ai.oo.clb.WrappUnitDef.getInstance(innerCallback, unitDefIds[i]));
		}

			_buffer_getUnitDefs = unitDefIds_list;
			_buffer_isInitialized_getUnitDefs = true;
		}

		return _buffer_getUnitDefs;
	}

	@Override
	public UnitDef getUnitDefByName(String unitName) {

		UnitDef _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.getUnitDefByName(unitName);
		_ret_int_out = WrappUnitDef.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS.
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	@Override
	public java.util.List<Unit> getEnemyUnits() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getEnemyUnits(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getEnemyUnits(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS plus they have to be located in the specified area
	 * of the map.
	 * If cheats are enabled, this will return all enemies
	 * in the specified area.
	 */
	@Override
	public java.util.List<Unit> getEnemyUnitsIn(AIFloat3 pos, float radius) {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getEnemyUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getEnemyUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in under sensor coverage (sight or radar).
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	@Override
	public java.util.List<Unit> getEnemyUnitsInRadarAndLos() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getEnemyUnitsInRadarAndLos(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getEnemyUnitsInRadarAndLos(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units.
	 */
	@Override
	public java.util.List<Unit> getFriendlyUnits() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getFriendlyUnits(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getFriendlyUnits(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units plus they have to be located in the specified area of the map.
	 */
	@Override
	public java.util.List<Unit> getFriendlyUnitsIn(AIFloat3 pos, float radius) {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getFriendlyUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getFriendlyUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are neutral and are in LOS.
	 */
	@Override
	public java.util.List<Unit> getNeutralUnits() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getNeutralUnits(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getNeutralUnits(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are neutral and are in LOS plus they have to be
	 * located in the specified area of the map.
	 */
	@Override
	public java.util.List<Unit> getNeutralUnitsIn(AIFloat3 pos, float radius) {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getNeutralUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getNeutralUnitsIn(pos_posF3, radius, unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are of the team controlled by this AI instance. This
	 * list can also be created dynamically by the AI, through updating a list on
	 * each unit-created and unit-destroyed event.
	 */
	@Override
	public java.util.List<Unit> getTeamUnits() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getTeamUnits(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getTeamUnits(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	/**
	 * Returns all units that are currently selected
	 * (usually only contains units if a human player
	 * is controlling this team as well).
	 */
	@Override
	public java.util.List<Unit> getSelectedUnits() {

		int unitIds_sizeMax;
		int unitIds_raw_size;
		int[] unitIds;
		java.util.List<Unit> unitIds_list;
		int unitIds_size;
		int _ret_int;

		unitIds_sizeMax = Integer.MAX_VALUE;
		unitIds = null;
		unitIds_size = innerCallback.getSelectedUnits(unitIds, unitIds_sizeMax);
		unitIds_sizeMax = unitIds_size;
		unitIds_raw_size = unitIds_size;
		unitIds = new int[unitIds_raw_size];

		_ret_int = innerCallback.getSelectedUnits(unitIds, unitIds_sizeMax);
		unitIds_list = new java.util.ArrayList<Unit>(unitIds_size);
		for (int i=0; i < unitIds_sizeMax; i++) {
			unitIds_list.add(com.springrts.ai.oo.clb.WrappUnit.getInstance(innerCallback, unitIds[i]));
		}

		return unitIds_list;
	}

	@Override
	public java.util.List<Group> getGroups() {

		int groupIds_sizeMax;
		int groupIds_raw_size;
		int[] groupIds;
		java.util.List<Group> groupIds_list;
		int groupIds_size;
		int _ret_int;

		groupIds_sizeMax = Integer.MAX_VALUE;
		groupIds = null;
		groupIds_size = innerCallback.getGroups(groupIds, groupIds_sizeMax);
		groupIds_sizeMax = groupIds_size;
		groupIds_raw_size = groupIds_size;
		groupIds = new int[groupIds_raw_size];

		_ret_int = innerCallback.getGroups(groupIds, groupIds_sizeMax);
		groupIds_list = new java.util.ArrayList<Group>(groupIds_size);
		for (int i=0; i < groupIds_sizeMax; i++) {
			groupIds_list.add(com.springrts.ai.oo.clb.WrappGroup.getInstance(innerCallback, groupIds[i]));
		}

		return groupIds_list;
	}

	java.util.List<FeatureDef> _buffer_getFeatureDefs;
	boolean _buffer_isInitialized_getFeatureDefs = false;
	@Override
	public java.util.List<FeatureDef> getFeatureDefs() {

		if (!_buffer_isInitialized_getFeatureDefs) {
		int featureDefIds_sizeMax;
		int featureDefIds_raw_size;
		int[] featureDefIds;
		java.util.List<FeatureDef> featureDefIds_list;
		int featureDefIds_size;
		int _ret_int;

		featureDefIds_sizeMax = Integer.MAX_VALUE;
		featureDefIds = null;
		featureDefIds_size = innerCallback.getFeatureDefs(featureDefIds, featureDefIds_sizeMax);
		featureDefIds_sizeMax = featureDefIds_size;
		featureDefIds_raw_size = featureDefIds_size;
		featureDefIds = new int[featureDefIds_raw_size];

			_ret_int = innerCallback.getFeatureDefs(featureDefIds, featureDefIds_sizeMax);
		featureDefIds_list = new java.util.ArrayList<FeatureDef>(featureDefIds_size);
		for (int i=0; i < featureDefIds_sizeMax; i++) {
			featureDefIds_list.add(com.springrts.ai.oo.clb.WrappFeatureDef.getInstance(innerCallback, featureDefIds[i]));
		}

			_buffer_getFeatureDefs = featureDefIds_list;
			_buffer_isInitialized_getFeatureDefs = true;
		}

		return _buffer_getFeatureDefs;
	}

	/**
	 * Returns all features currently in LOS, or all features on the map
	 * if cheating is enabled.
	 */
	@Override
	public java.util.List<Feature> getFeatures() {

		int featureIds_sizeMax;
		int featureIds_raw_size;
		int[] featureIds;
		java.util.List<Feature> featureIds_list;
		int featureIds_size;
		int _ret_int;

		featureIds_sizeMax = Integer.MAX_VALUE;
		featureIds = null;
		featureIds_size = innerCallback.getFeatures(featureIds, featureIds_sizeMax);
		featureIds_sizeMax = featureIds_size;
		featureIds_raw_size = featureIds_size;
		featureIds = new int[featureIds_raw_size];

		_ret_int = innerCallback.getFeatures(featureIds, featureIds_sizeMax);
		featureIds_list = new java.util.ArrayList<Feature>(featureIds_size);
		for (int i=0; i < featureIds_sizeMax; i++) {
			featureIds_list.add(com.springrts.ai.oo.clb.WrappFeature.getInstance(innerCallback, featureIds[i]));
		}

		return featureIds_list;
	}

	/**
	 * Returns all features in a specified area that are currently in LOS,
	 * or all features in this area if cheating is enabled.
	 */
	@Override
	public java.util.List<Feature> getFeaturesIn(AIFloat3 pos, float radius) {

		int featureIds_sizeMax;
		int featureIds_raw_size;
		int[] featureIds;
		java.util.List<Feature> featureIds_list;
		int featureIds_size;
		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();
		featureIds_sizeMax = Integer.MAX_VALUE;
		featureIds = null;
		featureIds_size = innerCallback.getFeaturesIn(pos_posF3, radius, featureIds, featureIds_sizeMax);
		featureIds_sizeMax = featureIds_size;
		featureIds_raw_size = featureIds_size;
		featureIds = new int[featureIds_raw_size];

		_ret_int = innerCallback.getFeaturesIn(pos_posF3, radius, featureIds, featureIds_sizeMax);
		featureIds_list = new java.util.ArrayList<Feature>(featureIds_size);
		for (int i=0; i < featureIds_sizeMax; i++) {
			featureIds_list.add(com.springrts.ai.oo.clb.WrappFeature.getInstance(innerCallback, featureIds[i]));
		}

		return featureIds_list;
	}

	java.util.List<WeaponDef> _buffer_getWeaponDefs;
	boolean _buffer_isInitialized_getWeaponDefs = false;
	@Override
	public java.util.List<WeaponDef> getWeaponDefs() {

		if (!_buffer_isInitialized_getWeaponDefs) {
		java.util.List<WeaponDef> RETURN_SIZE_list;
		int RETURN_SIZE_size;
		int _ret_int;

			_ret_int = innerCallback.getWeaponDefs();
		RETURN_SIZE_size = _ret_int;
		RETURN_SIZE_list = new java.util.ArrayList<WeaponDef>(RETURN_SIZE_size);
		for (int i=0; i < RETURN_SIZE_size; i++) {
			RETURN_SIZE_list.add(com.springrts.ai.oo.clb.WrappWeaponDef.getInstance(innerCallback, i));
		}

			_buffer_getWeaponDefs = RETURN_SIZE_list;
			_buffer_isInitialized_getWeaponDefs = true;
		}

		return _buffer_getWeaponDefs;
	}

	@Override
	public WeaponDef getWeaponDefByName(String weaponDefName) {

		WeaponDef _ret_int_out;
		int _ret_int;

		_ret_int = innerCallback.getWeaponDefByName(weaponDefName);
		_ret_int_out = WrappWeaponDef.getInstance(innerCallback, _ret_int);

		return _ret_int_out;
	}

	@Override
	public SkirmishAI getSkirmishAI() {

		SkirmishAI _ret_int_out;

		_ret_int_out = WrappSkirmishAI.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Pathing getPathing() {

		Pathing _ret_int_out;

		_ret_int_out = WrappPathing.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Economy getEconomy() {

		Economy _ret_int_out;

		_ret_int_out = WrappEconomy.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Teams getTeams() {

		Teams _ret_int_out;

		_ret_int_out = WrappTeams.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public DataDirs getDataDirs() {

		DataDirs _ret_int_out;

		_ret_int_out = WrappDataDirs.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Game getGame() {

		Game _ret_int_out;

		_ret_int_out = WrappGame.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Cheats getCheats() {

		Cheats _ret_int_out;

		_ret_int_out = WrappCheats.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Map getMap() {

		Map _ret_int_out;

		_ret_int_out = WrappMap.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Log getLog() {

		Log _ret_int_out;

		_ret_int_out = WrappLog.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Debug getDebug() {

		Debug _ret_int_out;

		_ret_int_out = WrappDebug.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Gui getGui() {

		Gui _ret_int_out;

		_ret_int_out = WrappGui.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Mod getMod() {

		Mod _ret_int_out;

		_ret_int_out = WrappMod.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public Engine getEngine() {

		Engine _ret_int_out;

		_ret_int_out = WrappEngine.getInstance(innerCallback);

		return _ret_int_out;
	}

	@Override
	public SkirmishAIs getSkirmishAIs() {

		SkirmishAIs _ret_int_out;

		_ret_int_out = WrappSkirmishAIs.getInstance(innerCallback);

		return _ret_int_out;
	}
}


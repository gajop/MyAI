/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface OOAICallback extends Comparable<OOAICallback> {

	public java.util.List<Resource> getResources();

	public Resource getResourceByName(String resourceName);

	/**
	 * A UnitDef contains all properties of a unit that are specific to its type,
	 * for example the number and type of weapons or max-speed.
	 * These properties are usually fixed, and not meant to change during a game.
	 * The unitId is a unique id for this type of unit.
	 */
	public java.util.List<UnitDef> getUnitDefs();

	public UnitDef getUnitDefByName(String unitName);

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS.
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public java.util.List<Unit> getEnemyUnits();

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS plus they have to be located in the specified area
	 * of the map.
	 * If cheats are enabled, this will return all enemies
	 * in the specified area.
	 */
	public java.util.List<Unit> getEnemyUnitsIn(AIFloat3 pos, float radius);

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in under sensor coverage (sight or radar).
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public java.util.List<Unit> getEnemyUnitsInRadarAndLos();

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units.
	 */
	public java.util.List<Unit> getFriendlyUnits();

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units plus they have to be located in the specified area of the map.
	 */
	public java.util.List<Unit> getFriendlyUnitsIn(AIFloat3 pos, float radius);

	/**
	 * Returns all units that are neutral and are in LOS.
	 */
	public java.util.List<Unit> getNeutralUnits();

	/**
	 * Returns all units that are neutral and are in LOS plus they have to be
	 * located in the specified area of the map.
	 */
	public java.util.List<Unit> getNeutralUnitsIn(AIFloat3 pos, float radius);

	/**
	 * Returns all units that are of the team controlled by this AI instance. This
	 * list can also be created dynamically by the AI, through updating a list on
	 * each unit-created and unit-destroyed event.
	 */
	public java.util.List<Unit> getTeamUnits();

	/**
	 * Returns all units that are currently selected
	 * (usually only contains units if a human player
	 * is controlling this team as well).
	 */
	public java.util.List<Unit> getSelectedUnits();

	public java.util.List<Group> getGroups();

	public java.util.List<FeatureDef> getFeatureDefs();

	/**
	 * Returns all features currently in LOS, or all features on the map
	 * if cheating is enabled.
	 */
	public java.util.List<Feature> getFeatures();

	/**
	 * Returns all features in a specified area that are currently in LOS,
	 * or all features in this area if cheating is enabled.
	 */
	public java.util.List<Feature> getFeaturesIn(AIFloat3 pos, float radius);

	public java.util.List<WeaponDef> getWeaponDefs();

	public WeaponDef getWeaponDefByName(String weaponDefName);

	public SkirmishAI getSkirmishAI();

	public Pathing getPathing();

	public Economy getEconomy();

	public Teams getTeams();

	public DataDirs getDataDirs();

	public Game getGame();

	public Cheats getCheats();

	public Map getMap();

	public Log getLog();

	public Debug getDebug();

	public Gui getGui();

	public Mod getMod();

	public Engine getEngine();

	public SkirmishAIs getSkirmishAIs();

}


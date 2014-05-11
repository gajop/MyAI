/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubOOAICallback extends AbstractOOAICallback implements OOAICallback {

	public void setResources(java.util.List<Resource> resources) {
		this.resources = resources;
	}
	private java.util.List<Resource> resources = null;
	@Override
	public java.util.List<Resource> getResources() {
		return resources;
	}

	@Override
	public Resource getResourceByName(String resourceName) {
		return null;
	}

	/**
	 * A UnitDef contains all properties of a unit that are specific to its type,
	 * for example the number and type of weapons or max-speed.
	 * These properties are usually fixed, and not meant to change during a game.
	 * The unitId is a unique id for this type of unit.
	 */
	public void setUnitDefs(java.util.List<UnitDef> unitDefs) {
		this.unitDefs = unitDefs;
	}
	private java.util.List<UnitDef> unitDefs = null;
	@Override
	public java.util.List<UnitDef> getUnitDefs() {
		return unitDefs;
	}

	@Override
	public UnitDef getUnitDefByName(String unitName) {
		return null;
	}

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS.
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public void setEnemyUnits(java.util.List<Unit> enemyUnits) {
		this.enemyUnits = enemyUnits;
	}
	private java.util.List<Unit> enemyUnits = null;
	@Override
	public java.util.List<Unit> getEnemyUnits() {
		return enemyUnits;
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
		return null;
	}

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in under sensor coverage (sight or radar).
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public void setEnemyUnitsInRadarAndLos(java.util.List<Unit> enemyUnitsInRadarAndLos) {
		this.enemyUnitsInRadarAndLos = enemyUnitsInRadarAndLos;
	}
	private java.util.List<Unit> enemyUnitsInRadarAndLos = null;
	@Override
	public java.util.List<Unit> getEnemyUnitsInRadarAndLos() {
		return enemyUnitsInRadarAndLos;
	}

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units.
	 */
	public void setFriendlyUnits(java.util.List<Unit> friendlyUnits) {
		this.friendlyUnits = friendlyUnits;
	}
	private java.util.List<Unit> friendlyUnits = null;
	@Override
	public java.util.List<Unit> getFriendlyUnits() {
		return friendlyUnits;
	}

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units plus they have to be located in the specified area of the map.
	 */
	@Override
	public java.util.List<Unit> getFriendlyUnitsIn(AIFloat3 pos, float radius) {
		return null;
	}

	/**
	 * Returns all units that are neutral and are in LOS.
	 */
	public void setNeutralUnits(java.util.List<Unit> neutralUnits) {
		this.neutralUnits = neutralUnits;
	}
	private java.util.List<Unit> neutralUnits = null;
	@Override
	public java.util.List<Unit> getNeutralUnits() {
		return neutralUnits;
	}

	/**
	 * Returns all units that are neutral and are in LOS plus they have to be
	 * located in the specified area of the map.
	 */
	@Override
	public java.util.List<Unit> getNeutralUnitsIn(AIFloat3 pos, float radius) {
		return null;
	}

	/**
	 * Returns all units that are of the team controlled by this AI instance. This
	 * list can also be created dynamically by the AI, through updating a list on
	 * each unit-created and unit-destroyed event.
	 */
	public void setTeamUnits(java.util.List<Unit> teamUnits) {
		this.teamUnits = teamUnits;
	}
	private java.util.List<Unit> teamUnits = null;
	@Override
	public java.util.List<Unit> getTeamUnits() {
		return teamUnits;
	}

	/**
	 * Returns all units that are currently selected
	 * (usually only contains units if a human player
	 * is controlling this team as well).
	 */
	public void setSelectedUnits(java.util.List<Unit> selectedUnits) {
		this.selectedUnits = selectedUnits;
	}
	private java.util.List<Unit> selectedUnits = null;
	@Override
	public java.util.List<Unit> getSelectedUnits() {
		return selectedUnits;
	}

	public void setGroups(java.util.List<Group> groups) {
		this.groups = groups;
	}
	private java.util.List<Group> groups = null;
	@Override
	public java.util.List<Group> getGroups() {
		return groups;
	}

	public void setFeatureDefs(java.util.List<FeatureDef> featureDefs) {
		this.featureDefs = featureDefs;
	}
	private java.util.List<FeatureDef> featureDefs = null;
	@Override
	public java.util.List<FeatureDef> getFeatureDefs() {
		return featureDefs;
	}

	/**
	 * Returns all features currently in LOS, or all features on the map
	 * if cheating is enabled.
	 */
	public void setFeatures(java.util.List<Feature> features) {
		this.features = features;
	}
	private java.util.List<Feature> features = null;
	@Override
	public java.util.List<Feature> getFeatures() {
		return features;
	}

	/**
	 * Returns all features in a specified area that are currently in LOS,
	 * or all features in this area if cheating is enabled.
	 */
	@Override
	public java.util.List<Feature> getFeaturesIn(AIFloat3 pos, float radius) {
		return null;
	}

	public void setWeaponDefs(java.util.List<WeaponDef> weaponDefs) {
		this.weaponDefs = weaponDefs;
	}
	private java.util.List<WeaponDef> weaponDefs = null;
	@Override
	public java.util.List<WeaponDef> getWeaponDefs() {
		return weaponDefs;
	}

	@Override
	public WeaponDef getWeaponDefByName(String weaponDefName) {
		return null;
	}

	public void setSkirmishAI(SkirmishAI skirmishAI) {
		this.skirmishAI = skirmishAI;
	}
	private SkirmishAI skirmishAI = null;
	@Override
	public SkirmishAI getSkirmishAI() {
		return skirmishAI;
	}

	public void setPathing(Pathing pathing) {
		this.pathing = pathing;
	}
	private Pathing pathing = null;
	@Override
	public Pathing getPathing() {
		return pathing;
	}

	public void setEconomy(Economy economy) {
		this.economy = economy;
	}
	private Economy economy = null;
	@Override
	public Economy getEconomy() {
		return economy;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}
	private Teams teams = null;
	@Override
	public Teams getTeams() {
		return teams;
	}

	public void setDataDirs(DataDirs dataDirs) {
		this.dataDirs = dataDirs;
	}
	private DataDirs dataDirs = null;
	@Override
	public DataDirs getDataDirs() {
		return dataDirs;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	private Game game = null;
	@Override
	public Game getGame() {
		return game;
	}

	public void setCheats(Cheats cheats) {
		this.cheats = cheats;
	}
	private Cheats cheats = null;
	@Override
	public Cheats getCheats() {
		return cheats;
	}

	public void setMap(Map map) {
		this.map = map;
	}
	private Map map = null;
	@Override
	public Map getMap() {
		return map;
	}

	public void setLog(Log log) {
		this.log = log;
	}
	private Log log = null;
	@Override
	public Log getLog() {
		return log;
	}

	public void setDebug(Debug debug) {
		this.debug = debug;
	}
	private Debug debug = null;
	@Override
	public Debug getDebug() {
		return debug;
	}

	public void setGui(Gui gui) {
		this.gui = gui;
	}
	private Gui gui = null;
	@Override
	public Gui getGui() {
		return gui;
	}

	public void setMod(Mod mod) {
		this.mod = mod;
	}
	private Mod mod = null;
	@Override
	public Mod getMod() {
		return mod;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	private Engine engine = null;
	@Override
	public Engine getEngine() {
		return engine;
	}

	public void setSkirmishAIs(SkirmishAIs skirmishAIs) {
		this.skirmishAIs = skirmishAIs;
	}
	private SkirmishAIs skirmishAIs = null;
	@Override
	public SkirmishAIs getSkirmishAIs() {
		return skirmishAIs;
	}

}


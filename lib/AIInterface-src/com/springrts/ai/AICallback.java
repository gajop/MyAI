/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai;


/**
 * Lets Java Skirmish AIs call back to the Spring engine.
 * We are using JNI for best speed.
 *
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface AICallback {

	public int SkirmishAI_getSkirmishAIId();

	/**
	 * Returns the major engine revision number (e.g. 83)
	 */
	public String Engine_Version_getMajor();

	/**
	 * Minor version number (e.g. "5")
	 * @deprecated since 4. October 2011 (pre release 83), will always return "0"
	 */
	public String Engine_Version_getMinor();

	/**
	 * Clients that only differ in patchset can still play together.
	 * Also demos should be compatible between patchsets.
	 */
	public String Engine_Version_getPatchset();

	/**
	 * SCM Commits version part (e.g. "" or "13")
	 * Number of commits since the last version tag.
	 * This matches the regex "[0-9]*".
	 */
	public String Engine_Version_getCommits();

	/**
	 * SCM unique identifier for the current commit.
	 * This matches the regex "([0-9a-f]{6})?".
	 */
	public String Engine_Version_getHash();

	/**
	 * SCM branch name (e.g. "master" or "develop")
	 */
	public String Engine_Version_getBranch();

	/**
	 * Additional information (compiler flags, svn revision etc.)
	 */
	public String Engine_Version_getAdditional();

	/**
	 * time of build
	 */
	public String Engine_Version_getBuildTime();

	/**
	 * Returns whether this is a release build of the engine
	 */
	public boolean Engine_Version_isRelease();

	/**
	 * The basic part of a spring version.
	 * This may only be used for sync-checking if IsRelease() returns true.
	 * @return "Major.PatchSet" or "Major.PatchSet.1"
	 */
	public String Engine_Version_getNormal();

	/**
	 * The sync relevant part of a spring version.
	 * This may be used for sync-checking through a simple string-equality test.
	 * @return "Major" or "Major.PatchSet.1-Commits-gHash Branch"
	 */
	public String Engine_Version_getSync();

	/**
	 * The verbose, human readable version.
	 * @return "Major.Patchset[.1-Commits-gHash Branch] (Additional)"
	 */
	public String Engine_Version_getFull();

	/**
	 * Returns the number of teams in this game
	 */
	public int Teams_getSize();

	/**
	 * Returns the number of skirmish AIs in this game
	 */
	public int SkirmishAIs_getSize();

	/**
	 * Returns the maximum number of skirmish AIs in any game
	 */
	public int SkirmishAIs_getMax();

	/**
	 * Returns the ID of the team controled by this Skirmish AI.
	 */
	public int SkirmishAI_getTeamId();

	/**
	 * Returns the number of info key-value pairs in the info map
	 * for this Skirmish AI.
	 */
	public int SkirmishAI_Info_getSize();

	/**
	 * Returns the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	public String SkirmishAI_Info_getKey(int infoIndex);

	/**
	 * Returns the value at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	public String SkirmishAI_Info_getValue(int infoIndex);

	/**
	 * Returns the description of the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	public String SkirmishAI_Info_getDescription(int infoIndex);

	/**
	 * Returns the value associated with the given key in the info map
	 * for this Skirmish AI, or NULL if not found.
	 */
	public String SkirmishAI_Info_getValueByKey(String key);

	/**
	 * Returns the number of option key-value pairs in the options map
	 * for this Skirmish AI.
	 */
	public int SkirmishAI_OptionValues_getSize();

	/**
	 * Returns the key at index optionIndex in the options map
	 * for this Skirmish AI, or NULL if the optionIndex is invalid.
	 */
	public String SkirmishAI_OptionValues_getKey(int optionIndex);

	/**
	 * Returns the value at index optionIndex in the options map
	 * for this Skirmish AI, or NULL if the optionIndex is invalid.
	 */
	public String SkirmishAI_OptionValues_getValue(int optionIndex);

	/**
	 * Returns the value associated with the given key in the options map
	 * for this Skirmish AI, or NULL if not found.
	 */
	public String SkirmishAI_OptionValues_getValueByKey(String key);

	/**
	 * This will end up in infolog
	 */
	public void Log_log(String msg);

	/**
	 * Inform the engine of an error that happend in the interface.
	 * @param   msg       error message
	 * @param   severety  from 10 for minor to 0 for fatal
	 * @param   die       if this is set to true, the engine assumes
	 *                    the interface is in an irreparable state, and it will
	 *                    unload it immediately.
	 */
	public void Log_exception(String msg, int severety, boolean die);

	/**
	 * Returns '/' on posix and '\\' on windows
	 */
	public char DataDirs_getPathSeparator();

	/**
	 * This interfaces main data dir, which is where the shared library
	 * and the InterfaceInfo.lua file are located, e.g.:
	 * /usr/share/games/spring/AI/Skirmish/RAI/0.601/
	 */
	public String DataDirs_getConfigDir();

	/**
	 * This interfaces writable data dir, which is where eg logs, caches
	 * and learning data should be stored, e.g.:
	 * /home/userX/.spring/AI/Skirmish/RAI/0.601/
	 */
	public String DataDirs_getWriteableDir();

	/**
	 * Returns an absolute path which consists of:
	 * data-dir + Skirmish-AI-path + relative-path.
	 * 
	 * example:
	 * input:  "log/main.log", writeable, create, !dir, !common
	 * output: "/home/userX/.spring/AI/Skirmish/RAI/0.601/log/main.log"
	 * The path "/home/userX/.spring/AI/Skirmish/RAI/0.601/log/" is created,
	 * if it does not yet exist.
	 * 
	 * @see DataDirs_Roots_locatePath
	 * @param   path          store for the resulting absolute path
	 * @param   path_sizeMax  storage size of the above
	 * @param   writeable  if true, only the writable data-dir is considered
	 * @param   create     if true, and realPath is not found, its dir structure
	 *                     is created recursively under the writable data-dir
	 * @param   dir        if true, realPath specifies a dir, which means if
	 *                     create is true, the whole path will be created,
	 *                     including the last part
	 * @param   common     if true, the version independent data-dir is formed,
	 *                     which uses "common" instead of the version, eg:
	 *                     "/home/userX/.spring/AI/Skirmish/RAI/common/..."
	 * @return  whether the locating process was successfull
	 *          -> the path exists and is stored in an absolute form in path
	 */
	public boolean DataDirs_locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir, boolean common);

	/**
	 * @see     locatePath()
	 */
	public String DataDirs_allocatePath(String relPath, boolean writeable, boolean create, boolean dir, boolean common);

	/**
	 * Returns the number of springs data dirs.
	 */
	public int DataDirs_Roots_getSize();

	/**
	 * Returns the data dir at dirIndex, which is valid between 0 and (DataDirs_Roots_getSize() - 1).
	 */
	public boolean DataDirs_Roots_getDir(String path, int path_sizeMax, int dirIndex);

	/**
	 * Returns an absolute path which consists of:
	 * data-dir + relative-path.
	 * 
	 * example:
	 * input:  "AI/Skirmish", writeable, create, dir
	 * output: "/home/userX/.spring/AI/Skirmish/"
	 * The path "/home/userX/.spring/AI/Skirmish/" is created,
	 * if it does not yet exist.
	 * 
	 * @see DataDirs_locatePath
	 * @param   path          store for the resulting absolute path
	 * @param   path_sizeMax  storage size of the above
	 * @param   relPath    the relative path to find
	 * @param   writeable  if true, only the writable data-dir is considered
	 * @param   create     if true, and realPath is not found, its dir structure
	 *                     is created recursively under the writable data-dir
	 * @param   dir        if true, realPath specifies a dir, which means if
	 *                     create is true, the whole path will be created,
	 *                     including the last part
	 * @return  whether the locating process was successfull
	 *          -> the path exists and is stored in an absolute form in path
	 */
	public boolean DataDirs_Roots_locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir);

	public String DataDirs_Roots_allocatePath(String relPath, boolean writeable, boolean create, boolean dir);

	/**
	 * Returns the current game time measured in frames (the
	 * simulation runs at 30 frames per second at normal speed)
	 * 
	 * This should not be used, as we get the frame from the SUpdateEvent.
	 * @deprecated
	 */
	public int Game_getCurrentFrame();

	public int Game_getAiInterfaceVersion();

	public int Game_getMyTeam();

	public int Game_getMyAllyTeam();

	public int Game_getPlayerTeam(int playerId);

	/**
	 * Returns the number of active teams participating
	 * in the currently running game.
	 * A return value of 6 for example, would mean that teams 0 till 5
	 * take part in the game.
	 */
	public int Game_getTeams();

	/**
	 * Returns the name of the side of a team in the game.
	 * 
	 * This should not be used, as it may be "",
	 * and as the AI should rather rely on the units it has,
	 * which will lead to a more stable and versatile AI.
	 * @deprecated
	 * 
	 * @return eg. "ARM" or "CORE"; may be "", depending on how the game was setup
	 */
	public String Game_getTeamSide(int otherTeamId);

	/**
	 * Returns the color of a team in the game.
	 * 
	 * This should only be used when drawing stuff,
	 * and not for team-identification.
	 * @return the RGB color of a team, with values in [0, 255]
	 */
	public void Game_getTeamColor(int otherTeamId, short[] return_colorS3_out);

	/**
	 * Returns the income multiplier of a team in the game.
	 * All the teams resource income is multiplied by this factor.
	 * The default value is 1.0f, the valid range is [0.0, FLOAT_MAX].
	 */
	public float Game_getTeamIncomeMultiplier(int otherTeamId);

	/**
	 * Returns the ally-team of a team
	 */
	public int Game_getTeamAllyTeam(int otherTeamId);

	/**
	 * Returns the current level of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current level of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float Game_getTeamResourceCurrent(int otherTeamId, int resourceId);

	/**
	 * Returns the current income of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current income of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float Game_getTeamResourceIncome(int otherTeamId, int resourceId);

	/**
	 * Returns the current usage of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current usage of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float Game_getTeamResourceUsage(int otherTeamId, int resourceId);

	/**
	 * Returns the storage capacity for a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return storage capacity for the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float Game_getTeamResourceStorage(int otherTeamId, int resourceId);

	/**
	 * Returns true, if the two supplied ally-teams are currently allied
	 */
	public boolean Game_isAllied(int firstAllyTeamId, int secondAllyTeamId);

	public boolean Game_isExceptionHandlingEnabled();

	public boolean Game_isDebugModeEnabled();

	public int Game_getMode();

	public boolean Game_isPaused();

	public float Game_getSpeedFactor();

	public String Game_getSetupScript();

	/**
	 * Returns the categories bit field value.
	 * @return the categories bit field value or 0,
	 *         in case of empty name or too many categories
	 * @see getCategoryName
	 */
	public int Game_getCategoryFlag(String categoryName);

	/**
	 * Returns the bitfield values of a list of category names.
	 * @param categoryNames space delimited list of names
	 * @see Game#getCategoryFlag
	 */
	public int Game_getCategoriesFlag(String categoryNames);

	/**
	 * Return the name of the category described by a category flag.
	 * @see Game#getCategoryFlag
	 */
	public void Game_getCategoryName(int categoryFlag, String name, int name_sizeMax);

	public float Gui_getViewRange();

	public float Gui_getScreenX();

	public float Gui_getScreenY();

	public void Gui_Camera_getDirection(float[] return_posF3_out);

	public void Gui_Camera_getPosition(float[] return_posF3_out);

	/**
	 * Returns whether this AI may use active cheats.
	 */
	public boolean Cheats_isEnabled();

	/**
	 * Set whether this AI may use active cheats.
	 */
	public boolean Cheats_setEnabled(boolean enable);

	/**
	 * Set whether this AI may receive cheat events.
	 * When enabled, you would for example get informed when enemy units are
	 * created, even without sensor coverage.
	 */
	public boolean Cheats_setEventsEnabled(boolean enabled);

	/**
	 * Returns whether cheats will desync if used by an AI.
	 * @return always true, unless we are both the host and the only client.
	 */
	public boolean Cheats_isOnlyPassive();

	public int getResources(); // FETCHER:MULTI:NUM:Resource

	public int getResourceByName(String resourceName); // REF:RETURN->Resource

	public String Resource_getName(int resourceId);

	public float Resource_getOptimum(int resourceId);

	public float Economy_getCurrent(int resourceId); // REF:resourceId->Resource

	public float Economy_getIncome(int resourceId); // REF:resourceId->Resource

	public float Economy_getUsage(int resourceId); // REF:resourceId->Resource

	public float Economy_getStorage(int resourceId); // REF:resourceId->Resource

	/**
	 * A UnitDef contains all properties of a unit that are specific to its type,
	 * for example the number and type of weapons or max-speed.
	 * These properties are usually fixed, and not meant to change during a game.
	 * The unitId is a unique id for this type of unit.
	 */
	public int getUnitDefs(int[] unitDefIds, int unitDefIds_sizeMax); // FETCHER:MULTI:IDs:UnitDef:unitDefIds

	public int getUnitDefByName(String unitName); // REF:RETURN->UnitDef

	/**
	 * Forces loading of the unit model
	 */
	public float UnitDef_getHeight(int unitDefId);

	/**
	 * Forces loading of the unit model
	 */
	public float UnitDef_getRadius(int unitDefId);

	public String UnitDef_getName(int unitDefId);

	public String UnitDef_getHumanName(int unitDefId);

	public String UnitDef_getFileName(int unitDefId);

	/**
	 * @deprecated
	 */
	public int UnitDef_getAiHint(int unitDefId);

	public int UnitDef_getCobId(int unitDefId);

	public int UnitDef_getTechLevel(int unitDefId);

	/**
	 * @deprecated
	 */
	public String UnitDef_getGaia(int unitDefId);

	public float UnitDef_getUpkeep(int unitDefId, int resourceId); // REF:resourceId->Resource

	/**
	 * This amount of the resource will always be created.
	 */
	public float UnitDef_getResourceMake(int unitDefId, int resourceId); // REF:resourceId->Resource

	/**
	 * This amount of the resource will be created when the unit is on and enough
	 * energy can be drained.
	 */
	public float UnitDef_getMakesResource(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getCost(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getExtractsResource(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getResourceExtractorRange(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getWindResourceGenerator(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getTidalResourceGenerator(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getStorage(int unitDefId, int resourceId); // REF:resourceId->Resource

	public boolean UnitDef_isSquareResourceExtractor(int unitDefId, int resourceId); // REF:resourceId->Resource

	public float UnitDef_getBuildTime(int unitDefId);

	/**
	 * This amount of auto-heal will always be applied.
	 */
	public float UnitDef_getAutoHeal(int unitDefId);

	/**
	 * This amount of auto-heal will only be applied while the unit is idling.
	 */
	public float UnitDef_getIdleAutoHeal(int unitDefId);

	/**
	 * Time a unit needs to idle before it is considered idling.
	 */
	public int UnitDef_getIdleTime(int unitDefId);

	public float UnitDef_getPower(int unitDefId);

	public float UnitDef_getHealth(int unitDefId);

	/**
	 * Returns the bit field value denoting the categories this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int UnitDef_getCategory(int unitDefId);

	public float UnitDef_getSpeed(int unitDefId);

	public float UnitDef_getTurnRate(int unitDefId);

	public boolean UnitDef_isTurnInPlace(int unitDefId);

	/**
	 * Units above this distance to goal will try to turn while keeping
	 * some of their speed.
	 * 0 to disable
	 */
	public float UnitDef_getTurnInPlaceDistance(int unitDefId);

	/**
	 * Units below this speed will turn in place regardless of their
	 * turnInPlace setting.
	 */
	public float UnitDef_getTurnInPlaceSpeedLimit(int unitDefId);

	public boolean UnitDef_isUpright(int unitDefId);

	public boolean UnitDef_isCollide(int unitDefId);

	public float UnitDef_getLosRadius(int unitDefId);

	public float UnitDef_getAirLosRadius(int unitDefId);

	public float UnitDef_getLosHeight(int unitDefId);

	public int UnitDef_getRadarRadius(int unitDefId);

	public int UnitDef_getSonarRadius(int unitDefId);

	public int UnitDef_getJammerRadius(int unitDefId);

	public int UnitDef_getSonarJamRadius(int unitDefId);

	public int UnitDef_getSeismicRadius(int unitDefId);

	public float UnitDef_getSeismicSignature(int unitDefId);

	public boolean UnitDef_isStealth(int unitDefId);

	public boolean UnitDef_isSonarStealth(int unitDefId);

	public boolean UnitDef_isBuildRange3D(int unitDefId);

	public float UnitDef_getBuildDistance(int unitDefId);

	public float UnitDef_getBuildSpeed(int unitDefId);

	public float UnitDef_getReclaimSpeed(int unitDefId);

	public float UnitDef_getRepairSpeed(int unitDefId);

	public float UnitDef_getMaxRepairSpeed(int unitDefId);

	public float UnitDef_getResurrectSpeed(int unitDefId);

	public float UnitDef_getCaptureSpeed(int unitDefId);

	public float UnitDef_getTerraformSpeed(int unitDefId);

	public float UnitDef_getMass(int unitDefId);

	public boolean UnitDef_isPushResistant(int unitDefId);

	/**
	 * Should the unit move sideways when it can not shoot?
	 */
	public boolean UnitDef_isStrafeToAttack(int unitDefId);

	public float UnitDef_getMinCollisionSpeed(int unitDefId);

	public float UnitDef_getSlideTolerance(int unitDefId);

	/**
	 * Build location relevant maximum steepness of the underlaying terrain.
	 * Used to calculate the maxHeightDif.
	 */
	public float UnitDef_getMaxSlope(int unitDefId);

	/**
	 * Maximum terra-form height this building allows.
	 * If this value is 0.0, you can only build this structure on
	 * totally flat terrain.
	 */
	public float UnitDef_getMaxHeightDif(int unitDefId);

	public float UnitDef_getMinWaterDepth(int unitDefId);

	public float UnitDef_getWaterline(int unitDefId);

	public float UnitDef_getMaxWaterDepth(int unitDefId);

	public float UnitDef_getArmoredMultiple(int unitDefId);

	public int UnitDef_getArmorType(int unitDefId);

	/**
	 * The flanking bonus indicates how much additional damage you can inflict to
	 * a unit, if it gets attacked from different directions.
	 * See the spring source code if you want to know it more precisely.
	 * 
	 * @return  0: no flanking bonus
	 *          1: global coords, mobile
	 *          2: unit coords, mobile
	 *          3: unit coords, locked
	 */
	public int UnitDef_FlankingBonus_getMode(int unitDefId);

	/**
	 * The unit takes less damage when attacked from this direction.
	 * This encourage flanking fire.
	 */
	public void UnitDef_FlankingBonus_getDir(int unitDefId, float[] return_posF3_out);

	/**
	 * Damage factor for the least protected direction
	 */
	public float UnitDef_FlankingBonus_getMax(int unitDefId);

	/**
	 * Damage factor for the most protected direction
	 */
	public float UnitDef_FlankingBonus_getMin(int unitDefId);

	/**
	 * How much the ability of the flanking bonus direction to move builds up each
	 * frame.
	 */
	public float UnitDef_FlankingBonus_getMobilityAdd(int unitDefId);

	public float UnitDef_getMaxWeaponRange(int unitDefId);

	/**
	 * @deprecated
	 */
	public String UnitDef_getType(int unitDefId);

	public String UnitDef_getTooltip(int unitDefId);

	public String UnitDef_getWreckName(int unitDefId);

	public String UnitDef_getDeathExplosion(int unitDefId);

	public String UnitDef_getSelfDExplosion(int unitDefId);

	/**
	 * Returns the name of the category this unit is in.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public String UnitDef_getCategoryString(int unitDefId);

	public boolean UnitDef_isAbleToSelfD(int unitDefId);

	public int UnitDef_getSelfDCountdown(int unitDefId);

	public boolean UnitDef_isAbleToSubmerge(int unitDefId);

	public boolean UnitDef_isAbleToFly(int unitDefId);

	public boolean UnitDef_isAbleToMove(int unitDefId);

	public boolean UnitDef_isAbleToHover(int unitDefId);

	public boolean UnitDef_isFloater(int unitDefId);

	public boolean UnitDef_isBuilder(int unitDefId);

	public boolean UnitDef_isActivateWhenBuilt(int unitDefId);

	public boolean UnitDef_isOnOffable(int unitDefId);

	public boolean UnitDef_isFullHealthFactory(int unitDefId);

	public boolean UnitDef_isFactoryHeadingTakeoff(int unitDefId);

	public boolean UnitDef_isReclaimable(int unitDefId);

	public boolean UnitDef_isCapturable(int unitDefId);

	public boolean UnitDef_isAbleToRestore(int unitDefId);

	public boolean UnitDef_isAbleToRepair(int unitDefId);

	public boolean UnitDef_isAbleToSelfRepair(int unitDefId);

	public boolean UnitDef_isAbleToReclaim(int unitDefId);

	public boolean UnitDef_isAbleToAttack(int unitDefId);

	public boolean UnitDef_isAbleToPatrol(int unitDefId);

	public boolean UnitDef_isAbleToFight(int unitDefId);

	public boolean UnitDef_isAbleToGuard(int unitDefId);

	public boolean UnitDef_isAbleToAssist(int unitDefId);

	public boolean UnitDef_isAssistable(int unitDefId);

	public boolean UnitDef_isAbleToRepeat(int unitDefId);

	public boolean UnitDef_isAbleToFireControl(int unitDefId);

	public int UnitDef_getFireState(int unitDefId);

	public int UnitDef_getMoveState(int unitDefId);

	public float UnitDef_getWingDrag(int unitDefId);

	public float UnitDef_getWingAngle(int unitDefId);

	public float UnitDef_getDrag(int unitDefId);

	public float UnitDef_getFrontToSpeed(int unitDefId);

	public float UnitDef_getSpeedToFront(int unitDefId);

	public float UnitDef_getMyGravity(int unitDefId);

	public float UnitDef_getMaxBank(int unitDefId);

	public float UnitDef_getMaxPitch(int unitDefId);

	public float UnitDef_getTurnRadius(int unitDefId);

	public float UnitDef_getWantedHeight(int unitDefId);

	public float UnitDef_getVerticalSpeed(int unitDefId);

	/**
	 * @deprecated
	 */
	public boolean UnitDef_isAbleToCrash(int unitDefId);

	/**
	 * @deprecated
	 */
	public boolean UnitDef_isHoverAttack(int unitDefId);

	public boolean UnitDef_isAirStrafe(int unitDefId);

	/**
	 * @return  < 0:  it can land
	 *          >= 0: how much the unit will move during hovering on the spot
	 */
	public float UnitDef_getDlHoverFactor(int unitDefId);

	public float UnitDef_getMaxAcceleration(int unitDefId);

	public float UnitDef_getMaxDeceleration(int unitDefId);

	public float UnitDef_getMaxAileron(int unitDefId);

	public float UnitDef_getMaxElevator(int unitDefId);

	public float UnitDef_getMaxRudder(int unitDefId);

	/**
	 * The yard map defines which parts of the square a unit occupies
	 * can still be walked on by other units.
	 * Example:
	 * In the BA Arm T2 K-Bot lab, htere is a line in hte middle where units
	 * walk, otherwise they would not be able ot exit the lab once they are
	 * built.
	 * @return 0 if invalid facing or the unit has no yard-map defined,
	 *         the size of the yard-map otherwise: getXSize() * getXSize()
	 */
	public int UnitDef_getYardMap(int unitDefId, int facing, short[] yardMap, int yardMap_sizeMax); // ARRAY:yardMap

	public int UnitDef_getXSize(int unitDefId);

	public int UnitDef_getZSize(int unitDefId);

	/**
	 * @deprecated
	 */
	public int UnitDef_getBuildAngle(int unitDefId);

	public float UnitDef_getLoadingRadius(int unitDefId);

	public float UnitDef_getUnloadSpread(int unitDefId);

	public int UnitDef_getTransportCapacity(int unitDefId);

	public int UnitDef_getTransportSize(int unitDefId);

	public int UnitDef_getMinTransportSize(int unitDefId);

	public boolean UnitDef_isAirBase(int unitDefId);

	public boolean UnitDef_isFirePlatform(int unitDefId);

	public float UnitDef_getTransportMass(int unitDefId);

	public float UnitDef_getMinTransportMass(int unitDefId);

	public boolean UnitDef_isHoldSteady(int unitDefId);

	public boolean UnitDef_isReleaseHeld(int unitDefId);

	public boolean UnitDef_isNotTransportable(int unitDefId);

	public boolean UnitDef_isTransportByEnemy(int unitDefId);

	/**
	 * @return  0: land unload
	 *          1: fly-over drop
	 *          2: land flood
	 */
	public int UnitDef_getTransportUnloadMethod(int unitDefId);

	/**
	 * Dictates fall speed of all transported units.
	 * This only makes sense for air transports,
	 * if they an drop units while in the air.
	 */
	public float UnitDef_getFallSpeed(int unitDefId);

	/**
	 * Sets the transported units FBI, overrides fallSpeed
	 */
	public float UnitDef_getUnitFallSpeed(int unitDefId);

	/**
	 * If the unit can cloak
	 */
	public boolean UnitDef_isAbleToCloak(int unitDefId);

	/**
	 * If the unit wants to start out cloaked
	 */
	public boolean UnitDef_isStartCloaked(int unitDefId);

	/**
	 * Energy cost per second to stay cloaked when stationary
	 */
	public float UnitDef_getCloakCost(int unitDefId);

	/**
	 * Energy cost per second to stay cloaked when moving
	 */
	public float UnitDef_getCloakCostMoving(int unitDefId);

	/**
	 * If enemy unit comes within this range, decloaking is forced
	 */
	public float UnitDef_getDecloakDistance(int unitDefId);

	/**
	 * Use a spherical, instead of a cylindrical test?
	 */
	public boolean UnitDef_isDecloakSpherical(int unitDefId);

	/**
	 * Will the unit decloak upon firing?
	 */
	public boolean UnitDef_isDecloakOnFire(int unitDefId);

	/**
	 * Will the unit self destruct if an enemy comes to close?
	 */
	public boolean UnitDef_isAbleToKamikaze(int unitDefId);

	public float UnitDef_getKamikazeDist(int unitDefId);

	public boolean UnitDef_isTargetingFacility(int unitDefId);

	public boolean UnitDef_canManualFire(int unitDefId);

	public boolean UnitDef_isNeedGeo(int unitDefId);

	public boolean UnitDef_isFeature(int unitDefId);

	public boolean UnitDef_isHideDamage(int unitDefId);

	public boolean UnitDef_isCommander(int unitDefId);

	public boolean UnitDef_isShowPlayerName(int unitDefId);

	public boolean UnitDef_isAbleToResurrect(int unitDefId);

	public boolean UnitDef_isAbleToCapture(int unitDefId);

	/**
	 * Indicates the trajectory types supported by this unit.
	 * 
	 * @return  0: (default) = only low
	 *          1: only high
	 *          2: choose
	 */
	public int UnitDef_getHighTrajectoryType(int unitDefId);

	/**
	 * Returns the bit field value denoting the categories this unit shall not
	 * chase.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int UnitDef_getNoChaseCategory(int unitDefId);

	public boolean UnitDef_isLeaveTracks(int unitDefId);

	public float UnitDef_getTrackWidth(int unitDefId);

	public float UnitDef_getTrackOffset(int unitDefId);

	public float UnitDef_getTrackStrength(int unitDefId);

	public float UnitDef_getTrackStretch(int unitDefId);

	public int UnitDef_getTrackType(int unitDefId);

	public boolean UnitDef_isAbleToDropFlare(int unitDefId);

	public float UnitDef_getFlareReloadTime(int unitDefId);

	public float UnitDef_getFlareEfficiency(int unitDefId);

	public float UnitDef_getFlareDelay(int unitDefId);

	public void UnitDef_getFlareDropVector(int unitDefId, float[] return_posF3_out);

	public int UnitDef_getFlareTime(int unitDefId);

	public int UnitDef_getFlareSalvoSize(int unitDefId);

	public int UnitDef_getFlareSalvoDelay(int unitDefId);

	/**
	 * Only matters for fighter aircraft
	 */
	public boolean UnitDef_isAbleToLoopbackAttack(int unitDefId);

	/**
	 * Indicates whether the ground will be leveled/flattened out
	 * after this building has been built on it.
	 * Only matters for buildings.
	 */
	public boolean UnitDef_isLevelGround(int unitDefId);

	public boolean UnitDef_isUseBuildingGroundDecal(int unitDefId);

	public int UnitDef_getBuildingDecalType(int unitDefId);

	public int UnitDef_getBuildingDecalSizeX(int unitDefId);

	public int UnitDef_getBuildingDecalSizeY(int unitDefId);

	public float UnitDef_getBuildingDecalDecaySpeed(int unitDefId);

	/**
	 * Maximum flight time in seconds before the aircraft needs
	 * to return to an air repair bay to refuel.
	 */
	public float UnitDef_getMaxFuel(int unitDefId);

	/**
	 * Time to fully refuel the unit
	 */
	public float UnitDef_getRefuelTime(int unitDefId);

	/**
	 * Minimum build power of airbases that this aircraft can land on
	 */
	public float UnitDef_getMinAirBasePower(int unitDefId);

	/**
	 * Number of units of this type allowed simultaneously in the game
	 */
	public int UnitDef_getMaxThisUnit(int unitDefId);

	public int UnitDef_getDecoyDef(int unitDefId); // REF:RETURN->UnitDef

	public boolean UnitDef_isDontLand(int unitDefId);

	public int UnitDef_getShieldDef(int unitDefId); // REF:RETURN->WeaponDef

	public int UnitDef_getStockpileDef(int unitDefId); // REF:RETURN->WeaponDef

	public int UnitDef_getBuildOptions(int unitDefId, int[] unitDefIds, int unitDefIds_sizeMax); // REF:MULTI:unitDefIds->UnitDef

	public int UnitDef_getCustomParams(int unitDefId, String[] keys, String[] values); // MAP

	public boolean UnitDef_isMoveDataAvailable(int unitDefId); // AVAILABLE:MoveData

	/**
	 * @deprecated
	 */
	public float UnitDef_MoveData_getMaxAcceleration(int unitDefId);

	/**
	 * @deprecated
	 */
	public float UnitDef_MoveData_getMaxBreaking(int unitDefId);

	/**
	 * @deprecated
	 */
	public float UnitDef_MoveData_getMaxSpeed(int unitDefId);

	/**
	 * @deprecated
	 */
	public short UnitDef_MoveData_getMaxTurnRate(int unitDefId);

	public int UnitDef_MoveData_getXSize(int unitDefId);

	public int UnitDef_MoveData_getZSize(int unitDefId);

	public float UnitDef_MoveData_getDepth(int unitDefId);

	public float UnitDef_MoveData_getMaxSlope(int unitDefId);

	public float UnitDef_MoveData_getSlopeMod(int unitDefId);

	public float UnitDef_MoveData_getDepthMod(int unitDefId);

	public int UnitDef_MoveData_getPathType(int unitDefId);

	public float UnitDef_MoveData_getCrushStrength(int unitDefId);

	/**
	 * enum MoveType { Ground_Move=0, Hover_Move=1, Ship_Move=2 };
	 */
	public int UnitDef_MoveData_getMoveType(int unitDefId);

	/**
	 * enum MoveFamily { Tank=0, KBot=1, Hover=2, Ship=3 };
	 */
	public int UnitDef_MoveData_getMoveFamily(int unitDefId);

	public int UnitDef_MoveData_getTerrainClass(int unitDefId);

	public boolean UnitDef_MoveData_getFollowGround(int unitDefId);

	public boolean UnitDef_MoveData_isSubMarine(int unitDefId);

	public String UnitDef_MoveData_getName(int unitDefId);

	public int UnitDef_getWeaponMounts(int unitDefId); // FETCHER:MULTI:NUM:WeaponMount

	public String UnitDef_WeaponMount_getName(int unitDefId, int weaponMountId);

	public int UnitDef_WeaponMount_getWeaponDef(int unitDefId, int weaponMountId); // REF:RETURN->WeaponDef

	public int UnitDef_WeaponMount_getSlavedTo(int unitDefId, int weaponMountId);

	public void UnitDef_WeaponMount_getMainDir(int unitDefId, int weaponMountId, float[] return_posF3_out);

	public float UnitDef_WeaponMount_getMaxAngleDif(int unitDefId, int weaponMountId);

	/**
	 * How many seconds of fuel it costs for the owning unit to fire this weapon.
	 */
	public float UnitDef_WeaponMount_getFuelUsage(int unitDefId, int weaponMountId);

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * not target.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int UnitDef_WeaponMount_getBadTargetCategory(int unitDefId, int weaponMountId);

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int UnitDef_WeaponMount_getOnlyTargetCategory(int unitDefId, int weaponMountId);

	/**
	 * Returns the number of units a team can have, after which it can not build
	 * any more. It is possible that a team has more units then this value at
	 * some point in the game. This is possible for example with taking,
	 * reclaiming or capturing units.
	 * This value is usefull for controlling game performance, and will
	 * therefore often be set on games with old hardware to prevent lagging
	 * because of too many units.
	 */
	public int Unit_getLimit(); // STATIC

	/**
	 * Returns the maximum total number of units that may exist at any one point
	 * in time induring the current game.
	 */
	public int Unit_getMax(); // STATIC

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS.
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public int getEnemyUnits(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in LOS plus they have to be located in the specified area
	 * of the map.
	 * If cheats are enabled, this will return all enemies
	 * in the specified area.
	 */
	public int getEnemyUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are not in this teams ally-team nor neutral
	 * and are in under sensor coverage (sight or radar).
	 * If cheats are enabled, this will return all enemies on the map.
	 */
	public int getEnemyUnitsInRadarAndLos(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units.
	 */
	public int getFriendlyUnits(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are in this teams ally-team, including this teams
	 * units plus they have to be located in the specified area of the map.
	 */
	public int getFriendlyUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are neutral and are in LOS.
	 */
	public int getNeutralUnits(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are neutral and are in LOS plus they have to be
	 * located in the specified area of the map.
	 */
	public int getNeutralUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are of the team controlled by this AI instance. This
	 * list can also be created dynamically by the AI, through updating a list on
	 * each unit-created and unit-destroyed event.
	 */
	public int getTeamUnits(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns all units that are currently selected
	 * (usually only contains units if a human player
	 * is controlling this team as well).
	 */
	public int getSelectedUnits(int[] unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

	/**
	 * Returns the unit's unitdef struct from which you can read all
	 * the statistics of the unit, do NOT try to change any values in it.
	 */
	public int Unit_getDef(int unitId); // REF:RETURN->UnitDef

	/**
	 * This is a set of parameters that is initialized
	 * in CreateUnitRulesParams() and may change during the game.
	 * Each parameter is uniquely identified only by its id
	 * (which is the index in the vector).
	 * Parameters may or may not have a name.
	 */
	public int Unit_getModParams(int unitId); // FETCHER:MULTI:NUM:ModParam

	/**
	 * Not every mod parameter has a name.
	 */
	public String Unit_ModParam_getName(int unitId, int modParamId);

	public float Unit_ModParam_getValue(int unitId, int modParamId);

	public int Unit_getTeam(int unitId);

	public int Unit_getAllyTeam(int unitId);

	/**
	 * Indicates the units main function.
	 * This can be used as help for (skirmish) AIs.
	 * 
	 * example:
	 * A unit can shoot, build and transport other units.
	 * To human players, it is obvious that transportation is the units
	 * main function, as it can transport a lot of units,
	 * but has only weak build- and fire-power.
	 * Instead of letting the AI developers write complex
	 * algorithms to find out the same, mod developers can set this value.
	 * 
	 * @return  0: ???
	 *          1: ???
	 *          2: ???
	 *          ...
	 * @deprecated
	 */
	public int Unit_getAiHint(int unitId);

	public int Unit_getStockpile(int unitId);

	public int Unit_getStockpileQueued(int unitId);

	public float Unit_getCurrentFuel(int unitId);

	/**
	 * The unit's max speed
	 */
	public float Unit_getMaxSpeed(int unitId);

	/**
	 * The furthest any weapon of the unit can fire
	 */
	public float Unit_getMaxRange(int unitId);

	/**
	 * The unit's max health
	 */
	public float Unit_getMaxHealth(int unitId);

	/**
	 * How experienced the unit is (0.0f - 1.0f)
	 */
	public float Unit_getExperience(int unitId);

	/**
	 * Returns the group a unit belongs to, -1 if none
	 */
	public int Unit_getGroup(int unitId);

	public int Unit_getCurrentCommands(int unitId); // FETCHER:MULTI:NUM:CurrentCommand-Command

	/**
	 * For the type of the command queue, see CCommandQueue::CommandQueueType
	 * in Sim/Unit/CommandAI/CommandQueue.h
	 */
	public int Unit_CurrentCommand_getType(int unitId); // STATIC

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int Unit_CurrentCommand_getId(int unitId, int commandId);

	public short Unit_CurrentCommand_getOptions(int unitId, int commandId);

	public int Unit_CurrentCommand_getTag(int unitId, int commandId);

	public int Unit_CurrentCommand_getTimeOut(int unitId, int commandId);

	public int Unit_CurrentCommand_getParams(int unitId, int commandId, float[] params, int params_sizeMax); // ARRAY:params

	/**
	 * The commands that this unit can understand, other commands will be ignored
	 */
	public int Unit_getSupportedCommands(int unitId); // FETCHER:MULTI:NUM:SupportedCommand-CommandDescription

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int Unit_SupportedCommand_getId(int unitId, int supportedCommandId);

	public String Unit_SupportedCommand_getName(int unitId, int supportedCommandId);

	public String Unit_SupportedCommand_getToolTip(int unitId, int supportedCommandId);

	public boolean Unit_SupportedCommand_isShowUnique(int unitId, int supportedCommandId);

	public boolean Unit_SupportedCommand_isDisabled(int unitId, int supportedCommandId);

	public int Unit_SupportedCommand_getParams(int unitId, int supportedCommandId, String[] params, int params_sizeMax); // ARRAY:params

	/**
	 * The unit's current health
	 */
	public float Unit_getHealth(int unitId);

	public float Unit_getSpeed(int unitId);

	/**
	 * Indicate the relative power of the unit,
	 * used for experience calulations etc.
	 * This is sort of the measure of the units overall power.
	 */
	public float Unit_getPower(int unitId);

	public float Unit_getResourceUse(int unitId, int resourceId); // REF:resourceId->Resource

	public float Unit_getResourceMake(int unitId, int resourceId); // REF:resourceId->Resource

	public void Unit_getPos(int unitId, float[] return_posF3_out);

	public void Unit_getVel(int unitId, float[] return_posF3_out);

	public boolean Unit_isActivated(int unitId);

	/**
	 * Returns true if the unit is currently being built
	 */
	public boolean Unit_isBeingBuilt(int unitId);

	public boolean Unit_isCloaked(int unitId);

	public boolean Unit_isParalyzed(int unitId);

	public boolean Unit_isNeutral(int unitId);

	/**
	 * Returns the unit's build facing (0-3)
	 */
	public int Unit_getBuildingFacing(int unitId);

	/**
	 * Number of the last frame this unit received an order from a player.
	 */
	public int Unit_getLastUserOrderFrame(int unitId);

	public int getGroups(int[] groupIds, int groupIds_sizeMax); // FETCHER:MULTI:IDs:Group:groupIds

	public int Group_getSupportedCommands(int groupId); // FETCHER:MULTI:NUM:SupportedCommand-CommandDescription

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int Group_SupportedCommand_getId(int groupId, int supportedCommandId);

	public String Group_SupportedCommand_getName(int groupId, int supportedCommandId);

	public String Group_SupportedCommand_getToolTip(int groupId, int supportedCommandId);

	public boolean Group_SupportedCommand_isShowUnique(int groupId, int supportedCommandId);

	public boolean Group_SupportedCommand_isDisabled(int groupId, int supportedCommandId);

	public int Group_SupportedCommand_getParams(int groupId, int supportedCommandId, String[] params, int params_sizeMax); // ARRAY:params

	/**
	 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
	 * (custom codes can also be used)
	 */
	public int Group_OrderPreview_getId(int groupId);

	public short Group_OrderPreview_getOptions(int groupId);

	public int Group_OrderPreview_getTag(int groupId);

	public int Group_OrderPreview_getTimeOut(int groupId);

	public int Group_OrderPreview_getParams(int groupId, float[] params, int params_sizeMax); // ARRAY:params

	public boolean Group_isSelected(int groupId);

	/**
	 * Returns the mod archive file name.
	 * CAUTION:
	 * Never use this as reference in eg. cache- or config-file names,
	 * as one and the same mod can be packaged in different ways.
	 * Use the human name instead.
	 * @see getHumanName()
	 * @deprecated
	 */
	public String Mod_getFileName();

	/**
	 * Returns the archive hash of the mod.
	 * Use this for reference to the mod, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two mods not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getHumanName()
	 */
	public int Mod_getHash();

	/**
	 * Returns the human readable name of the mod, which includes the version.
	 * Use this for reference to the mod (including version), eg. in cache- or
	 * config-file names which are mod related, and wherever humans may come
	 * in contact with the reference.
	 * Be aware though, that this may contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Alternatively, you may use the short name only, or the short name plus
	 * version. You should generally never use the file name.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getHash()
	 * @see getShortName()
	 * @see getFileName()
	 * @see getVersion()
	 */
	public String Mod_getHumanName();

	/**
	 * Returns the short name of the mod, which does not include the version.
	 * Use this for reference to the mod in general, eg. as version independent
	 * reference.
	 * Be aware though, that this still contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getVersion()
	 * @see getHumanName()
	 */
	public String Mod_getShortName();

	public String Mod_getVersion();

	public String Mod_getMutator();

	public String Mod_getDescription();

	public boolean Mod_getAllowTeamColors();

	/**
	 * Should constructions without builders decay?
	 */
	public boolean Mod_getConstructionDecay();

	/**
	 * How long until they start decaying?
	 */
	public int Mod_getConstructionDecayTime();

	/**
	 * How fast do they decay?
	 */
	public float Mod_getConstructionDecaySpeed();

	/**
	 * 0 = 1 reclaimer per feature max, otherwise unlimited
	 */
	public int Mod_getMultiReclaim();

	/**
	 * 0 = gradual reclaim, 1 = all reclaimed at end, otherwise reclaim in reclaimMethod chunks
	 */
	public int Mod_getReclaimMethod();

	/**
	 * 0 = Revert to wireframe, gradual reclaim, 1 = Subtract HP, give full metal at end, default 1
	 */
	public int Mod_getReclaimUnitMethod();

	/**
	 * How much energy should reclaiming a unit cost, default 0.0
	 */
	public float Mod_getReclaimUnitEnergyCostFactor();

	/**
	 * How much metal should reclaim return, default 1.0
	 */
	public float Mod_getReclaimUnitEfficiency();

	/**
	 * How much should energy should reclaiming a feature cost, default 0.0
	 */
	public float Mod_getReclaimFeatureEnergyCostFactor();

	/**
	 * Allow reclaiming enemies? default true
	 */
	public boolean Mod_getReclaimAllowEnemies();

	/**
	 * Allow reclaiming allies? default true
	 */
	public boolean Mod_getReclaimAllowAllies();

	/**
	 * How much should energy should repair cost, default 0.0
	 */
	public float Mod_getRepairEnergyCostFactor();

	/**
	 * How much should energy should resurrect cost, default 0.5
	 */
	public float Mod_getResurrectEnergyCostFactor();

	/**
	 * How much should energy should capture cost, default 0.0
	 */
	public float Mod_getCaptureEnergyCostFactor();

	/**
	 * 0 = all ground units cannot be transported,
	 * 1 = all ground units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 1.
	 */
	public int Mod_getTransportGround();

	/**
	 * 0 = all hover units cannot be transported,
	 * 1 = all hover units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int Mod_getTransportHover();

	/**
	 * 0 = all naval units cannot be transported,
	 * 1 = all naval units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int Mod_getTransportShip();

	/**
	 * 0 = all air units cannot be transported,
	 * 1 = all air units can be transported
	 * (mass and size restrictions still apply).
	 * Defaults to 0.
	 */
	public int Mod_getTransportAir();

	/**
	 * 1 = units fire at enemies running Killed() script, 0 = units ignore such enemies
	 */
	public int Mod_getFireAtKilled();

	/**
	 * 1 = units fire at crashing aircrafts, 0 = units ignore crashing aircrafts
	 */
	public int Mod_getFireAtCrashing();

	/**
	 * 0=no flanking bonus;  1=global coords, mobile;  2=unit coords, mobile;  3=unit coords, locked
	 */
	public int Mod_getFlankingBonusModeDefault();

	/**
	 * miplevel for los
	 */
	public int Mod_getLosMipLevel();

	/**
	 * miplevel to use for airlos
	 */
	public int Mod_getAirMipLevel();

	/**
	 * units sightdistance will be multiplied with this, for testing purposes
	 */
	public float Mod_getLosMul();

	/**
	 * units airsightdistance will be multiplied with this, for testing purposes
	 */
	public float Mod_getAirLosMul();

	/**
	 * when underwater, units are not in LOS unless also in sonar
	 */
	public boolean Mod_getRequireSonarUnderWater();

	public int Map_getChecksum();

	public void Map_getStartPos(float[] return_posF3_out);

	public void Map_getMousePos(float[] return_posF3_out);

	public boolean Map_isPosInCamera(float[] pos_posF3, float radius);

	/**
	 * Returns the maps center heightmap width.
	 * @see getHeightMap()
	 */
	public int Map_getWidth();

	/**
	 * Returns the maps center heightmap height.
	 * @see getHeightMap()
	 */
	public int Map_getHeight();

	/**
	 * Returns the height for the center of the squares.
	 * This differs slightly from the drawn map, since
	 * that one uses the height at the corners.
	 * Note that the actual map is 8 times larger (in each dimension) and
	 * all other maps (slope, los, resources, etc.) are relative to the
	 * size of the heightmap.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index (z * width + x)
	 * - the last value, bottom right, is at index (width * height - 1)
	 * 
	 * @see getCornersHeightMap()
	 */
	public int Map_getHeightMap(float[] heights, int heights_sizeMax); // ARRAY:heights

	/**
	 * Returns the height for the corners of the squares.
	 * This is the same like the drawn map.
	 * It is one unit wider and one higher then the centers height map.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - 4 points mark the edges of an area of 8*8 in size
	 * - the value for upper left corner of the full resolution position (x, z) is at index (z * width + x)
	 * - the last value, bottom right, is at index ((width+1) * (height+1) - 1)
	 * 
	 * @see getHeightMap()
	 */
	public int Map_getCornersHeightMap(float[] cornerHeights, int cornerHeights_sizeMax); // ARRAY:cornerHeights

	public float Map_getMinHeight();

	public float Map_getMaxHeight();

	/**
	 * the slope map
	 * The values are 1 minus the y-component of the (average) facenormal of the square.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 2*2 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
	 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
	 */
	public int Map_getSlopeMap(float[] slopes, int slopes_sizeMax); // ARRAY:slopes

	/**
	 * the level of sight map
	 * gs->mapx >> losMipLevel
	 * A square with value zero means you do not have LOS coverage on it.
	 * Mod_getLosMipLevel
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - resolution factor (res) is min(1, 1 << Mod_getLosMipLevel())
	 *   examples:
	 *   	+ losMipLevel(0) -> res(1)
	 *   	+ losMipLevel(1) -> res(2)
	 *   	+ losMipLevel(2) -> res(4)
	 *   	+ losMipLevel(3) -> res(8)
	 * - each data position is res*res in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / res)
	 * - the last value, bottom right, is at index (width/res * height/res - 1)
	 */
	public int Map_getLosMap(int[] losValues, int losValues_sizeMax); // ARRAY:losValues

	/**
	 * the radar map
	 * A square with value 0 means you do not have radar coverage on it.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
	 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
	 */
	public int Map_getRadarMap(int[] radarValues, int radarValues_sizeMax); // ARRAY:radarValues

	/**
	 * the radar jammer map
	 * A square with value 0 means you do not have radar jamming coverage.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 8*8 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
	 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
	 */
	public int Map_getJammerMap(int[] jammerValues, int jammerValues_sizeMax); // ARRAY:jammerValues

	/**
	 * resource maps
	 * This map shows the resource density on the map.
	 * 
	 * - do NOT modify or delete the height-map (native code relevant only)
	 * - index 0 is top left
	 * - each data position is 2*2 in size
	 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
	 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
	 */
	public int Map_getResourceMapRaw(int resourceId, short[] resources, int resources_sizeMax); // REF:resourceId->Resource ARRAY:resources

	/**
	 * Returns positions indicating where to place resource extractors on the map.
	 * Only the x and z values give the location of the spots, while the y values
	 * represents the actual amount of resource an extractor placed there can make.
	 * You should only compare the y values to each other, and not try to estimate
	 * effective output from spots.
	 */
	public int Map_getResourceMapSpotsPositions(int resourceId, float[] spots_AposF3, int spots_AposF3_sizeMax); // REF:resourceId->Resource ARRAY:spots_AposF3

	/**
	 * Returns the average resource income for an extractor on one of the evaluated positions.
	 */
	public float Map_getResourceMapSpotsAverageIncome(int resourceId); // REF:resourceId->Resource

	/**
	 * Returns the nearest resource extractor spot to a specified position out of the evaluated list.
	 */
	public void Map_getResourceMapSpotsNearest(int resourceId, float[] pos_posF3, float[] return_posF3_out); // REF:resourceId->Resource

	/**
	 * Returns the archive hash of the map.
	 * Use this for reference to the map, eg. in a cache-file, wherever human
	 * readability does not matter.
	 * This value will never be the same for two maps not having equal content.
	 * Tip: convert to 64 Hex chars for use in file names.
	 * @see getName()
	 */
	public int Map_getHash();

	/**
	 * Returns the name of the map.
	 * Use this for reference to the map, eg. in cache- or config-file names
	 * which are map related, wherever humans may come in contact with the reference.
	 * Be aware though, that this may contain special characters and spaces,
	 * and may not be used as a file name without checks and replaces.
	 * Tip: replace every char matching [^0-9a-zA-Z_-.] with '_'
	 * @see getHash()
	 * @see getHumanName()
	 */
	public String Map_getName();

	/**
	 * Returns the human readbale name of the map.
	 * @see getName()
	 */
	public String Map_getHumanName();

	/**
	 * Gets the elevation of the map at position (x, z)
	 */
	public float Map_getElevationAt(float x, float z);

	/**
	 * Returns what value 255 in the resource map is worth
	 */
	public float Map_getMaxResource(int resourceId); // REF:resourceId->Resource

	/**
	 * Returns extraction radius for resource extractors
	 */
	public float Map_getExtractorRadius(int resourceId); // REF:resourceId->Resource

	public float Map_getMinWind();

	public float Map_getMaxWind();

	public float Map_getCurWind();

	public float Map_getTidalStrength();

	public float Map_getGravity();

	/**
	 * Returns all points drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	public int Map_getPoints(boolean includeAllies); // FETCHER:MULTI:NUM:Point

	public void Map_Point_getPosition(int pointId, float[] return_posF3_out);

	public void Map_Point_getColor(int pointId, short[] return_colorS3_out);

	public String Map_Point_getLabel(int pointId);

	/**
	 * Returns all lines drawn with this AIs team color,
	 * and additionally the ones drawn with allied team colors,
	 * if <code>includeAllies</code> is true.
	 */
	public int Map_getLines(boolean includeAllies); // FETCHER:MULTI:NUM:Line

	public void Map_Line_getFirstPosition(int lineId, float[] return_posF3_out);

	public void Map_Line_getSecondPosition(int lineId, float[] return_posF3_out);

	public void Map_Line_getColor(int lineId, short[] return_colorS3_out);

	public boolean Map_isPossibleToBuildAt(int unitDefId, float[] pos_posF3, int facing); // REF:unitDefId->UnitDef

	/**
	 * Returns the closest position from a given position that a building can be
	 * built at.
	 * @param minDist the distance in 1/(SQUARE_SIZE * 2) = 1/16 of full map
	 *                resolution, that the building must keep to other
	 *                buildings; this makes it easier to keep free paths through
	 *                a base
	 * @return actual map position with x, y and z all beeing positive,
	 *         or float[3]{-1, 0, 0} if no suitable position is found.
	 */
	public void Map_findClosestBuildSite(int unitDefId, float[] pos_posF3, float searchRadius, int minDist, int facing, float[] return_posF3_out); // REF:unitDefId->UnitDef

	public int getFeatureDefs(int[] featureDefIds, int featureDefIds_sizeMax); // FETCHER:MULTI:IDs:FeatureDef:featureDefIds

	public String FeatureDef_getName(int featureDefId);

	public String FeatureDef_getDescription(int featureDefId);

	public String FeatureDef_getFileName(int featureDefId);

	public float FeatureDef_getContainedResource(int featureDefId, int resourceId); // REF:resourceId->Resource

	public float FeatureDef_getMaxHealth(int featureDefId);

	public float FeatureDef_getReclaimTime(int featureDefId);

	/**
	 * Used to see if the object can be overrun by units of a certain heavyness
	 */
	public float FeatureDef_getMass(int featureDefId);

	public boolean FeatureDef_isUpright(int featureDefId);

	public int FeatureDef_getDrawType(int featureDefId);

	public String FeatureDef_getModelName(int featureDefId);

	/**
	 * Used to determine whether the feature is resurrectable.
	 * 
	 * @return  -1: (default) only if it is the 1st wreckage of
	 *              the UnitDef it originates from
	 *           0: no, never
	 *           1: yes, always
	 */
	public int FeatureDef_getResurrectable(int featureDefId);

	public int FeatureDef_getSmokeTime(int featureDefId);

	public boolean FeatureDef_isDestructable(int featureDefId);

	public boolean FeatureDef_isReclaimable(int featureDefId);

	public boolean FeatureDef_isBlocking(int featureDefId);

	public boolean FeatureDef_isBurnable(int featureDefId);

	public boolean FeatureDef_isFloating(int featureDefId);

	public boolean FeatureDef_isNoSelect(int featureDefId);

	public boolean FeatureDef_isGeoThermal(int featureDefId);

	/**
	 * Name of the FeatureDef that this turns into when killed (not reclaimed).
	 */
	public String FeatureDef_getDeathFeature(int featureDefId);

	/**
	 * Size of the feature along the X axis - in other words: height.
	 * each size is 8 units
	 */
	public int FeatureDef_getXSize(int featureDefId);

	/**
	 * Size of the feature along the Z axis - in other words: width.
	 * each size is 8 units
	 */
	public int FeatureDef_getZSize(int featureDefId);

	public int FeatureDef_getCustomParams(int featureDefId, String[] keys, String[] values); // MAP

	/**
	 * Returns all features currently in LOS, or all features on the map
	 * if cheating is enabled.
	 */
	public int getFeatures(int[] featureIds, int featureIds_sizeMax); // REF:MULTI:featureIds->Feature

	/**
	 * Returns all features in a specified area that are currently in LOS,
	 * or all features in this area if cheating is enabled.
	 */
	public int getFeaturesIn(float[] pos_posF3, float radius, int[] featureIds, int featureIds_sizeMax); // REF:MULTI:featureIds->Feature

	public int Feature_getDef(int featureId); // REF:RETURN->FeatureDef

	public float Feature_getHealth(int featureId);

	public float Feature_getReclaimLeft(int featureId);

	public void Feature_getPosition(int featureId, float[] return_posF3_out);

	public int getWeaponDefs(); // FETCHER:MULTI:NUM:WeaponDef

	public int getWeaponDefByName(String weaponDefName); // REF:RETURN->WeaponDef

	public String WeaponDef_getName(int weaponDefId);

	public String WeaponDef_getType(int weaponDefId);

	public String WeaponDef_getDescription(int weaponDefId);

	public String WeaponDef_getFileName(int weaponDefId);

	public String WeaponDef_getCegTag(int weaponDefId);

	public float WeaponDef_getRange(int weaponDefId);

	public float WeaponDef_getHeightMod(int weaponDefId);

	/**
	 * Inaccuracy of whole burst
	 */
	public float WeaponDef_getAccuracy(int weaponDefId);

	/**
	 * Inaccuracy of individual shots inside burst
	 */
	public float WeaponDef_getSprayAngle(int weaponDefId);

	/**
	 * Inaccuracy while owner moving
	 */
	public float WeaponDef_getMovingAccuracy(int weaponDefId);

	/**
	 * Fraction of targets move speed that is used as error offset
	 */
	public float WeaponDef_getTargetMoveError(int weaponDefId);

	/**
	 * Maximum distance the weapon will lead the target
	 */
	public float WeaponDef_getLeadLimit(int weaponDefId);

	/**
	 * Factor for increasing the leadLimit with experience
	 */
	public float WeaponDef_getLeadBonus(int weaponDefId);

	/**
	 * Replaces hardcoded behaviour for burnblow cannons
	 */
	public float WeaponDef_getPredictBoost(int weaponDefId);

	public int WeaponDef_getNumDamageTypes(); // STATIC

	public int WeaponDef_Damage_getParalyzeDamageTime(int weaponDefId);

	public float WeaponDef_Damage_getImpulseFactor(int weaponDefId);

	public float WeaponDef_Damage_getImpulseBoost(int weaponDefId);

	public float WeaponDef_Damage_getCraterMult(int weaponDefId);

	public float WeaponDef_Damage_getCraterBoost(int weaponDefId);

	public int WeaponDef_Damage_getTypes(int weaponDefId, float[] types, int types_sizeMax); // ARRAY:types

	public float WeaponDef_getAreaOfEffect(int weaponDefId);

	public boolean WeaponDef_isNoSelfDamage(int weaponDefId);

	public float WeaponDef_getFireStarter(int weaponDefId);

	public float WeaponDef_getEdgeEffectiveness(int weaponDefId);

	public float WeaponDef_getSize(int weaponDefId);

	public float WeaponDef_getSizeGrowth(int weaponDefId);

	public float WeaponDef_getCollisionSize(int weaponDefId);

	public int WeaponDef_getSalvoSize(int weaponDefId);

	public float WeaponDef_getSalvoDelay(int weaponDefId);

	public float WeaponDef_getReload(int weaponDefId);

	public float WeaponDef_getBeamTime(int weaponDefId);

	public boolean WeaponDef_isBeamBurst(int weaponDefId);

	public boolean WeaponDef_isWaterBounce(int weaponDefId);

	public boolean WeaponDef_isGroundBounce(int weaponDefId);

	public float WeaponDef_getBounceRebound(int weaponDefId);

	public float WeaponDef_getBounceSlip(int weaponDefId);

	public int WeaponDef_getNumBounce(int weaponDefId);

	public float WeaponDef_getMaxAngle(int weaponDefId);

	public float WeaponDef_getUpTime(int weaponDefId);

	public int WeaponDef_getFlightTime(int weaponDefId);

	public float WeaponDef_getCost(int weaponDefId, int resourceId); // REF:resourceId->Resource

	public int WeaponDef_getProjectilesPerShot(int weaponDefId);

	public boolean WeaponDef_isTurret(int weaponDefId);

	public boolean WeaponDef_isOnlyForward(int weaponDefId);

	public boolean WeaponDef_isFixedLauncher(int weaponDefId);

	public boolean WeaponDef_isWaterWeapon(int weaponDefId);

	public boolean WeaponDef_isFireSubmersed(int weaponDefId);

	/**
	 * Lets a torpedo travel above water like it does below water
	 */
	public boolean WeaponDef_isSubMissile(int weaponDefId);

	public boolean WeaponDef_isTracks(int weaponDefId);

	public boolean WeaponDef_isDropped(int weaponDefId);

	/**
	 * The weapon will only paralyze, not do real damage.
	 */
	public boolean WeaponDef_isParalyzer(int weaponDefId);

	/**
	 * The weapon damages by impacting, not by exploding.
	 */
	public boolean WeaponDef_isImpactOnly(int weaponDefId);

	/**
	 * Can not target anything (for example: anti-nuke, D-Gun)
	 */
	public boolean WeaponDef_isNoAutoTarget(int weaponDefId);

	/**
	 * Has to be fired manually (by the player or an AI, example: D-Gun)
	 */
	public boolean WeaponDef_isManualFire(int weaponDefId);

	/**
	 * Can intercept targetable weapons shots.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getTargetable()
	 */
	public int WeaponDef_getInterceptor(int weaponDefId);

	/**
	 * Shoots interceptable projectiles.
	 * Shots can be intercepted by interceptors.
	 * 
	 * example: nuke
	 * 
	 * @see  getInterceptor()
	 */
	public int WeaponDef_getTargetable(int weaponDefId);

	public boolean WeaponDef_isStockpileable(int weaponDefId);

	/**
	 * Range of interceptors.
	 * 
	 * example: anti-nuke
	 * 
	 * @see  getInterceptor()
	 */
	public float WeaponDef_getCoverageRange(int weaponDefId);

	/**
	 * Build time of a missile
	 */
	public float WeaponDef_getStockpileTime(int weaponDefId);

	public float WeaponDef_getIntensity(int weaponDefId);

	/**
	 * @deprecated only relevant for visualization
	 */
	public float WeaponDef_getThickness(int weaponDefId);

	/**
	 * @deprecated only relevant for visualization
	 */
	public float WeaponDef_getLaserFlareSize(int weaponDefId);

	/**
	 * @deprecated only relevant for visualization
	 */
	public float WeaponDef_getCoreThickness(int weaponDefId);

	public float WeaponDef_getDuration(int weaponDefId);

	/**
	 * @deprecated only relevant for visualization
	 */
	public int WeaponDef_getLodDistance(int weaponDefId);

	public float WeaponDef_getFalloffRate(int weaponDefId);

	/**
	 * @deprecated only relevant for visualization
	 */
	public int WeaponDef_getGraphicsType(int weaponDefId);

	public boolean WeaponDef_isSoundTrigger(int weaponDefId);

	public boolean WeaponDef_isSelfExplode(int weaponDefId);

	public boolean WeaponDef_isGravityAffected(int weaponDefId);

	/**
	 * Per weapon high trajectory setting.
	 * UnitDef also has this property.
	 * 
	 * @return  0: low
	 *          1: high
	 *          2: unit
	 */
	public int WeaponDef_getHighTrajectory(int weaponDefId);

	public float WeaponDef_getMyGravity(int weaponDefId);

	public boolean WeaponDef_isNoExplode(int weaponDefId);

	public float WeaponDef_getStartVelocity(int weaponDefId);

	public float WeaponDef_getWeaponAcceleration(int weaponDefId);

	public float WeaponDef_getTurnRate(int weaponDefId);

	public float WeaponDef_getMaxVelocity(int weaponDefId);

	public float WeaponDef_getProjectileSpeed(int weaponDefId);

	public float WeaponDef_getExplosionSpeed(int weaponDefId);

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public int WeaponDef_getOnlyTargetCategory(int weaponDefId);

	/**
	 * How much the missile will wobble around its course.
	 */
	public float WeaponDef_getWobble(int weaponDefId);

	/**
	 * How much the missile will dance.
	 */
	public float WeaponDef_getDance(int weaponDefId);

	/**
	 * How high trajectory missiles will try to fly in.
	 */
	public float WeaponDef_getTrajectoryHeight(int weaponDefId);

	public boolean WeaponDef_isLargeBeamLaser(int weaponDefId);

	/**
	 * If the weapon is a shield rather than a weapon.
	 */
	public boolean WeaponDef_isShield(int weaponDefId);

	/**
	 * If the weapon should be repulsed or absorbed.
	 */
	public boolean WeaponDef_isShieldRepulser(int weaponDefId);

	/**
	 * If the shield only affects enemy projectiles.
	 */
	public boolean WeaponDef_isSmartShield(int weaponDefId);

	/**
	 * If the shield only affects stuff coming from outside shield radius.
	 */
	public boolean WeaponDef_isExteriorShield(int weaponDefId);

	/**
	 * If the shield should be graphically shown.
	 */
	public boolean WeaponDef_isVisibleShield(int weaponDefId);

	/**
	 * If a small graphic should be shown at each repulse.
	 */
	public boolean WeaponDef_isVisibleShieldRepulse(int weaponDefId);

	/**
	 * The number of frames to draw the shield after it has been hit.
	 */
	public int WeaponDef_getVisibleShieldHitFrames(int weaponDefId);

	/**
	 * Amount of the resource used per shot or per second,
	 * depending on the type of projectile.
	 */
	public float WeaponDef_Shield_getResourceUse(int weaponDefId, int resourceId); // REF:resourceId->Resource

	/**
	 * Size of shield covered area
	 */
	public float WeaponDef_Shield_getRadius(int weaponDefId);

	/**
	 * Shield acceleration on plasma stuff.
	 * How much will plasma be accelerated into the other direction
	 * when it hits the shield.
	 */
	public float WeaponDef_Shield_getForce(int weaponDefId);

	/**
	 * Maximum speed to which the shield can repulse plasma.
	 */
	public float WeaponDef_Shield_getMaxSpeed(int weaponDefId);

	/**
	 * Amount of damage the shield can reflect. (0=infinite)
	 */
	public float WeaponDef_Shield_getPower(int weaponDefId);

	/**
	 * Amount of power that is regenerated per second.
	 */
	public float WeaponDef_Shield_getPowerRegen(int weaponDefId);

	/**
	 * How much of a given resource is needed to regenerate power
	 * with max speed per second.
	 */
	public float WeaponDef_Shield_getPowerRegenResource(int weaponDefId, int resourceId); // REF:resourceId->Resource

	/**
	 * How much power the shield has when it is created.
	 */
	public float WeaponDef_Shield_getStartingPower(int weaponDefId);

	/**
	 * Number of frames to delay recharging by after each hit.
	 */
	public int WeaponDef_Shield_getRechargeDelay(int weaponDefId);

	/**
	 * The color of the shield when it is at full power.
	 */
	public void WeaponDef_Shield_getGoodColor(int weaponDefId, short[] return_colorS3_out);

	/**
	 * The color of the shield when it is empty.
	 */
	public void WeaponDef_Shield_getBadColor(int weaponDefId, short[] return_colorS3_out);

	/**
	 * The shields alpha value.
	 */
	public short WeaponDef_Shield_getAlpha(int weaponDefId);

	/**
	 * The type of the shield (bitfield).
	 * Defines what weapons can be intercepted by the shield.
	 * 
	 * @see  getInterceptedByShieldType()
	 */
	public int WeaponDef_Shield_getInterceptType(int weaponDefId);

	/**
	 * The type of shields that can intercept this weapon (bitfield).
	 * The weapon can be affected by shields if:
	 * (shield.getInterceptType() & weapon.getInterceptedByShieldType()) != 0
	 * 
	 * @see  getInterceptType()
	 */
	public int WeaponDef_getInterceptedByShieldType(int weaponDefId);

	/**
	 * Tries to avoid friendly units while aiming?
	 */
	public boolean WeaponDef_isAvoidFriendly(int weaponDefId);

	/**
	 * Tries to avoid features while aiming?
	 */
	public boolean WeaponDef_isAvoidFeature(int weaponDefId);

	/**
	 * Tries to avoid neutral units while aiming?
	 */
	public boolean WeaponDef_isAvoidNeutral(int weaponDefId);

	/**
	 * If nonzero, targetting units will TryTarget at the edge of collision sphere
	 * (radius*tag value, [-1;1]) instead of its centre.
	 */
	public float WeaponDef_getTargetBorder(int weaponDefId);

	/**
	 * If greater than 0, the range will be checked in a cylinder
	 * (height=range*cylinderTargetting) instead of a sphere.
	 */
	public float WeaponDef_getCylinderTargetting(int weaponDefId);

	/**
	 * For beam-lasers only - always hit with some minimum intensity
	 * (a damage coeffcient normally dependent on distance).
	 * Do not confuse this with the intensity tag, it i completely unrelated.
	 */
	public float WeaponDef_getMinIntensity(int weaponDefId);

	/**
	 * Controls cannon range height boost.
	 * 
	 * default: -1: automatically calculate a more or less sane value
	 */
	public float WeaponDef_getHeightBoostFactor(int weaponDefId);

	/**
	 * Multiplier for the distance to the target for priority calculations.
	 */
	public float WeaponDef_getProximityPriority(int weaponDefId);

	public int WeaponDef_getCollisionFlags(int weaponDefId);

	public boolean WeaponDef_isSweepFire(int weaponDefId);

	public boolean WeaponDef_isAbleToAttackGround(int weaponDefId);

	public float WeaponDef_getCameraShake(int weaponDefId);

	public float WeaponDef_getDynDamageExp(int weaponDefId);

	public float WeaponDef_getDynDamageMin(int weaponDefId);

	public float WeaponDef_getDynDamageRange(int weaponDefId);

	public boolean WeaponDef_isDynDamageInverted(int weaponDefId);

	public int WeaponDef_getCustomParams(int weaponDefId, String[] keys, String[] values); // MAP

	public boolean Debug_GraphDrawer_isEnabled();

	/**
	 * Allows one to give an income (dis-)advantage to the team
	 * controlled by the Skirmish AI.
	 * This value can also be set through the GameSetup script,
	 * with the difference that it causes an instant desync when set here.
	 * @param factor  default: 1.0; common: [0.0, 2.0]; valid: [0.0, FLOAT_MAX]
	 */
	public int Cheats_setMyIncomeMultiplier(float factor); // error-return:0=OK

	/**
	 * The AI team receives the specified amount of units of the specified resource.
	 */
	public int Cheats_giveMeResource(int resourceId, float amount); // REF:resourceId->Resource error-return:0=OK

	/**
	 * Creates a new unit with the selected name at pos,
	 * and returns its unit ID in ret_newUnitId.
	 */
	public int Cheats_giveMeUnit(int unitDefId, float[] pos_posF3); // REF:unitDefId->UnitDef REF:RETURN->Unit

	/**
	 * Sends a chat/text message to other players.
	 * This text will also end up in infolog.txt.
	 */
	public int Game_sendTextMessage(String text, int zone); // error-return:0=OK

	/**
	 * Assigns a map location to the last text message sent by the AI.
	 */
	public int Game_setLastMessagePosition(float[] pos_posF3); // error-return:0=OK

	/**
	 * Give \<amount\> units of resource \<resourceId\> to team \<receivingTeam\>.
	 * - the amount is capped to the AI team's resource levels
	 * - does not check for alliance with \<receivingTeam\>
	 * - LuaRules might not allow resource transfers, AI's must verify the deduction
	 */
	public boolean Economy_sendResource(int resourceId, float amount, int receivingTeamId); // REF:resourceId->Resource REF:receivingTeamId->Team

	/**
	 * Give units specified by \<unitIds\> to team \<receivingTeam\>.
	 * \<ret_sentUnits\> represents how many actually were transferred.
	 * Make sure this always matches the size of \<unitIds\> you passed in.
	 * If it does not, then some unitId's were filtered out.
	 * - does not check for alliance with \<receivingTeam\>
	 * - AI's should check each unit if it is still under control of their
	 *   team after the transaction via UnitTaken() and UnitGiven(), since
	 *   LuaRules might block part of it
	 */
	public int Economy_sendUnits(int[] unitIds, int unitIds_size, int receivingTeamId); // REF:MULTI:unitIds->Unit REF:receivingTeamId->Team

	/**
	 * Creates a group and returns the id it was given, returns -1 on failure
	 */
	public int Group_create(); // REF:RETURN->Group STATIC

	/**
	 * Erases a specified group
	 */
	public int Group_erase(int groupId); // REF:groupId->Group error-return:0=OK

	/**
	 * The following functions allow the AI to use the built-in path-finder.
	 * 
	 * - call InitPath and you get a pathId back
	 * - use this to call GetNextWaypoint to get subsequent waypoints;
	 *   the waypoints are centered on 8*8 squares
	 * - note that the pathfinder calculates the waypoints as needed,
	 *   so do not retrieve them until they are needed
	 * - the waypoint's x and z coordinates are returned in x and z,
	 *   while y is used for status codes:
	 *   y =  0: legal path waypoint IFF x >= 0 and z >= 0
	 *   y = -1: temporary waypoint, path not yet available
	 * - for pathType, @see UnitDef_MoveData_getPathType()
	 * - goalRadius defines a goal area within which any square could be accepted as
	 *   path target. If a singular goal position is wanted, use 0.0f.
	 *   default: 8.0f
	 * @param start_posF3  The starting location of the requested path
	 * @param end_posF3  The goal location of the requested path
	 * @param pathType  For what type of unit should the path be calculated
	 * @param goalRadius  default: 8.0f
	 */
	public int Pathing_initPath(float[] start_posF3, float[] end_posF3, int pathType, float goalRadius); // REF:RETURN->Path

	/**
	 * Returns the approximate path cost between two points.
	 * - for pathType {Ground_Move=0, Hover_Move=1, Ship_Move=2},
	 *   @see UnitDef_MoveData_getMoveType()
	 * - goalRadius defines a goal area within which any square could be accepted as
	 *   path target. If a singular goal position is wanted, use 0.0f.
	 *   default: 8.0f
	 * @param start_posF3  The starting location of the requested path
	 * @param end_posF3  The goal location of the requested path
	 * @param pathType  For what type of unit should the path be calculated
	 * @param goalRadius  default: 8.0f
	 */
	public int Pathing_getApproximateLength(float[] start_posF3, float[] end_posF3, int pathType, float goalRadius);

	public int Pathing_getNextWaypoint(int pathId, float[] ret_nextWaypoint_posF3_out); // REF:pathId->Path error-return:0=OK

	public int Pathing_freePath(int pathId); // REF:pathId->Path error-return:0=OK

	/**
	 * @param inData  Can be set to NULL to skip passing in a string
	 * @param inSize  If this is less than 0, the data size is calculated using strlen()
	 * @param ret_outData  this is subject to Lua garbage collection, copy it if you wish to continue using it
	 */
	public int Lua_callRules(String inData, int inSize, String ret_outData); // error-return:0=OK

	/**
	 * @param inData  Can be set to NULL to skip passing in a string
	 * @param inSize  If this is less than 0, the data size is calculated using strlen()
	 * @param ret_outData  this is subject to Lua garbage collection, copy it if you wish to continue using it
	 */
	public int Lua_callUI(String inData, int inSize, String ret_outData); // error-return:0=OK

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	public int Game_sendStartPosition(boolean ready, float[] pos_posF3); // error-return:0=OK

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	public int Map_Drawer_addNotification(float[] pos_posF3, short[] color_colorS3, short alpha); // error-return:0=OK

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 * @param label  create this text on pos in my team color
	 */
	public int Map_Drawer_addPoint(float[] pos_posF3, String label); // error-return:0=OK

	/**
	 * @param pos_posF3  remove map points and lines near this point (100 distance)
	 */
	public int Map_Drawer_deletePointsAndLines(float[] pos_posF3); // error-return:0=OK

	/**
	 * @param posFrom_posF3  draw line from this pos
	 * @param posTo_posF3  to this pos, again only x and z matter
	 */
	public int Map_Drawer_addLine(float[] posFrom_posF3, float[] posTo_posF3); // error-return:0=OK

	public int Map_Drawer_PathDrawer_start(float[] pos_posF3, short[] color_colorS3, short alpha); // error-return:0=OK

	public int Map_Drawer_PathDrawer_finish(boolean iAmUseless); // error-return:0=OK

	public int Map_Drawer_PathDrawer_drawLine(float[] endPos_posF3, short[] color_colorS3, short alpha); // error-return:0=OK

	public int Map_Drawer_PathDrawer_drawLineAndCommandIcon(int cmdId, float[] endPos_posF3, short[] color_colorS3, short alpha); // REF:cmdId->Command error-return:0=OK

	public int Map_Drawer_PathDrawer_drawIcon(int cmdId); // REF:cmdId->Command error-return:0=OK

	public int Map_Drawer_PathDrawer_suspend(float[] endPos_posF3, short[] color_colorS3, short alpha); // error-return:0=OK

	public int Map_Drawer_PathDrawer_restart(boolean sameColor); // error-return:0=OK

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
	public int Map_Drawer_Figure_drawSpline(float[] pos1_posF3, float[] pos2_posF3, float[] pos3_posF3, float[] pos4_posF3, float width, boolean arrow, int lifeTime, int figureGroupId); // REF:figureGroupId->FigureGroup REF:RETURN->FigureGroup

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
	public int Map_Drawer_Figure_drawLine(float[] pos1_posF3, float[] pos2_posF3, float width, boolean arrow, int lifeTime, int figureGroupId); // REF:figureGroupId->FigureGroup REF:RETURN->FigureGroup

	/**
	 * Sets the color used to draw all lines of figures in a figure group.
	 * @param color_colorS3  (x, y, z) -> (red, green, blue)
	 */
	public int Map_Drawer_Figure_setColor(int figureGroupId, short[] color_colorS3, short alpha); // REF:figureGroupId->FigureGroup error-return:0=OK

	/**
	 * Removes a figure group, which means it will not be drawn anymore.
	 */
	public int Map_Drawer_Figure_remove(int figureGroupId); // REF:figureGroupId->FigureGroup error-return:0=OK

	/**
	 * This function allows you to draw units onto the map.
	 * - they only show up on the local player's screen
	 * - they will be drawn in the "standard pose" (as if before any COB scripts are run)
	 * @param rotation  in radians
	 * @param lifeTime  specifies how many frames a figure should live before being auto-removed; 0 means no removal
	 * @param teamId  teamId affects the color of the unit
	 */
	public int Map_Drawer_drawUnit(int toDrawUnitDefId, float[] pos_posF3, float rotation, int lifeTime, int teamId, boolean transparent, boolean drawBorder, int facing); // REF:toDrawUnitDefId->UnitDef error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param facing  set it to UNIT_COMMAND_BUILD_NO_FACING, if you do not want to specify a certain facing
	 */
	public int Unit_build(int unitId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut); // REF:toBuildUnitDefId->UnitDef error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param facing  set it to UNIT_COMMAND_BUILD_NO_FACING, if you do not want to specify a certain facing
	 */
	public int Group_build(int groupId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut); // REF:toBuildUnitDefId->UnitDef error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_stop(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_stop(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_wait(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_wait(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param time  the time in seconds to wait
	 */
	public int Unit_waitFor(int unitId, int time, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param time  the time in seconds to wait
	 */
	public int Group_waitFor(int groupId, int time, short options, int timeOut); // error-return:0=OK

	/**
	 * Wait until another unit is dead, units will not wait on themselves.
	 * Example:
	 * A group of aircrafts waits for an enemy's anti-air defenses to die,
	 * before passing over their ruins to attack.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param toDieUnitId  wait until this unit is dead
	 */
	public int Unit_waitForDeathOf(int unitId, int toDieUnitId, short options, int timeOut); // REF:toDieUnitId->Unit error-return:0=OK

	/**
	 * Wait until another unit is dead, units will not wait on themselves.
	 * Example:
	 * A group of aircrafts waits for an enemy's anti-air defenses to die,
	 * before passing over their ruins to attack.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param toDieUnitId  wait until this unit is dead
	 */
	public int Group_waitForDeathOf(int groupId, int toDieUnitId, short options, int timeOut); // REF:toDieUnitId->Unit error-return:0=OK

	/**
	 * Wait for a specific ammount of units.
	 * Usually used with factories, but does work on groups without a factory too.
	 * Example:
	 * Pick a factory and give it a rallypoint, then add a SquadWait command
	 * with the number of units you want in your squads.
	 * Units will wait at the initial rally point until enough of them
	 * have arrived to make up a squad, then they will continue along their queue.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_waitForSquadSize(int unitId, int numUnits, short options, int timeOut); // error-return:0=OK

	/**
	 * Wait for a specific ammount of units.
	 * Usually used with factories, but does work on groups without a factory too.
	 * Example:
	 * Pick a factory and give it a rallypoint, then add a SquadWait command
	 * with the number of units you want in your squads.
	 * Units will wait at the initial rally point until enough of them
	 * have arrived to make up a squad, then they will continue along their queue.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_waitForSquadSize(int groupId, int numUnits, short options, int timeOut); // error-return:0=OK

	/**
	 * Wait for the arrival of all units included in the command.
	 * Only makes sense for a group of units.
	 * Use it after a movement command of some sort (move / fight).
	 * Units will wait until all members of the GatherWait command have arrived
	 * at their destinations before continuing.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_waitForAll(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * Wait for the arrival of all units included in the command.
	 * Only makes sense for a group of units.
	 * Use it after a movement command of some sort (move / fight).
	 * Units will wait until all members of the GatherWait command have arrived
	 * at their destinations before continuing.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_waitForAll(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_moveTo(int unitId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_moveTo(int groupId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_patrolTo(int unitId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_patrolTo(int groupId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_fight(int unitId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_fight(int groupId, float[] toPos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_attack(int unitId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_attack(int groupId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_attackArea(int unitId, float[] toAttackPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_attackArea(int groupId, float[] toAttackPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_guard(int unitId, int toGuardUnitId, short options, int timeOut); // REF:toGuardUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_guard(int groupId, int toGuardUnitId, short options, int timeOut); // REF:toGuardUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_aiSelect(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_aiSelect(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_addToGroup(int unitId, int toGroupId, short options, int timeOut); // REF:toGroupId->Group error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_addToGroup(int groupId, int toGroupId, short options, int timeOut); // REF:toGroupId->Group error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_removeFromGroup(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_removeFromGroup(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_repair(int unitId, int toRepairUnitId, short options, int timeOut); // REF:toRepairUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_repair(int groupId, int toRepairUnitId, short options, int timeOut); // REF:toRepairUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param fireState  can be: 0=hold fire, 1=return fire, 2=fire at will
	 */
	public int Unit_setFireState(int unitId, int fireState, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param fireState  can be: 0=hold fire, 1=return fire, 2=fire at will
	 */
	public int Group_setFireState(int groupId, int fireState, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param moveState  0=hold pos, 1=maneuvre, 2=roam
	 */
	public int Unit_setMoveState(int unitId, int moveState, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param moveState  0=hold pos, 1=maneuvre, 2=roam
	 */
	public int Group_setMoveState(int groupId, int moveState, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_setBase(int unitId, float[] basePos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_setBase(int groupId, float[] basePos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_selfDestruct(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_selfDestruct(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_setWantedMaxSpeed(int unitId, float wantedMaxSpeed, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_setWantedMaxSpeed(int groupId, float wantedMaxSpeed, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 */
	public int Unit_loadUnits(int unitId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut); // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 */
	public int Group_loadUnits(int groupId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut); // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_loadUnitsInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_loadUnitsInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_loadOnto(int unitId, int transporterUnitId, short options, int timeOut); // REF:transporterUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_loadOnto(int groupId, int transporterUnitId, short options, int timeOut); // REF:transporterUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_unload(int unitId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut); // REF:toUnloadUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_unload(int groupId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut); // REF:toUnloadUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_unloadUnitsInArea(int unitId, float[] toPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_unloadUnitsInArea(int groupId, float[] toPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_setOn(int unitId, boolean on, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_setOn(int groupId, boolean on, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_reclaimUnit(int unitId, int toReclaimUnitId, short options, int timeOut); // REF:toReclaimUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_reclaimUnit(int groupId, int toReclaimUnitId, short options, int timeOut); // REF:toReclaimUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_reclaimFeature(int unitId, int toReclaimFeatureId, short options, int timeOut); // REF:toReclaimFeatureId->Feature error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_reclaimFeature(int groupId, int toReclaimFeatureId, short options, int timeOut); // REF:toReclaimFeatureId->Feature error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_reclaimInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_reclaimInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_cloak(int unitId, boolean cloak, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_cloak(int groupId, boolean cloak, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_stockpile(int unitId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_stockpile(int groupId, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_dGun(int unitId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_dGun(int groupId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_dGunPosition(int unitId, float[] pos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_dGunPosition(int groupId, float[] pos_posF3, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_restoreArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_restoreArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_setRepeat(int unitId, boolean repeat, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_setRepeat(int groupId, boolean repeat, short options, int timeOut); // error-return:0=OK

	/**
	 * Tells weapons that support it to try to use a high trajectory
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param trajectory  0: low-trajectory, 1: high-trajectory
	 */
	public int Unit_setTrajectory(int unitId, int trajectory, short options, int timeOut); // error-return:0=OK

	/**
	 * Tells weapons that support it to try to use a high trajectory
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param trajectory  0: low-trajectory, 1: high-trajectory
	 */
	public int Group_setTrajectory(int groupId, int trajectory, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_resurrect(int unitId, int toResurrectFeatureId, short options, int timeOut); // REF:toResurrectFeatureId->Feature error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_resurrect(int groupId, int toResurrectFeatureId, short options, int timeOut); // REF:toResurrectFeatureId->Feature error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_resurrectInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_resurrectInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_capture(int unitId, int toCaptureUnitId, short options, int timeOut); // REF:toCaptureUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_capture(int groupId, int toCaptureUnitId, short options, int timeOut); // REF:toCaptureUnitId->Unit error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_captureInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_captureInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

	/**
	 * Set the percentage of health at which a unit will return to a save place.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param autoRepairLevel  0: 0%, 1: 30%, 2: 50%, 3: 80%
	 */
	public int Unit_setAutoRepairLevel(int unitId, int autoRepairLevel, short options, int timeOut); // error-return:0=OK

	/**
	 * Set the percentage of health at which a unit will return to a save place.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param autoRepairLevel  0: 0%, 1: 30%, 2: 50%, 3: 80%
	 */
	public int Group_setAutoRepairLevel(int groupId, int autoRepairLevel, short options, int timeOut); // error-return:0=OK

	/**
	 * Set what a unit should do when it is idle.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param idleMode  0: fly, 1: land
	 */
	public int Unit_setIdleMode(int unitId, int idleMode, short options, int timeOut); // error-return:0=OK

	/**
	 * Set what a unit should do when it is idle.
	 * This only works for a few units so far, mainly aircraft.
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 * @param idleMode  0: fly, 1: land
	 */
	public int Group_setIdleMode(int groupId, int idleMode, short options, int timeOut); // error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Unit_executeCustomCommand(int unitId, int cmdId, float[] params, int params_size, short options, int timeOut); // ARRAY:params error-return:0=OK

	/**
	 * @param options  see enum UnitCommandOptions
	 * @param timeOut  At which frame the command will time-out and consequently be removed,
	 *                 if execution of it has not yet begun.
	 *                 Can only be set locally, is not sent over the network, and is used
	 *                 for temporary orders.
	 *                 default: MAX_INT (-> do not time-out)
	 *                 example: currentFrame + 15
	 */
	public int Group_executeCustomCommand(int groupId, int cmdId, float[] params, int params_size, short options, int timeOut); // ARRAY:params error-return:0=OK

	public int Map_Drawer_traceRay(float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags); // REF:srcUnitId->Unit REF:RETURN->Unit

	public int Map_Drawer_traceRayFeature(float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags); // REF:srcUnitId->Unit REF:RETURN->Feature

	/**
	 * Pause or unpauses the game.
	 * This is meant for debugging purposes.
	 * Keep in mind that pause does not happen immediately.
	 * It can take 1-2 frames in single- and up to 10 frames in multiplayer matches.
	 * @param reason  reason for the (un-)pause, or NULL
	 */
	public int Game_setPause(boolean enable, String reason); // error-return:0=OK

	public int Debug_GraphDrawer_setPosition(float x, float y); // error-return:0=OK

	public int Debug_GraphDrawer_setSize(float w, float h); // error-return:0=OK

	public int Debug_GraphDrawer_GraphLine_addPoint(int lineId, float x, float y); // error-return:0=OK

	public int Debug_GraphDrawer_GraphLine_deletePoints(int lineId, int numPoints); // error-return:0=OK

	public int Debug_GraphDrawer_GraphLine_setColor(int lineId, short[] color_colorS3); // error-return:0=OK

	public int Debug_GraphDrawer_GraphLine_setLabel(int lineId, String label); // error-return:0=OK

	public int Debug_addOverlayTexture(float[] texData, int w, int h); // REF:ret_textureId->OverlayTexture

	public int Debug_OverlayTexture_update(int overlayTextureId, float[] texData, int x, int y, int w, int h); // error-return:0=OK

	public int Debug_OverlayTexture_remove(int overlayTextureId); // error-return:0=OK

	public int Debug_OverlayTexture_setPosition(int overlayTextureId, float x, float y); // error-return:0=OK

	public int Debug_OverlayTexture_setSize(int overlayTextureId, float w, float h); // error-return:0=OK

	public int Debug_OverlayTexture_setLabel(int overlayTextureId, String label); // error-return:0=OK

}


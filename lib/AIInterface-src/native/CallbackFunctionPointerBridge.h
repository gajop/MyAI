/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#ifndef __CALLBACK_FUNCTION_POINTER_BRIDGE_H
#define __CALLBACK_FUNCTION_POINTER_BRIDGE_H

#include "ExternalAI/Interface/aidefines.h"

#include <stdlib.h>  // size_t
#include <stdbool.h> // bool, true, false

struct SSkirmishAICallback;

#ifdef __cplusplus
extern "C" {
#endif

void funcPntBrdg_addCallback(const size_t skirmishAIId, const struct SSkirmishAICallback* clb);
void funcPntBrdg_removeCallback(const size_t skirmishAIId);

/**
 * Returns the major engine revision number (e.g. 83)
 */
EXPORT(const char*) bridged__Engine_Version_getMajor(int _skirmishAIId);

/**
 * Minor version number (e.g. "5")
 * @deprecated since 4. October 2011 (pre release 83), will always return "0"
 */
EXPORT(const char*) bridged__Engine_Version_getMinor(int _skirmishAIId);

/**
 * Clients that only differ in patchset can still play together.
 * Also demos should be compatible between patchsets.
 */
EXPORT(const char*) bridged__Engine_Version_getPatchset(int _skirmishAIId);

/**
 * SCM Commits version part (e.g. "" or "13")
 * Number of commits since the last version tag.
 * This matches the regex "[0-9]*".
 */
EXPORT(const char*) bridged__Engine_Version_getCommits(int _skirmishAIId);

/**
 * SCM unique identifier for the current commit.
 * This matches the regex "([0-9a-f]{6})?".
 */
EXPORT(const char*) bridged__Engine_Version_getHash(int _skirmishAIId);

/**
 * SCM branch name (e.g. "master" or "develop")
 */
EXPORT(const char*) bridged__Engine_Version_getBranch(int _skirmishAIId);

/**
 * Additional information (compiler flags, svn revision etc.)
 */
EXPORT(const char*) bridged__Engine_Version_getAdditional(int _skirmishAIId);

/**
 * time of build
 */
EXPORT(const char*) bridged__Engine_Version_getBuildTime(int _skirmishAIId);

/**
 * Returns whether this is a release build of the engine
 */
EXPORT(bool) bridged__Engine_Version_isRelease(int _skirmishAIId);

/**
 * The basic part of a spring version.
 * This may only be used for sync-checking if IsRelease() returns true.
 * @return "Major.PatchSet" or "Major.PatchSet.1"
 */
EXPORT(const char*) bridged__Engine_Version_getNormal(int _skirmishAIId);

/**
 * The sync relevant part of a spring version.
 * This may be used for sync-checking through a simple string-equality test.
 * @return "Major" or "Major.PatchSet.1-Commits-gHash Branch"
 */
EXPORT(const char*) bridged__Engine_Version_getSync(int _skirmishAIId);

/**
 * The verbose, human readable version.
 * @return "Major.Patchset[.1-Commits-gHash Branch] (Additional)"
 */
EXPORT(const char*) bridged__Engine_Version_getFull(int _skirmishAIId);

/**
 * Returns the number of teams in this game
 */
EXPORT(int) bridged__Teams_getSize(int _skirmishAIId);

/**
 * Returns the number of skirmish AIs in this game
 */
EXPORT(int) bridged__SkirmishAIs_getSize(int _skirmishAIId);

/**
 * Returns the maximum number of skirmish AIs in any game
 */
EXPORT(int) bridged__SkirmishAIs_getMax(int _skirmishAIId);

/**
 * Returns the ID of the team controled by this Skirmish AI.
 */
EXPORT(int) bridged__SkirmishAI_getTeamId(int _skirmishAIId);

/**
 * Returns the number of info key-value pairs in the info map
 * for this Skirmish AI.
 */
EXPORT(int) bridged__SkirmishAI_Info_getSize(int _skirmishAIId);

/**
 * Returns the key at index infoIndex in the info map
 * for this Skirmish AI, or NULL if the infoIndex is invalid.
 */
EXPORT(const char*) bridged__SkirmishAI_Info_getKey(int _skirmishAIId, int infoIndex);

/**
 * Returns the value at index infoIndex in the info map
 * for this Skirmish AI, or NULL if the infoIndex is invalid.
 */
EXPORT(const char*) bridged__SkirmishAI_Info_getValue(int _skirmishAIId, int infoIndex);

/**
 * Returns the description of the key at index infoIndex in the info map
 * for this Skirmish AI, or NULL if the infoIndex is invalid.
 */
EXPORT(const char*) bridged__SkirmishAI_Info_getDescription(int _skirmishAIId, int infoIndex);

/**
 * Returns the value associated with the given key in the info map
 * for this Skirmish AI, or NULL if not found.
 */
EXPORT(const char*) bridged__SkirmishAI_Info_getValueByKey(int _skirmishAIId, const char* const key);

/**
 * Returns the number of option key-value pairs in the options map
 * for this Skirmish AI.
 */
EXPORT(int) bridged__SkirmishAI_OptionValues_getSize(int _skirmishAIId);

/**
 * Returns the key at index optionIndex in the options map
 * for this Skirmish AI, or NULL if the optionIndex is invalid.
 */
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getKey(int _skirmishAIId, int optionIndex);

/**
 * Returns the value at index optionIndex in the options map
 * for this Skirmish AI, or NULL if the optionIndex is invalid.
 */
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getValue(int _skirmishAIId, int optionIndex);

/**
 * Returns the value associated with the given key in the options map
 * for this Skirmish AI, or NULL if not found.
 */
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getValueByKey(int _skirmishAIId, const char* const key);

/**
 * This will end up in infolog
 */
EXPORT(void) bridged__Log_log(int _skirmishAIId, const char* const msg);

/**
 * Inform the engine of an error that happend in the interface.
 * @param   msg       error message
 * @param   severety  from 10 for minor to 0 for fatal
 * @param   die       if this is set to true, the engine assumes
 *                    the interface is in an irreparable state, and it will
 *                    unload it immediately.
 */
EXPORT(void) bridged__Log_exception(int _skirmishAIId, const char* const msg, int severety, bool die);

/**
 * Returns '/' on posix and '\\' on windows
 */
EXPORT(char) bridged__DataDirs_getPathSeparator(int _skirmishAIId);

/**
 * This interfaces main data dir, which is where the shared library
 * and the InterfaceInfo.lua file are located, e.g.:
 * /usr/share/games/spring/AI/Skirmish/RAI/0.601/
 */
EXPORT(const char*) bridged__DataDirs_getConfigDir(int _skirmishAIId);

/**
 * This interfaces writable data dir, which is where eg logs, caches
 * and learning data should be stored, e.g.:
 * /home/userX/.spring/AI/Skirmish/RAI/0.601/
 */
EXPORT(const char*) bridged__DataDirs_getWriteableDir(int _skirmishAIId);

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
EXPORT(bool) bridged__DataDirs_locatePath(int _skirmishAIId, char* path, int path_sizeMax, const char* const relPath, bool writeable, bool create, bool dir, bool common);

/**
 * @see     locatePath()
 */
EXPORT(char*) bridged__DataDirs_allocatePath(int _skirmishAIId, const char* const relPath, bool writeable, bool create, bool dir, bool common);

/**
 * Returns the number of springs data dirs.
 */
EXPORT(int) bridged__DataDirs_Roots_getSize(int _skirmishAIId);

/**
 * Returns the data dir at dirIndex, which is valid between 0 and (DataDirs_Roots_getSize() - 1).
 */
EXPORT(bool) bridged__DataDirs_Roots_getDir(int _skirmishAIId, char* path, int path_sizeMax, int dirIndex);

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
EXPORT(bool) bridged__DataDirs_Roots_locatePath(int _skirmishAIId, char* path, int path_sizeMax, const char* const relPath, bool writeable, bool create, bool dir);

EXPORT(char*) bridged__DataDirs_Roots_allocatePath(int _skirmishAIId, const char* const relPath, bool writeable, bool create, bool dir);

/**
 * Returns the current game time measured in frames (the
 * simulation runs at 30 frames per second at normal speed)
 * 
 * This should not be used, as we get the frame from the SUpdateEvent.
 * @deprecated
 */
EXPORT(int) bridged__Game_getCurrentFrame(int _skirmishAIId);

EXPORT(int) bridged__Game_getAiInterfaceVersion(int _skirmishAIId);

EXPORT(int) bridged__Game_getMyTeam(int _skirmishAIId);

EXPORT(int) bridged__Game_getMyAllyTeam(int _skirmishAIId);

EXPORT(int) bridged__Game_getPlayerTeam(int _skirmishAIId, int playerId);

/**
 * Returns the number of active teams participating
 * in the currently running game.
 * A return value of 6 for example, would mean that teams 0 till 5
 * take part in the game.
 */
EXPORT(int) bridged__Game_getTeams(int _skirmishAIId);

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
EXPORT(const char*) bridged__Game_getTeamSide(int _skirmishAIId, int otherTeamId);

/**
 * Returns the color of a team in the game.
 * 
 * This should only be used when drawing stuff,
 * and not for team-identification.
 * @return the RGB color of a team, with values in [0, 255]
 */
EXPORT(void) bridged__Game_getTeamColor(int _skirmishAIId, int otherTeamId, short* return_colorS3_out);

/**
 * Returns the income multiplier of a team in the game.
 * All the teams resource income is multiplied by this factor.
 * The default value is 1.0f, the valid range is [0.0, FLOAT_MAX].
 */
EXPORT(float) bridged__Game_getTeamIncomeMultiplier(int _skirmishAIId, int otherTeamId);

/**
 * Returns the ally-team of a team
 */
EXPORT(int) bridged__Game_getTeamAllyTeam(int _skirmishAIId, int otherTeamId);

/**
 * Returns the current level of a resource of another team.
 * Allways works for allied teams.
 * Works for all teams when cheating is enabled.
 * @return current level of the requested resource of the other team, or -1.0 on an invalid request
 */
EXPORT(float) bridged__Game_getTeamResourceCurrent(int _skirmishAIId, int otherTeamId, int resourceId);

/**
 * Returns the current income of a resource of another team.
 * Allways works for allied teams.
 * Works for all teams when cheating is enabled.
 * @return current income of the requested resource of the other team, or -1.0 on an invalid request
 */
EXPORT(float) bridged__Game_getTeamResourceIncome(int _skirmishAIId, int otherTeamId, int resourceId);

/**
 * Returns the current usage of a resource of another team.
 * Allways works for allied teams.
 * Works for all teams when cheating is enabled.
 * @return current usage of the requested resource of the other team, or -1.0 on an invalid request
 */
EXPORT(float) bridged__Game_getTeamResourceUsage(int _skirmishAIId, int otherTeamId, int resourceId);

/**
 * Returns the storage capacity for a resource of another team.
 * Allways works for allied teams.
 * Works for all teams when cheating is enabled.
 * @return storage capacity for the requested resource of the other team, or -1.0 on an invalid request
 */
EXPORT(float) bridged__Game_getTeamResourceStorage(int _skirmishAIId, int otherTeamId, int resourceId);

/**
 * Returns true, if the two supplied ally-teams are currently allied
 */
EXPORT(bool) bridged__Game_isAllied(int _skirmishAIId, int firstAllyTeamId, int secondAllyTeamId);

EXPORT(bool) bridged__Game_isExceptionHandlingEnabled(int _skirmishAIId);

EXPORT(bool) bridged__Game_isDebugModeEnabled(int _skirmishAIId);

EXPORT(int) bridged__Game_getMode(int _skirmishAIId);

EXPORT(bool) bridged__Game_isPaused(int _skirmishAIId);

EXPORT(float) bridged__Game_getSpeedFactor(int _skirmishAIId);

EXPORT(const char*) bridged__Game_getSetupScript(int _skirmishAIId);

/**
 * Returns the categories bit field value.
 * @return the categories bit field value or 0,
 *         in case of empty name or too many categories
 * @see getCategoryName
 */
EXPORT(int) bridged__Game_getCategoryFlag(int _skirmishAIId, const char* categoryName);

/**
 * Returns the bitfield values of a list of category names.
 * @param categoryNames space delimited list of names
 * @see Game#getCategoryFlag
 */
EXPORT(int) bridged__Game_getCategoriesFlag(int _skirmishAIId, const char* categoryNames);

/**
 * Return the name of the category described by a category flag.
 * @see Game#getCategoryFlag
 */
EXPORT(void) bridged__Game_getCategoryName(int _skirmishAIId, int categoryFlag, char* name, int name_sizeMax);

EXPORT(float) bridged__Gui_getViewRange(int _skirmishAIId);

EXPORT(float) bridged__Gui_getScreenX(int _skirmishAIId);

EXPORT(float) bridged__Gui_getScreenY(int _skirmishAIId);

EXPORT(void) bridged__Gui_Camera_getDirection(int _skirmishAIId, float* return_posF3_out);

EXPORT(void) bridged__Gui_Camera_getPosition(int _skirmishAIId, float* return_posF3_out);

/**
 * Returns whether this AI may use active cheats.
 */
EXPORT(bool) bridged__Cheats_isEnabled(int _skirmishAIId);

/**
 * Set whether this AI may use active cheats.
 */
EXPORT(bool) bridged__Cheats_setEnabled(int _skirmishAIId, bool enable);

/**
 * Set whether this AI may receive cheat events.
 * When enabled, you would for example get informed when enemy units are
 * created, even without sensor coverage.
 */
EXPORT(bool) bridged__Cheats_setEventsEnabled(int _skirmishAIId, bool enabled);

/**
 * Returns whether cheats will desync if used by an AI.
 * @return always true, unless we are both the host and the only client.
 */
EXPORT(bool) bridged__Cheats_isOnlyPassive(int _skirmishAIId);

EXPORT(int) bridged__getResources(int _skirmishAIId); // FETCHER:MULTI:NUM:Resource

EXPORT(int) bridged__getResourceByName(int _skirmishAIId, const char* resourceName); // REF:RETURN->Resource

EXPORT(const char*) bridged__Resource_getName(int _skirmishAIId, int resourceId);

EXPORT(float) bridged__Resource_getOptimum(int _skirmishAIId, int resourceId);

EXPORT(float) bridged__Economy_getCurrent(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__Economy_getIncome(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__Economy_getUsage(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__Economy_getStorage(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

/**
 * Return -1 when the file does not exist
 */
EXPORT(int) bridged__File_getSize(int _skirmishAIId, const char* fileName);

/**
 * Returns false when file does not exist, or the buffer is too small
 */
EXPORT(bool) bridged__File_getContent(int _skirmishAIId, const char* fileName, void* buffer, int bufferLen);

/**
 * A UnitDef contains all properties of a unit that are specific to its type,
 * for example the number and type of weapons or max-speed.
 * These properties are usually fixed, and not meant to change during a game.
 * The unitId is a unique id for this type of unit.
 */
EXPORT(int) bridged__getUnitDefs(int _skirmishAIId, int* unitDefIds, int unitDefIds_sizeMax); // FETCHER:MULTI:IDs:UnitDef:unitDefIds

EXPORT(int) bridged__getUnitDefByName(int _skirmishAIId, const char* unitName); // REF:RETURN->UnitDef

/**
 * Forces loading of the unit model
 */
EXPORT(float) bridged__UnitDef_getHeight(int _skirmishAIId, int unitDefId);

/**
 * Forces loading of the unit model
 */
EXPORT(float) bridged__UnitDef_getRadius(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getName(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getHumanName(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getFileName(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(int) bridged__UnitDef_getAiHint(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getCobId(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getTechLevel(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(const char*) bridged__UnitDef_getGaia(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getUpkeep(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

/**
 * This amount of the resource will always be created.
 */
EXPORT(float) bridged__UnitDef_getResourceMake(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

/**
 * This amount of the resource will be created when the unit is on and enough
 * energy can be drained.
 */
EXPORT(float) bridged__UnitDef_getMakesResource(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getCost(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getExtractsResource(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getResourceExtractorRange(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getWindResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getTidalResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getStorage(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(bool) bridged__UnitDef_isSquareResourceExtractor(int _skirmishAIId, int unitDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__UnitDef_getBuildTime(int _skirmishAIId, int unitDefId);

/**
 * This amount of auto-heal will always be applied.
 */
EXPORT(float) bridged__UnitDef_getAutoHeal(int _skirmishAIId, int unitDefId);

/**
 * This amount of auto-heal will only be applied while the unit is idling.
 */
EXPORT(float) bridged__UnitDef_getIdleAutoHeal(int _skirmishAIId, int unitDefId);

/**
 * Time a unit needs to idle before it is considered idling.
 */
EXPORT(int) bridged__UnitDef_getIdleTime(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getPower(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getHealth(int _skirmishAIId, int unitDefId);

/**
 * Returns the bit field value denoting the categories this unit is in.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(int) bridged__UnitDef_getCategory(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTurnRate(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isTurnInPlace(int _skirmishAIId, int unitDefId);

/**
 * Units above this distance to goal will try to turn while keeping
 * some of their speed.
 * 0 to disable
 */
EXPORT(float) bridged__UnitDef_getTurnInPlaceDistance(int _skirmishAIId, int unitDefId);

/**
 * Units below this speed will turn in place regardless of their
 * turnInPlace setting.
 */
EXPORT(float) bridged__UnitDef_getTurnInPlaceSpeedLimit(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isUpright(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isCollide(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getLosRadius(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getAirLosRadius(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getLosHeight(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getRadarRadius(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getSonarRadius(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getJammerRadius(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getSonarJamRadius(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getSeismicRadius(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getSeismicSignature(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isStealth(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isSonarStealth(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isBuildRange3D(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getBuildDistance(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getBuildSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getReclaimSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getRepairSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxRepairSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getResurrectSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getCaptureSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTerraformSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMass(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isPushResistant(int _skirmishAIId, int unitDefId);

/**
 * Should the unit move sideways when it can not shoot?
 */
EXPORT(bool) bridged__UnitDef_isStrafeToAttack(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMinCollisionSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getSlideTolerance(int _skirmishAIId, int unitDefId);

/**
 * Build location relevant maximum steepness of the underlaying terrain.
 * Used to calculate the maxHeightDif.
 */
EXPORT(float) bridged__UnitDef_getMaxSlope(int _skirmishAIId, int unitDefId);

/**
 * Maximum terra-form height this building allows.
 * If this value is 0.0, you can only build this structure on
 * totally flat terrain.
 */
EXPORT(float) bridged__UnitDef_getMaxHeightDif(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMinWaterDepth(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getWaterline(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxWaterDepth(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getArmoredMultiple(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getArmorType(int _skirmishAIId, int unitDefId);

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
EXPORT(int) bridged__UnitDef_FlankingBonus_getMode(int _skirmishAIId, int unitDefId);

/**
 * The unit takes less damage when attacked from this direction.
 * This encourage flanking fire.
 */
EXPORT(void) bridged__UnitDef_FlankingBonus_getDir(int _skirmishAIId, int unitDefId, float* return_posF3_out);

/**
 * Damage factor for the least protected direction
 */
EXPORT(float) bridged__UnitDef_FlankingBonus_getMax(int _skirmishAIId, int unitDefId);

/**
 * Damage factor for the most protected direction
 */
EXPORT(float) bridged__UnitDef_FlankingBonus_getMin(int _skirmishAIId, int unitDefId);

/**
 * How much the ability of the flanking bonus direction to move builds up each
 * frame.
 */
EXPORT(float) bridged__UnitDef_FlankingBonus_getMobilityAdd(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxWeaponRange(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(const char*) bridged__UnitDef_getType(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getTooltip(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getWreckName(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getDeathExplosion(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_getSelfDExplosion(int _skirmishAIId, int unitDefId);

/**
 * Returns the name of the category this unit is in.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(const char*) bridged__UnitDef_getCategoryString(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToSelfD(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getSelfDCountdown(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToSubmerge(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToFly(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToMove(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToHover(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isFloater(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isBuilder(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isActivateWhenBuilt(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isOnOffable(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isFullHealthFactory(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isFactoryHeadingTakeoff(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isReclaimable(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isCapturable(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToRestore(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToRepair(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToSelfRepair(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToReclaim(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToAttack(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToPatrol(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToFight(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToGuard(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToAssist(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAssistable(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToRepeat(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToFireControl(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getFireState(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getMoveState(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getWingDrag(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getWingAngle(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getDrag(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getFrontToSpeed(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getSpeedToFront(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMyGravity(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxBank(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxPitch(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTurnRadius(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getWantedHeight(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getVerticalSpeed(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(bool) bridged__UnitDef_isAbleToCrash(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(bool) bridged__UnitDef_isHoverAttack(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAirStrafe(int _skirmishAIId, int unitDefId);

/**
 * @return  < 0:  it can land
 *          >= 0: how much the unit will move during hovering on the spot
 */
EXPORT(float) bridged__UnitDef_getDlHoverFactor(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxAcceleration(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxDeceleration(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxAileron(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxElevator(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMaxRudder(int _skirmishAIId, int unitDefId);

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
EXPORT(int) bridged__UnitDef_getYardMap(int _skirmishAIId, int unitDefId, int facing, short* yardMap, int yardMap_sizeMax); // ARRAY:yardMap

EXPORT(int) bridged__UnitDef_getXSize(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getZSize(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(int) bridged__UnitDef_getBuildAngle(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getLoadingRadius(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getUnloadSpread(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getTransportCapacity(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getTransportSize(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getMinTransportSize(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAirBase(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isFirePlatform(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTransportMass(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getMinTransportMass(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isHoldSteady(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isReleaseHeld(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isNotTransportable(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isTransportByEnemy(int _skirmishAIId, int unitDefId);

/**
 * @return  0: land unload
 *          1: fly-over drop
 *          2: land flood
 */
EXPORT(int) bridged__UnitDef_getTransportUnloadMethod(int _skirmishAIId, int unitDefId);

/**
 * Dictates fall speed of all transported units.
 * This only makes sense for air transports,
 * if they an drop units while in the air.
 */
EXPORT(float) bridged__UnitDef_getFallSpeed(int _skirmishAIId, int unitDefId);

/**
 * Sets the transported units FBI, overrides fallSpeed
 */
EXPORT(float) bridged__UnitDef_getUnitFallSpeed(int _skirmishAIId, int unitDefId);

/**
 * If the unit can cloak
 */
EXPORT(bool) bridged__UnitDef_isAbleToCloak(int _skirmishAIId, int unitDefId);

/**
 * If the unit wants to start out cloaked
 */
EXPORT(bool) bridged__UnitDef_isStartCloaked(int _skirmishAIId, int unitDefId);

/**
 * Energy cost per second to stay cloaked when stationary
 */
EXPORT(float) bridged__UnitDef_getCloakCost(int _skirmishAIId, int unitDefId);

/**
 * Energy cost per second to stay cloaked when moving
 */
EXPORT(float) bridged__UnitDef_getCloakCostMoving(int _skirmishAIId, int unitDefId);

/**
 * If enemy unit comes within this range, decloaking is forced
 */
EXPORT(float) bridged__UnitDef_getDecloakDistance(int _skirmishAIId, int unitDefId);

/**
 * Use a spherical, instead of a cylindrical test?
 */
EXPORT(bool) bridged__UnitDef_isDecloakSpherical(int _skirmishAIId, int unitDefId);

/**
 * Will the unit decloak upon firing?
 */
EXPORT(bool) bridged__UnitDef_isDecloakOnFire(int _skirmishAIId, int unitDefId);

/**
 * Will the unit self destruct if an enemy comes to close?
 */
EXPORT(bool) bridged__UnitDef_isAbleToKamikaze(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getKamikazeDist(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isTargetingFacility(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_canManualFire(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isNeedGeo(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isFeature(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isHideDamage(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isCommander(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isShowPlayerName(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToResurrect(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToCapture(int _skirmishAIId, int unitDefId);

/**
 * Indicates the trajectory types supported by this unit.
 * 
 * @return  0: (default) = only low
 *          1: only high
 *          2: choose
 */
EXPORT(int) bridged__UnitDef_getHighTrajectoryType(int _skirmishAIId, int unitDefId);

/**
 * Returns the bit field value denoting the categories this unit shall not
 * chase.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(int) bridged__UnitDef_getNoChaseCategory(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isLeaveTracks(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTrackWidth(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTrackOffset(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTrackStrength(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getTrackStretch(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getTrackType(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isAbleToDropFlare(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getFlareReloadTime(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getFlareEfficiency(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getFlareDelay(int _skirmishAIId, int unitDefId);

EXPORT(void) bridged__UnitDef_getFlareDropVector(int _skirmishAIId, int unitDefId, float* return_posF3_out);

EXPORT(int) bridged__UnitDef_getFlareTime(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getFlareSalvoSize(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getFlareSalvoDelay(int _skirmishAIId, int unitDefId);

/**
 * Only matters for fighter aircraft
 */
EXPORT(bool) bridged__UnitDef_isAbleToLoopbackAttack(int _skirmishAIId, int unitDefId);

/**
 * Indicates whether the ground will be leveled/flattened out
 * after this building has been built on it.
 * Only matters for buildings.
 */
EXPORT(bool) bridged__UnitDef_isLevelGround(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_isUseBuildingGroundDecal(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getBuildingDecalType(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getBuildingDecalSizeX(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getBuildingDecalSizeY(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_getBuildingDecalDecaySpeed(int _skirmishAIId, int unitDefId);

/**
 * Maximum flight time in seconds before the aircraft needs
 * to return to an air repair bay to refuel.
 */
EXPORT(float) bridged__UnitDef_getMaxFuel(int _skirmishAIId, int unitDefId);

/**
 * Time to fully refuel the unit
 */
EXPORT(float) bridged__UnitDef_getRefuelTime(int _skirmishAIId, int unitDefId);

/**
 * Minimum build power of airbases that this aircraft can land on
 */
EXPORT(float) bridged__UnitDef_getMinAirBasePower(int _skirmishAIId, int unitDefId);

/**
 * Number of units of this type allowed simultaneously in the game
 */
EXPORT(int) bridged__UnitDef_getMaxThisUnit(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getDecoyDef(int _skirmishAIId, int unitDefId); // REF:RETURN->UnitDef

EXPORT(bool) bridged__UnitDef_isDontLand(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getShieldDef(int _skirmishAIId, int unitDefId); // REF:RETURN->WeaponDef

EXPORT(int) bridged__UnitDef_getStockpileDef(int _skirmishAIId, int unitDefId); // REF:RETURN->WeaponDef

EXPORT(int) bridged__UnitDef_getBuildOptions(int _skirmishAIId, int unitDefId, int* unitDefIds, int unitDefIds_sizeMax); // REF:MULTI:unitDefIds->UnitDef

EXPORT(int) bridged__UnitDef_getCustomParams(int _skirmishAIId, int unitDefId, const char** keys, const char** values); // MAP

EXPORT(bool) bridged__UnitDef_isMoveDataAvailable(int _skirmishAIId, int unitDefId); // AVAILABLE:MoveData

/**
 * @deprecated
 */
EXPORT(float) bridged__UnitDef_MoveData_getMaxAcceleration(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(float) bridged__UnitDef_MoveData_getMaxBreaking(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(float) bridged__UnitDef_MoveData_getMaxSpeed(int _skirmishAIId, int unitDefId);

/**
 * @deprecated
 */
EXPORT(short) bridged__UnitDef_MoveData_getMaxTurnRate(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_MoveData_getXSize(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_MoveData_getZSize(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_MoveData_getDepth(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_MoveData_getMaxSlope(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_MoveData_getSlopeMod(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_MoveData_getDepthMod(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_MoveData_getPathType(int _skirmishAIId, int unitDefId);

EXPORT(float) bridged__UnitDef_MoveData_getCrushStrength(int _skirmishAIId, int unitDefId);

/**
 * enum MoveType { Ground_Move=0, Hover_Move=1, Ship_Move=2 };
 */
EXPORT(int) bridged__UnitDef_MoveData_getMoveType(int _skirmishAIId, int unitDefId);

/**
 * enum MoveFamily { Tank=0, KBot=1, Hover=2, Ship=3 };
 */
EXPORT(int) bridged__UnitDef_MoveData_getMoveFamily(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_MoveData_getTerrainClass(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_MoveData_getFollowGround(int _skirmishAIId, int unitDefId);

EXPORT(bool) bridged__UnitDef_MoveData_isSubMarine(int _skirmishAIId, int unitDefId);

EXPORT(const char*) bridged__UnitDef_MoveData_getName(int _skirmishAIId, int unitDefId);

EXPORT(int) bridged__UnitDef_getWeaponMounts(int _skirmishAIId, int unitDefId); // FETCHER:MULTI:NUM:WeaponMount

EXPORT(const char*) bridged__UnitDef_WeaponMount_getName(int _skirmishAIId, int unitDefId, int weaponMountId);

EXPORT(int) bridged__UnitDef_WeaponMount_getWeaponDef(int _skirmishAIId, int unitDefId, int weaponMountId); // REF:RETURN->WeaponDef

EXPORT(int) bridged__UnitDef_WeaponMount_getSlavedTo(int _skirmishAIId, int unitDefId, int weaponMountId);

EXPORT(void) bridged__UnitDef_WeaponMount_getMainDir(int _skirmishAIId, int unitDefId, int weaponMountId, float* return_posF3_out);

EXPORT(float) bridged__UnitDef_WeaponMount_getMaxAngleDif(int _skirmishAIId, int unitDefId, int weaponMountId);

/**
 * How many seconds of fuel it costs for the owning unit to fire this weapon.
 */
EXPORT(float) bridged__UnitDef_WeaponMount_getFuelUsage(int _skirmishAIId, int unitDefId, int weaponMountId);

/**
 * Returns the bit field value denoting the categories this weapon should
 * not target.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(int) bridged__UnitDef_WeaponMount_getBadTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId);

/**
 * Returns the bit field value denoting the categories this weapon should
 * target, excluding all others.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(int) bridged__UnitDef_WeaponMount_getOnlyTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId);

/**
 * Returns the number of units a team can have, after which it can not build
 * any more. It is possible that a team has more units then this value at
 * some point in the game. This is possible for example with taking,
 * reclaiming or capturing units.
 * This value is usefull for controlling game performance, and will
 * therefore often be set on games with old hardware to prevent lagging
 * because of too many units.
 */
EXPORT(int) bridged__Unit_getLimit(int _skirmishAIId); // STATIC

/**
 * Returns the maximum total number of units that may exist at any one point
 * in time induring the current game.
 */
EXPORT(int) bridged__Unit_getMax(int _skirmishAIId); // STATIC

/**
 * Returns all units that are not in this teams ally-team nor neutral
 * and are in LOS.
 * If cheats are enabled, this will return all enemies on the map.
 */
EXPORT(int) bridged__getEnemyUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are not in this teams ally-team nor neutral
 * and are in LOS plus they have to be located in the specified area
 * of the map.
 * If cheats are enabled, this will return all enemies
 * in the specified area.
 */
EXPORT(int) bridged__getEnemyUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are not in this teams ally-team nor neutral
 * and are in under sensor coverage (sight or radar).
 * If cheats are enabled, this will return all enemies on the map.
 */
EXPORT(int) bridged__getEnemyUnitsInRadarAndLos(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are in this teams ally-team, including this teams
 * units.
 */
EXPORT(int) bridged__getFriendlyUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are in this teams ally-team, including this teams
 * units plus they have to be located in the specified area of the map.
 */
EXPORT(int) bridged__getFriendlyUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are neutral and are in LOS.
 */
EXPORT(int) bridged__getNeutralUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are neutral and are in LOS plus they have to be
 * located in the specified area of the map.
 */
EXPORT(int) bridged__getNeutralUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are of the team controlled by this AI instance. This
 * list can also be created dynamically by the AI, through updating a list on
 * each unit-created and unit-destroyed event.
 */
EXPORT(int) bridged__getTeamUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns all units that are currently selected
 * (usually only contains units if a human player
 * is controlling this team as well).
 */
EXPORT(int) bridged__getSelectedUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax); // FETCHER:MULTI:IDs:Unit:unitIds

/**
 * Returns the unit's unitdef struct from which you can read all
 * the statistics of the unit, do NOT try to change any values in it.
 */
EXPORT(int) bridged__Unit_getDef(int _skirmishAIId, int unitId); // REF:RETURN->UnitDef

/**
 * This is a set of parameters that is initialized
 * in CreateUnitRulesParams() and may change during the game.
 * Each parameter is uniquely identified only by its id
 * (which is the index in the vector).
 * Parameters may or may not have a name.
 */
EXPORT(int) bridged__Unit_getModParams(int _skirmishAIId, int unitId); // FETCHER:MULTI:NUM:ModParam

/**
 * Not every mod parameter has a name.
 */
EXPORT(const char*) bridged__Unit_ModParam_getName(int _skirmishAIId, int unitId, int modParamId);

EXPORT(float) bridged__Unit_ModParam_getValue(int _skirmishAIId, int unitId, int modParamId);

EXPORT(int) bridged__Unit_getTeam(int _skirmishAIId, int unitId);

EXPORT(int) bridged__Unit_getAllyTeam(int _skirmishAIId, int unitId);

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
EXPORT(int) bridged__Unit_getAiHint(int _skirmishAIId, int unitId);

EXPORT(int) bridged__Unit_getStockpile(int _skirmishAIId, int unitId);

EXPORT(int) bridged__Unit_getStockpileQueued(int _skirmishAIId, int unitId);

EXPORT(float) bridged__Unit_getCurrentFuel(int _skirmishAIId, int unitId);

/**
 * The unit's max speed
 */
EXPORT(float) bridged__Unit_getMaxSpeed(int _skirmishAIId, int unitId);

/**
 * The furthest any weapon of the unit can fire
 */
EXPORT(float) bridged__Unit_getMaxRange(int _skirmishAIId, int unitId);

/**
 * The unit's max health
 */
EXPORT(float) bridged__Unit_getMaxHealth(int _skirmishAIId, int unitId);

/**
 * How experienced the unit is (0.0f - 1.0f)
 */
EXPORT(float) bridged__Unit_getExperience(int _skirmishAIId, int unitId);

/**
 * Returns the group a unit belongs to, -1 if none
 */
EXPORT(int) bridged__Unit_getGroup(int _skirmishAIId, int unitId);

EXPORT(int) bridged__Unit_getCurrentCommands(int _skirmishAIId, int unitId); // FETCHER:MULTI:NUM:CurrentCommand-Command

/**
 * For the type of the command queue, see CCommandQueue::CommandQueueType
 * in Sim/Unit/CommandAI/CommandQueue.h
 */
EXPORT(int) bridged__Unit_CurrentCommand_getType(int _skirmishAIId, int unitId); // STATIC

/**
 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
 * (custom codes can also be used)
 */
EXPORT(int) bridged__Unit_CurrentCommand_getId(int _skirmishAIId, int unitId, int commandId);

EXPORT(short) bridged__Unit_CurrentCommand_getOptions(int _skirmishAIId, int unitId, int commandId);

EXPORT(int) bridged__Unit_CurrentCommand_getTag(int _skirmishAIId, int unitId, int commandId);

EXPORT(int) bridged__Unit_CurrentCommand_getTimeOut(int _skirmishAIId, int unitId, int commandId);

EXPORT(int) bridged__Unit_CurrentCommand_getParams(int _skirmishAIId, int unitId, int commandId, float* params, int params_sizeMax); // ARRAY:params

/**
 * The commands that this unit can understand, other commands will be ignored
 */
EXPORT(int) bridged__Unit_getSupportedCommands(int _skirmishAIId, int unitId); // FETCHER:MULTI:NUM:SupportedCommand-CommandDescription

/**
 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
 * (custom codes can also be used)
 */
EXPORT(int) bridged__Unit_SupportedCommand_getId(int _skirmishAIId, int unitId, int supportedCommandId);

EXPORT(const char*) bridged__Unit_SupportedCommand_getName(int _skirmishAIId, int unitId, int supportedCommandId);

EXPORT(const char*) bridged__Unit_SupportedCommand_getToolTip(int _skirmishAIId, int unitId, int supportedCommandId);

EXPORT(bool) bridged__Unit_SupportedCommand_isShowUnique(int _skirmishAIId, int unitId, int supportedCommandId);

EXPORT(bool) bridged__Unit_SupportedCommand_isDisabled(int _skirmishAIId, int unitId, int supportedCommandId);

EXPORT(int) bridged__Unit_SupportedCommand_getParams(int _skirmishAIId, int unitId, int supportedCommandId, const char** params, int params_sizeMax); // ARRAY:params

/**
 * The unit's current health
 */
EXPORT(float) bridged__Unit_getHealth(int _skirmishAIId, int unitId);

EXPORT(float) bridged__Unit_getSpeed(int _skirmishAIId, int unitId);

/**
 * Indicate the relative power of the unit,
 * used for experience calulations etc.
 * This is sort of the measure of the units overall power.
 */
EXPORT(float) bridged__Unit_getPower(int _skirmishAIId, int unitId);

EXPORT(float) bridged__Unit_getResourceUse(int _skirmishAIId, int unitId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__Unit_getResourceMake(int _skirmishAIId, int unitId, int resourceId); // REF:resourceId->Resource

EXPORT(void) bridged__Unit_getPos(int _skirmishAIId, int unitId, float* return_posF3_out);

EXPORT(void) bridged__Unit_getVel(int _skirmishAIId, int unitId, float* return_posF3_out);

EXPORT(bool) bridged__Unit_isActivated(int _skirmishAIId, int unitId);

/**
 * Returns true if the unit is currently being built
 */
EXPORT(bool) bridged__Unit_isBeingBuilt(int _skirmishAIId, int unitId);

EXPORT(bool) bridged__Unit_isCloaked(int _skirmishAIId, int unitId);

EXPORT(bool) bridged__Unit_isParalyzed(int _skirmishAIId, int unitId);

EXPORT(bool) bridged__Unit_isNeutral(int _skirmishAIId, int unitId);

/**
 * Returns the unit's build facing (0-3)
 */
EXPORT(int) bridged__Unit_getBuildingFacing(int _skirmishAIId, int unitId);

/**
 * Number of the last frame this unit received an order from a player.
 */
EXPORT(int) bridged__Unit_getLastUserOrderFrame(int _skirmishAIId, int unitId);

EXPORT(int) bridged__getGroups(int _skirmishAIId, int* groupIds, int groupIds_sizeMax); // FETCHER:MULTI:IDs:Group:groupIds

EXPORT(int) bridged__Group_getSupportedCommands(int _skirmishAIId, int groupId); // FETCHER:MULTI:NUM:SupportedCommand-CommandDescription

/**
 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
 * (custom codes can also be used)
 */
EXPORT(int) bridged__Group_SupportedCommand_getId(int _skirmishAIId, int groupId, int supportedCommandId);

EXPORT(const char*) bridged__Group_SupportedCommand_getName(int _skirmishAIId, int groupId, int supportedCommandId);

EXPORT(const char*) bridged__Group_SupportedCommand_getToolTip(int _skirmishAIId, int groupId, int supportedCommandId);

EXPORT(bool) bridged__Group_SupportedCommand_isShowUnique(int _skirmishAIId, int groupId, int supportedCommandId);

EXPORT(bool) bridged__Group_SupportedCommand_isDisabled(int _skirmishAIId, int groupId, int supportedCommandId);

EXPORT(int) bridged__Group_SupportedCommand_getParams(int _skirmishAIId, int groupId, int supportedCommandId, const char** params, int params_sizeMax); // ARRAY:params

/**
 * For the id, see CMD_xxx codes in Sim/Unit/CommandAI/Command.h
 * (custom codes can also be used)
 */
EXPORT(int) bridged__Group_OrderPreview_getId(int _skirmishAIId, int groupId);

EXPORT(short) bridged__Group_OrderPreview_getOptions(int _skirmishAIId, int groupId);

EXPORT(int) bridged__Group_OrderPreview_getTag(int _skirmishAIId, int groupId);

EXPORT(int) bridged__Group_OrderPreview_getTimeOut(int _skirmishAIId, int groupId);

EXPORT(int) bridged__Group_OrderPreview_getParams(int _skirmishAIId, int groupId, float* params, int params_sizeMax); // ARRAY:params

EXPORT(bool) bridged__Group_isSelected(int _skirmishAIId, int groupId);

/**
 * Returns the mod archive file name.
 * CAUTION:
 * Never use this as reference in eg. cache- or config-file names,
 * as one and the same mod can be packaged in different ways.
 * Use the human name instead.
 * @see getHumanName()
 * @deprecated
 */
EXPORT(const char*) bridged__Mod_getFileName(int _skirmishAIId);

/**
 * Returns the archive hash of the mod.
 * Use this for reference to the mod, eg. in a cache-file, wherever human
 * readability does not matter.
 * This value will never be the same for two mods not having equal content.
 * Tip: convert to 64 Hex chars for use in file names.
 * @see getHumanName()
 */
EXPORT(int) bridged__Mod_getHash(int _skirmishAIId);

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
EXPORT(const char*) bridged__Mod_getHumanName(int _skirmishAIId);

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
EXPORT(const char*) bridged__Mod_getShortName(int _skirmishAIId);

EXPORT(const char*) bridged__Mod_getVersion(int _skirmishAIId);

EXPORT(const char*) bridged__Mod_getMutator(int _skirmishAIId);

EXPORT(const char*) bridged__Mod_getDescription(int _skirmishAIId);

EXPORT(bool) bridged__Mod_getAllowTeamColors(int _skirmishAIId);

/**
 * Should constructions without builders decay?
 */
EXPORT(bool) bridged__Mod_getConstructionDecay(int _skirmishAIId);

/**
 * How long until they start decaying?
 */
EXPORT(int) bridged__Mod_getConstructionDecayTime(int _skirmishAIId);

/**
 * How fast do they decay?
 */
EXPORT(float) bridged__Mod_getConstructionDecaySpeed(int _skirmishAIId);

/**
 * 0 = 1 reclaimer per feature max, otherwise unlimited
 */
EXPORT(int) bridged__Mod_getMultiReclaim(int _skirmishAIId);

/**
 * 0 = gradual reclaim, 1 = all reclaimed at end, otherwise reclaim in reclaimMethod chunks
 */
EXPORT(int) bridged__Mod_getReclaimMethod(int _skirmishAIId);

/**
 * 0 = Revert to wireframe, gradual reclaim, 1 = Subtract HP, give full metal at end, default 1
 */
EXPORT(int) bridged__Mod_getReclaimUnitMethod(int _skirmishAIId);

/**
 * How much energy should reclaiming a unit cost, default 0.0
 */
EXPORT(float) bridged__Mod_getReclaimUnitEnergyCostFactor(int _skirmishAIId);

/**
 * How much metal should reclaim return, default 1.0
 */
EXPORT(float) bridged__Mod_getReclaimUnitEfficiency(int _skirmishAIId);

/**
 * How much should energy should reclaiming a feature cost, default 0.0
 */
EXPORT(float) bridged__Mod_getReclaimFeatureEnergyCostFactor(int _skirmishAIId);

/**
 * Allow reclaiming enemies? default true
 */
EXPORT(bool) bridged__Mod_getReclaimAllowEnemies(int _skirmishAIId);

/**
 * Allow reclaiming allies? default true
 */
EXPORT(bool) bridged__Mod_getReclaimAllowAllies(int _skirmishAIId);

/**
 * How much should energy should repair cost, default 0.0
 */
EXPORT(float) bridged__Mod_getRepairEnergyCostFactor(int _skirmishAIId);

/**
 * How much should energy should resurrect cost, default 0.5
 */
EXPORT(float) bridged__Mod_getResurrectEnergyCostFactor(int _skirmishAIId);

/**
 * How much should energy should capture cost, default 0.0
 */
EXPORT(float) bridged__Mod_getCaptureEnergyCostFactor(int _skirmishAIId);

/**
 * 0 = all ground units cannot be transported,
 * 1 = all ground units can be transported
 * (mass and size restrictions still apply).
 * Defaults to 1.
 */
EXPORT(int) bridged__Mod_getTransportGround(int _skirmishAIId);

/**
 * 0 = all hover units cannot be transported,
 * 1 = all hover units can be transported
 * (mass and size restrictions still apply).
 * Defaults to 0.
 */
EXPORT(int) bridged__Mod_getTransportHover(int _skirmishAIId);

/**
 * 0 = all naval units cannot be transported,
 * 1 = all naval units can be transported
 * (mass and size restrictions still apply).
 * Defaults to 0.
 */
EXPORT(int) bridged__Mod_getTransportShip(int _skirmishAIId);

/**
 * 0 = all air units cannot be transported,
 * 1 = all air units can be transported
 * (mass and size restrictions still apply).
 * Defaults to 0.
 */
EXPORT(int) bridged__Mod_getTransportAir(int _skirmishAIId);

/**
 * 1 = units fire at enemies running Killed() script, 0 = units ignore such enemies
 */
EXPORT(int) bridged__Mod_getFireAtKilled(int _skirmishAIId);

/**
 * 1 = units fire at crashing aircrafts, 0 = units ignore crashing aircrafts
 */
EXPORT(int) bridged__Mod_getFireAtCrashing(int _skirmishAIId);

/**
 * 0=no flanking bonus;  1=global coords, mobile;  2=unit coords, mobile;  3=unit coords, locked
 */
EXPORT(int) bridged__Mod_getFlankingBonusModeDefault(int _skirmishAIId);

/**
 * miplevel for los
 */
EXPORT(int) bridged__Mod_getLosMipLevel(int _skirmishAIId);

/**
 * miplevel to use for airlos
 */
EXPORT(int) bridged__Mod_getAirMipLevel(int _skirmishAIId);

/**
 * units sightdistance will be multiplied with this, for testing purposes
 */
EXPORT(float) bridged__Mod_getLosMul(int _skirmishAIId);

/**
 * units airsightdistance will be multiplied with this, for testing purposes
 */
EXPORT(float) bridged__Mod_getAirLosMul(int _skirmishAIId);

/**
 * when underwater, units are not in LOS unless also in sonar
 */
EXPORT(bool) bridged__Mod_getRequireSonarUnderWater(int _skirmishAIId);

EXPORT(int) bridged__Map_getChecksum(int _skirmishAIId);

EXPORT(void) bridged__Map_getStartPos(int _skirmishAIId, float* return_posF3_out);

EXPORT(void) bridged__Map_getMousePos(int _skirmishAIId, float* return_posF3_out);

EXPORT(bool) bridged__Map_isPosInCamera(int _skirmishAIId, float* pos_posF3, float radius);

/**
 * Returns the maps center heightmap width.
 * @see getHeightMap()
 */
EXPORT(int) bridged__Map_getWidth(int _skirmishAIId);

/**
 * Returns the maps center heightmap height.
 * @see getHeightMap()
 */
EXPORT(int) bridged__Map_getHeight(int _skirmishAIId);

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
EXPORT(int) bridged__Map_getHeightMap(int _skirmishAIId, float* heights, int heights_sizeMax); // ARRAY:heights

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
EXPORT(int) bridged__Map_getCornersHeightMap(int _skirmishAIId, float* cornerHeights, int cornerHeights_sizeMax); // ARRAY:cornerHeights

EXPORT(float) bridged__Map_getMinHeight(int _skirmishAIId);

EXPORT(float) bridged__Map_getMaxHeight(int _skirmishAIId);

/**
 * @brief the slope map
 * The values are 1 minus the y-component of the (average) facenormal of the square.
 * 
 * - do NOT modify or delete the height-map (native code relevant only)
 * - index 0 is top left
 * - each data position is 2*2 in size
 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
 */
EXPORT(int) bridged__Map_getSlopeMap(int _skirmishAIId, float* slopes, int slopes_sizeMax); // ARRAY:slopes

/**
 * @brief the level of sight map
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
EXPORT(int) bridged__Map_getLosMap(int _skirmishAIId, int* losValues, int losValues_sizeMax); // ARRAY:losValues

/**
 * @brief the radar map
 * A square with value 0 means you do not have radar coverage on it.
 * 
 * - do NOT modify or delete the height-map (native code relevant only)
 * - index 0 is top left
 * - each data position is 8*8 in size
 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
 */
EXPORT(int) bridged__Map_getRadarMap(int _skirmishAIId, int* radarValues, int radarValues_sizeMax); // ARRAY:radarValues

/**
 * @brief the radar jammer map
 * A square with value 0 means you do not have radar jamming coverage.
 * 
 * - do NOT modify or delete the height-map (native code relevant only)
 * - index 0 is top left
 * - each data position is 8*8 in size
 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 8)
 * - the last value, bottom right, is at index (width/8 * height/8 - 1)
 */
EXPORT(int) bridged__Map_getJammerMap(int _skirmishAIId, int* jammerValues, int jammerValues_sizeMax); // ARRAY:jammerValues

/**
 * @brief resource maps
 * This map shows the resource density on the map.
 * 
 * - do NOT modify or delete the height-map (native code relevant only)
 * - index 0 is top left
 * - each data position is 2*2 in size
 * - the value for the full resolution position (x, z) is at index ((z * width + x) / 2)
 * - the last value, bottom right, is at index (width/2 * height/2 - 1)
 */
EXPORT(int) bridged__Map_getResourceMapRaw(int _skirmishAIId, int resourceId, short* resources, int resources_sizeMax); // REF:resourceId->Resource ARRAY:resources

/**
 * Returns positions indicating where to place resource extractors on the map.
 * Only the x and z values give the location of the spots, while the y values
 * represents the actual amount of resource an extractor placed there can make.
 * You should only compare the y values to each other, and not try to estimate
 * effective output from spots.
 */
EXPORT(int) bridged__Map_getResourceMapSpotsPositions(int _skirmishAIId, int resourceId, float* spots_AposF3, int spots_AposF3_sizeMax); // REF:resourceId->Resource ARRAY:spots_AposF3

/**
 * Returns the average resource income for an extractor on one of the evaluated positions.
 */
EXPORT(float) bridged__Map_getResourceMapSpotsAverageIncome(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

/**
 * Returns the nearest resource extractor spot to a specified position out of the evaluated list.
 */
EXPORT(void) bridged__Map_getResourceMapSpotsNearest(int _skirmishAIId, int resourceId, float* pos_posF3, float* return_posF3_out); // REF:resourceId->Resource

/**
 * Returns the archive hash of the map.
 * Use this for reference to the map, eg. in a cache-file, wherever human
 * readability does not matter.
 * This value will never be the same for two maps not having equal content.
 * Tip: convert to 64 Hex chars for use in file names.
 * @see getName()
 */
EXPORT(int) bridged__Map_getHash(int _skirmishAIId);

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
EXPORT(const char*) bridged__Map_getName(int _skirmishAIId);

/**
 * Returns the human readbale name of the map.
 * @see getName()
 */
EXPORT(const char*) bridged__Map_getHumanName(int _skirmishAIId);

/**
 * Gets the elevation of the map at position (x, z)
 */
EXPORT(float) bridged__Map_getElevationAt(int _skirmishAIId, float x, float z);

/**
 * Returns what value 255 in the resource map is worth
 */
EXPORT(float) bridged__Map_getMaxResource(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

/**
 * Returns extraction radius for resource extractors
 */
EXPORT(float) bridged__Map_getExtractorRadius(int _skirmishAIId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__Map_getMinWind(int _skirmishAIId);

EXPORT(float) bridged__Map_getMaxWind(int _skirmishAIId);

EXPORT(float) bridged__Map_getCurWind(int _skirmishAIId);

EXPORT(float) bridged__Map_getTidalStrength(int _skirmishAIId);

EXPORT(float) bridged__Map_getGravity(int _skirmishAIId);

/**
 * Returns all points drawn with this AIs team color,
 * and additionally the ones drawn with allied team colors,
 * if <code>includeAllies</code> is true.
 */
EXPORT(int) bridged__Map_getPoints(int _skirmishAIId, bool includeAllies); // FETCHER:MULTI:NUM:Point

EXPORT(void) bridged__Map_Point_getPosition(int _skirmishAIId, int pointId, float* return_posF3_out);

EXPORT(void) bridged__Map_Point_getColor(int _skirmishAIId, int pointId, short* return_colorS3_out);

EXPORT(const char*) bridged__Map_Point_getLabel(int _skirmishAIId, int pointId);

/**
 * Returns all lines drawn with this AIs team color,
 * and additionally the ones drawn with allied team colors,
 * if <code>includeAllies</code> is true.
 */
EXPORT(int) bridged__Map_getLines(int _skirmishAIId, bool includeAllies); // FETCHER:MULTI:NUM:Line

EXPORT(void) bridged__Map_Line_getFirstPosition(int _skirmishAIId, int lineId, float* return_posF3_out);

EXPORT(void) bridged__Map_Line_getSecondPosition(int _skirmishAIId, int lineId, float* return_posF3_out);

EXPORT(void) bridged__Map_Line_getColor(int _skirmishAIId, int lineId, short* return_colorS3_out);

EXPORT(bool) bridged__Map_isPossibleToBuildAt(int _skirmishAIId, int unitDefId, float* pos_posF3, int facing); // REF:unitDefId->UnitDef

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
EXPORT(void) bridged__Map_findClosestBuildSite(int _skirmishAIId, int unitDefId, float* pos_posF3, float searchRadius, int minDist, int facing, float* return_posF3_out); // REF:unitDefId->UnitDef

EXPORT(int) bridged__getFeatureDefs(int _skirmishAIId, int* featureDefIds, int featureDefIds_sizeMax); // FETCHER:MULTI:IDs:FeatureDef:featureDefIds

EXPORT(const char*) bridged__FeatureDef_getName(int _skirmishAIId, int featureDefId);

EXPORT(const char*) bridged__FeatureDef_getDescription(int _skirmishAIId, int featureDefId);

EXPORT(const char*) bridged__FeatureDef_getFileName(int _skirmishAIId, int featureDefId);

EXPORT(float) bridged__FeatureDef_getContainedResource(int _skirmishAIId, int featureDefId, int resourceId); // REF:resourceId->Resource

EXPORT(float) bridged__FeatureDef_getMaxHealth(int _skirmishAIId, int featureDefId);

EXPORT(float) bridged__FeatureDef_getReclaimTime(int _skirmishAIId, int featureDefId);

/**
 * Used to see if the object can be overrun by units of a certain heavyness
 */
EXPORT(float) bridged__FeatureDef_getMass(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isUpright(int _skirmishAIId, int featureDefId);

EXPORT(int) bridged__FeatureDef_getDrawType(int _skirmishAIId, int featureDefId);

EXPORT(const char*) bridged__FeatureDef_getModelName(int _skirmishAIId, int featureDefId);

/**
 * Used to determine whether the feature is resurrectable.
 * 
 * @return  -1: (default) only if it is the 1st wreckage of
 *              the UnitDef it originates from
 *           0: no, never
 *           1: yes, always
 */
EXPORT(int) bridged__FeatureDef_getResurrectable(int _skirmishAIId, int featureDefId);

EXPORT(int) bridged__FeatureDef_getSmokeTime(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isDestructable(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isReclaimable(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isBlocking(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isBurnable(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isFloating(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isNoSelect(int _skirmishAIId, int featureDefId);

EXPORT(bool) bridged__FeatureDef_isGeoThermal(int _skirmishAIId, int featureDefId);

/**
 * Name of the FeatureDef that this turns into when killed (not reclaimed).
 */
EXPORT(const char*) bridged__FeatureDef_getDeathFeature(int _skirmishAIId, int featureDefId);

/**
 * Size of the feature along the X axis - in other words: height.
 * each size is 8 units
 */
EXPORT(int) bridged__FeatureDef_getXSize(int _skirmishAIId, int featureDefId);

/**
 * Size of the feature along the Z axis - in other words: width.
 * each size is 8 units
 */
EXPORT(int) bridged__FeatureDef_getZSize(int _skirmishAIId, int featureDefId);

EXPORT(int) bridged__FeatureDef_getCustomParams(int _skirmishAIId, int featureDefId, const char** keys, const char** values); // MAP

/**
 * Returns all features currently in LOS, or all features on the map
 * if cheating is enabled.
 */
EXPORT(int) bridged__getFeatures(int _skirmishAIId, int* featureIds, int featureIds_sizeMax); // REF:MULTI:featureIds->Feature

/**
 * Returns all features in a specified area that are currently in LOS,
 * or all features in this area if cheating is enabled.
 */
EXPORT(int) bridged__getFeaturesIn(int _skirmishAIId, float* pos_posF3, float radius, int* featureIds, int featureIds_sizeMax); // REF:MULTI:featureIds->Feature

EXPORT(int) bridged__Feature_getDef(int _skirmishAIId, int featureId); // REF:RETURN->FeatureDef

EXPORT(float) bridged__Feature_getHealth(int _skirmishAIId, int featureId);

EXPORT(float) bridged__Feature_getReclaimLeft(int _skirmishAIId, int featureId);

EXPORT(void) bridged__Feature_getPosition(int _skirmishAIId, int featureId, float* return_posF3_out);

EXPORT(int) bridged__getWeaponDefs(int _skirmishAIId); // FETCHER:MULTI:NUM:WeaponDef

EXPORT(int) bridged__getWeaponDefByName(int _skirmishAIId, const char* weaponDefName); // REF:RETURN->WeaponDef

EXPORT(const char*) bridged__WeaponDef_getName(int _skirmishAIId, int weaponDefId);

EXPORT(const char*) bridged__WeaponDef_getType(int _skirmishAIId, int weaponDefId);

EXPORT(const char*) bridged__WeaponDef_getDescription(int _skirmishAIId, int weaponDefId);

EXPORT(const char*) bridged__WeaponDef_getFileName(int _skirmishAIId, int weaponDefId);

EXPORT(const char*) bridged__WeaponDef_getCegTag(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getRange(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getHeightMod(int _skirmishAIId, int weaponDefId);

/**
 * Inaccuracy of whole burst
 */
EXPORT(float) bridged__WeaponDef_getAccuracy(int _skirmishAIId, int weaponDefId);

/**
 * Inaccuracy of individual shots inside burst
 */
EXPORT(float) bridged__WeaponDef_getSprayAngle(int _skirmishAIId, int weaponDefId);

/**
 * Inaccuracy while owner moving
 */
EXPORT(float) bridged__WeaponDef_getMovingAccuracy(int _skirmishAIId, int weaponDefId);

/**
 * Fraction of targets move speed that is used as error offset
 */
EXPORT(float) bridged__WeaponDef_getTargetMoveError(int _skirmishAIId, int weaponDefId);

/**
 * Maximum distance the weapon will lead the target
 */
EXPORT(float) bridged__WeaponDef_getLeadLimit(int _skirmishAIId, int weaponDefId);

/**
 * Factor for increasing the leadLimit with experience
 */
EXPORT(float) bridged__WeaponDef_getLeadBonus(int _skirmishAIId, int weaponDefId);

/**
 * Replaces hardcoded behaviour for burnblow cannons
 */
EXPORT(float) bridged__WeaponDef_getPredictBoost(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getNumDamageTypes(int _skirmishAIId); // STATIC

EXPORT(int) bridged__WeaponDef_Damage_getParalyzeDamageTime(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_Damage_getImpulseFactor(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_Damage_getImpulseBoost(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_Damage_getCraterMult(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_Damage_getCraterBoost(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_Damage_getTypes(int _skirmishAIId, int weaponDefId, float* types, int types_sizeMax); // ARRAY:types

EXPORT(float) bridged__WeaponDef_getAreaOfEffect(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isNoSelfDamage(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getFireStarter(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getEdgeEffectiveness(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getSize(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getSizeGrowth(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getCollisionSize(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getSalvoSize(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getSalvoDelay(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getReload(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getBeamTime(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isBeamBurst(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isWaterBounce(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isGroundBounce(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getBounceRebound(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getBounceSlip(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getNumBounce(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getMaxAngle(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getUpTime(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getFlightTime(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getCost(int _skirmishAIId, int weaponDefId, int resourceId); // REF:resourceId->Resource

EXPORT(int) bridged__WeaponDef_getProjectilesPerShot(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isTurret(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isOnlyForward(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isFixedLauncher(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isWaterWeapon(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isFireSubmersed(int _skirmishAIId, int weaponDefId);

/**
 * Lets a torpedo travel above water like it does below water
 */
EXPORT(bool) bridged__WeaponDef_isSubMissile(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isTracks(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isDropped(int _skirmishAIId, int weaponDefId);

/**
 * The weapon will only paralyze, not do real damage.
 */
EXPORT(bool) bridged__WeaponDef_isParalyzer(int _skirmishAIId, int weaponDefId);

/**
 * The weapon damages by impacting, not by exploding.
 */
EXPORT(bool) bridged__WeaponDef_isImpactOnly(int _skirmishAIId, int weaponDefId);

/**
 * Can not target anything (for example: anti-nuke, D-Gun)
 */
EXPORT(bool) bridged__WeaponDef_isNoAutoTarget(int _skirmishAIId, int weaponDefId);

/**
 * Has to be fired manually (by the player or an AI, example: D-Gun)
 */
EXPORT(bool) bridged__WeaponDef_isManualFire(int _skirmishAIId, int weaponDefId);

/**
 * Can intercept targetable weapons shots.
 * 
 * example: anti-nuke
 * 
 * @see  getTargetable()
 */
EXPORT(int) bridged__WeaponDef_getInterceptor(int _skirmishAIId, int weaponDefId);

/**
 * Shoots interceptable projectiles.
 * Shots can be intercepted by interceptors.
 * 
 * example: nuke
 * 
 * @see  getInterceptor()
 */
EXPORT(int) bridged__WeaponDef_getTargetable(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isStockpileable(int _skirmishAIId, int weaponDefId);

/**
 * Range of interceptors.
 * 
 * example: anti-nuke
 * 
 * @see  getInterceptor()
 */
EXPORT(float) bridged__WeaponDef_getCoverageRange(int _skirmishAIId, int weaponDefId);

/**
 * Build time of a missile
 */
EXPORT(float) bridged__WeaponDef_getStockpileTime(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getIntensity(int _skirmishAIId, int weaponDefId);

/**
 * @deprecated only relevant for visualization
 */
EXPORT(float) bridged__WeaponDef_getThickness(int _skirmishAIId, int weaponDefId);

/**
 * @deprecated only relevant for visualization
 */
EXPORT(float) bridged__WeaponDef_getLaserFlareSize(int _skirmishAIId, int weaponDefId);

/**
 * @deprecated only relevant for visualization
 */
EXPORT(float) bridged__WeaponDef_getCoreThickness(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getDuration(int _skirmishAIId, int weaponDefId);

/**
 * @deprecated only relevant for visualization
 */
EXPORT(int) bridged__WeaponDef_getLodDistance(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getFalloffRate(int _skirmishAIId, int weaponDefId);

/**
 * @deprecated only relevant for visualization
 */
EXPORT(int) bridged__WeaponDef_getGraphicsType(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isSoundTrigger(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isSelfExplode(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isGravityAffected(int _skirmishAIId, int weaponDefId);

/**
 * Per weapon high trajectory setting.
 * UnitDef also has this property.
 * 
 * @return  0: low
 *          1: high
 *          2: unit
 */
EXPORT(int) bridged__WeaponDef_getHighTrajectory(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getMyGravity(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isNoExplode(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getStartVelocity(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getWeaponAcceleration(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getTurnRate(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getMaxVelocity(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getProjectileSpeed(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getExplosionSpeed(int _skirmishAIId, int weaponDefId);

/**
 * Returns the bit field value denoting the categories this weapon should
 * target, excluding all others.
 * @see Game#getCategoryFlag
 * @see Game#getCategoryName
 */
EXPORT(int) bridged__WeaponDef_getOnlyTargetCategory(int _skirmishAIId, int weaponDefId);

/**
 * How much the missile will wobble around its course.
 */
EXPORT(float) bridged__WeaponDef_getWobble(int _skirmishAIId, int weaponDefId);

/**
 * How much the missile will dance.
 */
EXPORT(float) bridged__WeaponDef_getDance(int _skirmishAIId, int weaponDefId);

/**
 * How high trajectory missiles will try to fly in.
 */
EXPORT(float) bridged__WeaponDef_getTrajectoryHeight(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isLargeBeamLaser(int _skirmishAIId, int weaponDefId);

/**
 * If the weapon is a shield rather than a weapon.
 */
EXPORT(bool) bridged__WeaponDef_isShield(int _skirmishAIId, int weaponDefId);

/**
 * If the weapon should be repulsed or absorbed.
 */
EXPORT(bool) bridged__WeaponDef_isShieldRepulser(int _skirmishAIId, int weaponDefId);

/**
 * If the shield only affects enemy projectiles.
 */
EXPORT(bool) bridged__WeaponDef_isSmartShield(int _skirmishAIId, int weaponDefId);

/**
 * If the shield only affects stuff coming from outside shield radius.
 */
EXPORT(bool) bridged__WeaponDef_isExteriorShield(int _skirmishAIId, int weaponDefId);

/**
 * If the shield should be graphically shown.
 */
EXPORT(bool) bridged__WeaponDef_isVisibleShield(int _skirmishAIId, int weaponDefId);

/**
 * If a small graphic should be shown at each repulse.
 */
EXPORT(bool) bridged__WeaponDef_isVisibleShieldRepulse(int _skirmishAIId, int weaponDefId);

/**
 * The number of frames to draw the shield after it has been hit.
 */
EXPORT(int) bridged__WeaponDef_getVisibleShieldHitFrames(int _skirmishAIId, int weaponDefId);

/**
 * Amount of the resource used per shot or per second,
 * depending on the type of projectile.
 */
EXPORT(float) bridged__WeaponDef_Shield_getResourceUse(int _skirmishAIId, int weaponDefId, int resourceId); // REF:resourceId->Resource

/**
 * Size of shield covered area
 */
EXPORT(float) bridged__WeaponDef_Shield_getRadius(int _skirmishAIId, int weaponDefId);

/**
 * Shield acceleration on plasma stuff.
 * How much will plasma be accelerated into the other direction
 * when it hits the shield.
 */
EXPORT(float) bridged__WeaponDef_Shield_getForce(int _skirmishAIId, int weaponDefId);

/**
 * Maximum speed to which the shield can repulse plasma.
 */
EXPORT(float) bridged__WeaponDef_Shield_getMaxSpeed(int _skirmishAIId, int weaponDefId);

/**
 * Amount of damage the shield can reflect. (0=infinite)
 */
EXPORT(float) bridged__WeaponDef_Shield_getPower(int _skirmishAIId, int weaponDefId);

/**
 * Amount of power that is regenerated per second.
 */
EXPORT(float) bridged__WeaponDef_Shield_getPowerRegen(int _skirmishAIId, int weaponDefId);

/**
 * How much of a given resource is needed to regenerate power
 * with max speed per second.
 */
EXPORT(float) bridged__WeaponDef_Shield_getPowerRegenResource(int _skirmishAIId, int weaponDefId, int resourceId); // REF:resourceId->Resource

/**
 * How much power the shield has when it is created.
 */
EXPORT(float) bridged__WeaponDef_Shield_getStartingPower(int _skirmishAIId, int weaponDefId);

/**
 * Number of frames to delay recharging by after each hit.
 */
EXPORT(int) bridged__WeaponDef_Shield_getRechargeDelay(int _skirmishAIId, int weaponDefId);

/**
 * The color of the shield when it is at full power.
 */
EXPORT(void) bridged__WeaponDef_Shield_getGoodColor(int _skirmishAIId, int weaponDefId, short* return_colorS3_out);

/**
 * The color of the shield when it is empty.
 */
EXPORT(void) bridged__WeaponDef_Shield_getBadColor(int _skirmishAIId, int weaponDefId, short* return_colorS3_out);

/**
 * The shields alpha value.
 */
EXPORT(short) bridged__WeaponDef_Shield_getAlpha(int _skirmishAIId, int weaponDefId);

/**
 * The type of the shield (bitfield).
 * Defines what weapons can be intercepted by the shield.
 * 
 * @see  getInterceptedByShieldType()
 */
EXPORT(int) bridged__WeaponDef_Shield_getInterceptType(int _skirmishAIId, int weaponDefId);

/**
 * The type of shields that can intercept this weapon (bitfield).
 * The weapon can be affected by shields if:
 * (shield.getInterceptType() & weapon.getInterceptedByShieldType()) != 0
 * 
 * @see  getInterceptType()
 */
EXPORT(int) bridged__WeaponDef_getInterceptedByShieldType(int _skirmishAIId, int weaponDefId);

/**
 * Tries to avoid friendly units while aiming?
 */
EXPORT(bool) bridged__WeaponDef_isAvoidFriendly(int _skirmishAIId, int weaponDefId);

/**
 * Tries to avoid features while aiming?
 */
EXPORT(bool) bridged__WeaponDef_isAvoidFeature(int _skirmishAIId, int weaponDefId);

/**
 * Tries to avoid neutral units while aiming?
 */
EXPORT(bool) bridged__WeaponDef_isAvoidNeutral(int _skirmishAIId, int weaponDefId);

/**
 * If nonzero, targetting units will TryTarget at the edge of collision sphere
 * (radius*tag value, [-1;1]) instead of its centre.
 */
EXPORT(float) bridged__WeaponDef_getTargetBorder(int _skirmishAIId, int weaponDefId);

/**
 * If greater than 0, the range will be checked in a cylinder
 * (height=range*cylinderTargetting) instead of a sphere.
 */
EXPORT(float) bridged__WeaponDef_getCylinderTargetting(int _skirmishAIId, int weaponDefId);

/**
 * For beam-lasers only - always hit with some minimum intensity
 * (a damage coeffcient normally dependent on distance).
 * Do not confuse this with the intensity tag, it i completely unrelated.
 */
EXPORT(float) bridged__WeaponDef_getMinIntensity(int _skirmishAIId, int weaponDefId);

/**
 * Controls cannon range height boost.
 * 
 * default: -1: automatically calculate a more or less sane value
 */
EXPORT(float) bridged__WeaponDef_getHeightBoostFactor(int _skirmishAIId, int weaponDefId);

/**
 * Multiplier for the distance to the target for priority calculations.
 */
EXPORT(float) bridged__WeaponDef_getProximityPriority(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getCollisionFlags(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isSweepFire(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isAbleToAttackGround(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getCameraShake(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getDynDamageExp(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getDynDamageMin(int _skirmishAIId, int weaponDefId);

EXPORT(float) bridged__WeaponDef_getDynDamageRange(int _skirmishAIId, int weaponDefId);

EXPORT(bool) bridged__WeaponDef_isDynDamageInverted(int _skirmishAIId, int weaponDefId);

EXPORT(int) bridged__WeaponDef_getCustomParams(int _skirmishAIId, int weaponDefId, const char** keys, const char** values); // MAP

EXPORT(bool) bridged__Debug_GraphDrawer_isEnabled(int _skirmishAIId);


// END: COMMAND_WRAPPERS

/**
 * Allows one to give an income (dis-)advantage to the team
 * controlled by the Skirmish AI.
 * This value can also be set through the GameSetup script,
 * with the difference that it causes an instant desync when set here.
 * @param factor  default: 1.0; common: [0.0, 2.0]; valid: [0.0, FLOAT_MAX]
 */
EXPORT(int) bridged__Cheats_setMyIncomeMultiplier(int _skirmishAIId, float factor); // error-return:0=OK

/**
 * The AI team receives the specified amount of units of the specified resource.
 */
EXPORT(int) bridged__Cheats_giveMeResource(int _skirmishAIId, int resourceId, float amount); // REF:resourceId->Resource error-return:0=OK

/**
 * Creates a new unit with the selected name at pos,
 * and returns its unit ID in ret_newUnitId.
 */
EXPORT(int) bridged__Cheats_giveMeUnit(int _skirmishAIId, int unitDefId, float* pos_posF3); // REF:unitDefId->UnitDef REF:RETURN->Unit

/**
 * @brief Sends a chat/text message to other players.
 * This text will also end up in infolog.txt.
 */
EXPORT(int) bridged__Game_sendTextMessage(int _skirmishAIId, const char* text, int zone); // error-return:0=OK

/**
 * Assigns a map location to the last text message sent by the AI.
 */
EXPORT(int) bridged__Game_setLastMessagePosition(int _skirmishAIId, float* pos_posF3); // error-return:0=OK

/**
 * Give \<amount\> units of resource \<resourceId\> to team \<receivingTeam\>.
 * - the amount is capped to the AI team's resource levels
 * - does not check for alliance with \<receivingTeam\>
 * - LuaRules might not allow resource transfers, AI's must verify the deduction
 */
EXPORT(bool) bridged__Economy_sendResource(int _skirmishAIId, int resourceId, float amount, int receivingTeamId); // REF:resourceId->Resource REF:receivingTeamId->Team

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
EXPORT(int) bridged__Economy_sendUnits(int _skirmishAIId, int* unitIds, int unitIds_size, int receivingTeamId); // REF:MULTI:unitIds->Unit REF:receivingTeamId->Team

/**
 * Creates a group and returns the id it was given, returns -1 on failure
 */
EXPORT(int) bridged__Group_create(int _skirmishAIId); // REF:RETURN->Group STATIC

/**
 * Erases a specified group
 */
EXPORT(int) bridged__Group_erase(int _skirmishAIId, int groupId); // REF:groupId->Group error-return:0=OK

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
EXPORT(int) bridged__Pathing_initPath(int _skirmishAIId, float* start_posF3, float* end_posF3, int pathType, float goalRadius); // REF:RETURN->Path

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
EXPORT(int) bridged__Pathing_getApproximateLength(int _skirmishAIId, float* start_posF3, float* end_posF3, int pathType, float goalRadius);

EXPORT(int) bridged__Pathing_getNextWaypoint(int _skirmishAIId, int pathId, float* ret_nextWaypoint_posF3_out); // REF:pathId->Path error-return:0=OK

EXPORT(int) bridged__Pathing_freePath(int _skirmishAIId, int pathId); // REF:pathId->Path error-return:0=OK

/**
 * @param inData  Can be set to NULL to skip passing in a string
 * @param inSize  If this is less than 0, the data size is calculated using strlen()
 * @param ret_outData  this is subject to Lua garbage collection, copy it if you wish to continue using it
 */
EXPORT(int) bridged__Lua_callRules(int _skirmishAIId, const char* inData, int inSize, const char* ret_outData); // error-return:0=OK

/**
 * @param inData  Can be set to NULL to skip passing in a string
 * @param inSize  If this is less than 0, the data size is calculated using strlen()
 * @param ret_outData  this is subject to Lua garbage collection, copy it if you wish to continue using it
 */
EXPORT(int) bridged__Lua_callUI(int _skirmishAIId, const char* inData, int inSize, const char* ret_outData); // error-return:0=OK

/**
 * @param pos_posF3  on this position, only x and z matter
 */
EXPORT(int) bridged__Game_sendStartPosition(int _skirmishAIId, bool ready, float* pos_posF3); // error-return:0=OK

/**
 * @param pos_posF3  on this position, only x and z matter
 */
EXPORT(int) bridged__Map_Drawer_addNotification(int _skirmishAIId, float* pos_posF3, short* color_colorS3, short alpha); // error-return:0=OK

/**
 * @param pos_posF3  on this position, only x and z matter
 * @param label  create this text on pos in my team color
 */
EXPORT(int) bridged__Map_Drawer_addPoint(int _skirmishAIId, float* pos_posF3, const char* label); // error-return:0=OK

/**
 * @param pos_posF3  remove map points and lines near this point (100 distance)
 */
EXPORT(int) bridged__Map_Drawer_deletePointsAndLines(int _skirmishAIId, float* pos_posF3); // error-return:0=OK

/**
 * @param posFrom_posF3  draw line from this pos
 * @param posTo_posF3  to this pos, again only x and z matter
 */
EXPORT(int) bridged__Map_Drawer_addLine(int _skirmishAIId, float* posFrom_posF3, float* posTo_posF3); // error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_start(int _skirmishAIId, float* pos_posF3, short* color_colorS3, short alpha); // error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_finish(int _skirmishAIId, bool iAmUseless); // error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawLine(int _skirmishAIId, float* endPos_posF3, short* color_colorS3, short alpha); // error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawLineAndCommandIcon(int _skirmishAIId, int cmdId, float* endPos_posF3, short* color_colorS3, short alpha); // REF:cmdId->Command error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawIcon(int _skirmishAIId, int cmdId); // REF:cmdId->Command error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_suspend(int _skirmishAIId, float* endPos_posF3, short* color_colorS3, short alpha); // error-return:0=OK

EXPORT(int) bridged__Map_Drawer_PathDrawer_restart(int _skirmishAIId, bool sameColor); // error-return:0=OK

/**
 * @brief Creates a cubic Bezier spline figure
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
EXPORT(int) bridged__Map_Drawer_Figure_drawSpline(int _skirmishAIId, float* pos1_posF3, float* pos2_posF3, float* pos3_posF3, float* pos4_posF3, float width, bool arrow, int lifeTime, int figureGroupId); // REF:figureGroupId->FigureGroup REF:RETURN->FigureGroup

/**
 * @brief Creates a straight line
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
EXPORT(int) bridged__Map_Drawer_Figure_drawLine(int _skirmishAIId, float* pos1_posF3, float* pos2_posF3, float width, bool arrow, int lifeTime, int figureGroupId); // REF:figureGroupId->FigureGroup REF:RETURN->FigureGroup

/**
 * Sets the color used to draw all lines of figures in a figure group.
 * @param color_colorS3  (x, y, z) -> (red, green, blue)
 */
EXPORT(int) bridged__Map_Drawer_Figure_setColor(int _skirmishAIId, int figureGroupId, short* color_colorS3, short alpha); // REF:figureGroupId->FigureGroup error-return:0=OK

/**
 * Removes a figure group, which means it will not be drawn anymore.
 */
EXPORT(int) bridged__Map_Drawer_Figure_remove(int _skirmishAIId, int figureGroupId); // REF:figureGroupId->FigureGroup error-return:0=OK

/**
 * This function allows you to draw units onto the map.
 * - they only show up on the local player's screen
 * - they will be drawn in the "standard pose" (as if before any COB scripts are run)
 * @param rotation  in radians
 * @param lifeTime  specifies how many frames a figure should live before being auto-removed; 0 means no removal
 * @param teamId  teamId affects the color of the unit
 */
EXPORT(int) bridged__Map_Drawer_drawUnit(int _skirmishAIId, int toDrawUnitDefId, float* pos_posF3, float rotation, int lifeTime, int teamId, bool transparent, bool drawBorder, int facing); // REF:toDrawUnitDefId->UnitDef error-return:0=OK

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
EXPORT(int) bridged__Unit_build(int _skirmishAIId, int unitId, int toBuildUnitDefId, float* buildPos_posF3, int facing, short options, int timeOut); // REF:toBuildUnitDefId->UnitDef error-return:0=OK

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
EXPORT(int) bridged__Group_build(int _skirmishAIId, int groupId, int toBuildUnitDefId, float* buildPos_posF3, int facing, short options, int timeOut); // REF:toBuildUnitDefId->UnitDef error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_stop(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_stop(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_wait(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_wait(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_waitFor(int _skirmishAIId, int unitId, int time, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_waitFor(int _skirmishAIId, int groupId, int time, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_waitForDeathOf(int _skirmishAIId, int unitId, int toDieUnitId, short options, int timeOut); // REF:toDieUnitId->Unit error-return:0=OK

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
EXPORT(int) bridged__Group_waitForDeathOf(int _skirmishAIId, int groupId, int toDieUnitId, short options, int timeOut); // REF:toDieUnitId->Unit error-return:0=OK

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
EXPORT(int) bridged__Unit_waitForSquadSize(int _skirmishAIId, int unitId, int numUnits, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_waitForSquadSize(int _skirmishAIId, int groupId, int numUnits, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_waitForAll(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_waitForAll(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_moveTo(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_moveTo(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_patrolTo(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_patrolTo(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_fight(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_fight(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_attack(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_attack(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_attackArea(int _skirmishAIId, int unitId, float* toAttackPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_attackArea(int _skirmishAIId, int groupId, float* toAttackPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_guard(int _skirmishAIId, int unitId, int toGuardUnitId, short options, int timeOut); // REF:toGuardUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_guard(int _skirmishAIId, int groupId, int toGuardUnitId, short options, int timeOut); // REF:toGuardUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_aiSelect(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_aiSelect(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_addToGroup(int _skirmishAIId, int unitId, int toGroupId, short options, int timeOut); // REF:toGroupId->Group error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_addToGroup(int _skirmishAIId, int groupId, int toGroupId, short options, int timeOut); // REF:toGroupId->Group error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_removeFromGroup(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_removeFromGroup(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_repair(int _skirmishAIId, int unitId, int toRepairUnitId, short options, int timeOut); // REF:toRepairUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_repair(int _skirmishAIId, int groupId, int toRepairUnitId, short options, int timeOut); // REF:toRepairUnitId->Unit error-return:0=OK

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
EXPORT(int) bridged__Unit_setFireState(int _skirmishAIId, int unitId, int fireState, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_setFireState(int _skirmishAIId, int groupId, int fireState, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_setMoveState(int _skirmishAIId, int unitId, int moveState, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_setMoveState(int _skirmishAIId, int groupId, int moveState, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_setBase(int _skirmishAIId, int unitId, float* basePos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_setBase(int _skirmishAIId, int groupId, float* basePos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_selfDestruct(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_selfDestruct(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_setWantedMaxSpeed(int _skirmishAIId, int unitId, float wantedMaxSpeed, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_setWantedMaxSpeed(int _skirmishAIId, int groupId, float wantedMaxSpeed, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 */
EXPORT(int) bridged__Unit_loadUnits(int _skirmishAIId, int unitId, int* toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut); // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 */
EXPORT(int) bridged__Group_loadUnits(int _skirmishAIId, int groupId, int* toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut); // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_loadUnitsInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_loadUnitsInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_loadOnto(int _skirmishAIId, int unitId, int transporterUnitId, short options, int timeOut); // REF:transporterUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_loadOnto(int _skirmishAIId, int groupId, int transporterUnitId, short options, int timeOut); // REF:transporterUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_unload(int _skirmishAIId, int unitId, float* toPos_posF3, int toUnloadUnitId, short options, int timeOut); // REF:toUnloadUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_unload(int _skirmishAIId, int groupId, float* toPos_posF3, int toUnloadUnitId, short options, int timeOut); // REF:toUnloadUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_unloadUnitsInArea(int _skirmishAIId, int unitId, float* toPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_unloadUnitsInArea(int _skirmishAIId, int groupId, float* toPos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_setOn(int _skirmishAIId, int unitId, bool on, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_setOn(int _skirmishAIId, int groupId, bool on, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_reclaimUnit(int _skirmishAIId, int unitId, int toReclaimUnitId, short options, int timeOut); // REF:toReclaimUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_reclaimUnit(int _skirmishAIId, int groupId, int toReclaimUnitId, short options, int timeOut); // REF:toReclaimUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_reclaimFeature(int _skirmishAIId, int unitId, int toReclaimFeatureId, short options, int timeOut); // REF:toReclaimFeatureId->Feature error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_reclaimFeature(int _skirmishAIId, int groupId, int toReclaimFeatureId, short options, int timeOut); // REF:toReclaimFeatureId->Feature error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_reclaimInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_reclaimInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_cloak(int _skirmishAIId, int unitId, bool cloak, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_cloak(int _skirmishAIId, int groupId, bool cloak, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_stockpile(int _skirmishAIId, int unitId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_stockpile(int _skirmishAIId, int groupId, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_dGun(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_dGun(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut); // REF:toAttackUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_dGunPosition(int _skirmishAIId, int unitId, float* pos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_dGunPosition(int _skirmishAIId, int groupId, float* pos_posF3, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_restoreArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_restoreArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_setRepeat(int _skirmishAIId, int unitId, bool repeat, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_setRepeat(int _skirmishAIId, int groupId, bool repeat, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_setTrajectory(int _skirmishAIId, int unitId, int trajectory, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_setTrajectory(int _skirmishAIId, int groupId, int trajectory, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_resurrect(int _skirmishAIId, int unitId, int toResurrectFeatureId, short options, int timeOut); // REF:toResurrectFeatureId->Feature error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_resurrect(int _skirmishAIId, int groupId, int toResurrectFeatureId, short options, int timeOut); // REF:toResurrectFeatureId->Feature error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_resurrectInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_resurrectInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_capture(int _skirmishAIId, int unitId, int toCaptureUnitId, short options, int timeOut); // REF:toCaptureUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_capture(int _skirmishAIId, int groupId, int toCaptureUnitId, short options, int timeOut); // REF:toCaptureUnitId->Unit error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_captureInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_captureInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_setAutoRepairLevel(int _skirmishAIId, int unitId, int autoRepairLevel, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_setAutoRepairLevel(int _skirmishAIId, int groupId, int autoRepairLevel, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Unit_setIdleMode(int _skirmishAIId, int unitId, int idleMode, short options, int timeOut); // error-return:0=OK

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
EXPORT(int) bridged__Group_setIdleMode(int _skirmishAIId, int groupId, int idleMode, short options, int timeOut); // error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Unit_executeCustomCommand(int _skirmishAIId, int unitId, int cmdId, float* params, int params_size, short options, int timeOut); // ARRAY:params error-return:0=OK

/**
 * @param options  see enum UnitCommandOptions
 * @param timeOut  At which frame the command will time-out and consequently be removed,
 *                 if execution of it has not yet begun.
 *                 Can only be set locally, is not sent over the network, and is used
 *                 for temporary orders.
 *                 default: MAX_INT (-> do not time-out)
 *                 example: currentFrame + 15
 */
EXPORT(int) bridged__Group_executeCustomCommand(int _skirmishAIId, int groupId, int cmdId, float* params, int params_size, short options, int timeOut); // ARRAY:params error-return:0=OK

EXPORT(int) bridged__Map_Drawer_traceRay(int _skirmishAIId, float* rayPos_posF3, float* rayDir_posF3, float rayLen, int srcUnitId, int flags); // REF:srcUnitId->Unit REF:RETURN->Unit

EXPORT(int) bridged__Map_Drawer_traceRayFeature(int _skirmishAIId, float* rayPos_posF3, float* rayDir_posF3, float rayLen, int srcUnitId, int flags); // REF:srcUnitId->Unit REF:RETURN->Feature

/**
 * Pause or unpauses the game.
 * This is meant for debugging purposes.
 * Keep in mind that pause does not happen immediately.
 * It can take 1-2 frames in single- and up to 10 frames in multiplayer matches.
 * @param reason  reason for the (un-)pause, or NULL
 */
EXPORT(int) bridged__Game_setPause(int _skirmishAIId, bool enable, const char* reason); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_setPosition(int _skirmishAIId, float x, float y); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_setSize(int _skirmishAIId, float w, float h); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_addPoint(int _skirmishAIId, int lineId, float x, float y); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_deletePoints(int _skirmishAIId, int lineId, int numPoints); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_setColor(int _skirmishAIId, int lineId, short* color_colorS3); // error-return:0=OK

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_setLabel(int _skirmishAIId, int lineId, const char* label); // error-return:0=OK

EXPORT(int) bridged__Debug_addOverlayTexture(int _skirmishAIId, const float* texData, int w, int h); // REF:ret_textureId->OverlayTexture

EXPORT(int) bridged__Debug_OverlayTexture_update(int _skirmishAIId, int overlayTextureId, const float* texData, int x, int y, int w, int h); // error-return:0=OK

EXPORT(int) bridged__Debug_OverlayTexture_remove(int _skirmishAIId, int overlayTextureId); // error-return:0=OK

EXPORT(int) bridged__Debug_OverlayTexture_setPosition(int _skirmishAIId, int overlayTextureId, float x, float y); // error-return:0=OK

EXPORT(int) bridged__Debug_OverlayTexture_setSize(int _skirmishAIId, int overlayTextureId, float w, float h); // error-return:0=OK

EXPORT(int) bridged__Debug_OverlayTexture_setLabel(int _skirmishAIId, int overlayTextureId, const char* label); // error-return:0=OK

// END: COMMAND_WRAPPERS

#ifdef __cplusplus
} // extern "C"
#endif

#endif // __CALLBACK_FUNCTION_POINTER_BRIDGE_H


/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#include "CallbackFunctionPointerBridge.h"

#include "ExternalAI/Interface/SSkirmishAICallback.h"
#include "ExternalAI/Interface/AISCommands.h"


#define id_clb_sizeMax 8192
static const struct SSkirmishAICallback* id_clb[id_clb_sizeMax];

void funcPntBrdg_addCallback(const size_t skirmishAIId, const struct SSkirmishAICallback* clb) {
	//assert(skirmishAIId < id_clb_sizeMax);
	id_clb[skirmishAIId] = clb;
}
void funcPntBrdg_removeCallback(const size_t skirmishAIId) {
	//assert(skirmishAIId < id_clb_sizeMax);
	id_clb[skirmishAIId] = NULL;
}

EXPORT(const char*) bridged__Engine_Version_getMajor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getMajor(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getMinor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getMinor(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getPatchset(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getPatchset(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getCommits(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getCommits(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getHash(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getHash(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getBranch(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getBranch(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getAdditional(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getAdditional(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getBuildTime(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getBuildTime(_skirmishAIId);
}
EXPORT(bool) bridged__Engine_Version_isRelease(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_isRelease(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getNormal(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getNormal(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getSync(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getSync(_skirmishAIId);
}
EXPORT(const char*) bridged__Engine_Version_getFull(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Engine_Version_getFull(_skirmishAIId);
}
EXPORT(int) bridged__Teams_getSize(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Teams_getSize(_skirmishAIId);
}
EXPORT(int) bridged__SkirmishAIs_getSize(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->SkirmishAIs_getSize(_skirmishAIId);
}
EXPORT(int) bridged__SkirmishAIs_getMax(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->SkirmishAIs_getMax(_skirmishAIId);
}
EXPORT(int) bridged__SkirmishAI_getTeamId(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->SkirmishAI_getTeamId(_skirmishAIId);
}
EXPORT(int) bridged__SkirmishAI_Info_getSize(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->SkirmishAI_Info_getSize(_skirmishAIId);
}
EXPORT(const char*) bridged__SkirmishAI_Info_getKey(int _skirmishAIId, int infoIndex) {

	return id_clb[_skirmishAIId]->SkirmishAI_Info_getKey(_skirmishAIId, infoIndex);
}
EXPORT(const char*) bridged__SkirmishAI_Info_getValue(int _skirmishAIId, int infoIndex) {

	return id_clb[_skirmishAIId]->SkirmishAI_Info_getValue(_skirmishAIId, infoIndex);
}
EXPORT(const char*) bridged__SkirmishAI_Info_getDescription(int _skirmishAIId, int infoIndex) {

	return id_clb[_skirmishAIId]->SkirmishAI_Info_getDescription(_skirmishAIId, infoIndex);
}
EXPORT(const char*) bridged__SkirmishAI_Info_getValueByKey(int _skirmishAIId, const char* const key) {

	return id_clb[_skirmishAIId]->SkirmishAI_Info_getValueByKey(_skirmishAIId, key);
}
EXPORT(int) bridged__SkirmishAI_OptionValues_getSize(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->SkirmishAI_OptionValues_getSize(_skirmishAIId);
}
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getKey(int _skirmishAIId, int optionIndex) {

	return id_clb[_skirmishAIId]->SkirmishAI_OptionValues_getKey(_skirmishAIId, optionIndex);
}
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getValue(int _skirmishAIId, int optionIndex) {

	return id_clb[_skirmishAIId]->SkirmishAI_OptionValues_getValue(_skirmishAIId, optionIndex);
}
EXPORT(const char*) bridged__SkirmishAI_OptionValues_getValueByKey(int _skirmishAIId, const char* const key) {

	return id_clb[_skirmishAIId]->SkirmishAI_OptionValues_getValueByKey(_skirmishAIId, key);
}
EXPORT(void) bridged__Log_log(int _skirmishAIId, const char* const msg) {

	id_clb[_skirmishAIId]->Log_log(_skirmishAIId, msg);
}
EXPORT(void) bridged__Log_exception(int _skirmishAIId, const char* const msg, int severety, bool die) {

	id_clb[_skirmishAIId]->Log_exception(_skirmishAIId, msg, severety, die);
}
EXPORT(char) bridged__DataDirs_getPathSeparator(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->DataDirs_getPathSeparator(_skirmishAIId);
}
EXPORT(const char*) bridged__DataDirs_getConfigDir(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->DataDirs_getConfigDir(_skirmishAIId);
}
EXPORT(const char*) bridged__DataDirs_getWriteableDir(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->DataDirs_getWriteableDir(_skirmishAIId);
}
EXPORT(bool) bridged__DataDirs_locatePath(int _skirmishAIId, char* path, int path_sizeMax, const char* const relPath, bool writeable, bool create, bool dir, bool common) {

	return id_clb[_skirmishAIId]->DataDirs_locatePath(_skirmishAIId, path, path_sizeMax, relPath, writeable, create, dir, common);
}
EXPORT(char*) bridged__DataDirs_allocatePath(int _skirmishAIId, const char* const relPath, bool writeable, bool create, bool dir, bool common) {

	return id_clb[_skirmishAIId]->DataDirs_allocatePath(_skirmishAIId, relPath, writeable, create, dir, common);
}
EXPORT(int) bridged__DataDirs_Roots_getSize(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->DataDirs_Roots_getSize(_skirmishAIId);
}
EXPORT(bool) bridged__DataDirs_Roots_getDir(int _skirmishAIId, char* path, int path_sizeMax, int dirIndex) {

	return id_clb[_skirmishAIId]->DataDirs_Roots_getDir(_skirmishAIId, path, path_sizeMax, dirIndex);
}
EXPORT(bool) bridged__DataDirs_Roots_locatePath(int _skirmishAIId, char* path, int path_sizeMax, const char* const relPath, bool writeable, bool create, bool dir) {

	return id_clb[_skirmishAIId]->DataDirs_Roots_locatePath(_skirmishAIId, path, path_sizeMax, relPath, writeable, create, dir);
}
EXPORT(char*) bridged__DataDirs_Roots_allocatePath(int _skirmishAIId, const char* const relPath, bool writeable, bool create, bool dir) {

	return id_clb[_skirmishAIId]->DataDirs_Roots_allocatePath(_skirmishAIId, relPath, writeable, create, dir);
}
EXPORT(int) bridged__Game_getCurrentFrame(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getCurrentFrame(_skirmishAIId);
}
EXPORT(int) bridged__Game_getAiInterfaceVersion(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getAiInterfaceVersion(_skirmishAIId);
}
EXPORT(int) bridged__Game_getMyTeam(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getMyTeam(_skirmishAIId);
}
EXPORT(int) bridged__Game_getMyAllyTeam(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getMyAllyTeam(_skirmishAIId);
}
EXPORT(int) bridged__Game_getPlayerTeam(int _skirmishAIId, int playerId) {

	return id_clb[_skirmishAIId]->Game_getPlayerTeam(_skirmishAIId, playerId);
}
EXPORT(int) bridged__Game_getTeams(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getTeams(_skirmishAIId);
}
EXPORT(const char*) bridged__Game_getTeamSide(int _skirmishAIId, int otherTeamId) {

	return id_clb[_skirmishAIId]->Game_getTeamSide(_skirmishAIId, otherTeamId);
}
EXPORT(void) bridged__Game_getTeamColor(int _skirmishAIId, int otherTeamId, short* return_colorS3_out) {

	id_clb[_skirmishAIId]->Game_getTeamColor(_skirmishAIId, otherTeamId, return_colorS3_out);
}
EXPORT(float) bridged__Game_getTeamIncomeMultiplier(int _skirmishAIId, int otherTeamId) {

	return id_clb[_skirmishAIId]->Game_getTeamIncomeMultiplier(_skirmishAIId, otherTeamId);
}
EXPORT(int) bridged__Game_getTeamAllyTeam(int _skirmishAIId, int otherTeamId) {

	return id_clb[_skirmishAIId]->Game_getTeamAllyTeam(_skirmishAIId, otherTeamId);
}
EXPORT(float) bridged__Game_getTeamResourceCurrent(int _skirmishAIId, int otherTeamId, int resourceId) {

	return id_clb[_skirmishAIId]->Game_getTeamResourceCurrent(_skirmishAIId, otherTeamId, resourceId);
}
EXPORT(float) bridged__Game_getTeamResourceIncome(int _skirmishAIId, int otherTeamId, int resourceId) {

	return id_clb[_skirmishAIId]->Game_getTeamResourceIncome(_skirmishAIId, otherTeamId, resourceId);
}
EXPORT(float) bridged__Game_getTeamResourceUsage(int _skirmishAIId, int otherTeamId, int resourceId) {

	return id_clb[_skirmishAIId]->Game_getTeamResourceUsage(_skirmishAIId, otherTeamId, resourceId);
}
EXPORT(float) bridged__Game_getTeamResourceStorage(int _skirmishAIId, int otherTeamId, int resourceId) {

	return id_clb[_skirmishAIId]->Game_getTeamResourceStorage(_skirmishAIId, otherTeamId, resourceId);
}
EXPORT(bool) bridged__Game_isAllied(int _skirmishAIId, int firstAllyTeamId, int secondAllyTeamId) {

	return id_clb[_skirmishAIId]->Game_isAllied(_skirmishAIId, firstAllyTeamId, secondAllyTeamId);
}
EXPORT(bool) bridged__Game_isExceptionHandlingEnabled(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_isExceptionHandlingEnabled(_skirmishAIId);
}
EXPORT(bool) bridged__Game_isDebugModeEnabled(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_isDebugModeEnabled(_skirmishAIId);
}
EXPORT(int) bridged__Game_getMode(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getMode(_skirmishAIId);
}
EXPORT(bool) bridged__Game_isPaused(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_isPaused(_skirmishAIId);
}
EXPORT(float) bridged__Game_getSpeedFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getSpeedFactor(_skirmishAIId);
}
EXPORT(const char*) bridged__Game_getSetupScript(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Game_getSetupScript(_skirmishAIId);
}
EXPORT(int) bridged__Game_getCategoryFlag(int _skirmishAIId, const char* categoryName) {

	return id_clb[_skirmishAIId]->Game_getCategoryFlag(_skirmishAIId, categoryName);
}
EXPORT(int) bridged__Game_getCategoriesFlag(int _skirmishAIId, const char* categoryNames) {

	return id_clb[_skirmishAIId]->Game_getCategoriesFlag(_skirmishAIId, categoryNames);
}
EXPORT(void) bridged__Game_getCategoryName(int _skirmishAIId, int categoryFlag, char* name, int name_sizeMax) {

	id_clb[_skirmishAIId]->Game_getCategoryName(_skirmishAIId, categoryFlag, name, name_sizeMax);
}
EXPORT(float) bridged__Gui_getViewRange(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Gui_getViewRange(_skirmishAIId);
}
EXPORT(float) bridged__Gui_getScreenX(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Gui_getScreenX(_skirmishAIId);
}
EXPORT(float) bridged__Gui_getScreenY(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Gui_getScreenY(_skirmishAIId);
}
EXPORT(void) bridged__Gui_Camera_getDirection(int _skirmishAIId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Gui_Camera_getDirection(_skirmishAIId, return_posF3_out);
}
EXPORT(void) bridged__Gui_Camera_getPosition(int _skirmishAIId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Gui_Camera_getPosition(_skirmishAIId, return_posF3_out);
}
EXPORT(bool) bridged__Cheats_isEnabled(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Cheats_isEnabled(_skirmishAIId);
}
EXPORT(bool) bridged__Cheats_setEnabled(int _skirmishAIId, bool enable) {

	return id_clb[_skirmishAIId]->Cheats_setEnabled(_skirmishAIId, enable);
}
EXPORT(bool) bridged__Cheats_setEventsEnabled(int _skirmishAIId, bool enabled) {

	return id_clb[_skirmishAIId]->Cheats_setEventsEnabled(_skirmishAIId, enabled);
}
EXPORT(bool) bridged__Cheats_isOnlyPassive(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Cheats_isOnlyPassive(_skirmishAIId);
}
EXPORT(int) bridged__getResources(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->getResources(_skirmishAIId);
}
EXPORT(int) bridged__getResourceByName(int _skirmishAIId, const char* resourceName) {

	return id_clb[_skirmishAIId]->getResourceByName(_skirmishAIId, resourceName);
}
EXPORT(const char*) bridged__Resource_getName(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Resource_getName(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Resource_getOptimum(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Resource_getOptimum(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Economy_getCurrent(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Economy_getCurrent(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Economy_getIncome(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Economy_getIncome(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Economy_getUsage(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Economy_getUsage(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Economy_getStorage(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Economy_getStorage(_skirmishAIId, resourceId);
}
EXPORT(int) bridged__File_getSize(int _skirmishAIId, const char* fileName) {

	return id_clb[_skirmishAIId]->File_getSize(_skirmishAIId, fileName);
}
EXPORT(bool) bridged__File_getContent(int _skirmishAIId, const char* fileName, void* buffer, int bufferLen) {

	return id_clb[_skirmishAIId]->File_getContent(_skirmishAIId, fileName, buffer, bufferLen);
}
EXPORT(int) bridged__getUnitDefs(int _skirmishAIId, int* unitDefIds, int unitDefIds_sizeMax) {

	return id_clb[_skirmishAIId]->getUnitDefs(_skirmishAIId, unitDefIds, unitDefIds_sizeMax);
}
EXPORT(int) bridged__getUnitDefByName(int _skirmishAIId, const char* unitName) {

	return id_clb[_skirmishAIId]->getUnitDefByName(_skirmishAIId, unitName);
}
EXPORT(float) bridged__UnitDef_getHeight(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getHeight(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getRadius(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getName(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getHumanName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getHumanName(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getFileName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFileName(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getAiHint(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getAiHint(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getCobId(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCobId(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getTechLevel(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTechLevel(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getGaia(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getGaia(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getUpkeep(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getUpkeep(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getResourceMake(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getResourceMake(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getMakesResource(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getMakesResource(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getCost(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getCost(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getExtractsResource(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getExtractsResource(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getResourceExtractorRange(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getResourceExtractorRange(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getWindResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getWindResourceGenerator(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getTidalResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getTidalResourceGenerator(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getStorage(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_getStorage(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(bool) bridged__UnitDef_isSquareResourceExtractor(int _skirmishAIId, int unitDefId, int resourceId) {

	return id_clb[_skirmishAIId]->UnitDef_isSquareResourceExtractor(_skirmishAIId, unitDefId, resourceId);
}
EXPORT(float) bridged__UnitDef_getBuildTime(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildTime(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getAutoHeal(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getAutoHeal(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getIdleAutoHeal(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getIdleAutoHeal(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getIdleTime(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getIdleTime(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getPower(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getPower(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getHealth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getHealth(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getCategory(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCategory(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTurnRate(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTurnRate(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isTurnInPlace(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isTurnInPlace(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTurnInPlaceDistance(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTurnInPlaceDistance(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTurnInPlaceSpeedLimit(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTurnInPlaceSpeedLimit(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isUpright(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isUpright(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isCollide(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isCollide(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getLosRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getLosRadius(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getAirLosRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getAirLosRadius(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getLosHeight(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getLosHeight(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getRadarRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getRadarRadius(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getSonarRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSonarRadius(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getJammerRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getJammerRadius(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getSonarJamRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSonarJamRadius(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getSeismicRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSeismicRadius(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getSeismicSignature(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSeismicSignature(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isStealth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isStealth(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isSonarStealth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isSonarStealth(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isBuildRange3D(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isBuildRange3D(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getBuildDistance(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildDistance(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getBuildSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getReclaimSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getReclaimSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getRepairSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getRepairSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxRepairSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxRepairSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getResurrectSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getResurrectSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getCaptureSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCaptureSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTerraformSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTerraformSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMass(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMass(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isPushResistant(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isPushResistant(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isStrafeToAttack(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isStrafeToAttack(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMinCollisionSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMinCollisionSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getSlideTolerance(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSlideTolerance(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxSlope(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxSlope(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxHeightDif(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxHeightDif(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMinWaterDepth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMinWaterDepth(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getWaterline(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWaterline(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxWaterDepth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxWaterDepth(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getArmoredMultiple(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getArmoredMultiple(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getArmorType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getArmorType(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_FlankingBonus_getMode(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_FlankingBonus_getMode(_skirmishAIId, unitDefId);
}
EXPORT(void) bridged__UnitDef_FlankingBonus_getDir(int _skirmishAIId, int unitDefId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->UnitDef_FlankingBonus_getDir(_skirmishAIId, unitDefId, return_posF3_out);
}
EXPORT(float) bridged__UnitDef_FlankingBonus_getMax(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_FlankingBonus_getMax(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_FlankingBonus_getMin(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_FlankingBonus_getMin(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_FlankingBonus_getMobilityAdd(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_FlankingBonus_getMobilityAdd(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxWeaponRange(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxWeaponRange(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getType(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getTooltip(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTooltip(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getWreckName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWreckName(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getDeathExplosion(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getDeathExplosion(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getSelfDExplosion(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSelfDExplosion(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_getCategoryString(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCategoryString(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToSelfD(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToSelfD(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getSelfDCountdown(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSelfDCountdown(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToSubmerge(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToSubmerge(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToFly(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToFly(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToMove(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToMove(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToHover(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToHover(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isFloater(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isFloater(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isBuilder(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isBuilder(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isActivateWhenBuilt(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isActivateWhenBuilt(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isOnOffable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isOnOffable(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isFullHealthFactory(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isFullHealthFactory(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isFactoryHeadingTakeoff(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isFactoryHeadingTakeoff(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isReclaimable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isReclaimable(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isCapturable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isCapturable(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToRestore(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToRestore(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToRepair(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToRepair(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToSelfRepair(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToSelfRepair(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToReclaim(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToReclaim(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToAttack(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToAttack(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToPatrol(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToPatrol(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToFight(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToFight(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToGuard(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToGuard(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToAssist(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToAssist(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAssistable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAssistable(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToRepeat(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToRepeat(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToFireControl(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToFireControl(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getFireState(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFireState(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getMoveState(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMoveState(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getWingDrag(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWingDrag(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getWingAngle(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWingAngle(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getDrag(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getDrag(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getFrontToSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFrontToSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getSpeedToFront(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getSpeedToFront(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMyGravity(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMyGravity(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxBank(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxBank(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxPitch(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxPitch(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTurnRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTurnRadius(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getWantedHeight(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWantedHeight(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getVerticalSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getVerticalSpeed(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToCrash(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToCrash(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isHoverAttack(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isHoverAttack(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAirStrafe(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAirStrafe(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getDlHoverFactor(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getDlHoverFactor(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxAcceleration(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxAcceleration(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxDeceleration(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxDeceleration(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxAileron(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxAileron(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxElevator(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxElevator(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxRudder(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxRudder(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getYardMap(int _skirmishAIId, int unitDefId, int facing, short* yardMap, int yardMap_sizeMax) {

	return id_clb[_skirmishAIId]->UnitDef_getYardMap(_skirmishAIId, unitDefId, facing, yardMap, yardMap_sizeMax);
}
EXPORT(int) bridged__UnitDef_getXSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getXSize(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getZSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getZSize(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getBuildAngle(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildAngle(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getLoadingRadius(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getLoadingRadius(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getUnloadSpread(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getUnloadSpread(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getTransportCapacity(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTransportCapacity(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getTransportSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTransportSize(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getMinTransportSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMinTransportSize(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAirBase(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAirBase(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isFirePlatform(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isFirePlatform(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTransportMass(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTransportMass(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMinTransportMass(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMinTransportMass(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isHoldSteady(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isHoldSteady(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isReleaseHeld(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isReleaseHeld(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isNotTransportable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isNotTransportable(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isTransportByEnemy(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isTransportByEnemy(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getTransportUnloadMethod(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTransportUnloadMethod(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getFallSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFallSpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getUnitFallSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getUnitFallSpeed(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToCloak(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToCloak(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isStartCloaked(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isStartCloaked(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getCloakCost(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCloakCost(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getCloakCostMoving(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getCloakCostMoving(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getDecloakDistance(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getDecloakDistance(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isDecloakSpherical(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isDecloakSpherical(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isDecloakOnFire(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isDecloakOnFire(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToKamikaze(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToKamikaze(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getKamikazeDist(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getKamikazeDist(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isTargetingFacility(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isTargetingFacility(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_canManualFire(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_canManualFire(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isNeedGeo(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isNeedGeo(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isFeature(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isFeature(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isHideDamage(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isHideDamage(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isCommander(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isCommander(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isShowPlayerName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isShowPlayerName(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToResurrect(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToResurrect(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToCapture(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToCapture(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getHighTrajectoryType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getHighTrajectoryType(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getNoChaseCategory(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getNoChaseCategory(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isLeaveTracks(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isLeaveTracks(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTrackWidth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTrackWidth(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTrackOffset(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTrackOffset(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTrackStrength(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTrackStrength(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getTrackStretch(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTrackStretch(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getTrackType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getTrackType(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToDropFlare(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToDropFlare(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getFlareReloadTime(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareReloadTime(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getFlareEfficiency(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareEfficiency(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getFlareDelay(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareDelay(_skirmishAIId, unitDefId);
}
EXPORT(void) bridged__UnitDef_getFlareDropVector(int _skirmishAIId, int unitDefId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->UnitDef_getFlareDropVector(_skirmishAIId, unitDefId, return_posF3_out);
}
EXPORT(int) bridged__UnitDef_getFlareTime(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareTime(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getFlareSalvoSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareSalvoSize(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getFlareSalvoDelay(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getFlareSalvoDelay(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isAbleToLoopbackAttack(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isAbleToLoopbackAttack(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isLevelGround(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isLevelGround(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isUseBuildingGroundDecal(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isUseBuildingGroundDecal(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getBuildingDecalType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildingDecalType(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getBuildingDecalSizeX(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildingDecalSizeX(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getBuildingDecalSizeY(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildingDecalSizeY(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getBuildingDecalDecaySpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildingDecalDecaySpeed(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMaxFuel(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxFuel(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getRefuelTime(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getRefuelTime(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_getMinAirBasePower(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMinAirBasePower(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getMaxThisUnit(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getMaxThisUnit(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getDecoyDef(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getDecoyDef(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_isDontLand(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isDontLand(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getShieldDef(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getShieldDef(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getStockpileDef(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getStockpileDef(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getBuildOptions(int _skirmishAIId, int unitDefId, int* unitDefIds, int unitDefIds_sizeMax) {

	return id_clb[_skirmishAIId]->UnitDef_getBuildOptions(_skirmishAIId, unitDefId, unitDefIds, unitDefIds_sizeMax);
}
EXPORT(int) bridged__UnitDef_getCustomParams(int _skirmishAIId, int unitDefId, const char** keys, const char** values) {

	return id_clb[_skirmishAIId]->UnitDef_getCustomParams(_skirmishAIId, unitDefId, keys, values);
}
EXPORT(bool) bridged__UnitDef_isMoveDataAvailable(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_isMoveDataAvailable(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getMaxAcceleration(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMaxAcceleration(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getMaxBreaking(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMaxBreaking(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getMaxSpeed(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMaxSpeed(_skirmishAIId, unitDefId);
}
EXPORT(short) bridged__UnitDef_MoveData_getMaxTurnRate(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMaxTurnRate(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getXSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getXSize(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getZSize(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getZSize(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getDepth(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getDepth(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getMaxSlope(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMaxSlope(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getSlopeMod(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getSlopeMod(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getDepthMod(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getDepthMod(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getPathType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getPathType(_skirmishAIId, unitDefId);
}
EXPORT(float) bridged__UnitDef_MoveData_getCrushStrength(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getCrushStrength(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getMoveType(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMoveType(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getMoveFamily(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getMoveFamily(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_MoveData_getTerrainClass(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getTerrainClass(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_MoveData_getFollowGround(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getFollowGround(_skirmishAIId, unitDefId);
}
EXPORT(bool) bridged__UnitDef_MoveData_isSubMarine(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_isSubMarine(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_MoveData_getName(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_MoveData_getName(_skirmishAIId, unitDefId);
}
EXPORT(int) bridged__UnitDef_getWeaponMounts(int _skirmishAIId, int unitDefId) {

	return id_clb[_skirmishAIId]->UnitDef_getWeaponMounts(_skirmishAIId, unitDefId);
}
EXPORT(const char*) bridged__UnitDef_WeaponMount_getName(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getName(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(int) bridged__UnitDef_WeaponMount_getWeaponDef(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getWeaponDef(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(int) bridged__UnitDef_WeaponMount_getSlavedTo(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getSlavedTo(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(void) bridged__UnitDef_WeaponMount_getMainDir(int _skirmishAIId, int unitDefId, int weaponMountId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->UnitDef_WeaponMount_getMainDir(_skirmishAIId, unitDefId, weaponMountId, return_posF3_out);
}
EXPORT(float) bridged__UnitDef_WeaponMount_getMaxAngleDif(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getMaxAngleDif(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(float) bridged__UnitDef_WeaponMount_getFuelUsage(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getFuelUsage(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(int) bridged__UnitDef_WeaponMount_getBadTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getBadTargetCategory(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(int) bridged__UnitDef_WeaponMount_getOnlyTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId) {

	return id_clb[_skirmishAIId]->UnitDef_WeaponMount_getOnlyTargetCategory(_skirmishAIId, unitDefId, weaponMountId);
}
EXPORT(int) bridged__Unit_getLimit(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Unit_getLimit(_skirmishAIId);
}
EXPORT(int) bridged__Unit_getMax(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Unit_getMax(_skirmishAIId);
}
EXPORT(int) bridged__getEnemyUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getEnemyUnits(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getEnemyUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getEnemyUnitsIn(_skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getEnemyUnitsInRadarAndLos(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getEnemyUnitsInRadarAndLos(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getFriendlyUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getFriendlyUnits(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getFriendlyUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getFriendlyUnitsIn(_skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getNeutralUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getNeutralUnits(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getNeutralUnitsIn(int _skirmishAIId, float* pos_posF3, float radius, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getNeutralUnitsIn(_skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getTeamUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getTeamUnits(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__getSelectedUnits(int _skirmishAIId, int* unitIds, int unitIds_sizeMax) {

	return id_clb[_skirmishAIId]->getSelectedUnits(_skirmishAIId, unitIds, unitIds_sizeMax);
}
EXPORT(int) bridged__Unit_getDef(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getDef(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getModParams(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getModParams(_skirmishAIId, unitId);
}
EXPORT(const char*) bridged__Unit_ModParam_getName(int _skirmishAIId, int unitId, int modParamId) {

	return id_clb[_skirmishAIId]->Unit_ModParam_getName(_skirmishAIId, unitId, modParamId);
}
EXPORT(float) bridged__Unit_ModParam_getValue(int _skirmishAIId, int unitId, int modParamId) {

	return id_clb[_skirmishAIId]->Unit_ModParam_getValue(_skirmishAIId, unitId, modParamId);
}
EXPORT(int) bridged__Unit_getTeam(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getTeam(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getAllyTeam(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getAllyTeam(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getAiHint(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getAiHint(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getStockpile(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getStockpile(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getStockpileQueued(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getStockpileQueued(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getCurrentFuel(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getCurrentFuel(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getMaxSpeed(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getMaxSpeed(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getMaxRange(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getMaxRange(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getMaxHealth(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getMaxHealth(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getExperience(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getExperience(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getGroup(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getGroup(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getCurrentCommands(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getCurrentCommands(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_CurrentCommand_getType(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getType(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_CurrentCommand_getId(int _skirmishAIId, int unitId, int commandId) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getId(_skirmishAIId, unitId, commandId);
}
EXPORT(short) bridged__Unit_CurrentCommand_getOptions(int _skirmishAIId, int unitId, int commandId) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getOptions(_skirmishAIId, unitId, commandId);
}
EXPORT(int) bridged__Unit_CurrentCommand_getTag(int _skirmishAIId, int unitId, int commandId) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getTag(_skirmishAIId, unitId, commandId);
}
EXPORT(int) bridged__Unit_CurrentCommand_getTimeOut(int _skirmishAIId, int unitId, int commandId) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getTimeOut(_skirmishAIId, unitId, commandId);
}
EXPORT(int) bridged__Unit_CurrentCommand_getParams(int _skirmishAIId, int unitId, int commandId, float* params, int params_sizeMax) {

	return id_clb[_skirmishAIId]->Unit_CurrentCommand_getParams(_skirmishAIId, unitId, commandId, params, params_sizeMax);
}
EXPORT(int) bridged__Unit_getSupportedCommands(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getSupportedCommands(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_SupportedCommand_getId(int _skirmishAIId, int unitId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_getId(_skirmishAIId, unitId, supportedCommandId);
}
EXPORT(const char*) bridged__Unit_SupportedCommand_getName(int _skirmishAIId, int unitId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_getName(_skirmishAIId, unitId, supportedCommandId);
}
EXPORT(const char*) bridged__Unit_SupportedCommand_getToolTip(int _skirmishAIId, int unitId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_getToolTip(_skirmishAIId, unitId, supportedCommandId);
}
EXPORT(bool) bridged__Unit_SupportedCommand_isShowUnique(int _skirmishAIId, int unitId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_isShowUnique(_skirmishAIId, unitId, supportedCommandId);
}
EXPORT(bool) bridged__Unit_SupportedCommand_isDisabled(int _skirmishAIId, int unitId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_isDisabled(_skirmishAIId, unitId, supportedCommandId);
}
EXPORT(int) bridged__Unit_SupportedCommand_getParams(int _skirmishAIId, int unitId, int supportedCommandId, const char** params, int params_sizeMax) {

	return id_clb[_skirmishAIId]->Unit_SupportedCommand_getParams(_skirmishAIId, unitId, supportedCommandId, params, params_sizeMax);
}
EXPORT(float) bridged__Unit_getHealth(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getHealth(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getSpeed(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getSpeed(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getPower(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getPower(_skirmishAIId, unitId);
}
EXPORT(float) bridged__Unit_getResourceUse(int _skirmishAIId, int unitId, int resourceId) {

	return id_clb[_skirmishAIId]->Unit_getResourceUse(_skirmishAIId, unitId, resourceId);
}
EXPORT(float) bridged__Unit_getResourceMake(int _skirmishAIId, int unitId, int resourceId) {

	return id_clb[_skirmishAIId]->Unit_getResourceMake(_skirmishAIId, unitId, resourceId);
}
EXPORT(void) bridged__Unit_getPos(int _skirmishAIId, int unitId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Unit_getPos(_skirmishAIId, unitId, return_posF3_out);
}
EXPORT(void) bridged__Unit_getVel(int _skirmishAIId, int unitId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Unit_getVel(_skirmishAIId, unitId, return_posF3_out);
}
EXPORT(bool) bridged__Unit_isActivated(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_isActivated(_skirmishAIId, unitId);
}
EXPORT(bool) bridged__Unit_isBeingBuilt(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_isBeingBuilt(_skirmishAIId, unitId);
}
EXPORT(bool) bridged__Unit_isCloaked(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_isCloaked(_skirmishAIId, unitId);
}
EXPORT(bool) bridged__Unit_isParalyzed(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_isParalyzed(_skirmishAIId, unitId);
}
EXPORT(bool) bridged__Unit_isNeutral(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_isNeutral(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getBuildingFacing(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getBuildingFacing(_skirmishAIId, unitId);
}
EXPORT(int) bridged__Unit_getLastUserOrderFrame(int _skirmishAIId, int unitId) {

	return id_clb[_skirmishAIId]->Unit_getLastUserOrderFrame(_skirmishAIId, unitId);
}
EXPORT(int) bridged__getGroups(int _skirmishAIId, int* groupIds, int groupIds_sizeMax) {

	return id_clb[_skirmishAIId]->getGroups(_skirmishAIId, groupIds, groupIds_sizeMax);
}
EXPORT(int) bridged__Group_getSupportedCommands(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_getSupportedCommands(_skirmishAIId, groupId);
}
EXPORT(int) bridged__Group_SupportedCommand_getId(int _skirmishAIId, int groupId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_getId(_skirmishAIId, groupId, supportedCommandId);
}
EXPORT(const char*) bridged__Group_SupportedCommand_getName(int _skirmishAIId, int groupId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_getName(_skirmishAIId, groupId, supportedCommandId);
}
EXPORT(const char*) bridged__Group_SupportedCommand_getToolTip(int _skirmishAIId, int groupId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_getToolTip(_skirmishAIId, groupId, supportedCommandId);
}
EXPORT(bool) bridged__Group_SupportedCommand_isShowUnique(int _skirmishAIId, int groupId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_isShowUnique(_skirmishAIId, groupId, supportedCommandId);
}
EXPORT(bool) bridged__Group_SupportedCommand_isDisabled(int _skirmishAIId, int groupId, int supportedCommandId) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_isDisabled(_skirmishAIId, groupId, supportedCommandId);
}
EXPORT(int) bridged__Group_SupportedCommand_getParams(int _skirmishAIId, int groupId, int supportedCommandId, const char** params, int params_sizeMax) {

	return id_clb[_skirmishAIId]->Group_SupportedCommand_getParams(_skirmishAIId, groupId, supportedCommandId, params, params_sizeMax);
}
EXPORT(int) bridged__Group_OrderPreview_getId(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_OrderPreview_getId(_skirmishAIId, groupId);
}
EXPORT(short) bridged__Group_OrderPreview_getOptions(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_OrderPreview_getOptions(_skirmishAIId, groupId);
}
EXPORT(int) bridged__Group_OrderPreview_getTag(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_OrderPreview_getTag(_skirmishAIId, groupId);
}
EXPORT(int) bridged__Group_OrderPreview_getTimeOut(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_OrderPreview_getTimeOut(_skirmishAIId, groupId);
}
EXPORT(int) bridged__Group_OrderPreview_getParams(int _skirmishAIId, int groupId, float* params, int params_sizeMax) {

	return id_clb[_skirmishAIId]->Group_OrderPreview_getParams(_skirmishAIId, groupId, params, params_sizeMax);
}
EXPORT(bool) bridged__Group_isSelected(int _skirmishAIId, int groupId) {

	return id_clb[_skirmishAIId]->Group_isSelected(_skirmishAIId, groupId);
}
EXPORT(const char*) bridged__Mod_getFileName(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getFileName(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getHash(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getHash(_skirmishAIId);
}
EXPORT(const char*) bridged__Mod_getHumanName(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getHumanName(_skirmishAIId);
}
EXPORT(const char*) bridged__Mod_getShortName(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getShortName(_skirmishAIId);
}
EXPORT(const char*) bridged__Mod_getVersion(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getVersion(_skirmishAIId);
}
EXPORT(const char*) bridged__Mod_getMutator(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getMutator(_skirmishAIId);
}
EXPORT(const char*) bridged__Mod_getDescription(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getDescription(_skirmishAIId);
}
EXPORT(bool) bridged__Mod_getAllowTeamColors(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getAllowTeamColors(_skirmishAIId);
}
EXPORT(bool) bridged__Mod_getConstructionDecay(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getConstructionDecay(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getConstructionDecayTime(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getConstructionDecayTime(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getConstructionDecaySpeed(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getConstructionDecaySpeed(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getMultiReclaim(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getMultiReclaim(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getReclaimMethod(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimMethod(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getReclaimUnitMethod(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimUnitMethod(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getReclaimUnitEnergyCostFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimUnitEnergyCostFactor(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getReclaimUnitEfficiency(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimUnitEfficiency(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getReclaimFeatureEnergyCostFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimFeatureEnergyCostFactor(_skirmishAIId);
}
EXPORT(bool) bridged__Mod_getReclaimAllowEnemies(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimAllowEnemies(_skirmishAIId);
}
EXPORT(bool) bridged__Mod_getReclaimAllowAllies(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getReclaimAllowAllies(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getRepairEnergyCostFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getRepairEnergyCostFactor(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getResurrectEnergyCostFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getResurrectEnergyCostFactor(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getCaptureEnergyCostFactor(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getCaptureEnergyCostFactor(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getTransportGround(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getTransportGround(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getTransportHover(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getTransportHover(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getTransportShip(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getTransportShip(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getTransportAir(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getTransportAir(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getFireAtKilled(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getFireAtKilled(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getFireAtCrashing(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getFireAtCrashing(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getFlankingBonusModeDefault(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getFlankingBonusModeDefault(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getLosMipLevel(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getLosMipLevel(_skirmishAIId);
}
EXPORT(int) bridged__Mod_getAirMipLevel(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getAirMipLevel(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getLosMul(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getLosMul(_skirmishAIId);
}
EXPORT(float) bridged__Mod_getAirLosMul(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getAirLosMul(_skirmishAIId);
}
EXPORT(bool) bridged__Mod_getRequireSonarUnderWater(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Mod_getRequireSonarUnderWater(_skirmishAIId);
}
EXPORT(int) bridged__Map_getChecksum(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getChecksum(_skirmishAIId);
}
EXPORT(void) bridged__Map_getStartPos(int _skirmishAIId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_getStartPos(_skirmishAIId, return_posF3_out);
}
EXPORT(void) bridged__Map_getMousePos(int _skirmishAIId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_getMousePos(_skirmishAIId, return_posF3_out);
}
EXPORT(bool) bridged__Map_isPosInCamera(int _skirmishAIId, float* pos_posF3, float radius) {

	return id_clb[_skirmishAIId]->Map_isPosInCamera(_skirmishAIId, pos_posF3, radius);
}
EXPORT(int) bridged__Map_getWidth(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getWidth(_skirmishAIId);
}
EXPORT(int) bridged__Map_getHeight(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getHeight(_skirmishAIId);
}
EXPORT(int) bridged__Map_getHeightMap(int _skirmishAIId, float* heights, int heights_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getHeightMap(_skirmishAIId, heights, heights_sizeMax);
}
EXPORT(int) bridged__Map_getCornersHeightMap(int _skirmishAIId, float* cornerHeights, int cornerHeights_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getCornersHeightMap(_skirmishAIId, cornerHeights, cornerHeights_sizeMax);
}
EXPORT(float) bridged__Map_getMinHeight(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getMinHeight(_skirmishAIId);
}
EXPORT(float) bridged__Map_getMaxHeight(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getMaxHeight(_skirmishAIId);
}
EXPORT(int) bridged__Map_getSlopeMap(int _skirmishAIId, float* slopes, int slopes_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getSlopeMap(_skirmishAIId, slopes, slopes_sizeMax);
}
EXPORT(int) bridged__Map_getLosMap(int _skirmishAIId, int* losValues, int losValues_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getLosMap(_skirmishAIId, losValues, losValues_sizeMax);
}
EXPORT(int) bridged__Map_getRadarMap(int _skirmishAIId, int* radarValues, int radarValues_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getRadarMap(_skirmishAIId, radarValues, radarValues_sizeMax);
}
EXPORT(int) bridged__Map_getJammerMap(int _skirmishAIId, int* jammerValues, int jammerValues_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getJammerMap(_skirmishAIId, jammerValues, jammerValues_sizeMax);
}
EXPORT(int) bridged__Map_getResourceMapRaw(int _skirmishAIId, int resourceId, short* resources, int resources_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getResourceMapRaw(_skirmishAIId, resourceId, resources, resources_sizeMax);
}
EXPORT(int) bridged__Map_getResourceMapSpotsPositions(int _skirmishAIId, int resourceId, float* spots_AposF3, int spots_AposF3_sizeMax) {

	return id_clb[_skirmishAIId]->Map_getResourceMapSpotsPositions(_skirmishAIId, resourceId, spots_AposF3, spots_AposF3_sizeMax);
}
EXPORT(float) bridged__Map_getResourceMapSpotsAverageIncome(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Map_getResourceMapSpotsAverageIncome(_skirmishAIId, resourceId);
}
EXPORT(void) bridged__Map_getResourceMapSpotsNearest(int _skirmishAIId, int resourceId, float* pos_posF3, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_getResourceMapSpotsNearest(_skirmishAIId, resourceId, pos_posF3, return_posF3_out);
}
EXPORT(int) bridged__Map_getHash(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getHash(_skirmishAIId);
}
EXPORT(const char*) bridged__Map_getName(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getName(_skirmishAIId);
}
EXPORT(const char*) bridged__Map_getHumanName(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getHumanName(_skirmishAIId);
}
EXPORT(float) bridged__Map_getElevationAt(int _skirmishAIId, float x, float z) {

	return id_clb[_skirmishAIId]->Map_getElevationAt(_skirmishAIId, x, z);
}
EXPORT(float) bridged__Map_getMaxResource(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Map_getMaxResource(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Map_getExtractorRadius(int _skirmishAIId, int resourceId) {

	return id_clb[_skirmishAIId]->Map_getExtractorRadius(_skirmishAIId, resourceId);
}
EXPORT(float) bridged__Map_getMinWind(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getMinWind(_skirmishAIId);
}
EXPORT(float) bridged__Map_getMaxWind(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getMaxWind(_skirmishAIId);
}
EXPORT(float) bridged__Map_getCurWind(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getCurWind(_skirmishAIId);
}
EXPORT(float) bridged__Map_getTidalStrength(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getTidalStrength(_skirmishAIId);
}
EXPORT(float) bridged__Map_getGravity(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Map_getGravity(_skirmishAIId);
}
EXPORT(int) bridged__Map_getPoints(int _skirmishAIId, bool includeAllies) {

	return id_clb[_skirmishAIId]->Map_getPoints(_skirmishAIId, includeAllies);
}
EXPORT(void) bridged__Map_Point_getPosition(int _skirmishAIId, int pointId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_Point_getPosition(_skirmishAIId, pointId, return_posF3_out);
}
EXPORT(void) bridged__Map_Point_getColor(int _skirmishAIId, int pointId, short* return_colorS3_out) {

	id_clb[_skirmishAIId]->Map_Point_getColor(_skirmishAIId, pointId, return_colorS3_out);
}
EXPORT(const char*) bridged__Map_Point_getLabel(int _skirmishAIId, int pointId) {

	return id_clb[_skirmishAIId]->Map_Point_getLabel(_skirmishAIId, pointId);
}
EXPORT(int) bridged__Map_getLines(int _skirmishAIId, bool includeAllies) {

	return id_clb[_skirmishAIId]->Map_getLines(_skirmishAIId, includeAllies);
}
EXPORT(void) bridged__Map_Line_getFirstPosition(int _skirmishAIId, int lineId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_Line_getFirstPosition(_skirmishAIId, lineId, return_posF3_out);
}
EXPORT(void) bridged__Map_Line_getSecondPosition(int _skirmishAIId, int lineId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_Line_getSecondPosition(_skirmishAIId, lineId, return_posF3_out);
}
EXPORT(void) bridged__Map_Line_getColor(int _skirmishAIId, int lineId, short* return_colorS3_out) {

	id_clb[_skirmishAIId]->Map_Line_getColor(_skirmishAIId, lineId, return_colorS3_out);
}
EXPORT(bool) bridged__Map_isPossibleToBuildAt(int _skirmishAIId, int unitDefId, float* pos_posF3, int facing) {

	return id_clb[_skirmishAIId]->Map_isPossibleToBuildAt(_skirmishAIId, unitDefId, pos_posF3, facing);
}
EXPORT(void) bridged__Map_findClosestBuildSite(int _skirmishAIId, int unitDefId, float* pos_posF3, float searchRadius, int minDist, int facing, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Map_findClosestBuildSite(_skirmishAIId, unitDefId, pos_posF3, searchRadius, minDist, facing, return_posF3_out);
}
EXPORT(int) bridged__getFeatureDefs(int _skirmishAIId, int* featureDefIds, int featureDefIds_sizeMax) {

	return id_clb[_skirmishAIId]->getFeatureDefs(_skirmishAIId, featureDefIds, featureDefIds_sizeMax);
}
EXPORT(const char*) bridged__FeatureDef_getName(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getName(_skirmishAIId, featureDefId);
}
EXPORT(const char*) bridged__FeatureDef_getDescription(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getDescription(_skirmishAIId, featureDefId);
}
EXPORT(const char*) bridged__FeatureDef_getFileName(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getFileName(_skirmishAIId, featureDefId);
}
EXPORT(float) bridged__FeatureDef_getContainedResource(int _skirmishAIId, int featureDefId, int resourceId) {

	return id_clb[_skirmishAIId]->FeatureDef_getContainedResource(_skirmishAIId, featureDefId, resourceId);
}
EXPORT(float) bridged__FeatureDef_getMaxHealth(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getMaxHealth(_skirmishAIId, featureDefId);
}
EXPORT(float) bridged__FeatureDef_getReclaimTime(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getReclaimTime(_skirmishAIId, featureDefId);
}
EXPORT(float) bridged__FeatureDef_getMass(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getMass(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isUpright(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isUpright(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getDrawType(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getDrawType(_skirmishAIId, featureDefId);
}
EXPORT(const char*) bridged__FeatureDef_getModelName(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getModelName(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getResurrectable(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getResurrectable(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getSmokeTime(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getSmokeTime(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isDestructable(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isDestructable(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isReclaimable(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isReclaimable(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isBlocking(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isBlocking(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isBurnable(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isBurnable(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isFloating(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isFloating(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isNoSelect(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isNoSelect(_skirmishAIId, featureDefId);
}
EXPORT(bool) bridged__FeatureDef_isGeoThermal(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_isGeoThermal(_skirmishAIId, featureDefId);
}
EXPORT(const char*) bridged__FeatureDef_getDeathFeature(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getDeathFeature(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getXSize(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getXSize(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getZSize(int _skirmishAIId, int featureDefId) {

	return id_clb[_skirmishAIId]->FeatureDef_getZSize(_skirmishAIId, featureDefId);
}
EXPORT(int) bridged__FeatureDef_getCustomParams(int _skirmishAIId, int featureDefId, const char** keys, const char** values) {

	return id_clb[_skirmishAIId]->FeatureDef_getCustomParams(_skirmishAIId, featureDefId, keys, values);
}
EXPORT(int) bridged__getFeatures(int _skirmishAIId, int* featureIds, int featureIds_sizeMax) {

	return id_clb[_skirmishAIId]->getFeatures(_skirmishAIId, featureIds, featureIds_sizeMax);
}
EXPORT(int) bridged__getFeaturesIn(int _skirmishAIId, float* pos_posF3, float radius, int* featureIds, int featureIds_sizeMax) {

	return id_clb[_skirmishAIId]->getFeaturesIn(_skirmishAIId, pos_posF3, radius, featureIds, featureIds_sizeMax);
}
EXPORT(int) bridged__Feature_getDef(int _skirmishAIId, int featureId) {

	return id_clb[_skirmishAIId]->Feature_getDef(_skirmishAIId, featureId);
}
EXPORT(float) bridged__Feature_getHealth(int _skirmishAIId, int featureId) {

	return id_clb[_skirmishAIId]->Feature_getHealth(_skirmishAIId, featureId);
}
EXPORT(float) bridged__Feature_getReclaimLeft(int _skirmishAIId, int featureId) {

	return id_clb[_skirmishAIId]->Feature_getReclaimLeft(_skirmishAIId, featureId);
}
EXPORT(void) bridged__Feature_getPosition(int _skirmishAIId, int featureId, float* return_posF3_out) {

	id_clb[_skirmishAIId]->Feature_getPosition(_skirmishAIId, featureId, return_posF3_out);
}
EXPORT(int) bridged__getWeaponDefs(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->getWeaponDefs(_skirmishAIId);
}
EXPORT(int) bridged__getWeaponDefByName(int _skirmishAIId, const char* weaponDefName) {

	return id_clb[_skirmishAIId]->getWeaponDefByName(_skirmishAIId, weaponDefName);
}
EXPORT(const char*) bridged__WeaponDef_getName(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getName(_skirmishAIId, weaponDefId);
}
EXPORT(const char*) bridged__WeaponDef_getType(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getType(_skirmishAIId, weaponDefId);
}
EXPORT(const char*) bridged__WeaponDef_getDescription(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDescription(_skirmishAIId, weaponDefId);
}
EXPORT(const char*) bridged__WeaponDef_getFileName(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getFileName(_skirmishAIId, weaponDefId);
}
EXPORT(const char*) bridged__WeaponDef_getCegTag(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCegTag(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getRange(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getRange(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getHeightMod(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getHeightMod(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getAccuracy(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getAccuracy(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getSprayAngle(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getSprayAngle(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getMovingAccuracy(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getMovingAccuracy(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getTargetMoveError(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getTargetMoveError(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getLeadLimit(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getLeadLimit(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getLeadBonus(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getLeadBonus(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getPredictBoost(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getPredictBoost(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getNumDamageTypes(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->WeaponDef_getNumDamageTypes(_skirmishAIId);
}
EXPORT(int) bridged__WeaponDef_Damage_getParalyzeDamageTime(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getParalyzeDamageTime(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Damage_getImpulseFactor(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getImpulseFactor(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Damage_getImpulseBoost(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getImpulseBoost(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Damage_getCraterMult(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getCraterMult(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Damage_getCraterBoost(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getCraterBoost(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_Damage_getTypes(int _skirmishAIId, int weaponDefId, float* types, int types_sizeMax) {

	return id_clb[_skirmishAIId]->WeaponDef_Damage_getTypes(_skirmishAIId, weaponDefId, types, types_sizeMax);
}
EXPORT(float) bridged__WeaponDef_getAreaOfEffect(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getAreaOfEffect(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isNoSelfDamage(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isNoSelfDamage(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getFireStarter(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getFireStarter(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getEdgeEffectiveness(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getEdgeEffectiveness(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getSize(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getSize(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getSizeGrowth(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getSizeGrowth(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCollisionSize(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCollisionSize(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getSalvoSize(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getSalvoSize(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getSalvoDelay(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getSalvoDelay(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getReload(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getReload(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getBeamTime(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getBeamTime(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isBeamBurst(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isBeamBurst(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isWaterBounce(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isWaterBounce(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isGroundBounce(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isGroundBounce(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getBounceRebound(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getBounceRebound(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getBounceSlip(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getBounceSlip(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getNumBounce(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getNumBounce(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getMaxAngle(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getMaxAngle(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getUpTime(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getUpTime(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getFlightTime(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getFlightTime(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCost(int _skirmishAIId, int weaponDefId, int resourceId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCost(_skirmishAIId, weaponDefId, resourceId);
}
EXPORT(int) bridged__WeaponDef_getProjectilesPerShot(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getProjectilesPerShot(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isTurret(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isTurret(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isOnlyForward(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isOnlyForward(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isFixedLauncher(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isFixedLauncher(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isWaterWeapon(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isWaterWeapon(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isFireSubmersed(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isFireSubmersed(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isSubMissile(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isSubMissile(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isTracks(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isTracks(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isDropped(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isDropped(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isParalyzer(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isParalyzer(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isImpactOnly(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isImpactOnly(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isNoAutoTarget(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isNoAutoTarget(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isManualFire(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isManualFire(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getInterceptor(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getInterceptor(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getTargetable(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getTargetable(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isStockpileable(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isStockpileable(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCoverageRange(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCoverageRange(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getStockpileTime(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getStockpileTime(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getIntensity(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getIntensity(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getThickness(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getThickness(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getLaserFlareSize(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getLaserFlareSize(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCoreThickness(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCoreThickness(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getDuration(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDuration(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getLodDistance(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getLodDistance(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getFalloffRate(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getFalloffRate(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getGraphicsType(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getGraphicsType(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isSoundTrigger(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isSoundTrigger(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isSelfExplode(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isSelfExplode(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isGravityAffected(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isGravityAffected(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getHighTrajectory(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getHighTrajectory(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getMyGravity(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getMyGravity(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isNoExplode(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isNoExplode(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getStartVelocity(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getStartVelocity(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getWeaponAcceleration(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getWeaponAcceleration(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getTurnRate(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getTurnRate(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getMaxVelocity(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getMaxVelocity(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getProjectileSpeed(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getProjectileSpeed(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getExplosionSpeed(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getExplosionSpeed(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getOnlyTargetCategory(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getOnlyTargetCategory(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getWobble(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getWobble(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getDance(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDance(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getTrajectoryHeight(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getTrajectoryHeight(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isLargeBeamLaser(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isLargeBeamLaser(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isShield(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isShield(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isShieldRepulser(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isShieldRepulser(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isSmartShield(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isSmartShield(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isExteriorShield(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isExteriorShield(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isVisibleShield(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isVisibleShield(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isVisibleShieldRepulse(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isVisibleShieldRepulse(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getVisibleShieldHitFrames(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getVisibleShieldHitFrames(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getResourceUse(int _skirmishAIId, int weaponDefId, int resourceId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getResourceUse(_skirmishAIId, weaponDefId, resourceId);
}
EXPORT(float) bridged__WeaponDef_Shield_getRadius(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getRadius(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getForce(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getForce(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getMaxSpeed(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getMaxSpeed(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getPower(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getPower(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getPowerRegen(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getPowerRegen(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_Shield_getPowerRegenResource(int _skirmishAIId, int weaponDefId, int resourceId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getPowerRegenResource(_skirmishAIId, weaponDefId, resourceId);
}
EXPORT(float) bridged__WeaponDef_Shield_getStartingPower(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getStartingPower(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_Shield_getRechargeDelay(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getRechargeDelay(_skirmishAIId, weaponDefId);
}
EXPORT(void) bridged__WeaponDef_Shield_getGoodColor(int _skirmishAIId, int weaponDefId, short* return_colorS3_out) {

	id_clb[_skirmishAIId]->WeaponDef_Shield_getGoodColor(_skirmishAIId, weaponDefId, return_colorS3_out);
}
EXPORT(void) bridged__WeaponDef_Shield_getBadColor(int _skirmishAIId, int weaponDefId, short* return_colorS3_out) {

	id_clb[_skirmishAIId]->WeaponDef_Shield_getBadColor(_skirmishAIId, weaponDefId, return_colorS3_out);
}
EXPORT(short) bridged__WeaponDef_Shield_getAlpha(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getAlpha(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_Shield_getInterceptType(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_Shield_getInterceptType(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getInterceptedByShieldType(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getInterceptedByShieldType(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isAvoidFriendly(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isAvoidFriendly(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isAvoidFeature(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isAvoidFeature(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isAvoidNeutral(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isAvoidNeutral(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getTargetBorder(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getTargetBorder(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCylinderTargetting(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCylinderTargetting(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getMinIntensity(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getMinIntensity(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getHeightBoostFactor(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getHeightBoostFactor(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getProximityPriority(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getProximityPriority(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getCollisionFlags(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCollisionFlags(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isSweepFire(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isSweepFire(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isAbleToAttackGround(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isAbleToAttackGround(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getCameraShake(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getCameraShake(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getDynDamageExp(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDynDamageExp(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getDynDamageMin(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDynDamageMin(_skirmishAIId, weaponDefId);
}
EXPORT(float) bridged__WeaponDef_getDynDamageRange(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_getDynDamageRange(_skirmishAIId, weaponDefId);
}
EXPORT(bool) bridged__WeaponDef_isDynDamageInverted(int _skirmishAIId, int weaponDefId) {

	return id_clb[_skirmishAIId]->WeaponDef_isDynDamageInverted(_skirmishAIId, weaponDefId);
}
EXPORT(int) bridged__WeaponDef_getCustomParams(int _skirmishAIId, int weaponDefId, const char** keys, const char** values) {

	return id_clb[_skirmishAIId]->WeaponDef_getCustomParams(_skirmishAIId, weaponDefId, keys, values);
}
EXPORT(bool) bridged__Debug_GraphDrawer_isEnabled(int _skirmishAIId) {

	return id_clb[_skirmishAIId]->Debug_GraphDrawer_isEnabled(_skirmishAIId);
}



EXPORT(int) bridged__Cheats_setMyIncomeMultiplier(int _skirmishAIId, float factor) {

	struct SSetMyIncomeMultiplierCheatCommand commandData;
	commandData.factor = factor;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_CHEATS_SET_MY_INCOME_MULTIPLIER, &commandData);

	return _ret;
}

EXPORT(int) bridged__Cheats_giveMeResource(int _skirmishAIId, int resourceId, float amount) {

	struct SGiveMeResourceCheatCommand commandData;
	commandData.resourceId = resourceId;
	commandData.amount = amount;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_CHEATS_GIVE_ME_RESOURCE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Cheats_giveMeUnit(int _skirmishAIId, int unitDefId, float* pos_posF3) {

	struct SGiveMeNewUnitCheatCommand commandData;
	commandData.unitDefId = unitDefId;
	commandData.pos_posF3 = pos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_CHEATS_GIVE_ME_NEW_UNIT, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_newUnitId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Game_sendTextMessage(int _skirmishAIId, const char* text, int zone) {

	struct SSendTextMessageCommand commandData;
	commandData.text = text;
	commandData.zone = zone;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_SEND_TEXT_MESSAGE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Game_setLastMessagePosition(int _skirmishAIId, float* pos_posF3) {

	struct SSetLastPosMessageCommand commandData;
	commandData.pos_posF3 = pos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_SET_LAST_POS_MESSAGE, &commandData);

	return _ret;
}

EXPORT(bool) bridged__Economy_sendResource(int _skirmishAIId, int resourceId, float amount, int receivingTeamId) {

	struct SSendResourcesCommand commandData;
	commandData.resourceId = resourceId;
	commandData.amount = amount;
	commandData.receivingTeamId = receivingTeamId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_SEND_RESOURCES, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_isExecuted;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Economy_sendUnits(int _skirmishAIId, int* unitIds, int unitIds_size, int receivingTeamId) {

	struct SSendUnitsCommand commandData;
	commandData.unitIds = unitIds;
	commandData.unitIds_size = unitIds_size;
	commandData.receivingTeamId = receivingTeamId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_SEND_UNITS, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_sentUnits;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Group_create(int _skirmishAIId) {

	struct SCreateGroupCommand commandData;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_GROUP_CREATE, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_groupId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Group_erase(int _skirmishAIId, int groupId) {

	struct SEraseGroupCommand commandData;
	commandData.groupId = groupId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_GROUP_ERASE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Pathing_initPath(int _skirmishAIId, float* start_posF3, float* end_posF3, int pathType, float goalRadius) {

	struct SInitPathCommand commandData;
	commandData.start_posF3 = start_posF3;
	commandData.end_posF3 = end_posF3;
	commandData.pathType = pathType;
	commandData.goalRadius = goalRadius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_PATH_INIT, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_pathId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Pathing_getApproximateLength(int _skirmishAIId, float* start_posF3, float* end_posF3, int pathType, float goalRadius) {

	struct SGetApproximateLengthPathCommand commandData;
	commandData.start_posF3 = start_posF3;
	commandData.end_posF3 = end_posF3;
	commandData.pathType = pathType;
	commandData.goalRadius = goalRadius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_PATH_GET_APPROXIMATE_LENGTH, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_approximatePathLength;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Pathing_getNextWaypoint(int _skirmishAIId, int pathId, float* ret_nextWaypoint_posF3_out) {

	struct SGetNextWaypointPathCommand commandData;
	commandData.pathId = pathId;
	commandData.ret_nextWaypoint_posF3_out = ret_nextWaypoint_posF3_out;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_PATH_GET_NEXT_WAYPOINT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Pathing_freePath(int _skirmishAIId, int pathId) {

	struct SFreePathCommand commandData;
	commandData.pathId = pathId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_PATH_FREE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Lua_callRules(int _skirmishAIId, const char* inData, int inSize, const char* ret_outData) {

	struct SCallLuaRulesCommand commandData;
	commandData.inData = inData;
	commandData.inSize = inSize;
	commandData.ret_outData = ret_outData;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_CALL_LUA_RULES, &commandData);

	return _ret;
}

EXPORT(int) bridged__Lua_callUI(int _skirmishAIId, const char* inData, int inSize, const char* ret_outData) {

	struct SCallLuaUICommand commandData;
	commandData.inData = inData;
	commandData.inSize = inSize;
	commandData.ret_outData = ret_outData;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_CALL_LUA_UI, &commandData);

	return _ret;
}

EXPORT(int) bridged__Game_sendStartPosition(int _skirmishAIId, bool ready, float* pos_posF3) {

	struct SSendStartPosCommand commandData;
	commandData.ready = ready;
	commandData.pos_posF3 = pos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_SEND_START_POS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_addNotification(int _skirmishAIId, float* pos_posF3, short* color_colorS3, short alpha) {

	struct SAddNotificationDrawerCommand commandData;
	commandData.pos_posF3 = pos_posF3;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_ADD_NOTIFICATION, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_addPoint(int _skirmishAIId, float* pos_posF3, const char* label) {

	struct SAddPointDrawCommand commandData;
	commandData.pos_posF3 = pos_posF3;
	commandData.label = label;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_POINT_ADD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_deletePointsAndLines(int _skirmishAIId, float* pos_posF3) {

	struct SRemovePointDrawCommand commandData;
	commandData.pos_posF3 = pos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_POINT_REMOVE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_addLine(int _skirmishAIId, float* posFrom_posF3, float* posTo_posF3) {

	struct SAddLineDrawCommand commandData;
	commandData.posFrom_posF3 = posFrom_posF3;
	commandData.posTo_posF3 = posTo_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_LINE_ADD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_start(int _skirmishAIId, float* pos_posF3, short* color_colorS3, short alpha) {

	struct SStartPathDrawerCommand commandData;
	commandData.pos_posF3 = pos_posF3;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_START, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_finish(int _skirmishAIId, bool iAmUseless) {

	struct SFinishPathDrawerCommand commandData;
	commandData.iAmUseless = iAmUseless;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_FINISH, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawLine(int _skirmishAIId, float* endPos_posF3, short* color_colorS3, short alpha) {

	struct SDrawLinePathDrawerCommand commandData;
	commandData.endPos_posF3 = endPos_posF3;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_DRAW_LINE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawLineAndCommandIcon(int _skirmishAIId, int cmdId, float* endPos_posF3, short* color_colorS3, short alpha) {

	struct SDrawLineAndIconPathDrawerCommand commandData;
	commandData.cmdId = cmdId;
	commandData.endPos_posF3 = endPos_posF3;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_DRAW_LINE_AND_ICON, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_drawIcon(int _skirmishAIId, int cmdId) {

	struct SDrawIconAtLastPosPathDrawerCommand commandData;
	commandData.cmdId = cmdId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_DRAW_ICON_AT_LAST_POS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_suspend(int _skirmishAIId, float* endPos_posF3, short* color_colorS3, short alpha) {

	struct SBreakPathDrawerCommand commandData;
	commandData.endPos_posF3 = endPos_posF3;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_BREAK, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_PathDrawer_restart(int _skirmishAIId, bool sameColor) {

	struct SRestartPathDrawerCommand commandData;
	commandData.sameColor = sameColor;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_PATH_RESTART, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_Figure_drawSpline(int _skirmishAIId, float* pos1_posF3, float* pos2_posF3, float* pos3_posF3, float* pos4_posF3, float width, bool arrow, int lifeTime, int figureGroupId) {

	struct SCreateSplineFigureDrawerCommand commandData;
	commandData.pos1_posF3 = pos1_posF3;
	commandData.pos2_posF3 = pos2_posF3;
	commandData.pos3_posF3 = pos3_posF3;
	commandData.pos4_posF3 = pos4_posF3;
	commandData.width = width;
	commandData.arrow = arrow;
	commandData.lifeTime = lifeTime;
	commandData.figureGroupId = figureGroupId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_FIGURE_CREATE_SPLINE, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_newFigureGroupId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Map_Drawer_Figure_drawLine(int _skirmishAIId, float* pos1_posF3, float* pos2_posF3, float width, bool arrow, int lifeTime, int figureGroupId) {

	struct SCreateLineFigureDrawerCommand commandData;
	commandData.pos1_posF3 = pos1_posF3;
	commandData.pos2_posF3 = pos2_posF3;
	commandData.width = width;
	commandData.arrow = arrow;
	commandData.lifeTime = lifeTime;
	commandData.figureGroupId = figureGroupId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_FIGURE_CREATE_LINE, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_newFigureGroupId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Map_Drawer_Figure_setColor(int _skirmishAIId, int figureGroupId, short* color_colorS3, short alpha) {

	struct SSetColorFigureDrawerCommand commandData;
	commandData.figureGroupId = figureGroupId;
	commandData.color_colorS3 = color_colorS3;
	commandData.alpha = alpha;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_FIGURE_SET_COLOR, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_Figure_remove(int _skirmishAIId, int figureGroupId) {

	struct SDeleteFigureDrawerCommand commandData;
	commandData.figureGroupId = figureGroupId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_FIGURE_DELETE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Map_Drawer_drawUnit(int _skirmishAIId, int toDrawUnitDefId, float* pos_posF3, float rotation, int lifeTime, int teamId, bool transparent, bool drawBorder, int facing) {

	struct SDrawUnitDrawerCommand commandData;
	commandData.toDrawUnitDefId = toDrawUnitDefId;
	commandData.pos_posF3 = pos_posF3;
	commandData.rotation = rotation;
	commandData.lifeTime = lifeTime;
	commandData.teamId = teamId;
	commandData.transparent = transparent;
	commandData.drawBorder = drawBorder;
	commandData.facing = facing;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DRAWER_DRAW_UNIT, &commandData);

	return _ret;
}

static int _bridged__Unit_build(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toBuildUnitDefId, float* buildPos_posF3, int facing) {

	struct SBuildUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toBuildUnitDefId = toBuildUnitDefId;
	commandData.buildPos_posF3 = buildPos_posF3;
	commandData.facing = facing;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_BUILD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_build(int _skirmishAIId, int unitId, int toBuildUnitDefId, float* buildPos_posF3, int facing, short options, int timeOut) { // REF:toBuildUnitDefId->UnitDef error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_build(_skirmishAIId, unitId, groupId, options, timeOut, toBuildUnitDefId, buildPos_posF3, facing);
}

EXPORT(int) bridged__Group_build(int _skirmishAIId, int groupId, int toBuildUnitDefId, float* buildPos_posF3, int facing, short options, int timeOut) { // REF:toBuildUnitDefId->UnitDef error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_build(_skirmishAIId, unitId, groupId, options, timeOut, toBuildUnitDefId, buildPos_posF3, facing);
}

static int _bridged__Unit_stop(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SStopUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_STOP, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_stop(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_stop(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_stop(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_stop(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_wait(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SWaitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_WAIT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_wait(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_wait(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_wait(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_wait(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_waitFor(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int time) {

	struct STimeWaitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.time = time;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_WAIT_TIME, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_waitFor(int _skirmishAIId, int unitId, int time, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_waitFor(_skirmishAIId, unitId, groupId, options, timeOut, time);
}

EXPORT(int) bridged__Group_waitFor(int _skirmishAIId, int groupId, int time, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_waitFor(_skirmishAIId, unitId, groupId, options, timeOut, time);
}

static int _bridged__Unit_waitForDeathOf(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toDieUnitId) {

	struct SDeathWaitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toDieUnitId = toDieUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_WAIT_DEATH, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_waitForDeathOf(int _skirmishAIId, int unitId, int toDieUnitId, short options, int timeOut) { // REF:toDieUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_waitForDeathOf(_skirmishAIId, unitId, groupId, options, timeOut, toDieUnitId);
}

EXPORT(int) bridged__Group_waitForDeathOf(int _skirmishAIId, int groupId, int toDieUnitId, short options, int timeOut) { // REF:toDieUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_waitForDeathOf(_skirmishAIId, unitId, groupId, options, timeOut, toDieUnitId);
}

static int _bridged__Unit_waitForSquadSize(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int numUnits) {

	struct SSquadWaitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.numUnits = numUnits;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_WAIT_SQUAD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_waitForSquadSize(int _skirmishAIId, int unitId, int numUnits, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_waitForSquadSize(_skirmishAIId, unitId, groupId, options, timeOut, numUnits);
}

EXPORT(int) bridged__Group_waitForSquadSize(int _skirmishAIId, int groupId, int numUnits, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_waitForSquadSize(_skirmishAIId, unitId, groupId, options, timeOut, numUnits);
}

static int _bridged__Unit_waitForAll(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SGatherWaitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_WAIT_GATHER, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_waitForAll(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_waitForAll(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_waitForAll(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_waitForAll(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_moveTo(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toPos_posF3) {

	struct SMoveUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toPos_posF3 = toPos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_MOVE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_moveTo(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_moveTo(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

EXPORT(int) bridged__Group_moveTo(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_moveTo(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

static int _bridged__Unit_patrolTo(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toPos_posF3) {

	struct SPatrolUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toPos_posF3 = toPos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_PATROL, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_patrolTo(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_patrolTo(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

EXPORT(int) bridged__Group_patrolTo(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_patrolTo(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

static int _bridged__Unit_fight(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toPos_posF3) {

	struct SFightUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toPos_posF3 = toPos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_FIGHT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_fight(int _skirmishAIId, int unitId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_fight(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

EXPORT(int) bridged__Group_fight(int _skirmishAIId, int groupId, float* toPos_posF3, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_fight(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3);
}

static int _bridged__Unit_attack(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toAttackUnitId) {

	struct SAttackUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toAttackUnitId = toAttackUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_ATTACK, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_attack(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut) { // REF:toAttackUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_attack(_skirmishAIId, unitId, groupId, options, timeOut, toAttackUnitId);
}

EXPORT(int) bridged__Group_attack(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut) { // REF:toAttackUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_attack(_skirmishAIId, unitId, groupId, options, timeOut, toAttackUnitId);
}

static int _bridged__Unit_attackArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toAttackPos_posF3, float radius) {

	struct SAttackAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toAttackPos_posF3 = toAttackPos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_ATTACK_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_attackArea(int _skirmishAIId, int unitId, float* toAttackPos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_attackArea(_skirmishAIId, unitId, groupId, options, timeOut, toAttackPos_posF3, radius);
}

EXPORT(int) bridged__Group_attackArea(int _skirmishAIId, int groupId, float* toAttackPos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_attackArea(_skirmishAIId, unitId, groupId, options, timeOut, toAttackPos_posF3, radius);
}

static int _bridged__Unit_guard(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toGuardUnitId) {

	struct SGuardUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toGuardUnitId = toGuardUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_GUARD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_guard(int _skirmishAIId, int unitId, int toGuardUnitId, short options, int timeOut) { // REF:toGuardUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_guard(_skirmishAIId, unitId, groupId, options, timeOut, toGuardUnitId);
}

EXPORT(int) bridged__Group_guard(int _skirmishAIId, int groupId, int toGuardUnitId, short options, int timeOut) { // REF:toGuardUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_guard(_skirmishAIId, unitId, groupId, options, timeOut, toGuardUnitId);
}

static int _bridged__Unit_aiSelect(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SAiSelectUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_AI_SELECT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_aiSelect(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_aiSelect(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_aiSelect(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_aiSelect(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_addToGroup(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toGroupId) {

	struct SGroupAddUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toGroupId = toGroupId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_GROUP_ADD, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_addToGroup(int _skirmishAIId, int unitId, int toGroupId, short options, int timeOut) { // REF:toGroupId->Group error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_addToGroup(_skirmishAIId, unitId, groupId, options, timeOut, toGroupId);
}

EXPORT(int) bridged__Group_addToGroup(int _skirmishAIId, int groupId, int toGroupId, short options, int timeOut) { // REF:toGroupId->Group error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_addToGroup(_skirmishAIId, unitId, groupId, options, timeOut, toGroupId);
}

static int _bridged__Unit_removeFromGroup(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SGroupClearUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_GROUP_CLEAR, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_removeFromGroup(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_removeFromGroup(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_removeFromGroup(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_removeFromGroup(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_repair(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toRepairUnitId) {

	struct SRepairUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toRepairUnitId = toRepairUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_REPAIR, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_repair(int _skirmishAIId, int unitId, int toRepairUnitId, short options, int timeOut) { // REF:toRepairUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_repair(_skirmishAIId, unitId, groupId, options, timeOut, toRepairUnitId);
}

EXPORT(int) bridged__Group_repair(int _skirmishAIId, int groupId, int toRepairUnitId, short options, int timeOut) { // REF:toRepairUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_repair(_skirmishAIId, unitId, groupId, options, timeOut, toRepairUnitId);
}

static int _bridged__Unit_setFireState(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int fireState) {

	struct SSetFireStateUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.fireState = fireState;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_FIRE_STATE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setFireState(int _skirmishAIId, int unitId, int fireState, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setFireState(_skirmishAIId, unitId, groupId, options, timeOut, fireState);
}

EXPORT(int) bridged__Group_setFireState(int _skirmishAIId, int groupId, int fireState, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setFireState(_skirmishAIId, unitId, groupId, options, timeOut, fireState);
}

static int _bridged__Unit_setMoveState(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int moveState) {

	struct SSetMoveStateUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.moveState = moveState;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_MOVE_STATE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setMoveState(int _skirmishAIId, int unitId, int moveState, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setMoveState(_skirmishAIId, unitId, groupId, options, timeOut, moveState);
}

EXPORT(int) bridged__Group_setMoveState(int _skirmishAIId, int groupId, int moveState, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setMoveState(_skirmishAIId, unitId, groupId, options, timeOut, moveState);
}

static int _bridged__Unit_setBase(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* basePos_posF3) {

	struct SSetBaseUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.basePos_posF3 = basePos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_BASE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setBase(int _skirmishAIId, int unitId, float* basePos_posF3, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setBase(_skirmishAIId, unitId, groupId, options, timeOut, basePos_posF3);
}

EXPORT(int) bridged__Group_setBase(int _skirmishAIId, int groupId, float* basePos_posF3, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setBase(_skirmishAIId, unitId, groupId, options, timeOut, basePos_posF3);
}

static int _bridged__Unit_selfDestruct(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SSelfDestroyUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SELF_DESTROY, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_selfDestruct(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_selfDestruct(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_selfDestruct(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_selfDestruct(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_setWantedMaxSpeed(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float wantedMaxSpeed) {

	struct SSetWantedMaxSpeedUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.wantedMaxSpeed = wantedMaxSpeed;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_WANTED_MAX_SPEED, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setWantedMaxSpeed(int _skirmishAIId, int unitId, float wantedMaxSpeed, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setWantedMaxSpeed(_skirmishAIId, unitId, groupId, options, timeOut, wantedMaxSpeed);
}

EXPORT(int) bridged__Group_setWantedMaxSpeed(int _skirmishAIId, int groupId, float wantedMaxSpeed, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setWantedMaxSpeed(_skirmishAIId, unitId, groupId, options, timeOut, wantedMaxSpeed);
}

static int _bridged__Unit_loadUnits(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int* toLoadUnitIds, int toLoadUnitIds_size) {

	struct SLoadUnitsUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toLoadUnitIds = toLoadUnitIds;
	commandData.toLoadUnitIds_size = toLoadUnitIds_size;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_LOAD_UNITS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_loadUnits(int _skirmishAIId, int unitId, int* toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut) { // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_loadUnits(_skirmishAIId, unitId, groupId, options, timeOut, toLoadUnitIds, toLoadUnitIds_size);
}

EXPORT(int) bridged__Group_loadUnits(int _skirmishAIId, int groupId, int* toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut) { // REF:MULTI:toLoadUnitIds->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_loadUnits(_skirmishAIId, unitId, groupId, options, timeOut, toLoadUnitIds, toLoadUnitIds_size);
}

static int _bridged__Unit_loadUnitsInArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3, float radius) {

	struct SLoadUnitsAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_LOAD_UNITS_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_loadUnitsInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_loadUnitsInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

EXPORT(int) bridged__Group_loadUnitsInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_loadUnitsInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

static int _bridged__Unit_loadOnto(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int transporterUnitId) {

	struct SLoadOntoUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.transporterUnitId = transporterUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_LOAD_ONTO, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_loadOnto(int _skirmishAIId, int unitId, int transporterUnitId, short options, int timeOut) { // REF:transporterUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_loadOnto(_skirmishAIId, unitId, groupId, options, timeOut, transporterUnitId);
}

EXPORT(int) bridged__Group_loadOnto(int _skirmishAIId, int groupId, int transporterUnitId, short options, int timeOut) { // REF:transporterUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_loadOnto(_skirmishAIId, unitId, groupId, options, timeOut, transporterUnitId);
}

static int _bridged__Unit_unload(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toPos_posF3, int toUnloadUnitId) {

	struct SUnloadUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toPos_posF3 = toPos_posF3;
	commandData.toUnloadUnitId = toUnloadUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_UNLOAD_UNIT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_unload(int _skirmishAIId, int unitId, float* toPos_posF3, int toUnloadUnitId, short options, int timeOut) { // REF:toUnloadUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_unload(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3, toUnloadUnitId);
}

EXPORT(int) bridged__Group_unload(int _skirmishAIId, int groupId, float* toPos_posF3, int toUnloadUnitId, short options, int timeOut) { // REF:toUnloadUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_unload(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3, toUnloadUnitId);
}

static int _bridged__Unit_unloadUnitsInArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* toPos_posF3, float radius) {

	struct SUnloadUnitsAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toPos_posF3 = toPos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_UNLOAD_UNITS_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_unloadUnitsInArea(int _skirmishAIId, int unitId, float* toPos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_unloadUnitsInArea(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3, radius);
}

EXPORT(int) bridged__Group_unloadUnitsInArea(int _skirmishAIId, int groupId, float* toPos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_unloadUnitsInArea(_skirmishAIId, unitId, groupId, options, timeOut, toPos_posF3, radius);
}

static int _bridged__Unit_setOn(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, bool on) {

	struct SSetOnOffUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.on = on;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_ON_OFF, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setOn(int _skirmishAIId, int unitId, bool on, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setOn(_skirmishAIId, unitId, groupId, options, timeOut, on);
}

EXPORT(int) bridged__Group_setOn(int _skirmishAIId, int groupId, bool on, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setOn(_skirmishAIId, unitId, groupId, options, timeOut, on);
}

static int _bridged__Unit_reclaimUnit(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toReclaimUnitId) {

	struct SReclaimUnitUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toReclaimUnitId = toReclaimUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RECLAIM_UNIT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_reclaimUnit(int _skirmishAIId, int unitId, int toReclaimUnitId, short options, int timeOut) { // REF:toReclaimUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_reclaimUnit(_skirmishAIId, unitId, groupId, options, timeOut, toReclaimUnitId);
}

EXPORT(int) bridged__Group_reclaimUnit(int _skirmishAIId, int groupId, int toReclaimUnitId, short options, int timeOut) { // REF:toReclaimUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_reclaimUnit(_skirmishAIId, unitId, groupId, options, timeOut, toReclaimUnitId);
}

static int _bridged__Unit_reclaimFeature(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toReclaimFeatureId) {

	struct SReclaimFeatureUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toReclaimFeatureId = toReclaimFeatureId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RECLAIM_FEATURE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_reclaimFeature(int _skirmishAIId, int unitId, int toReclaimFeatureId, short options, int timeOut) { // REF:toReclaimFeatureId->Feature error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_reclaimFeature(_skirmishAIId, unitId, groupId, options, timeOut, toReclaimFeatureId);
}

EXPORT(int) bridged__Group_reclaimFeature(int _skirmishAIId, int groupId, int toReclaimFeatureId, short options, int timeOut) { // REF:toReclaimFeatureId->Feature error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_reclaimFeature(_skirmishAIId, unitId, groupId, options, timeOut, toReclaimFeatureId);
}

static int _bridged__Unit_reclaimInArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3, float radius) {

	struct SReclaimAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RECLAIM_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_reclaimInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_reclaimInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

EXPORT(int) bridged__Group_reclaimInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_reclaimInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

static int _bridged__Unit_cloak(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, bool cloak) {

	struct SCloakUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.cloak = cloak;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_CLOAK, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_cloak(int _skirmishAIId, int unitId, bool cloak, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_cloak(_skirmishAIId, unitId, groupId, options, timeOut, cloak);
}

EXPORT(int) bridged__Group_cloak(int _skirmishAIId, int groupId, bool cloak, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_cloak(_skirmishAIId, unitId, groupId, options, timeOut, cloak);
}

static int _bridged__Unit_stockpile(int _skirmishAIId, int unitId, int groupId, short options, int timeOut) {

	struct SStockpileUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_STOCKPILE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_stockpile(int _skirmishAIId, int unitId, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_stockpile(_skirmishAIId, unitId, groupId, options, timeOut);
}

EXPORT(int) bridged__Group_stockpile(int _skirmishAIId, int groupId, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_stockpile(_skirmishAIId, unitId, groupId, options, timeOut);
}

static int _bridged__Unit_dGun(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toAttackUnitId) {

	struct SDGunUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toAttackUnitId = toAttackUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_D_GUN, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_dGun(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut) { // REF:toAttackUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_dGun(_skirmishAIId, unitId, groupId, options, timeOut, toAttackUnitId);
}

EXPORT(int) bridged__Group_dGun(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut) { // REF:toAttackUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_dGun(_skirmishAIId, unitId, groupId, options, timeOut, toAttackUnitId);
}

static int _bridged__Unit_dGunPosition(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3) {

	struct SDGunPosUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_D_GUN_POS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_dGunPosition(int _skirmishAIId, int unitId, float* pos_posF3, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_dGunPosition(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3);
}

EXPORT(int) bridged__Group_dGunPosition(int _skirmishAIId, int groupId, float* pos_posF3, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_dGunPosition(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3);
}

static int _bridged__Unit_restoreArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3, float radius) {

	struct SRestoreAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RESTORE_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_restoreArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_restoreArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

EXPORT(int) bridged__Group_restoreArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_restoreArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

static int _bridged__Unit_setRepeat(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, bool repeat) {

	struct SSetRepeatUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.repeat = repeat;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_REPEAT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setRepeat(int _skirmishAIId, int unitId, bool repeat, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setRepeat(_skirmishAIId, unitId, groupId, options, timeOut, repeat);
}

EXPORT(int) bridged__Group_setRepeat(int _skirmishAIId, int groupId, bool repeat, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setRepeat(_skirmishAIId, unitId, groupId, options, timeOut, repeat);
}

static int _bridged__Unit_setTrajectory(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int trajectory) {

	struct SSetTrajectoryUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.trajectory = trajectory;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_TRAJECTORY, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setTrajectory(int _skirmishAIId, int unitId, int trajectory, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setTrajectory(_skirmishAIId, unitId, groupId, options, timeOut, trajectory);
}

EXPORT(int) bridged__Group_setTrajectory(int _skirmishAIId, int groupId, int trajectory, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setTrajectory(_skirmishAIId, unitId, groupId, options, timeOut, trajectory);
}

static int _bridged__Unit_resurrect(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toResurrectFeatureId) {

	struct SResurrectUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toResurrectFeatureId = toResurrectFeatureId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RESURRECT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_resurrect(int _skirmishAIId, int unitId, int toResurrectFeatureId, short options, int timeOut) { // REF:toResurrectFeatureId->Feature error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_resurrect(_skirmishAIId, unitId, groupId, options, timeOut, toResurrectFeatureId);
}

EXPORT(int) bridged__Group_resurrect(int _skirmishAIId, int groupId, int toResurrectFeatureId, short options, int timeOut) { // REF:toResurrectFeatureId->Feature error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_resurrect(_skirmishAIId, unitId, groupId, options, timeOut, toResurrectFeatureId);
}

static int _bridged__Unit_resurrectInArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3, float radius) {

	struct SResurrectAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_RESURRECT_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_resurrectInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_resurrectInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

EXPORT(int) bridged__Group_resurrectInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_resurrectInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

static int _bridged__Unit_capture(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int toCaptureUnitId) {

	struct SCaptureUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.toCaptureUnitId = toCaptureUnitId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_CAPTURE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_capture(int _skirmishAIId, int unitId, int toCaptureUnitId, short options, int timeOut) { // REF:toCaptureUnitId->Unit error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_capture(_skirmishAIId, unitId, groupId, options, timeOut, toCaptureUnitId);
}

EXPORT(int) bridged__Group_capture(int _skirmishAIId, int groupId, int toCaptureUnitId, short options, int timeOut) { // REF:toCaptureUnitId->Unit error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_capture(_skirmishAIId, unitId, groupId, options, timeOut, toCaptureUnitId);
}

static int _bridged__Unit_captureInArea(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, float* pos_posF3, float radius) {

	struct SCaptureAreaUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.pos_posF3 = pos_posF3;
	commandData.radius = radius;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_CAPTURE_AREA, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_captureInArea(int _skirmishAIId, int unitId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_captureInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

EXPORT(int) bridged__Group_captureInArea(int _skirmishAIId, int groupId, float* pos_posF3, float radius, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_captureInArea(_skirmishAIId, unitId, groupId, options, timeOut, pos_posF3, radius);
}

static int _bridged__Unit_setAutoRepairLevel(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int autoRepairLevel) {

	struct SSetAutoRepairLevelUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.autoRepairLevel = autoRepairLevel;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_AUTO_REPAIR_LEVEL, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setAutoRepairLevel(int _skirmishAIId, int unitId, int autoRepairLevel, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setAutoRepairLevel(_skirmishAIId, unitId, groupId, options, timeOut, autoRepairLevel);
}

EXPORT(int) bridged__Group_setAutoRepairLevel(int _skirmishAIId, int groupId, int autoRepairLevel, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setAutoRepairLevel(_skirmishAIId, unitId, groupId, options, timeOut, autoRepairLevel);
}

static int _bridged__Unit_setIdleMode(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int idleMode) {

	struct SSetIdleModeUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.idleMode = idleMode;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_SET_IDLE_MODE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_setIdleMode(int _skirmishAIId, int unitId, int idleMode, short options, int timeOut) { // error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_setIdleMode(_skirmishAIId, unitId, groupId, options, timeOut, idleMode);
}

EXPORT(int) bridged__Group_setIdleMode(int _skirmishAIId, int groupId, int idleMode, short options, int timeOut) { // error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_setIdleMode(_skirmishAIId, unitId, groupId, options, timeOut, idleMode);
}

static int _bridged__Unit_executeCustomCommand(int _skirmishAIId, int unitId, int groupId, short options, int timeOut, int cmdId, float* params, int params_size) {

	struct SCustomUnitCommand commandData;
	commandData.unitId = unitId;
	commandData.groupId = groupId;
	commandData.options = options;
	commandData.timeOut = timeOut;
	commandData.cmdId = cmdId;
	commandData.params = params;
	commandData.params_size = params_size;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_UNIT_CUSTOM, &commandData);

	return _ret;
}

EXPORT(int) bridged__Unit_executeCustomCommand(int _skirmishAIId, int unitId, int cmdId, float* params, int params_size, short options, int timeOut) { // ARRAY:params error-return:0=OK

	const int groupId = -1;
	return _bridged__Unit_executeCustomCommand(_skirmishAIId, unitId, groupId, options, timeOut, cmdId, params, params_size);
}

EXPORT(int) bridged__Group_executeCustomCommand(int _skirmishAIId, int groupId, int cmdId, float* params, int params_size, short options, int timeOut) { // ARRAY:params error-return:0=OK

	const int unitId = -1;
	return _bridged__Unit_executeCustomCommand(_skirmishAIId, unitId, groupId, options, timeOut, cmdId, params, params_size);
}

EXPORT(int) bridged__Map_Drawer_traceRay(int _skirmishAIId, float* rayPos_posF3, float* rayDir_posF3, float rayLen, int srcUnitId, int flags) {

	struct STraceRayCommand commandData;
	commandData.rayPos_posF3 = rayPos_posF3;
	commandData.rayDir_posF3 = rayDir_posF3;
	commandData.rayLen = rayLen;
	commandData.srcUnitId = srcUnitId;
	commandData.flags = flags;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_TRACE_RAY, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_hitUnitId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Map_Drawer_traceRayFeature(int _skirmishAIId, float* rayPos_posF3, float* rayDir_posF3, float rayLen, int srcUnitId, int flags) {

	struct SFeatureTraceRayCommand commandData;
	commandData.rayPos_posF3 = rayPos_posF3;
	commandData.rayDir_posF3 = rayDir_posF3;
	commandData.rayLen = rayLen;
	commandData.srcUnitId = srcUnitId;
	commandData.flags = flags;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_TRACE_RAY_FEATURE, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_hitFeatureId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Game_setPause(int _skirmishAIId, bool enable, const char* reason) {

	struct SPauseCommand commandData;
	commandData.enable = enable;
	commandData.reason = reason;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_PAUSE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_setPosition(int _skirmishAIId, float x, float y) {

	struct SSetPositionGraphDrawerDebugCommand commandData;
	commandData.x = x;
	commandData.y = y;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_SET_POS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_setSize(int _skirmishAIId, float w, float h) {

	struct SSetSizeGraphDrawerDebugCommand commandData;
	commandData.w = w;
	commandData.h = h;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_SET_SIZE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_addPoint(int _skirmishAIId, int lineId, float x, float y) {

	struct SAddPointLineGraphDrawerDebugCommand commandData;
	commandData.lineId = lineId;
	commandData.x = x;
	commandData.y = y;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_LINE_ADD_POINT, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_deletePoints(int _skirmishAIId, int lineId, int numPoints) {

	struct SDeletePointsLineGraphDrawerDebugCommand commandData;
	commandData.lineId = lineId;
	commandData.numPoints = numPoints;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_LINE_DELETE_POINTS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_setColor(int _skirmishAIId, int lineId, short* color_colorS3) {

	struct SSetColorLineGraphDrawerDebugCommand commandData;
	commandData.lineId = lineId;
	commandData.color_colorS3 = color_colorS3;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_LINE_SET_COLOR, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_GraphDrawer_GraphLine_setLabel(int _skirmishAIId, int lineId, const char* label) {

	struct SSetLabelLineGraphDrawerDebugCommand commandData;
	commandData.lineId = lineId;
	commandData.label = label;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_GRAPH_LINE_SET_LABEL, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_addOverlayTexture(int _skirmishAIId, const float* texData, int w, int h) {

	struct SAddOverlayTextureDrawerDebugCommand commandData;
	commandData.texData = texData;
	commandData.w = w;
	commandData.h = h;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_ADD, &commandData);

	if (_ret == 0) {
		_ret = commandData.ret_overlayTextureId;
	} else {
		_ret = 0;
	}
	return _ret;
}

EXPORT(int) bridged__Debug_OverlayTexture_update(int _skirmishAIId, int overlayTextureId, const float* texData, int x, int y, int w, int h) {

	struct SUpdateOverlayTextureDrawerDebugCommand commandData;
	commandData.overlayTextureId = overlayTextureId;
	commandData.texData = texData;
	commandData.x = x;
	commandData.y = y;
	commandData.w = w;
	commandData.h = h;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_UPDATE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_OverlayTexture_remove(int _skirmishAIId, int overlayTextureId) {

	struct SDeleteOverlayTextureDrawerDebugCommand commandData;
	commandData.overlayTextureId = overlayTextureId;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_DELETE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_OverlayTexture_setPosition(int _skirmishAIId, int overlayTextureId, float x, float y) {

	struct SSetPositionOverlayTextureDrawerDebugCommand commandData;
	commandData.overlayTextureId = overlayTextureId;
	commandData.x = x;
	commandData.y = y;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_SET_POS, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_OverlayTexture_setSize(int _skirmishAIId, int overlayTextureId, float w, float h) {

	struct SSetSizeOverlayTextureDrawerDebugCommand commandData;
	commandData.overlayTextureId = overlayTextureId;
	commandData.w = w;
	commandData.h = h;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_SET_SIZE, &commandData);

	return _ret;
}

EXPORT(int) bridged__Debug_OverlayTexture_setLabel(int _skirmishAIId, int overlayTextureId, const char* label) {

	struct SSetLabelOverlayTextureDrawerDebugCommand commandData;
	commandData.overlayTextureId = overlayTextureId;
	commandData.label = label;

	int _ret = id_clb[_skirmishAIId]->Engine_handleCommand(_skirmishAIId, COMMAND_TO_ID_ENGINE, -1, COMMAND_DEBUG_DRAWER_OVERLAYTEXTURE_SET_LABEL, &commandData);

	return _ret;
}


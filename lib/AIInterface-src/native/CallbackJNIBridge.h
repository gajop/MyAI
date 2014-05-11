/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#ifndef __CALLBACK_JNI_BRIDGE_H
#define __CALLBACK_JNI_BRIDGE_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getMajor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getMinor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getPatchset(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getCommits(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getBranch(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getAdditional(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getBuildTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1isRelease(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getNormal(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getSync(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getFull(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Teams_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAIs_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAIs_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1getTeamId(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getValueByKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring key);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint optionIndex);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint optionIndex);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getValueByKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring key);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Log_1log(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring msg);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Log_1exception(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring msg, jint severety, jboolean die);

JNIEXPORT jchar JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getPathSeparator(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getConfigDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getWriteableDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1locatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jstring relPath, jboolean writeable, jboolean create, jboolean dir, jboolean common);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1allocatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring relPath, jboolean writeable, jboolean create, jboolean dir, jboolean common);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1getDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jint dirIndex);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1locatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jstring relPath, jboolean writeable, jboolean create, jboolean dir);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1allocatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring relPath, jboolean writeable, jboolean create, jboolean dir);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCurrentFrame(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getAiInterfaceVersion(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMyAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getPlayerTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint playerId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeams(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamSide(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jshortArray return_colorS3_out);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamIncomeMultiplier(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceCurrent(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isAllied(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint firstAllyTeamId, jint secondAllyTeamId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isExceptionHandlingEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isDebugModeEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isPaused(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getSpeedFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Game_1getSetupScript(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoryFlag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring categoryName);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoriesFlag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring categoryNames);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoryName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint categoryFlag, jstring name, jint name_sizeMax);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getViewRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getScreenX(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getScreenY(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Gui_1Camera_1getDirection(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Gui_1Camera_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1isEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enable);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setEventsEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enabled);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1isOnlyPassive(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getResources(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getResourceByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring resourceName);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Resource_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Resource_1getOptimum(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getCurrent(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getUnitDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitDefIds, jint unitDefIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getUnitDefByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring unitName);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAiHint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCobId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTechLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getGaia(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUpkeep(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResourceMake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMakesResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getExtractsResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResourceExtractorRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWindResourceGenerator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTidalResourceGenerator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isSquareResourceExtractor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAutoHeal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getIdleAutoHeal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getIdleTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTurnInPlace(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnInPlaceDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnInPlaceSpeedLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isUpright(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCollide(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLosRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAirLosRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLosHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRadarRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSonarRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getJammerRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSonarJamRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSeismicRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSeismicSignature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isSonarStealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isBuildRange3D(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getReclaimSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRepairSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxRepairSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResurrectSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCaptureSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTerraformSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isPushResistant(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStrafeToAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinCollisionSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSlideTolerance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxSlope(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxHeightDif(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinWaterDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWaterline(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxWaterDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getArmoredMultiple(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getArmorType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray return_posF3_out);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMin(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMobilityAdd(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxWeaponRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTooltip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWreckName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDeathExplosion(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSelfDExplosion(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCategoryString(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSelfD(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSelfDCountdown(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSubmerge(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToMove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToHover(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFloater(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isBuilder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isActivateWhenBuilt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isOnOffable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFullHealthFactory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFactoryHeadingTakeoff(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isReclaimable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCapturable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRestore(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRepair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSelfRepair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToReclaim(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToPatrol(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToGuard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToAssist(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAssistable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFireControl(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWingDrag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWingAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDrag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFrontToSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSpeedToFront(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMyGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxBank(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxPitch(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWantedHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getVerticalSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCrash(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHoverAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAirStrafe(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDlHoverFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxDeceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxAileron(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxElevator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxRudder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getYardMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint facing, jshortArray yardMap, jint yardMap_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLoadingRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUnloadSpread(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportCapacity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinTransportSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAirBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFirePlatform(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinTransportMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHoldSteady(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isReleaseHeld(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isNotTransportable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTransportByEnemy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportUnloadMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFallSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUnitFallSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStartCloaked(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCloakCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCloakCostMoving(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDecloakDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDecloakSpherical(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDecloakOnFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToKamikaze(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getKamikazeDist(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTargetingFacility(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1canManualFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isNeedGeo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHideDamage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCommander(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isShowPlayerName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToResurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCapture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHighTrajectoryType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getNoChaseCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isLeaveTracks(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackWidth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackOffset(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackStretch(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToDropFlare(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareReloadTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareEfficiency(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareDropVector(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray return_posF3_out);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareSalvoSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareSalvoDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToLoopbackAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isLevelGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isUseBuildingGroundDecal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalSizeX(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalSizeY(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalDecaySpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxFuel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRefuelTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinAirBasePower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxThisUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDecoyDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDontLand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getShieldDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getStockpileDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jintArray unitDefIds, jint unitDefIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jobjectArray keys, jobjectArray values);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isMoveDataAvailable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxBreaking(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxSlope(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getSlopeMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getDepthMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getPathType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getCrushStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMoveType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMoveFamily(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getTerrainClass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getFollowGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1isSubMarine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWeaponMounts(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getWeaponDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getSlavedTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getMainDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId, jfloatArray return_posF3_out);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getMaxAngleDif(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getFuelUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getBadTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getOnlyTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnitsInRadarAndLos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFriendlyUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFriendlyUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getNeutralUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getNeutralUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getTeamUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getSelectedUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getModParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1ModParam_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint modParamId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1ModParam_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint modParamId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getAiHint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getStockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getStockpileQueued(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getCurrentFuel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getExperience(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getCurrentCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId);

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getTimeOut(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId, jfloatArray params, jint params_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getSupportedCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getToolTip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1isShowUnique(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1isDisabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId, jobjectArray params, jint params_sizeMax);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getResourceUse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getResourceMake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint resourceId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getPos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getVel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray return_posF3_out);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isActivated(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isBeingBuilt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isCloaked(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isParalyzed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isNeutral(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getBuildingFacing(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getLastUserOrderFrame(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getGroups(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray groupIds, jint groupIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1getSupportedCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getToolTip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1isShowUnique(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1isDisabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId, jobjectArray params, jint params_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getTimeOut(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray params, jint params_sizeMax);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1isSelected(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getShortName(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getVersion(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getMutator(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAllowTeamColors(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecay(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecayTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecaySpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getMultiReclaim(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitEfficiency(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimFeatureEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimAllowEnemies(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimAllowAllies(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getRepairEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getResurrectEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getCaptureEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportHover(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportShip(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportAir(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFireAtKilled(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFireAtCrashing(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFlankingBonusModeDefault(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getLosMipLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAirMipLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getLosMul(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAirLosMul(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getRequireSonarUnderWater(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getChecksum(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getStartPos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMousePos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Map_1isPosInCamera(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getWidth(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHeightMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray heights, jint heights_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getCornersHeightMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray cornerHeights, jint cornerHeights_sizeMax);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMinHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getSlopeMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray slopes, jint slopes_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getLosMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray losValues, jint losValues_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getRadarMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray radarValues, jint radarValues_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getJammerMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray jammerValues, jint jammerValues_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapRaw(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jshortArray resources, jint resources_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsPositions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloatArray spots_AposF3, jint spots_AposF3_sizeMax);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsAverageIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsNearest(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloatArray pos_posF3, jfloatArray return_posF3_out);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getElevationAt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat x, jfloat z);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getExtractorRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMinWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getCurWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getTidalStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getPoints(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean includeAllies);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId, jshortArray return_colorS3_out);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getLines(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean includeAllies);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getFirstPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getSecondPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloatArray return_posF3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jshortArray return_colorS3_out);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Map_1isPossibleToBuildAt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3, jint facing);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1findClosestBuildSite(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3, jfloat searchRadius, jint minDist, jint facing, jfloatArray return_posF3_out);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeatureDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray featureDefIds, jint featureDefIds_sizeMax);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getContainedResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getMaxHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getReclaimTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isUpright(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDrawType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getModelName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getResurrectable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getSmokeTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isDestructable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isReclaimable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isBlocking(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isBurnable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isFloating(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isNoSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isGeoThermal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDeathFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId, jobjectArray keys, jobjectArray values);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeatures(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray featureIds, jint featureIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeaturesIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray featureIds, jint featureIds_sizeMax);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getReclaimLeft(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId, jfloatArray return_posF3_out);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getWeaponDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getWeaponDefByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring weaponDefName);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCegTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHeightMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getAccuracy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSprayAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMovingAccuracy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetMoveError(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLeadLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLeadBonus(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getPredictBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getNumDamageTypes(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getParalyzeDamageTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getImpulseFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getImpulseBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getCraterMult(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getCraterBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getTypes(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jfloatArray types, jint types_sizeMax);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getAreaOfEffect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoSelfDamage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFireStarter(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getEdgeEffectiveness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSizeGrowth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCollisionSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSalvoSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSalvoDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getReload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBeamTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isBeamBurst(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isWaterBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isGroundBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBounceRebound(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBounceSlip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getNumBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMaxAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getUpTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFlightTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProjectilesPerShot(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isTurret(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isOnlyForward(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isFixedLauncher(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isWaterWeapon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isFireSubmersed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSubMissile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isTracks(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isDropped(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isParalyzer(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isImpactOnly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoAutoTarget(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isManualFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getInterceptor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isStockpileable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCoverageRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getStockpileTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getIntensity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getThickness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLaserFlareSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCoreThickness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDuration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLodDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFalloffRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getGraphicsType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSoundTrigger(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSelfExplode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isGravityAffected(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHighTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMyGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoExplode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getStartVelocity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getWeaponAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMaxVelocity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProjectileSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getExplosionSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getOnlyTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getWobble(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTrajectoryHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isLargeBeamLaser(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isShieldRepulser(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSmartShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isExteriorShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isVisibleShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isVisibleShieldRepulse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getVisibleShieldHitFrames(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getResourceUse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getForce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPowerRegen(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPowerRegenResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getStartingPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getRechargeDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getGoodColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jshortArray return_colorS3_out);

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getBadColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jshortArray return_colorS3_out);

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getAlpha(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getInterceptType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getInterceptedByShieldType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidFriendly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidNeutral(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetBorder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCylinderTargetting(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMinIntensity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHeightBoostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProximityPriority(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCollisionFlags(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSweepFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAbleToAttackGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCameraShake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageExp(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageMin(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isDynDamageInverted(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jobjectArray keys, jobjectArray values);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1isEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setMyIncomeMultiplier(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat factor);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1giveMeResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloat amount);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1giveMeUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1sendTextMessage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring text, jint zone);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1setLastMessagePosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3);

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Economy_1sendResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloat amount, jint receivingTeamId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Economy_1sendUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_size, jint receivingTeamId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1create(JNIEnv* __env, jobject __obj, jint _skirmishAIId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1erase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1initPath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray start_posF3, jfloatArray end_posF3, jint pathType, jfloat goalRadius);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1getApproximateLength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray start_posF3, jfloatArray end_posF3, jint pathType, jfloat goalRadius);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1getNextWaypoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pathId, jfloatArray ret_nextWaypoint_posF3_out);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1freePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pathId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Lua_1callRules(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring inData, jint inSize, jstring ret_outData);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Lua_1callUI(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring inData, jint inSize, jstring ret_outData);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1sendStartPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean ready, jfloatArray pos_posF3);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addNotification(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addPoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jstring label);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1deletePointsAndLines(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray posFrom_posF3, jfloatArray posTo_posF3);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1start(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1finish(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean iAmUseless);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawLineAndCommandIcon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint cmdId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawIcon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint cmdId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1suspend(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1restart(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean sameColor);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1drawSpline(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos1_posF3, jfloatArray pos2_posF3, jfloatArray pos3_posF3, jfloatArray pos4_posF3, jfloat width, jboolean arrow, jint lifeTime, jint figureGroupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1drawLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos1_posF3, jfloatArray pos2_posF3, jfloat width, jboolean arrow, jint lifeTime, jint figureGroupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1setColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint figureGroupId, jshortArray color_colorS3, jshort alpha);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1remove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint figureGroupId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1drawUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint toDrawUnitDefId, jfloatArray pos_posF3, jfloat rotation, jint lifeTime, jint teamId, jboolean transparent, jboolean drawBorder, jint facing);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1build(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toBuildUnitDefId, jfloatArray buildPos_posF3, jint facing, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1build(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toBuildUnitDefId, jfloatArray buildPos_posF3, jint facing, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1stop(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1stop(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1wait(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1wait(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitFor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint time, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitFor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint time, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForDeathOf(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toDieUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForDeathOf(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toDieUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForSquadSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint numUnits, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForSquadSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint numUnits, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForAll(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForAll(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1moveTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1moveTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1patrolTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1patrolTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1fight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1fight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1attack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toAttackUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1attack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toAttackUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1attackArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toAttackPos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1attackArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toAttackPos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1guard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toGuardUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1guard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toGuardUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1aiSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1aiSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1addToGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toGroupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1addToGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toGroupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1removeFromGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1removeFromGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1repair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toRepairUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1repair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toRepairUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint fireState, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint fireState, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint moveState, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint moveState, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray basePos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray basePos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1selfDestruct(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1selfDestruct(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setWantedMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloat wantedMaxSpeed, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setWantedMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloat wantedMaxSpeed, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jintArray toLoadUnitIds, jint toLoadUnitIds_size, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jintArray toLoadUnitIds, jint toLoadUnitIds_size, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadOnto(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint transporterUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadOnto(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint transporterUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1unload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jint toUnloadUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1unload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jint toUnloadUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1unloadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1unloadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setOn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean on, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setOn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean on, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toReclaimUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toReclaimUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toReclaimFeatureId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toReclaimFeatureId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1cloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean cloak, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1cloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean cloak, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1stockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1stockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1dGun(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toAttackUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1dGun(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toAttackUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1dGunPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1dGunPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1restoreArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1restoreArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean repeat, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean repeat, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint trajectory, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint trajectory, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1resurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toResurrectFeatureId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1resurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toResurrectFeatureId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1resurrectInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1resurrectInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1capture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toCaptureUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1capture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toCaptureUnitId, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1captureInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1captureInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setAutoRepairLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint autoRepairLevel, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setAutoRepairLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint autoRepairLevel, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setIdleMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint idleMode, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setIdleMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint idleMode, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1executeCustomCommand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint cmdId, jfloatArray params, jint params_size, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1executeCustomCommand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint cmdId, jfloatArray params, jint params_size, jshort options, jint timeOut);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1traceRay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray rayPos_posF3, jfloatArray rayDir_posF3, jfloat rayLen, jint srcUnitId, jint flags);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1traceRayFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray rayPos_posF3, jfloatArray rayDir_posF3, jfloat rayLen, jint srcUnitId, jint flags);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1setPause(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enable, jstring reason);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1setPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat x, jfloat y);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1setSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat w, jfloat h);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1addPoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloat x, jfloat y);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1deletePoints(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jint numPoints);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1setColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jshortArray color_colorS3);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1setLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jstring label);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1addOverlayTexture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray texData, jint w, jint h);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1update(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloatArray texData, jint x, jint y, jint w, jint h);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1remove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloat x, jfloat y);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloat w, jfloat h);

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jstring label);

#ifdef __cplusplus
} // extern "C"
#endif

#endif // __CALLBACK_JNI_BRIDGE_H


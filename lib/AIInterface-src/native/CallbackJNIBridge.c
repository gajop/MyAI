/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#include "CallbackJNIBridge.h"

#include "CallbackFunctionPointerBridge.h"


JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getMajor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getMajor(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getMinor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getMinor(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getPatchset(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getPatchset(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getCommits(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getCommits(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getHash(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getBranch(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getBranch(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getAdditional(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getAdditional(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getBuildTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getBuildTime(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1isRelease(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Engine_Version_isRelease(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getNormal(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getNormal(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getSync(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getSync(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Engine_1Version_1getFull(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Engine_Version_getFull(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Teams_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Teams_getSize(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAIs_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__SkirmishAIs_getSize(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAIs_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__SkirmishAIs_getMax(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1getTeamId(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__SkirmishAI_getTeamId(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__SkirmishAI_Info_getSize(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__SkirmishAI_Info_getKey(_skirmishAIId, infoIndex);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__SkirmishAI_Info_getValue(_skirmishAIId, infoIndex);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint infoIndex) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__SkirmishAI_Info_getDescription(_skirmishAIId, infoIndex);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1Info_1getValueByKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring key) {

	jstring _ret;

	const char* _retNative;
	const char* const key_native = (const char* const) (*__env)->GetStringUTFChars(__env, key, NULL);
	_retNative = bridged__SkirmishAI_Info_getValueByKey(_skirmishAIId, key_native);
	(*__env)->ReleaseStringUTFChars(__env, key, key_native);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__SkirmishAI_OptionValues_getSize(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint optionIndex) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__SkirmishAI_OptionValues_getKey(_skirmishAIId, optionIndex);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint optionIndex) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__SkirmishAI_OptionValues_getValue(_skirmishAIId, optionIndex);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_SkirmishAI_1OptionValues_1getValueByKey(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring key) {

	jstring _ret;

	const char* _retNative;
	const char* const key_native = (const char* const) (*__env)->GetStringUTFChars(__env, key, NULL);
	_retNative = bridged__SkirmishAI_OptionValues_getValueByKey(_skirmishAIId, key_native);
	(*__env)->ReleaseStringUTFChars(__env, key, key_native);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Log_1log(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring msg) {

	const char* const msg_native = (const char* const) (*__env)->GetStringUTFChars(__env, msg, NULL);
	bridged__Log_log(_skirmishAIId, msg_native);
	(*__env)->ReleaseStringUTFChars(__env, msg, msg_native);
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Log_1exception(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring msg, jint severety, jboolean die) {

	const char* const msg_native = (const char* const) (*__env)->GetStringUTFChars(__env, msg, NULL);
	bridged__Log_exception(_skirmishAIId, msg_native, severety, die);
	(*__env)->ReleaseStringUTFChars(__env, msg, msg_native);
}

JNIEXPORT jchar JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getPathSeparator(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jchar _ret;

	_ret = (jchar) bridged__DataDirs_getPathSeparator(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getConfigDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__DataDirs_getConfigDir(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1getWriteableDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__DataDirs_getWriteableDir(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1locatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jstring relPath, jboolean writeable, jboolean create, jboolean dir, jboolean common) {

	jboolean _ret;

	char* path_native = (char*) (*__env)->GetStringUTFChars(__env, path, NULL);
	const char* const relPath_native = (const char* const) (*__env)->GetStringUTFChars(__env, relPath, NULL);
	_ret = (jboolean) bridged__DataDirs_locatePath(_skirmishAIId, path_native, path_sizeMax, relPath_native, writeable, create, dir, common);
	(*__env)->ReleaseStringUTFChars(__env, path, path_native);
	(*__env)->ReleaseStringUTFChars(__env, relPath, relPath_native);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1allocatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring relPath, jboolean writeable, jboolean create, jboolean dir, jboolean common) {

	jstring _ret;

	char* _retNative;
	const char* const relPath_native = (const char* const) (*__env)->GetStringUTFChars(__env, relPath, NULL);
	_retNative = bridged__DataDirs_allocatePath(_skirmishAIId, relPath_native, writeable, create, dir, common);
	(*__env)->ReleaseStringUTFChars(__env, relPath, relPath_native);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__DataDirs_Roots_getSize(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1getDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jint dirIndex) {

	jboolean _ret;

	char* path_native = (char*) (*__env)->GetStringUTFChars(__env, path, NULL);
	_ret = (jboolean) bridged__DataDirs_Roots_getDir(_skirmishAIId, path_native, path_sizeMax, dirIndex);
	(*__env)->ReleaseStringUTFChars(__env, path, path_native);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1locatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring path, jint path_sizeMax, jstring relPath, jboolean writeable, jboolean create, jboolean dir) {

	jboolean _ret;

	char* path_native = (char*) (*__env)->GetStringUTFChars(__env, path, NULL);
	const char* const relPath_native = (const char* const) (*__env)->GetStringUTFChars(__env, relPath, NULL);
	_ret = (jboolean) bridged__DataDirs_Roots_locatePath(_skirmishAIId, path_native, path_sizeMax, relPath_native, writeable, create, dir);
	(*__env)->ReleaseStringUTFChars(__env, path, path_native);
	(*__env)->ReleaseStringUTFChars(__env, relPath, relPath_native);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_DataDirs_1Roots_1allocatePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring relPath, jboolean writeable, jboolean create, jboolean dir) {

	jstring _ret;

	char* _retNative;
	const char* const relPath_native = (const char* const) (*__env)->GetStringUTFChars(__env, relPath, NULL);
	_retNative = bridged__DataDirs_Roots_allocatePath(_skirmishAIId, relPath_native, writeable, create, dir);
	(*__env)->ReleaseStringUTFChars(__env, relPath, relPath_native);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCurrentFrame(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getCurrentFrame(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getAiInterfaceVersion(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getAiInterfaceVersion(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getMyTeam(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMyAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getMyAllyTeam(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getPlayerTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint playerId) {

	jint _ret;

	_ret = (jint) bridged__Game_getPlayerTeam(_skirmishAIId, playerId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeams(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getTeams(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamSide(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Game_getTeamSide(_skirmishAIId, otherTeamId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jshortArray return_colorS3_out) {

	short* return_colorS3_out_native = NULL;
	if (return_colorS3_out != NULL) {
		return_colorS3_out_native = (short*) (*__env)->GetShortArrayElements(__env, return_colorS3_out, NULL);
	}
	bridged__Game_getTeamColor(_skirmishAIId, otherTeamId, return_colorS3_out_native);
	if (return_colorS3_out != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, return_colorS3_out, (jshort*) return_colorS3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamIncomeMultiplier(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getTeamIncomeMultiplier(_skirmishAIId, otherTeamId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId) {

	jint _ret;

	_ret = (jint) bridged__Game_getTeamAllyTeam(_skirmishAIId, otherTeamId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceCurrent(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getTeamResourceCurrent(_skirmishAIId, otherTeamId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getTeamResourceIncome(_skirmishAIId, otherTeamId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getTeamResourceUsage(_skirmishAIId, otherTeamId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getTeamResourceStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint otherTeamId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getTeamResourceStorage(_skirmishAIId, otherTeamId, resourceId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isAllied(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint firstAllyTeamId, jint secondAllyTeamId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Game_isAllied(_skirmishAIId, firstAllyTeamId, secondAllyTeamId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isExceptionHandlingEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Game_isExceptionHandlingEnabled(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isDebugModeEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Game_isDebugModeEnabled(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Game_getMode(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Game_1isPaused(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Game_isPaused(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Game_1getSpeedFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Game_getSpeedFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Game_1getSetupScript(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Game_getSetupScript(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoryFlag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring categoryName) {

	jint _ret;

	const char* categoryName_native = (const char*) (*__env)->GetStringUTFChars(__env, categoryName, NULL);
	_ret = (jint) bridged__Game_getCategoryFlag(_skirmishAIId, categoryName_native);
	(*__env)->ReleaseStringUTFChars(__env, categoryName, categoryName_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoriesFlag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring categoryNames) {

	jint _ret;

	const char* categoryNames_native = (const char*) (*__env)->GetStringUTFChars(__env, categoryNames, NULL);
	_ret = (jint) bridged__Game_getCategoriesFlag(_skirmishAIId, categoryNames_native);
	(*__env)->ReleaseStringUTFChars(__env, categoryNames, categoryNames_native);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Game_1getCategoryName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint categoryFlag, jstring name, jint name_sizeMax) {

	char* name_native = (char*) (*__env)->GetStringUTFChars(__env, name, NULL);
	bridged__Game_getCategoryName(_skirmishAIId, categoryFlag, name_native, name_sizeMax);
	(*__env)->ReleaseStringUTFChars(__env, name, name_native);
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getViewRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Gui_getViewRange(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getScreenX(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Gui_getScreenX(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Gui_1getScreenY(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Gui_getScreenY(_skirmishAIId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Gui_1Camera_1getDirection(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Gui_Camera_getDirection(_skirmishAIId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Gui_1Camera_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Gui_Camera_getPosition(_skirmishAIId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1isEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Cheats_isEnabled(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enable) {

	jboolean _ret;

	_ret = (jboolean) bridged__Cheats_setEnabled(_skirmishAIId, enable);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setEventsEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enabled) {

	jboolean _ret;

	_ret = (jboolean) bridged__Cheats_setEventsEnabled(_skirmishAIId, enabled);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1isOnlyPassive(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Cheats_isOnlyPassive(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getResources(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__getResources(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getResourceByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring resourceName) {

	jint _ret;

	const char* resourceName_native = (const char*) (*__env)->GetStringUTFChars(__env, resourceName, NULL);
	_ret = (jint) bridged__getResourceByName(_skirmishAIId, resourceName_native);
	(*__env)->ReleaseStringUTFChars(__env, resourceName, resourceName_native);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Resource_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Resource_getName(_skirmishAIId, resourceId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Resource_1getOptimum(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Resource_getOptimum(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getCurrent(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Economy_getCurrent(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Economy_getIncome(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Economy_getUsage(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Economy_1getStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Economy_getStorage(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getUnitDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitDefIds, jint unitDefIds_sizeMax) {

	jint _ret;

	int* unitDefIds_native = NULL;
	if (unitDefIds != NULL) {
		unitDefIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitDefIds, NULL);
	}
	_ret = (jint) bridged__getUnitDefs(_skirmishAIId, unitDefIds_native, unitDefIds_sizeMax);
	if (unitDefIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitDefIds, (jint*) unitDefIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getUnitDefByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring unitName) {

	jint _ret;

	const char* unitName_native = (const char*) (*__env)->GetStringUTFChars(__env, unitName, NULL);
	_ret = (jint) bridged__getUnitDefByName(_skirmishAIId, unitName_native);
	(*__env)->ReleaseStringUTFChars(__env, unitName, unitName_native);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getHeight(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getName(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getHumanName(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getFileName(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAiHint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getAiHint(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCobId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getCobId(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTechLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getTechLevel(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getGaia(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getGaia(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUpkeep(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getUpkeep(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResourceMake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getResourceMake(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMakesResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMakesResource(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getCost(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getExtractsResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getExtractsResource(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResourceExtractorRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getResourceExtractorRange(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWindResourceGenerator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getWindResourceGenerator(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTidalResourceGenerator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTidalResourceGenerator(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getStorage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getStorage(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isSquareResourceExtractor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint resourceId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isSquareResourceExtractor(_skirmishAIId, unitDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getBuildTime(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAutoHeal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getAutoHeal(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getIdleAutoHeal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getIdleAutoHeal(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getIdleTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getIdleTime(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getPower(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getHealth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getCategory(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTurnRate(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTurnInPlace(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isTurnInPlace(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnInPlaceDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTurnInPlaceDistance(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnInPlaceSpeedLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTurnInPlaceSpeedLimit(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isUpright(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isUpright(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCollide(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isCollide(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLosRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getLosRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getAirLosRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getAirLosRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLosHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getLosHeight(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRadarRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getRadarRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSonarRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getSonarRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getJammerRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getJammerRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSonarJamRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getSonarJamRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSeismicRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getSeismicRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSeismicSignature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getSeismicSignature(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isStealth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isSonarStealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isSonarStealth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isBuildRange3D(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isBuildRange3D(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getBuildDistance(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getBuildSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getReclaimSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getReclaimSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRepairSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getRepairSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxRepairSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxRepairSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getResurrectSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getResurrectSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCaptureSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getCaptureSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTerraformSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTerraformSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMass(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isPushResistant(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isPushResistant(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStrafeToAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isStrafeToAttack(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinCollisionSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMinCollisionSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSlideTolerance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getSlideTolerance(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxSlope(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxSlope(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxHeightDif(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxHeightDif(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinWaterDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMinWaterDepth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWaterline(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getWaterline(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxWaterDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxWaterDepth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getArmoredMultiple(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getArmoredMultiple(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getArmorType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getArmorType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_FlankingBonus_getMode(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__UnitDef_FlankingBonus_getDir(_skirmishAIId, unitDefId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_FlankingBonus_getMax(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMin(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_FlankingBonus_getMin(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1FlankingBonus_1getMobilityAdd(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_FlankingBonus_getMobilityAdd(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxWeaponRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxWeaponRange(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getType(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTooltip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getTooltip(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWreckName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getWreckName(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDeathExplosion(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getDeathExplosion(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSelfDExplosion(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getSelfDExplosion(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCategoryString(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_getCategoryString(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSelfD(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToSelfD(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSelfDCountdown(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getSelfDCountdown(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSubmerge(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToSubmerge(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToFly(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToMove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToMove(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToHover(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToHover(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFloater(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isFloater(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isBuilder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isBuilder(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isActivateWhenBuilt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isActivateWhenBuilt(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isOnOffable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isOnOffable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFullHealthFactory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isFullHealthFactory(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFactoryHeadingTakeoff(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isFactoryHeadingTakeoff(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isReclaimable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isReclaimable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCapturable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isCapturable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRestore(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToRestore(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRepair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToRepair(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToSelfRepair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToSelfRepair(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToReclaim(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToReclaim(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToAttack(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToPatrol(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToPatrol(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToFight(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToGuard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToGuard(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToAssist(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToAssist(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAssistable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAssistable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToRepeat(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToFireControl(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToFireControl(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getFireState(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getMoveState(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWingDrag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getWingDrag(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWingAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getWingAngle(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDrag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getDrag(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFrontToSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getFrontToSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getSpeedToFront(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getSpeedToFront(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMyGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMyGravity(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxBank(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxBank(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxPitch(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxPitch(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTurnRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTurnRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWantedHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getWantedHeight(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getVerticalSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getVerticalSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCrash(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToCrash(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHoverAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isHoverAttack(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAirStrafe(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAirStrafe(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDlHoverFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getDlHoverFactor(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxAcceleration(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxDeceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxDeceleration(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxAileron(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxAileron(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxElevator(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxElevator(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxRudder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxRudder(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getYardMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint facing, jshortArray yardMap, jint yardMap_sizeMax) {

	jint _ret;

	short* yardMap_native = NULL;
	if (yardMap != NULL) {
		yardMap_native = (short*) (*__env)->GetShortArrayElements(__env, yardMap, NULL);
	}
	_ret = (jint) bridged__UnitDef_getYardMap(_skirmishAIId, unitDefId, facing, yardMap_native, yardMap_sizeMax);
	if (yardMap != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, yardMap, (jshort*) yardMap_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getXSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getZSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getBuildAngle(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getLoadingRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getLoadingRadius(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUnloadSpread(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getUnloadSpread(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportCapacity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getTransportCapacity(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getTransportSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinTransportSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getMinTransportSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAirBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAirBase(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFirePlatform(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isFirePlatform(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTransportMass(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinTransportMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMinTransportMass(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHoldSteady(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isHoldSteady(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isReleaseHeld(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isReleaseHeld(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isNotTransportable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isNotTransportable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTransportByEnemy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isTransportByEnemy(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTransportUnloadMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getTransportUnloadMethod(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFallSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getFallSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getUnitFallSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getUnitFallSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToCloak(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isStartCloaked(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isStartCloaked(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCloakCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getCloakCost(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCloakCostMoving(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getCloakCostMoving(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDecloakDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getDecloakDistance(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDecloakSpherical(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isDecloakSpherical(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDecloakOnFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isDecloakOnFire(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToKamikaze(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToKamikaze(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getKamikazeDist(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getKamikazeDist(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isTargetingFacility(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isTargetingFacility(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1canManualFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_canManualFire(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isNeedGeo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isNeedGeo(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isFeature(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isHideDamage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isHideDamage(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isCommander(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isCommander(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isShowPlayerName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isShowPlayerName(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToResurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToResurrect(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToCapture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToCapture(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getHighTrajectoryType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getHighTrajectoryType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getNoChaseCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getNoChaseCategory(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isLeaveTracks(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isLeaveTracks(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackWidth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTrackWidth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackOffset(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTrackOffset(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTrackStrength(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackStretch(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getTrackStretch(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getTrackType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getTrackType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToDropFlare(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToDropFlare(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareReloadTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getFlareReloadTime(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareEfficiency(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getFlareEfficiency(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getFlareDelay(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareDropVector(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__UnitDef_getFlareDropVector(_skirmishAIId, unitDefId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getFlareTime(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareSalvoSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getFlareSalvoSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getFlareSalvoDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getFlareSalvoDelay(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isAbleToLoopbackAttack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isAbleToLoopbackAttack(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isLevelGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isLevelGround(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isUseBuildingGroundDecal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isUseBuildingGroundDecal(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getBuildingDecalType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalSizeX(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getBuildingDecalSizeX(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalSizeY(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getBuildingDecalSizeY(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildingDecalDecaySpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getBuildingDecalDecaySpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxFuel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMaxFuel(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getRefuelTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getRefuelTime(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMinAirBasePower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_getMinAirBasePower(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getMaxThisUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getMaxThisUnit(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getDecoyDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getDecoyDef(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isDontLand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isDontLand(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getShieldDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getShieldDef(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getStockpileDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getStockpileDef(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getBuildOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jintArray unitDefIds, jint unitDefIds_sizeMax) {

	jint _ret;

	int* unitDefIds_native = NULL;
	if (unitDefIds != NULL) {
		unitDefIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitDefIds, NULL);
	}
	_ret = (jint) bridged__UnitDef_getBuildOptions(_skirmishAIId, unitDefId, unitDefIds_native, unitDefIds_sizeMax);
	if (unitDefIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitDefIds, (jint*) unitDefIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jobjectArray keys, jobjectArray values) {

	jint _ret;

	const char** keys_native = NULL;
	if (keys != NULL) {
		const int keys_native_size = (int) (*__env)->GetArrayLength(__env, keys);
		keys_native = (const char**) calloc(sizeof(char*), keys_native_size);
		int keys_native_i;
		jstring keys_native_jStr;
		for (keys_native_i=0; keys_native_i < keys_native_size; ++keys_native_i) {
			keys_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, keys, keys_native_i);
			keys_native[keys_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, keys_native_jStr, NULL);
		}
	}
	const char** values_native = NULL;
	if (values != NULL) {
		const int values_native_size = (int) (*__env)->GetArrayLength(__env, values);
		values_native = (const char**) calloc(sizeof(char*), values_native_size);
		int values_native_i;
		jstring values_native_jStr;
		for (values_native_i=0; values_native_i < values_native_size; ++values_native_i) {
			values_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, values, values_native_i);
			values_native[values_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, values_native_jStr, NULL);
		}
	}
	_ret = (jint) bridged__UnitDef_getCustomParams(_skirmishAIId, unitDefId, keys_native, values_native);
	if (keys != NULL) {
	}
	if (values != NULL) {
	}

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1isMoveDataAvailable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_isMoveDataAvailable(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getMaxAcceleration(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxBreaking(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getMaxBreaking(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getMaxSpeed(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jshort _ret;

	_ret = (jshort) bridged__UnitDef_MoveData_getMaxTurnRate(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getXSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getZSize(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getDepth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getDepth(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMaxSlope(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getMaxSlope(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getSlopeMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getSlopeMod(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getDepthMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getDepthMod(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getPathType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getPathType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getCrushStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_MoveData_getCrushStrength(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMoveType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getMoveType(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getMoveFamily(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getMoveFamily(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getTerrainClass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_MoveData_getTerrainClass(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getFollowGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_MoveData_getFollowGround(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1isSubMarine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__UnitDef_MoveData_isSubMarine(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1MoveData_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_MoveData_getName(_skirmishAIId, unitDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1getWeaponMounts(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_getWeaponMounts(_skirmishAIId, unitDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__UnitDef_WeaponMount_getName(_skirmishAIId, unitDefId, weaponMountId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getWeaponDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_WeaponMount_getWeaponDef(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getSlavedTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_WeaponMount_getSlavedTo(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getMainDir(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__UnitDef_WeaponMount_getMainDir(_skirmishAIId, unitDefId, weaponMountId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getMaxAngleDif(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_WeaponMount_getMaxAngleDif(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getFuelUsage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jfloat _ret;

	_ret = (jfloat) bridged__UnitDef_WeaponMount_getFuelUsage(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getBadTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_WeaponMount_getBadTargetCategory(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_UnitDef_1WeaponMount_1getOnlyTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jint weaponMountId) {

	jint _ret;

	_ret = (jint) bridged__UnitDef_WeaponMount_getOnlyTargetCategory(_skirmishAIId, unitDefId, weaponMountId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getLimit(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMax(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getMax(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getEnemyUnits(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getEnemyUnitsIn(_skirmishAIId, pos_posF3_native, radius, unitIds_native, unitIds_sizeMax);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getEnemyUnitsInRadarAndLos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getEnemyUnitsInRadarAndLos(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFriendlyUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getFriendlyUnits(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFriendlyUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getFriendlyUnitsIn(_skirmishAIId, pos_posF3_native, radius, unitIds_native, unitIds_sizeMax);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getNeutralUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getNeutralUnits(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getNeutralUnitsIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getNeutralUnitsIn(_skirmishAIId, pos_posF3_native, radius, unitIds_native, unitIds_sizeMax);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getTeamUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getTeamUnits(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getSelectedUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_sizeMax) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__getSelectedUnits(_skirmishAIId, unitIds_native, unitIds_sizeMax);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getDef(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getModParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getModParams(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1ModParam_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint modParamId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Unit_ModParam_getName(_skirmishAIId, unitId, modParamId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1ModParam_1getValue(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint modParamId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_ModParam_getValue(_skirmishAIId, unitId, modParamId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getTeam(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getAllyTeam(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getAllyTeam(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getAiHint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getAiHint(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getStockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getStockpile(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getStockpileQueued(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getStockpileQueued(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getCurrentFuel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getCurrentFuel(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getMaxSpeed(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getMaxRange(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getMaxHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getMaxHealth(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getExperience(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getExperience(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getGroup(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getCurrentCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getCurrentCommands(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_CurrentCommand_getType(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId) {

	jint _ret;

	_ret = (jint) bridged__Unit_CurrentCommand_getId(_skirmishAIId, unitId, commandId);

	return _ret;
}

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId) {

	jshort _ret;

	_ret = (jshort) bridged__Unit_CurrentCommand_getOptions(_skirmishAIId, unitId, commandId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId) {

	jint _ret;

	_ret = (jint) bridged__Unit_CurrentCommand_getTag(_skirmishAIId, unitId, commandId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getTimeOut(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId) {

	jint _ret;

	_ret = (jint) bridged__Unit_CurrentCommand_getTimeOut(_skirmishAIId, unitId, commandId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1CurrentCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint commandId, jfloatArray params, jint params_sizeMax) {

	jint _ret;

	float* params_native = NULL;
	if (params != NULL) {
		params_native = (float*) (*__env)->GetFloatArrayElements(__env, params, NULL);
	}
	_ret = (jint) bridged__Unit_CurrentCommand_getParams(_skirmishAIId, unitId, commandId, params_native, params_sizeMax);
	if (params != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, params, (jfloat*) params_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getSupportedCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getSupportedCommands(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId) {

	jint _ret;

	_ret = (jint) bridged__Unit_SupportedCommand_getId(_skirmishAIId, unitId, supportedCommandId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Unit_SupportedCommand_getName(_skirmishAIId, unitId, supportedCommandId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getToolTip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Unit_SupportedCommand_getToolTip(_skirmishAIId, unitId, supportedCommandId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1isShowUnique(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_SupportedCommand_isShowUnique(_skirmishAIId, unitId, supportedCommandId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1isDisabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_SupportedCommand_isDisabled(_skirmishAIId, unitId, supportedCommandId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1SupportedCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint supportedCommandId, jobjectArray params, jint params_sizeMax) {

	jint _ret;

	const char** params_native = NULL;
	if (params != NULL) {
		const int params_native_size = (int) (*__env)->GetArrayLength(__env, params);
		params_native = (const char**) calloc(sizeof(char*), params_native_size);
		int params_native_i;
		jstring params_native_jStr;
		for (params_native_i=0; params_native_i < params_native_size; ++params_native_i) {
			params_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, params, params_native_i);
			params_native[params_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, params_native_jStr, NULL);
		}
	}
	_ret = (jint) bridged__Unit_SupportedCommand_getParams(_skirmishAIId, unitId, supportedCommandId, params_native, params_sizeMax);
	if (params != NULL) {
	}

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getHealth(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getSpeed(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getPower(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getResourceUse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getResourceUse(_skirmishAIId, unitId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getResourceMake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Unit_getResourceMake(_skirmishAIId, unitId, resourceId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getPos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Unit_getPos(_skirmishAIId, unitId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getVel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Unit_getVel(_skirmishAIId, unitId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isActivated(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_isActivated(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isBeingBuilt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_isBeingBuilt(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isCloaked(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_isCloaked(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isParalyzed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_isParalyzed(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Unit_1isNeutral(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Unit_isNeutral(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getBuildingFacing(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getBuildingFacing(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1getLastUserOrderFrame(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId) {

	jint _ret;

	_ret = (jint) bridged__Unit_getLastUserOrderFrame(_skirmishAIId, unitId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getGroups(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray groupIds, jint groupIds_sizeMax) {

	jint _ret;

	int* groupIds_native = NULL;
	if (groupIds != NULL) {
		groupIds_native = (int*) (*__env)->GetIntArrayElements(__env, groupIds, NULL);
	}
	_ret = (jint) bridged__getGroups(_skirmishAIId, groupIds_native, groupIds_sizeMax);
	if (groupIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, groupIds, (jint*) groupIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1getSupportedCommands(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jint _ret;

	_ret = (jint) bridged__Group_getSupportedCommands(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId) {

	jint _ret;

	_ret = (jint) bridged__Group_SupportedCommand_getId(_skirmishAIId, groupId, supportedCommandId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Group_SupportedCommand_getName(_skirmishAIId, groupId, supportedCommandId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getToolTip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Group_SupportedCommand_getToolTip(_skirmishAIId, groupId, supportedCommandId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1isShowUnique(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Group_SupportedCommand_isShowUnique(_skirmishAIId, groupId, supportedCommandId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1isDisabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Group_SupportedCommand_isDisabled(_skirmishAIId, groupId, supportedCommandId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1SupportedCommand_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint supportedCommandId, jobjectArray params, jint params_sizeMax) {

	jint _ret;

	const char** params_native = NULL;
	if (params != NULL) {
		const int params_native_size = (int) (*__env)->GetArrayLength(__env, params);
		params_native = (const char**) calloc(sizeof(char*), params_native_size);
		int params_native_i;
		jstring params_native_jStr;
		for (params_native_i=0; params_native_i < params_native_size; ++params_native_i) {
			params_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, params, params_native_i);
			params_native[params_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, params_native_jStr, NULL);
		}
	}
	_ret = (jint) bridged__Group_SupportedCommand_getParams(_skirmishAIId, groupId, supportedCommandId, params_native, params_sizeMax);
	if (params != NULL) {
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getId(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jint _ret;

	_ret = (jint) bridged__Group_OrderPreview_getId(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getOptions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jshort _ret;

	_ret = (jshort) bridged__Group_OrderPreview_getOptions(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jint _ret;

	_ret = (jint) bridged__Group_OrderPreview_getTag(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getTimeOut(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jint _ret;

	_ret = (jint) bridged__Group_OrderPreview_getTimeOut(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1OrderPreview_1getParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray params, jint params_sizeMax) {

	jint _ret;

	float* params_native = NULL;
	if (params != NULL) {
		params_native = (float*) (*__env)->GetFloatArrayElements(__env, params, NULL);
	}
	_ret = (jint) bridged__Group_OrderPreview_getParams(_skirmishAIId, groupId, params_native, params_sizeMax);
	if (params != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, params, (jfloat*) params_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Group_1isSelected(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Group_isSelected(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getFileName(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getHash(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getHumanName(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getShortName(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getShortName(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getVersion(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getVersion(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getMutator(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getMutator(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Mod_getDescription(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAllowTeamColors(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Mod_getAllowTeamColors(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecay(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Mod_getConstructionDecay(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecayTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getConstructionDecayTime(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getConstructionDecaySpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getConstructionDecaySpeed(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getMultiReclaim(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getMultiReclaim(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getReclaimMethod(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitMethod(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getReclaimUnitMethod(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getReclaimUnitEnergyCostFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimUnitEfficiency(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getReclaimUnitEfficiency(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimFeatureEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getReclaimFeatureEnergyCostFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimAllowEnemies(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Mod_getReclaimAllowEnemies(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getReclaimAllowAllies(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Mod_getReclaimAllowAllies(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getRepairEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getRepairEnergyCostFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getResurrectEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getResurrectEnergyCostFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getCaptureEnergyCostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getCaptureEnergyCostFactor(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getTransportGround(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportHover(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getTransportHover(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportShip(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getTransportShip(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getTransportAir(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getTransportAir(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFireAtKilled(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getFireAtKilled(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFireAtCrashing(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getFireAtCrashing(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getFlankingBonusModeDefault(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getFlankingBonusModeDefault(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getLosMipLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getLosMipLevel(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAirMipLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Mod_getAirMipLevel(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getLosMul(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getLosMul(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getAirLosMul(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Mod_getAirLosMul(_skirmishAIId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Mod_1getRequireSonarUnderWater(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Mod_getRequireSonarUnderWater(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getChecksum(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Map_getChecksum(_skirmishAIId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getStartPos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_getStartPos(_skirmishAIId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMousePos(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_getMousePos(_skirmishAIId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Map_1isPosInCamera(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius) {

	jboolean _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jboolean) bridged__Map_isPosInCamera(_skirmishAIId, pos_posF3_native, radius);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getWidth(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Map_getWidth(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Map_getHeight(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHeightMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray heights, jint heights_sizeMax) {

	jint _ret;

	float* heights_native = NULL;
	if (heights != NULL) {
		heights_native = (float*) (*__env)->GetFloatArrayElements(__env, heights, NULL);
	}
	_ret = (jint) bridged__Map_getHeightMap(_skirmishAIId, heights_native, heights_sizeMax);
	if (heights != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, heights, (jfloat*) heights_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getCornersHeightMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray cornerHeights, jint cornerHeights_sizeMax) {

	jint _ret;

	float* cornerHeights_native = NULL;
	if (cornerHeights != NULL) {
		cornerHeights_native = (float*) (*__env)->GetFloatArrayElements(__env, cornerHeights, NULL);
	}
	_ret = (jint) bridged__Map_getCornersHeightMap(_skirmishAIId, cornerHeights_native, cornerHeights_sizeMax);
	if (cornerHeights != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, cornerHeights, (jfloat*) cornerHeights_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMinHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getMinHeight(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getMaxHeight(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getSlopeMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray slopes, jint slopes_sizeMax) {

	jint _ret;

	float* slopes_native = NULL;
	if (slopes != NULL) {
		slopes_native = (float*) (*__env)->GetFloatArrayElements(__env, slopes, NULL);
	}
	_ret = (jint) bridged__Map_getSlopeMap(_skirmishAIId, slopes_native, slopes_sizeMax);
	if (slopes != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, slopes, (jfloat*) slopes_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getLosMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray losValues, jint losValues_sizeMax) {

	jint _ret;

	int* losValues_native = NULL;
	if (losValues != NULL) {
		losValues_native = (int*) (*__env)->GetIntArrayElements(__env, losValues, NULL);
	}
	_ret = (jint) bridged__Map_getLosMap(_skirmishAIId, losValues_native, losValues_sizeMax);
	if (losValues != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, losValues, (jint*) losValues_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getRadarMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray radarValues, jint radarValues_sizeMax) {

	jint _ret;

	int* radarValues_native = NULL;
	if (radarValues != NULL) {
		radarValues_native = (int*) (*__env)->GetIntArrayElements(__env, radarValues, NULL);
	}
	_ret = (jint) bridged__Map_getRadarMap(_skirmishAIId, radarValues_native, radarValues_sizeMax);
	if (radarValues != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, radarValues, (jint*) radarValues_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getJammerMap(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray jammerValues, jint jammerValues_sizeMax) {

	jint _ret;

	int* jammerValues_native = NULL;
	if (jammerValues != NULL) {
		jammerValues_native = (int*) (*__env)->GetIntArrayElements(__env, jammerValues, NULL);
	}
	_ret = (jint) bridged__Map_getJammerMap(_skirmishAIId, jammerValues_native, jammerValues_sizeMax);
	if (jammerValues != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, jammerValues, (jint*) jammerValues_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapRaw(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jshortArray resources, jint resources_sizeMax) {

	jint _ret;

	short* resources_native = NULL;
	if (resources != NULL) {
		resources_native = (short*) (*__env)->GetShortArrayElements(__env, resources, NULL);
	}
	_ret = (jint) bridged__Map_getResourceMapRaw(_skirmishAIId, resourceId, resources_native, resources_sizeMax);
	if (resources != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, resources, (jshort*) resources_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsPositions(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloatArray spots_AposF3, jint spots_AposF3_sizeMax) {

	jint _ret;

	float* spots_AposF3_native = NULL;
	if (spots_AposF3 != NULL) {
		spots_AposF3_native = (float*) (*__env)->GetFloatArrayElements(__env, spots_AposF3, NULL);
	}
	_ret = (jint) bridged__Map_getResourceMapSpotsPositions(_skirmishAIId, resourceId, spots_AposF3_native, spots_AposF3_sizeMax);
	if (spots_AposF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, spots_AposF3, (jfloat*) spots_AposF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsAverageIncome(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getResourceMapSpotsAverageIncome(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1getResourceMapSpotsNearest(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloatArray pos_posF3, jfloatArray return_posF3_out) {

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_getResourceMapSpotsNearest(_skirmishAIId, resourceId, pos_posF3_native, return_posF3_out_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHash(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Map_getHash(_skirmishAIId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Map_getName(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1getHumanName(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Map_getHumanName(_skirmishAIId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getElevationAt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat x, jfloat z) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getElevationAt(_skirmishAIId, x, z);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getMaxResource(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getExtractorRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getExtractorRadius(_skirmishAIId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMinWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getMinWind(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getMaxWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getMaxWind(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getCurWind(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getCurWind(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getTidalStrength(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getTidalStrength(_skirmishAIId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Map_1getGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Map_getGravity(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getPoints(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean includeAllies) {

	jint _ret;

	_ret = (jint) bridged__Map_getPoints(_skirmishAIId, includeAllies);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_Point_getPosition(_skirmishAIId, pointId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId, jshortArray return_colorS3_out) {

	short* return_colorS3_out_native = NULL;
	if (return_colorS3_out != NULL) {
		return_colorS3_out_native = (short*) (*__env)->GetShortArrayElements(__env, return_colorS3_out, NULL);
	}
	bridged__Map_Point_getColor(_skirmishAIId, pointId, return_colorS3_out_native);
	if (return_colorS3_out != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, return_colorS3_out, (jshort*) return_colorS3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_Map_1Point_1getLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pointId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__Map_Point_getLabel(_skirmishAIId, pointId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1getLines(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean includeAllies) {

	jint _ret;

	_ret = (jint) bridged__Map_getLines(_skirmishAIId, includeAllies);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getFirstPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_Line_getFirstPosition(_skirmishAIId, lineId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getSecondPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_Line_getSecondPosition(_skirmishAIId, lineId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1Line_1getColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jshortArray return_colorS3_out) {

	short* return_colorS3_out_native = NULL;
	if (return_colorS3_out != NULL) {
		return_colorS3_out_native = (short*) (*__env)->GetShortArrayElements(__env, return_colorS3_out, NULL);
	}
	bridged__Map_Line_getColor(_skirmishAIId, lineId, return_colorS3_out_native);
	if (return_colorS3_out != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, return_colorS3_out, (jshort*) return_colorS3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Map_1isPossibleToBuildAt(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3, jint facing) {

	jboolean _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jboolean) bridged__Map_isPossibleToBuildAt(_skirmishAIId, unitDefId, pos_posF3_native, facing);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Map_1findClosestBuildSite(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3, jfloat searchRadius, jint minDist, jint facing, jfloatArray return_posF3_out) {

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Map_findClosestBuildSite(_skirmishAIId, unitDefId, pos_posF3_native, searchRadius, minDist, facing, return_posF3_out_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeatureDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray featureDefIds, jint featureDefIds_sizeMax) {

	jint _ret;

	int* featureDefIds_native = NULL;
	if (featureDefIds != NULL) {
		featureDefIds_native = (int*) (*__env)->GetIntArrayElements(__env, featureDefIds, NULL);
	}
	_ret = (jint) bridged__getFeatureDefs(_skirmishAIId, featureDefIds_native, featureDefIds_sizeMax);
	if (featureDefIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, featureDefIds, (jint*) featureDefIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__FeatureDef_getName(_skirmishAIId, featureDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__FeatureDef_getDescription(_skirmishAIId, featureDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__FeatureDef_getFileName(_skirmishAIId, featureDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getContainedResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__FeatureDef_getContainedResource(_skirmishAIId, featureDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getMaxHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__FeatureDef_getMaxHealth(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getReclaimTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__FeatureDef_getReclaimTime(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getMass(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__FeatureDef_getMass(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isUpright(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isUpright(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDrawType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jint _ret;

	_ret = (jint) bridged__FeatureDef_getDrawType(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getModelName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__FeatureDef_getModelName(_skirmishAIId, featureDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getResurrectable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jint _ret;

	_ret = (jint) bridged__FeatureDef_getResurrectable(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getSmokeTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jint _ret;

	_ret = (jint) bridged__FeatureDef_getSmokeTime(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isDestructable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isDestructable(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isReclaimable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isReclaimable(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isBlocking(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isBlocking(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isBurnable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isBurnable(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isFloating(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isFloating(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isNoSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isNoSelect(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1isGeoThermal(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__FeatureDef_isGeoThermal(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getDeathFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__FeatureDef_getDeathFeature(_skirmishAIId, featureDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getXSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jint _ret;

	_ret = (jint) bridged__FeatureDef_getXSize(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getZSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId) {

	jint _ret;

	_ret = (jint) bridged__FeatureDef_getZSize(_skirmishAIId, featureDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_FeatureDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureDefId, jobjectArray keys, jobjectArray values) {

	jint _ret;

	const char** keys_native = NULL;
	if (keys != NULL) {
		const int keys_native_size = (int) (*__env)->GetArrayLength(__env, keys);
		keys_native = (const char**) calloc(sizeof(char*), keys_native_size);
		int keys_native_i;
		jstring keys_native_jStr;
		for (keys_native_i=0; keys_native_i < keys_native_size; ++keys_native_i) {
			keys_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, keys, keys_native_i);
			keys_native[keys_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, keys_native_jStr, NULL);
		}
	}
	const char** values_native = NULL;
	if (values != NULL) {
		const int values_native_size = (int) (*__env)->GetArrayLength(__env, values);
		values_native = (const char**) calloc(sizeof(char*), values_native_size);
		int values_native_i;
		jstring values_native_jStr;
		for (values_native_i=0; values_native_i < values_native_size; ++values_native_i) {
			values_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, values, values_native_i);
			values_native[values_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, values_native_jStr, NULL);
		}
	}
	_ret = (jint) bridged__FeatureDef_getCustomParams(_skirmishAIId, featureDefId, keys_native, values_native);
	if (keys != NULL) {
	}
	if (values != NULL) {
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeatures(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray featureIds, jint featureIds_sizeMax) {

	jint _ret;

	int* featureIds_native = NULL;
	if (featureIds != NULL) {
		featureIds_native = (int*) (*__env)->GetIntArrayElements(__env, featureIds, NULL);
	}
	_ret = (jint) bridged__getFeatures(_skirmishAIId, featureIds_native, featureIds_sizeMax);
	if (featureIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, featureIds, (jint*) featureIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getFeaturesIn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jfloat radius, jintArray featureIds, jint featureIds_sizeMax) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	int* featureIds_native = NULL;
	if (featureIds != NULL) {
		featureIds_native = (int*) (*__env)->GetIntArrayElements(__env, featureIds, NULL);
	}
	_ret = (jint) bridged__getFeaturesIn(_skirmishAIId, pos_posF3_native, radius, featureIds_native, featureIds_sizeMax);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (featureIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, featureIds, (jint*) featureIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getDef(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId) {

	jint _ret;

	_ret = (jint) bridged__Feature_getDef(_skirmishAIId, featureId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getHealth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Feature_getHealth(_skirmishAIId, featureId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getReclaimLeft(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId) {

	jfloat _ret;

	_ret = (jfloat) bridged__Feature_getReclaimLeft(_skirmishAIId, featureId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_Feature_1getPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint featureId, jfloatArray return_posF3_out) {

	float* return_posF3_out_native = NULL;
	if (return_posF3_out != NULL) {
		return_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, return_posF3_out, NULL);
	}
	bridged__Feature_getPosition(_skirmishAIId, featureId, return_posF3_out_native);
	if (return_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, return_posF3_out, (jfloat*) return_posF3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getWeaponDefs(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__getWeaponDefs(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_getWeaponDefByName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring weaponDefName) {

	jint _ret;

	const char* weaponDefName_native = (const char*) (*__env)->GetStringUTFChars(__env, weaponDefName, NULL);
	_ret = (jint) bridged__getWeaponDefByName(_skirmishAIId, weaponDefName_native);
	(*__env)->ReleaseStringUTFChars(__env, weaponDefName, weaponDefName_native);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__WeaponDef_getName(_skirmishAIId, weaponDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__WeaponDef_getType(_skirmishAIId, weaponDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDescription(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__WeaponDef_getDescription(_skirmishAIId, weaponDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFileName(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__WeaponDef_getFileName(_skirmishAIId, weaponDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jstring JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCegTag(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jstring _ret;

	const char* _retNative;
	_retNative = bridged__WeaponDef_getCegTag(_skirmishAIId, weaponDefId);
	_ret = (*__env)->NewStringUTF(__env, _retNative);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getRange(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHeightMod(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getHeightMod(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getAccuracy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getAccuracy(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSprayAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getSprayAngle(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMovingAccuracy(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getMovingAccuracy(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetMoveError(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getTargetMoveError(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLeadLimit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getLeadLimit(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLeadBonus(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getLeadBonus(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getPredictBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getPredictBoost(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getNumDamageTypes(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getNumDamageTypes(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getParalyzeDamageTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_Damage_getParalyzeDamageTime(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getImpulseFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Damage_getImpulseFactor(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getImpulseBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Damage_getImpulseBoost(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getCraterMult(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Damage_getCraterMult(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getCraterBoost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Damage_getCraterBoost(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Damage_1getTypes(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jfloatArray types, jint types_sizeMax) {

	jint _ret;

	float* types_native = NULL;
	if (types != NULL) {
		types_native = (float*) (*__env)->GetFloatArrayElements(__env, types, NULL);
	}
	_ret = (jint) bridged__WeaponDef_Damage_getTypes(_skirmishAIId, weaponDefId, types_native, types_sizeMax);
	if (types != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, types, (jfloat*) types_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getAreaOfEffect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getAreaOfEffect(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoSelfDamage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isNoSelfDamage(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFireStarter(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getFireStarter(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getEdgeEffectiveness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getEdgeEffectiveness(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getSize(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSizeGrowth(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getSizeGrowth(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCollisionSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCollisionSize(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSalvoSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getSalvoSize(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getSalvoDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getSalvoDelay(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getReload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getReload(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBeamTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getBeamTime(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isBeamBurst(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isBeamBurst(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isWaterBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isWaterBounce(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isGroundBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isGroundBounce(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBounceRebound(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getBounceRebound(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getBounceSlip(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getBounceSlip(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getNumBounce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getNumBounce(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMaxAngle(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getMaxAngle(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getUpTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getUpTime(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFlightTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getFlightTime(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCost(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCost(_skirmishAIId, weaponDefId, resourceId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProjectilesPerShot(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getProjectilesPerShot(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isTurret(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isTurret(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isOnlyForward(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isOnlyForward(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isFixedLauncher(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isFixedLauncher(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isWaterWeapon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isWaterWeapon(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isFireSubmersed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isFireSubmersed(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSubMissile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isSubMissile(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isTracks(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isTracks(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isDropped(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isDropped(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isParalyzer(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isParalyzer(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isImpactOnly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isImpactOnly(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoAutoTarget(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isNoAutoTarget(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isManualFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isManualFire(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getInterceptor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getInterceptor(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getTargetable(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isStockpileable(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isStockpileable(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCoverageRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCoverageRange(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getStockpileTime(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getStockpileTime(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getIntensity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getIntensity(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getThickness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getThickness(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLaserFlareSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getLaserFlareSize(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCoreThickness(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCoreThickness(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDuration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getDuration(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getLodDistance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getLodDistance(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getFalloffRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getFalloffRate(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getGraphicsType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getGraphicsType(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSoundTrigger(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isSoundTrigger(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSelfExplode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isSelfExplode(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isGravityAffected(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isGravityAffected(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHighTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getHighTrajectory(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMyGravity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getMyGravity(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isNoExplode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isNoExplode(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getStartVelocity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getStartVelocity(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getWeaponAcceleration(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getWeaponAcceleration(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTurnRate(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getTurnRate(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMaxVelocity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getMaxVelocity(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProjectileSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getProjectileSpeed(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getExplosionSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getExplosionSpeed(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getOnlyTargetCategory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getOnlyTargetCategory(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getWobble(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getWobble(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDance(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getDance(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTrajectoryHeight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getTrajectoryHeight(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isLargeBeamLaser(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isLargeBeamLaser(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isShield(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isShieldRepulser(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isShieldRepulser(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSmartShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isSmartShield(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isExteriorShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isExteriorShield(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isVisibleShield(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isVisibleShield(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isVisibleShieldRepulse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isVisibleShieldRepulse(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getVisibleShieldHitFrames(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getVisibleShieldHitFrames(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getResourceUse(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getResourceUse(_skirmishAIId, weaponDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getRadius(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getRadius(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getForce(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getForce(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getMaxSpeed(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getPower(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPowerRegen(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getPowerRegen(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getPowerRegenResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jint resourceId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getPowerRegenResource(_skirmishAIId, weaponDefId, resourceId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getStartingPower(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_Shield_getStartingPower(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getRechargeDelay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_Shield_getRechargeDelay(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getGoodColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jshortArray return_colorS3_out) {

	short* return_colorS3_out_native = NULL;
	if (return_colorS3_out != NULL) {
		return_colorS3_out_native = (short*) (*__env)->GetShortArrayElements(__env, return_colorS3_out, NULL);
	}
	bridged__WeaponDef_Shield_getGoodColor(_skirmishAIId, weaponDefId, return_colorS3_out_native);
	if (return_colorS3_out != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, return_colorS3_out, (jshort*) return_colorS3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT void JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getBadColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jshortArray return_colorS3_out) {

	short* return_colorS3_out_native = NULL;
	if (return_colorS3_out != NULL) {
		return_colorS3_out_native = (short*) (*__env)->GetShortArrayElements(__env, return_colorS3_out, NULL);
	}
	bridged__WeaponDef_Shield_getBadColor(_skirmishAIId, weaponDefId, return_colorS3_out_native);
	if (return_colorS3_out != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, return_colorS3_out, (jshort*) return_colorS3_out_native, 0 /* copy back changes and release */);
	}
}

JNIEXPORT jshort JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getAlpha(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jshort _ret;

	_ret = (jshort) bridged__WeaponDef_Shield_getAlpha(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1Shield_1getInterceptType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_Shield_getInterceptType(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getInterceptedByShieldType(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getInterceptedByShieldType(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidFriendly(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isAvoidFriendly(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isAvoidFeature(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAvoidNeutral(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isAvoidNeutral(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getTargetBorder(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getTargetBorder(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCylinderTargetting(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCylinderTargetting(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getMinIntensity(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getMinIntensity(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getHeightBoostFactor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getHeightBoostFactor(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getProximityPriority(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getProximityPriority(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCollisionFlags(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jint _ret;

	_ret = (jint) bridged__WeaponDef_getCollisionFlags(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isSweepFire(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isSweepFire(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isAbleToAttackGround(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isAbleToAttackGround(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCameraShake(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getCameraShake(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageExp(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getDynDamageExp(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageMin(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getDynDamageMin(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jfloat JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getDynDamageRange(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jfloat _ret;

	_ret = (jfloat) bridged__WeaponDef_getDynDamageRange(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1isDynDamageInverted(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId) {

	jboolean _ret;

	_ret = (jboolean) bridged__WeaponDef_isDynDamageInverted(_skirmishAIId, weaponDefId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_WeaponDef_1getCustomParams(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint weaponDefId, jobjectArray keys, jobjectArray values) {

	jint _ret;

	const char** keys_native = NULL;
	if (keys != NULL) {
		const int keys_native_size = (int) (*__env)->GetArrayLength(__env, keys);
		keys_native = (const char**) calloc(sizeof(char*), keys_native_size);
		int keys_native_i;
		jstring keys_native_jStr;
		for (keys_native_i=0; keys_native_i < keys_native_size; ++keys_native_i) {
			keys_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, keys, keys_native_i);
			keys_native[keys_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, keys_native_jStr, NULL);
		}
	}
	const char** values_native = NULL;
	if (values != NULL) {
		const int values_native_size = (int) (*__env)->GetArrayLength(__env, values);
		values_native = (const char**) calloc(sizeof(char*), values_native_size);
		int values_native_i;
		jstring values_native_jStr;
		for (values_native_i=0; values_native_i < values_native_size; ++values_native_i) {
			values_native_jStr = (jstring) (*__env)->GetObjectArrayElement(__env, values, values_native_i);
			values_native[values_native_i] = (const char*) (*__env)->GetStringUTFChars(__env, values_native_jStr, NULL);
		}
	}
	_ret = (jint) bridged__WeaponDef_getCustomParams(_skirmishAIId, weaponDefId, keys_native, values_native);
	if (keys != NULL) {
	}
	if (values != NULL) {
	}

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1isEnabled(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Debug_GraphDrawer_isEnabled(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1setMyIncomeMultiplier(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat factor) {

	jint _ret;

	_ret = (jint) bridged__Cheats_setMyIncomeMultiplier(_skirmishAIId, factor);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1giveMeResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloat amount) {

	jint _ret;

	_ret = (jint) bridged__Cheats_giveMeResource(_skirmishAIId, resourceId, amount);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Cheats_1giveMeUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitDefId, jfloatArray pos_posF3) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Cheats_giveMeUnit(_skirmishAIId, unitDefId, pos_posF3_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1sendTextMessage(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring text, jint zone) {

	jint _ret;

	const char* text_native = (const char*) (*__env)->GetStringUTFChars(__env, text, NULL);
	_ret = (jint) bridged__Game_sendTextMessage(_skirmishAIId, text_native, zone);
	(*__env)->ReleaseStringUTFChars(__env, text, text_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1setLastMessagePosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Game_setLastMessagePosition(_skirmishAIId, pos_posF3_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jboolean JNICALL Java_com_springrts_ai_JniAICallback_Economy_1sendResource(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint resourceId, jfloat amount, jint receivingTeamId) {

	jboolean _ret;

	_ret = (jboolean) bridged__Economy_sendResource(_skirmishAIId, resourceId, amount, receivingTeamId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Economy_1sendUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jintArray unitIds, jint unitIds_size, jint receivingTeamId) {

	jint _ret;

	int* unitIds_native = NULL;
	if (unitIds != NULL) {
		unitIds_native = (int*) (*__env)->GetIntArrayElements(__env, unitIds, NULL);
	}
	_ret = (jint) bridged__Economy_sendUnits(_skirmishAIId, unitIds_native, unitIds_size, receivingTeamId);
	if (unitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, unitIds, (jint*) unitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1create(JNIEnv* __env, jobject __obj, jint _skirmishAIId) {

	jint _ret;

	_ret = (jint) bridged__Group_create(_skirmishAIId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1erase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId) {

	jint _ret;

	_ret = (jint) bridged__Group_erase(_skirmishAIId, groupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1initPath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray start_posF3, jfloatArray end_posF3, jint pathType, jfloat goalRadius) {

	jint _ret;

	float* start_posF3_native = NULL;
	if (start_posF3 != NULL) {
		start_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, start_posF3, NULL);
	}
	float* end_posF3_native = NULL;
	if (end_posF3 != NULL) {
		end_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, end_posF3, NULL);
	}
	_ret = (jint) bridged__Pathing_initPath(_skirmishAIId, start_posF3_native, end_posF3_native, pathType, goalRadius);
	if (start_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, start_posF3, (jfloat*) start_posF3_native, 0 /* copy back changes and release */);
	}
	if (end_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, end_posF3, (jfloat*) end_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1getApproximateLength(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray start_posF3, jfloatArray end_posF3, jint pathType, jfloat goalRadius) {

	jint _ret;

	float* start_posF3_native = NULL;
	if (start_posF3 != NULL) {
		start_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, start_posF3, NULL);
	}
	float* end_posF3_native = NULL;
	if (end_posF3 != NULL) {
		end_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, end_posF3, NULL);
	}
	_ret = (jint) bridged__Pathing_getApproximateLength(_skirmishAIId, start_posF3_native, end_posF3_native, pathType, goalRadius);
	if (start_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, start_posF3, (jfloat*) start_posF3_native, 0 /* copy back changes and release */);
	}
	if (end_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, end_posF3, (jfloat*) end_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1getNextWaypoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pathId, jfloatArray ret_nextWaypoint_posF3_out) {

	jint _ret;

	float* ret_nextWaypoint_posF3_out_native = NULL;
	if (ret_nextWaypoint_posF3_out != NULL) {
		ret_nextWaypoint_posF3_out_native = (float*) (*__env)->GetFloatArrayElements(__env, ret_nextWaypoint_posF3_out, NULL);
	}
	_ret = (jint) bridged__Pathing_getNextWaypoint(_skirmishAIId, pathId, ret_nextWaypoint_posF3_out_native);
	if (ret_nextWaypoint_posF3_out != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, ret_nextWaypoint_posF3_out, (jfloat*) ret_nextWaypoint_posF3_out_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Pathing_1freePath(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint pathId) {

	jint _ret;

	_ret = (jint) bridged__Pathing_freePath(_skirmishAIId, pathId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Lua_1callRules(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring inData, jint inSize, jstring ret_outData) {

	jint _ret;

	const char* inData_native = (const char*) (*__env)->GetStringUTFChars(__env, inData, NULL);
	const char* ret_outData_native = (const char*) (*__env)->GetStringUTFChars(__env, ret_outData, NULL);
	_ret = (jint) bridged__Lua_callRules(_skirmishAIId, inData_native, inSize, ret_outData_native);
	(*__env)->ReleaseStringUTFChars(__env, inData, inData_native);
	(*__env)->ReleaseStringUTFChars(__env, ret_outData, ret_outData_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Lua_1callUI(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jstring inData, jint inSize, jstring ret_outData) {

	jint _ret;

	const char* inData_native = (const char*) (*__env)->GetStringUTFChars(__env, inData, NULL);
	const char* ret_outData_native = (const char*) (*__env)->GetStringUTFChars(__env, ret_outData, NULL);
	_ret = (jint) bridged__Lua_callUI(_skirmishAIId, inData_native, inSize, ret_outData_native);
	(*__env)->ReleaseStringUTFChars(__env, inData, inData_native);
	(*__env)->ReleaseStringUTFChars(__env, ret_outData, ret_outData_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1sendStartPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean ready, jfloatArray pos_posF3) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Game_sendStartPosition(_skirmishAIId, ready, pos_posF3_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addNotification(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_addNotification(_skirmishAIId, pos_posF3_native, color_colorS3_native, alpha);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addPoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jstring label) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	const char* label_native = (const char*) (*__env)->GetStringUTFChars(__env, label, NULL);
	_ret = (jint) bridged__Map_Drawer_addPoint(_skirmishAIId, pos_posF3_native, label_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	(*__env)->ReleaseStringUTFChars(__env, label, label_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1deletePointsAndLines(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_deletePointsAndLines(_skirmishAIId, pos_posF3_native);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1addLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray posFrom_posF3, jfloatArray posTo_posF3) {

	jint _ret;

	float* posFrom_posF3_native = NULL;
	if (posFrom_posF3 != NULL) {
		posFrom_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, posFrom_posF3, NULL);
	}
	float* posTo_posF3_native = NULL;
	if (posTo_posF3 != NULL) {
		posTo_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, posTo_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_addLine(_skirmishAIId, posFrom_posF3_native, posTo_posF3_native);
	if (posFrom_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, posFrom_posF3, (jfloat*) posFrom_posF3_native, 0 /* copy back changes and release */);
	}
	if (posTo_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, posTo_posF3, (jfloat*) posTo_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1start(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos_posF3, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_PathDrawer_start(_skirmishAIId, pos_posF3_native, color_colorS3_native, alpha);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1finish(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean iAmUseless) {

	jint _ret;

	_ret = (jint) bridged__Map_Drawer_PathDrawer_finish(_skirmishAIId, iAmUseless);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	float* endPos_posF3_native = NULL;
	if (endPos_posF3 != NULL) {
		endPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, endPos_posF3, NULL);
	}
	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_PathDrawer_drawLine(_skirmishAIId, endPos_posF3_native, color_colorS3_native, alpha);
	if (endPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, endPos_posF3, (jfloat*) endPos_posF3_native, 0 /* copy back changes and release */);
	}
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawLineAndCommandIcon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint cmdId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	float* endPos_posF3_native = NULL;
	if (endPos_posF3 != NULL) {
		endPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, endPos_posF3, NULL);
	}
	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_PathDrawer_drawLineAndCommandIcon(_skirmishAIId, cmdId, endPos_posF3_native, color_colorS3_native, alpha);
	if (endPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, endPos_posF3, (jfloat*) endPos_posF3_native, 0 /* copy back changes and release */);
	}
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1drawIcon(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint cmdId) {

	jint _ret;

	_ret = (jint) bridged__Map_Drawer_PathDrawer_drawIcon(_skirmishAIId, cmdId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1suspend(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray endPos_posF3, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	float* endPos_posF3_native = NULL;
	if (endPos_posF3 != NULL) {
		endPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, endPos_posF3, NULL);
	}
	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_PathDrawer_suspend(_skirmishAIId, endPos_posF3_native, color_colorS3_native, alpha);
	if (endPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, endPos_posF3, (jfloat*) endPos_posF3_native, 0 /* copy back changes and release */);
	}
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1PathDrawer_1restart(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean sameColor) {

	jint _ret;

	_ret = (jint) bridged__Map_Drawer_PathDrawer_restart(_skirmishAIId, sameColor);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1drawSpline(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos1_posF3, jfloatArray pos2_posF3, jfloatArray pos3_posF3, jfloatArray pos4_posF3, jfloat width, jboolean arrow, jint lifeTime, jint figureGroupId) {

	jint _ret;

	float* pos1_posF3_native = NULL;
	if (pos1_posF3 != NULL) {
		pos1_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos1_posF3, NULL);
	}
	float* pos2_posF3_native = NULL;
	if (pos2_posF3 != NULL) {
		pos2_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos2_posF3, NULL);
	}
	float* pos3_posF3_native = NULL;
	if (pos3_posF3 != NULL) {
		pos3_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos3_posF3, NULL);
	}
	float* pos4_posF3_native = NULL;
	if (pos4_posF3 != NULL) {
		pos4_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos4_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_Figure_drawSpline(_skirmishAIId, pos1_posF3_native, pos2_posF3_native, pos3_posF3_native, pos4_posF3_native, width, arrow, lifeTime, figureGroupId);
	if (pos1_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos1_posF3, (jfloat*) pos1_posF3_native, 0 /* copy back changes and release */);
	}
	if (pos2_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos2_posF3, (jfloat*) pos2_posF3_native, 0 /* copy back changes and release */);
	}
	if (pos3_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos3_posF3, (jfloat*) pos3_posF3_native, 0 /* copy back changes and release */);
	}
	if (pos4_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos4_posF3, (jfloat*) pos4_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1drawLine(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray pos1_posF3, jfloatArray pos2_posF3, jfloat width, jboolean arrow, jint lifeTime, jint figureGroupId) {

	jint _ret;

	float* pos1_posF3_native = NULL;
	if (pos1_posF3 != NULL) {
		pos1_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos1_posF3, NULL);
	}
	float* pos2_posF3_native = NULL;
	if (pos2_posF3 != NULL) {
		pos2_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos2_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_Figure_drawLine(_skirmishAIId, pos1_posF3_native, pos2_posF3_native, width, arrow, lifeTime, figureGroupId);
	if (pos1_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos1_posF3, (jfloat*) pos1_posF3_native, 0 /* copy back changes and release */);
	}
	if (pos2_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos2_posF3, (jfloat*) pos2_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1setColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint figureGroupId, jshortArray color_colorS3, jshort alpha) {

	jint _ret;

	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_Figure_setColor(_skirmishAIId, figureGroupId, color_colorS3_native, alpha);
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1Figure_1remove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint figureGroupId) {

	jint _ret;

	_ret = (jint) bridged__Map_Drawer_Figure_remove(_skirmishAIId, figureGroupId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1drawUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint toDrawUnitDefId, jfloatArray pos_posF3, jfloat rotation, jint lifeTime, jint teamId, jboolean transparent, jboolean drawBorder, jint facing) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_drawUnit(_skirmishAIId, toDrawUnitDefId, pos_posF3_native, rotation, lifeTime, teamId, transparent, drawBorder, facing);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1build(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toBuildUnitDefId, jfloatArray buildPos_posF3, jint facing, jshort options, jint timeOut) {

	jint _ret;

	float* buildPos_posF3_native = NULL;
	if (buildPos_posF3 != NULL) {
		buildPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, buildPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_build(_skirmishAIId, unitId, toBuildUnitDefId, buildPos_posF3_native, facing, options, timeOut);
	if (buildPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, buildPos_posF3, (jfloat*) buildPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1build(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toBuildUnitDefId, jfloatArray buildPos_posF3, jint facing, jshort options, jint timeOut) {

	jint _ret;

	float* buildPos_posF3_native = NULL;
	if (buildPos_posF3 != NULL) {
		buildPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, buildPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_build(_skirmishAIId, groupId, toBuildUnitDefId, buildPos_posF3_native, facing, options, timeOut);
	if (buildPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, buildPos_posF3, (jfloat*) buildPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1stop(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_stop(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1stop(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_stop(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1wait(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_wait(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1wait(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_wait(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitFor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint time, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_waitFor(_skirmishAIId, unitId, time, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitFor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint time, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_waitFor(_skirmishAIId, groupId, time, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForDeathOf(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toDieUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_waitForDeathOf(_skirmishAIId, unitId, toDieUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForDeathOf(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toDieUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_waitForDeathOf(_skirmishAIId, groupId, toDieUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForSquadSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint numUnits, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_waitForSquadSize(_skirmishAIId, unitId, numUnits, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForSquadSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint numUnits, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_waitForSquadSize(_skirmishAIId, groupId, numUnits, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1waitForAll(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_waitForAll(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1waitForAll(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_waitForAll(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1moveTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_moveTo(_skirmishAIId, unitId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1moveTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_moveTo(_skirmishAIId, groupId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1patrolTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_patrolTo(_skirmishAIId, unitId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1patrolTo(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_patrolTo(_skirmishAIId, groupId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1fight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_fight(_skirmishAIId, unitId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1fight(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_fight(_skirmishAIId, groupId, toPos_posF3_native, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1attack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toAttackUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_attack(_skirmishAIId, unitId, toAttackUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1attack(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toAttackUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_attack(_skirmishAIId, groupId, toAttackUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1attackArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toAttackPos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* toAttackPos_posF3_native = NULL;
	if (toAttackPos_posF3 != NULL) {
		toAttackPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toAttackPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_attackArea(_skirmishAIId, unitId, toAttackPos_posF3_native, radius, options, timeOut);
	if (toAttackPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toAttackPos_posF3, (jfloat*) toAttackPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1attackArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toAttackPos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* toAttackPos_posF3_native = NULL;
	if (toAttackPos_posF3 != NULL) {
		toAttackPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toAttackPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_attackArea(_skirmishAIId, groupId, toAttackPos_posF3_native, radius, options, timeOut);
	if (toAttackPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toAttackPos_posF3, (jfloat*) toAttackPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1guard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toGuardUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_guard(_skirmishAIId, unitId, toGuardUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1guard(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toGuardUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_guard(_skirmishAIId, groupId, toGuardUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1aiSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_aiSelect(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1aiSelect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_aiSelect(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1addToGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toGroupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_addToGroup(_skirmishAIId, unitId, toGroupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1addToGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toGroupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_addToGroup(_skirmishAIId, groupId, toGroupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1removeFromGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_removeFromGroup(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1removeFromGroup(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_removeFromGroup(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1repair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toRepairUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_repair(_skirmishAIId, unitId, toRepairUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1repair(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toRepairUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_repair(_skirmishAIId, groupId, toRepairUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint fireState, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setFireState(_skirmishAIId, unitId, fireState, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setFireState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint fireState, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setFireState(_skirmishAIId, groupId, fireState, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint moveState, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setMoveState(_skirmishAIId, unitId, moveState, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setMoveState(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint moveState, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setMoveState(_skirmishAIId, groupId, moveState, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray basePos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* basePos_posF3_native = NULL;
	if (basePos_posF3 != NULL) {
		basePos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, basePos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_setBase(_skirmishAIId, unitId, basePos_posF3_native, options, timeOut);
	if (basePos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, basePos_posF3, (jfloat*) basePos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setBase(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray basePos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* basePos_posF3_native = NULL;
	if (basePos_posF3 != NULL) {
		basePos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, basePos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_setBase(_skirmishAIId, groupId, basePos_posF3_native, options, timeOut);
	if (basePos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, basePos_posF3, (jfloat*) basePos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1selfDestruct(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_selfDestruct(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1selfDestruct(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_selfDestruct(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setWantedMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloat wantedMaxSpeed, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setWantedMaxSpeed(_skirmishAIId, unitId, wantedMaxSpeed, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setWantedMaxSpeed(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloat wantedMaxSpeed, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setWantedMaxSpeed(_skirmishAIId, groupId, wantedMaxSpeed, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jintArray toLoadUnitIds, jint toLoadUnitIds_size, jshort options, jint timeOut) {

	jint _ret;

	int* toLoadUnitIds_native = NULL;
	if (toLoadUnitIds != NULL) {
		toLoadUnitIds_native = (int*) (*__env)->GetIntArrayElements(__env, toLoadUnitIds, NULL);
	}
	_ret = (jint) bridged__Unit_loadUnits(_skirmishAIId, unitId, toLoadUnitIds_native, toLoadUnitIds_size, options, timeOut);
	if (toLoadUnitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, toLoadUnitIds, (jint*) toLoadUnitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadUnits(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jintArray toLoadUnitIds, jint toLoadUnitIds_size, jshort options, jint timeOut) {

	jint _ret;

	int* toLoadUnitIds_native = NULL;
	if (toLoadUnitIds != NULL) {
		toLoadUnitIds_native = (int*) (*__env)->GetIntArrayElements(__env, toLoadUnitIds, NULL);
	}
	_ret = (jint) bridged__Group_loadUnits(_skirmishAIId, groupId, toLoadUnitIds_native, toLoadUnitIds_size, options, timeOut);
	if (toLoadUnitIds != NULL) {
		(*__env)->ReleaseIntArrayElements(__env, toLoadUnitIds, (jint*) toLoadUnitIds_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_loadUnitsInArea(_skirmishAIId, unitId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_loadUnitsInArea(_skirmishAIId, groupId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1loadOnto(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint transporterUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_loadOnto(_skirmishAIId, unitId, transporterUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1loadOnto(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint transporterUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_loadOnto(_skirmishAIId, groupId, transporterUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1unload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jint toUnloadUnitId, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_unload(_skirmishAIId, unitId, toPos_posF3_native, toUnloadUnitId, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1unload(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jint toUnloadUnitId, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_unload(_skirmishAIId, groupId, toPos_posF3_native, toUnloadUnitId, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1unloadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray toPos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_unloadUnitsInArea(_skirmishAIId, unitId, toPos_posF3_native, radius, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1unloadUnitsInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray toPos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* toPos_posF3_native = NULL;
	if (toPos_posF3 != NULL) {
		toPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, toPos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_unloadUnitsInArea(_skirmishAIId, groupId, toPos_posF3_native, radius, options, timeOut);
	if (toPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, toPos_posF3, (jfloat*) toPos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setOn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean on, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setOn(_skirmishAIId, unitId, on, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setOn(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean on, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setOn(_skirmishAIId, groupId, on, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toReclaimUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_reclaimUnit(_skirmishAIId, unitId, toReclaimUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimUnit(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toReclaimUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_reclaimUnit(_skirmishAIId, groupId, toReclaimUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toReclaimFeatureId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_reclaimFeature(_skirmishAIId, unitId, toReclaimFeatureId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toReclaimFeatureId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_reclaimFeature(_skirmishAIId, groupId, toReclaimFeatureId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1reclaimInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_reclaimInArea(_skirmishAIId, unitId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1reclaimInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_reclaimInArea(_skirmishAIId, groupId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1cloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean cloak, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_cloak(_skirmishAIId, unitId, cloak, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1cloak(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean cloak, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_cloak(_skirmishAIId, groupId, cloak, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1stockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_stockpile(_skirmishAIId, unitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1stockpile(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_stockpile(_skirmishAIId, groupId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1dGun(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toAttackUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_dGun(_skirmishAIId, unitId, toAttackUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1dGun(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toAttackUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_dGun(_skirmishAIId, groupId, toAttackUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1dGunPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_dGunPosition(_skirmishAIId, unitId, pos_posF3_native, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1dGunPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_dGunPosition(_skirmishAIId, groupId, pos_posF3_native, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1restoreArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_restoreArea(_skirmishAIId, unitId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1restoreArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_restoreArea(_skirmishAIId, groupId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jboolean repeat, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setRepeat(_skirmishAIId, unitId, repeat, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setRepeat(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jboolean repeat, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setRepeat(_skirmishAIId, groupId, repeat, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint trajectory, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setTrajectory(_skirmishAIId, unitId, trajectory, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setTrajectory(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint trajectory, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setTrajectory(_skirmishAIId, groupId, trajectory, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1resurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toResurrectFeatureId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_resurrect(_skirmishAIId, unitId, toResurrectFeatureId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1resurrect(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toResurrectFeatureId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_resurrect(_skirmishAIId, groupId, toResurrectFeatureId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1resurrectInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_resurrectInArea(_skirmishAIId, unitId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1resurrectInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_resurrectInArea(_skirmishAIId, groupId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1capture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint toCaptureUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_capture(_skirmishAIId, unitId, toCaptureUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1capture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint toCaptureUnitId, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_capture(_skirmishAIId, groupId, toCaptureUnitId, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1captureInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Unit_captureInArea(_skirmishAIId, unitId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1captureInArea(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jfloatArray pos_posF3, jfloat radius, jshort options, jint timeOut) {

	jint _ret;

	float* pos_posF3_native = NULL;
	if (pos_posF3 != NULL) {
		pos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, pos_posF3, NULL);
	}
	_ret = (jint) bridged__Group_captureInArea(_skirmishAIId, groupId, pos_posF3_native, radius, options, timeOut);
	if (pos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, pos_posF3, (jfloat*) pos_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setAutoRepairLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint autoRepairLevel, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setAutoRepairLevel(_skirmishAIId, unitId, autoRepairLevel, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setAutoRepairLevel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint autoRepairLevel, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setAutoRepairLevel(_skirmishAIId, groupId, autoRepairLevel, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1setIdleMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint idleMode, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Unit_setIdleMode(_skirmishAIId, unitId, idleMode, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1setIdleMode(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint idleMode, jshort options, jint timeOut) {

	jint _ret;

	_ret = (jint) bridged__Group_setIdleMode(_skirmishAIId, groupId, idleMode, options, timeOut);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Unit_1executeCustomCommand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint unitId, jint cmdId, jfloatArray params, jint params_size, jshort options, jint timeOut) {

	jint _ret;

	float* params_native = NULL;
	if (params != NULL) {
		params_native = (float*) (*__env)->GetFloatArrayElements(__env, params, NULL);
	}
	_ret = (jint) bridged__Unit_executeCustomCommand(_skirmishAIId, unitId, cmdId, params_native, params_size, options, timeOut);
	if (params != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, params, (jfloat*) params_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Group_1executeCustomCommand(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint groupId, jint cmdId, jfloatArray params, jint params_size, jshort options, jint timeOut) {

	jint _ret;

	float* params_native = NULL;
	if (params != NULL) {
		params_native = (float*) (*__env)->GetFloatArrayElements(__env, params, NULL);
	}
	_ret = (jint) bridged__Group_executeCustomCommand(_skirmishAIId, groupId, cmdId, params_native, params_size, options, timeOut);
	if (params != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, params, (jfloat*) params_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1traceRay(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray rayPos_posF3, jfloatArray rayDir_posF3, jfloat rayLen, jint srcUnitId, jint flags) {

	jint _ret;

	float* rayPos_posF3_native = NULL;
	if (rayPos_posF3 != NULL) {
		rayPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, rayPos_posF3, NULL);
	}
	float* rayDir_posF3_native = NULL;
	if (rayDir_posF3 != NULL) {
		rayDir_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, rayDir_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_traceRay(_skirmishAIId, rayPos_posF3_native, rayDir_posF3_native, rayLen, srcUnitId, flags);
	if (rayPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, rayPos_posF3, (jfloat*) rayPos_posF3_native, 0 /* copy back changes and release */);
	}
	if (rayDir_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, rayDir_posF3, (jfloat*) rayDir_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Map_1Drawer_1traceRayFeature(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray rayPos_posF3, jfloatArray rayDir_posF3, jfloat rayLen, jint srcUnitId, jint flags) {

	jint _ret;

	float* rayPos_posF3_native = NULL;
	if (rayPos_posF3 != NULL) {
		rayPos_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, rayPos_posF3, NULL);
	}
	float* rayDir_posF3_native = NULL;
	if (rayDir_posF3 != NULL) {
		rayDir_posF3_native = (float*) (*__env)->GetFloatArrayElements(__env, rayDir_posF3, NULL);
	}
	_ret = (jint) bridged__Map_Drawer_traceRayFeature(_skirmishAIId, rayPos_posF3_native, rayDir_posF3_native, rayLen, srcUnitId, flags);
	if (rayPos_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, rayPos_posF3, (jfloat*) rayPos_posF3_native, 0 /* copy back changes and release */);
	}
	if (rayDir_posF3 != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, rayDir_posF3, (jfloat*) rayDir_posF3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Game_1setPause(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jboolean enable, jstring reason) {

	jint _ret;

	const char* reason_native = (const char*) (*__env)->GetStringUTFChars(__env, reason, NULL);
	_ret = (jint) bridged__Game_setPause(_skirmishAIId, enable, reason_native);
	(*__env)->ReleaseStringUTFChars(__env, reason, reason_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1setPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat x, jfloat y) {

	jint _ret;

	_ret = (jint) bridged__Debug_GraphDrawer_setPosition(_skirmishAIId, x, y);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1setSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloat w, jfloat h) {

	jint _ret;

	_ret = (jint) bridged__Debug_GraphDrawer_setSize(_skirmishAIId, w, h);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1addPoint(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jfloat x, jfloat y) {

	jint _ret;

	_ret = (jint) bridged__Debug_GraphDrawer_GraphLine_addPoint(_skirmishAIId, lineId, x, y);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1deletePoints(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jint numPoints) {

	jint _ret;

	_ret = (jint) bridged__Debug_GraphDrawer_GraphLine_deletePoints(_skirmishAIId, lineId, numPoints);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1setColor(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jshortArray color_colorS3) {

	jint _ret;

	short* color_colorS3_native = NULL;
	if (color_colorS3 != NULL) {
		color_colorS3_native = (short*) (*__env)->GetShortArrayElements(__env, color_colorS3, NULL);
	}
	_ret = (jint) bridged__Debug_GraphDrawer_GraphLine_setColor(_skirmishAIId, lineId, color_colorS3_native);
	if (color_colorS3 != NULL) {
		(*__env)->ReleaseShortArrayElements(__env, color_colorS3, (jshort*) color_colorS3_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1GraphDrawer_1GraphLine_1setLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint lineId, jstring label) {

	jint _ret;

	const char* label_native = (const char*) (*__env)->GetStringUTFChars(__env, label, NULL);
	_ret = (jint) bridged__Debug_GraphDrawer_GraphLine_setLabel(_skirmishAIId, lineId, label_native);
	(*__env)->ReleaseStringUTFChars(__env, label, label_native);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1addOverlayTexture(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jfloatArray texData, jint w, jint h) {

	jint _ret;

	const float* texData_native = NULL;
	if (texData != NULL) {
		texData_native = (const float*) (*__env)->GetFloatArrayElements(__env, texData, NULL);
	}
	_ret = (jint) bridged__Debug_addOverlayTexture(_skirmishAIId, texData_native, w, h);
	if (texData != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, texData, (jfloat*) texData_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1update(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloatArray texData, jint x, jint y, jint w, jint h) {

	jint _ret;

	const float* texData_native = NULL;
	if (texData != NULL) {
		texData_native = (const float*) (*__env)->GetFloatArrayElements(__env, texData, NULL);
	}
	_ret = (jint) bridged__Debug_OverlayTexture_update(_skirmishAIId, overlayTextureId, texData_native, x, y, w, h);
	if (texData != NULL) {
		(*__env)->ReleaseFloatArrayElements(__env, texData, (jfloat*) texData_native, 0 /* copy back changes and release */);
	}

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1remove(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId) {

	jint _ret;

	_ret = (jint) bridged__Debug_OverlayTexture_remove(_skirmishAIId, overlayTextureId);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setPosition(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloat x, jfloat y) {

	jint _ret;

	_ret = (jint) bridged__Debug_OverlayTexture_setPosition(_skirmishAIId, overlayTextureId, x, y);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setSize(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jfloat w, jfloat h) {

	jint _ret;

	_ret = (jint) bridged__Debug_OverlayTexture_setSize(_skirmishAIId, overlayTextureId, w, h);

	return _ret;
}

JNIEXPORT jint JNICALL Java_com_springrts_ai_JniAICallback_Debug_1OverlayTexture_1setLabel(JNIEnv* __env, jobject __obj, jint _skirmishAIId, jint overlayTextureId, jstring label) {

	jint _ret;

	const char* label_native = (const char*) (*__env)->GetStringUTFChars(__env, label, NULL);
	_ret = (jint) bridged__Debug_OverlayTexture_setLabel(_skirmishAIId, overlayTextureId, label_native);
	(*__env)->ReleaseStringUTFChars(__env, label, label_native);

	return _ret;
}


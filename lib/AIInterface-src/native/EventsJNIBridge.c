/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#include "EventsJNIBridge.h"

#include "JavaBridge.h" // for INT_AI
#include "JniUtil.h"
#include "ExternalAI/Interface/AISEvents.h"
#include <stdlib.h> // for calloc(), free()


size_t   skirmishAIId_size     = 0;
jobject* skirmishAIId_callback = NULL;

jmethodID m_ai_init = NULL;
jmethodID m_ai_release = NULL;
jmethodID m_ai_update = NULL;
jmethodID m_ai_message = NULL;
jmethodID m_ai_luaMessage = NULL;
jmethodID m_ai_unitCreated = NULL;
jmethodID m_ai_unitFinished = NULL;
jmethodID m_ai_unitIdle = NULL;
jmethodID m_ai_unitMoveFailed = NULL;
jmethodID m_ai_unitDamaged = NULL;
jmethodID m_ai_unitDestroyed = NULL;
jmethodID m_ai_unitGiven = NULL;
jmethodID m_ai_unitCaptured = NULL;
jmethodID m_ai_enemyEnterLOS = NULL;
jmethodID m_ai_enemyLeaveLOS = NULL;
jmethodID m_ai_enemyEnterRadar = NULL;
jmethodID m_ai_enemyLeaveRadar = NULL;
jmethodID m_ai_enemyDamaged = NULL;
jmethodID m_ai_enemyDestroyed = NULL;
jmethodID m_ai_weaponFired = NULL;
jmethodID m_ai_playerCommand = NULL;
jmethodID m_ai_commandFinished = NULL;
jmethodID m_ai_seismicPing = NULL;
jmethodID m_ai_load = NULL;
jmethodID m_ai_save = NULL;
jmethodID m_ai_enemyCreated = NULL;
jmethodID m_ai_enemyFinished = NULL;

int eventsJniBridge_initStatic(JNIEnv* env, size_t _skirmishAIId_size) {

	skirmishAIId_size = _skirmishAIId_size;
	skirmishAIId_callback = (jobject*) calloc(skirmishAIId_size, sizeof(jobject));
	size_t t;
	for (t=0; t < skirmishAIId_size; ++t) {
		skirmishAIId_callback[t] = NULL;
	}

	jobject c_aiInt = (*env)->FindClass(env, "com/springrts/ai/AI");
	if (jniUtil_checkException(env, "Failed fetching AI interface class com.springrts.ai.AI")) { return -2; }

	m_ai_init = jniUtil_getMethodID(env, c_aiInt, "init", "(ILcom/springrts/ai/AICallback;)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: init")) { return -3; }

	m_ai_release = jniUtil_getMethodID(env, c_aiInt, "release", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: release")) { return -3; }

	m_ai_update = jniUtil_getMethodID(env, c_aiInt, "update", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: update")) { return -3; }

	m_ai_message = jniUtil_getMethodID(env, c_aiInt, "message", "(ILjava/lang/String;)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: message")) { return -3; }

	m_ai_luaMessage = jniUtil_getMethodID(env, c_aiInt, "luaMessage", "(Ljava/lang/String;)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: luaMessage")) { return -3; }

	m_ai_unitCreated = jniUtil_getMethodID(env, c_aiInt, "unitCreated", "(II)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitCreated")) { return -3; }

	m_ai_unitFinished = jniUtil_getMethodID(env, c_aiInt, "unitFinished", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitFinished")) { return -3; }

	m_ai_unitIdle = jniUtil_getMethodID(env, c_aiInt, "unitIdle", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitIdle")) { return -3; }

	m_ai_unitMoveFailed = jniUtil_getMethodID(env, c_aiInt, "unitMoveFailed", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitMoveFailed")) { return -3; }

	m_ai_unitDamaged = jniUtil_getMethodID(env, c_aiInt, "unitDamaged", "(IIF[FIZ)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitDamaged")) { return -3; }

	m_ai_unitDestroyed = jniUtil_getMethodID(env, c_aiInt, "unitDestroyed", "(II)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitDestroyed")) { return -3; }

	m_ai_unitGiven = jniUtil_getMethodID(env, c_aiInt, "unitGiven", "(III)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitGiven")) { return -3; }

	m_ai_unitCaptured = jniUtil_getMethodID(env, c_aiInt, "unitCaptured", "(III)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: unitCaptured")) { return -3; }

	m_ai_enemyEnterLOS = jniUtil_getMethodID(env, c_aiInt, "enemyEnterLOS", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyEnterLOS")) { return -3; }

	m_ai_enemyLeaveLOS = jniUtil_getMethodID(env, c_aiInt, "enemyLeaveLOS", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyLeaveLOS")) { return -3; }

	m_ai_enemyEnterRadar = jniUtil_getMethodID(env, c_aiInt, "enemyEnterRadar", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyEnterRadar")) { return -3; }

	m_ai_enemyLeaveRadar = jniUtil_getMethodID(env, c_aiInt, "enemyLeaveRadar", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyLeaveRadar")) { return -3; }

	m_ai_enemyDamaged = jniUtil_getMethodID(env, c_aiInt, "enemyDamaged", "(IIF[FIZ)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyDamaged")) { return -3; }

	m_ai_enemyDestroyed = jniUtil_getMethodID(env, c_aiInt, "enemyDestroyed", "(II)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyDestroyed")) { return -3; }

	m_ai_weaponFired = jniUtil_getMethodID(env, c_aiInt, "weaponFired", "(II)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: weaponFired")) { return -3; }

	m_ai_playerCommand = jniUtil_getMethodID(env, c_aiInt, "playerCommand", "([IIII)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: playerCommand")) { return -3; }

	m_ai_commandFinished = jniUtil_getMethodID(env, c_aiInt, "commandFinished", "(III)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: commandFinished")) { return -3; }

	m_ai_seismicPing = jniUtil_getMethodID(env, c_aiInt, "seismicPing", "([FF)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: seismicPing")) { return -3; }

	m_ai_load = jniUtil_getMethodID(env, c_aiInt, "load", "(Ljava/lang/String;)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: load")) { return -3; }

	m_ai_save = jniUtil_getMethodID(env, c_aiInt, "save", "(Ljava/lang/String;)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: save")) { return -3; }

	m_ai_enemyCreated = jniUtil_getMethodID(env, c_aiInt, "enemyCreated", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyCreated")) { return -3; }

	m_ai_enemyFinished = jniUtil_getMethodID(env, c_aiInt, "enemyFinished", "(I)I");
	if (jniUtil_checkException(env, "Failed fetching Java AI method ID for: enemyFinished")) { return -3; }


	return 0; // -> no error
}

int eventsJniBridge_initAI(JNIEnv* env, int skirmishAIId, jobject callback) {

	int res = -1;

	skirmishAIId_callback[skirmishAIId] = callback;
	res = 0;

	return res;
}

int eventsJniBridge_handleEvent(JNIEnv* env, jobject aiInstance, int skirmishAIId, int topic, const void* data) {

	int _ret = -1;

	switch (topic) {
		case EVENT_INIT: {
			const struct SInitEvent* evt = (const struct SInitEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_init, evt->skirmishAIId, skirmishAIId_callback[evt->skirmishAIId]);
			break;
		}
		case EVENT_RELEASE: {
			const struct SReleaseEvent* evt = (const struct SReleaseEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_release, evt->reason);
			break;
		}
		case EVENT_UPDATE: {
			const struct SUpdateEvent* evt = (const struct SUpdateEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_update, evt->frame);
			break;
		}
		case EVENT_MESSAGE: {
			const struct SMessageEvent* evt = (const struct SMessageEvent*) data;

			jstring message_jni = (*env)->NewStringUTF(env, evt->message);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_message, evt->player, message_jni);
			break;
		}
		case EVENT_LUA_MESSAGE: {
			const struct SLuaMessageEvent* evt = (const struct SLuaMessageEvent*) data;

			jstring inData_jni = (*env)->NewStringUTF(env, evt->inData);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_luaMessage, inData_jni);
			break;
		}
		case EVENT_UNIT_CREATED: {
			const struct SUnitCreatedEvent* evt = (const struct SUnitCreatedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitCreated, evt->unit, evt->builder);
			break;
		}
		case EVENT_UNIT_FINISHED: {
			const struct SUnitFinishedEvent* evt = (const struct SUnitFinishedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitFinished, evt->unit);
			break;
		}
		case EVENT_UNIT_IDLE: {
			const struct SUnitIdleEvent* evt = (const struct SUnitIdleEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitIdle, evt->unit);
			break;
		}
		case EVENT_UNIT_MOVE_FAILED: {
			const struct SUnitMoveFailedEvent* evt = (const struct SUnitMoveFailedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitMoveFailed, evt->unit);
			break;
		}
		case EVENT_UNIT_DAMAGED: {
			const struct SUnitDamagedEvent* evt = (const struct SUnitDamagedEvent*) data;

			jfloatArray dir_posF3_jni = (*env)->NewFloatArray(env, 3);
			(*env)->SetFloatArrayRegion(env, dir_posF3_jni, 0, 3, evt->dir_posF3);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitDamaged, evt->unit, evt->attacker, evt->damage, dir_posF3_jni, evt->weaponDefId, evt->paralyzer);
			break;
		}
		case EVENT_UNIT_DESTROYED: {
			const struct SUnitDestroyedEvent* evt = (const struct SUnitDestroyedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitDestroyed, evt->unit, evt->attacker);
			break;
		}
		case EVENT_UNIT_GIVEN: {
			const struct SUnitGivenEvent* evt = (const struct SUnitGivenEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitGiven, evt->unitId, evt->oldTeamId, evt->newTeamId);
			break;
		}
		case EVENT_UNIT_CAPTURED: {
			const struct SUnitCapturedEvent* evt = (const struct SUnitCapturedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_unitCaptured, evt->unitId, evt->oldTeamId, evt->newTeamId);
			break;
		}
		case EVENT_ENEMY_ENTER_LOS: {
			const struct SEnemyEnterLOSEvent* evt = (const struct SEnemyEnterLOSEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyEnterLOS, evt->enemy);
			break;
		}
		case EVENT_ENEMY_LEAVE_LOS: {
			const struct SEnemyLeaveLOSEvent* evt = (const struct SEnemyLeaveLOSEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyLeaveLOS, evt->enemy);
			break;
		}
		case EVENT_ENEMY_ENTER_RADAR: {
			const struct SEnemyEnterRadarEvent* evt = (const struct SEnemyEnterRadarEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyEnterRadar, evt->enemy);
			break;
		}
		case EVENT_ENEMY_LEAVE_RADAR: {
			const struct SEnemyLeaveRadarEvent* evt = (const struct SEnemyLeaveRadarEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyLeaveRadar, evt->enemy);
			break;
		}
		case EVENT_ENEMY_DAMAGED: {
			const struct SEnemyDamagedEvent* evt = (const struct SEnemyDamagedEvent*) data;

			jfloatArray dir_posF3_jni = (*env)->NewFloatArray(env, 3);
			(*env)->SetFloatArrayRegion(env, dir_posF3_jni, 0, 3, evt->dir_posF3);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyDamaged, evt->enemy, evt->attacker, evt->damage, dir_posF3_jni, evt->weaponDefId, evt->paralyzer);
			break;
		}
		case EVENT_ENEMY_DESTROYED: {
			const struct SEnemyDestroyedEvent* evt = (const struct SEnemyDestroyedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyDestroyed, evt->enemy, evt->attacker);
			break;
		}
		case EVENT_WEAPON_FIRED: {
			const struct SWeaponFiredEvent* evt = (const struct SWeaponFiredEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_weaponFired, evt->unitId, evt->weaponDefId);
			break;
		}
		case EVENT_PLAYER_COMMAND: {
			const struct SPlayerCommandEvent* evt = (const struct SPlayerCommandEvent*) data;

			jintArray unitIds_jni = (*env)->NewIntArray(env, sizeof(evt->unitIds));
			(*env)->SetIntArrayRegion(env, unitIds_jni, 0, sizeof(evt->unitIds), evt->unitIds);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_playerCommand, unitIds_jni, evt->unitIds_size, evt->commandTopicId, evt->playerId);
			break;
		}
		case EVENT_COMMAND_FINISHED: {
			const struct SCommandFinishedEvent* evt = (const struct SCommandFinishedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_commandFinished, evt->unitId, evt->commandId, evt->commandTopicId);
			break;
		}
		case EVENT_SEISMIC_PING: {
			const struct SSeismicPingEvent* evt = (const struct SSeismicPingEvent*) data;

			jfloatArray pos_posF3_jni = (*env)->NewFloatArray(env, 3);
			(*env)->SetFloatArrayRegion(env, pos_posF3_jni, 0, 3, evt->pos_posF3);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_seismicPing, pos_posF3_jni, evt->strength);
			break;
		}
		case EVENT_LOAD: {
			const struct SLoadEvent* evt = (const struct SLoadEvent*) data;

			jstring file_jni = (*env)->NewStringUTF(env, evt->file);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_load, file_jni);
			break;
		}
		case EVENT_SAVE: {
			const struct SSaveEvent* evt = (const struct SSaveEvent*) data;

			jstring file_jni = (*env)->NewStringUTF(env, evt->file);
			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_save, file_jni);
			break;
		}
		case EVENT_ENEMY_CREATED: {
			const struct SEnemyCreatedEvent* evt = (const struct SEnemyCreatedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyCreated, evt->enemy);
			break;
		}
		case EVENT_ENEMY_FINISHED: {
			const struct SEnemyFinishedEvent* evt = (const struct SEnemyFinishedEvent*) data;

			_ret = (*env)->CallIntMethod(env, aiInstance, m_ai_enemyFinished, evt->enemy);
			break;
		}
		default: {
			_ret = -4;
			break;
		}
	}

	if ((*env)->ExceptionCheck(env)) {
		(*env)->ExceptionDescribe(env);
		_ret = -5;
	}

	return _ret;
}

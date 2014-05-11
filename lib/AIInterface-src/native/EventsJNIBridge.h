/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

#ifndef __EVENTS_JNI_BRIDGE_H
#define __EVENTS_JNI_BRIDGE_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

/**
 * Initialized stuff needed for sending events to an AI library instance.
 *
 * @author	hoijui
 * @version	GENERATED
 */
int eventsJniBridge_initStatic(JNIEnv* env, size_t skirmishAIId_size);

/**
 * Initialized stuff needed for an AI instance.
 *
 * @author	hoijui
 * @version	GENERATED
 */
int eventsJniBridge_initAI(JNIEnv* env, int skirmishAIId, jobject callback);

/**
 * For documentation, see SSkirmishAILibrary::handleEvent() in:
 * ExternalAI/Interface/SSkirmishAILibrary.h
 *
 * @author	hoijui
 * @version	GENERATED
 */
int eventsJniBridge_handleEvent(JNIEnv* env, jobject aiInstance, int skirmishAIId, int topic, const void* data);

#ifdef __cplusplus
} // extern "C"
#endif

#endif // __EVENTS_JNI_BRIDGE_H


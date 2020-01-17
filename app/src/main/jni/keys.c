#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_example_myhiddendomain_MainActivity_getFacebookApiKey(JNIEnv *env, jobject thiz) {
    // TODO: implement getFacebookApiKey()
    return (*env)->  NewStringUTF(env, "TmF0aXZlNWVjcmV0UEBzc3cwcmQx");
}

JNIEXPORT jstring JNICALL
Java_com_example_myhiddendomain_MainActivity_getBaseApi(JNIEnv *env, jobject thiz) {
    // TODO: implement getBaseApi()
    return (*env)->NewStringUTF(env, "TmF0aXZlNWVjcmV0UEBzc3cwcmQy");
}

JNIEXPORT jstring JNICALL
Java_com_example_myhiddendomain_MainActivity_getBaseUrl(JNIEnv *env, jobject thiz) {
    // TODO: implement getBaseUrl()
    return (*env)->NewStringUTF(env, "http://example.com");
}
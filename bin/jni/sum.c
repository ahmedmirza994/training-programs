#include <jni.h>
#include <stdio.h>
#include "jni_HelloWorld.h"
 
// Implementation of native method sayHello() of HelloJNI class
JNIEXPORT void JNICALL Java_jni_HelloWorld_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}

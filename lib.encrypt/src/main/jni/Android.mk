LOCAL_PATH:=$(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE:=secretkey

LOCAL_SRC_FILES:=secretkey.cpp secretkey.h

LOCAL_LDLIBS :=-llog

include $(BUILD_SHARED_LIBRARY)

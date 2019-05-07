package com.common.libraries.utils;

import android.util.Log;

import com.common.libraries.BuildConfig;

/**
 * author: ${VenRen}
 * created on: 2019/4/17 9:16
 * description: 项目日志
 */
public class AppLog {

    public static final boolean isDebug = BuildConfig.DEBUG;

    public static void v(String TAG, String logStr) {
        if (isDebug) {
            Log.v(TAG, TAG + " ---> " + logStr);
        }
    }

    public static void i(String TAG, String logStr) {
        if (isDebug) {
            Log.i(TAG, TAG + " ---> " + logStr);
        }
    }


    public static void d(String TAG, String logStr) {
        if (isDebug) {
            Log.d(TAG, TAG + " ---> " + logStr);
        }
    }

    public static void w(String TAG, String logStr) {
        if (isDebug) {
            Log.w(TAG, TAG + " ---> " + logStr, new Throwable(TAG));
        }
    }

    public static void e(String TAG, String logStr) {
        if (isDebug) {
            Log.e(TAG, TAG + " ---> " + logStr, new Throwable(TAG));
        }
    }
}

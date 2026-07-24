package com.dh.myembyapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceIdManager {
    private static final String KEY_DEVICE_ID = "device_id";
    private static final String PREF_NAME = "emby_device_prefs";
    private static String cachedDeviceId;
    public static final DeviceIdManager INSTANCE = new DeviceIdManager();
    

    private DeviceIdManager() {
    }

    private final SharedPreferences getPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public final void clearDeviceId(Context context) {
        context.getClass();
        getPreferences(context).edit().remove(KEY_DEVICE_ID).apply();
        cachedDeviceId = null;
        Log.w("DeviceIdManager", "DeviceId已清除");
    }

    public final synchronized String getDeviceId(Context context) {
        try {
            context.getClass();
            String str = cachedDeviceId;
            if (str != null) {
                return str;
            }
            SharedPreferences preferences = getPreferences(context);
            String string = preferences.getString(KEY_DEVICE_ID, null);
            if (string == null) {
                string = UUID.randomUUID().toString();
                preferences.edit().putString(KEY_DEVICE_ID, string).apply();
                Log.i("DeviceIdManager", "生成新的DeviceId: " + string);
            } else {
                Log.d("DeviceIdManager", "读取已存在的DeviceId: ".concat(string));
            }
            cachedDeviceId = string;
            return string;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean hasDeviceId(Context context) {
        context.getClass();
        return getPreferences(context).contains(KEY_DEVICE_ID);
    }
}

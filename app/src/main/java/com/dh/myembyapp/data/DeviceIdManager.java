package com.dh.myembyapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/data/DeviceIdManager;", "", "<init>", "()V", "PREF_NAME", "", "KEY_DEVICE_ID", "cachedDeviceId", "getDeviceId", "context", "Landroid/content/Context;", "clearDeviceId", "", "getPreferences", "Landroid/content/SharedPreferences;", "hasDeviceId", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceIdManager {
    private static final String KEY_DEVICE_ID = "device_id";
    private static final String PREF_NAME = "emby_device_prefs";
    private static String cachedDeviceId;
    public static final DeviceIdManager INSTANCE = new DeviceIdManager();
    public static final int $stable = 8;

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

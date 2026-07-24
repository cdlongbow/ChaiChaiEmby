package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.google.gson.Gson;
import defpackage.i9;

/* JADX INFO: loaded from: classes4.dex */
public final class DanmakuPreferences {
    private static final String KEY_DANMAKU_CONFIG = "danmaku_config";
    private static final String KEY_DANMAKU_VISIBLE = "danmaku_visible";
    private final Gson gson;
    private final SharedPreferences prefs;
    

    public DanmakuPreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("danmaku_prefs", 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.gson = new Gson();
    }

    public final void clearDanmakuConfig() {
        this.prefs.edit().remove(KEY_DANMAKU_CONFIG).apply();
    }

    public final DanmakuConfig getDanmakuConfig() {
        String string = this.prefs.getString(KEY_DANMAKU_CONFIG, null);
        if (string != null) {
            Object objFromJson = this.gson.fromJson(string, (Class<Object>) DanmakuConfig.class);
            objFromJson.getClass();
            return (DanmakuConfig) objFromJson;
        }
        return new DanmakuConfig(false, null, null, null, null, false, 63, null);
    }

    public final boolean getDanmakuVisible() {
        return this.prefs.getBoolean(KEY_DANMAKU_VISIBLE, true);
    }

    public final void saveDanmakuConfig(DanmakuConfig config) {
        config.getClass();
        this.prefs.edit().putString(KEY_DANMAKU_CONFIG, this.gson.toJson(config)).apply();
    }

    public final void saveDanmakuVisible(boolean visible) {
        i9.p(this.prefs, KEY_DANMAKU_VISIBLE, visible);
    }
}

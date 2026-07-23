package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.google.gson.Gson;
import defpackage.i9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/preferences/DanmakuPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "saveDanmakuConfig", "", "config", "Lcom/dh/myembyapp/data/model/DanmakuConfig;", "getDanmakuConfig", "clearDanmakuConfig", "saveDanmakuVisible", "visible", "", "getDanmakuVisible", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DanmakuPreferences {
    private static final String KEY_DANMAKU_CONFIG = "danmaku_config";
    private static final String KEY_DANMAKU_VISIBLE = "danmaku_visible";
    private final Gson gson;
    private final SharedPreferences prefs;
    public static final int $stable = 8;

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

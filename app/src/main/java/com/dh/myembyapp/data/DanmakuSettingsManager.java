package com.dh.myembyapp.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.b7;
import defpackage.hz;
import defpackage.jz;
import defpackage.kz;
import defpackage.lz;
import defpackage.mz;
import defpackage.nz;
import defpackage.oz;
import defpackage.pz;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class DanmakuSettingsManager {
    private static final int MAX_TIME_OFFSET_SEC = 600;
    private static final int MIN_TIME_OFFSET_SEC = -600;
    private final Context context;
    private final Flow<DanmakuSettings> settingsFlow;
    public static final hz Companion = new hz();
    
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("danmaku_settings", null, null, null, 14, null);
    private static final Preferences.Key<Float> SPEED_KEY = PreferencesKeys.floatKey("speed");
    private static final Preferences.Key<Float> SIZE_KEY = PreferencesKeys.floatKey("size");
    private static final Preferences.Key<Integer> OPACITY_KEY = PreferencesKeys.intKey("opacity");
    private static final Preferences.Key<Float> SCREEN_PART_KEY = PreferencesKeys.floatKey("screen_part");
    private static final Preferences.Key<Integer> TIME_OFFSET_SEC_KEY = PreferencesKeys.intKey("time_offset_sec");
    private static final Preferences.Key<Boolean> SHOW_TOP_KEY = PreferencesKeys.booleanKey("show_top");
    private static final Preferences.Key<Boolean> SHOW_BOTTOM_KEY = PreferencesKeys.booleanKey("show_bottom");

    public DanmakuSettingsManager(Context context) {
        context.getClass();
        this.context = context;
        this.settingsFlow = new b7(hz.a(Companion, context).getData(), 3);
    }

    public final Flow<DanmakuSettings> getSettingsFlow() {
        return this.settingsFlow;
    }

    public final Object updateOpacity(int i, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new jz(i, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateScreenPart(float f, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new kz(f, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateShowBottomDanmaku(boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new lz(z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateShowTopDanmaku(boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new mz(z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateSize(float f, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new nz(f, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateSpeed(float f, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new oz(f, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object updateTimeOffsetSec(int i, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(hz.a(Companion, this.context), new pz(i, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}

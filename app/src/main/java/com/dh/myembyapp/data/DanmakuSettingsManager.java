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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\nJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/dh/myembyapp/data/DanmakuSettingsManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "speed", "", "updateSpeed", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "size", "updateSize", "", "opacity", "updateOpacity", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "screenPart", "updateScreenPart", "timeOffsetSec", "updateTimeOffsetSec", "", "enabled", "updateShowTopDanmaku", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateShowBottomDanmaku", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dh/myembyapp/data/DanmakuSettings;", "settingsFlow", "Lkotlinx/coroutines/flow/Flow;", "getSettingsFlow", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "hz", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DanmakuSettingsManager {
    private static final int MAX_TIME_OFFSET_SEC = 600;
    private static final int MIN_TIME_OFFSET_SEC = -600;
    private final Context context;
    private final Flow<DanmakuSettings> settingsFlow;
    public static final hz Companion = new hz();
    public static final int $stable = 8;
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

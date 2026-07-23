package com.dh.myembyapp.dlna;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.b7;
import defpackage.qb0;
import defpackage.rb0;
import defpackage.sb0;
import defpackage.sc;
import defpackage.tb0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaSettings;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/dh/myembyapp/dlna/DlnaConfig;", "getConfigSync", "()Lcom/dh/myembyapp/dlna/DlnaConfig;", "config", "", "saveConfig", "(Lcom/dh/myembyapp/dlna/DlnaConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "setEnabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "name", "setDeviceName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/Flow;", "configFlow", "Lkotlinx/coroutines/flow/Flow;", "getConfigFlow", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "qb0", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DlnaSettings {
    private final Flow<DlnaConfig> configFlow;
    private final Context context;
    public static final qb0 Companion = new qb0();
    public static final int $stable = 8;
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("dlna_settings", null, null, null, 14, null);
    private static final Preferences.Key<Boolean> KEY_ENABLED = PreferencesKeys.booleanKey("dlna_enabled");
    private static final Preferences.Key<String> KEY_DEVICE_NAME = PreferencesKeys.stringKey("dlna_device_name");
    private static final Preferences.Key<Boolean> KEY_AUTO_PLAY = PreferencesKeys.booleanKey("dlna_auto_play");
    private static final Preferences.Key<Boolean> KEY_USE_PROXY_DEFAULT = PreferencesKeys.booleanKey("dlna_use_proxy_default");
    private static final Preferences.Key<Boolean> KEY_TRUST_ALL_CERTS = PreferencesKeys.booleanKey("dlna_trust_all_certs");

    public DlnaSettings(Context context) {
        context.getClass();
        this.context = context;
        this.configFlow = new b7(qb0.a(Companion, context).getData(), 4);
    }

    public final Flow<DlnaConfig> getConfigFlow() {
        return this.configFlow;
    }

    public final DlnaConfig getConfigSync() {
        return (DlnaConfig) BuildersKt__BuildersKt.runBlocking$default(null, new sc(this, null, 2), 1, null);
    }

    public final Object saveConfig(DlnaConfig dlnaConfig, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(qb0.a(Companion, this.context), new rb0(dlnaConfig, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object setDeviceName(String str, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(qb0.a(Companion, this.context), new sb0(str, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object setEnabled(boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(qb0.a(Companion, this.context), new tb0(z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}

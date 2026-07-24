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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class DlnaSettings {
    private final Flow<DlnaConfig> configFlow;
    private final Context context;
    public static final qb0 Companion = new qb0();
    
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

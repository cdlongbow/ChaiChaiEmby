package com.dh.myembyapp.data;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.b7;
import defpackage.mr1;
import defpackage.nr1;
import defpackage.or1;
import defpackage.rd1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxySettings {
    private final Context context;
    private final Flow<ProxyConfig> proxyConfigFlow;
    public static final mr1 Companion = new mr1();
    
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("proxy_settings", null, null, null, 14, null);
    private static final Preferences.Key<Boolean> KEY_ENABLED = PreferencesKeys.booleanKey("proxy_enabled");
    private static final Preferences.Key<String> KEY_PROTOCOL = PreferencesKeys.stringKey("proxy_protocol");
    private static final Preferences.Key<String> KEY_HOST = PreferencesKeys.stringKey("proxy_host");
    private static final Preferences.Key<Integer> KEY_PORT = PreferencesKeys.intKey("proxy_port");
    private static final Preferences.Key<String> KEY_USERNAME = PreferencesKeys.stringKey("proxy_username");
    private static final Preferences.Key<String> KEY_PASSWORD = PreferencesKeys.stringKey("proxy_password");
    private static final Preferences.Key<Boolean> KEY_BYPASS_LAN = PreferencesKeys.booleanKey("proxy_bypass_lan");

    public ProxySettings(Context context) {
        context.getClass();
        this.context = context;
        Companion.getClass();
        this.proxyConfigFlow = new b7(((DataStore) dataStore$delegate.getValue(context, mr1.a[0])).getData(), 8);
    }

    public final Flow<ProxyConfig> getProxyConfigFlow() {
        return this.proxyConfigFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object saveProxyConfig(ProxyConfig proxyConfig, Continuation<? super Unit> continuation) {
        nr1 nr1Var;
        if (continuation instanceof nr1) {
            nr1Var = (nr1) continuation;
            int i = nr1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr1Var.d = i - Integer.MIN_VALUE;
            } else {
                nr1Var = new nr1(this, continuation);
            }
        } else {
            nr1Var = new nr1(this, continuation);
        }
        Object obj = nr1Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nr1Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("ProxySettings", "========== 保存代理配置到 DataStore ==========");
            Log.d("ProxySettings", "配置: enabled=" + proxyConfig.getEnabled() + ", protocol=" + proxyConfig.getProtocol().name() + ", host=" + proxyConfig.getHost() + ", port=" + proxyConfig.getPort() + ", hasCredentials=" + proxyConfig.getHasCredentials() + ", bypassLan=" + proxyConfig.getBypassLan());
            mr1 mr1Var = Companion;
            Context context = this.context;
            mr1Var.getClass();
            DataStore dataStore = (DataStore) dataStore$delegate.getValue(context, mr1.a[0]);
            or1 or1Var = new or1(proxyConfig, null);
            nr1Var.a = null;
            nr1Var.d = 1;
            if (PreferencesKt.edit(dataStore, or1Var, nr1Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        Log.d("ProxySettings", "✅ 保存完成");
        Log.d("ProxySettings", "==========================================");
        return Unit.INSTANCE;
    }
}

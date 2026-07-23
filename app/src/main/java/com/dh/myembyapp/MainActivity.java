package com.dh.myembyapp;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.ContextCompat;
import com.dh.myembyapp.data.DeviceIdManager;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.dlna.DlnaConstants;
import com.dh.myembyapp.dlna.DlnaService;
import com.dh.myembyapp.dlna.DlnaSettings;
import defpackage.c61;
import defpackage.k21;
import defpackage.l21;
import defpackage.lr1;
import java.net.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public final class MainActivity extends ComponentActivity {
    public static final /* synthetic */ int d = 0;
    public UserPreferences a;
    public l21 b;
    public final MutableState c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ServerConfig effectiveServerConfig;
        super.onCreate(bundle);
        this.a = new UserPreferences(this);
        String deviceId = DeviceIdManager.INSTANCE.getDeviceId(this);
        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
        retrofitClient.setDeviceId(deviceId);
        Log.i("MainActivity", "应用启动，DeviceId已初始化: " + deviceId);
        retrofitClient.setAppVersion("0.3.0");
        Log.i("MainActivity", "应用版本: 0.3.0");
        ServerConfig lastUsedServer = new ServerPreferences(this).getLastUsedServer();
        if (lastUsedServer == null || (effectiveServerConfig = lastUsedServer.getEffectiveServerConfig()) == null || !effectiveServerConfig.isLoggedIn()) {
            effectiveServerConfig = null;
        }
        int i = 0;
        if (effectiveServerConfig == null) {
            retrofitClient.setAuthToken("", "");
            retrofitClient.setTrustAllCerts(false);
            lr1.c(false);
            Log.i("MainActivity", "启动时未找到可恢复的已登录服务器");
        } else {
            retrofitClient.initialize(effectiveServerConfig.getFullUrl());
            String accessToken = effectiveServerConfig.getAccessToken();
            accessToken.getClass();
            String userId = effectiveServerConfig.getUserId();
            userId.getClass();
            retrofitClient.setAuthToken(accessToken, userId);
            retrofitClient.setDeviceId(deviceId);
            retrofitClient.setTrustAllCerts(effectiveServerConfig.getTrustAllCerts());
            Proxy proxy = lr1.a;
            lr1.c(effectiveServerConfig.getDirectOnly());
            Log.i("MainActivity", "启动时恢复服务器配置: id=" + effectiveServerConfig.getId() + ", alias=" + effectiveServerConfig.getAlias());
        }
        if (new DlnaSettings(this).getConfigSync().getEnabled()) {
            DlnaService.INSTANCE.start(this);
            Log.i("MainActivity", "DLNA 服务已启动");
        }
        this.b = new l21(this);
        IntentFilter intentFilter = new IntentFilter(DlnaConstants.ACTION_PLAY_REQUEST);
        l21 l21Var = this.b;
        if (l21Var != null) {
            ContextCompat.registerReceiver(this, l21Var, intentFilter, 4);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-2067327351, true, new k21(this, i)), 1, null);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l21 l21Var = this.b;
        if (l21Var != null) {
            try {
                unregisterReceiver(l21Var);
            } catch (Exception unused) {
            }
        }
        this.b = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        int taskId = getTaskId();
        int flags = intent.getFlags();
        String action = intent.getAction();
        StringBuilder sbO = c61.o("复用已有任务处理新 Intent: taskId=", taskId, flags, ", flags=", ", action=");
        sbO.append(action);
        Log.i("MainActivity", sbO.toString());
    }
}

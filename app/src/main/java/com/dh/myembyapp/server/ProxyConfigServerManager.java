package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import defpackage.f5;
import defpackage.tl0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxyConfigServerManager {
    private static final int DEFAULT_PORT = 8760;
    private static final int MAX_PORT = 8764;
    private static final String TAG = "ProxyCfgServer";
    private final Context context;
    private ProxyConfigServer server;
    

    public ProxyConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startServer$lambda$0(Function1 function1, ProxyConfig proxyConfig) {
        proxyConfig.getClass();
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ProxyConfigServerManager$startServer$1$1(function1, proxyConfig, null), 3, null);
        return Unit.INSTANCE;
    }

    public final String startServer(ProxyConfig initialConfig, Function1<? super ProxyConfig, Unit> onConfigReceived) {
        initialConfig.getClass();
        onConfigReceived.getClass();
        stopServer();
        IOException e = null;
        for (int i = DEFAULT_PORT; i < 8765; i++) {
            try {
                ProxyConfigServer proxyConfigServer = new ProxyConfigServer(i, initialConfig, new f5(onConfigReceived, 21));
                this.server = proxyConfigServer;
                proxyConfigServer.start();
                return tl0.b(this.context, i);
            } catch (IOException e2) {
                e = e2;
                ProxyConfigServer proxyConfigServer2 = this.server;
                if (proxyConfigServer2 != null) {
                    proxyConfigServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "端口 " + i + " 启动失败", e);
                String message = e.getMessage();
                if (message == null || !message.contains("EADDRINUSE")) {
                    break;
                }
            }
        }
        if (e != null) {
            Log.e(TAG, "所有候选端口均启动失败", e);
        }
        return null;
    }

    public final void stopServer() {
        ProxyConfigServer proxyConfigServer = this.server;
        if (proxyConfigServer != null) {
            proxyConfigServer.stop();
        }
        this.server = null;
    }
}

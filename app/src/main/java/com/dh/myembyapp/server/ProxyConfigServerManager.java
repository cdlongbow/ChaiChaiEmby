package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import defpackage.f5;
import defpackage.tl0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/server/ProxyConfigServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/ProxyConfigServer;", "startServer", "", "initialConfig", "Lcom/dh/myembyapp/data/ProxyConfig;", "onConfigReceived", "Lkotlin/Function1;", "", "stopServer", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProxyConfigServerManager {
    private static final int DEFAULT_PORT = 8760;
    private static final int MAX_PORT = 8764;
    private static final String TAG = "ProxyCfgServer";
    private final Context context;
    private ProxyConfigServer server;
    public static final int $stable = 8;

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
                if (message == null || !StringsKt.contains$default(message, (CharSequence) "EADDRINUSE", false, 2, (Object) null)) {
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

package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.a92;
import defpackage.tl0;
import defpackage.ye2;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class WebDavSyncConfigServerManager {
    private static final int DEFAULT_PORT = 8772;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "WebDavSyncCfgServer";
    private final Context context;
    private WebDavSyncConfigServer server;
    

    public WebDavSyncConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startServer$lambda$0(Function1 function1, ye2 ye2Var) {
        ye2Var.getClass();
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new WebDavSyncConfigServerManager$startServer$1$1(function1, ye2Var, null), 3, null);
        return Unit.INSTANCE;
    }

    public final String startServer(ye2 initialConfig, Function1<? super ye2, Unit> onConfigReceived) {
        initialConfig.getClass();
        onConfigReceived.getClass();
        stopServer();
        int i = DEFAULT_PORT;
        IOException iOException = null;
        while (i < 8800) {
            try {
                WebDavSyncConfigServer webDavSyncConfigServer = new WebDavSyncConfigServer(i, initialConfig, new a92(onConfigReceived, 1));
                this.server = webDavSyncConfigServer;
                webDavSyncConfigServer.start();
                return tl0.b(this.context, i);
            } catch (IOException e) {
                WebDavSyncConfigServer webDavSyncConfigServer2 = this.server;
                if (webDavSyncConfigServer2 != null) {
                    webDavSyncConfigServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "端口 " + i + " 启动失败", e);
                String message = e.getMessage();
                if (message == null || !message.contains("EADDRINUSE")) {
                    iOException = e;
                    break;
                }
                i++;
                iOException = e;
            }
        }
        if (iOException != null) {
            Log.e(TAG, "所有候选端口均启动失败", iOException);
        }
        return null;
    }

    public final void stopServer() {
        WebDavSyncConfigServer webDavSyncConfigServer = this.server;
        if (webDavSyncConfigServer != null) {
            webDavSyncConfigServer.stop();
        }
        this.server = null;
    }
}

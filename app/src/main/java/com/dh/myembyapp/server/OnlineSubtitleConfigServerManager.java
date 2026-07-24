package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.f5;
import defpackage.t91;
import defpackage.tl0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class OnlineSubtitleConfigServerManager {
    private static final int DEFAULT_PORT = 8770;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "OnlineSubCfgServer";
    private final Context context;
    private OnlineSubtitleConfigServer server;
    

    public OnlineSubtitleConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startServer$lambda$0(Function1 function1, t91 t91Var) {
        t91Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new OnlineSubtitleConfigServerManager$startServer$1$1(function1, t91Var, null), 3, null);
        return Unit.INSTANCE;
    }

    public final String startServer(t91 initialConfig, Function1<? super t91, Unit> onConfigReceived) {
        initialConfig.getClass();
        onConfigReceived.getClass();
        stopServer();
        IOException e = null;
        for (int i = DEFAULT_PORT; i < 8800; i++) {
            try {
                OnlineSubtitleConfigServer onlineSubtitleConfigServer = new OnlineSubtitleConfigServer(i, initialConfig, new f5(onConfigReceived, 17));
                this.server = onlineSubtitleConfigServer;
                onlineSubtitleConfigServer.start();
                return tl0.b(this.context, i);
            } catch (IOException e2) {
                e = e2;
                OnlineSubtitleConfigServer onlineSubtitleConfigServer2 = this.server;
                if (onlineSubtitleConfigServer2 != null) {
                    onlineSubtitleConfigServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "端口 " + i + " 启动失败", e);
                String message = e.getMessage();
                if (message == null || !StringsKt__message.contains("EADDRINUSE")) {
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
        OnlineSubtitleConfigServer onlineSubtitleConfigServer = this.server;
        if (onlineSubtitleConfigServer != null) {
            onlineSubtitleConfigServer.stop();
        }
        this.server = null;
    }
}

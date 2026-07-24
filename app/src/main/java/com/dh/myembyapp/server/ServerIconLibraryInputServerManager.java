package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
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
public final class ServerIconLibraryInputServerManager {
    private static final int DEFAULT_PORT = 8780;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "ServerIconInputSrv";
    private final Context context;
    private ServerIconLibraryInputServer server;
    

    public ServerIconLibraryInputServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    public static /* synthetic */ String startServer$default(ServerIconLibraryInputServerManager serverIconLibraryInputServerManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return serverIconLibraryInputServerManager.startServer(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startServer$lambda$0(Function1 function1, String str) {
        str.getClass();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ServerIconLibraryInputServerManager$startServer$1$1(function1, str, null), 3, null);
        return Unit.INSTANCE;
    }

    public final String startServer(String initialUrl, Function1<? super String, Unit> onUrlReceived) {
        initialUrl.getClass();
        onUrlReceived.getClass();
        stopServer();
        IOException e = null;
        for (int i = DEFAULT_PORT; i < 8800; i++) {
            try {
                ServerIconLibraryInputServer serverIconLibraryInputServer = new ServerIconLibraryInputServer(i, initialUrl, new f5(onUrlReceived, 24));
                this.server = serverIconLibraryInputServer;
                serverIconLibraryInputServer.start();
                return tl0.b(this.context, i);
            } catch (IOException e2) {
                e = e2;
                ServerIconLibraryInputServer serverIconLibraryInputServer2 = this.server;
                if (serverIconLibraryInputServer2 != null) {
                    serverIconLibraryInputServer2.stop();
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
        ServerIconLibraryInputServer serverIconLibraryInputServer = this.server;
        if (serverIconLibraryInputServer != null) {
            serverIconLibraryInputServer.stop();
        }
        this.server = null;
    }
}

package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/dh/myembyapp/server/ServerIconLibraryInputServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/ServerIconLibraryInputServer;", "startServer", "", "initialUrl", "onUrlReceived", "Lkotlin/Function1;", "", "stopServer", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerIconLibraryInputServerManager {
    private static final int DEFAULT_PORT = 8780;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "ServerIconInputSrv";
    private final Context context;
    private ServerIconLibraryInputServer server;
    public static final int $stable = 8;

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
                if (message == null || !StringsKt__StringsKt.contains$default(message, (CharSequence) "EADDRINUSE", false, 2, (Object) null)) {
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

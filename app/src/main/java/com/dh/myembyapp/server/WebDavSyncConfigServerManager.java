package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.a92;
import defpackage.tl0;
import defpackage.ye2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/server/WebDavSyncConfigServerManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lye2;", "initialConfig", "Lkotlin/Function1;", "", "onConfigReceived", "", "startServer", "(Lye2;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "stopServer", "()V", "Landroid/content/Context;", "Lcom/dh/myembyapp/server/WebDavSyncConfigServer;", "server", "Lcom/dh/myembyapp/server/WebDavSyncConfigServer;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebDavSyncConfigServerManager {
    private static final int DEFAULT_PORT = 8772;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "WebDavSyncCfgServer";
    private final Context context;
    private WebDavSyncConfigServer server;
    public static final int $stable = 8;

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
                if (message == null || !StringsKt.contains$default(message, (CharSequence) "EADDRINUSE", false, 2, (Object) null)) {
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

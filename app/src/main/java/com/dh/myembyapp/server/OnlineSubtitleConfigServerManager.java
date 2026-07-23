package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.f5;
import defpackage.t91;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/server/OnlineSubtitleConfigServerManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lt91;", "initialConfig", "Lkotlin/Function1;", "", "onConfigReceived", "", "startServer", "(Lt91;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "stopServer", "()V", "Landroid/content/Context;", "Lcom/dh/myembyapp/server/OnlineSubtitleConfigServer;", "server", "Lcom/dh/myembyapp/server/OnlineSubtitleConfigServer;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnlineSubtitleConfigServerManager {
    private static final int DEFAULT_PORT = 8770;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "OnlineSubCfgServer";
    private final Context context;
    private OnlineSubtitleConfigServer server;
    public static final int $stable = 8;

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
        OnlineSubtitleConfigServer onlineSubtitleConfigServer = this.server;
        if (onlineSubtitleConfigServer != null) {
            onlineSubtitleConfigServer.stop();
        }
        this.server = null;
    }
}

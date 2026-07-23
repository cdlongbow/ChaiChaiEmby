package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.model.ServerConfig;
import defpackage.rd1;
import defpackage.tl0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/server/ConfigServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/ConfigServer;", "onConfigReceived", "Lkotlin/Function2;", "Lcom/dh/myembyapp/data/model/ServerConfig;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "startServer", "", "currentConfig", "(Lcom/dh/myembyapp/data/model/ServerConfig;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "stopServer", "handleConfig", "config", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfigServerManager {
    private static final int DEFAULT_PORT = 8765;
    private static final int MIN_PORT = 8750;
    private static final String TAG = "ConfigServerManager";
    private final Context context;
    private Function2<? super ServerConfig, ? super Continuation<? super Unit>, ? extends Object> onConfigReceived;
    private ConfigServer server;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.dh.myembyapp.server.ConfigServerManager$handleConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.server.ConfigServerManager$handleConfig$1", f = "ConfigServerManager.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, nl = {Input.Keys.MUTE}, s = {}, v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerConfig $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServerConfig serverConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$config = serverConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigServerManager.this.new AnonymousClass1(this.$config, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = ConfigServerManager.this.onConfigReceived;
                if (function2 != null) {
                    ServerConfig serverConfig = this.$config;
                    this.label = 1;
                    if (function2.invoke(serverConfig, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public ConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConfig(ServerConfig config) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(config, null), 3, null);
    }

    public static /* synthetic */ String startServer$default(ConfigServerManager configServerManager, ServerConfig serverConfig, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            serverConfig = null;
        }
        return configServerManager.startServer(serverConfig, function2);
    }

    public final String startServer(ServerConfig currentConfig, Function2<? super ServerConfig, ? super Continuation<? super Unit>, ? extends Object> onConfigReceived) {
        onConfigReceived.getClass();
        stopServer();
        this.onConfigReceived = onConfigReceived;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(Integer.valueOf(DEFAULT_PORT));
        for (int i = 8764; 8749 < i; i--) {
            listCreateListBuilder.add(Integer.valueOf(i));
        }
        Iterator it = CollectionsKt.build(listCreateListBuilder).iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            try {
                ConfigServer configServer = new ConfigServer(iIntValue, this.context, currentConfig, new C03681(this));
                this.server = configServer;
                configServer.start();
                return tl0.b(this.context, iIntValue);
            } catch (IOException e) {
                ConfigServer configServer2 = this.server;
                if (configServer2 != null) {
                    configServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "Failed to start server on port " + iIntValue, e);
                String message = e.getMessage();
                if (message == null || !StringsKt__StringsKt.contains$default(message, (CharSequence) "EADDRINUSE", false, 2, (Object) null)) {
                    iOException = e;
                    break;
                }
                iOException = e;
            }
        }
        if (iOException != null) {
            Log.e(TAG, "All candidate ports failed", iOException);
        }
        return null;
    }

    public final void stopServer() {
        ConfigServer configServer = this.server;
        if (configServer != null) {
            configServer.stop();
        }
        this.server = null;
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.server.ConfigServerManager$startServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C03681 extends FunctionReferenceImpl implements Function1<ServerConfig, Unit> {
        public C03681(Object obj) {
            super(1, obj, ConfigServerManager.class, "handleConfig", "handleConfig(Lcom/dh/myembyapp/data/model/ServerConfig;)V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ServerConfig serverConfig) {
            serverConfig.getClass();
            ((ConfigServerManager) this.receiver).handleConfig(serverConfig);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ServerConfig serverConfig) {
            invoke2(serverConfig);
            return Unit.INSTANCE;
        }
    }
}

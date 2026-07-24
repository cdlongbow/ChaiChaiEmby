package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.model.ServerConfig;
import defpackage.rd1;
import defpackage.tl0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
public final class ConfigServerManager {
    private static final int DEFAULT_PORT = 8765;
    private static final int MIN_PORT = 8750;
    private static final String TAG = "ConfigServerManager";
    private final Context context;
    private Function2<? super ServerConfig, ? super Continuation<? super Unit>, ? extends Object> onConfigReceived;
    private ConfigServer server;
    

    /* JADX INFO: renamed from: com.dh.myembyapp.server.ConfigServerManager$handleConfig$1, reason: invalid class name */
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
                if (message == null || !StringsKt__message.contains("EADDRINUSE")) {
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

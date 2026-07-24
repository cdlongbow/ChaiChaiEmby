package com.dh.myembyapp.server;

import com.dh.myembyapp.data.model.DanmakuConfig;
import defpackage.rd1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DanmakuConfig $config;
    int label;
    final /* synthetic */ DanmakuConfigServerManager.DanmakuConfigServer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1(DanmakuConfigServerManager.DanmakuConfigServer danmakuConfigServer, DanmakuConfig danmakuConfig, Continuation<? super DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1> continuation) {
        super(2, continuation);
        this.this$0 = danmakuConfigServer;
        this.$config = danmakuConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1(this.this$0, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.this$0.onConfigReceived;
        DanmakuConfig danmakuConfig = this.$config;
        danmakuConfig.getClass();
        function1.invoke(danmakuConfig);
        return Unit.INSTANCE;
    }
}

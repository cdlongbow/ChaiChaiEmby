package com.dh.myembyapp.server;

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
public final class DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyword;
    int label;
    final /* synthetic */ DanmakuSearchInputServerManager.DanmakuSearchInputServer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1(DanmakuSearchInputServerManager.DanmakuSearchInputServer danmakuSearchInputServer, String str, Continuation<? super DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1> continuation) {
        super(2, continuation);
        this.this$0 = danmakuSearchInputServer;
        this.$keyword = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1(this.this$0, this.$keyword, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.this$0.onSearchReceived;
        String str = this.$keyword;
        str.getClass();
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}

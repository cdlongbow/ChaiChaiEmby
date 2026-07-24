package com.dh.myembyapp.server;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import defpackage.rd1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class BackupRouteConfigServerManager$startServer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<BackupRouteConfig>, Unit> $onConfigReceived;
    final /* synthetic */ List<BackupRouteConfig> $routes;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackupRouteConfigServerManager$startServer$1$1(Function1<? super List<BackupRouteConfig>, Unit> function1, List<BackupRouteConfig> list, Continuation<? super BackupRouteConfigServerManager$startServer$1$1> continuation) {
        super(2, continuation);
        this.$onConfigReceived = function1;
        this.$routes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackupRouteConfigServerManager$startServer$1$1(this.$onConfigReceived, this.$routes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackupRouteConfigServerManager$startServer$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        this.$onConfigReceived.invoke(this.$routes);
        return Unit.INSTANCE;
    }
}

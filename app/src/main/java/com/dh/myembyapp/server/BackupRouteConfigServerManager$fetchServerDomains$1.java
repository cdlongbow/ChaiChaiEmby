package com.dh.myembyapp.server;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class BackupRouteConfigServerManager$fetchServerDomains$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackupRouteConfigServerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRouteConfigServerManager$fetchServerDomains$1(BackupRouteConfigServerManager backupRouteConfigServerManager, Continuation<? super BackupRouteConfigServerManager$fetchServerDomains$1> continuation) {
        super(continuation);
        this.this$0 = backupRouteConfigServerManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8804fetchServerDomainsgIAlus = this.this$0.m8804fetchServerDomainsgIAlus(null, this);
        return objM8804fetchServerDomainsgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8804fetchServerDomainsgIAlus : Result.m8824boximpl(objM8804fetchServerDomainsgIAlus);
    }
}

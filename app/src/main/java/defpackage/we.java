package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class we extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ye g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(ye yeVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = yeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        Object objR = this.g.r(null, null, null, 0, 0, null, this);
        return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : Result.m8824boximpl(objR);
    }
}

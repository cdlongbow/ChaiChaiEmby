package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class lf2 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pf2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf2(pf2 pf2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objH = this.c.h(null, this);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.m8824boximpl(objH);
    }
}

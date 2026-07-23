package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class be0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ uf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = this.b.k(this);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : Result.m8824boximpl(objK);
    }
}

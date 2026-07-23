package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class te0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uf0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objU = this.d.u(null, null, 0, this);
        return objU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objU : Result.m8824boximpl(objU);
    }
}

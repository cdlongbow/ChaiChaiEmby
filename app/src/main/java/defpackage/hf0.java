package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class hf0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ uf0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objD = this.h.D(null, null, null, null, null, 0L, this);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.m8824boximpl(objD);
    }
}

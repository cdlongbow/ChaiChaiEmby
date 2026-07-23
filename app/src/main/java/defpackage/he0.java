package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class he0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ uf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objN = this.j.n(null, null, null, null, null, null, null, this);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Result.m8824boximpl(objN);
    }
}

package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ne0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uf0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.p = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objQ = this.p.q(null, null, false, null, null, null, null, null, null, null, null, null, null, null, this);
        return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : Result.m8824boximpl(objQ);
    }
}

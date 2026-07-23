package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class jf0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ uf0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objE = this.i.E(null, null, 0L, null, null, null, null, this);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Result.m8824boximpl(objE);
    }
}

package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class da2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public n92 e;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xa2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objF = this.i.F(null, null, null, this);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Result.m8824boximpl(objF);
    }
}

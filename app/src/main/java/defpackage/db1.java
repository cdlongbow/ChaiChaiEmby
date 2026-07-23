package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class db1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ hb1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(hb1 hb1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = hb1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objF = this.i.f(null, null, null, null, null, null, this);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Result.m8824boximpl(objF);
    }
}

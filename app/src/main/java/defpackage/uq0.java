package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class uq0 extends ContinuationImpl {
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public Function1 g;
    public Ref.ObjectRef h;
    public /* synthetic */ Object i;
    public final /* synthetic */ zq0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(zq0 zq0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = zq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objK = this.j.K(0, 0L, null, this);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : Result.m8824boximpl(objK);
    }
}

package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b4 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b4 b4Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = b4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        Object objI = this.e.i(null, null, false, 0, null, this);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : Result.m8824boximpl(objI);
    }
}

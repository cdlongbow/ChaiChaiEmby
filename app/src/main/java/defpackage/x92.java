package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class x92 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xa2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objZ = this.c.z(null, this);
        return objZ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZ : Result.m8824boximpl(objZ);
    }
}

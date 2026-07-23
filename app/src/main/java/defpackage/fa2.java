package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class fa2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xa2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        Object objH = xa2.h(this.e, null, null, null, this);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.m8824boximpl(objH);
    }
}

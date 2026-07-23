package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class na0 extends ContinuationImpl {
    public ea0 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ va0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(va0 va0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = va0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.o(null, this);
    }
}

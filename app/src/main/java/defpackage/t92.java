package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class t92 extends ContinuationImpl {
    public Object a;
    public Object b;
    public double c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xa2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t92(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.s(null, 0.0d, 0L, null, this);
    }
}

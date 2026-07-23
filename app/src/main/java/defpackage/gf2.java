package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class gf2 extends ContinuationImpl {
    public se2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pf2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(pf2 pf2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}

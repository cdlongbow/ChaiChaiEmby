package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class jf2 extends ContinuationImpl {
    public Object a;
    public we2 b;
    public int c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pf2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf2(pf2 pf2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return pf2.d(this.g, null, this);
    }
}

package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class js1 extends ContinuationImpl {
    public rt1 a;
    public fs0 b;
    public yg0 c;
    public pr0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ks1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js1(ks1 ks1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = ks1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, 0, this);
    }
}

package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class nf extends ContinuationImpl {
    public fs0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ of c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(of ofVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = ofVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}

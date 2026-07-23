package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ms1 extends ContinuationImpl {
    public ju0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ns1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms1(ns1 ns1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = ns1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}

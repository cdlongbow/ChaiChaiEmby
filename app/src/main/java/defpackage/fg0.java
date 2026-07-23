package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class fg0 extends ContinuationImpl {
    public ns1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gg0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg0(gg0 gg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}

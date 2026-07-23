package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class no1 extends ContinuationImpl {
    public io1 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ to1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no1(to1 to1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = to1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return to1.k(this.d, null, this);
    }
}

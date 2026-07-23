package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ko1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public String c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ to1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko1(to1 to1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = to1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return to1.h(this.g, null, this);
    }
}

package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ca2 extends ContinuationImpl {
    public String a;
    public p92 b;
    public Object c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xa2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.C(null, null, null, null, this);
    }
}

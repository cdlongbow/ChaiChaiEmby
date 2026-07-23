package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ba2 extends ContinuationImpl {
    public String a;
    public p92 b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xa2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.B(null, null, null, this);
    }
}

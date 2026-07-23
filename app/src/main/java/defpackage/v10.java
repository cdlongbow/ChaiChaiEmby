package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class v10 extends ContinuationImpl {
    public String a;
    public Object b;
    public u10 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ w10 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(w10 w10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = w10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}

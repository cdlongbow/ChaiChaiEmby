package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class bz0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cz0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(cz0 cz0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = cz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return cz0.d(this.e, null, null, this);
    }
}

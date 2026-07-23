package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class q81 extends ContinuationImpl {
    public Object a;
    public v81 b;
    public ri c;
    public /* synthetic */ Object d;
    public final /* synthetic */ s81 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(s81 s81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = s81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return s81.d(this.e, null, null, null, this);
    }
}

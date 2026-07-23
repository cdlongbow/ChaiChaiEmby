package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class sa0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public String c;
    public Object d;
    public Object e;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ va0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(va0 va0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = va0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return va0.e(this.j, null, null, null, false, false, null, this);
    }
}

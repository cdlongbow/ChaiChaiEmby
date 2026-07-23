package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class bg0 extends ContinuationImpl {
    public o22 a;
    public ds b;
    public fs0 c;
    public Object d;
    public wa1 e;
    public yg0 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ gg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(gg0 gg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return gg0.a(this.j, null, null, null, null, null, null, this);
    }
}

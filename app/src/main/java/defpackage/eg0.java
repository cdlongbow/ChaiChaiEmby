package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class eg0 extends ContinuationImpl {
    public ds a;
    public fs0 b;
    public Object c;
    public wa1 d;
    public yg0 e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gg0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(gg0 gg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, null, null, null, null, this);
    }
}

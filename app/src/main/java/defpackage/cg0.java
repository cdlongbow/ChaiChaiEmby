package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class cg0 extends ContinuationImpl {
    public fs0 a;
    public Object b;
    public Object c;
    public Ref.ObjectRef d;
    public Ref.ObjectRef e;
    public Ref.ObjectRef g;
    public Ref.ObjectRef h;
    public /* synthetic */ Object i;
    public final /* synthetic */ gg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(gg0 gg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = gg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return gg0.b(this.j, null, null, null, null, this);
    }
}

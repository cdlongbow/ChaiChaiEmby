package defpackage;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class hf2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public List c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pf2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf2(pf2 pf2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return pf2.a(this.e, null, null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class gj0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public final /* synthetic */ hj0 d;
    public Object e;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(hj0 hj0Var, Continuation continuation) {
        super(continuation);
        this.d = hj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}

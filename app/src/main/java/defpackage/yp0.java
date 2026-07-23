package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class yp0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ a7 e;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(a7 a7Var, Continuation continuation) {
        super(continuation);
        this.e = a7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}

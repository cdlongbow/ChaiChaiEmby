package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class n81 extends ContinuationImpl {
    public Ref.ObjectRef a;
    public Ref.ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s81 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n81(s81 s81Var, Continuation continuation) {
        super(continuation);
        this.d = s81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return s81.b(this.d, this);
    }
}

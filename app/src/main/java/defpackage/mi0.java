package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class mi0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Function1 e;
    public boolean g;
    public /* synthetic */ Object h;
    public int i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return ku.m(null, null, null, 0.0f, null, false, null, this);
    }
}

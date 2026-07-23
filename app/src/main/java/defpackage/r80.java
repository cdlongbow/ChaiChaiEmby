package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class r80 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public boolean e;
    public boolean g;
    public /* synthetic */ Object h;
    public int i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return u90.f(null, null, null, null, false, false, this);
    }
}

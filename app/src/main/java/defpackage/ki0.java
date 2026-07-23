package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ki0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Function1 d;
    public Object e;
    public Object g;
    public Object h;
    public long i;
    public boolean j;
    public /* synthetic */ Object k;
    public int l;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return ku.k(null, null, null, 0L, false, null, this);
    }
}

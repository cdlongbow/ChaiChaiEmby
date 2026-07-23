package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class li0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Function1 c;
    public Object d;
    public Object e;
    public long g;
    public boolean h;
    public /* synthetic */ Object i;
    public int j;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return ku.l(null, null, 0L, false, null, this);
    }
}

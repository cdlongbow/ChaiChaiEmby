package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class yd2 extends ContinuationImpl {
    public q22 a;
    public Buffer b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return tl0.P(null, this);
    }
}

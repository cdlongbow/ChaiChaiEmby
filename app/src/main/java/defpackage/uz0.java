package defpackage;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class uz0 extends ContinuationImpl {
    public Lifecycle a;
    public Ref.ObjectRef b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return wz0.a(null, this);
    }
}

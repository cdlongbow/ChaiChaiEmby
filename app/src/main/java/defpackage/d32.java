package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final class d32 extends ContinuationImpl {
    public Semaphore a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f32 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d32(f32 f32Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = f32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}

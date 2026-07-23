package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final class kl extends ContinuationImpl {
    public Semaphore a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ll c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ll llVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = llVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}

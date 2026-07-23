package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class lu extends ContinuationImpl {
    public Ref.ObjectRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(mu muVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = muVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}

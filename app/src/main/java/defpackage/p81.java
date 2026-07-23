package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class p81 extends ContinuationImpl {
    public Buffer a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s81 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(s81 s81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = s81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return s81.c(this.c, null, this);
    }
}

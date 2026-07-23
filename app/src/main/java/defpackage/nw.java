package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nw extends ContinuationImpl {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String g;
    public Function1 h;
    public Object i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rw m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(rw rwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = rwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, 0L, null, null, null, null, null, null, this);
    }
}

package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class zw extends ContinuationImpl {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ ax h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(ax axVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = axVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, null, null, null, null, false, this);
    }
}

package defpackage;

import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class yw extends ContinuationImpl {
    public long a;
    public Object b;
    public String c;
    public String d;
    public Object e;
    public Object g;
    public Iterator h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ax k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ax axVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = axVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objA = this.k.a(0L, null, null, null, null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8824boximpl(objA);
    }
}

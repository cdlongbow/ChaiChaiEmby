package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class lw extends ContinuationImpl {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rw g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(rw rwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = rwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        Object objA = this.g.a(null, null, false, false, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8824boximpl(objA);
    }
}

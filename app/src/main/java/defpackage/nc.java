package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class nc extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(pc pcVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = pcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        Object objF = this.g.f(null, null, null, null, this);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Result.m8824boximpl(objF);
    }
}

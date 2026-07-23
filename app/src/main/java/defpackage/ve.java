package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ve extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ye e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ye yeVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = yeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        Object objJ = this.e.j(null, null, null, this);
        return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : Result.m8824boximpl(objJ);
    }
}

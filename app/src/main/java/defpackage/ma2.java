package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ma2 extends ContinuationImpl {
    public MediaItem a;
    public Object b;
    public Function2 c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xa2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objN = xa2.n(this.k, null, null, null, this);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Result.m8824boximpl(objN);
    }
}

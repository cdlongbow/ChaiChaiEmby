package defpackage;

import com.dh.myembyapp.data.model.Library;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class rq0 extends ContinuationImpl {
    public Object a;
    public Library b;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zq0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(zq0 zq0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = zq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return zq0.b(this.g, null, null, 0L, false, this);
    }
}

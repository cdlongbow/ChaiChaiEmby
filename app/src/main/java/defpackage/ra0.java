package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ra0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public MediaItem e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ va0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra0(va0 va0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = va0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.s(null, null, false, null, this);
    }
}

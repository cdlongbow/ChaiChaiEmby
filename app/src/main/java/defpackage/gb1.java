package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class gb1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public MediaItem c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hb1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(hb1 hb1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = hb1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return hb1.e(this.e, null, null, null, this);
    }
}

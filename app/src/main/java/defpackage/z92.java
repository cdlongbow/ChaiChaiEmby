package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class z92 extends ContinuationImpl {
    public MediaItem a;
    public Object b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xa2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z92(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return xa2.e(this.e, null, false, this);
    }
}

package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class s3 extends ContinuationImpl {
    public Object a;
    public Object b;
    public MediaItem c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b4 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(b4 b4Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = b4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return b4.c(this.e, null, null, null, this);
    }
}

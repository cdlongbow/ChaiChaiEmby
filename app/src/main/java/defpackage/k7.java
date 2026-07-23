package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class k7 extends ContinuationImpl {
    public ServerConfig a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(p7 p7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = p7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return p7.b(this.c, null, this);
    }
}

package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class j7 extends ContinuationImpl {
    public ServerConfig a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(p7 p7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = p7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return p7.a(this.d, null, this);
    }
}

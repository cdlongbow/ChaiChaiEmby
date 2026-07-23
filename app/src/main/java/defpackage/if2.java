package defpackage;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.DanmakuConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class if2 extends ContinuationImpl {
    public tf2 a;
    public bc b;
    public ProxyConfig c;
    public DanmakuConfig d;
    public t91 e;
    public te2 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ pf2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(pf2 pf2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}

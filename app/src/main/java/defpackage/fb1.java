package defpackage;

import com.dh.myembyapp.data.model.EpisodeLocator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class fb1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public String c;
    public EpisodeLocator d;
    public Object e;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ hb1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(hb1 hb1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = hb1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return hb1.d(this.j, null, null, null, null, this);
    }
}

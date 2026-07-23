package defpackage;

import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.model.DanmakuMatch;
import com.dh.myembyapp.data.model.DanmakuMatchRequest;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class mw extends ContinuationImpl {
    public Object a;
    public DanmakuConfig b;
    public Object c;
    public DanmakuMatchRequest d;
    public List e;
    public Iterator g;
    public String h;
    public Object i;
    public Object j;
    public Object k;
    public DanmakuMatch l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ rw r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(rw rwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = rwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, null, false, this);
    }
}

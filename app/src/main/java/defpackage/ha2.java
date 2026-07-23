package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TraktIds;
import com.dh.myembyapp.data.model.TraktShow;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ha2 extends ContinuationImpl {
    public MediaItem a;
    public String b;
    public TraktIds c;
    public String d;
    public Integer e;
    public Integer g;
    public Object h;
    public Object i;
    public MediaItem j;
    public Object k;
    public Iterator l;
    public Object m;
    public TraktShow n;
    public TraktIds o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ xa2 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.H(null, null, this);
    }
}

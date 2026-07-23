package defpackage;

import com.dh.myembyapp.data.model.Library;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class lf0 extends ContinuationImpl {
    public String a;
    public Object b;
    public Object c;
    public Object d;
    public Collection e;
    public Iterator g;
    public Object h;
    public Library i;
    public Collection j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(uf0 uf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.n = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return uf0.d(this.n, null, null, this);
    }
}

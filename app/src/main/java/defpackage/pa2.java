package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class pa2 extends ContinuationImpl {
    public MediaItem a;
    public Object b;
    public ib2 c;
    public Function2 d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Set l;
    public Set m;
    public Object n;
    public List o;
    public Iterator p;
    public Object q;
    public Object r;
    public Object s;
    public int t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ xa2 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.y = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        Object objQ = xa2.q(this.y, null, null, null, null, this);
        return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : Result.m8824boximpl(objQ);
    }
}

package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class oa2 extends ContinuationImpl {
    public MediaItem a;
    public Object b;
    public Object c;
    public Function2 d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public List m;
    public String n;
    public Iterator o;
    public Object p;
    public Object q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ xa2 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.x = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Object objP = xa2.p(this.x, null, null, null, null, this);
        return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : Result.m8824boximpl(objP);
    }
}

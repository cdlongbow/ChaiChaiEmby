package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ia0 extends ContinuationImpl {
    public String a;
    public String b;
    public Object c;
    public Object d;
    public Object e;
    public MediaItem g;
    public Iterator h;
    public MediaItem i;
    public /* synthetic */ Object j;
    public final /* synthetic */ va0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(va0 va0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = va0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, null, null, this);
    }
}

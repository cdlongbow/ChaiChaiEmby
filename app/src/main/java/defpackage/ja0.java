package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ja0 extends ContinuationImpl {
    public String a;
    public String b;
    public Object c;
    public List d;
    public List e;
    public Iterator g;
    public MediaItem h;
    public /* synthetic */ Object i;
    public final /* synthetic */ va0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(va0 va0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = va0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return va0.b(this.j, null, null, this);
    }
}

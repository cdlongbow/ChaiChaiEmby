package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ja2 extends ContinuationImpl {
    public MediaItem a;
    public String b;
    public Object c;
    public Iterator d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ xa2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.J(null, null, this);
    }
}

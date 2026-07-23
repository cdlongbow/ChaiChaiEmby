package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class mo1 extends ContinuationImpl {
    public String a;
    public MediaItem b;
    public Object c;
    public String d;
    public TranscodeQualityOption e;
    public Integer g;
    public Integer h;
    public Object i;
    public Object j;
    public i92 k;
    public long l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ to1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(to1 to1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = to1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return to1.i(this.o, null, null, 0L, null, false, null, null, null, null, this);
    }
}

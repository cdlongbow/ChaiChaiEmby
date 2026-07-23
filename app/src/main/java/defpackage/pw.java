package defpackage;

import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.model.DanmakuBangumi;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class pw extends ContinuationImpl {
    public DanmakuMemory.SeasonDanmakuMemory a;
    public Object b;
    public Object c;
    public DanmakuBangumi d;
    public DanmakuEpisode e;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ rw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(rw rwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = rwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, 0, this);
    }
}

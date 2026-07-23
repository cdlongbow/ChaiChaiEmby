package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class rh1 extends ContinuationImpl {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public String e;
    public ExoPlayer g;
    public Object h;
    public MediaItem i;
    public TrackSelectionParameters j;
    public long k;
    public float l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ sh1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh1(sh1 sh1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = sh1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(false, null, false, 0L, null, false, this);
    }
}

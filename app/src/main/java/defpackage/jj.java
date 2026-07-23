package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePreloadManager b;
    public final /* synthetic */ lp1 c;
    public final /* synthetic */ PreloadException d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jj(BasePreloadManager basePreloadManager, Object obj, lp1 lp1Var, PreloadException preloadException, int i) {
        this.a = i;
        this.b = basePreloadManager;
        this.e = obj;
        this.c = lp1Var;
        this.d = preloadException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreloadException preloadException = this.d;
        lp1 lp1Var = this.c;
        Object obj = this.e;
        BasePreloadManager basePreloadManager = this.b;
        switch (i) {
            case 0:
                basePreloadManager.lambda$onError$7((MediaItem) obj, lp1Var, preloadException);
                break;
            default:
                basePreloadManager.lambda$onError$5((MediaSource) obj, lp1Var, preloadException);
                break;
        }
    }
}

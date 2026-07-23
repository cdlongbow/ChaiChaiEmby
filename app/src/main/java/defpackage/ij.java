package defpackage;

import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ij implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePreloadManager b;
    public final /* synthetic */ MediaSource c;
    public final /* synthetic */ lp1 d;

    public /* synthetic */ ij(BasePreloadManager basePreloadManager, MediaSource mediaSource, lp1 lp1Var, int i) {
        this.a = i;
        this.b = basePreloadManager;
        this.c = mediaSource;
        this.d = lp1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lp1 lp1Var = this.d;
        MediaSource mediaSource = this.c;
        BasePreloadManager basePreloadManager = this.b;
        switch (i) {
            case 0:
                basePreloadManager.lambda$onSkipped$8(mediaSource, lp1Var);
                break;
            default:
                basePreloadManager.lambda$onCompleted$1(mediaSource, lp1Var);
                break;
        }
    }
}

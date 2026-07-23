package defpackage;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadMediaSource b;

    public /* synthetic */ sp1(PreloadMediaSource preloadMediaSource, int i) {
        this.a = i;
        this.b = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreloadMediaSource preloadMediaSource = this.b;
        switch (i) {
            case 0:
                preloadMediaSource.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                preloadMediaSource.lambda$clear$1();
                break;
            default:
                preloadMediaSource.checkForPreloadError();
                break;
        }
    }
}

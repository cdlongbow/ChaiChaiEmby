package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSource.Factory b;

    public /* synthetic */ mh0(MediaSource.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        MediaSource.Factory factory = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(factory);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(factory);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(factory);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
        }
    }
}

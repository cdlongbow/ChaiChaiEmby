package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x30 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderersFactory b;

    public /* synthetic */ x30(RenderersFactory renderersFactory, int i) {
        this.a = i;
        this.b = renderersFactory;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        RenderersFactory renderersFactory = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setRenderersFactory$2(renderersFactory);
            case 1:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
            case 2:
                return ExoPlayer.Builder.lambda$new$6(renderersFactory);
            case 3:
                return ExoPlayer.Builder.lambda$new$2(renderersFactory);
            default:
                return ExoPlayer.Builder.lambda$new$8(renderersFactory);
        }
    }
}

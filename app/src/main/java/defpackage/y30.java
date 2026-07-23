package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y30 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BandwidthMeter b;

    public /* synthetic */ y30(BandwidthMeter bandwidthMeter, int i) {
        this.a = i;
        this.b = bandwidthMeter;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        BandwidthMeter bandwidthMeter = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setBandwidthMeter$4(bandwidthMeter);
            case 1:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
            default:
                return ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
        }
    }
}

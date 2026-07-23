package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wf implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ wf(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return AudioManagerCompat.getAudioManager(context);
            case 1:
                return DefaultBandwidthMeter.getSingletonInstance(context);
            case 2:
                return DefaultPreloadManager.Builder.lambda$new$1(context);
            case 3:
                return ExoPlayer.Builder.lambda$new$0(context);
            case 4:
                return ExoPlayer.Builder.lambda$new$1(context);
            case 5:
                return ExoPlayer.Builder.lambda$new$3(context);
            case 6:
                return ExoPlayer.Builder.lambda$new$14(context);
            case 7:
                return DefaultBandwidthMeter.getSingletonInstance(context);
            default:
                return ExoPlayer.Builder.lambda$new$4(context);
        }
    }
}

package defpackage;

import androidx.media3.common.GlObjectsProvider;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10((TrackSelector) obj);
            case 1:
                return ExoPlayer.Builder.lambda$setTrackSelector$18((TrackSelector) obj);
            default:
                return ExperimentalBitmapProcessor.Builder.lambda$setGlObjectsProvider$0((GlObjectsProvider) obj);
        }
    }
}

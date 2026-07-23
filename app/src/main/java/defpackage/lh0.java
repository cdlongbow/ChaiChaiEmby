package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lh0 implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xl0
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21((AnalyticsCollector) obj2, (Clock) obj);
            case 1:
                return ExoPlayer.Builder.lambda$new$13((AnalyticsCollector) obj2, (Clock) obj);
            default:
                return ((FragmentedMp4Extractor) obj2).modifyTrack((Track) obj);
        }
    }
}

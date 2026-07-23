package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v20 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;

    public /* synthetic */ v20(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.a = i2;
        this.b = eventTime;
        this.c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onTimelineChanged(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onDroppedSeeksWhileScrubbing(this.b, this.c);
                break;
            case 3:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.b, this.c);
                break;
            case 4:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 5:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.b, this.c);
                break;
        }
    }
}

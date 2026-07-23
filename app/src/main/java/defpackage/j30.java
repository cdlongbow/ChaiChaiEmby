package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ j30(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioTrackInitialized(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onAudioTrackReleased(this.b, this.c);
                break;
        }
    }
}

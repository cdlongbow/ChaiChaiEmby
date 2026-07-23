package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ PlaybackException c;

    public /* synthetic */ e30(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerErrorChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerError(this.b, this.c);
                break;
        }
    }
}

package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q20 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;

    public /* synthetic */ q20(AnalyticsListener.EventTime eventTime, int i) {
        this.a = i;
        this.b = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        AnalyticsListener.EventTime eventTime = this.b;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (i) {
            case 0:
                analyticsListener.onPlayerReleased(eventTime);
                break;
            case 1:
                analyticsListener.onDrmKeysRemoved(eventTime);
                break;
            case 2:
                analyticsListener.onDrmKeysRestored(eventTime);
                break;
            case 3:
                analyticsListener.onSeekStarted(eventTime);
                break;
            default:
                analyticsListener.onDrmSessionReleased(eventTime);
                break;
        }
    }
}

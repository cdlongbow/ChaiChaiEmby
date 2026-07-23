package defpackage;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l30 implements ListenerSet.Event {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l30(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.b = eventTime;
        this.c = i;
        this.d = positionInfo;
        this.e = positionInfo2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46(this.b, this.c, (Player.PositionInfo) this.d, (Player.PositionInfo) this.e, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onLoadStarted$26(this.b, (LoadEventInfo) this.d, (MediaLoadData) this.e, this.c, (AnalyticsListener) obj);
                break;
        }
    }

    public /* synthetic */ l30(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.b = eventTime;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
        this.c = i;
    }
}

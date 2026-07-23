package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ MediaLoadData c;

    public /* synthetic */ g30(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.b, this.c);
                break;
        }
    }
}

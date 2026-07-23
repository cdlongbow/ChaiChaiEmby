package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ LoadEventInfo c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ h30(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onLoadCanceled(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCompleted(this.b, this.c, this.d);
                break;
        }
    }
}

package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ b30(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.a = 1;
        this.b = eventTime;
        this.c = i;
        this.d = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.b, this.d, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.b, this.d, this.c);
                break;
        }
    }

    public /* synthetic */ b30(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        this.a = i2;
        this.b = eventTime;
        this.d = z;
        this.c = i;
    }
}

package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c30 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ c30(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.b, this.c, this.d, this.e, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(this.b, this.c, this.d, this.e, (AnalyticsListener) obj);
                break;
        }
    }
}

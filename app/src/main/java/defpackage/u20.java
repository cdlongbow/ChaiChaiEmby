package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u20 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ String c;

    public /* synthetic */ u20(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.b, this.c);
                break;
        }
    }
}

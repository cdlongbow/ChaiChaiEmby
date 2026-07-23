package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z20 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ z20(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioCodecError(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onAudioSinkError(this.b, this.c);
                break;
        }
    }
}

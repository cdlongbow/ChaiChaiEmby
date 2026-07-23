package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s20 implements ListenerSet.Event, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ s20(long j, Clock clock) {
        this.a = 4;
        this.c = j;
        this.b = clock;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioPositionAdvancing((AnalyticsListener.EventTime) this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.c, (Clock) this.b, deque);
    }

    public /* synthetic */ s20(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = j;
    }
}

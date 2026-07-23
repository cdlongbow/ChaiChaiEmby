package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d12 implements SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {
    public final /* synthetic */ long a;

    public /* synthetic */ d12(long j) {
        this.a = j;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.a, deque);
    }
}

package defpackage;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p30 implements NetworkTypeObserver.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) throws Throwable {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((DefaultBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
        }
    }
}

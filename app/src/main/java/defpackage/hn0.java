package defpackage;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hn0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                HlsInterstitialsAdsLoader.lambda$stop$4((AdsMediaSource) obj3, (AdPlaybackState) obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((MediaSourceEventListener.EventDispatcher) obj3).lambda$downstreamFormatChanged$5((MediaLoadData) obj2, (MediaSourceEventListener) obj);
                break;
        }
    }
}

package defpackage;

import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gn0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                HlsInterstitialsAdsLoader.lambda$handleContentTimelineChanged$1((AdsMediaSource) obj4, obj3, (Timeline) obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 1:
                ((HlsInterstitialsAdsLoader.Listener) obj).onStart((MediaItem) obj4, obj3, (AdViewProvider) obj2);
                break;
            default:
                ((MediaSourceEventListener.EventDispatcher) obj4).lambda$upstreamDiscarded$4((MediaSource.MediaPeriodId) obj3, (MediaLoadData) obj2, (MediaSourceEventListener) obj);
                break;
        }
    }
}

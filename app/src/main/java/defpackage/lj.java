package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lj {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePreloadManager.MediaSourceHolder b;

    public /* synthetic */ lj(BasePreloadManager.MediaSourceHolder mediaSourceHolder, int i) {
        this.a = i;
        this.b = mediaSourceHolder;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        BasePreloadManager.MediaSourceHolder mediaSourceHolder = this.b;
        PreloadManagerListener preloadManagerListener = (PreloadManagerListener) obj;
        switch (i) {
            case 0:
                BasePreloadManager.lambda$onCompleted$0(mediaSourceHolder, preloadManagerListener);
                break;
            default:
                BasePreloadManager.lambda$onCompleted$2(mediaSourceHolder, preloadManagerListener);
                break;
        }
    }
}

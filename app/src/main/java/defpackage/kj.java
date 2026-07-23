package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.preload.PreloadException;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kj implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadException b;

    public /* synthetic */ kj(PreloadException preloadException, int i) {
        this.a = i;
        this.b = preloadException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        PreloadException preloadException = this.b;
        PreloadManagerListener preloadManagerListener = (PreloadManagerListener) obj;
        switch (i) {
            case 0:
                preloadManagerListener.onError(preloadException);
                break;
            default:
                preloadManagerListener.onError(preloadException);
                break;
        }
    }
}

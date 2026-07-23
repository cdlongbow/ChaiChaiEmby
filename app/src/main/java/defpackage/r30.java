package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r30 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ r30(int i) {
        this.a = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
                break;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }
}

package defpackage;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher b;
    public final /* synthetic */ DrmSessionEventListener c;

    public /* synthetic */ wc0(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrmSessionEventListener drmSessionEventListener = this.c;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$drmKeysRemoved$4(drmSessionEventListener);
                break;
            case 1:
                eventDispatcher.lambda$drmKeysRestored$3(drmSessionEventListener);
                break;
            default:
                eventDispatcher.lambda$drmSessionReleased$5(drmSessionEventListener);
                break;
        }
    }
}

package defpackage;

import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$audioSessionIdChanged$12(i2);
                break;
            default:
                ((ResourcesCompat.FontCallback) obj).lambda$callbackFailAsync$1(i2);
                break;
        }
    }
}

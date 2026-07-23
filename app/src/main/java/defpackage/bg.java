package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bg(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$positionAdvancing$3(j);
                break;
            default:
                ((PreloadMediaSource) obj).lambda$preload$0(j);
                break;
        }
    }
}

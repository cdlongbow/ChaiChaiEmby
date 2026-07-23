package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gg(Object obj, String str, long j, long j2, int i) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.b, this.c, this.d);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.b, this.c, this.d);
                break;
        }
    }
}

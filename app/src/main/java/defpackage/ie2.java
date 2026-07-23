package defpackage;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ie2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ ie2(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DecoderCounters decoderCounters = this.c;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$enabled$0(decoderCounters);
                break;
            default:
                eventDispatcher.lambda$disabled$8(decoderCounters);
                break;
        }
    }
}

package defpackage;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ zf(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DecoderCounters decoderCounters = this.c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$enabled$0(decoderCounters);
                break;
            default:
                eventDispatcher.lambda$disabled$6(decoderCounters);
                break;
        }
    }
}

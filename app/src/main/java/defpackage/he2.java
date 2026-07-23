package defpackage;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class he2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ he2(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.b = eventDispatcher;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$droppedFrames$3(i2, j);
                break;
            default:
                eventDispatcher.lambda$reportVideoFrameProcessingOffset$4(j, i2);
                break;
        }
    }

    public /* synthetic */ he2(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.b = eventDispatcher;
        this.c = j;
        this.d = i;
    }
}

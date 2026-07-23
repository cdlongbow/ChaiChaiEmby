package defpackage;

import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoSink.Listener b;

    public /* synthetic */ fe1(VideoSink.Listener listener, int i) {
        this.a = i;
        this.b = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoSink.Listener listener = this.b;
        switch (i) {
            case 0:
                listener.onFrameDropped();
                break;
            case 1:
                listener.onFirstFrameRendered();
                break;
            default:
                listener.onFrameAvailableForRendering();
                break;
        }
    }
}

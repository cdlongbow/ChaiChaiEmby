package defpackage;

import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x10(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((DebugViewShaderProgram) obj2).lambda$queueInputFrame$2((Exception) obj, j);
                break;
            case 1:
                ((SeparableConvolutionShaderProgram) obj2).lambda$queueInputFrame$1((GlUtil.GlException) obj, j);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$renderedFirstFrame$6(obj, j);
                break;
        }
    }
}

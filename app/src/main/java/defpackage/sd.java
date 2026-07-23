package defpackage;

import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.NoSampleRenderer;

/* JADX INFO: loaded from: classes3.dex */
public final class sd extends NoSampleRenderer {
    public final md a;

    public sd(md mdVar) {
        this.a = mdVar;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "AssRenderer";
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) {
        this.a.d(j - MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
    }
}

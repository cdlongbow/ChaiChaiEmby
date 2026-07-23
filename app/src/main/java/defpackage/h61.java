package defpackage;

import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.OnInputFrameProcessedListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h61 implements OnInputFrameProcessedListener, GlTextureProducer.Listener {
    public final /* synthetic */ MultipleInputVideoGraph a;

    public /* synthetic */ h61(MultipleInputVideoGraph multipleInputVideoGraph) {
        this.a = multipleInputVideoGraph;
    }

    @Override // androidx.media3.effect.GlTextureProducer.Listener
    public /* synthetic */ void flush() {
    }

    @Override // androidx.media3.common.OnInputFrameProcessedListener
    public void onInputFrameProcessed(int i, long j) {
        this.a.onCompositionVideoFrameProcessorInputFrameProcessed(i, j);
    }

    @Override // androidx.media3.effect.GlTextureProducer.Listener
    public void onTextureRendered(GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) {
        this.a.processCompositorOutputTexture(glTextureProducer, glTextureInfo, j, j2);
    }
}

package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class td implements RenderersFactory {
    public final md a;
    public final RenderersFactory b;

    public td(md mdVar, DefaultRenderersFactory defaultRenderersFactory) {
        defaultRenderersFactory.getClass();
        this.a = mdVar;
        this.b = defaultRenderersFactory;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public final Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        handler.getClass();
        videoRendererEventListener.getClass();
        audioRendererEventListener.getClass();
        textOutput.getClass();
        metadataOutput.getClass();
        Renderer[] rendererArrCreateRenderers = this.b.createRenderers(handler, videoRendererEventListener, audioRendererEventListener, textOutput, metadataOutput);
        rendererArrCreateRenderers.getClass();
        return (Renderer[]) CollectionsKt.plus((Collection<? extends sd>) ArraysKt.toMutableList(rendererArrCreateRenderers), new sd(this.a)).toArray(new Renderer[0]);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public final Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        renderer.getClass();
        handler.getClass();
        videoRendererEventListener.getClass();
        audioRendererEventListener.getClass();
        textOutput.getClass();
        metadataOutput.getClass();
        return this.b.createSecondaryRenderer(renderer, handler, videoRendererEventListener, audioRendererEventListener, textOutput, metadataOutput);
    }
}

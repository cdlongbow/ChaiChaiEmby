package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class uf extends DefaultRenderersFactory {
    public final int a;
    public final int b;
    public final g6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(Context context, int i, int i2, g6 g6Var) {
        super(context);
        context.getClass();
        this.a = i;
        this.b = i2;
        this.c = g6Var;
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public final void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList arrayList) {
        context.getClass();
        mediaCodecSelector.getClass();
        audioSink.getClass();
        handler.getClass();
        audioRendererEventListener.getClass();
        arrayList.getClass();
        super.buildAudioRenderers(context, this.a, mediaCodecSelector, z, audioSink, handler, audioRendererEventListener, arrayList);
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public final AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        context.getClass();
        int iNormalizeAudioDelayMs = UserPreferences.INSTANCE.normalizeAudioDelayMs(this.b);
        return iNormalizeAudioDelayMs == 0 ? super.buildAudioSink(context, z, z2) : new DefaultAudioSink.Builder().setAudioOffloadSupportProvider(new ra(10)).setEnableFloatOutput(z).setEnableAudioOutputPlaybackParameters(z2).setAudioProcessors(new tf[]{new tf(iNormalizeAudioDelayMs, this.c)}).build();
    }
}

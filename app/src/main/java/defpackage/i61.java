package defpackage;

import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.ui.TrackSelectionDialogBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i61 implements GlTextureProducer.Listener, ListenerSet.Event, TrackSelectionDialogBuilder.DialogCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i61(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // androidx.media3.effect.GlTextureProducer.Listener
    public /* synthetic */ void flush() {
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                ((Player.Listener) obj).onMediaItemTransition((MediaItem) obj2, i2);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$34((SimpleBasePlayer.State) obj2, i2, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.effect.GlTextureProducer.Listener
    public void onTextureRendered(GlTextureProducer glTextureProducer, GlTextureInfo glTextureInfo, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
        ((MultipleInputVideoGraph) this.c).lambda$registerInput$0(this.b, glTextureProducer, glTextureInfo, j, j2);
    }

    @Override // androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback
    public void onTracksSelected(boolean z, Map map) {
        TrackSelectionDialogBuilder.lambda$new$0((Player) this.c, this.b, z, map);
    }
}

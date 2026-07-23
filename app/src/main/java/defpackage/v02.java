package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v02 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v02(SimpleBasePlayer simpleBasePlayer, SimpleBasePlayer.State state) {
        this.a = 5;
        this.c = simpleBasePlayer;
        this.b = state;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        SimpleBasePlayer.State state = this.b;
        switch (i) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoTextureView$22(state, (Size) obj);
            case 1:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15(state, (MediaMetadata) obj);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$20(state, (SurfaceHolder) obj);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$21(state, (SurfaceView) obj);
            case 4:
                return SimpleBasePlayer.lambda$setAudioAttributes$32(state, (AudioAttributes) obj);
            case 5:
                return ((SimpleBasePlayer) obj).lambda$stop$12(state);
            case 6:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11(state, (PlaybackParameters) obj);
            default:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14(state, (TrackSelectionParameters) obj);
        }
    }

    public /* synthetic */ v02(SimpleBasePlayer.State state, Object obj, int i) {
        this.a = i;
        this.b = state;
        this.c = obj;
    }
}

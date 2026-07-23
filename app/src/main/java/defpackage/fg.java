package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fg(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj3).lambda$inputFormatChanged$2((Format) obj2, (DecoderReuseEvaluation) obj);
                break;
            case 1:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$1((AudioTrack) obj3, (Handler) obj2, (ListenerSet) obj);
                break;
            case 2:
                ((BasePreloadManager) obj3).lambda$onMediaSourceUpdated$9((MediaItem) obj2, (MediaSource) obj);
                break;
            case 3:
                ((BasePreloadManager) obj3).lambda$onCompleted$3((MediaItem) obj2, (lp1) obj);
                break;
            case 4:
                ((DrmSessionEventListener.EventDispatcher) obj3).lambda$drmSessionManagerError$2((DrmSessionEventListener) obj2, (Exception) obj);
                break;
            case 5:
                ((DrmSessionEventListener.EventDispatcher) obj3).lambda$drmKeysLoaded$1((DrmSessionEventListener) obj2, (KeyRequestInfo) obj);
                break;
            case 6:
                ((ServerSideAdInsertionMediaSource) obj3).lambda$setAdPlaybackStates$0((ft0) obj2, (Timeline) obj);
                break;
            case 7:
                Util.lambda$transformFutureAsync$2((f01) obj3, (fz1) obj2, (ze) obj);
                break;
            case 8:
                Util.lambda$postOrRunWithCompletion$0((fz1) obj3, (Runnable) obj2, obj);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) obj3).lambda$inputFormatChanged$2((Format) obj2, (DecoderReuseEvaluation) obj);
                break;
        }
    }
}

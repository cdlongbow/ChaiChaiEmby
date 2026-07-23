package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.SubtitleView;
import androidx.window.area.RearDisplaySessionImpl;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tp1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((PreloadMediaSource) obj2).lambda$onChildSourceInfoRefreshed$2((Timeline) obj);
                break;
            case 1:
                ((ResourcesCompat.FontCallback) obj2).lambda$callbackSuccessAsync$0((Typeface) obj);
                break;
            case 2:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.accept$lambda$0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj2, (WindowLayoutInfo) obj);
                break;
            case 3:
                ((SimpleBasePlayer) obj2).lambda$updateStateForPendingOperation$64((f01) obj);
                break;
            case 4:
                ((SphericalGLSurfaceView) obj2).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) obj);
                break;
            case 5:
                ((SubtitleView) obj2).setCues((List) obj);
                break;
            case 6:
                Util.lambda$transformFutureAsync$1((fz1) obj2, (f01) obj);
                break;
            case 7:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$decoderReleased$7((String) obj);
                break;
            case 8:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoSizeChanged$5((VideoSize) obj);
                break;
            case 9:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoCodecError$9((Exception) obj);
                break;
            case 10:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$videoCodecParametersChanged$10((CodecParameters) obj);
                break;
            case 11:
                ((WakeLockManager) obj2).lambda$postUpdateWakeLock$1((AtomicBoolean) obj);
                break;
            case 12:
                ((WifiLockManager) obj2).lambda$postUpdateWifiLock$1((AtomicBoolean) obj);
                break;
            default:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionStarted$lambda$1$lambda$0((WindowAreaControllerImpl.RearDisplaySessionConsumer) obj2, (RearDisplaySessionImpl) obj);
                break;
        }
    }
}

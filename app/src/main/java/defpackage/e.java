package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.FullyDrawnReporter;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AbstractComposeView) obj).attachedToWindow();
                break;
            case 1:
                ActivityCompat.lambda$recreate$0((Activity) obj);
                break;
            case 2:
                ((AdsMediaSource) obj).maybeUpdateSourceInfo();
                break;
            case 3:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) obj);
                break;
            case 4:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) obj);
                break;
            case 5:
                ((vd) obj).invalidate();
                break;
            case 6:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0((ListenerSet) obj);
                break;
            case 7:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            case 8:
                DanmakuPlayer.m8809start$lambda1((DanmakuPlayer) obj);
                break;
            case 9:
                ((DefaultAnalyticsCollector) obj).releaseInternal();
                break;
            case 10:
                ((DefaultAudioSink) obj).maybeReportSkippedSilence();
                break;
            case 11:
                ((DefaultPreloadManager) obj).lambda$releasePreloadUtils$2();
                break;
            case 12:
                ((DefaultTimeBar) obj).lambda$new$0();
                break;
            case 13:
                ((VideoFrameProcessor.Listener) obj).onEnded();
                break;
            case 14:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) obj);
                break;
            case 15:
                FullyDrawnReporter.reportRunnable$lambda$0((FullyDrawnReporter) obj);
                break;
            case 16:
                ((GlTextureFrame) obj).lambda$release$0();
                break;
            case 17:
                ((HlsSampleStreamWrapper.Callback) obj).onPrepared();
                break;
            case 18:
                View view = (View) obj;
                View rootView = view.getRootView();
                if (rootView != null) {
                    rootView.requestLayout();
                    rootView.invalidate();
                }
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.requestLayout();
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 19:
                wd2.b((ByteArrayInputStream) obj);
                break;
            case 20:
                ((f21) obj).d();
                break;
            case 21:
                ((MetadataRetrieverInternal) obj).lambda$close$0();
                break;
            case 22:
                ((MultipleInputVideoGraph) obj).lambda$release$1();
                break;
            case 23:
                ((PlaybackVideoGraphWrapper) obj).lambda$flush$1();
                break;
            case 24:
                ((PlayerControlView) obj).updateProgress();
                break;
            case 25:
                ((PlayerView) obj).invalidate();
                break;
            case 26:
                ((PreCacheHelper) obj).lambda$stop$1();
                break;
            case 27:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) obj);
                break;
            case 28:
                RippleHostView.setRippleState$lambda$1((RippleHostView) obj);
                break;
            default:
                ((SphericalGLSurfaceView) obj).lambda$onDetachedFromWindow$0();
                break;
        }
    }
}

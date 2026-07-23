package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.Consumer;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.ui.PlayerView;
import com.dh.myembyapp.MyEmbyApp;
import com.google.gson.Gson;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraParametersCallback;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        l1 l1Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AdsMediaSource) obj2).lambda$onChildSourceInfoRefreshed$2((Timeline) obj);
                return;
            case 1:
                ((b3) obj2).q((ts0) obj);
                return;
            case 2:
                AudioManagerCompat.lambda$getAudioManager$0((Context) obj2, (ConditionVariable) obj);
                return;
            case 3:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$audioCodecParametersChanged$13((CodecParameters) obj);
                return;
            case 4:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$decoderReleased$5((String) obj);
                return;
            case 5:
                ((BackgroundThreadStateHandler) obj2).lambda$updateStateAsync$1((xl0) obj);
                return;
            case 6:
                ((CameraInstance) obj2).lambda$changeCameraParameters$1((CameraParametersCallback) obj);
                return;
            case 7:
                ((ComponentActivity) obj2).addObserverForBackInvoker((OnBackPressedDispatcher) obj);
                return;
            case 8:
                ((DispatchQueue) obj2).enqueue((Runnable) obj);
                return;
            case 9:
                ((DownloadHelper) obj2).lambda$onMediaPreparationFailed$3((IOException) obj);
                return;
            case 10:
                ((DownloadHelper) obj2).lambda$prepare$1((DownloadHelper.Callback) obj);
                return;
            case 11:
                ExtensionEmbeddingBackend.SplitListenerWrapper.accept$lambda$1((ExtensionEmbeddingBackend.SplitListenerWrapper) obj2, (ArrayList) obj);
                return;
            case 12:
                FragmentStrictMode.m8070handlePolicyViolation$lambda0((FragmentStrictMode.Policy) obj2, (Violation) obj);
                return;
            case 13:
                FragmentStrictMode.m8071handlePolicyViolation$lambda1((String) obj2, (Violation) obj);
                return;
            case 14:
                HandlerContext.scheduleResumeAfterDelay$lambda$1((CancellableContinuation) obj2, (HandlerContext) obj);
                return;
            case 15:
                ((Consumer) obj2).accept((Location) obj);
                return;
            case 16:
                ((MediaCodecRenderer) obj2).lambda$feedInputBuffer$0((FormatHolder) obj);
                return;
            case 17:
                ((MediaMetricsListener) obj2).lambda$reportTrackChangeEvent$3((TrackChangeEvent) obj);
                return;
            case 18:
                ((MediaMetricsListener) obj2).lambda$maybeReportNetworkChange$1((NetworkEvent) obj);
                return;
            case 19:
                ((MediaMetricsListener) obj2).lambda$maybeReportPlaybackError$0((PlaybackErrorEvent) obj);
                return;
            case 20:
                ((MediaMetricsListener) obj2).lambda$finishCurrentSession$4((PlaybackMetrics) obj);
                return;
            case 21:
                ((MediaMetricsListener) obj2).lambda$maybeReportPlaybackStateChange$2((PlaybackStateEvent) obj);
                return;
            case 22:
                ((androidx.media3.common.util.Consumer) obj2).accept((MediaSourceEventListener) obj);
                return;
            case 23:
                ((MultipleInputVideoGraph) obj2).lambda$handleVideoFrameProcessingException$2((Exception) obj);
                return;
            case 24:
                int i2 = MyEmbyApp.j;
                Toast.makeText((MyEmbyApp) obj2, "应用发生错误: " + ((Throwable) obj).getMessage(), 1).show();
                return;
            case 25:
                MyEmbyApp myEmbyApp = (MyEmbyApp) obj2;
                Function0 function0 = (Function0) obj;
                int i3 = MyEmbyApp.j;
                int i4 = 4;
                try {
                    try {
                        ((os1) myEmbyApp.h.getValue()).a();
                        Log.d("MyEmbyApp", "✓ 内存缓存已清除");
                        ((gs1) ((cb0) myEmbyApp.g.getValue())).a();
                        Log.d("MyEmbyApp", "✓ Coil 磁盘缓存已清除");
                        File file = new File(myEmbyApp.getCacheDir(), "http_image_cache");
                        if (file.exists()) {
                            FilesKt.deleteRecursively(file);
                            Log.d("MyEmbyApp", "✓ HTTP 缓存已清除");
                        }
                        SharedPreferences sharedPreferences = myEmbyApp.getApplicationContext().getSharedPreferences("home_snapshot_cache", 0);
                        new Gson();
                        try {
                            if (sharedPreferences.edit().clear().commit()) {
                                Log.d("HomeSnapshotCache", "首页快照缓存已清除");
                            } else {
                                Log.w("HomeSnapshotCache", "首页快照缓存清除未确认写入");
                            }
                        } catch (Exception e) {
                            Log.w("HomeSnapshotCache", "清除首页快照缓存失败", e);
                        }
                        myEmbyApp.c("updates", "更新包缓存");
                        myEmbyApp.c("online_subtitles", "在线字幕缓存");
                        myEmbyApp.c("transcode_subtitles", "转码字幕缓存");
                        myEmbyApp.e();
                        myEmbyApp.d();
                        Log.d("MyEmbyApp", "========== 应用缓存已完全清除 ==========");
                        handler = new Handler(Looper.getMainLooper());
                        l1Var = new l1(i4, function0);
                        break;
                    } catch (Exception e2) {
                        Log.e("MyEmbyApp", "清除缓存失败", e2);
                        handler = new Handler(Looper.getMainLooper());
                        l1Var = new l1(i4, function0);
                    }
                    handler.post(l1Var);
                    return;
                } catch (Throwable th) {
                    new Handler(Looper.getMainLooper()).post(new l1(i4, function0));
                    throw th;
                }
            case 26:
                ((NetworkTypeObserver) obj2).lambda$new$0((Context) obj);
                return;
            case 27:
                ((OfflineLicenseHelper) obj2).lambda$releaseManagerOnHandlerThread$4((fz1) obj);
                return;
            case 28:
                ((PassthroughShaderProgram) obj2).lambda$onError$1((Exception) obj);
                return;
            default:
                ((PlayerView) obj2).lambda$onImageAvailable$1((Bitmap) obj);
                return;
        }
    }
}

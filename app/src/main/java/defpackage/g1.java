package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.State;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.datasource.ByteArrayDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.ProgressiveDownloader;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.RankingDataComparator;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.ts.SeiReader;

import com.dh.myembyapp.data.ProxyConfig;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Credentials;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        o01 o01Var = (o01) this.b;
        response.getClass();
        ProxyConfig proxyConfig = (ProxyConfig) o01Var.invoke();
        if (!proxyConfig.getHasCredentials()) {
            return null;
        }
        String username = proxyConfig.getUsername();
        String password = proxyConfig.getPassword();
        if (response.request().header(HttpRequestHeader.ProxyAuthorization) != null) {
            Log.w("MyEmbyApp", "代理认证已重试过一次，停止继续发送相同凭据");
            return null;
        }
        return response.request().newBuilder().header(HttpRequestHeader.ProxyAuthorization, Credentials.basic$default(username, password, null, 4, null)).build();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                return ConstructorConstructor.lambda$newDefaultConstructor$2((Constructor) obj);
            default:
                return ConstructorConstructor.lambda$newUnsafeAllocator$4((Class) obj);
        }
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                ((FragmentedMp4Extractor) obj).lambda$new$2(j, parsableByteArray);
                break;
            default:
                ((SeiReader) obj).lambda$new$0(j, parsableByteArray);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$5((DefaultTrackSelector.Parameters) this.b, i, trackGroup, iArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.b).lambda$createTrackSelections$0(definition);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return ProgressiveMediaSource.Factory.lambda$new$0((ExtractorsFactory) this.b, playerId);
    }

    @Override // defpackage.o31
    public Object d(Object obj, Object obj2) {
        return ku.S((List) ((Collection) obj2), new k31(((g61) this.b).g, obj));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager get(MediaItem mediaItem) {
        return DownloadHelper.lambda$createMediaSourceInternal$4((DrmSessionManager) this.b, mediaItem);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        return SavedStateHandleSaverKt.saveable$lambda$1$0(this.b, obj, kProperty);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.b).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$4$0$0((State) this.b, obj);
    }

    @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        ((AudioTrackAudioOutputProvider) this.b).onAudioCapabilitiesChanged(audioCapabilities);
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.b, inputContentInfoCompat, i, bundle);
    }

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        ((VideoFrameProcessor.Listener) this.b).onError(videoFrameProcessingException);
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.b).onProgress(j, j2, j3);
    }

    @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener
    public void onRankingDataComparatorInvalidated() {
        ((BasePreloadManager) this.b).invalidate();
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.b).onRequirementsStateChanged(requirementsWatcher, i);
    }

    @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
    public void onSharedElementsReady() {
        ((android.app.SharedElementCallback.OnSharedElementsReadyListener) this.b).onSharedElementsReady();
    }

    @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
    public byte[] resolve(Uri uri) {
        return ByteArrayDataSource.lambda$new$0((byte[]) this.b, uri);
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return _UtilJvmKt.asFactory$lambda$0((EventListener) this.b, call);
    }
}

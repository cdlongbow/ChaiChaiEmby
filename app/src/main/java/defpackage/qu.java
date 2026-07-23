package defpackage;

import android.content.Context;
import android.view.ContentInfo;
import android.view.SurfaceView;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Metadata;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import java.lang.reflect.Constructor;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletionException;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qu implements HttpLoggingInterceptor.Logger, DebugViewProvider, GlShaderProgram.ErrorListener, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, DefaultGainProvider.FadeProvider, HlsPlaylistTracker.Factory, TrackSelector.InvalidationListener, TrackSelector.Factory, TextOutput, MetadataOutput {
    public final /* synthetic */ int a;

    public /* synthetic */ qu(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ContentInfo b(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Path d(Object obj) {
        return (Path) obj;
    }

    public static /* bridge */ /* synthetic */ CompletionException e(Object obj) {
        return (CompletionException) obj;
    }

    public static /* synthetic */ void f() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void g(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* bridge */ /* synthetic */ boolean h(Object obj) {
        return obj instanceof CompletionException;
    }

    private final /* synthetic */ void l(Renderer renderer) {
    }

    private final /* synthetic */ void m(Renderer renderer) {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public TrackSelector createTrackSelector(Context context) {
        return new DefaultTrackSelector(context);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
    public HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, j52 j52Var) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration, j52Var);
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        switch (this.a) {
            case 9:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        return null;
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        switch (this.a) {
            case 11:
                return DefaultGainProvider.lambda$static$0(j, j2);
            case 12:
                return DefaultGainProvider.lambda$static$1(j, j2);
            case 13:
                return DefaultGainProvider.lambda$static$2(j, j2);
            default:
                return DefaultGainProvider.lambda$static$3(j, j2);
        }
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void log(String str) {
        DanmakuApiClient.createServiceForUrl$lambda$0$1(str);
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public void onCues(CueGroup cueGroup) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
    }

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Log.e(DebugViewShaderProgram.TAG, "Exception caught by errorListener.", videoFrameProcessingException);
    }

    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public void onMetadata(Metadata metadata) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
        int i = this.a;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        switch (this.a) {
            case 18:
                DefaultPreloadManager.lambda$new$0();
                break;
            default:
                DownloadHelper.lambda$new$0();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public /* synthetic */ void onCues(List list) {
    }
}

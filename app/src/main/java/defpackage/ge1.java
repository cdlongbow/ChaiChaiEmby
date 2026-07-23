package defpackage;

import android.util.Log;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ge1 implements AnalyticsListener {
    public final /* synthetic */ vh1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vb1 c;
    public final /* synthetic */ bl1 d;

    public ge1(vh1 vh1Var, String str, vb1 vb1Var, bl1 bl1Var) {
        this.a = vh1Var;
        this.b = str;
        this.c = vb1Var;
        this.d = bl1Var;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        eventTime.getClass();
        str.getClass();
        Log.d("PlayerScreen", "========== 音频解码器初始化 ==========");
        Log.d("PlayerScreen", "🎵 解码器名称: ".concat(str));
        Log.d("PlayerScreen", "初始化耗时: " + j2 + "ms");
        if (StringsKt__StringsKt.contains(str, (CharSequence) "ffmpeg", true)) {
            Log.d("PlayerScreen", "✅ 正在使用 FFmpeg 扩展解码器");
        } else {
            Log.d("PlayerScreen", "ℹ️ 使用系统解码器: ".concat(str));
        }
        Log.d("PlayerScreen", "=====================================");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        eventTime.getClass();
        decoderCounters.getClass();
        Log.d("PlayerScreen", "🔊 音频渲染器已启用");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        eventTime.getClass();
        format.getClass();
        Log.d("PlayerScreen", "========== 音频解码器信息 ==========");
        ll0.l("音频格式: ", format.sampleMimeType, "PlayerScreen");
        ll0.l("编解码器: ", format.codecs, "PlayerScreen");
        Log.d("PlayerScreen", "声道数: " + format.channelCount);
        Log.d("PlayerScreen", "采样率: " + format.sampleRate + " Hz");
        Log.d("PlayerScreen", "解码器重用: " + (decoderReuseEvaluation != null ? Integer.valueOf(decoderReuseEvaluation.result) : null));
        Log.d("PlayerScreen", "=====================================");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDroppedSeeksWhileScrubbing(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        eventTime.getClass();
        loadEventInfo.getClass();
        mediaLoadData.getClass();
        if (mediaLoadData.dataType != 1) {
            return;
        }
        this.d.invoke();
        String strH = hg2.h(loadEventInfo.uri);
        int i = mediaLoadData.trackType;
        long j = loadEventInfo.bytesLoaded;
        long j2 = loadEventInfo.loadDurationMs;
        StringBuilder sb = new StringBuilder("🟨 loadCanceled trackType=");
        sb.append(i);
        sb.append(" bytes=");
        sb.append(j);
        id.m(sb, " cost=", j2, "ms uri=");
        sb.append(strH);
        Log.w("PlayerNet", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        eventTime.getClass();
        loadEventInfo.getClass();
        mediaLoadData.getClass();
        if (mediaLoadData.dataType != 1) {
            return;
        }
        this.d.invoke();
        int i = mediaLoadData.trackType;
        long j = loadEventInfo.bytesLoaded;
        long j2 = loadEventInfo.loadDurationMs;
        String strH = hg2.h(loadEventInfo.uri);
        StringBuilder sb = new StringBuilder("✅ loadDone trackType=");
        sb.append(i);
        sb.append(" bytes=");
        sb.append(j);
        id.m(sb, " cost=", j2, "ms uri=");
        sb.append(strH);
        Log.d("PlayerNet", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        eventTime.getClass();
        loadEventInfo.getClass();
        mediaLoadData.getClass();
        iOException.getClass();
        if (mediaLoadData.dataType != 1) {
            return;
        }
        this.d.invoke();
        String strH = hg2.h(loadEventInfo.uri);
        Log.w("PlayerNet", "⚠️ loadError canceled=" + z + " trackType=" + mediaLoadData.trackType + " cost=" + loadEventInfo.loadDurationMs + "ms uri=" + strH + " type=" + iOException.getClass().getSimpleName() + " msg=" + iOException.getMessage());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        eventTime.getClass();
        loadEventInfo.getClass();
        mediaLoadData.getClass();
        if (mediaLoadData.dataType != 1) {
            return;
        }
        this.d.invoke();
        String strH = hg2.h(loadEventInfo.uri);
        Log.d("PlayerNet", "⬇️ loadStart trackType=" + mediaLoadData.trackType + " uri=" + strH + " buffered=" + eventTime.totalBufferedDurationMs + "ms pos=" + eventTime.currentPlaybackPositionMs + "ms");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        eventTime.getClass();
        obj.getClass();
        this.c.invoke();
        Log.d("PlayerScreen", "✓ 首帧渲染成功 (解码模式: " + this.b + ")");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        eventTime.getClass();
        format.getClass();
        Float fD = tl0.D(format.frameRate);
        if (fD != null) {
            this.a.invoke(fD);
        }
        Log.d("PlayerScreen", "========================================");
        ll0.l("解码模式配置: ", this.b, "PlayerScreen");
        ll0.l("视频编解码器: ", format.codecs, "PlayerScreen");
        ll0.l("容器格式: ", format.containerMimeType, "PlayerScreen");
        Log.d("PlayerScreen", "视频帧率: " + (fD != null ? String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(fD.floatValue())}, 1)) : Float.valueOf(format.frameRate)));
        Log.d("PlayerScreen", "========================================");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
    }
}

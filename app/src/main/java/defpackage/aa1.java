package defpackage;

import android.os.Handler;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class aa1 implements Player.Listener {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref.BooleanRef c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ Handler e;
    public final /* synthetic */ Ref.ObjectRef g;
    public final /* synthetic */ Ref.ObjectRef h;
    public final /* synthetic */ Ref.BooleanRef i;

    public aa1(ExoPlayer exoPlayer, String str, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Handler handler, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Ref.BooleanRef booleanRef2) {
        this.a = exoPlayer;
        this.b = str;
        this.c = booleanRef;
        this.d = objectRef;
        this.e = handler;
        this.g = objectRef2;
        this.h = objectRef3;
        this.i = booleanRef2;
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(CueGroup cueGroup) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Runnable, z91] */
    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i != 3) {
            return;
        }
        ExoPlayer exoPlayer = this.a;
        Tracks currentTracks = exoPlayer.getCurrentTracks();
        currentTracks.getClass();
        String str = this.b;
        boolean zA = e52.a(exoPlayer, currentTracks, str);
        Ref.ObjectRef objectRef = this.h;
        Ref.ObjectRef objectRef2 = this.g;
        Handler handler = this.e;
        Ref.ObjectRef objectRef3 = this.d;
        Ref.BooleanRef booleanRef = this.c;
        if (zA) {
            ba1.a(booleanRef, objectRef3, handler, objectRef2, exoPlayer, objectRef);
            return;
        }
        Ref.BooleanRef booleanRef2 = this.i;
        if (booleanRef2.element) {
            return;
        }
        booleanRef2.element = true;
        Object z91Var = new z91(booleanRef, exoPlayer, str, objectRef3, handler, objectRef2, objectRef);
        objectRef3.element = z91Var;
        handler.postDelayed(z91Var, 600L);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        playbackException.getClass();
        ba1.a(this.c, this.d, this.e, this.g, this.a, this.h);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        tracks.getClass();
        String str = this.b;
        ExoPlayer exoPlayer = this.a;
        if (e52.a(exoPlayer, tracks, str)) {
            ba1.a(this.c, this.d, this.e, this.g, exoPlayer, this.h);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }
}

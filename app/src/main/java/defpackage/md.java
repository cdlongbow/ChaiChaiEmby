package defpackage;

import android.util.Log;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Size;
import io.github.peerless2012.ass.Ass;
import io.github.peerless2012.ass.AssRender;
import io.github.peerless2012.ass.AssTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class md implements Player.Listener {
    public final Lazy a;
    public AssRender b;
    public ud c;
    public AssTrack d;
    public final LinkedHashMap e;
    public final ArrayList g;
    public Size h;
    public Size i;
    public final int j;
    public int k;
    public long l;
    public c m;
    public Format n;

    public md() {
        rd[] rdVarArr = rd.a;
        this.a = LazyKt.lazy(new b1(16));
        this.e = new LinkedHashMap();
        this.g = new ArrayList();
        Size size = Size.ZERO;
        size.getClass();
        this.h = size;
        this.i = size;
        this.j = 3;
        this.l = -1L;
    }

    public static boolean b(Size size) {
        return size.getWidth() > 0 && size.getHeight() > 0;
    }

    public final void a() {
        if (this.b != null) {
            return;
        }
        Log.i("AssHandler", "createRender");
        AssRender assRenderCreateRender = ((Ass) this.a.getValue()).createRender();
        if (b(this.h)) {
            assRenderCreateRender.setStorageSize(this.h.getWidth(), this.h.getHeight());
        }
        if (b(this.h)) {
            Size size = new Size(this.h.getWidth(), this.h.getHeight());
            assRenderCreateRender.setFrameSize(size.getWidth(), size.getHeight());
        }
        rd[] rdVarArr = rd.a;
        if (b(this.i)) {
            Size size2 = new Size(this.i.getWidth(), this.i.getHeight());
            assRenderCreateRender.setFrameSize(size2.getWidth(), size2.getHeight());
        }
        Log.i("AssHandler", "Ass cacheSize: 128MB");
        Log.i("AssHandler", "Ass glyphSize: 10000");
        assRenderCreateRender.setCacheLimit(10000, 128);
        this.b = assRenderCreateRender;
        ud udVar = this.c;
        if (udVar != null) {
            udVar.invoke(assRenderCreateRender);
        }
    }

    public final void c(int i, int i2) {
        Log.i("AssHandler", "setVideoSize: width = " + i + ", height = " + i2);
        this.h = new Size(i, i2);
    }

    public final void d(long j) {
        c cVar;
        if (this.l == j) {
            return;
        }
        this.l = j;
        if (this.k == 0 && (cVar = this.m) != null) {
            cVar.invoke(Long.valueOf(j));
        }
        int i = this.k + 1;
        this.k = i;
        int i2 = this.j;
        if (i >= i2) {
            this.k = i % i2;
        }
    }

    public final void e() {
        AssTrack assTrack;
        String str;
        Iterator it = this.e.entrySet().iterator();
        do {
            assTrack = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Format format = this.n;
            if (Intrinsics.areEqual((format == null || (str = format.id) == null) ? null : StringsKt__StringsKt.substringAfter$default(str, ":", (String) null, 2, (Object) null), entry.getKey())) {
                assTrack = (AssTrack) entry.getValue();
            }
        } while (assTrack == null);
        if (assTrack == null || Intrinsics.areEqual(this.d, assTrack)) {
            return;
        }
        Log.i("AssHandler", "subtitle track changed to " + this.n);
        this.d = assTrack;
        AssRender assRender = this.b;
        if (assRender == null) {
            ra.q("Required value was null.");
            return;
        }
        assRender.setStorageSize(this.h.getWidth(), this.h.getHeight());
        rd[] rdVarArr = rd.a;
        Size size = new Size(this.i.getWidth(), this.i.getHeight());
        assRender.setFrameSize(size.getWidth(), size.getHeight());
        assRender.setTrack(assTrack);
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
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
        Log.i("AssHandler", "onMediaItemTransition: item = " + mediaItem + ", reason = " + i);
        this.b = null;
        this.d = null;
        this.e.clear();
        this.g.clear();
        Size size = Size.ZERO;
        size.getClass();
        this.h = size;
        d(-1L);
        this.k = 0;
        ud udVar = this.c;
        if (udVar != null) {
            udVar.invoke(null);
        }
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

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
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
    public final void onSurfaceSizeChanged(int i, int i2) {
        Log.i("AssHandler", "onSurfaceSizeChanged: width = " + i + ", height = " + i2);
        if (this.i.getWidth() == i && this.i.getHeight() == i2) {
            return;
        }
        Size size = new Size(i, i2);
        this.i = size;
        rd[] rdVarArr = rd.a;
        if (b(size)) {
            Size size2 = new Size(i, i2);
            if (size2.getWidth() != i || size2.getHeight() != i2) {
                int width = size2.getWidth();
                int height = size2.getHeight();
                StringBuilder sbO = c61.o("Downscaling render: ", i, i2, "x", " -> ");
                sbO.append(width);
                sbO.append("x");
                sbO.append(height);
                sbO.append(" (maxPixels=0)");
                Log.i("AssHandler", sbO.toString());
            }
            AssRender assRender = this.b;
            if (assRender != null) {
                assRender.setFrameSize(size2.getWidth(), size2.getHeight());
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Object obj;
        Object obj2;
        tracks.getClass();
        Log.i("AssHandler", "onTracksChanged " + tracks);
        at0 groups = tracks.getGroups();
        groups.getClass();
        int size = groups.size();
        int i = 0;
        loop0: while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = groups.get(i);
            i++;
            Tracks.Group group = (Tracks.Group) obj;
            if (group.isSelected()) {
                Iterable iterableUntil = RangesKt.until(0, group.length);
                if (!(iterableUntil instanceof Collection) || !((Collection) iterableUntil).isEmpty()) {
                    Iterator it = iterableUntil.iterator();
                    while (it.hasNext()) {
                        Format trackFormat = group.getTrackFormat(((IntIterator) it).nextInt());
                        trackFormat.getClass();
                        if (MimeTypes.isVideo(trackFormat.sampleMimeType)) {
                            break loop0;
                        }
                    }
                }
            }
        }
        Tracks.Group group2 = (Tracks.Group) obj;
        Format trackFormat2 = group2 != null ? group2.getTrackFormat(0) : null;
        if (trackFormat2 != null) {
            c(trackFormat2.width, trackFormat2.height);
        }
        at0 groups2 = tracks.getGroups();
        groups2.getClass();
        int size2 = groups2.size();
        int i2 = 0;
        loop2: while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = groups2.get(i2);
            i2++;
            Tracks.Group group3 = (Tracks.Group) obj2;
            if (group3.isSelected()) {
                Iterable iterableUntil2 = RangesKt.until(0, group3.length);
                if (!(iterableUntil2 instanceof Collection) || !((Collection) iterableUntil2).isEmpty()) {
                    Iterator it2 = iterableUntil2.iterator();
                    while (it2.hasNext()) {
                        Format trackFormat3 = group3.getTrackFormat(((IntIterator) it2).nextInt());
                        trackFormat3.getClass();
                        if (Intrinsics.areEqual(trackFormat3.sampleMimeType, MimeTypes.TEXT_SSA) || Intrinsics.areEqual(trackFormat3.codecs, MimeTypes.TEXT_SSA)) {
                            break loop2;
                        }
                    }
                }
            }
        }
        Tracks.Group group4 = (Tracks.Group) obj2;
        Format trackFormat4 = group4 != null ? group4.getTrackFormat(0) : null;
        this.n = trackFormat4;
        if (trackFormat4 != null) {
            e();
            return;
        }
        Log.i("AssHandler", "subtitle track disabled");
        this.d = null;
        AssRender assRender = this.b;
        if (assRender != null) {
            assRender.setTrack(null);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        videoSize.getClass();
        this.h = new Size(videoSize.width, videoSize.height);
        Log.i("AssHandler", "onVideoSizeChanged: width = " + videoSize.width + ", height = " + videoSize.height);
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

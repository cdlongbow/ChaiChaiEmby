package com.dh.myembyapp.data.api;

import defpackage.i02;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010+J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J°\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010?J\u0014\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lcom/dh/myembyapp/data/api/PlaybackProgressInfo;", "", "ItemId", "", "PositionTicks", "", "IsPaused", "", "PlayMethod", "CanSeek", "MediaSourceId", "PlaySessionId", "EventName", "IsMuted", "PlaybackRate", "", "RepeatMode", "PlaylistIndex", "PlaylistLength", "RunTimeTicks", "NowPlayingQueue", "", "Lcom/dh/myembyapp/data/api/QueueItem;", "<init>", "(Ljava/lang/String;JZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Long;Ljava/util/List;)V", "getItemId", "()Ljava/lang/String;", "getPositionTicks", "()J", "getIsPaused", "()Z", "getPlayMethod", "getCanSeek", "getMediaSourceId", "getPlaySessionId", "getEventName", "getIsMuted", "getPlaybackRate", "()I", "getRepeatMode", "getPlaylistIndex", "getPlaylistLength", "getRunTimeTicks", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNowPlayingQueue", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;JZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Long;Ljava/util/List;)Lcom/dh/myembyapp/data/api/PlaybackProgressInfo;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlaybackProgressInfo {
    public static final int $stable = 8;
    private final boolean CanSeek;
    private final String EventName;
    private final boolean IsMuted;
    private final boolean IsPaused;
    private final String ItemId;
    private final String MediaSourceId;
    private final List<QueueItem> NowPlayingQueue;
    private final String PlayMethod;
    private final String PlaySessionId;
    private final int PlaybackRate;
    private final int PlaylistIndex;
    private final int PlaylistLength;
    private final long PositionTicks;
    private final String RepeatMode;
    private final Long RunTimeTicks;

    public /* synthetic */ PlaybackProgressInfo(String str, long j, boolean z, String str2, boolean z2, String str3, String str4, String str5, boolean z3, int i, String str6, int i2, int i3, Long l, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? "DirectStream" : str2, (i4 & 16) != 0 ? true : z2, str3, str4, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? 1 : i, (i4 & 1024) != 0 ? "RepeatNone" : str6, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? 1 : i3, (i4 & 8192) != 0 ? null : l, (i4 & 16384) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component14, reason: from getter */

    public final List<QueueItem> component15() {
        return this.NowPlayingQueue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final PlaybackProgressInfo copy(String ItemId, long PositionTicks, boolean IsPaused, String PlayMethod, boolean CanSeek, String MediaSourceId, String PlaySessionId, String EventName, boolean IsMuted, int PlaybackRate, String RepeatMode, int PlaylistIndex, int PlaylistLength, Long RunTimeTicks, List<QueueItem> NowPlayingQueue) {
        ItemId.getClass();
        PlayMethod.getClass();
        MediaSourceId.getClass();
        PlaySessionId.getClass();
        RepeatMode.getClass();
        return new PlaybackProgressInfo(ItemId, PositionTicks, IsPaused, PlayMethod, CanSeek, MediaSourceId, PlaySessionId, EventName, IsMuted, PlaybackRate, RepeatMode, PlaylistIndex, PlaylistLength, RunTimeTicks, NowPlayingQueue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackProgressInfo)) {
            return false;
        }
        PlaybackProgressInfo playbackProgressInfo = (PlaybackProgressInfo) other;
        return Intrinsics.areEqual(this.ItemId, playbackProgressInfo.ItemId) && this.PositionTicks == playbackProgressInfo.PositionTicks && this.IsPaused == playbackProgressInfo.IsPaused && Intrinsics.areEqual(this.PlayMethod, playbackProgressInfo.PlayMethod) && this.CanSeek == playbackProgressInfo.CanSeek && Intrinsics.areEqual(this.MediaSourceId, playbackProgressInfo.MediaSourceId) && Intrinsics.areEqual(this.PlaySessionId, playbackProgressInfo.PlaySessionId) && Intrinsics.areEqual(this.EventName, playbackProgressInfo.EventName) && this.IsMuted == playbackProgressInfo.IsMuted && this.PlaybackRate == playbackProgressInfo.PlaybackRate && Intrinsics.areEqual(this.RepeatMode, playbackProgressInfo.RepeatMode) && this.PlaylistIndex == playbackProgressInfo.PlaylistIndex && this.PlaylistLength == playbackProgressInfo.PlaylistLength && Intrinsics.areEqual(this.RunTimeTicks, playbackProgressInfo.RunTimeTicks) && Intrinsics.areEqual(this.NowPlayingQueue, playbackProgressInfo.NowPlayingQueue);
    }







    public final List<QueueItem> getNowPlayingQueue() {
        return this.NowPlayingQueue;
    }









    public int hashCode() {
        int iHashCode = this.ItemId.hashCode() * 31;
        long j = this.PositionTicks;
        int i = i02.i(i02.i((i02.i((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.IsPaused ? 1231 : 1237)) * 31, 31, this.PlayMethod) + (this.CanSeek ? 1231 : 1237)) * 31, 31, this.MediaSourceId), 31, this.PlaySessionId);
        String str = this.EventName;
        int i2 = (((i02.i((((((i + (str == null ? 0 : str.hashCode())) * 31) + (this.IsMuted ? 1231 : 1237)) * 31) + this.PlaybackRate) * 31, 31, this.RepeatMode) + this.PlaylistIndex) * 31) + this.PlaylistLength) * 31;
        Long l = this.RunTimeTicks;
        int iHashCode2 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        List<QueueItem> list = this.NowPlayingQueue;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.ItemId;
        long j = this.PositionTicks;
        boolean z = this.IsPaused;
        String str2 = this.PlayMethod;
        boolean z2 = this.CanSeek;
        String str3 = this.MediaSourceId;
        String str4 = this.PlaySessionId;
        String str5 = this.EventName;
        boolean z3 = this.IsMuted;
        int i = this.PlaybackRate;
        String str6 = this.RepeatMode;
        int i2 = this.PlaylistIndex;
        int i3 = this.PlaylistLength;
        Long l = this.RunTimeTicks;
        List<QueueItem> list = this.NowPlayingQueue;
        StringBuilder sb = new StringBuilder("PlaybackProgressInfo(ItemId=");
        sb.append(str);
        sb.append(", PositionTicks=");
        sb.append(j);
        sb.append(", IsPaused=");
        sb.append(z);
        sb.append(", PlayMethod=");
        sb.append(str2);
        sb.append(", CanSeek=");
        sb.append(z2);
        sb.append(", MediaSourceId=");
        sb.append(str3);
        i02.v(sb, ", PlaySessionId=", str4, ", EventName=", str5);
        sb.append(", IsMuted=");
        sb.append(z3);
        sb.append(", PlaybackRate=");
        sb.append(i);
        sb.append(", RepeatMode=");
        sb.append(str6);
        sb.append(", PlaylistIndex=");
        sb.append(i2);
        sb.append(", PlaylistLength=");
        sb.append(i3);
        sb.append(", RunTimeTicks=");
        sb.append(l);
        sb.append(", NowPlayingQueue=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public PlaybackProgressInfo(String str, long j, boolean z, String str2, boolean z2, String str3, String str4, String str5, boolean z3, int i, String str6, int i2, int i3, Long l, List<QueueItem> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        this.ItemId = str;
        this.PositionTicks = j;
        this.IsPaused = z;
        this.PlayMethod = str2;
        this.CanSeek = z2;
        this.MediaSourceId = str3;
        this.PlaySessionId = str4;
        this.EventName = str5;
        this.IsMuted = z3;
        this.PlaybackRate = i;
        this.RepeatMode = str6;
        this.PlaylistIndex = i2;
        this.PlaylistLength = i3;
        this.RunTimeTicks = l;
        this.NowPlayingQueue = list;
    }
}

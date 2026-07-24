package com.dh.myembyapp.data.api;

import defpackage.i02;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class PlaybackProgressInfo {
    
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

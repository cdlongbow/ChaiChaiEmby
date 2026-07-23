package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/TraktCloudPlaybackProgress;", "", "progressPercent", "", "positionTicks", "", "pausedAt", "", "playbackId", "<init>", "(DJLjava/lang/String;Ljava/lang/Long;)V", "getProgressPercent", "()D", "getPositionTicks", "()J", "getPausedAt", "()Ljava/lang/String;", "getPlaybackId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(DJLjava/lang/String;Ljava/lang/Long;)Lcom/dh/myembyapp/data/model/TraktCloudPlaybackProgress;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktCloudPlaybackProgress {
    public static final int $stable = 0;
    private final String pausedAt;
    private final Long playbackId;
    private final long positionTicks;
    private final double progressPercent;

    public TraktCloudPlaybackProgress(double d, long j, String str, Long l) {
        this.progressPercent = d;
        this.positionTicks = j;
        this.pausedAt = str;
        this.playbackId = l;
    }

    public static /* synthetic */ TraktCloudPlaybackProgress copy$default(TraktCloudPlaybackProgress traktCloudPlaybackProgress, double d, long j, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            d = traktCloudPlaybackProgress.progressPercent;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            j = traktCloudPlaybackProgress.positionTicks;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = traktCloudPlaybackProgress.pausedAt;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            l = traktCloudPlaybackProgress.playbackId;
        }
        return traktCloudPlaybackProgress.copy(d2, j2, str2, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktCloudPlaybackProgress copy(double progressPercent, long positionTicks, String pausedAt, Long playbackId) {
        return new TraktCloudPlaybackProgress(progressPercent, positionTicks, pausedAt, playbackId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktCloudPlaybackProgress)) {
            return false;
        }
        TraktCloudPlaybackProgress traktCloudPlaybackProgress = (TraktCloudPlaybackProgress) other;
        return Double.compare(this.progressPercent, traktCloudPlaybackProgress.progressPercent) == 0 && this.positionTicks == traktCloudPlaybackProgress.positionTicks && Intrinsics.areEqual(this.pausedAt, traktCloudPlaybackProgress.pausedAt) && Intrinsics.areEqual(this.playbackId, traktCloudPlaybackProgress.playbackId);
    }





    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.progressPercent);
        long j = this.positionTicks;
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) ((j >>> 32) ^ j))) * 31;
        String str = this.pausedAt;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.playbackId;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "TraktCloudPlaybackProgress(progressPercent=" + this.progressPercent + ", positionTicks=" + this.positionTicks + ", pausedAt=" + this.pausedAt + ", playbackId=" + this.playbackId + ")";
    }
}

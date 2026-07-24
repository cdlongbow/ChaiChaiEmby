package com.dh.myembyapp.data.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktCloudPlaybackProgress {
    
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

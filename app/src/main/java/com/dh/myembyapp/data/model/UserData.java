package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class UserData {
    

    @SerializedName("IsFavorite")
    private final boolean isFavorite;

    @SerializedName("LastPlayedDate")
    private final String lastPlayedDate;

    @SerializedName("PlayCount")
    private final int playCount;

    @SerializedName("PlaybackPositionTicks")
    private final long playbackPositionTicks;

    @SerializedName("Played")
    private final boolean played;

    @SerializedName("PlayedPercentage")
    private final Double playedPercentage;

    @SerializedName("UnplayedItemCount")
    private final Integer unplayedItemCount;

    public /* synthetic */ UserData(long j, Double d, int i, boolean z, boolean z2, Integer num, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : d, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str);
    }

    public static /* synthetic */ UserData copy$default(UserData userData, long j, Double d, int i, boolean z, boolean z2, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = userData.playbackPositionTicks;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            d = userData.playedPercentage;
        }
        Double d2 = d;
        if ((i2 & 4) != 0) {
            i = userData.playCount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = userData.isFavorite;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = userData.played;
        }
        return userData.copy(j2, d2, i3, z3, z2, (i2 & 32) != 0 ? userData.unplayedItemCount : num, (i2 & 64) != 0 ? userData.lastPlayedDate : str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final UserData copy(long playbackPositionTicks, Double playedPercentage, int playCount, boolean isFavorite, boolean played, Integer unplayedItemCount, String lastPlayedDate) {
        return new UserData(playbackPositionTicks, playedPercentage, playCount, isFavorite, played, unplayedItemCount, lastPlayedDate);
    }

    public boolean equals(Object other) {
        long j = this.playbackPositionTicks;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Double d = this.playedPercentage;
        int iHashCode = (((((((i + (d == null ? 0 : d.hashCode())) * 31) + this.playCount) * 31) + (this.isFavorite ? 1231 : 1237)) * 31) + (this.played ? 1231 : 1237)) * 31;
        Integer num = this.unplayedItemCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.lastPlayedDate;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }


    public String toString() {
        return "UserData(playbackPositionTicks=" + this.playbackPositionTicks + ", playedPercentage=" + this.playedPercentage + ", playCount=" + this.playCount + ", isFavorite=" + this.isFavorite + ", played=" + this.played + ", unplayedItemCount=" + this.unplayedItemCount + ", lastPlayedDate=" + this.lastPlayedDate + ")";
    }

    public UserData(long j, Double d, int i, boolean z, boolean z2, Integer num, String str) {
        this.playbackPositionTicks = j;
        this.playedPercentage = d;
        this.playCount = i;
        this.isFavorite = z;
        this.played = z2;
        this.unplayedItemCount = num;
        this.lastPlayedDate = str;
    }

    public UserData() {
        this(0L, null, 0, false, false, null, null, 127, null);
    }
}

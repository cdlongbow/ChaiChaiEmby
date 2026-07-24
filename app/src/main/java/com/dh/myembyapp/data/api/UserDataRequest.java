package com.dh.myembyapp.data.api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class UserDataRequest {
    
    private final Boolean IsFavorite;
    private final String LastPlayedDate;
    private final Integer PlayCount;
    private final long PlaybackPositionTicks;
    private final Boolean Played;

    public /* synthetic */ UserDataRequest(long j, Integer num, Boolean bool, Boolean bool2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str);
    }

    public static /* synthetic */ UserDataRequest copy$default(UserDataRequest userDataRequest, long j, Integer num, Boolean bool, Boolean bool2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userDataRequest.PlaybackPositionTicks;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            num = userDataRequest.PlayCount;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            bool = userDataRequest.IsFavorite;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            bool2 = userDataRequest.Played;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str = userDataRequest.LastPlayedDate;
        }
        return userDataRequest.copy(j2, num2, bool3, bool4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final UserDataRequest copy(long PlaybackPositionTicks, Integer PlayCount, Boolean IsFavorite, Boolean Played, String LastPlayedDate) {
        return new UserDataRequest(PlaybackPositionTicks, PlayCount, IsFavorite, Played, LastPlayedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDataRequest)) {
            return false;
        }
        UserDataRequest userDataRequest = (UserDataRequest) other;
        return this.PlaybackPositionTicks == userDataRequest.PlaybackPositionTicks && Intrinsics.areEqual(this.PlayCount, userDataRequest.PlayCount) && Intrinsics.areEqual(this.IsFavorite, userDataRequest.IsFavorite) && Intrinsics.areEqual(this.Played, userDataRequest.Played) && Intrinsics.areEqual(this.LastPlayedDate, userDataRequest.LastPlayedDate);
    }

    public int hashCode() {
        long j = this.PlaybackPositionTicks;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Integer num = this.PlayCount;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.IsFavorite;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.Played;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.LastPlayedDate;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UserDataRequest(PlaybackPositionTicks=" + this.PlaybackPositionTicks + ", PlayCount=" + this.PlayCount + ", IsFavorite=" + this.IsFavorite + ", Played=" + this.Played + ", LastPlayedDate=" + this.LastPlayedDate + ")";
    }

    public UserDataRequest(long j, Integer num, Boolean bool, Boolean bool2, String str) {
        this.PlaybackPositionTicks = j;
        this.PlayCount = num;
        this.IsFavorite = bool;
        this.Played = bool2;
        this.LastPlayedDate = str;
    }
}

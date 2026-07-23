package com.dh.myembyapp.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/dh/myembyapp/data/api/UserDataRequest;", "", "PlaybackPositionTicks", "", "PlayCount", "", "IsFavorite", "", "Played", "LastPlayedDate", "", "<init>", "(JLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPlaybackPositionTicks", "()J", "getPlayCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIsFavorite", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlayed", "getLastPlayedDate", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/dh/myembyapp/data/api/UserDataRequest;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserDataRequest {
    public static final int $stable = 0;
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

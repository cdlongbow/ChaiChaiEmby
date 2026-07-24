package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktWatchedEpisode {
    

    @SerializedName("completed")
    private final Boolean completed;

    @SerializedName("last_watched_at")
    private final String lastWatchedAt;

    @SerializedName("number")
    private final Integer number;

    public /* synthetic */ TraktWatchedEpisode(Integer num, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }

    public static /* synthetic */ TraktWatchedEpisode copy$default(TraktWatchedEpisode traktWatchedEpisode, Integer num, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktWatchedEpisode.number;
        }
        if ((i & 2) != 0) {
            bool = traktWatchedEpisode.completed;
        }
        if ((i & 4) != 0) {
            str = traktWatchedEpisode.lastWatchedAt;
        }
        return traktWatchedEpisode.copy(num, bool, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktWatchedEpisode copy(Integer number, Boolean completed, String lastWatchedAt) {
        return new TraktWatchedEpisode(number, completed, lastWatchedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktWatchedEpisode)) {
            return false;
        }
        TraktWatchedEpisode traktWatchedEpisode = (TraktWatchedEpisode) other;
        return Intrinsics.areEqual(this.number, traktWatchedEpisode.number) && Intrinsics.areEqual(this.completed, traktWatchedEpisode.completed) && Intrinsics.areEqual(this.lastWatchedAt, traktWatchedEpisode.lastWatchedAt);
    }




    public int hashCode() {
        Integer num = this.number;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.completed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.lastWatchedAt;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.number;
        Boolean bool = this.completed;
        String str = this.lastWatchedAt;
        StringBuilder sb = new StringBuilder("TraktWatchedEpisode(number=");
        sb.append(num);
        sb.append(", completed=");
        sb.append(bool);
        sb.append(", lastWatchedAt=");
        return s01.w(sb, str, ")");
    }

    public TraktWatchedEpisode(Integer num, Boolean bool, String str) {
        this.number = num;
        this.completed = bool;
        this.lastWatchedAt = str;
    }

    public TraktWatchedEpisode() {
        this(null, null, null, 7, null);
    }
}

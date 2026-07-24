package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktShowWatchedProgress {
    

    @SerializedName("aired")
    private final Integer aired;

    @SerializedName("completed")
    private final Integer completed;

    @SerializedName("last_watched_at")
    private final String lastWatchedAt;

    @SerializedName("seasons")
    private final List<TraktWatchedSeason> seasons;

    public /* synthetic */ TraktShowWatchedProgress(Integer num, Integer num2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktShowWatchedProgress copy$default(TraktShowWatchedProgress traktShowWatchedProgress, Integer num, Integer num2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktShowWatchedProgress.aired;
        }
        if ((i & 2) != 0) {
            num2 = traktShowWatchedProgress.completed;
        }
        if ((i & 4) != 0) {
            str = traktShowWatchedProgress.lastWatchedAt;
        }
        if ((i & 8) != 0) {
            list = traktShowWatchedProgress.seasons;
        }
        return traktShowWatchedProgress.copy(num, num2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<TraktWatchedSeason> component4() {
        return this.seasons;
    }

    public final TraktShowWatchedProgress copy(Integer aired, Integer completed, String lastWatchedAt, List<TraktWatchedSeason> seasons) {
        return new TraktShowWatchedProgress(aired, completed, lastWatchedAt, seasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktShowWatchedProgress)) {
            return false;
        }
        TraktShowWatchedProgress traktShowWatchedProgress = (TraktShowWatchedProgress) other;
        return Intrinsics.areEqual(this.aired, traktShowWatchedProgress.aired) && Intrinsics.areEqual(this.completed, traktShowWatchedProgress.completed) && Intrinsics.areEqual(this.lastWatchedAt, traktShowWatchedProgress.lastWatchedAt) && Intrinsics.areEqual(this.seasons, traktShowWatchedProgress.seasons);
    }




    public final List<TraktWatchedSeason> getSeasons() {
        return this.seasons;
    }

    public int hashCode() {
        Integer num = this.aired;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.completed;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.lastWatchedAt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TraktWatchedSeason> list = this.seasons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TraktShowWatchedProgress(aired=" + this.aired + ", completed=" + this.completed + ", lastWatchedAt=" + this.lastWatchedAt + ", seasons=" + this.seasons + ")";
    }

    public TraktShowWatchedProgress(Integer num, Integer num2, String str, List<TraktWatchedSeason> list) {
        this.aired = num;
        this.completed = num2;
        this.lastWatchedAt = str;
        this.seasons = list;
    }

    public TraktShowWatchedProgress() {
        this(null, null, null, null, 15, null);
    }
}

package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktWatchedSeason {
    

    @SerializedName("aired")
    private final Integer aired;

    @SerializedName("completed")
    private final Integer completed;

    @SerializedName("episodes")
    private final List<TraktWatchedEpisode> episodes;

    @SerializedName("number")
    private final Integer number;

    public /* synthetic */ TraktWatchedSeason(Integer num, Integer num2, Integer num3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktWatchedSeason copy$default(TraktWatchedSeason traktWatchedSeason, Integer num, Integer num2, Integer num3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktWatchedSeason.number;
        }
        if ((i & 2) != 0) {
            num2 = traktWatchedSeason.aired;
        }
        if ((i & 4) != 0) {
            num3 = traktWatchedSeason.completed;
        }
        if ((i & 8) != 0) {
            list = traktWatchedSeason.episodes;
        }
        return traktWatchedSeason.copy(num, num2, num3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<TraktWatchedEpisode> component4() {
        return this.episodes;
    }

    public final TraktWatchedSeason copy(Integer number, Integer aired, Integer completed, List<TraktWatchedEpisode> episodes) {
        return new TraktWatchedSeason(number, aired, completed, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktWatchedSeason)) {
            return false;
        }
        TraktWatchedSeason traktWatchedSeason = (TraktWatchedSeason) other;
        return Intrinsics.areEqual(this.number, traktWatchedSeason.number) && Intrinsics.areEqual(this.aired, traktWatchedSeason.aired) && Intrinsics.areEqual(this.completed, traktWatchedSeason.completed) && Intrinsics.areEqual(this.episodes, traktWatchedSeason.episodes);
    }



    public final List<TraktWatchedEpisode> getEpisodes() {
        return this.episodes;
    }


    public int hashCode() {
        Integer num = this.number;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.aired;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.completed;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<TraktWatchedEpisode> list = this.episodes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TraktWatchedSeason(number=" + this.number + ", aired=" + this.aired + ", completed=" + this.completed + ", episodes=" + this.episodes + ")";
    }

    public TraktWatchedSeason(Integer num, Integer num2, Integer num3, List<TraktWatchedEpisode> list) {
        this.number = num;
        this.aired = num2;
        this.completed = num3;
        this.episodes = list;
    }

    public TraktWatchedSeason() {
        this(null, null, null, null, 15, null);
    }
}

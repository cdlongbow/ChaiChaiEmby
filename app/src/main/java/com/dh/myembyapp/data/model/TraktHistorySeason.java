package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktHistorySeason {
    

    @SerializedName("episodes")
    private final List<TraktHistoryEpisode> episodes;

    @SerializedName("number")
    private final int number;

    public TraktHistorySeason(int i, List<TraktHistoryEpisode> list) {
        list.getClass();
        this.number = i;
        this.episodes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktHistorySeason copy$default(TraktHistorySeason traktHistorySeason, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = traktHistorySeason.number;
        }
        if ((i2 & 2) != 0) {
            list = traktHistorySeason.episodes;
        }
        return traktHistorySeason.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<TraktHistoryEpisode> component2() {
        return this.episodes;
    }

    public final TraktHistorySeason copy(int number, List<TraktHistoryEpisode> episodes) {
        episodes.getClass();
        return new TraktHistorySeason(number, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktHistorySeason)) {
            return false;
        }
        TraktHistorySeason traktHistorySeason = (TraktHistorySeason) other;
        return this.number == traktHistorySeason.number && Intrinsics.areEqual(this.episodes, traktHistorySeason.episodes);
    }

    public final List<TraktHistoryEpisode> getEpisodes() {
        return this.episodes;
    }


    public int hashCode() {
        return this.episodes.hashCode() + (this.number * 31);
    }

    public String toString() {
        return "TraktHistorySeason(number=" + this.number + ", episodes=" + this.episodes + ")";
    }
}

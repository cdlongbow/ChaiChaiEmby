package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktSyncHistoryNotFound {
    

    @SerializedName("episodes")
    private final List<TraktHistoryEpisode> episodes;

    @SerializedName("movies")
    private final List<TraktHistoryMovie> movies;

    @SerializedName("seasons")
    private final List<TraktHistorySeason> seasons;

    @SerializedName("shows")
    private final List<TraktHistoryShow> shows;

    public /* synthetic */ TraktSyncHistoryNotFound(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktSyncHistoryNotFound copy$default(TraktSyncHistoryNotFound traktSyncHistoryNotFound, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = traktSyncHistoryNotFound.movies;
        }
        if ((i & 2) != 0) {
            list2 = traktSyncHistoryNotFound.shows;
        }
        if ((i & 4) != 0) {
            list3 = traktSyncHistoryNotFound.seasons;
        }
        if ((i & 8) != 0) {
            list4 = traktSyncHistoryNotFound.episodes;
        }
        return traktSyncHistoryNotFound.copy(list, list2, list3, list4);
    }

    public final List<TraktHistoryMovie> component1() {
        return this.movies;
    }

    public final List<TraktHistoryShow> component2() {
        return this.shows;
    }

    public final List<TraktHistorySeason> component3() {
        return this.seasons;
    }

    public final List<TraktHistoryEpisode> component4() {
        return this.episodes;
    }

    public final TraktSyncHistoryNotFound copy(List<TraktHistoryMovie> movies, List<TraktHistoryShow> shows, List<TraktHistorySeason> seasons, List<TraktHistoryEpisode> episodes) {
        return new TraktSyncHistoryNotFound(movies, shows, seasons, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktSyncHistoryNotFound)) {
            return false;
        }
        TraktSyncHistoryNotFound traktSyncHistoryNotFound = (TraktSyncHistoryNotFound) other;
        return Intrinsics.areEqual(this.movies, traktSyncHistoryNotFound.movies) && Intrinsics.areEqual(this.shows, traktSyncHistoryNotFound.shows) && Intrinsics.areEqual(this.seasons, traktSyncHistoryNotFound.seasons) && Intrinsics.areEqual(this.episodes, traktSyncHistoryNotFound.episodes);
    }

    public final List<TraktHistoryEpisode> getEpisodes() {
        return this.episodes;
    }

    public final List<TraktHistoryMovie> getMovies() {
        return this.movies;
    }

    public final List<TraktHistorySeason> getSeasons() {
        return this.seasons;
    }

    public final List<TraktHistoryShow> getShows() {
        return this.shows;
    }

    public int hashCode() {
        List<TraktHistoryMovie> list = this.movies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TraktHistoryShow> list2 = this.shows;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TraktHistorySeason> list3 = this.seasons;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TraktHistoryEpisode> list4 = this.episodes;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "TraktSyncHistoryNotFound(movies=" + this.movies + ", shows=" + this.shows + ", seasons=" + this.seasons + ", episodes=" + this.episodes + ")";
    }

    public TraktSyncHistoryNotFound(List<TraktHistoryMovie> list, List<TraktHistoryShow> list2, List<TraktHistorySeason> list3, List<TraktHistoryEpisode> list4) {
        this.movies = list;
        this.shows = list2;
        this.seasons = list3;
        this.episodes = list4;
    }

    public TraktSyncHistoryNotFound() {
        this(null, null, null, null, 15, null);
    }
}

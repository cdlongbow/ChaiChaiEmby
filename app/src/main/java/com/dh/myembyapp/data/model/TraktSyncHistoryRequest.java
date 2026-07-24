package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktSyncHistoryRequest {
    

    @SerializedName("episodes")
    private final List<TraktHistoryEpisode> episodes;

    @SerializedName("movies")
    private final List<TraktHistoryMovie> movies;

    @SerializedName("shows")
    private final List<TraktHistoryShow> shows;

    public /* synthetic */ TraktSyncHistoryRequest(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktSyncHistoryRequest copy$default(TraktSyncHistoryRequest traktSyncHistoryRequest, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = traktSyncHistoryRequest.movies;
        }
        if ((i & 2) != 0) {
            list2 = traktSyncHistoryRequest.shows;
        }
        if ((i & 4) != 0) {
            list3 = traktSyncHistoryRequest.episodes;
        }
        return traktSyncHistoryRequest.copy(list, list2, list3);
    }

    public final List<TraktHistoryMovie> component1() {
        return this.movies;
    }

    public final List<TraktHistoryShow> component2() {
        return this.shows;
    }

    public final List<TraktHistoryEpisode> component3() {
        return this.episodes;
    }

    public final TraktSyncHistoryRequest copy(List<TraktHistoryMovie> movies, List<TraktHistoryShow> shows, List<TraktHistoryEpisode> episodes) {
        return new TraktSyncHistoryRequest(movies, shows, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktSyncHistoryRequest)) {
            return false;
        }
        TraktSyncHistoryRequest traktSyncHistoryRequest = (TraktSyncHistoryRequest) other;
        return Intrinsics.areEqual(this.movies, traktSyncHistoryRequest.movies) && Intrinsics.areEqual(this.shows, traktSyncHistoryRequest.shows) && Intrinsics.areEqual(this.episodes, traktSyncHistoryRequest.episodes);
    }

    public final List<TraktHistoryEpisode> getEpisodes() {
        return this.episodes;
    }

    public final List<TraktHistoryMovie> getMovies() {
        return this.movies;
    }

    public final List<TraktHistoryShow> getShows() {
        return this.shows;
    }

    public int hashCode() {
        List<TraktHistoryMovie> list = this.movies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TraktHistoryShow> list2 = this.shows;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TraktHistoryEpisode> list3 = this.episodes;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "TraktSyncHistoryRequest(movies=" + this.movies + ", shows=" + this.shows + ", episodes=" + this.episodes + ")";
    }

    public TraktSyncHistoryRequest(List<TraktHistoryMovie> list, List<TraktHistoryShow> list2, List<TraktHistoryEpisode> list3) {
        this.movies = list;
        this.shows = list2;
        this.episodes = list3;
    }

    public TraktSyncHistoryRequest() {
        this(null, null, null, 7, null);
    }
}

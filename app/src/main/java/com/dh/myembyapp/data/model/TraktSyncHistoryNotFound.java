package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktSyncHistoryNotFound;", "", "movies", "", "Lcom/dh/myembyapp/data/model/TraktHistoryMovie;", "shows", "Lcom/dh/myembyapp/data/model/TraktHistoryShow;", "seasons", "Lcom/dh/myembyapp/data/model/TraktHistorySeason;", "episodes", "Lcom/dh/myembyapp/data/model/TraktHistoryEpisode;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMovies", "()Ljava/util/List;", "getShows", "getSeasons", "getEpisodes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktSyncHistoryNotFound {
    public static final int $stable = 8;

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

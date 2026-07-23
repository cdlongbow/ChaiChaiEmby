package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktSyncHistoryRequest;", "", "movies", "", "Lcom/dh/myembyapp/data/model/TraktHistoryMovie;", "shows", "Lcom/dh/myembyapp/data/model/TraktHistoryShow;", "episodes", "Lcom/dh/myembyapp/data/model/TraktHistoryEpisode;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMovies", "()Ljava/util/List;", "getShows", "getEpisodes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktSyncHistoryRequest {
    public static final int $stable = 8;

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

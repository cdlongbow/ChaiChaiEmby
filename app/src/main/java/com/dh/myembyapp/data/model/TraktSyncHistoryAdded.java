package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.c61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktSyncHistoryAdded;", "", "movies", "", "episodes", "shows", "seasons", "<init>", "(IIII)V", "getMovies", "()I", "getEpisodes", "getShows", "getSeasons", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktSyncHistoryAdded {
    public static final int $stable = 0;

    @SerializedName("episodes")
    private final int episodes;

    @SerializedName("movies")
    private final int movies;

    @SerializedName("seasons")
    private final int seasons;

    @SerializedName("shows")
    private final int shows;

    public /* synthetic */ TraktSyncHistoryAdded(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static /* synthetic */ TraktSyncHistoryAdded copy$default(TraktSyncHistoryAdded traktSyncHistoryAdded, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = traktSyncHistoryAdded.movies;
        }
        if ((i5 & 2) != 0) {
            i2 = traktSyncHistoryAdded.episodes;
        }
        if ((i5 & 4) != 0) {
            i3 = traktSyncHistoryAdded.shows;
        }
        if ((i5 & 8) != 0) {
            i4 = traktSyncHistoryAdded.seasons;
        }
        return traktSyncHistoryAdded.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktSyncHistoryAdded copy(int movies, int episodes, int shows, int seasons) {
        return new TraktSyncHistoryAdded(movies, episodes, shows, seasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktSyncHistoryAdded)) {
            return false;
        }
        TraktSyncHistoryAdded traktSyncHistoryAdded = (TraktSyncHistoryAdded) other;
        return this.movies == traktSyncHistoryAdded.movies && this.episodes == traktSyncHistoryAdded.episodes && this.shows == traktSyncHistoryAdded.shows && this.seasons == traktSyncHistoryAdded.seasons;
    }





    public int hashCode() {
        return (((((this.movies * 31) + this.episodes) * 31) + this.shows) * 31) + this.seasons;
    }

    public String toString() {
        int i = this.movies;
        int i2 = this.episodes;
        int i3 = this.shows;
        int i4 = this.seasons;
        StringBuilder sbO = c61.o("TraktSyncHistoryAdded(movies=", i, i2, ", episodes=", ", shows=");
        sbO.append(i3);
        sbO.append(", seasons=");
        sbO.append(i4);
        sbO.append(")");
        return sbO.toString();
    }

    public TraktSyncHistoryAdded(int i, int i2, int i3, int i4) {
        this.movies = i;
        this.episodes = i2;
        this.shows = i3;
        this.seasons = i4;
    }

    public TraktSyncHistoryAdded() {
        this(0, 0, 0, 0, 15, null);
    }
}

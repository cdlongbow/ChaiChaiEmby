package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.c61;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktSyncHistoryAdded {
    

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

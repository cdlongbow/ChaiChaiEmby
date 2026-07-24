package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktSearchResult {
    

    @SerializedName("episode")
    private final TraktEpisode episode;

    @SerializedName("movie")
    private final TraktMovie movie;

    @SerializedName("score")
    private final Double score;

    @SerializedName("show")
    private final TraktShow show;

    @SerializedName(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    private final String type;

    public /* synthetic */ TraktSearchResult(String str, Double d, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : traktMovie, (i & 8) != 0 ? null : traktShow, (i & 16) != 0 ? null : traktEpisode);
    }

    public static /* synthetic */ TraktSearchResult copy$default(TraktSearchResult traktSearchResult, String str, Double d, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktSearchResult.type;
        }
        if ((i & 2) != 0) {
            d = traktSearchResult.score;
        }
        if ((i & 4) != 0) {
            traktMovie = traktSearchResult.movie;
        }
        if ((i & 8) != 0) {
            traktShow = traktSearchResult.show;
        }
        if ((i & 16) != 0) {
            traktEpisode = traktSearchResult.episode;
        }
        TraktEpisode traktEpisode2 = traktEpisode;
        TraktMovie traktMovie2 = traktMovie;
        return traktSearchResult.copy(str, d, traktMovie2, traktShow, traktEpisode2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final TraktSearchResult copy(String type, Double score, TraktMovie movie, TraktShow show, TraktEpisode episode) {
        return new TraktSearchResult(type, score, movie, show, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktSearchResult)) {
            return false;
        }
        TraktSearchResult traktSearchResult = (TraktSearchResult) other;
        return Intrinsics.areEqual(this.type, traktSearchResult.type) && Intrinsics.areEqual((Object) this.score, (Object) traktSearchResult.score) && Intrinsics.areEqual(this.movie, traktSearchResult.movie) && Intrinsics.areEqual(this.show, traktSearchResult.show) && Intrinsics.areEqual(this.episode, traktSearchResult.episode);
    }






    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.score;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        TraktMovie traktMovie = this.movie;
        int iHashCode3 = (iHashCode2 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.show;
        int iHashCode4 = (iHashCode3 + (traktShow == null ? 0 : traktShow.hashCode())) * 31;
        TraktEpisode traktEpisode = this.episode;
        return iHashCode4 + (traktEpisode != null ? traktEpisode.hashCode() : 0);
    }

    public String toString() {
        return "TraktSearchResult(type=" + this.type + ", score=" + this.score + ", movie=" + this.movie + ", show=" + this.show + ", episode=" + this.episode + ")";
    }

    public TraktSearchResult(String str, Double d, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode) {
        this.type = str;
        this.score = d;
        this.movie = traktMovie;
        this.show = traktShow;
        this.episode = traktEpisode;
    }

    public TraktSearchResult() {
        this(null, null, null, null, null, 31, null);
    }
}

package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktSearchResult;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "score", "", "movie", "Lcom/dh/myembyapp/data/model/TraktMovie;", "show", "Lcom/dh/myembyapp/data/model/TraktShow;", "episode", "Lcom/dh/myembyapp/data/model/TraktEpisode;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lcom/dh/myembyapp/data/model/TraktMovie;Lcom/dh/myembyapp/data/model/TraktShow;Lcom/dh/myembyapp/data/model/TraktEpisode;)V", "getType", "()Ljava/lang/String;", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMovie", "()Lcom/dh/myembyapp/data/model/TraktMovie;", "getShow", "()Lcom/dh/myembyapp/data/model/TraktShow;", "getEpisode", "()Lcom/dh/myembyapp/data/model/TraktEpisode;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lcom/dh/myembyapp/data/model/TraktMovie;Lcom/dh/myembyapp/data/model/TraktShow;Lcom/dh/myembyapp/data/model/TraktEpisode;)Lcom/dh/myembyapp/data/model/TraktSearchResult;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktSearchResult {
    public static final int $stable = 0;

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

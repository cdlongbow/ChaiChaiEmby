package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktHistoryItem {
    

    @SerializedName("action")
    private final String action;

    @SerializedName("episode")
    private final TraktEpisode episode;

    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    @SerializedName("movie")
    private final TraktMovie movie;

    @SerializedName("show")
    private final TraktShow show;

    @SerializedName(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    private final String type;

    @SerializedName("watched_at")
    private final String watchedAt;

    public /* synthetic */ TraktHistoryItem(Long l, String str, String str2, String str3, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : traktMovie, (i & 32) != 0 ? null : traktShow, (i & 64) != 0 ? null : traktEpisode);
    }

    public static /* synthetic */ TraktHistoryItem copy$default(TraktHistoryItem traktHistoryItem, Long l, String str, String str2, String str3, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, Object obj) {
        if ((i & 1) != 0) {
            l = traktHistoryItem.id;
        }
        if ((i & 2) != 0) {
            str = traktHistoryItem.watchedAt;
        }
        if ((i & 4) != 0) {
            str2 = traktHistoryItem.action;
        }
        if ((i & 8) != 0) {
            str3 = traktHistoryItem.type;
        }
        if ((i & 16) != 0) {
            traktMovie = traktHistoryItem.movie;
        }
        if ((i & 32) != 0) {
            traktShow = traktHistoryItem.show;
        }
        if ((i & 64) != 0) {
            traktEpisode = traktHistoryItem.episode;
        }
        TraktShow traktShow2 = traktShow;
        TraktEpisode traktEpisode2 = traktEpisode;
        TraktMovie traktMovie2 = traktMovie;
        String str4 = str2;
        return traktHistoryItem.copy(l, str, str4, str3, traktMovie2, traktShow2, traktEpisode2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final TraktHistoryItem copy(Long id, String watchedAt, String action, String type, TraktMovie movie, TraktShow show, TraktEpisode episode) {
        return new TraktHistoryItem(id, watchedAt, action, type, movie, show, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktHistoryItem)) {
            return false;
        }
        TraktHistoryItem traktHistoryItem = (TraktHistoryItem) other;
        return Intrinsics.areEqual(this.id, traktHistoryItem.id) && Intrinsics.areEqual(this.watchedAt, traktHistoryItem.watchedAt) && Intrinsics.areEqual(this.action, traktHistoryItem.action) && Intrinsics.areEqual(this.type, traktHistoryItem.type) && Intrinsics.areEqual(this.movie, traktHistoryItem.movie) && Intrinsics.areEqual(this.show, traktHistoryItem.show) && Intrinsics.areEqual(this.episode, traktHistoryItem.episode);
    }








    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.watchedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TraktMovie traktMovie = this.movie;
        int iHashCode5 = (iHashCode4 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.show;
        int iHashCode6 = (iHashCode5 + (traktShow == null ? 0 : traktShow.hashCode())) * 31;
        TraktEpisode traktEpisode = this.episode;
        return iHashCode6 + (traktEpisode != null ? traktEpisode.hashCode() : 0);
    }

    public String toString() {
        Long l = this.id;
        String str = this.watchedAt;
        String str2 = this.action;
        String str3 = this.type;
        TraktMovie traktMovie = this.movie;
        TraktShow traktShow = this.show;
        TraktEpisode traktEpisode = this.episode;
        StringBuilder sb = new StringBuilder("TraktHistoryItem(id=");
        sb.append(l);
        sb.append(", watchedAt=");
        sb.append(str);
        sb.append(", action=");
        i02.v(sb, str2, ", type=", str3, ", movie=");
        sb.append(traktMovie);
        sb.append(", show=");
        sb.append(traktShow);
        sb.append(", episode=");
        sb.append(traktEpisode);
        sb.append(")");
        return sb.toString();
    }

    public TraktHistoryItem(Long l, String str, String str2, String str3, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode) {
        this.id = l;
        this.watchedAt = str;
        this.action = str2;
        this.type = str3;
        this.movie = traktMovie;
        this.show = traktShow;
        this.episode = traktEpisode;
    }

    public TraktHistoryItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}

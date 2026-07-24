package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktIds {
    

    @SerializedName("imdb")
    private final String imdb;

    @SerializedName("slug")
    private final String slug;

    @SerializedName("tmdb")
    private final Integer tmdb;

    @SerializedName("trakt")
    private final Integer trakt;

    @SerializedName("tvdb")
    private final Integer tvdb;

    public /* synthetic */ TraktIds(Integer num, String str, String str2, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3);
    }

    public static /* synthetic */ TraktIds copy$default(TraktIds traktIds, Integer num, String str, String str2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktIds.trakt;
        }
        if ((i & 2) != 0) {
            str = traktIds.slug;
        }
        if ((i & 4) != 0) {
            str2 = traktIds.imdb;
        }
        if ((i & 8) != 0) {
            num2 = traktIds.tmdb;
        }
        if ((i & 16) != 0) {
            num3 = traktIds.tvdb;
        }
        Integer num4 = num3;
        String str3 = str2;
        return traktIds.copy(num, str, str3, num2, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final TraktIds copy(Integer trakt, String slug, String imdb, Integer tmdb, Integer tvdb) {
        return new TraktIds(trakt, slug, imdb, tmdb, tvdb);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktIds)) {
            return false;
        }
        TraktIds traktIds = (TraktIds) other;
        return Intrinsics.areEqual(this.trakt, traktIds.trakt) && Intrinsics.areEqual(this.slug, traktIds.slug) && Intrinsics.areEqual(this.imdb, traktIds.imdb) && Intrinsics.areEqual(this.tmdb, traktIds.tmdb) && Intrinsics.areEqual(this.tvdb, traktIds.tvdb);
    }






    public int hashCode() {
        Integer num = this.trakt;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.slug;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imdb;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.tmdb;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tvdb;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "TraktIds(trakt=" + this.trakt + ", slug=" + this.slug + ", imdb=" + this.imdb + ", tmdb=" + this.tmdb + ", tvdb=" + this.tvdb + ")";
    }

    public TraktIds(Integer num, String str, String str2, Integer num2, Integer num3) {
        this.trakt = num;
        this.slug = str;
        this.imdb = str2;
        this.tmdb = num2;
        this.tvdb = num3;
    }

    public TraktIds() {
        this(null, null, null, null, null, 31, null);
    }
}

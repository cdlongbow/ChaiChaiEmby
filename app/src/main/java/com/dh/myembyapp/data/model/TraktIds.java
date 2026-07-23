package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktIds;", "", "trakt", "", "slug", "", "imdb", "tmdb", "tvdb", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTrakt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSlug", "()Ljava/lang/String;", "getImdb", "getTmdb", "getTvdb", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/dh/myembyapp/data/model/TraktIds;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktIds {
    public static final int $stable = 0;

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

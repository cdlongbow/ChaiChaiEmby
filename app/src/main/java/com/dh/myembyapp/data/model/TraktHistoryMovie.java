package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktHistoryMovie;", "", DlnaConstants.EXTRA_TITLE, "", "year", "", "ids", "Lcom/dh/myembyapp/data/model/TraktIds;", "watchedAt", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIds", "()Lcom/dh/myembyapp/data/model/TraktIds;", "getWatchedAt", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/lang/String;)Lcom/dh/myembyapp/data/model/TraktHistoryMovie;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktHistoryMovie {
    public static final int $stable = 0;

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    @SerializedName("watched_at")
    private final String watchedAt;

    @SerializedName("year")
    private final Integer year;

    public /* synthetic */ TraktHistoryMovie(String str, Integer num, TraktIds traktIds, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, traktIds, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ TraktHistoryMovie copy$default(TraktHistoryMovie traktHistoryMovie, String str, Integer num, TraktIds traktIds, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktHistoryMovie.title;
        }
        if ((i & 2) != 0) {
            num = traktHistoryMovie.year;
        }
        if ((i & 4) != 0) {
            traktIds = traktHistoryMovie.ids;
        }
        if ((i & 8) != 0) {
            str2 = traktHistoryMovie.watchedAt;
        }
        return traktHistoryMovie.copy(str, num, traktIds, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktHistoryMovie copy(String title, Integer year, TraktIds ids, String watchedAt) {
        ids.getClass();
        return new TraktHistoryMovie(title, year, ids, watchedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktHistoryMovie)) {
            return false;
        }
        TraktHistoryMovie traktHistoryMovie = (TraktHistoryMovie) other;
        return Intrinsics.areEqual(this.title, traktHistoryMovie.title) && Intrinsics.areEqual(this.year, traktHistoryMovie.year) && Intrinsics.areEqual(this.ids, traktHistoryMovie.ids) && Intrinsics.areEqual(this.watchedAt, traktHistoryMovie.watchedAt);
    }





    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.year;
        int iHashCode2 = (this.ids.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str2 = this.watchedAt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TraktHistoryMovie(title=" + this.title + ", year=" + this.year + ", ids=" + this.ids + ", watchedAt=" + this.watchedAt + ")";
    }

    public TraktHistoryMovie(String str, Integer num, TraktIds traktIds, String str2) {
        traktIds.getClass();
        this.title = str;
        this.year = num;
        this.ids = traktIds;
        this.watchedAt = str2;
    }
}

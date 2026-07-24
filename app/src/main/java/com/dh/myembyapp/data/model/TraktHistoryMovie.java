package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktHistoryMovie {
    

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

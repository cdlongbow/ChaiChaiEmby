package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktMovie {
    

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    @SerializedName("year")
    private final Integer year;

    public /* synthetic */ TraktMovie(String str, Integer num, TraktIds traktIds, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : traktIds);
    }

    public static /* synthetic */ TraktMovie copy$default(TraktMovie traktMovie, String str, Integer num, TraktIds traktIds, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktMovie.title;
        }
        if ((i & 2) != 0) {
            num = traktMovie.year;
        }
        if ((i & 4) != 0) {
            traktIds = traktMovie.ids;
        }
        return traktMovie.copy(str, num, traktIds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktMovie copy(String title, Integer year, TraktIds ids) {
        return new TraktMovie(title, year, ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktMovie)) {
            return false;
        }
        TraktMovie traktMovie = (TraktMovie) other;
        return Intrinsics.areEqual(this.title, traktMovie.title) && Intrinsics.areEqual(this.year, traktMovie.year) && Intrinsics.areEqual(this.ids, traktMovie.ids);
    }




    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.year;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        return iHashCode2 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public String toString() {
        return "TraktMovie(title=" + this.title + ", year=" + this.year + ", ids=" + this.ids + ")";
    }

    public TraktMovie(String str, Integer num, TraktIds traktIds) {
        this.title = str;
        this.year = num;
        this.ids = traktIds;
    }

    public TraktMovie() {
        this(null, null, null, 7, null);
    }
}

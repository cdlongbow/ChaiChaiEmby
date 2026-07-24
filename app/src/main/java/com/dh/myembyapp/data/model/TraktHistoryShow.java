package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktHistoryShow {
    

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName("seasons")
    private final List<TraktHistorySeason> seasons;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    @SerializedName("year")
    private final Integer year;

    public /* synthetic */ TraktHistoryShow(String str, Integer num, TraktIds traktIds, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : traktIds, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktHistoryShow copy$default(TraktHistoryShow traktHistoryShow, String str, Integer num, TraktIds traktIds, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktHistoryShow.title;
        }
        if ((i & 2) != 0) {
            num = traktHistoryShow.year;
        }
        if ((i & 4) != 0) {
            traktIds = traktHistoryShow.ids;
        }
        if ((i & 8) != 0) {
            list = traktHistoryShow.seasons;
        }
        return traktHistoryShow.copy(str, num, traktIds, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<TraktHistorySeason> component4() {
        return this.seasons;
    }

    public final TraktHistoryShow copy(String title, Integer year, TraktIds ids, List<TraktHistorySeason> seasons) {
        return new TraktHistoryShow(title, year, ids, seasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktHistoryShow)) {
            return false;
        }
        TraktHistoryShow traktHistoryShow = (TraktHistoryShow) other;
        return Intrinsics.areEqual(this.title, traktHistoryShow.title) && Intrinsics.areEqual(this.year, traktHistoryShow.year) && Intrinsics.areEqual(this.ids, traktHistoryShow.ids) && Intrinsics.areEqual(this.seasons, traktHistoryShow.seasons);
    }


    public final List<TraktHistorySeason> getSeasons() {
        return this.seasons;
    }



    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.year;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        int iHashCode3 = (iHashCode2 + (traktIds == null ? 0 : traktIds.hashCode())) * 31;
        List<TraktHistorySeason> list = this.seasons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TraktHistoryShow(title=" + this.title + ", year=" + this.year + ", ids=" + this.ids + ", seasons=" + this.seasons + ")";
    }

    public TraktHistoryShow(String str, Integer num, TraktIds traktIds, List<TraktHistorySeason> list) {
        this.title = str;
        this.year = num;
        this.ids = traktIds;
        this.seasons = list;
    }

    public TraktHistoryShow() {
        this(null, null, null, null, 15, null);
    }
}

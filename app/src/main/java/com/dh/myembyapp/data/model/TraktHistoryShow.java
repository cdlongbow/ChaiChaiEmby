package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktHistoryShow;", "", DlnaConstants.EXTRA_TITLE, "", "year", "", "ids", "Lcom/dh/myembyapp/data/model/TraktIds;", "seasons", "", "Lcom/dh/myembyapp/data/model/TraktHistorySeason;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIds", "()Lcom/dh/myembyapp/data/model/TraktIds;", "getSeasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/util/List;)Lcom/dh/myembyapp/data/model/TraktHistoryShow;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktHistoryShow {
    public static final int $stable = 8;

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

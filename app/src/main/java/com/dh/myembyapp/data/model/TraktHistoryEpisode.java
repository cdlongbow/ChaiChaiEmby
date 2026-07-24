package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktHistoryEpisode {
    

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName("number")
    private final Integer number;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    @SerializedName("watched_at")
    private final String watchedAt;

    public /* synthetic */ TraktHistoryEpisode(Integer num, String str, TraktIds traktIds, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : traktIds, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ TraktHistoryEpisode copy$default(TraktHistoryEpisode traktHistoryEpisode, Integer num, String str, TraktIds traktIds, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktHistoryEpisode.number;
        }
        if ((i & 2) != 0) {
            str = traktHistoryEpisode.title;
        }
        if ((i & 4) != 0) {
            traktIds = traktHistoryEpisode.ids;
        }
        if ((i & 8) != 0) {
            str2 = traktHistoryEpisode.watchedAt;
        }
        return traktHistoryEpisode.copy(num, str, traktIds, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktHistoryEpisode copy(Integer number, String title, TraktIds ids, String watchedAt) {
        return new TraktHistoryEpisode(number, title, ids, watchedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktHistoryEpisode)) {
            return false;
        }
        TraktHistoryEpisode traktHistoryEpisode = (TraktHistoryEpisode) other;
        return Intrinsics.areEqual(this.number, traktHistoryEpisode.number) && Intrinsics.areEqual(this.title, traktHistoryEpisode.title) && Intrinsics.areEqual(this.ids, traktHistoryEpisode.ids) && Intrinsics.areEqual(this.watchedAt, traktHistoryEpisode.watchedAt);
    }





    public int hashCode() {
        Integer num = this.number;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        int iHashCode3 = (iHashCode2 + (traktIds == null ? 0 : traktIds.hashCode())) * 31;
        String str2 = this.watchedAt;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TraktHistoryEpisode(number=" + this.number + ", title=" + this.title + ", ids=" + this.ids + ", watchedAt=" + this.watchedAt + ")";
    }

    public TraktHistoryEpisode(Integer num, String str, TraktIds traktIds, String str2) {
        this.number = num;
        this.title = str;
        this.ids = traktIds;
        this.watchedAt = str2;
    }

    public TraktHistoryEpisode() {
        this(null, null, null, null, 15, null);
    }
}

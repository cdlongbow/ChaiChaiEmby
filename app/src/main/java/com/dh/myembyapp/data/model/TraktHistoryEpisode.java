package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktHistoryEpisode;", "", "number", "", DlnaConstants.EXTRA_TITLE, "", "ids", "Lcom/dh/myembyapp/data/model/TraktIds;", "watchedAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getIds", "()Lcom/dh/myembyapp/data/model/TraktIds;", "getWatchedAt", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktIds;Ljava/lang/String;)Lcom/dh/myembyapp/data/model/TraktHistoryEpisode;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktHistoryEpisode {
    public static final int $stable = 0;

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

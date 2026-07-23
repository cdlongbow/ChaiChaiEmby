package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktEpisode;", "", "season", "", "number", DlnaConstants.EXTRA_TITLE, "", "ids", "Lcom/dh/myembyapp/data/model/TraktIds;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktIds;)V", "getSeason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumber", "getTitle", "()Ljava/lang/String;", "getIds", "()Lcom/dh/myembyapp/data/model/TraktIds;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktIds;)Lcom/dh/myembyapp/data/model/TraktEpisode;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktEpisode {
    public static final int $stable = 0;

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName("number")
    private final Integer number;

    @SerializedName("season")
    private final Integer season;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    public /* synthetic */ TraktEpisode(Integer num, Integer num2, String str, TraktIds traktIds, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : traktIds);
    }

    public static /* synthetic */ TraktEpisode copy$default(TraktEpisode traktEpisode, Integer num, Integer num2, String str, TraktIds traktIds, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktEpisode.season;
        }
        if ((i & 2) != 0) {
            num2 = traktEpisode.number;
        }
        if ((i & 4) != 0) {
            str = traktEpisode.title;
        }
        if ((i & 8) != 0) {
            traktIds = traktEpisode.ids;
        }
        return traktEpisode.copy(num, num2, str, traktIds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktEpisode copy(Integer season, Integer number, String title, TraktIds ids) {
        return new TraktEpisode(season, number, title, ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktEpisode)) {
            return false;
        }
        TraktEpisode traktEpisode = (TraktEpisode) other;
        return Intrinsics.areEqual(this.season, traktEpisode.season) && Intrinsics.areEqual(this.number, traktEpisode.number) && Intrinsics.areEqual(this.title, traktEpisode.title) && Intrinsics.areEqual(this.ids, traktEpisode.ids);
    }





    public int hashCode() {
        Integer num = this.season;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.number;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        return iHashCode3 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public String toString() {
        return "TraktEpisode(season=" + this.season + ", number=" + this.number + ", title=" + this.title + ", ids=" + this.ids + ")";
    }

    public TraktEpisode(Integer num, Integer num2, String str, TraktIds traktIds) {
        this.season = num;
        this.number = num2;
        this.title = str;
        this.ids = traktIds;
    }

    public TraktEpisode() {
        this(null, null, null, null, 15, null);
    }
}

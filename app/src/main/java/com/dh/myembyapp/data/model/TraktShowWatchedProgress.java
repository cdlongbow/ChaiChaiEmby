package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktShowWatchedProgress;", "", "aired", "", "completed", "lastWatchedAt", "", "seasons", "", "Lcom/dh/myembyapp/data/model/TraktWatchedSeason;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getAired", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompleted", "getLastWatchedAt", "()Ljava/lang/String;", "getSeasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/dh/myembyapp/data/model/TraktShowWatchedProgress;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktShowWatchedProgress {
    public static final int $stable = 8;

    @SerializedName("aired")
    private final Integer aired;

    @SerializedName("completed")
    private final Integer completed;

    @SerializedName("last_watched_at")
    private final String lastWatchedAt;

    @SerializedName("seasons")
    private final List<TraktWatchedSeason> seasons;

    public /* synthetic */ TraktShowWatchedProgress(Integer num, Integer num2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktShowWatchedProgress copy$default(TraktShowWatchedProgress traktShowWatchedProgress, Integer num, Integer num2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktShowWatchedProgress.aired;
        }
        if ((i & 2) != 0) {
            num2 = traktShowWatchedProgress.completed;
        }
        if ((i & 4) != 0) {
            str = traktShowWatchedProgress.lastWatchedAt;
        }
        if ((i & 8) != 0) {
            list = traktShowWatchedProgress.seasons;
        }
        return traktShowWatchedProgress.copy(num, num2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<TraktWatchedSeason> component4() {
        return this.seasons;
    }

    public final TraktShowWatchedProgress copy(Integer aired, Integer completed, String lastWatchedAt, List<TraktWatchedSeason> seasons) {
        return new TraktShowWatchedProgress(aired, completed, lastWatchedAt, seasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktShowWatchedProgress)) {
            return false;
        }
        TraktShowWatchedProgress traktShowWatchedProgress = (TraktShowWatchedProgress) other;
        return Intrinsics.areEqual(this.aired, traktShowWatchedProgress.aired) && Intrinsics.areEqual(this.completed, traktShowWatchedProgress.completed) && Intrinsics.areEqual(this.lastWatchedAt, traktShowWatchedProgress.lastWatchedAt) && Intrinsics.areEqual(this.seasons, traktShowWatchedProgress.seasons);
    }




    public final List<TraktWatchedSeason> getSeasons() {
        return this.seasons;
    }

    public int hashCode() {
        Integer num = this.aired;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.completed;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.lastWatchedAt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TraktWatchedSeason> list = this.seasons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TraktShowWatchedProgress(aired=" + this.aired + ", completed=" + this.completed + ", lastWatchedAt=" + this.lastWatchedAt + ", seasons=" + this.seasons + ")";
    }

    public TraktShowWatchedProgress(Integer num, Integer num2, String str, List<TraktWatchedSeason> list) {
        this.aired = num;
        this.completed = num2;
        this.lastWatchedAt = str;
        this.seasons = list;
    }

    public TraktShowWatchedProgress() {
        this(null, null, null, null, 15, null);
    }
}

package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JD\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktWatchedSeason;", "", "number", "", "aired", "completed", "episodes", "", "Lcom/dh/myembyapp/data/model/TraktWatchedEpisode;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAired", "getCompleted", "getEpisodes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/dh/myembyapp/data/model/TraktWatchedSeason;", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktWatchedSeason {
    public static final int $stable = 8;

    @SerializedName("aired")
    private final Integer aired;

    @SerializedName("completed")
    private final Integer completed;

    @SerializedName("episodes")
    private final List<TraktWatchedEpisode> episodes;

    @SerializedName("number")
    private final Integer number;

    public /* synthetic */ TraktWatchedSeason(Integer num, Integer num2, Integer num3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TraktWatchedSeason copy$default(TraktWatchedSeason traktWatchedSeason, Integer num, Integer num2, Integer num3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktWatchedSeason.number;
        }
        if ((i & 2) != 0) {
            num2 = traktWatchedSeason.aired;
        }
        if ((i & 4) != 0) {
            num3 = traktWatchedSeason.completed;
        }
        if ((i & 8) != 0) {
            list = traktWatchedSeason.episodes;
        }
        return traktWatchedSeason.copy(num, num2, num3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<TraktWatchedEpisode> component4() {
        return this.episodes;
    }

    public final TraktWatchedSeason copy(Integer number, Integer aired, Integer completed, List<TraktWatchedEpisode> episodes) {
        return new TraktWatchedSeason(number, aired, completed, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktWatchedSeason)) {
            return false;
        }
        TraktWatchedSeason traktWatchedSeason = (TraktWatchedSeason) other;
        return Intrinsics.areEqual(this.number, traktWatchedSeason.number) && Intrinsics.areEqual(this.aired, traktWatchedSeason.aired) && Intrinsics.areEqual(this.completed, traktWatchedSeason.completed) && Intrinsics.areEqual(this.episodes, traktWatchedSeason.episodes);
    }



    public final List<TraktWatchedEpisode> getEpisodes() {
        return this.episodes;
    }


    public int hashCode() {
        Integer num = this.number;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.aired;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.completed;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<TraktWatchedEpisode> list = this.episodes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TraktWatchedSeason(number=" + this.number + ", aired=" + this.aired + ", completed=" + this.completed + ", episodes=" + this.episodes + ")";
    }

    public TraktWatchedSeason(Integer num, Integer num2, Integer num3, List<TraktWatchedEpisode> list) {
        this.number = num;
        this.aired = num2;
        this.completed = num3;
        this.episodes = list;
    }

    public TraktWatchedSeason() {
        this(null, null, null, null, 15, null);
    }
}

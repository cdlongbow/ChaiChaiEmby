package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktWatchedEpisode;", "", "number", "", "completed", "", "lastWatchedAt", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastWatchedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/dh/myembyapp/data/model/TraktWatchedEpisode;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktWatchedEpisode {
    public static final int $stable = 0;

    @SerializedName("completed")
    private final Boolean completed;

    @SerializedName("last_watched_at")
    private final String lastWatchedAt;

    @SerializedName("number")
    private final Integer number;

    public /* synthetic */ TraktWatchedEpisode(Integer num, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }

    public static /* synthetic */ TraktWatchedEpisode copy$default(TraktWatchedEpisode traktWatchedEpisode, Integer num, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = traktWatchedEpisode.number;
        }
        if ((i & 2) != 0) {
            bool = traktWatchedEpisode.completed;
        }
        if ((i & 4) != 0) {
            str = traktWatchedEpisode.lastWatchedAt;
        }
        return traktWatchedEpisode.copy(num, bool, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktWatchedEpisode copy(Integer number, Boolean completed, String lastWatchedAt) {
        return new TraktWatchedEpisode(number, completed, lastWatchedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktWatchedEpisode)) {
            return false;
        }
        TraktWatchedEpisode traktWatchedEpisode = (TraktWatchedEpisode) other;
        return Intrinsics.areEqual(this.number, traktWatchedEpisode.number) && Intrinsics.areEqual(this.completed, traktWatchedEpisode.completed) && Intrinsics.areEqual(this.lastWatchedAt, traktWatchedEpisode.lastWatchedAt);
    }




    public int hashCode() {
        Integer num = this.number;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.completed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.lastWatchedAt;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.number;
        Boolean bool = this.completed;
        String str = this.lastWatchedAt;
        StringBuilder sb = new StringBuilder("TraktWatchedEpisode(number=");
        sb.append(num);
        sb.append(", completed=");
        sb.append(bool);
        sb.append(", lastWatchedAt=");
        return s01.w(sb, str, ")");
    }

    public TraktWatchedEpisode(Integer num, Boolean bool, String str) {
        this.number = num;
        this.completed = bool;
        this.lastWatchedAt = str;
    }

    public TraktWatchedEpisode() {
        this(null, null, null, 7, null);
    }
}

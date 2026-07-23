package com.dh.myembyapp.data.model;

import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuSeason;", "", "id", "", "airDate", "name", "episodeCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getAirDate", "getName", "getEpisodeCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuSeason {
    public static final int $stable = 0;
    private final String airDate;
    private final int episodeCount;
    private final String id;
    private final String name;

    public /* synthetic */ DanmakuSeason(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i);
    }

    public static /* synthetic */ DanmakuSeason copy$default(DanmakuSeason danmakuSeason, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = danmakuSeason.id;
        }
        if ((i2 & 2) != 0) {
            str2 = danmakuSeason.airDate;
        }
        if ((i2 & 4) != 0) {
            str3 = danmakuSeason.name;
        }
        if ((i2 & 8) != 0) {
            i = danmakuSeason.episodeCount;
        }
        return danmakuSeason.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final DanmakuSeason copy(String id, String airDate, String name, int episodeCount) {
        id.getClass();
        return new DanmakuSeason(id, airDate, name, episodeCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuSeason)) {
            return false;
        }
        DanmakuSeason danmakuSeason = (DanmakuSeason) other;
        return Intrinsics.areEqual(this.id, danmakuSeason.id) && Intrinsics.areEqual(this.airDate, danmakuSeason.airDate) && Intrinsics.areEqual(this.name, danmakuSeason.name) && this.episodeCount == danmakuSeason.episodeCount;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.airDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.episodeCount;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.airDate;
        String str3 = this.name;
        int i = this.episodeCount;
        StringBuilder sbZ = kb0.z("DanmakuSeason(id=", str, ", airDate=", str2, ", name=");
        sbZ.append(str3);
        sbZ.append(", episodeCount=");
        sbZ.append(i);
        sbZ.append(")");
        return sbZ.toString();
    }

    public DanmakuSeason(String str, String str2, String str3, int i) {
        str.getClass();
        this.id = str;
        this.airDate = str2;
        this.name = str3;
        this.episodeCount = i;
    }
}

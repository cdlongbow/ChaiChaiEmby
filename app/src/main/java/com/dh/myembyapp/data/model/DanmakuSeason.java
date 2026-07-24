package com.dh.myembyapp.data.model;

import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuSeason {
    
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

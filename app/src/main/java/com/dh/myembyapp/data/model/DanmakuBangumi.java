package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.qi0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuBangumi {
    
    private final int airDay;
    private final int animeId;
    private final String animeTitle;
    private final String bangumiId;
    private final List<DanmakuEpisode> episodes;
    private final String imageUrl;
    private final boolean isFavorited;
    private final boolean isOnAir;
    private final float rating;
    private final List<DanmakuSeason> seasons;
    private final String type;
    private final String typeDescription;

    public /* synthetic */ DanmakuBangumi(int i, String str, String str2, String str3, boolean z, int i2, boolean z2, float f, String str4, String str5, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? 0.0f : f, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuBangumi copy$default(DanmakuBangumi danmakuBangumi, int i, String str, String str2, String str3, boolean z, int i2, boolean z2, float f, String str4, String str5, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = danmakuBangumi.animeId;
        }
        if ((i3 & 2) != 0) {
            str = danmakuBangumi.bangumiId;
        }
        if ((i3 & 4) != 0) {
            str2 = danmakuBangumi.animeTitle;
        }
        if ((i3 & 8) != 0) {
            str3 = danmakuBangumi.imageUrl;
        }
        if ((i3 & 16) != 0) {
            z = danmakuBangumi.isOnAir;
        }
        if ((i3 & 32) != 0) {
            i2 = danmakuBangumi.airDay;
        }
        if ((i3 & 64) != 0) {
            z2 = danmakuBangumi.isFavorited;
        }
        if ((i3 & 128) != 0) {
            f = danmakuBangumi.rating;
        }
        if ((i3 & 256) != 0) {
            str4 = danmakuBangumi.type;
        }
        if ((i3 & 512) != 0) {
            str5 = danmakuBangumi.typeDescription;
        }
        if ((i3 & 1024) != 0) {
            list = danmakuBangumi.seasons;
        }
        if ((i3 & 2048) != 0) {
            list2 = danmakuBangumi.episodes;
        }
        List list3 = list;
        List list4 = list2;
        String str6 = str4;
        String str7 = str5;
        boolean z3 = z2;
        float f2 = f;
        boolean z4 = z;
        int i4 = i2;
        return danmakuBangumi.copy(i, str, str2, str3, z4, i4, z3, f2, str6, str7, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    public final List<DanmakuSeason> component11() {
        return this.seasons;
    }

    public final List<DanmakuEpisode> component12() {
        return this.episodes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final DanmakuBangumi copy(int animeId, String bangumiId, String animeTitle, String imageUrl, boolean isOnAir, int airDay, boolean isFavorited, float rating, String type, String typeDescription, List<DanmakuSeason> seasons, List<DanmakuEpisode> episodes) {
        animeTitle.getClass();
        return new DanmakuBangumi(animeId, bangumiId, animeTitle, imageUrl, isOnAir, airDay, isFavorited, rating, type, typeDescription, seasons, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuBangumi)) {
            return false;
        }
        DanmakuBangumi danmakuBangumi = (DanmakuBangumi) other;
        return this.animeId == danmakuBangumi.animeId && Intrinsics.areEqual(this.bangumiId, danmakuBangumi.bangumiId) && Intrinsics.areEqual(this.animeTitle, danmakuBangumi.animeTitle) && Intrinsics.areEqual(this.imageUrl, danmakuBangumi.imageUrl) && this.isOnAir == danmakuBangumi.isOnAir && this.airDay == danmakuBangumi.airDay && this.isFavorited == danmakuBangumi.isFavorited && Float.compare(this.rating, danmakuBangumi.rating) == 0 && Intrinsics.areEqual(this.type, danmakuBangumi.type) && Intrinsics.areEqual(this.typeDescription, danmakuBangumi.typeDescription) && Intrinsics.areEqual(this.seasons, danmakuBangumi.seasons) && Intrinsics.areEqual(this.episodes, danmakuBangumi.episodes);
    }

    public int hashCode() {
        int i = this.animeId * 31;
        String str = this.bangumiId;
        int i2 = i02.i((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.animeTitle);
        String str2 = this.imageUrl;
        int iE = qi0.e(this.rating, (((((((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.isOnAir ? 1231 : 1237)) * 31) + this.airDay) * 31) + (this.isFavorited ? 1231 : 1237)) * 31, 31);
        String str3 = this.type;
        int iHashCode = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typeDescription;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DanmakuSeason> list = this.seasons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DanmakuEpisode> list2 = this.episodes;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }



    public String toString() {
        int i = this.animeId;
        String str = this.bangumiId;
        String str2 = this.animeTitle;
        String str3 = this.imageUrl;
        boolean z = this.isOnAir;
        int i2 = this.airDay;
        boolean z2 = this.isFavorited;
        float f = this.rating;
        String str4 = this.type;
        String str5 = this.typeDescription;
        List<DanmakuSeason> list = this.seasons;
        List<DanmakuEpisode> list2 = this.episodes;
        StringBuilder sb = new StringBuilder("DanmakuBangumi(animeId=");
        sb.append(i);
        sb.append(", bangumiId=");
        sb.append(str);
        sb.append(", animeTitle=");
        i02.v(sb, str2, ", imageUrl=", str3, ", isOnAir=");
        sb.append(z);
        sb.append(", airDay=");
        sb.append(i2);
        sb.append(", isFavorited=");
        sb.append(z2);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", type=");
        i02.v(sb, str4, ", typeDescription=", str5, ", seasons=");
        sb.append(list);
        sb.append(", episodes=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public DanmakuBangumi(int i, String str, String str2, String str3, boolean z, int i2, boolean z2, float f, String str4, String str5, List<DanmakuSeason> list, List<DanmakuEpisode> list2) {
        str2.getClass();
        this.animeId = i;
        this.bangumiId = str;
        this.animeTitle = str2;
        this.imageUrl = str3;
        this.isOnAir = z;
        this.airDay = i2;
        this.isFavorited = z2;
        this.rating = f;
        this.type = str4;
        this.typeDescription = str5;
        this.seasons = list;
        this.episodes = list2;
    }
}

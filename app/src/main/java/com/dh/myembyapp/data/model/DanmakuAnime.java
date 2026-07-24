package com.dh.myembyapp.data.model;

import defpackage.i02;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuAnime {
    
    private final int animeId;
    private final String animeTitle;
    private final List<DanmakuEpisode> episodes;
    private final String type;
    private final String typeDescription;

    public /* synthetic */ DanmakuAnime(int i, String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuAnime copy$default(DanmakuAnime danmakuAnime, int i, String str, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = danmakuAnime.animeId;
        }
        if ((i2 & 2) != 0) {
            str = danmakuAnime.animeTitle;
        }
        if ((i2 & 4) != 0) {
            str2 = danmakuAnime.type;
        }
        if ((i2 & 8) != 0) {
            str3 = danmakuAnime.typeDescription;
        }
        if ((i2 & 16) != 0) {
            list = danmakuAnime.episodes;
        }
        List list2 = list;
        String str4 = str2;
        return danmakuAnime.copy(i, str, str4, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final List<DanmakuEpisode> component5() {
        return this.episodes;
    }

    public final DanmakuAnime copy(int animeId, String animeTitle, String type, String typeDescription, List<DanmakuEpisode> episodes) {
        animeTitle.getClass();
        return new DanmakuAnime(animeId, animeTitle, type, typeDescription, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuAnime)) {
            return false;
        }
        DanmakuAnime danmakuAnime = (DanmakuAnime) other;
        return this.animeId == danmakuAnime.animeId && Intrinsics.areEqual(this.animeTitle, danmakuAnime.animeTitle) && Intrinsics.areEqual(this.type, danmakuAnime.type) && Intrinsics.areEqual(this.typeDescription, danmakuAnime.typeDescription) && Intrinsics.areEqual(this.episodes, danmakuAnime.episodes);
    }

    public int hashCode() {
        int i = i02.i(this.animeId * 31, 31, this.animeTitle);
        String str = this.type;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.typeDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DanmakuEpisode> list = this.episodes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.animeId;
        String str = this.animeTitle;
        String str2 = this.type;
        String str3 = this.typeDescription;
        List<DanmakuEpisode> list = this.episodes;
        StringBuilder sb = new StringBuilder("DanmakuAnime(animeId=");
        sb.append(i);
        sb.append(", animeTitle=");
        sb.append(str);
        sb.append(", type=");
        i02.v(sb, str2, ", typeDescription=", str3, ", episodes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public DanmakuAnime(int i, String str, String str2, String str3, List<DanmakuEpisode> list) {
        str.getClass();
        this.animeId = i;
        this.animeTitle = str;
        this.type = str2;
        this.typeDescription = str3;
        this.episodes = list;
    }
}

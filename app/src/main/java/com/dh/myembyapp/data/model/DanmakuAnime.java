package com.dh.myembyapp.data.model;

import defpackage.i02;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuAnime;", "", "animeId", "", "animeTitle", "", "type", "typeDescription", "episodes", "", "Lcom/dh/myembyapp/data/model/DanmakuEpisode;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAnimeId", "()I", "getAnimeTitle", "()Ljava/lang/String;", "getType", "getTypeDescription", "getEpisodes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuAnime {
    public static final int $stable = 8;
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

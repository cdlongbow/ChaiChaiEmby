package com.dh.myembyapp.data.model;

import defpackage.i02;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006("}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuMatch;", "", "episodeId", "", "animeId", "animeTitle", "", "episodeTitle", "type", "typeDescription", "shift", "", "imageUrl", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getEpisodeId", "()J", "getAnimeId", "getAnimeTitle", "()Ljava/lang/String;", "getEpisodeTitle", "getType", "getTypeDescription", "getShift", "()I", "getImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuMatch {
    public static final int $stable = 0;
    private final long animeId;
    private final String animeTitle;
    private final long episodeId;
    private final String episodeTitle;
    private final String imageUrl;
    private final int shift;
    private final String type;
    private final String typeDescription;

    public /* synthetic */ DanmakuMatch(long j, long j2, String str, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, str2, str3, str4, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : str5);
    }

    public static /* synthetic */ DanmakuMatch copy$default(DanmakuMatch danmakuMatch, long j, long j2, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = danmakuMatch.episodeId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = danmakuMatch.animeId;
        }
        return danmakuMatch.copy(j3, j2, (i2 & 4) != 0 ? danmakuMatch.animeTitle : str, (i2 & 8) != 0 ? danmakuMatch.episodeTitle : str2, (i2 & 16) != 0 ? danmakuMatch.type : str3, (i2 & 32) != 0 ? danmakuMatch.typeDescription : str4, (i2 & 64) != 0 ? danmakuMatch.shift : i, (i2 & 128) != 0 ? danmakuMatch.imageUrl : str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    public final DanmakuMatch copy(long episodeId, long animeId, String animeTitle, String episodeTitle, String type, String typeDescription, int shift, String imageUrl) {
        animeTitle.getClass();
        episodeTitle.getClass();
        type.getClass();
        typeDescription.getClass();
        return new DanmakuMatch(episodeId, animeId, animeTitle, episodeTitle, type, typeDescription, shift, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuMatch)) {
            return false;
        }
        DanmakuMatch danmakuMatch = (DanmakuMatch) other;
        return this.episodeId == danmakuMatch.episodeId && this.animeId == danmakuMatch.animeId && Intrinsics.areEqual(this.animeTitle, danmakuMatch.animeTitle) && Intrinsics.areEqual(this.episodeTitle, danmakuMatch.episodeTitle) && Intrinsics.areEqual(this.type, danmakuMatch.type) && Intrinsics.areEqual(this.typeDescription, danmakuMatch.typeDescription) && this.shift == danmakuMatch.shift && Intrinsics.areEqual(this.imageUrl, danmakuMatch.imageUrl);
}

    public int hashCode() {
        long j = this.episodeId;
        long j2 = this.animeId;
        int i = (i02.i(i02.i(i02.i(i02.i(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.animeTitle), 31, this.episodeTitle), 31, this.type), 31, this.typeDescription) + this.shift) * 31;
        String str = this.imageUrl;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.episodeId;
        long j2 = this.animeId;
        String str = this.animeTitle;
        String str2 = this.episodeTitle;
        String str3 = this.type;
        String str4 = this.typeDescription;
        int i = this.shift;
        String str5 = this.imageUrl;
        StringBuilder sbR = i02.r(j, "DanmakuMatch(episodeId=", ", animeId=");
        sbR.append(j2);
        sbR.append(", animeTitle=");
        sbR.append(str);
        i02.v(sbR, ", episodeTitle=", str2, ", type=", str3);
        sbR.append(", typeDescription=");
        sbR.append(str4);
        sbR.append(", shift=");
        sbR.append(i);
        sbR.append(", imageUrl=");
        sbR.append(str5);
        sbR.append(")");
        return sbR.toString();
    }

    public DanmakuMatch(long j, long j2, String str, String str2, String str3, String str4, int i, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.episodeId = j;
        this.animeId = j2;
        this.animeTitle = str;
        this.episodeTitle = str2;
        this.type = str3;
        this.typeDescription = str4;
        this.shift = i;
        this.imageUrl = str5;
    }
}

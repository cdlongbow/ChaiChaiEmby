package com.dh.myembyapp.data.model;

import defpackage.s01;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuSearchResponse {
    
    private final List<DanmakuAnime> animes;
    private final int errorCode;
    private final String errorMessage;
    private final boolean hasMore;
    private final boolean success;

    public /* synthetic */ DanmakuSearchResponse(List list, boolean z, boolean z2, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuSearchResponse copy$default(DanmakuSearchResponse danmakuSearchResponse, List list, boolean z, boolean z2, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = danmakuSearchResponse.animes;
        }
        if ((i2 & 2) != 0) {
            z = danmakuSearchResponse.hasMore;
        }
        if ((i2 & 4) != 0) {
            z2 = danmakuSearchResponse.success;
        }
        if ((i2 & 8) != 0) {
            i = danmakuSearchResponse.errorCode;
        }
        if ((i2 & 16) != 0) {
            str = danmakuSearchResponse.errorMessage;
        }
        String str2 = str;
        boolean z3 = z2;
        return danmakuSearchResponse.copy(list, z, z3, i, str2);
    }

    public final List<DanmakuAnime> component1() {
        return this.animes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final DanmakuSearchResponse copy(List<DanmakuAnime> animes, boolean hasMore, boolean success, int errorCode, String errorMessage) {
        return new DanmakuSearchResponse(animes, hasMore, success, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuSearchResponse)) {
            return false;
        }
        DanmakuSearchResponse danmakuSearchResponse = (DanmakuSearchResponse) other;
        return Intrinsics.areEqual(this.animes, danmakuSearchResponse.animes) && this.hasMore == danmakuSearchResponse.hasMore && this.success == danmakuSearchResponse.success && this.errorCode == danmakuSearchResponse.errorCode && Intrinsics.areEqual(this.errorMessage, danmakuSearchResponse.errorMessage);
    }

    public int hashCode() {
        List<DanmakuAnime> list = this.animes;
        int iHashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + (this.hasMore ? 1231 : 1237)) * 31) + (this.success ? 1231 : 1237)) * 31) + this.errorCode) * 31;
        String str = this.errorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<DanmakuAnime> list = this.animes;
        boolean z = this.hasMore;
        boolean z2 = this.success;
        int i = this.errorCode;
        String str = this.errorMessage;
        StringBuilder sb = new StringBuilder("DanmakuSearchResponse(animes=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", success=");
        sb.append(z2);
        sb.append(", errorCode=");
        sb.append(i);
        sb.append(", errorMessage=");
        return s01.w(sb, str, ")");
    }

    public DanmakuSearchResponse(List<DanmakuAnime> list, boolean z, boolean z2, int i, String str) {
        this.animes = list;
        this.hasMore = z;
        this.success = z2;
        this.errorCode = i;
        this.errorMessage = str;
    }

    public DanmakuSearchResponse() {
        this(null, false, false, 0, null, 31, null);
    }
}

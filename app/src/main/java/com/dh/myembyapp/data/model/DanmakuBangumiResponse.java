package com.dh.myembyapp.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuBangumiResponse {
    
    private final DanmakuBangumi bangumi;
    private final int errorCode;
    private final String errorMessage;
    private final boolean success;

    public /* synthetic */ DanmakuBangumiResponse(boolean z, int i, String str, DanmakuBangumi danmakuBangumi, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : danmakuBangumi);
    }

    public static /* synthetic */ DanmakuBangumiResponse copy$default(DanmakuBangumiResponse danmakuBangumiResponse, boolean z, int i, String str, DanmakuBangumi danmakuBangumi, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = danmakuBangumiResponse.success;
        }
        if ((i2 & 2) != 0) {
            i = danmakuBangumiResponse.errorCode;
        }
        if ((i2 & 4) != 0) {
            str = danmakuBangumiResponse.errorMessage;
        }
        if ((i2 & 8) != 0) {
            danmakuBangumi = danmakuBangumiResponse.bangumi;
        }
        return danmakuBangumiResponse.copy(z, i, str, danmakuBangumi);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final DanmakuBangumiResponse copy(boolean success, int errorCode, String errorMessage, DanmakuBangumi bangumi) {
        return new DanmakuBangumiResponse(success, errorCode, errorMessage, bangumi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuBangumiResponse)) {
            return false;
        }
        DanmakuBangumiResponse danmakuBangumiResponse = (DanmakuBangumiResponse) other;
        return this.success == danmakuBangumiResponse.success && this.errorCode == danmakuBangumiResponse.errorCode && Intrinsics.areEqual(this.errorMessage, danmakuBangumiResponse.errorMessage) && Intrinsics.areEqual(this.bangumi, danmakuBangumiResponse.bangumi);
    }

    public int hashCode() {
        int i = (((this.success ? 1231 : 1237) * 31) + this.errorCode) * 31;
        String str = this.errorMessage;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        DanmakuBangumi danmakuBangumi = this.bangumi;
        return iHashCode + (danmakuBangumi != null ? danmakuBangumi.hashCode() : 0);
    }

    public String toString() {
        return "DanmakuBangumiResponse(success=" + this.success + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", bangumi=" + this.bangumi + ")";
    }

    public DanmakuBangumiResponse(boolean z, int i, String str, DanmakuBangumi danmakuBangumi) {
        this.success = z;
        this.errorCode = i;
        this.errorMessage = str;
        this.bangumi = danmakuBangumi;
    }

    public DanmakuBangumiResponse() {
        this(false, 0, null, null, 15, null);
    }
}

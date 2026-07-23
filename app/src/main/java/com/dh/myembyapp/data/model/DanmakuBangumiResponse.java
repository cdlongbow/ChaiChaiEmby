package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuBangumiResponse;", "", "success", "", "errorCode", "", "errorMessage", "", "bangumi", "Lcom/dh/myembyapp/data/model/DanmakuBangumi;", "<init>", "(ZILjava/lang/String;Lcom/dh/myembyapp/data/model/DanmakuBangumi;)V", "getSuccess", "()Z", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getBangumi", "()Lcom/dh/myembyapp/data/model/DanmakuBangumi;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuBangumiResponse {
    public static final int $stable = 8;
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

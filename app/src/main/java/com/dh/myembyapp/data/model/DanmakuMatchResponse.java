package com.dh.myembyapp.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuMatchResponse {
    
    private final int errorCode;
    private final String errorMessage;
    private final boolean isMatched;
    private final List<DanmakuMatch> matches;
    private final boolean success;

    public /* synthetic */ DanmakuMatchResponse(boolean z, int i, String str, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : str, z2, (i2 & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuMatchResponse copy$default(DanmakuMatchResponse danmakuMatchResponse, boolean z, int i, String str, boolean z2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = danmakuMatchResponse.success;
        }
        if ((i2 & 2) != 0) {
            i = danmakuMatchResponse.errorCode;
        }
        if ((i2 & 4) != 0) {
            str = danmakuMatchResponse.errorMessage;
        }
        if ((i2 & 8) != 0) {
            z2 = danmakuMatchResponse.isMatched;
        }
        if ((i2 & 16) != 0) {
            list = danmakuMatchResponse.matches;
        }
        List list2 = list;
        String str2 = str;
        return danmakuMatchResponse.copy(z, i, str2, z2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final List<DanmakuMatch> component5() {
        return this.matches;
    }

    public final DanmakuMatchResponse copy(boolean success, int errorCode, String errorMessage, boolean isMatched, List<DanmakuMatch> matches) {
        return new DanmakuMatchResponse(success, errorCode, errorMessage, isMatched, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuMatchResponse)) {
            return false;
        }
        DanmakuMatchResponse danmakuMatchResponse = (DanmakuMatchResponse) other;
        return this.success == danmakuMatchResponse.success && this.errorCode == danmakuMatchResponse.errorCode && Intrinsics.areEqual(this.errorMessage, danmakuMatchResponse.errorMessage) && this.isMatched == danmakuMatchResponse.isMatched && Intrinsics.areEqual(this.matches, danmakuMatchResponse.matches);
    }

    public int hashCode() {
        int i = (((this.success ? 1231 : 1237) * 31) + this.errorCode) * 31;
        String str = this.errorMessage;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + (this.isMatched ? 1231 : 1237)) * 31;
        List<DanmakuMatch> list = this.matches;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }


    public String toString() {
        return "DanmakuMatchResponse(success=" + this.success + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", isMatched=" + this.isMatched + ", matches=" + this.matches + ")";
    }

    public DanmakuMatchResponse(boolean z, int i, String str, boolean z2, List<DanmakuMatch> list) {
        this.success = z;
        this.errorCode = i;
        this.errorMessage = str;
        this.isMatched = z2;
        this.matches = list;
    }
}

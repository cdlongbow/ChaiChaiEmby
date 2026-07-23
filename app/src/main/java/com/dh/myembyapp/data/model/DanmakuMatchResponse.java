package com.dh.myembyapp.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuMatchResponse;", "", "success", "", "errorCode", "", "errorMessage", "", "isMatched", "matches", "", "Lcom/dh/myembyapp/data/model/DanmakuMatch;", "<init>", "(ZILjava/lang/String;ZLjava/util/List;)V", "getSuccess", "()Z", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getMatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuMatchResponse {
    public static final int $stable = 8;
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

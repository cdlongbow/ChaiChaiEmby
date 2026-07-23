package com.dh.myembyapp.data.model;

import defpackage.s01;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\tHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u000bHÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuSearchResponse;", "", "animes", "", "Lcom/dh/myembyapp/data/model/DanmakuAnime;", "hasMore", "", "success", "errorCode", "", "errorMessage", "", "<init>", "(Ljava/util/List;ZZILjava/lang/String;)V", "getAnimes", "()Ljava/util/List;", "getHasMore", "()Z", "getSuccess", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuSearchResponse {
    public static final int $stable = 8;
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

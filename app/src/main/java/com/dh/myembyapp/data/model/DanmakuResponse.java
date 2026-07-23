package com.dh.myembyapp.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuResponse;", "", "count", "", "comments", "", "Lcom/dh/myembyapp/data/model/DanmakuComment;", "<init>", "(ILjava/util/List;)V", "getCount", "()I", "getComments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuResponse {
    public static final int $stable = 8;
    private final List<DanmakuComment> comments;
    private final int count;

    public /* synthetic */ DanmakuResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuResponse copy$default(DanmakuResponse danmakuResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = danmakuResponse.count;
        }
        if ((i2 & 2) != 0) {
            list = danmakuResponse.comments;
        }
        return danmakuResponse.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<DanmakuComment> component2() {
        return this.comments;
    }

    public final DanmakuResponse copy(int count, List<DanmakuComment> comments) {
        return new DanmakuResponse(count, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuResponse)) {
            return false;
        }
        DanmakuResponse danmakuResponse = (DanmakuResponse) other;
        return this.count == danmakuResponse.count && Intrinsics.areEqual(this.comments, danmakuResponse.comments);
    }

    public int hashCode() {
        int i = this.count * 31;
        List<DanmakuComment> list = this.comments;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DanmakuResponse(count=" + this.count + ", comments=" + this.comments + ")";
    }

    public DanmakuResponse(int i, List<DanmakuComment> list) {
        this.count = i;
        this.comments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DanmakuResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}

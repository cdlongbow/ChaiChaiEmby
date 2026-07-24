package com.dh.myembyapp.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuResponse {
    
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

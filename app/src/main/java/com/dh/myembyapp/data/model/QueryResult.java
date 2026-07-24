package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class QueryResult {
    

    @SerializedName("Items")
    private final List<MediaItem> items;

    @SerializedName("TotalRecordCount")
    private final int totalRecordCount;

    public QueryResult(List<MediaItem> list, int i) {
        list.getClass();
        this.items = list;
        this.totalRecordCount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryResult copy$default(QueryResult queryResult, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = queryResult.items;
        }
        if ((i2 & 2) != 0) {
            i = queryResult.totalRecordCount;
        }
        return queryResult.copy(list, i);
    }

    public final List<MediaItem> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final QueryResult copy(List<MediaItem> items, int totalRecordCount) {
        items.getClass();
        return new QueryResult(items, totalRecordCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryResult)) {
            return false;
        }
        QueryResult queryResult = (QueryResult) other;
        return Intrinsics.areEqual(this.items, queryResult.items) && this.totalRecordCount == queryResult.totalRecordCount;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.totalRecordCount;
    }

    public String toString() {
        return "QueryResult(items=" + this.items + ", totalRecordCount=" + this.totalRecordCount + ")";
    }
}

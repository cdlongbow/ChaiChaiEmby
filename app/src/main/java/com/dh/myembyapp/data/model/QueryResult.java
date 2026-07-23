package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/model/QueryResult;", "", "items", "", "Lcom/dh/myembyapp/data/model/MediaItem;", "totalRecordCount", "", "<init>", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getTotalRecordCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class QueryResult {
    public static final int $stable = 8;

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

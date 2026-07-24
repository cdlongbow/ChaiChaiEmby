package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class LibraryQueryResult {
    

    @SerializedName("Items")
    private final List<Library> items;

    @SerializedName("TotalRecordCount")
    private final int totalRecordCount;

    public LibraryQueryResult(List<Library> list, int i) {
        list.getClass();
        this.items = list;
        this.totalRecordCount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryQueryResult copy$default(LibraryQueryResult libraryQueryResult, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = libraryQueryResult.items;
        }
        if ((i2 & 2) != 0) {
            i = libraryQueryResult.totalRecordCount;
        }
        return libraryQueryResult.copy(list, i);
    }

    public final List<Library> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final LibraryQueryResult copy(List<Library> items, int totalRecordCount) {
        items.getClass();
        return new LibraryQueryResult(items, totalRecordCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LibraryQueryResult)) {
            return false;
        }
        LibraryQueryResult libraryQueryResult = (LibraryQueryResult) other;
        return Intrinsics.areEqual(this.items, libraryQueryResult.items) && this.totalRecordCount == libraryQueryResult.totalRecordCount;
    }

    public final List<Library> getItems() {
        return this.items;
    }


    public int hashCode() {
        return (this.items.hashCode() * 31) + this.totalRecordCount;
    }

    public String toString() {
        return "LibraryQueryResult(items=" + this.items + ", totalRecordCount=" + this.totalRecordCount + ")";
    }
}

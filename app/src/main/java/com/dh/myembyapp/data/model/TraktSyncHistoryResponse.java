package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktSyncHistoryResponse {
    

    @SerializedName("added")
    private final TraktSyncHistoryAdded added;

    @SerializedName("existing")
    private final TraktSyncHistoryAdded existing;

    @SerializedName("not_found")
    private final TraktSyncHistoryNotFound notFound;

    public /* synthetic */ TraktSyncHistoryResponse(TraktSyncHistoryAdded traktSyncHistoryAdded, TraktSyncHistoryAdded traktSyncHistoryAdded2, TraktSyncHistoryNotFound traktSyncHistoryNotFound, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : traktSyncHistoryAdded, (i & 2) != 0 ? null : traktSyncHistoryAdded2, (i & 4) != 0 ? null : traktSyncHistoryNotFound);
    }

    public static /* synthetic */ TraktSyncHistoryResponse copy$default(TraktSyncHistoryResponse traktSyncHistoryResponse, TraktSyncHistoryAdded traktSyncHistoryAdded, TraktSyncHistoryAdded traktSyncHistoryAdded2, TraktSyncHistoryNotFound traktSyncHistoryNotFound, int i, Object obj) {
        if ((i & 1) != 0) {
            traktSyncHistoryAdded = traktSyncHistoryResponse.added;
        }
        if ((i & 2) != 0) {
            traktSyncHistoryAdded2 = traktSyncHistoryResponse.existing;
        }
        if ((i & 4) != 0) {
            traktSyncHistoryNotFound = traktSyncHistoryResponse.notFound;
        }
        return traktSyncHistoryResponse.copy(traktSyncHistoryAdded, traktSyncHistoryAdded2, traktSyncHistoryNotFound);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktSyncHistoryResponse copy(TraktSyncHistoryAdded added, TraktSyncHistoryAdded existing, TraktSyncHistoryNotFound notFound) {
        return new TraktSyncHistoryResponse(added, existing, notFound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktSyncHistoryResponse)) {
            return false;
        }
        TraktSyncHistoryResponse traktSyncHistoryResponse = (TraktSyncHistoryResponse) other;
        return Intrinsics.areEqual(this.added, traktSyncHistoryResponse.added) && Intrinsics.areEqual(this.existing, traktSyncHistoryResponse.existing) && Intrinsics.areEqual(this.notFound, traktSyncHistoryResponse.notFound);
    }




    public int hashCode() {
        TraktSyncHistoryAdded traktSyncHistoryAdded = this.added;
        int iHashCode = (traktSyncHistoryAdded == null ? 0 : traktSyncHistoryAdded.hashCode()) * 31;
        TraktSyncHistoryAdded traktSyncHistoryAdded2 = this.existing;
        int iHashCode2 = (iHashCode + (traktSyncHistoryAdded2 == null ? 0 : traktSyncHistoryAdded2.hashCode())) * 31;
        TraktSyncHistoryNotFound traktSyncHistoryNotFound = this.notFound;
        return iHashCode2 + (traktSyncHistoryNotFound != null ? traktSyncHistoryNotFound.hashCode() : 0);
    }

    public String toString() {
        return "TraktSyncHistoryResponse(added=" + this.added + ", existing=" + this.existing + ", notFound=" + this.notFound + ")";
    }

    public TraktSyncHistoryResponse(TraktSyncHistoryAdded traktSyncHistoryAdded, TraktSyncHistoryAdded traktSyncHistoryAdded2, TraktSyncHistoryNotFound traktSyncHistoryNotFound) {
        this.added = traktSyncHistoryAdded;
        this.existing = traktSyncHistoryAdded2;
        this.notFound = traktSyncHistoryNotFound;
    }

    public TraktSyncHistoryResponse() {
        this(null, null, null, 7, null);
    }
}

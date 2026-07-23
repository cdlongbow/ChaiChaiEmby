package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktSyncHistoryResponse;", "", "added", "Lcom/dh/myembyapp/data/model/TraktSyncHistoryAdded;", "existing", "notFound", "Lcom/dh/myembyapp/data/model/TraktSyncHistoryNotFound;", "<init>", "(Lcom/dh/myembyapp/data/model/TraktSyncHistoryAdded;Lcom/dh/myembyapp/data/model/TraktSyncHistoryAdded;Lcom/dh/myembyapp/data/model/TraktSyncHistoryNotFound;)V", "getAdded", "()Lcom/dh/myembyapp/data/model/TraktSyncHistoryAdded;", "getExisting", "getNotFound", "()Lcom/dh/myembyapp/data/model/TraktSyncHistoryNotFound;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktSyncHistoryResponse {
    public static final int $stable = 8;

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

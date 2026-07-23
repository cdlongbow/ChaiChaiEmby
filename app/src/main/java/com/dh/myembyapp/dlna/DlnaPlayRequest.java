package com.dh.myembyapp.dlna;

import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaPlayRequest;", "", DlnaConstants.EXTRA_URI, "", DlnaConstants.EXTRA_TITLE, "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getTitle", "getMetadata", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DlnaPlayRequest {
    public static final int $stable = 0;
    private final String metadata;
    private final String title;
    private final String uri;

    public /* synthetic */ DlnaPlayRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ DlnaPlayRequest copy$default(DlnaPlayRequest dlnaPlayRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dlnaPlayRequest.uri;
        }
        if ((i & 2) != 0) {
            str2 = dlnaPlayRequest.title;
        }
        if ((i & 4) != 0) {
            str3 = dlnaPlayRequest.metadata;
        }
        return dlnaPlayRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final DlnaPlayRequest copy(String uri, String title, String metadata) {
        uri.getClass();
        return new DlnaPlayRequest(uri, title, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlnaPlayRequest)) {
            return false;
        }
        DlnaPlayRequest dlnaPlayRequest = (DlnaPlayRequest) other;
        return Intrinsics.areEqual(this.uri, dlnaPlayRequest.uri) && Intrinsics.areEqual(this.title, dlnaPlayRequest.title) && Intrinsics.areEqual(this.metadata, dlnaPlayRequest.metadata);
    }

    public int hashCode() {
        int iHashCode = this.uri.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metadata;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.title;
        return s01.w(kb0.z("DlnaPlayRequest(uri=", str, ", title=", str2, ", metadata="), this.metadata, ")");
    }

    public DlnaPlayRequest(String str, String str2, String str3) {
        str.getClass();
        this.uri = str;
        this.title = str2;
        this.metadata = str3;
    }
}

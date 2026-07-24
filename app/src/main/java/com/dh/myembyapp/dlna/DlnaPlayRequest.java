package com.dh.myembyapp.dlna;

import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DlnaPlayRequest {
    
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

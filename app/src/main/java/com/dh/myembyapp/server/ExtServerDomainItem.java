package com.dh.myembyapp.server;

import com.google.gson.annotations.SerializedName;
import defpackage.mr;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final  class ExtServerDomainItem {

    @SerializedName("name")
    private final String name;

    @SerializedName("url")
    private final String url;

    public /* synthetic */ ExtServerDomainItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ ExtServerDomainItem copy$default(ExtServerDomainItem extServerDomainItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extServerDomainItem.name;
        }
        if ((i & 2) != 0) {
            str2 = extServerDomainItem.url;
        }
        return extServerDomainItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final ExtServerDomainItem copy(String name, String url) {
        return new ExtServerDomainItem(name, url);
    }

    public boolean equals(Object other) {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return mr.s("ExtServerDomainItem(name=", this.name, ", url=", this.url, ")");
    }

    public ExtServerDomainItem(String str, String str2) {
        this.name = str;
        this.url = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtServerDomainItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

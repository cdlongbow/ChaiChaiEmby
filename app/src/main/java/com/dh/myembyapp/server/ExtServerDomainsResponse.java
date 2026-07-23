package com.dh.myembyapp.server;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/dh/myembyapp/server/ExtServerDomainsResponse;", "", "ok", "", "data", "", "Lcom/dh/myembyapp/server/ExtServerDomainItem;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getOk", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/dh/myembyapp/server/ExtServerDomainsResponse;", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class ExtServerDomainsResponse {

    @SerializedName("data")
    private final List<ExtServerDomainItem> data;

    @SerializedName("ok")
    private final Boolean ok;

    public /* synthetic */ ExtServerDomainsResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtServerDomainsResponse copy$default(ExtServerDomainsResponse extServerDomainsResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = extServerDomainsResponse.ok;
        }
        if ((i & 2) != 0) {
            list = extServerDomainsResponse.data;
        }
        return extServerDomainsResponse.copy(bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<ExtServerDomainItem> component2() {
        return this.data;
    }

    public final ExtServerDomainsResponse copy(Boolean ok, List<ExtServerDomainItem> data) {
        return new ExtServerDomainsResponse(ok, data);
    }

    public boolean equals(Object other) {
        Boolean bool = this.ok;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<ExtServerDomainItem> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExtServerDomainsResponse(ok=" + this.ok + ", data=" + this.data + ")";
    }

    public ExtServerDomainsResponse(Boolean bool, List<ExtServerDomainItem> list) {
        this.ok = bool;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtServerDomainsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

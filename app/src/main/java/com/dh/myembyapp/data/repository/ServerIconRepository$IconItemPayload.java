package com.dh.myembyapp.data.repository;

import com.google.gson.annotations.SerializedName;
import defpackage.mr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"com/dh/myembyapp/data/repository/ServerIconRepository$IconItemPayload", "", "", "name", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "Lcom/dh/myembyapp/data/repository/ServerIconRepository$IconItemPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/dh/myembyapp/data/repository/ServerIconRepository$IconItemPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getUrl", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class ServerIconRepository$IconItemPayload {

    @SerializedName("name")
    private final String name;

    @SerializedName("url")
    private final String url;

    public /* synthetic */ ServerIconRepository$IconItemPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ ServerIconRepository$IconItemPayload copy$default(ServerIconRepository$IconItemPayload serverIconRepository$IconItemPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverIconRepository$IconItemPayload.name;
        }
        if ((i & 2) != 0) {
            str2 = serverIconRepository$IconItemPayload.url;
        }
        return serverIconRepository$IconItemPayload.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final ServerIconRepository$IconItemPayload copy(String name, String url) {
        return new ServerIconRepository$IconItemPayload(name, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerIconRepository$IconItemPayload)) {
            return false;
        }
        ServerIconRepository$IconItemPayload serverIconRepository$IconItemPayload = (ServerIconRepository$IconItemPayload) other;
        return Intrinsics.areEqual(this.name, serverIconRepository$IconItemPayload.name) && Intrinsics.areEqual(this.url, serverIconRepository$IconItemPayload.url);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return mr.s("IconItemPayload(name=", this.name, ", url=", this.url, ")");
    }

    public ServerIconRepository$IconItemPayload(String str, String str2) {
        this.name = str;
        this.url = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServerIconRepository$IconItemPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

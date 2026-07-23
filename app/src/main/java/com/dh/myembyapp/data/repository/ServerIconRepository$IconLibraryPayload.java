package com.dh.myembyapp.data.repository;

import com.google.gson.annotations.SerializedName;
import defpackage.kb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"com/dh/myembyapp/data/repository/ServerIconRepository$IconLibraryPayload", "", "", "name", "description", "", "Lcom/dh/myembyapp/data/repository/ServerIconRepository$IconItemPayload;", "icons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "Lcom/dh/myembyapp/data/repository/ServerIconRepository$IconLibraryPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/dh/myembyapp/data/repository/ServerIconRepository$IconLibraryPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "Ljava/util/List;", "getIcons", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class ServerIconRepository$IconLibraryPayload {

    @SerializedName("description")
    private final String description;

    @SerializedName("icons")
    private final List<ServerIconRepository$IconItemPayload> icons;

    @SerializedName("name")
    private final String name;

    public /* synthetic */ ServerIconRepository$IconLibraryPayload(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerIconRepository$IconLibraryPayload copy$default(ServerIconRepository$IconLibraryPayload serverIconRepository$IconLibraryPayload, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverIconRepository$IconLibraryPayload.name;
        }
        if ((i & 2) != 0) {
            str2 = serverIconRepository$IconLibraryPayload.description;
        }
        if ((i & 4) != 0) {
            list = serverIconRepository$IconLibraryPayload.icons;
        }
        return serverIconRepository$IconLibraryPayload.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final List<ServerIconRepository$IconItemPayload> component3() {
        return this.icons;
    }

    public final ServerIconRepository$IconLibraryPayload copy(String name, String description, List<ServerIconRepository$IconItemPayload> icons) {
        return new ServerIconRepository$IconLibraryPayload(name, description, icons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerIconRepository$IconLibraryPayload)) {
            return false;
        }
        ServerIconRepository$IconLibraryPayload serverIconRepository$IconLibraryPayload = (ServerIconRepository$IconLibraryPayload) other;
        return Intrinsics.areEqual(this.name, serverIconRepository$IconLibraryPayload.name) && Intrinsics.areEqual(this.description, serverIconRepository$IconLibraryPayload.description) && Intrinsics.areEqual(this.icons, serverIconRepository$IconLibraryPayload.icons);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ServerIconRepository$IconItemPayload> list = this.icons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        List<ServerIconRepository$IconItemPayload> list = this.icons;
        StringBuilder sbZ = kb0.z("IconLibraryPayload(name=", str, ", description=", str2, ", icons=");
        sbZ.append(list);
        sbZ.append(")");
        return sbZ.toString();
    }

    public ServerIconRepository$IconLibraryPayload(String str, String str2, List<ServerIconRepository$IconItemPayload> list) {
        this.name = str;
        this.description = str2;
        this.icons = list;
    }

    public ServerIconRepository$IconLibraryPayload() {
        this(null, null, null, 7, null);
    }
}

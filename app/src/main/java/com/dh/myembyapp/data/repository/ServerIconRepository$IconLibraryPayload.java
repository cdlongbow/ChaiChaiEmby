package com.dh.myembyapp.data.repository;

import com.google.gson.annotations.SerializedName;
import defpackage.kb0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final  class ServerIconRepository$IconLibraryPayload {

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

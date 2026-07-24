package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.kb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class ServerIconLibrary {
    
    private final String description;
    private final List<ServerIconEntry> icons;
    private final String name;
    private final String sourceUrl;

    public ServerIconLibrary(String str, String str2, String str3, List<ServerIconEntry> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.sourceUrl = str;
        this.name = str2;
        this.description = str3;
        this.icons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerIconLibrary copy$default(ServerIconLibrary serverIconLibrary, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverIconLibrary.sourceUrl;
        }
        if ((i & 2) != 0) {
            str2 = serverIconLibrary.name;
        }
        if ((i & 4) != 0) {
            str3 = serverIconLibrary.description;
        }
        if ((i & 8) != 0) {
            list = serverIconLibrary.icons;
        }
        return serverIconLibrary.copy(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<ServerIconEntry> component4() {
        return this.icons;
    }

    public final ServerIconLibrary copy(String sourceUrl, String name, String description, List<ServerIconEntry> icons) {
        sourceUrl.getClass();
        name.getClass();
        description.getClass();
        icons.getClass();
        return new ServerIconLibrary(sourceUrl, name, description, icons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerIconLibrary)) {
            return false;
        }
        ServerIconLibrary serverIconLibrary = (ServerIconLibrary) other;
        return Intrinsics.areEqual(this.sourceUrl, serverIconLibrary.sourceUrl) && Intrinsics.areEqual(this.name, serverIconLibrary.name) && Intrinsics.areEqual(this.description, serverIconLibrary.description) && Intrinsics.areEqual(this.icons, serverIconLibrary.icons);
    }


    public final List<ServerIconEntry> getIcons() {
        return this.icons;
    }



    public int hashCode() {
        return this.icons.hashCode() + i02.i(i02.i(this.sourceUrl.hashCode() * 31, 31, this.name), 31, this.description);
    }

    public String toString() {
        String str = this.sourceUrl;
        String str2 = this.name;
        String str3 = this.description;
        List<ServerIconEntry> list = this.icons;
        StringBuilder sbZ = kb0.z("ServerIconLibrary(sourceUrl=", str, ", name=", str2, ", description=");
        sbZ.append(str3);
        sbZ.append(", icons=");
        sbZ.append(list);
        sbZ.append(")");
        return sbZ.toString();
    }
}

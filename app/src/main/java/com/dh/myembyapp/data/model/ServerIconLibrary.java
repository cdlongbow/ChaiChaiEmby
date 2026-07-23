package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.kb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/dh/myembyapp/data/model/ServerIconLibrary;", "", "sourceUrl", "", HintConstants.AUTOFILL_HINT_NAME, "description", "icons", "", "Lcom/dh/myembyapp/data/model/ServerIconEntry;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSourceUrl", "()Ljava/lang/String;", "getName", "getDescription", "getIcons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ServerIconLibrary {
    public static final int $stable = 8;
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

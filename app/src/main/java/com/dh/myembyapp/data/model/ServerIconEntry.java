package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class ServerIconEntry {
    
    private final String id;
    private final String name;
    private final String url;

    public ServerIconEntry(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.url = str3;
    }

    public static /* synthetic */ ServerIconEntry copy$default(ServerIconEntry serverIconEntry, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverIconEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = serverIconEntry.name;
        }
        if ((i & 4) != 0) {
            str3 = serverIconEntry.url;
        }
        return serverIconEntry.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final ServerIconEntry copy(String id, String name, String url) {
        id.getClass();
        name.getClass();
        url.getClass();
        return new ServerIconEntry(id, name, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerIconEntry)) {
            return false;
        }
        ServerIconEntry serverIconEntry = (ServerIconEntry) other;
        return Intrinsics.areEqual(this.id, serverIconEntry.id) && Intrinsics.areEqual(this.name, serverIconEntry.name) && Intrinsics.areEqual(this.url, serverIconEntry.url);
    }

    public int hashCode() {
        return this.url.hashCode() + i02.i(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return s01.w(kb0.z("ServerIconEntry(id=", str, ", name=", str2, ", url="), this.url, ")");
    }
}

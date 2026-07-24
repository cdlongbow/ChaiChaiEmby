package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final  class NormalizedServerEndpoint {
    private final String host;
    private final String path;
    private final int port;
    private final String protocol;

    public NormalizedServerEndpoint(String str, String str2, int i, String str3) {
        s01.D(str, str2, str3);
        this.protocol = str;
        this.host = str2;
        this.port = i;
        this.path = str3;
    }

    public static /* synthetic */ NormalizedServerEndpoint copy$default(NormalizedServerEndpoint normalizedServerEndpoint, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = normalizedServerEndpoint.protocol;
        }
        if ((i2 & 2) != 0) {
            str2 = normalizedServerEndpoint.host;
        }
        if ((i2 & 4) != 0) {
            i = normalizedServerEndpoint.port;
        }
        if ((i2 & 8) != 0) {
            str3 = normalizedServerEndpoint.path;
        }
        return normalizedServerEndpoint.copy(str, str2, i, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final NormalizedServerEndpoint copy(String protocol, String host, int port, String path) {
        protocol.getClass();
        host.getClass();
        path.getClass();
        return new NormalizedServerEndpoint(protocol, host, port, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NormalizedServerEndpoint)) {
            return false;
        }
        NormalizedServerEndpoint normalizedServerEndpoint = (NormalizedServerEndpoint) other;
        return Intrinsics.areEqual(this.protocol, normalizedServerEndpoint.protocol) && Intrinsics.areEqual(this.host, normalizedServerEndpoint.host) && this.port == normalizedServerEndpoint.port && Intrinsics.areEqual(this.path, normalizedServerEndpoint.path);
    }





    public int hashCode() {
        return this.path.hashCode() + ((i02.i(this.protocol.hashCode() * 31, 31, this.host) + this.port) * 31);
    }

    public String toString() {
        String str = this.protocol;
        String str2 = this.host;
        int i = this.port;
        String str3 = this.path;
        StringBuilder sbZ = kb0.z("NormalizedServerEndpoint(protocol=", str, ", host=", str2, ", port=");
        sbZ.append(i);
        sbZ.append(", path=");
        sbZ.append(str3);
        sbZ.append(")");
        return sbZ.toString();
    }
}

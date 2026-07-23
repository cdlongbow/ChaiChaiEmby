package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/model/NormalizedServerEndpoint;", "", "protocol", "", "host", "port", "", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getProtocol", "()Ljava/lang/String;", "getHost", "getPort", "()I", "getPath", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class NormalizedServerEndpoint {
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

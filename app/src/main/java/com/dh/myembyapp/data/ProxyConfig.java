package com.dh.myembyapp.data;

import defpackage.i02;
import defpackage.i9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\tHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010¨\u0006("}, d2 = {"Lcom/dh/myembyapp/data/ProxyConfig;", "", "enabled", "", "protocol", "Lcom/dh/myembyapp/data/ProxyProtocol;", "host", "", "port", "", "username", "password", "bypassLan", "<init>", "(ZLcom/dh/myembyapp/data/ProxyProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getEnabled", "()Z", "getProtocol", "()Lcom/dh/myembyapp/data/ProxyProtocol;", "getHost", "()Ljava/lang/String;", "getPort", "()I", "getUsername", "getPassword", "getBypassLan", "hasCredentials", "getHasCredentials", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProxyConfig {
    public static final int $stable = 0;
    private final boolean bypassLan;
    private final boolean enabled;
    private final String host;
    private final String password;
    private final int port;
    private final ProxyProtocol protocol;
    private final String username;

    public /* synthetic */ ProxyConfig(boolean z, ProxyProtocol proxyProtocol, String str, int i, String str2, String str3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? ProxyProtocol.HTTP : proxyProtocol, (i2 & 4) != 0 ? "192.168.5.235" : str, (i2 & 8) != 0 ? 7890 : i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? true : z2);
    }

    public static /* synthetic */ ProxyConfig copy$default(ProxyConfig proxyConfig, boolean z, ProxyProtocol proxyProtocol, String str, int i, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = proxyConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            proxyProtocol = proxyConfig.protocol;
        }
        if ((i2 & 4) != 0) {
            str = proxyConfig.host;
        }
        if ((i2 & 8) != 0) {
            i = proxyConfig.port;
        }
        if ((i2 & 16) != 0) {
            str2 = proxyConfig.username;
        }
        if ((i2 & 32) != 0) {
            str3 = proxyConfig.password;
        }
        if ((i2 & 64) != 0) {
            z2 = proxyConfig.bypassLan;
        }
        String str4 = str3;
        boolean z3 = z2;
        String str5 = str2;
        String str6 = str;
        return proxyConfig.copy(z, proxyProtocol, str6, i, str5, str4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final ProxyConfig copy(boolean enabled, ProxyProtocol protocol, String host, int port, String username, String password, boolean bypassLan) {
        protocol.getClass();
        host.getClass();
        username.getClass();
        password.getClass();
        return new ProxyConfig(enabled, protocol, host, port, username, password, bypassLan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProxyConfig)) {
            return false;
        }
        ProxyConfig proxyConfig = (ProxyConfig) other;
        return this.enabled == proxyConfig.enabled && this.protocol == proxyConfig.protocol && Intrinsics.areEqual(this.host, proxyConfig.host) && this.port == proxyConfig.port && Intrinsics.areEqual(this.username, proxyConfig.username) && Intrinsics.areEqual(this.password, proxyConfig.password) && this.bypassLan == proxyConfig.bypassLan;
    }

    public final boolean getHasCredentials() {
        return !StringsKt.isBlank(this.username);
    }

    public int hashCode() {
        return i02.i(i02.i((i02.i((this.protocol.hashCode() + ((this.enabled ? 1231 : 1237) * 31)) * 31, 31, this.host) + this.port) * 31, 31, this.username), 31, this.password) + (this.bypassLan ? 1231 : 1237);
    }

    public String toString() {
        boolean z = this.enabled;
        ProxyProtocol proxyProtocol = this.protocol;
        String str = this.host;
        int i = this.port;
        String str2 = this.username;
        String str3 = this.password;
        boolean z2 = this.bypassLan;
        StringBuilder sb = new StringBuilder("ProxyConfig(enabled=");
        sb.append(z);
        sb.append(", protocol=");
        sb.append(proxyProtocol);
        sb.append(", host=");
        sb.append(str);
        sb.append(", port=");
        sb.append(i);
        sb.append(", username=");
        i02.v(sb, str2, ", password=", str3, ", bypassLan=");
        return i9.i(sb, z2, ")");
    }

    public ProxyConfig(boolean z, ProxyProtocol proxyProtocol, String str, int i, String str2, String str3, boolean z2) {
        proxyProtocol.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.enabled = z;
        this.protocol = proxyProtocol;
        this.host = str;
        this.port = i;
        this.username = str2;
        this.password = str3;
        this.bypassLan = z2;
    }

    public ProxyConfig() {
        this(false, null, null, 0, null, null, false, 127, null);
    }
}

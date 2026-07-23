package com.dh.myembyapp.dlna;

import defpackage.i02;
import defpackage.i9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaConfig;", "", "enabled", "", "deviceName", "", "autoPlay", "useProxyByDefault", "trustAllCerts", "<init>", "(ZLjava/lang/String;ZZZ)V", "getEnabled", "()Z", "getDeviceName", "()Ljava/lang/String;", "getAutoPlay", "getUseProxyByDefault", "getTrustAllCerts", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DlnaConfig {
    public static final int $stable = 0;
    private final boolean autoPlay;
    private final String deviceName;
    private final boolean enabled;
    private final boolean trustAllCerts;
    private final boolean useProxyByDefault;

    public /* synthetic */ DlnaConfig(boolean z, String str, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "柴柴TV" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
    }

    public static /* synthetic */ DlnaConfig copy$default(DlnaConfig dlnaConfig, boolean z, String str, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dlnaConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = dlnaConfig.deviceName;
        }
        if ((i & 4) != 0) {
            z2 = dlnaConfig.autoPlay;
        }
        if ((i & 8) != 0) {
            z3 = dlnaConfig.useProxyByDefault;
        }
        if ((i & 16) != 0) {
            z4 = dlnaConfig.trustAllCerts;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return dlnaConfig.copy(z, str, z6, z3, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final DlnaConfig copy(boolean enabled, String deviceName, boolean autoPlay, boolean useProxyByDefault, boolean trustAllCerts) {
        deviceName.getClass();
        return new DlnaConfig(enabled, deviceName, autoPlay, useProxyByDefault, trustAllCerts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DlnaConfig)) {
            return false;
        }
        DlnaConfig dlnaConfig = (DlnaConfig) other;
        return this.enabled == dlnaConfig.enabled && Intrinsics.areEqual(this.deviceName, dlnaConfig.deviceName) && this.autoPlay == dlnaConfig.autoPlay && this.useProxyByDefault == dlnaConfig.useProxyByDefault && this.trustAllCerts == dlnaConfig.trustAllCerts;
    }

    public int hashCode() {
        return ((((i02.i((this.enabled ? 1231 : 1237) * 31, 31, this.deviceName) + (this.autoPlay ? 1231 : 1237)) * 31) + (this.useProxyByDefault ? 1231 : 1237)) * 31) + (this.trustAllCerts ? 1231 : 1237);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.deviceName;
        boolean z2 = this.autoPlay;
        boolean z3 = this.useProxyByDefault;
        boolean z4 = this.trustAllCerts;
        StringBuilder sb = new StringBuilder("DlnaConfig(enabled=");
        sb.append(z);
        sb.append(", deviceName=");
        sb.append(str);
        sb.append(", autoPlay=");
        i9.r(sb, z2, ", useProxyByDefault=", z3, ", trustAllCerts=");
        return i9.i(sb, z4, ")");
    }

    public DlnaConfig(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.enabled = z;
        this.deviceName = str;
        this.autoPlay = z2;
        this.useProxyByDefault = z3;
        this.trustAllCerts = z4;
    }

    public DlnaConfig() {
        this(false, null, false, false, false, 31, null);
    }
}

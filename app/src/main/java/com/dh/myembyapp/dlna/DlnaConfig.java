package com.dh.myembyapp.dlna;

import defpackage.i02;
import defpackage.i9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DlnaConfig {
    
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

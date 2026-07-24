package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class BackupRouteConfig {
    

    @SerializedName("alias")
    private final String alias;

    @SerializedName("directOnly")
    private final boolean directOnly;

    @SerializedName("host")
    private final String host;

    @SerializedName("id")
    private final String id;

    @SerializedName("path")
    private final String path;

    @SerializedName("port")
    private final int port;

    @SerializedName("protocol")
    private final String protocol;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BackupRouteConfig(String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this(str, str2, str3, str4, i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? false : z);
    }

    public static /* synthetic */ BackupRouteConfig copy$default(BackupRouteConfig backupRouteConfig, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = backupRouteConfig.id;
        }
        if ((i2 & 2) != 0) {
            str2 = backupRouteConfig.alias;
        }
        if ((i2 & 4) != 0) {
            str3 = backupRouteConfig.protocol;
        }
        if ((i2 & 8) != 0) {
            str4 = backupRouteConfig.host;
        }
        if ((i2 & 16) != 0) {
            i = backupRouteConfig.port;
        }
        if ((i2 & 32) != 0) {
            str5 = backupRouteConfig.path;
        }
        if ((i2 & 64) != 0) {
            z = backupRouteConfig.directOnly;
        }
        String str6 = str5;
        boolean z2 = z;
        int i3 = i;
        String str7 = str3;
        return backupRouteConfig.copy(str, str2, str7, str4, i3, str6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final BackupRouteConfig copy(String id, String alias, String protocol, String host, int port, String path, boolean directOnly) {
        id.getClass();
        alias.getClass();
        protocol.getClass();
        host.getClass();
        return new BackupRouteConfig(id, alias, protocol, host, port, path, directOnly);
    }

    public boolean equals(Object other) {
        String strNormalizeServerPath = ServerConfigKt.normalizeServerPath(this.path);
        return this.protocol + "://" + this.host + ":" + this.port + strNormalizeServerPath;
    }

    public final String getFullUrl() {
        String strNormalizeServerPath = ServerConfigKt.normalizeServerPath(this.path);
        String str = this.protocol;
        String str2 = this.host;
        int i = this.port;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("://");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        return s01.w(sb, strNormalizeServerPath, "/");
    }

    public int hashCode() {
        int i = (i02.i(i02.i(i02.i(this.id.hashCode() * 31, 31, this.alias), 31, this.protocol), 31, this.host) + this.port) * 31;
        String str = this.path;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + (this.directOnly ? 1231 : 1237);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.alias;
        String str3 = this.protocol;
        String str4 = this.host;
        int i = this.port;
        String str5 = this.path;
        boolean z = this.directOnly;
        StringBuilder sbZ = kb0.z("BackupRouteConfig(id=", str, ", alias=", str2, ", protocol=");
        i02.v(sbZ, str3, ", host=", str4, ", port=");
        sbZ.append(i);
        sbZ.append(", path=");
        sbZ.append(str5);
        sbZ.append(", directOnly=");
        return i9.i(sbZ, z, ")");
    }

    public BackupRouteConfig(String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = str;
        this.alias = str2;
        this.protocol = str3;
        this.host = str4;
        this.port = i;
        this.path = str5;
        this.directOnly = z;
    }
}

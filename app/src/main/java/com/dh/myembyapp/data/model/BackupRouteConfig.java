package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/dh/myembyapp/data/model/BackupRouteConfig;", "", TtmlNode.ATTR_ID, "", "alias", "protocol", "host", "port", "", "path", "directOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getAlias", "getProtocol", "getHost", "getPort", "()I", "getPath", "getDirectOnly", "()Z", "getFullUrl", "getDisplayAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BackupRouteConfig {
    public static final int $stable = 0;

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

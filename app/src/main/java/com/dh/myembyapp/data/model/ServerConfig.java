package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.c61;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class ServerConfig {
    

    @SerializedName("accessToken")
    private String accessToken;

    @SerializedName("activeBackupRouteId")
    private final String activeBackupRouteId;

    @SerializedName("alias")
    private final String alias;

    @SerializedName("backupRoutes")
    private final List<BackupRouteConfig> backupRoutes;

    @SerializedName("customIconPath")
    private final String customIconPath;

    @SerializedName("deviceId")
    private String deviceId;

    @SerializedName("directOnly")
    private final boolean directOnly;

    @SerializedName("enableStrmDirectPlay")
    private final boolean enableStrmDirectPlay;

    @SerializedName("host")
    private final String host;

    @SerializedName("id")
    private final String id;

    @SerializedName("isVerified")
    private boolean isVerified;

    @SerializedName("lastLoginTime")
    private long lastLoginTime;

    @SerializedName("lastPlaybackAccessTime")
    private final long lastPlaybackAccessTime;

    @SerializedName("note")
    private final String note;

    @SerializedName("password")
    private final String password;

    @SerializedName("path")
    private final String path;

    @SerializedName("port")
    private final int port;

    @SerializedName("protocol")
    private final String protocol;

    @SerializedName("trustAllCerts")
    private final boolean trustAllCerts;

    @SerializedName("useEmbyPrefix")
    private boolean useEmbyPrefix;

    @SerializedName("userId")
    private String userId;

    @SerializedName("username")
    private final String username;

    public /* synthetic */ ServerConfig(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, String str11, String str12, String str13, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, (i2 & 32) != 0 ? "" : str5, str6, str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? 0L : j, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? false : z3, (32768 & i2) != 0 ? true : z4, (65536 & i2) != 0 ? false : z5, (131072 & i2) != 0 ? CollectionsKt.emptyList() : list, (262144 & i2) != 0 ? null : str11, (524288 & i2) != 0 ? null : str12, (1048576 & i2) != 0 ? null : str13, (i2 & 2097152) != 0 ? 0L : j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerConfig copy$default(ServerConfig serverConfig, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, String str11, String str12, String str13, long j2, int i2, Object obj) {
        long j3;
        String str14;
        boolean z6;
        String str15 = (i2 & 1) != 0 ? serverConfig.id : str;
        String str16 = (i2 & 2) != 0 ? serverConfig.alias : str2;
        String str17 = (i2 & 4) != 0 ? serverConfig.protocol : str3;
        String str18 = (i2 & 8) != 0 ? serverConfig.host : str4;
        int i3 = (i2 & 16) != 0 ? serverConfig.port : i;
        String str19 = (i2 & 32) != 0 ? serverConfig.path : str5;
        String str20 = (i2 & 64) != 0 ? serverConfig.username : str6;
        String str21 = (i2 & 128) != 0 ? serverConfig.password : str7;
        String str22 = (i2 & 256) != 0 ? serverConfig.userId : str8;
        String str23 = (i2 & 512) != 0 ? serverConfig.accessToken : str9;
        String str24 = (i2 & 1024) != 0 ? serverConfig.deviceId : str10;
        long j4 = (i2 & 2048) != 0 ? serverConfig.lastLoginTime : j;
        boolean z7 = (i2 & 4096) != 0 ? serverConfig.isVerified : z;
        String str25 = str15;
        boolean z8 = (i2 & 8192) != 0 ? serverConfig.directOnly : z2;
        boolean z9 = (i2 & 16384) != 0 ? serverConfig.enableStrmDirectPlay : z3;
        boolean z10 = (i2 & 32768) != 0 ? serverConfig.useEmbyPrefix : z4;
        boolean z11 = (i2 & 65536) != 0 ? serverConfig.trustAllCerts : z5;
        List list2 = (i2 & 131072) != 0 ? serverConfig.backupRoutes : list;
        String str26 = (i2 & 262144) != 0 ? serverConfig.activeBackupRouteId : str11;
        String str27 = (i2 & 524288) != 0 ? serverConfig.customIconPath : str12;
        String str28 = (i2 & 1048576) != 0 ? serverConfig.note : str13;
        if ((i2 & 2097152) != 0) {
            z6 = z9;
            str14 = str28;
            j3 = serverConfig.lastPlaybackAccessTime;
        } else {
            j3 = j2;
            str14 = str28;
            z6 = z9;
        }
        return serverConfig.copy(str25, str16, str17, str18, i3, str19, str20, str21, str22, str23, str24, j4, z7, z8, z6, z10, z11, list2, str26, str27, str14, j3);
    }

    @Deprecated(message = "不再使用，保留仅为向后兼容")
    public static /* synthetic */ void getUseEmbyPrefix$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component14, reason: from getter */

    /* JADX INFO: renamed from: component15, reason: from getter */

    /* JADX INFO: renamed from: component16, reason: from getter */

    /* JADX INFO: renamed from: component17, reason: from getter */

    public final List<BackupRouteConfig> component18() {
        return this.backupRoutes;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component20, reason: from getter */
public final String getCurrentRouteDisplayName() {
        String alias;
        String string;
        BackupRouteConfig activeBackupRoute = getActiveBackupRoute();
        if (activeBackupRoute == null || (alias = activeBackupRoute.getAlias()) == null || (string = StringsKt.trim((CharSequence) alias).toString()) == null) {
            return "主线路";
        }
        if (string.length() <= 0) {
            string = null;
        }
        return string == null ? "主线路" : string;
    }


    public final String getDisplayAddress() {
        String strNormalizeServerPath = ServerConfigKt.normalizeServerPath(this.path);
        return this.protocol + "://" + this.host + ":" + this.port + strNormalizeServerPath;
    }

    public final ServerConfig getEffectiveServerConfig() {
        List<BackupRouteConfig> backupRoutesSafe = getBackupRoutesSafe();
        String str = this.activeBackupRouteId;
        BackupRouteConfig backupRouteConfig = null;
        Object obj = null;
        if (str != null) {
            for (Object obj2 : backupRoutesSafe) {
                if (Intrinsics.areEqual(((BackupRouteConfig) obj2).getId(), str)) {
                    obj = obj2;
                    break;
                }
            }
            backupRouteConfig = (BackupRouteConfig) obj;
        }
        return backupRouteConfig == null ? copy$default(this, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, backupRoutesSafe, null, null, null, 0L, 3801087, null) : copy$default(this, null, null, backupRouteConfig.getProtocol(), backupRouteConfig.getHost(), backupRouteConfig.getPort(), backupRouteConfig.getPath(), null, null, null, null, null, 0L, false, backupRouteConfig.getDirectOnly(), false, false, false, backupRoutesSafe, backupRouteConfig.getId(), null, null, 0L, 3792835, null);
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
        int i2 = i02.i(i02.i((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.username), 31, this.password);
        String str2 = this.userId;
        int iHashCode = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceId;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        long j = this.lastLoginTime;
        int i3 = (((((((((((((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.isVerified ? 1231 : 1237)) * 31) + (this.directOnly ? 1231 : 1237)) * 31) + (this.enableStrmDirectPlay ? 1231 : 1237)) * 31) + (this.useEmbyPrefix ? 1231 : 1237)) * 31) + (this.trustAllCerts ? 1231 : 1237)) * 31;
        List<BackupRouteConfig> list = this.backupRoutes;
        int iHashCode4 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.activeBackupRouteId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customIconPath;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.note;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        long j2 = this.lastPlaybackAccessTime;
        return iHashCode7 + ((int) ((j2 >>> 32) ^ j2));
    }

    public final boolean isLoggedIn() {
        return (this.userId == null || this.accessToken == null) ? false : true;
    }








    public String toString() {
        String str = this.id;
        String str2 = this.alias;
        String str3 = this.protocol;
        String str4 = this.host;
        int i = this.port;
        String str5 = this.path;
        String str6 = this.username;
        String str7 = this.password;
        String str8 = this.userId;
        String str9 = this.accessToken;
        String str10 = this.deviceId;
        long j = this.lastLoginTime;
        boolean z = this.isVerified;
        boolean z2 = this.directOnly;
        boolean z3 = this.enableStrmDirectPlay;
        boolean z4 = this.useEmbyPrefix;
        boolean z5 = this.trustAllCerts;
        List<BackupRouteConfig> list = this.backupRoutes;
        String str11 = this.activeBackupRouteId;
        String str12 = this.customIconPath;
        String str13 = this.note;
        long j2 = this.lastPlaybackAccessTime;
        StringBuilder sbZ = kb0.z("ServerConfig(id=", str, ", alias=", str2, ", protocol=");
        i02.v(sbZ, str3, ", host=", str4, ", port=");
        sbZ.append(i);
        sbZ.append(", path=");
        sbZ.append(str5);
        sbZ.append(", username=");
        i02.v(sbZ, str6, ", password=", str7, ", userId=");
        i02.v(sbZ, str8, ", accessToken=", str9, ", deviceId=");
        sbZ.append(str10);
        sbZ.append(", lastLoginTime=");
        sbZ.append(j);
        sbZ.append(", isVerified=");
        sbZ.append(z);
        sbZ.append(", directOnly=");
        sbZ.append(z2);
        sbZ.append(", enableStrmDirectPlay=");
        sbZ.append(z3);
        sbZ.append(", useEmbyPrefix=");
        sbZ.append(z4);
        sbZ.append(", trustAllCerts=");
        sbZ.append(z5);
        sbZ.append(", backupRoutes=");
        sbZ.append(list);
        i02.v(sbZ, ", activeBackupRouteId=", str11, ", customIconPath=", str12);
        sbZ.append(", note=");
        sbZ.append(str13);
        sbZ.append(", lastPlaybackAccessTime=");
        return c61.i(j2, ")", sbZ);
    }

    public ServerConfig(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<BackupRouteConfig> list, String str11, String str12, String str13, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        this.id = str;
        this.alias = str2;
        this.protocol = str3;
        this.host = str4;
        this.port = i;
        this.path = str5;
        this.username = str6;
        this.password = str7;
        this.userId = str8;
        this.accessToken = str9;
        this.deviceId = str10;
        this.lastLoginTime = j;
        this.isVerified = z;
        this.directOnly = z2;
        this.enableStrmDirectPlay = z3;
        this.useEmbyPrefix = z4;
        this.trustAllCerts = z5;
        this.backupRoutes = list;
        this.activeBackupRouteId = str11;
        this.customIconPath = str12;
        this.note = str13;
        this.lastPlaybackAccessTime = j2;
    }
}

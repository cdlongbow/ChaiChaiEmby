package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class EmbyUser {
    

    @SerializedName("EnableAutoLogin")
    private final Boolean enableAutoLogin;

    @SerializedName("HasConfiguredEasyPassword")
    private final boolean hasConfiguredEasyPassword;

    @SerializedName("HasConfiguredPassword")
    private final boolean hasConfiguredPassword;

    @SerializedName("HasPassword")
    private final boolean hasPassword;

    @SerializedName("Id")
    private final String id;

    @SerializedName("LastActivityDate")
    private final String lastActivityDate;

    @SerializedName("LastLoginDate")
    private final String lastLoginDate;

    @SerializedName("Name")
    private final String name;

    @SerializedName("ServerId")
    private final String serverId;

    public EmbyUser(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5) {
        s01.D(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.serverId = str3;
        this.hasPassword = z;
        this.hasConfiguredPassword = z2;
        this.hasConfiguredEasyPassword = z3;
        this.enableAutoLogin = bool;
        this.lastLoginDate = str4;
        this.lastActivityDate = str5;
    }

    public static /* synthetic */ EmbyUser copy$default(EmbyUser embyUser, String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embyUser.id;
        }
        if ((i & 2) != 0) {
            str2 = embyUser.name;
        }
        if ((i & 4) != 0) {
            str3 = embyUser.serverId;
        }
        if ((i & 8) != 0) {
            z = embyUser.hasPassword;
        }
        if ((i & 16) != 0) {
            z2 = embyUser.hasConfiguredPassword;
        }
        if ((i & 32) != 0) {
            z3 = embyUser.hasConfiguredEasyPassword;
        }
        if ((i & 64) != 0) {
            bool = embyUser.enableAutoLogin;
        }
        if ((i & 128) != 0) {
            str4 = embyUser.lastLoginDate;
        }
        if ((i & 256) != 0) {
            str5 = embyUser.lastActivityDate;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z4 = z3;
        Boolean bool2 = bool;
        boolean z5 = z2;
        String str8 = str3;
        return embyUser.copy(str, str2, str8, z, z5, z4, bool2, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final EmbyUser copy(String id, String name, String serverId, boolean hasPassword, boolean hasConfiguredPassword, boolean hasConfiguredEasyPassword, Boolean enableAutoLogin, String lastLoginDate, String lastActivityDate) {
        id.getClass();
        name.getClass();
        serverId.getClass();
        return new EmbyUser(id, name, serverId, hasPassword, hasConfiguredPassword, hasConfiguredEasyPassword, enableAutoLogin, lastLoginDate, lastActivityDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbyUser)) {
            return false;
        }
        EmbyUser embyUser = (EmbyUser) other;
        return Intrinsics.areEqual(this.id, embyUser.id) && Intrinsics.areEqual(this.name, embyUser.name) && Intrinsics.areEqual(this.serverId, embyUser.serverId) && this.hasPassword == embyUser.hasPassword && this.hasConfiguredPassword == embyUser.hasConfiguredPassword && this.hasConfiguredEasyPassword == embyUser.hasConfiguredEasyPassword && Intrinsics.areEqual(this.enableAutoLogin, embyUser.enableAutoLogin) && Intrinsics.areEqual(this.lastLoginDate, embyUser.lastLoginDate) && Intrinsics.areEqual(this.lastActivityDate, embyUser.lastActivityDate);
    }










    public int hashCode() {
        int i = (((((i02.i(i02.i(this.id.hashCode() * 31, 31, this.name), 31, this.serverId) + (this.hasPassword ? 1231 : 1237)) * 31) + (this.hasConfiguredPassword ? 1231 : 1237)) * 31) + (this.hasConfiguredEasyPassword ? 1231 : 1237)) * 31;
        Boolean bool = this.enableAutoLogin;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.lastLoginDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastActivityDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.serverId;
        boolean z = this.hasPassword;
        boolean z2 = this.hasConfiguredPassword;
        boolean z3 = this.hasConfiguredEasyPassword;
        Boolean bool = this.enableAutoLogin;
        String str4 = this.lastLoginDate;
        String str5 = this.lastActivityDate;
        StringBuilder sbZ = kb0.z("EmbyUser(id=", str, ", name=", str2, ", serverId=");
        sbZ.append(str3);
        sbZ.append(", hasPassword=");
        sbZ.append(z);
        sbZ.append(", hasConfiguredPassword=");
        i9.r(sbZ, z2, ", hasConfiguredEasyPassword=", z3, ", enableAutoLogin=");
        sbZ.append(bool);
        sbZ.append(", lastLoginDate=");
        sbZ.append(str4);
        sbZ.append(", lastActivityDate=");
        return s01.w(sbZ, str5, ")");
    }

    public /* synthetic */ EmbyUser(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, z2, z3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }
}

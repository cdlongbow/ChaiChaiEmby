package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006,"}, d2 = {"Lcom/dh/myembyapp/data/model/EmbyUser;", "", TtmlNode.ATTR_ID, "", HintConstants.AUTOFILL_HINT_NAME, "serverId", "hasPassword", "", "hasConfiguredPassword", "hasConfiguredEasyPassword", "enableAutoLogin", "lastLoginDate", "lastActivityDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getServerId", "getHasPassword", "()Z", "getHasConfiguredPassword", "getHasConfiguredEasyPassword", "getEnableAutoLogin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastLoginDate", "getLastActivityDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/dh/myembyapp/data/model/EmbyUser;", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EmbyUser {
    public static final int $stable = 0;

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

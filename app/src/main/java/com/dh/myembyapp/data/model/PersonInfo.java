package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class PersonInfo {
    

    @SerializedName("Id")
    private final String id;

    @SerializedName("Name")
    private final String name;

    @SerializedName("PrimaryImageTag")
    private final String primaryImageTag;

    @SerializedName("Role")
    private final String role;

    @SerializedName("Type")
    private final String type;

    public PersonInfo(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.role = str3;
        this.type = str4;
        this.primaryImageTag = str5;
    }

    public static /* synthetic */ PersonInfo copy$default(PersonInfo personInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = personInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = personInfo.role;
        }
        if ((i & 8) != 0) {
            str4 = personInfo.type;
        }
        if ((i & 16) != 0) {
            str5 = personInfo.primaryImageTag;
        }
        String str6 = str5;
        String str7 = str3;
        return personInfo.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final PersonInfo copy(String id, String name, String role, String type, String primaryImageTag) {
        id.getClass();
        name.getClass();
        return new PersonInfo(id, name, role, type, primaryImageTag);
    }

    public boolean equals(Object other) {
        int i = i02.i(this.id.hashCode() * 31, 31, this.name);
        String str = this.role;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryImageTag;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.role;
        String str4 = this.type;
        String str5 = this.primaryImageTag;
        StringBuilder sbZ = kb0.z("PersonInfo(id=", str, ", name=", str2, ", role=");
        i02.v(sbZ, str3, ", type=", str4, ", primaryImageTag=");
        return s01.w(sbZ, str5, ")");
    }

    public /* synthetic */ PersonInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

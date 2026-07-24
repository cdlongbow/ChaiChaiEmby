package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/ProfileCondition;", "", "condition", "", "property", "value", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCondition", "()Ljava/lang/String;", "getProperty", "getValue", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final  class ProfileCondition {
    

    @SerializedName("Condition")
    private final String condition;

    @SerializedName("IsRequired")
    private final boolean isRequired;

    @SerializedName("Property")
    private final String property;

    @SerializedName("Value")
    private final String value;

    public ProfileCondition(String str, String str2, String str3, boolean z) {
        s01.D(str, str2, str3);
        this.condition = str;
        this.property = str2;
        this.value = str3;
        this.isRequired = z;
    }

    public static /* synthetic */ ProfileCondition copy$default(ProfileCondition profileCondition, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileCondition.condition;
        }
        if ((i & 2) != 0) {
            str2 = profileCondition.property;
        }
        if ((i & 4) != 0) {
            str3 = profileCondition.value;
        }
        if ((i & 8) != 0) {
            z = profileCondition.isRequired;
        }
        return profileCondition.copy(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final ProfileCondition copy(String condition, String property, String value, boolean isRequired) {
        condition.getClass();
        property.getClass();
        value.getClass();
        return new ProfileCondition(condition, property, value, isRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileCondition)) {
            return false;
        }
        ProfileCondition profileCondition = (ProfileCondition) other;
        return Intrinsics.areEqual(this.condition, profileCondition.condition) && Intrinsics.areEqual(this.property, profileCondition.property) && Intrinsics.areEqual(this.value, profileCondition.value) && this.isRequired == profileCondition.isRequired;
    }




    public int hashCode() {
        return i02.i(i02.i(this.condition.hashCode() * 31, 31, this.property), 31, this.value) + (this.isRequired ? 1231 : 1237);
    }


    public String toString() {
        String str = this.condition;
        String str2 = this.property;
        String str3 = this.value;
        boolean z = this.isRequired;
        StringBuilder sbZ = kb0.z("ProfileCondition(condition=", str, ", property=", str2, ", value=");
        sbZ.append(str3);
        sbZ.append(", isRequired=");
        sbZ.append(z);
        sbZ.append(")");
        return sbZ.toString();
    }

    public /* synthetic */ ProfileCondition(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}

package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class ResponseProfile {
    

    @SerializedName(TextFieldImplKt.ContainerId)
    private final String container;

    @SerializedName("MimeType")
    private final String mimeType;

    @SerializedName("Type")
    private final String type;

    public ResponseProfile(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.type = str;
        this.container = str2;
        this.mimeType = str3;
    }

    public static /* synthetic */ ResponseProfile copy$default(ResponseProfile responseProfile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseProfile.type;
        }
        if ((i & 2) != 0) {
            str2 = responseProfile.container;
        }
        if ((i & 4) != 0) {
            str3 = responseProfile.mimeType;
        }
        return responseProfile.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final ResponseProfile copy(String type, String container, String mimeType) {
        type.getClass();
        container.getClass();
        mimeType.getClass();
        return new ResponseProfile(type, container, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseProfile)) {
            return false;
        }
        ResponseProfile responseProfile = (ResponseProfile) other;
        return Intrinsics.areEqual(this.type, responseProfile.type) && Intrinsics.areEqual(this.container, responseProfile.container) && Intrinsics.areEqual(this.mimeType, responseProfile.mimeType);
    }




    public int hashCode() {
        return this.mimeType.hashCode() + i02.i(this.type.hashCode() * 31, 31, this.container);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.container;
        return s01.w(kb0.z("ResponseProfile(type=", str, ", container=", str2, ", mimeType="), this.mimeType, ")");
    }
}

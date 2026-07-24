package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktDeviceTokenRequest {
    

    @SerializedName("client_id")
    private final String clientId;

    @SerializedName("client_secret")
    private final String clientSecret;

    @SerializedName("code")
    private final String code;

    public TraktDeviceTokenRequest(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.code = str;
        this.clientId = str2;
        this.clientSecret = str3;
    }

    public static /* synthetic */ TraktDeviceTokenRequest copy$default(TraktDeviceTokenRequest traktDeviceTokenRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktDeviceTokenRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = traktDeviceTokenRequest.clientId;
        }
        if ((i & 4) != 0) {
            str3 = traktDeviceTokenRequest.clientSecret;
        }
        return traktDeviceTokenRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktDeviceTokenRequest copy(String code, String clientId, String clientSecret) {
        code.getClass();
        clientId.getClass();
        clientSecret.getClass();
        return new TraktDeviceTokenRequest(code, clientId, clientSecret);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktDeviceTokenRequest)) {
            return false;
        }
        TraktDeviceTokenRequest traktDeviceTokenRequest = (TraktDeviceTokenRequest) other;
        return Intrinsics.areEqual(this.code, traktDeviceTokenRequest.code) && Intrinsics.areEqual(this.clientId, traktDeviceTokenRequest.clientId) && Intrinsics.areEqual(this.clientSecret, traktDeviceTokenRequest.clientSecret);
    }




    public int hashCode() {
        return this.clientSecret.hashCode() + i02.i(this.code.hashCode() * 31, 31, this.clientId);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.clientId;
        return s01.w(kb0.z("TraktDeviceTokenRequest(code=", str, ", clientId=", str2, ", clientSecret="), this.clientSecret, ")");
    }
}

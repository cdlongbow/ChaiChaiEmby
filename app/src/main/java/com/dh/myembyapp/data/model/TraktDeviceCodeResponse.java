package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.mr;
import defpackage.s01;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktDeviceCodeResponse {
    

    @SerializedName("device_code")
    private final String deviceCode;

    @SerializedName("expires_in")
    private final long expiresIn;

    @SerializedName("interval")
    private final long interval;

    @SerializedName("user_code")
    private final String userCode;

    @SerializedName("verification_url")
    private final String verificationUrl;

    public TraktDeviceCodeResponse(String str, String str2, String str3, long j, long j2) {
        s01.D(str, str2, str3);
        this.deviceCode = str;
        this.userCode = str2;
        this.verificationUrl = str3;
        this.expiresIn = j;
        this.interval = j2;
    }

    public static /* synthetic */ TraktDeviceCodeResponse copy$default(TraktDeviceCodeResponse traktDeviceCodeResponse, String str, String str2, String str3, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktDeviceCodeResponse.deviceCode;
        }
        if ((i & 2) != 0) {
            str2 = traktDeviceCodeResponse.userCode;
        }
        if ((i & 4) != 0) {
            str3 = traktDeviceCodeResponse.verificationUrl;
        }
        if ((i & 8) != 0) {
            j = traktDeviceCodeResponse.expiresIn;
        }
        if ((i & 16) != 0) {
            j2 = traktDeviceCodeResponse.interval;
        }
        long j3 = j2;
        String str4 = str3;
        return traktDeviceCodeResponse.copy(str, str2, str4, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final TraktDeviceCodeResponse copy(String deviceCode, String userCode, String verificationUrl, long expiresIn, long interval) {
        deviceCode.getClass();
        userCode.getClass();
        verificationUrl.getClass();
        return new TraktDeviceCodeResponse(deviceCode, userCode, verificationUrl, expiresIn, interval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktDeviceCodeResponse)) {
            return false;
        }
        TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) other;
        return Intrinsics.areEqual(this.deviceCode, traktDeviceCodeResponse.deviceCode) && Intrinsics.areEqual(this.userCode, traktDeviceCodeResponse.userCode) && Intrinsics.areEqual(this.verificationUrl, traktDeviceCodeResponse.verificationUrl) && this.expiresIn == traktDeviceCodeResponse.expiresIn && this.interval == traktDeviceCodeResponse.interval;
    }

    public final String getActivationUrl() {
        return mr.C(StringsKt.trimEnd(this.verificationUrl, '/'), "/", this.userCode);
    }






    public int hashCode() {
        int i = i02.i(i02.i(this.deviceCode.hashCode() * 31, 31, this.userCode), 31, this.verificationUrl);
        long j = this.expiresIn;
        long j2 = this.interval;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        String str = this.deviceCode;
        String str2 = this.userCode;
        String str3 = this.verificationUrl;
        long j = this.expiresIn;
        long j2 = this.interval;
        StringBuilder sbZ = kb0.z("TraktDeviceCodeResponse(deviceCode=", str, ", userCode=", str2, ", verificationUrl=");
        sbZ.append(str3);
        sbZ.append(", expiresIn=");
        sbZ.append(j);
        sbZ.append(", interval=");
        sbZ.append(j2);
        sbZ.append(")");
        return sbZ.toString();
    }
}

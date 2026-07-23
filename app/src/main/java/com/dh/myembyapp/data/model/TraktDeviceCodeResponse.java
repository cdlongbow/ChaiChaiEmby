package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.mr;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/TraktDeviceCodeResponse;", "", "deviceCode", "", "userCode", "verificationUrl", "expiresIn", "", "interval", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getDeviceCode", "()Ljava/lang/String;", "getUserCode", "getVerificationUrl", "getExpiresIn", "()J", "getInterval", "activationUrl", "getActivationUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktDeviceCodeResponse {
    public static final int $stable = 0;

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

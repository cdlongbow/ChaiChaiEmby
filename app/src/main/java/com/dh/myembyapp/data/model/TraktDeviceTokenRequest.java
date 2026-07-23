package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktDeviceTokenRequest;", "", "code", "", "clientId", "clientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getClientId", "getClientSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktDeviceTokenRequest {
    public static final int $stable = 0;

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

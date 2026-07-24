package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktRefreshTokenRequest {
    

    @SerializedName("client_id")
    private final String clientId;

    @SerializedName("client_secret")
    private final String clientSecret;

    @SerializedName("grant_type")
    private final String grantType;

    @SerializedName("redirect_uri")
    private final String redirectUri;

    @SerializedName("refresh_token")
    private final String refreshToken;

    public TraktRefreshTokenRequest(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.refreshToken = str;
        this.clientId = str2;
        this.clientSecret = str3;
        this.redirectUri = str4;
        this.grantType = str5;
    }

    public static /* synthetic */ TraktRefreshTokenRequest copy$default(TraktRefreshTokenRequest traktRefreshTokenRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktRefreshTokenRequest.refreshToken;
        }
        if ((i & 2) != 0) {
            str2 = traktRefreshTokenRequest.clientId;
        }
        if ((i & 4) != 0) {
            str3 = traktRefreshTokenRequest.clientSecret;
        }
        if ((i & 8) != 0) {
            str4 = traktRefreshTokenRequest.redirectUri;
        }
        if ((i & 16) != 0) {
            str5 = traktRefreshTokenRequest.grantType;
        }
        String str6 = str5;
        String str7 = str3;
        return traktRefreshTokenRequest.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final TraktRefreshTokenRequest copy(String refreshToken, String clientId, String clientSecret, String redirectUri, String grantType) {
        refreshToken.getClass();
        clientId.getClass();
        clientSecret.getClass();
        redirectUri.getClass();
        grantType.getClass();
        return new TraktRefreshTokenRequest(refreshToken, clientId, clientSecret, redirectUri, grantType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktRefreshTokenRequest)) {
            return false;
        }
        TraktRefreshTokenRequest traktRefreshTokenRequest = (TraktRefreshTokenRequest) other;
        return Intrinsics.areEqual(this.refreshToken, traktRefreshTokenRequest.refreshToken) && Intrinsics.areEqual(this.clientId, traktRefreshTokenRequest.clientId) && Intrinsics.areEqual(this.clientSecret, traktRefreshTokenRequest.clientSecret) && Intrinsics.areEqual(this.redirectUri, traktRefreshTokenRequest.redirectUri) && Intrinsics.areEqual(this.grantType, traktRefreshTokenRequest.grantType);
    }






    public int hashCode() {
        return this.grantType.hashCode() + i02.i(i02.i(i02.i(this.refreshToken.hashCode() * 31, 31, this.clientId), 31, this.clientSecret), 31, this.redirectUri);
    }

    public String toString() {
        String str = this.refreshToken;
        String str2 = this.clientId;
        String str3 = this.clientSecret;
        String str4 = this.redirectUri;
        String str5 = this.grantType;
        StringBuilder sbZ = kb0.z("TraktRefreshTokenRequest(refreshToken=", str, ", clientId=", str2, ", clientSecret=");
        i02.v(sbZ, str3, ", redirectUri=", str4, ", grantType=");
        return s01.w(sbZ, str5, ")");
    }

    public /* synthetic */ TraktRefreshTokenRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "urn:ietf:wg:oauth:2.0:oob" : str4, (i & 16) != 0 ? "refresh_token" : str5);
    }
}

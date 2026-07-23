package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktRefreshTokenRequest;", "", "refreshToken", "", "clientId", "clientSecret", "redirectUri", "grantType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefreshToken", "()Ljava/lang/String;", "getClientId", "getClientSecret", "getRedirectUri", "getGrantType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktRefreshTokenRequest {
    public static final int $stable = 0;

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

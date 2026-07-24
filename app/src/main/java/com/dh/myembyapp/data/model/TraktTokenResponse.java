package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktTokenResponse {
    

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName("created_at")
    private final Long createdAt;

    @SerializedName("expires_in")
    private final long expiresIn;

    @SerializedName("refresh_token")
    private final String refreshToken;

    @SerializedName("scope")
    private final String scope;

    @SerializedName("token_type")
    private final String tokenType;

    public TraktTokenResponse(String str, String str2, long j, String str3, String str4, Long l) {
        str.getClass();
        str2.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.expiresIn = j;
        this.tokenType = str3;
        this.scope = str4;
        this.createdAt = l;
    }

    public static /* synthetic */ TraktTokenResponse copy$default(TraktTokenResponse traktTokenResponse, String str, String str2, long j, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = traktTokenResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            j = traktTokenResponse.expiresIn;
        }
        if ((i & 8) != 0) {
            str3 = traktTokenResponse.tokenType;
        }
        if ((i & 16) != 0) {
            str4 = traktTokenResponse.scope;
        }
        if ((i & 32) != 0) {
            l = traktTokenResponse.createdAt;
        }
        Long l2 = l;
        String str5 = str3;
        long j2 = j;
        return traktTokenResponse.copy(str, str2, j2, str5, str4, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    public final TraktTokenResponse copy(String accessToken, String refreshToken, long expiresIn, String tokenType, String scope, Long createdAt) {
        accessToken.getClass();
        refreshToken.getClass();
        return new TraktTokenResponse(accessToken, refreshToken, expiresIn, tokenType, scope, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktTokenResponse)) {
            return false;
        }
        TraktTokenResponse traktTokenResponse = (TraktTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, traktTokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, traktTokenResponse.refreshToken) && this.expiresIn == traktTokenResponse.expiresIn && Intrinsics.areEqual(this.tokenType, traktTokenResponse.tokenType) && Intrinsics.areEqual(this.scope, traktTokenResponse.scope) && Intrinsics.areEqual(this.createdAt, traktTokenResponse.createdAt);
    }







    public int hashCode() {
        int i = i02.i(this.accessToken.hashCode() * 31, 31, this.refreshToken);
        long j = this.expiresIn;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.tokenType;
        int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scope;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.createdAt;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        long j = this.expiresIn;
        String str3 = this.tokenType;
        String str4 = this.scope;
        Long l = this.createdAt;
        StringBuilder sbZ = kb0.z("TraktTokenResponse(accessToken=", str, ", refreshToken=", str2, ", expiresIn=");
        sbZ.append(j);
        sbZ.append(", tokenType=");
        sbZ.append(str3);
        sbZ.append(", scope=");
        sbZ.append(str4);
        sbZ.append(", createdAt=");
        sbZ.append(l);
        sbZ.append(")");
        return sbZ.toString();
    }

    public /* synthetic */ TraktTokenResponse(String str, String str2, long j, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l);
    }
}

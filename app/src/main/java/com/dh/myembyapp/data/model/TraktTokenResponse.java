package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014JP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktTokenResponse;", "", "accessToken", "", "refreshToken", "expiresIn", "", "tokenType", "scope", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getExpiresIn", "()J", "getTokenType", "getScope", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/dh/myembyapp/data/model/TraktTokenResponse;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktTokenResponse {
    public static final int $stable = 0;

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

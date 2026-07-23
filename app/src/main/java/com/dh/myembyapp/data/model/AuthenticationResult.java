package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/dh/myembyapp/data/model/AuthenticationResult;", "", "user", "Lcom/dh/myembyapp/data/model/EmbyUser;", "accessToken", "", "serverId", "<init>", "(Lcom/dh/myembyapp/data/model/EmbyUser;Ljava/lang/String;Ljava/lang/String;)V", "getUser", "()Lcom/dh/myembyapp/data/model/EmbyUser;", "getAccessToken", "()Ljava/lang/String;", "getServerId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AuthenticationResult {
    public static final int $stable = 0;

    @SerializedName("AccessToken")
    private final String accessToken;

    @SerializedName("ServerId")
    private final String serverId;

    @SerializedName("User")
    private final EmbyUser user;

    public AuthenticationResult(EmbyUser embyUser, String str, String str2) {
        embyUser.getClass();
        str.getClass();
        str2.getClass();
        this.user = embyUser;
        this.accessToken = str;
        this.serverId = str2;
    }

    public static /* synthetic */ AuthenticationResult copy$default(AuthenticationResult authenticationResult, EmbyUser embyUser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            embyUser = authenticationResult.user;
        }
        if ((i & 2) != 0) {
            str = authenticationResult.accessToken;
        }
        if ((i & 4) != 0) {
            str2 = authenticationResult.serverId;
        }
        return authenticationResult.copy(embyUser, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final AuthenticationResult copy(EmbyUser user, String accessToken, String serverId) {
        user.getClass();
        accessToken.getClass();
        serverId.getClass();
        return new AuthenticationResult(user, accessToken, serverId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationResult)) {
            return false;
        }
        AuthenticationResult authenticationResult = (AuthenticationResult) other;
        return Intrinsics.areEqual(this.user, authenticationResult.user) && Intrinsics.areEqual(this.accessToken, authenticationResult.accessToken) && Intrinsics.areEqual(this.serverId, authenticationResult.serverId);
    }




    public int hashCode() {
        return this.serverId.hashCode() + i02.i(this.user.hashCode() * 31, 31, this.accessToken);
    }

    public String toString() {
        EmbyUser embyUser = this.user;
        String str = this.accessToken;
        String str2 = this.serverId;
        StringBuilder sb = new StringBuilder("AuthenticationResult(user=");
        sb.append(embyUser);
        sb.append(", accessToken=");
        sb.append(str);
        sb.append(", serverId=");
        return s01.w(sb, str2, ")");
    }
}

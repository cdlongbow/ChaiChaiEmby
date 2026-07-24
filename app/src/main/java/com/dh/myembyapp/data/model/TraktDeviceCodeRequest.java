package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.mr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktDeviceCodeRequest {
    

    @SerializedName("client_id")
    private final String clientId;

    public TraktDeviceCodeRequest(String str) {
        str.getClass();
        this.clientId = str;
    }

    public static /* synthetic */ TraktDeviceCodeRequest copy$default(TraktDeviceCodeRequest traktDeviceCodeRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktDeviceCodeRequest.clientId;
        }
        return traktDeviceCodeRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final TraktDeviceCodeRequest copy(String clientId) {
        clientId.getClass();
        return new TraktDeviceCodeRequest(clientId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TraktDeviceCodeRequest) && Intrinsics.areEqual(this.clientId, ((TraktDeviceCodeRequest) other).clientId);
    }


    public int hashCode() {
        return this.clientId.hashCode();
    }

    public String toString() {
        return mr.r("TraktDeviceCodeRequest(clientId=", this.clientId, ")");
    }
}

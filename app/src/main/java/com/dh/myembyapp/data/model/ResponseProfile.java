package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/model/ResponseProfile;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", TtmlNode.RUBY_CONTAINER, "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getContainer", "getMimeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ResponseProfile {
    public static final int $stable = 0;

    @SerializedName(TextFieldImplKt.ContainerId)
    private final String container;

    @SerializedName("MimeType")
    private final String mimeType;

    @SerializedName("Type")
    private final String type;

    public ResponseProfile(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.type = str;
        this.container = str2;
        this.mimeType = str3;
    }

    public static /* synthetic */ ResponseProfile copy$default(ResponseProfile responseProfile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseProfile.type;
        }
        if ((i & 2) != 0) {
            str2 = responseProfile.container;
        }
        if ((i & 4) != 0) {
            str3 = responseProfile.mimeType;
        }
        return responseProfile.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final ResponseProfile copy(String type, String container, String mimeType) {
        type.getClass();
        container.getClass();
        mimeType.getClass();
        return new ResponseProfile(type, container, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseProfile)) {
            return false;
        }
        ResponseProfile responseProfile = (ResponseProfile) other;
        return Intrinsics.areEqual(this.type, responseProfile.type) && Intrinsics.areEqual(this.container, responseProfile.container) && Intrinsics.areEqual(this.mimeType, responseProfile.mimeType);
    }




    public int hashCode() {
        return this.mimeType.hashCode() + i02.i(this.type.hashCode() * 31, 31, this.container);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.container;
        return s01.w(kb0.z("ResponseProfile(type=", str, ", container=", str2, ", mimeType="), this.mimeType, ")");
    }
}

package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DirectPlayProfile {
    

    @SerializedName("AudioCodec")
    private final String audioCodec;

    @SerializedName(TextFieldImplKt.ContainerId)
    private final String container;

    @SerializedName("Type")
    private final String type;

    @SerializedName("VideoCodec")
    private final String videoCodec;

    public DirectPlayProfile(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.container = str2;
        this.videoCodec = str3;
        this.audioCodec = str4;
    }

    public static /* synthetic */ DirectPlayProfile copy$default(DirectPlayProfile directPlayProfile, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directPlayProfile.type;
        }
        if ((i & 2) != 0) {
            str2 = directPlayProfile.container;
        }
        if ((i & 4) != 0) {
            str3 = directPlayProfile.videoCodec;
        }
        if ((i & 8) != 0) {
            str4 = directPlayProfile.audioCodec;
        }
        return directPlayProfile.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final DirectPlayProfile copy(String type, String container, String videoCodec, String audioCodec) {
        type.getClass();
        container.getClass();
        return new DirectPlayProfile(type, container, videoCodec, audioCodec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectPlayProfile)) {
            return false;
        }
        DirectPlayProfile directPlayProfile = (DirectPlayProfile) other;
        return Intrinsics.areEqual(this.type, directPlayProfile.type) && Intrinsics.areEqual(this.container, directPlayProfile.container) && Intrinsics.areEqual(this.videoCodec, directPlayProfile.videoCodec) && Intrinsics.areEqual(this.audioCodec, directPlayProfile.audioCodec);
    }





    public int hashCode() {
        int i = i02.i(this.type.hashCode() * 31, 31, this.container);
        String str = this.videoCodec;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioCodec;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.container;
        String str3 = this.videoCodec;
        String str4 = this.audioCodec;
        StringBuilder sbZ = kb0.z("DirectPlayProfile(type=", str, ", container=", str2, ", videoCodec=");
        sbZ.append(str3);
        sbZ.append(", audioCodec=");
        sbZ.append(str4);
        sbZ.append(")");
        return sbZ.toString();
    }

    public /* synthetic */ DirectPlayProfile(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

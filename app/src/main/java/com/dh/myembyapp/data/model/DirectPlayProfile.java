package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/DirectPlayProfile;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", TtmlNode.RUBY_CONTAINER, "videoCodec", "audioCodec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getContainer", "getVideoCodec", "getAudioCodec", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DirectPlayProfile {
    public static final int $stable = 0;

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

package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TranscodingProfile {
    

    @SerializedName("AudioCodec")
    private final String audioCodec;

    @SerializedName("BreakOnNonKeyFrames")
    private final boolean breakOnNonKeyFrames;

    @SerializedName(TextFieldImplKt.ContainerId)
    private final String container;

    @SerializedName("Context")
    private final String context;

    @SerializedName("MaxAudioChannels")
    private final String maxAudioChannels;

    @SerializedName("MinSegments")
    private final int minSegments;

    @SerializedName("Protocol")
    private final String protocol;

    @SerializedName("Type")
    private final String type;

    @SerializedName("VideoCodec")
    private final String videoCodec;

    public /* synthetic */ TranscodingProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? "Streaming" : str6, (i2 & 64) != 0 ? "6" : str7, (i2 & 128) != 0 ? 2 : i, (i2 & 256) != 0 ? true : z);
    }

    public static /* synthetic */ TranscodingProfile copy$default(TranscodingProfile transcodingProfile, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transcodingProfile.type;
        }
        if ((i2 & 2) != 0) {
            str2 = transcodingProfile.container;
        }
        if ((i2 & 4) != 0) {
            str3 = transcodingProfile.videoCodec;
        }
        if ((i2 & 8) != 0) {
            str4 = transcodingProfile.audioCodec;
        }
        if ((i2 & 16) != 0) {
            str5 = transcodingProfile.protocol;
        }
        if ((i2 & 32) != 0) {
            str6 = transcodingProfile.context;
        }
        if ((i2 & 64) != 0) {
            str7 = transcodingProfile.maxAudioChannels;
        }
        if ((i2 & 128) != 0) {
            i = transcodingProfile.minSegments;
        }
        if ((i2 & 256) != 0) {
            z = transcodingProfile.breakOnNonKeyFrames;
        }
        int i3 = i;
        boolean z2 = z;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return transcodingProfile.copy(str, str2, str11, str4, str10, str8, str9, i3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final TranscodingProfile copy(String type, String container, String videoCodec, String audioCodec, String protocol, String context, String maxAudioChannels, int minSegments, boolean breakOnNonKeyFrames) {
        type.getClass();
        container.getClass();
        videoCodec.getClass();
        audioCodec.getClass();
        protocol.getClass();
        context.getClass();
        maxAudioChannels.getClass();
        return new TranscodingProfile(type, container, videoCodec, audioCodec, protocol, context, maxAudioChannels, minSegments, breakOnNonKeyFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscodingProfile)) {
            return false;
        }
        TranscodingProfile transcodingProfile = (TranscodingProfile) other;
        return Intrinsics.areEqual(this.type, transcodingProfile.type) && Intrinsics.areEqual(this.container, transcodingProfile.container) && Intrinsics.areEqual(this.videoCodec, transcodingProfile.videoCodec) && Intrinsics.areEqual(this.audioCodec, transcodingProfile.audioCodec) && Intrinsics.areEqual(this.protocol, transcodingProfile.protocol) && Intrinsics.areEqual(this.context, transcodingProfile.context) && Intrinsics.areEqual(this.maxAudioChannels, transcodingProfile.maxAudioChannels) && this.minSegments == transcodingProfile.minSegments && this.breakOnNonKeyFrames == transcodingProfile.breakOnNonKeyFrames;
    }










    public int hashCode() {
        return ((i02.i(i02.i(i02.i(i02.i(i02.i(i02.i(this.type.hashCode() * 31, 31, this.container), 31, this.videoCodec), 31, this.audioCodec), 31, this.protocol), 31, this.context), 31, this.maxAudioChannels) + this.minSegments) * 31) + (this.breakOnNonKeyFrames ? 1231 : 1237);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.container;
        String str3 = this.videoCodec;
        String str4 = this.audioCodec;
        String str5 = this.protocol;
        String str6 = this.context;
        String str7 = this.maxAudioChannels;
        int i = this.minSegments;
        boolean z = this.breakOnNonKeyFrames;
        StringBuilder sbZ = kb0.z("TranscodingProfile(type=", str, ", container=", str2, ", videoCodec=");
        i02.v(sbZ, str3, ", audioCodec=", str4, ", protocol=");
        i02.v(sbZ, str5, ", context=", str6, ", maxAudioChannels=");
        sbZ.append(str7);
        sbZ.append(", minSegments=");
        sbZ.append(i);
        sbZ.append(", breakOnNonKeyFrames=");
        return i9.i(sbZ, z, ")");
    }

    public TranscodingProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.type = str;
        this.container = str2;
        this.videoCodec = str3;
        this.audioCodec = str4;
        this.protocol = str5;
        this.context = str6;
        this.maxAudioChannels = str7;
        this.minSegments = i;
        this.breakOnNonKeyFrames = z;
    }
}

package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0014\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/dh/myembyapp/data/model/TranscodingProfile;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", TtmlNode.RUBY_CONTAINER, "videoCodec", "audioCodec", "protocol", "context", "maxAudioChannels", "minSegments", "", "breakOnNonKeyFrames", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getType", "()Ljava/lang/String;", "getContainer", "getVideoCodec", "getAudioCodec", "getProtocol", "getContext", "getMaxAudioChannels", "getMinSegments", "()I", "getBreakOnNonKeyFrames", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TranscodingProfile {
    public static final int $stable = 0;

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

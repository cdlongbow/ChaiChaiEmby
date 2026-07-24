package com.dh.myembyapp.data.model;

import androidx.exifinterface.media.ExifInterface;
import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class MediaStream {
    

    @SerializedName("AverageFrameRate")
    private final Double averageFrameRate;

    @SerializedName("BitDepth")
    private final Integer bitDepth;

    @SerializedName("BitRate")
    private final Integer bitRate;

    @SerializedName("ChannelLayout")
    private final String channelLayout;

    @SerializedName("Channels")
    private final Integer channels;

    @SerializedName("Codec")
    private final String codec;

    @SerializedName("ColorPrimaries")
    private final String colorPrimaries;

    @SerializedName(ExifInterface.TAG_COLOR_SPACE)
    private final String colorSpace;

    @SerializedName("ColorTransfer")
    private final String colorTransfer;

    @SerializedName("DeliveryMethod")
    private final String deliveryMethod;

    @SerializedName("DeliveryUrl")
    private final String deliveryUrl;

    @SerializedName("DisplayTitle")
    private final String displayTitle;

    @SerializedName("ExtendedVideoSubType")
    private final String extendedVideoSubType;

    @SerializedName("ExtendedVideoSubTypeDescription")
    private final String extendedVideoSubTypeDescription;

    @SerializedName("ExtendedVideoType")
    private final String extendedVideoType;

    @SerializedName("Height")
    private final Integer height;

    @SerializedName("Index")
    private final int index;

    @SerializedName("IsDefault")
    private final boolean isDefault;

    @SerializedName("IsExternal")
    private final boolean isExternal;

    @SerializedName("IsForced")
    private final boolean isForced;

    @SerializedName("IsInterlaced")
    private final Boolean isInterlaced;

    @SerializedName("IsTextSubtitleStream")
    private final boolean isTextSubtitleStream;

    @SerializedName("Language")
    private final String language;

    @SerializedName("Level")
    private final Double level;

    @SerializedName("Path")
    private final String path;

    @SerializedName("PixelFormat")
    private final String pixelFormat;

    @SerializedName("Profile")
    private final String profile;

    @SerializedName("RealFrameRate")
    private final Double realFrameRate;

    @SerializedName("RefFrames")
    private final Integer refFrames;

    @SerializedName("SampleRate")
    private final Integer sampleRate;

    @SerializedName("SupportsExternalStream")
    private final boolean supportsExternalStream;

    @SerializedName("Title")
    private final String title;

    @SerializedName("Type")
    private final String type;

    @SerializedName("VideoRange")
    private final String videoRange;

    @SerializedName("VideoRangeType")
    private final String videoRangeType;

    @SerializedName("Width")
    private final Integer width;

    public /* synthetic */ MediaStream(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str6, boolean z, boolean z2, boolean z3, String str7, String str8, String str9, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d3, Integer num6, String str19, Integer num7, Boolean bool, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : d, (i2 & 512) != 0 ? null : d2, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : num4, (i2 & 4096) != 0 ? null : num5, (i2 & 8192) != 0 ? null : str6, (i2 & 16384) != 0 ? false : z, (i2 & 32768) != 0 ? false : z2, (i2 & 65536) != 0 ? false : z3, (i2 & 131072) != 0 ? null : str7, (i2 & 262144) != 0 ? null : str8, (i2 & 524288) != 0 ? null : str9, (i2 & 1048576) != 0 ? false : z4, (i2 & 2097152) == 0 ? z5 : false, (i2 & 4194304) != 0 ? null : str10, (i2 & 8388608) != 0 ? null : str11, (i2 & 16777216) != 0 ? null : str12, (i2 & 33554432) != 0 ? null : str13, (i2 & 67108864) != 0 ? null : str14, (i2 & 134217728) != 0 ? null : str15, (i2 & 268435456) != 0 ? null : str16, (i2 & 536870912) != 0 ? null : str17, (i2 & 1073741824) != 0 ? null : str18, (i2 & Integer.MIN_VALUE) != 0 ? null : d3, (i3 & 1) != 0 ? null : num6, (i3 & 2) != 0 ? null : str19, (i3 & 4) != 0 ? null : num7, (i3 & 8) != 0 ? null : bool);
    }

    public static /* synthetic */ MediaStream copy$default(MediaStream mediaStream, int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str6, boolean z, boolean z2, boolean z3, String str7, String str8, String str9, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d3, Integer num6, String str19, Integer num7, Boolean bool, int i2, int i3, Object obj) {
        Boolean bool2;
        Integer num8;
        int i4 = (i2 & 1) != 0 ? mediaStream.index : i;
        String str20 = (i2 & 2) != 0 ? mediaStream.type : str;
        String str21 = (i2 & 4) != 0 ? mediaStream.codec : str2;
        String str22 = (i2 & 8) != 0 ? mediaStream.language : str3;
        String str23 = (i2 & 16) != 0 ? mediaStream.displayTitle : str4;
        String str24 = (i2 & 32) != 0 ? mediaStream.title : str5;
        Integer num9 = (i2 & 64) != 0 ? mediaStream.width : num;
        Integer num10 = (i2 & 128) != 0 ? mediaStream.height : num2;
        Double d4 = (i2 & 256) != 0 ? mediaStream.realFrameRate : d;
        Double d5 = (i2 & 512) != 0 ? mediaStream.averageFrameRate : d2;
        Integer num11 = (i2 & 1024) != 0 ? mediaStream.bitRate : num3;
        Integer num12 = (i2 & 2048) != 0 ? mediaStream.sampleRate : num4;
        Integer num13 = (i2 & 4096) != 0 ? mediaStream.channels : num5;
        String str25 = (i2 & 8192) != 0 ? mediaStream.channelLayout : str6;
        int i5 = i4;
        boolean z6 = (i2 & 16384) != 0 ? mediaStream.isExternal : z;
        boolean z7 = (i2 & 32768) != 0 ? mediaStream.isDefault : z2;
        boolean z8 = (i2 & 65536) != 0 ? mediaStream.isForced : z3;
        String str26 = (i2 & 131072) != 0 ? mediaStream.path : str7;
        String str27 = (i2 & 262144) != 0 ? mediaStream.deliveryUrl : str8;
        String str28 = (i2 & 524288) != 0 ? mediaStream.deliveryMethod : str9;
        boolean z9 = (i2 & 1048576) != 0 ? mediaStream.isTextSubtitleStream : z4;
        boolean z10 = (i2 & 2097152) != 0 ? mediaStream.supportsExternalStream : z5;
        String str29 = (i2 & 4194304) != 0 ? mediaStream.videoRangeType : str10;
        String str30 = (i2 & 8388608) != 0 ? mediaStream.videoRange : str11;
        String str31 = (i2 & 16777216) != 0 ? mediaStream.extendedVideoType : str12;
        String str32 = (i2 & 33554432) != 0 ? mediaStream.extendedVideoSubType : str13;
        String str33 = (i2 & 67108864) != 0 ? mediaStream.extendedVideoSubTypeDescription : str14;
        String str34 = (i2 & 134217728) != 0 ? mediaStream.colorSpace : str15;
        String str35 = (i2 & 268435456) != 0 ? mediaStream.colorTransfer : str16;
        String str36 = (i2 & 536870912) != 0 ? mediaStream.colorPrimaries : str17;
        String str37 = (i2 & 1073741824) != 0 ? mediaStream.profile : str18;
        Double d6 = (i2 & Integer.MIN_VALUE) != 0 ? mediaStream.level : d3;
        Integer num14 = (i3 & 1) != 0 ? mediaStream.bitDepth : num6;
        String str38 = (i3 & 2) != 0 ? mediaStream.pixelFormat : str19;
        Integer num15 = (i3 & 4) != 0 ? mediaStream.refFrames : num7;
        if ((i3 & 8) != 0) {
            num8 = num15;
            bool2 = mediaStream.isInterlaced;
        } else {
            bool2 = bool;
            num8 = num15;
        }
        return mediaStream.copy(i5, str20, str21, str22, str23, str24, num9, num10, d4, d5, num11, num12, num13, str25, z6, z7, z8, str26, str27, str28, z9, z10, str29, str30, str31, str32, str33, str34, str35, str36, str37, d6, num14, str38, num8, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component14, reason: from getter */

    /* JADX INFO: renamed from: component15, reason: from getter */

    /* JADX INFO: renamed from: component16, reason: from getter */

    /* JADX INFO: renamed from: component17, reason: from getter */

    /* JADX INFO: renamed from: component18, reason: from getter */

    /* JADX INFO: renamed from: component19, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component20, reason: from getter */

    /* JADX INFO: renamed from: component21, reason: from getter */

    /* JADX INFO: renamed from: component22, reason: from getter */

    /* JADX INFO: renamed from: component23, reason: from getter */

    /* JADX INFO: renamed from: component24, reason: from getter */

    /* JADX INFO: renamed from: component25, reason: from getter */

    /* JADX INFO: renamed from: component26, reason: from getter */

    /* JADX INFO: renamed from: component27, reason: from getter */

    /* JADX INFO: renamed from: component28, reason: from getter */

    /* JADX INFO: renamed from: component29, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component30, reason: from getter */

    /* JADX INFO: renamed from: component31, reason: from getter */

    /* JADX INFO: renamed from: component32, reason: from getter */

    /* JADX INFO: renamed from: component33, reason: from getter */

    /* JADX INFO: renamed from: component34, reason: from getter */

    /* JADX INFO: renamed from: component35, reason: from getter */

    /* JADX INFO: renamed from: component36, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final MediaStream copy(int index, String type, String codec, String language, String displayTitle, String title, Integer width, Integer height, Double realFrameRate, Double averageFrameRate, Integer bitRate, Integer sampleRate, Integer channels, String channelLayout, boolean isExternal, boolean isDefault, boolean isForced, String path, String deliveryUrl, String deliveryMethod, boolean isTextSubtitleStream, boolean supportsExternalStream, String videoRangeType, String videoRange, String extendedVideoType, String extendedVideoSubType, String extendedVideoSubTypeDescription, String colorSpace, String colorTransfer, String colorPrimaries, String profile, Double level, Integer bitDepth, String pixelFormat, Integer refFrames, Boolean isInterlaced) {
        type.getClass();
        return new MediaStream(index, type, codec, language, displayTitle, title, width, height, realFrameRate, averageFrameRate, bitRate, sampleRate, channels, channelLayout, isExternal, isDefault, isForced, path, deliveryUrl, deliveryMethod, isTextSubtitleStream, supportsExternalStream, videoRangeType, videoRange, extendedVideoType, extendedVideoSubType, extendedVideoSubTypeDescription, colorSpace, colorTransfer, colorPrimaries, profile, level, bitDepth, pixelFormat, refFrames, isInterlaced);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStream)) {
            return false;
        }
        MediaStream mediaStream = (MediaStream) other;
        return this.index == mediaStream.index && Intrinsics.areEqual(this.type, mediaStream.type) && Intrinsics.areEqual(this.codec, mediaStream.codec) && Intrinsics.areEqual(this.language, mediaStream.language) && Intrinsics.areEqual(this.displayTitle, mediaStream.displayTitle) && Intrinsics.areEqual(this.title, mediaStream.title) && Intrinsics.areEqual(this.width, mediaStream.width) && Intrinsics.areEqual(this.height, mediaStream.height) && Intrinsics.areEqual((Object) this.realFrameRate, (Object) mediaStream.realFrameRate) && Intrinsics.areEqual((Object) this.averageFrameRate, (Object) mediaStream.averageFrameRate) && Intrinsics.areEqual(this.bitRate, mediaStream.bitRate) && Intrinsics.areEqual(this.sampleRate, mediaStream.sampleRate) && Intrinsics.areEqual(this.channels, mediaStream.channels) && Intrinsics.areEqual(this.channelLayout, mediaStream.channelLayout) && this.isExternal == mediaStream.isExternal && this.isDefault == mediaStream.isDefault && this.isForced == mediaStream.isForced && Intrinsics.areEqual(this.path, mediaStream.path) && Intrinsics.areEqual(this.deliveryUrl, mediaStream.deliveryUrl) && Intrinsics.areEqual(this.deliveryMethod, mediaStream.deliveryMethod) && this.isTextSubtitleStream == mediaStream.isTextSubtitleStream && this.supportsExternalStream == mediaStream.supportsExternalStream && Intrinsics.areEqual(this.videoRangeType, mediaStream.videoRangeType) && Intrinsics.areEqual(this.videoRange, mediaStream.videoRange) && Intrinsics.areEqual(this.extendedVideoType, mediaStream.extendedVideoType) && Intrinsics.areEqual(this.extendedVideoSubType, mediaStream.extendedVideoSubType) && Intrinsics.areEqual(this.extendedVideoSubTypeDescription, mediaStream.extendedVideoSubTypeDescription) && Intrinsics.areEqual(this.colorSpace, mediaStream.colorSpace) && Intrinsics.areEqual(this.colorTransfer, mediaStream.colorTransfer) && Intrinsics.areEqual(this.colorPrimaries, mediaStream.colorPrimaries) && Intrinsics.areEqual(this.profile, mediaStream.profile) && Intrinsics.areEqual((Object) this.level, (Object) mediaStream.level) && Intrinsics.areEqual(this.bitDepth, mediaStream.bitDepth) && Intrinsics.areEqual(this.pixelFormat, mediaStream.pixelFormat) && Intrinsics.areEqual(this.refFrames, mediaStream.refFrames) && Intrinsics.areEqual(this.isInterlaced, mediaStream.isInterlaced);
    }

    public int hashCode() {
        int i = i02.i(this.index * 31, 31, this.type);
        String str = this.codec;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.language;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.realFrameRate;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.averageFrameRate;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num3 = this.bitRate;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sampleRate;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.channels;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.channelLayout;
        int iHashCode12 = (((((((iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.isExternal ? 1231 : 1237)) * 31) + (this.isDefault ? 1231 : 1237)) * 31) + (this.isForced ? 1231 : 1237)) * 31;
        String str6 = this.path;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deliveryUrl;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryMethod;
        int iHashCode15 = (((((iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31) + (this.isTextSubtitleStream ? 1231 : 1237)) * 31) + (this.supportsExternalStream ? 1231 : 1237)) * 31;
        String str9 = this.videoRangeType;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.videoRange;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.extendedVideoType;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.extendedVideoSubType;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.extendedVideoSubTypeDescription;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.colorSpace;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.colorTransfer;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.colorPrimaries;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.profile;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Double d3 = this.level;
        int iHashCode25 = (iHashCode24 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num6 = this.bitDepth;
        int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str18 = this.pixelFormat;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num7 = this.refFrames;
        int iHashCode28 = (iHashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.isInterlaced;
        return iHashCode28 + (bool != null ? bool.hashCode() : 0);
    }






    public String toString() {
        int i = this.index;
        String str = this.type;
        String str2 = this.codec;
        String str3 = this.language;
        String str4 = this.displayTitle;
        String str5 = this.title;
        Integer num = this.width;
        Integer num2 = this.height;
        Double d = this.realFrameRate;
        Double d2 = this.averageFrameRate;
        Integer num3 = this.bitRate;
        Integer num4 = this.sampleRate;
        Integer num5 = this.channels;
        String str6 = this.channelLayout;
        boolean z = this.isExternal;
        boolean z2 = this.isDefault;
        boolean z3 = this.isForced;
        String str7 = this.path;
        String str8 = this.deliveryUrl;
        String str9 = this.deliveryMethod;
        boolean z4 = this.isTextSubtitleStream;
        boolean z5 = this.supportsExternalStream;
        String str10 = this.videoRangeType;
        String str11 = this.videoRange;
        String str12 = this.extendedVideoType;
        String str13 = this.extendedVideoSubType;
        String str14 = this.extendedVideoSubTypeDescription;
        String str15 = this.colorSpace;
        String str16 = this.colorTransfer;
        String str17 = this.colorPrimaries;
        String str18 = this.profile;
        Double d3 = this.level;
        Integer num6 = this.bitDepth;
        String str19 = this.pixelFormat;
        Integer num7 = this.refFrames;
        Boolean bool = this.isInterlaced;
        StringBuilder sb = new StringBuilder("MediaStream(index=");
        sb.append(i);
        sb.append(", type=");
        sb.append(str);
        sb.append(", codec=");
        i02.v(sb, str2, ", language=", str3, ", displayTitle=");
        i02.v(sb, str4, ", title=", str5, ", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", realFrameRate=");
        sb.append(d);
        sb.append(", averageFrameRate=");
        sb.append(d2);
        sb.append(", bitRate=");
        sb.append(num3);
        sb.append(", sampleRate=");
        sb.append(num4);
        sb.append(", channels=");
        sb.append(num5);
        sb.append(", channelLayout=");
        sb.append(str6);
        sb.append(", isExternal=");
        i9.r(sb, z, ", isDefault=", z2, ", isForced=");
        sb.append(z3);
        sb.append(", path=");
        sb.append(str7);
        sb.append(", deliveryUrl=");
        i02.v(sb, str8, ", deliveryMethod=", str9, ", isTextSubtitleStream=");
        i9.r(sb, z4, ", supportsExternalStream=", z5, ", videoRangeType=");
        i02.v(sb, str10, ", videoRange=", str11, ", extendedVideoType=");
        i02.v(sb, str12, ", extendedVideoSubType=", str13, ", extendedVideoSubTypeDescription=");
        i02.v(sb, str14, ", colorSpace=", str15, ", colorTransfer=");
        i02.v(sb, str16, ", colorPrimaries=", str17, ", profile=");
        sb.append(str18);
        sb.append(", level=");
        sb.append(d3);
        sb.append(", bitDepth=");
        sb.append(num6);
        sb.append(", pixelFormat=");
        sb.append(str19);
        sb.append(", refFrames=");
        sb.append(num7);
        sb.append(", isInterlaced=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public MediaStream(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str6, boolean z, boolean z2, boolean z3, String str7, String str8, String str9, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d3, Integer num6, String str19, Integer num7, Boolean bool) {
        str.getClass();
        this.index = i;
        this.type = str;
        this.codec = str2;
        this.language = str3;
        this.displayTitle = str4;
        this.title = str5;
        this.width = num;
        this.height = num2;
        this.realFrameRate = d;
        this.averageFrameRate = d2;
        this.bitRate = num3;
        this.sampleRate = num4;
        this.channels = num5;
        this.channelLayout = str6;
        this.isExternal = z;
        this.isDefault = z2;
        this.isForced = z3;
        this.path = str7;
        this.deliveryUrl = str8;
        this.deliveryMethod = str9;
        this.isTextSubtitleStream = z4;
        this.supportsExternalStream = z5;
        this.videoRangeType = str10;
        this.videoRange = str11;
        this.extendedVideoType = str12;
        this.extendedVideoSubType = str13;
        this.extendedVideoSubTypeDescription = str14;
        this.colorSpace = str15;
        this.colorTransfer = str16;
        this.colorPrimaries = str17;
        this.profile = str18;
        this.level = d3;
        this.bitDepth = num6;
        this.pixelFormat = str19;
        this.refFrames = num7;
        this.isInterlaced = bool;
    }
}

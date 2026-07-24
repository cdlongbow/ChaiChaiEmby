package com.dh.myembyapp.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TranscodeQualityOption {
    
    private final long bitrate;
    private final boolean disablesTranscoding;
    private final boolean isAuto;
    private final Integer maxHeight;
    private final Integer maxWidth;
    private final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TranscodeQualityOption(String str, long j, Integer num, Integer num2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        num = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            num2 = num != null ? Integer.valueOf((int) Math.ceil((((double) num.intValue()) * 16.0d) / 9.0d)) : null;
        }
        this(str, j, num, num2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public static /* synthetic */ TranscodeQualityOption copy$default(TranscodeQualityOption transcodeQualityOption, String str, long j, Integer num, Integer num2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcodeQualityOption.name;
        }
        if ((i & 2) != 0) {
            j = transcodeQualityOption.bitrate;
        }
        if ((i & 4) != 0) {
            num = transcodeQualityOption.maxHeight;
        }
        if ((i & 8) != 0) {
            num2 = transcodeQualityOption.maxWidth;
        }
        if ((i & 16) != 0) {
            z = transcodeQualityOption.isAuto;
        }
        if ((i & 32) != 0) {
            z2 = transcodeQualityOption.disablesTranscoding;
        }
        return transcodeQualityOption.copy(str, j, num, num2, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    public final TranscodeQualityOption copy(String name, long bitrate, Integer maxHeight, Integer maxWidth, boolean isAuto, boolean disablesTranscoding) {
        name.getClass();
        return new TranscodeQualityOption(name, bitrate, maxHeight, maxWidth, isAuto, disablesTranscoding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscodeQualityOption)) {
            return false;
        }
        TranscodeQualityOption transcodeQualityOption = (TranscodeQualityOption) other;
        return Intrinsics.areEqual(this.name, transcodeQualityOption.name) && this.bitrate == transcodeQualityOption.bitrate && Intrinsics.areEqual(this.maxHeight, transcodeQualityOption.maxHeight) && Intrinsics.areEqual(this.maxWidth, transcodeQualityOption.maxWidth) && this.isAuto == transcodeQualityOption.isAuto && this.disablesTranscoding == transcodeQualityOption.disablesTranscoding;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        long j = this.bitrate;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Integer num = this.maxHeight;
        int iHashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxWidth;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.isAuto ? 1231 : 1237)) * 31) + (this.disablesTranscoding ? 1231 : 1237);
    }


    public String toString() {
        return "TranscodeQualityOption(name=" + this.name + ", bitrate=" + this.bitrate + ", maxHeight=" + this.maxHeight + ", maxWidth=" + this.maxWidth + ", isAuto=" + this.isAuto + ", disablesTranscoding=" + this.disablesTranscoding + ")";
    }

    public TranscodeQualityOption(String str, long j, Integer num, Integer num2, boolean z, boolean z2) {
        str.getClass();
        this.name = str;
        this.bitrate = j;
        this.maxHeight = num;
        this.maxWidth = num2;
        this.isAuto = z;
        this.disablesTranscoding = z2;
    }
}

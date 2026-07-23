package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lcom/dh/myembyapp/data/model/TranscodeQualityOption;", "", "name", "", "bitrate", "", "maxHeight", "", "maxWidth", "isAuto", "", "disablesTranscoding", "<init>", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;ZZ)V", "getName", "()Ljava/lang/String;", "getBitrate", "()J", "getMaxHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxWidth", "()Z", "getDisablesTranscoding", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;ZZ)Lcom/dh/myembyapp/data/model/TranscodeQualityOption;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TranscodeQualityOption {
    public static final int $stable = 0;
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

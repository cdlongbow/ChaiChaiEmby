package com.dh.myembyapp.data;

import defpackage.c61;
import defpackage.i02;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class VideoVersionMemory {
    
    private final String itemId;
    private final String key;
    private final String mediaSourceId;
    private final String quality;
    private final Integer resolutionSortValue;
    private final Integer stableMatchIndex;
    private final long timestamp;

    public /* synthetic */ VideoVersionMemory(String str, String str2, String str3, String str4, Integer num, Integer num2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? System.currentTimeMillis() : j);
    }

    public static /* synthetic */ VideoVersionMemory copy$default(VideoVersionMemory videoVersionMemory, String str, String str2, String str3, String str4, Integer num, Integer num2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoVersionMemory.key;
        }
        if ((i & 2) != 0) {
            str2 = videoVersionMemory.itemId;
        }
        if ((i & 4) != 0) {
            str3 = videoVersionMemory.mediaSourceId;
        }
        if ((i & 8) != 0) {
            str4 = videoVersionMemory.quality;
        }
        if ((i & 16) != 0) {
            num = videoVersionMemory.resolutionSortValue;
        }
        if ((i & 32) != 0) {
            num2 = videoVersionMemory.stableMatchIndex;
        }
        if ((i & 64) != 0) {
            j = videoVersionMemory.timestamp;
        }
        long j2 = j;
        Integer num3 = num;
        Integer num4 = num2;
        return videoVersionMemory.copy(str, str2, str3, str4, num3, num4, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final VideoVersionMemory copy(String key, String itemId, String mediaSourceId, String quality, Integer resolutionSortValue, Integer stableMatchIndex, long timestamp) {
        return new VideoVersionMemory(key, itemId, mediaSourceId, quality, resolutionSortValue, stableMatchIndex, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoVersionMemory)) {
            return false;
        }
        VideoVersionMemory videoVersionMemory = (VideoVersionMemory) other;
        return Intrinsics.areEqual(this.key, videoVersionMemory.key) && Intrinsics.areEqual(this.itemId, videoVersionMemory.itemId) && Intrinsics.areEqual(this.mediaSourceId, videoVersionMemory.mediaSourceId) && Intrinsics.areEqual(this.quality, videoVersionMemory.quality) && Intrinsics.areEqual(this.resolutionSortValue, videoVersionMemory.resolutionSortValue) && Intrinsics.areEqual(this.stableMatchIndex, videoVersionMemory.stableMatchIndex) && this.timestamp == videoVersionMemory.timestamp;
    }








    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaSourceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quality;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.resolutionSortValue;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stableMatchIndex;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        long j = this.timestamp;
        return iHashCode6 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        String str = this.key;
        String str2 = this.itemId;
        String str3 = this.mediaSourceId;
        String str4 = this.quality;
        Integer num = this.resolutionSortValue;
        Integer num2 = this.stableMatchIndex;
        long j = this.timestamp;
        StringBuilder sbZ = kb0.z("VideoVersionMemory(key=", str, ", itemId=", str2, ", mediaSourceId=");
        i02.v(sbZ, str3, ", quality=", str4, ", resolutionSortValue=");
        sbZ.append(num);
        sbZ.append(", stableMatchIndex=");
        sbZ.append(num2);
        sbZ.append(", timestamp=");
        return c61.i(j, ")", sbZ);
    }

    public VideoVersionMemory(String str, String str2, String str3, String str4, Integer num, Integer num2, long j) {
        this.key = str;
        this.itemId = str2;
        this.mediaSourceId = str3;
        this.quality = str4;
        this.resolutionSortValue = num;
        this.stableMatchIndex = num2;
        this.timestamp = j;
    }

    public VideoVersionMemory() {
        this(null, null, null, null, null, null, 0L, 127, null);
    }
}

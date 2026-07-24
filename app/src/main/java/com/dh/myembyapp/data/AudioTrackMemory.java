package com.dh.myembyapp.data;

import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class AudioTrackMemory {
    
    private final Integer apiStreamIndex;
    private final Integer channelCount;
    private final String codecType;
    private final String itemId;
    private final String key;
    private final String languagePreference;
    private final long timestamp;
    private final String titleKey;

    public /* synthetic */ AudioTrackMemory(String str, String str2, Integer num, String str3, String str4, Integer num2, String str5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? System.currentTimeMillis() : j);
    }

    public static /* synthetic */ AudioTrackMemory copy$default(AudioTrackMemory audioTrackMemory, String str, String str2, Integer num, String str3, String str4, Integer num2, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioTrackMemory.key;
        }
        if ((i & 2) != 0) {
            str2 = audioTrackMemory.itemId;
        }
        if ((i & 4) != 0) {
            num = audioTrackMemory.apiStreamIndex;
        }
        if ((i & 8) != 0) {
            str3 = audioTrackMemory.languagePreference;
        }
        if ((i & 16) != 0) {
            str4 = audioTrackMemory.codecType;
        }
        if ((i & 32) != 0) {
            num2 = audioTrackMemory.channelCount;
        }
        if ((i & 64) != 0) {
            str5 = audioTrackMemory.titleKey;
        }
        if ((i & 128) != 0) {
            j = audioTrackMemory.timestamp;
        }
        long j2 = j;
        Integer num3 = num2;
        String str6 = str5;
        String str7 = str4;
        Integer num4 = num;
        return audioTrackMemory.copy(str, str2, num4, str3, str7, num3, str6, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    public final AudioTrackMemory copy(String key, String itemId, Integer apiStreamIndex, String languagePreference, String codecType, Integer channelCount, String titleKey, long timestamp) {
        return new AudioTrackMemory(key, itemId, apiStreamIndex, languagePreference, codecType, channelCount, titleKey, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackMemory)) {
            return false;
        }
        AudioTrackMemory audioTrackMemory = (AudioTrackMemory) other;
        return Intrinsics.areEqual(this.key, audioTrackMemory.key) && Intrinsics.areEqual(this.itemId, audioTrackMemory.itemId) && Intrinsics.areEqual(this.apiStreamIndex, audioTrackMemory.apiStreamIndex) && Intrinsics.areEqual(this.languagePreference, audioTrackMemory.languagePreference) && Intrinsics.areEqual(this.codecType, audioTrackMemory.codecType) && Intrinsics.areEqual(this.channelCount, audioTrackMemory.channelCount) && Intrinsics.areEqual(this.titleKey, audioTrackMemory.titleKey) && this.timestamp == audioTrackMemory.timestamp;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.apiStreamIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.languagePreference;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.codecType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.channelCount;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.titleKey;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j = this.timestamp;
        return iHashCode7 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        String str = this.key;
        String str2 = this.itemId;
        Integer num = this.apiStreamIndex;
        String str3 = this.languagePreference;
        String str4 = this.codecType;
        Integer num2 = this.channelCount;
        String str5 = this.titleKey;
        long j = this.timestamp;
        StringBuilder sbZ = kb0.z("AudioTrackMemory(key=", str, ", itemId=", str2, ", apiStreamIndex=");
        sbZ.append(num);
        sbZ.append(", languagePreference=");
        sbZ.append(str3);
        sbZ.append(", codecType=");
        sbZ.append(str4);
        sbZ.append(", channelCount=");
        sbZ.append(num2);
        sbZ.append(", titleKey=");
        sbZ.append(str5);
        sbZ.append(", timestamp=");
        sbZ.append(j);
        sbZ.append(")");
        return sbZ.toString();
    }

    public AudioTrackMemory(String str, String str2, Integer num, String str3, String str4, Integer num2, String str5, long j) {
        this.key = str;
        this.itemId = str2;
        this.apiStreamIndex = num;
        this.languagePreference = str3;
        this.codecType = str4;
        this.channelCount = num2;
        this.titleKey = str5;
        this.timestamp = j;
    }

    public AudioTrackMemory() {
        this(null, null, null, null, null, null, null, 0L, 255, null);
    }
}

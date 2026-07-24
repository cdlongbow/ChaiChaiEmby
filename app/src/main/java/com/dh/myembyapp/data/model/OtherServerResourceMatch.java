package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.ll0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class OtherServerResourceMatch {
    
    private final int bitrateSortValue;
    private final MediaItem item;
    private final String matchedByProvider;
    private final String matchedEpisodeId;
    private final String matchedEpisodeLabel;
    private final MediaSource mediaSource;
    private final int resolutionSortValue;

    public /* synthetic */ OtherServerResourceMatch(MediaItem mediaItem, String str, String str2, String str3, MediaSource mediaSource, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaItem, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : mediaSource, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }

    public static /* synthetic */ OtherServerResourceMatch copy$default(OtherServerResourceMatch otherServerResourceMatch, MediaItem mediaItem, String str, String str2, String str3, MediaSource mediaSource, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            mediaItem = otherServerResourceMatch.item;
        }
        if ((i3 & 2) != 0) {
            str = otherServerResourceMatch.matchedEpisodeId;
        }
        if ((i3 & 4) != 0) {
            str2 = otherServerResourceMatch.matchedEpisodeLabel;
        }
        if ((i3 & 8) != 0) {
            str3 = otherServerResourceMatch.matchedByProvider;
        }
        if ((i3 & 16) != 0) {
            mediaSource = otherServerResourceMatch.mediaSource;
        }
        if ((i3 & 32) != 0) {
            i = otherServerResourceMatch.resolutionSortValue;
        }
        if ((i3 & 64) != 0) {
            i2 = otherServerResourceMatch.bitrateSortValue;
        }
        int i4 = i;
        int i5 = i2;
        MediaSource mediaSource2 = mediaSource;
        String str4 = str2;
        return otherServerResourceMatch.copy(mediaItem, str, str4, str3, mediaSource2, i4, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final OtherServerResourceMatch copy(MediaItem item, String matchedEpisodeId, String matchedEpisodeLabel, String matchedByProvider, MediaSource mediaSource, int resolutionSortValue, int bitrateSortValue) {
        item.getClass();
        return new OtherServerResourceMatch(item, matchedEpisodeId, matchedEpisodeLabel, matchedByProvider, mediaSource, resolutionSortValue, bitrateSortValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherServerResourceMatch)) {
            return false;
        }
        OtherServerResourceMatch otherServerResourceMatch = (OtherServerResourceMatch) other;
        return Intrinsics.areEqual(this.item, otherServerResourceMatch.item) && Intrinsics.areEqual(this.matchedEpisodeId, otherServerResourceMatch.matchedEpisodeId) && Intrinsics.areEqual(this.matchedEpisodeLabel, otherServerResourceMatch.matchedEpisodeLabel) && Intrinsics.areEqual(this.matchedByProvider, otherServerResourceMatch.matchedByProvider) && Intrinsics.areEqual(this.mediaSource, otherServerResourceMatch.mediaSource) && this.resolutionSortValue == otherServerResourceMatch.resolutionSortValue && this.bitrateSortValue == otherServerResourceMatch.bitrateSortValue;
    }








    public int hashCode() {
        int iHashCode = this.item.hashCode() * 31;
        String str = this.matchedEpisodeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.matchedEpisodeLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchedByProvider;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MediaSource mediaSource = this.mediaSource;
        return ((((iHashCode4 + (mediaSource != null ? mediaSource.hashCode() : 0)) * 31) + this.resolutionSortValue) * 31) + this.bitrateSortValue;
    }

    public String toString() {
        MediaItem mediaItem = this.item;
        String str = this.matchedEpisodeId;
        String str2 = this.matchedEpisodeLabel;
        String str3 = this.matchedByProvider;
        MediaSource mediaSource = this.mediaSource;
        int i = this.resolutionSortValue;
        int i2 = this.bitrateSortValue;
        StringBuilder sb = new StringBuilder("OtherServerResourceMatch(item=");
        sb.append(mediaItem);
        sb.append(", matchedEpisodeId=");
        sb.append(str);
        sb.append(", matchedEpisodeLabel=");
        i02.v(sb, str2, ", matchedByProvider=", str3, ", mediaSource=");
        sb.append(mediaSource);
        sb.append(", resolutionSortValue=");
        sb.append(i);
        sb.append(", bitrateSortValue=");
        return ll0.f(sb, i2, ")");
    }

    public OtherServerResourceMatch(MediaItem mediaItem, String str, String str2, String str3, MediaSource mediaSource, int i, int i2) {
        mediaItem.getClass();
        this.item = mediaItem;
        this.matchedEpisodeId = str;
        this.matchedEpisodeLabel = str2;
        this.matchedByProvider = str3;
        this.mediaSource = mediaSource;
        this.resolutionSortValue = i;
        this.bitrateSortValue = i2;
    }
}

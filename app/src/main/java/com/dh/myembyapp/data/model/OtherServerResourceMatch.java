package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.ll0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, d2 = {"Lcom/dh/myembyapp/data/model/OtherServerResourceMatch;", "", "item", "Lcom/dh/myembyapp/data/model/MediaItem;", "matchedEpisodeId", "", "matchedEpisodeLabel", "matchedByProvider", "mediaSource", "Lcom/dh/myembyapp/data/model/MediaSource;", "resolutionSortValue", "", "bitrateSortValue", "<init>", "(Lcom/dh/myembyapp/data/model/MediaItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dh/myembyapp/data/model/MediaSource;II)V", "getItem", "()Lcom/dh/myembyapp/data/model/MediaItem;", "getMatchedEpisodeId", "()Ljava/lang/String;", "getMatchedEpisodeLabel", "getMatchedByProvider", "getMediaSource", "()Lcom/dh/myembyapp/data/model/MediaSource;", "getResolutionSortValue", "()I", "getBitrateSortValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OtherServerResourceMatch {
    public static final int $stable = 8;
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

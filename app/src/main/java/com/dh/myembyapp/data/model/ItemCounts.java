package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.c61;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final  class ItemCounts {
    

    @SerializedName("AlbumCount")
    private final int albumCount;

    @SerializedName("ArtistCount")
    private final int artistCount;

    @SerializedName("BookCount")
    private final int bookCount;

    @SerializedName("BoxSetCount")
    private final int boxSetCount;

    @SerializedName("EpisodeCount")
    private final int episodeCount;

    @SerializedName("GameCount")
    private final int gameCount;

    @SerializedName("GameSystemCount")
    private final int gameSystemCount;

    @SerializedName("ItemCount")
    private final int itemCount;

    @SerializedName("MovieCount")
    private final int movieCount;

    @SerializedName("MusicVideoCount")
    private final int musicVideoCount;

    @SerializedName("ProgramCount")
    private final int programCount;

    @SerializedName("SeriesCount")
    private final int seriesCount;

    @SerializedName("SongCount")
    private final int songCount;

    @SerializedName("TrailerCount")
    private final int trailerCount;

    public /* synthetic */ ItemCounts(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i, (i15 & 2) != 0 ? 0 : i2, (i15 & 4) != 0 ? 0 : i3, (i15 & 8) != 0 ? 0 : i4, (i15 & 16) != 0 ? 0 : i5, (i15 & 32) != 0 ? 0 : i6, (i15 & 64) != 0 ? 0 : i7, (i15 & 128) != 0 ? 0 : i8, (i15 & 256) != 0 ? 0 : i9, (i15 & 512) != 0 ? 0 : i10, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 0 : i12, (i15 & 4096) != 0 ? 0 : i13, (i15 & 8192) != 0 ? 0 : i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component14, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final ItemCounts copy(int movieCount, int seriesCount, int episodeCount, int gameCount, int artistCount, int programCount, int gameSystemCount, int trailerCount, int songCount, int albumCount, int musicVideoCount, int boxSetCount, int bookCount, int itemCount) {
        return new ItemCounts(movieCount, seriesCount, episodeCount, gameCount, artistCount, programCount, gameSystemCount, trailerCount, songCount, albumCount, musicVideoCount, boxSetCount, bookCount, itemCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemCounts)) {
            return false;
        }
        ItemCounts itemCounts = (ItemCounts) other;
        return this.movieCount == itemCounts.movieCount && this.seriesCount == itemCounts.seriesCount && this.episodeCount == itemCounts.episodeCount && this.gameCount == itemCounts.gameCount && this.artistCount == itemCounts.artistCount && this.programCount == itemCounts.programCount && this.gameSystemCount == itemCounts.gameSystemCount && this.trailerCount == itemCounts.trailerCount && this.songCount == itemCounts.songCount && this.albumCount == itemCounts.albumCount && this.musicVideoCount == itemCounts.musicVideoCount && this.boxSetCount == itemCounts.boxSetCount && this.bookCount == itemCounts.bookCount && this.itemCount == itemCounts.itemCount;
    }















    public int hashCode() {
        return (((((((((((((((((((((((((this.movieCount * 31) + this.seriesCount) * 31) + this.episodeCount) * 31) + this.gameCount) * 31) + this.artistCount) * 31) + this.programCount) * 31) + this.gameSystemCount) * 31) + this.trailerCount) * 31) + this.songCount) * 31) + this.albumCount) * 31) + this.musicVideoCount) * 31) + this.boxSetCount) * 31) + this.bookCount) * 31) + this.itemCount;
    }

    public String toString() {
        int i = this.movieCount;
        int i2 = this.seriesCount;
        int i3 = this.episodeCount;
        int i4 = this.gameCount;
        int i5 = this.artistCount;
        int i6 = this.programCount;
        int i7 = this.gameSystemCount;
        int i8 = this.trailerCount;
        int i9 = this.songCount;
        int i10 = this.albumCount;
        int i11 = this.musicVideoCount;
        int i12 = this.boxSetCount;
        int i13 = this.bookCount;
        int i14 = this.itemCount;
        StringBuilder sbO = c61.o("ItemCounts(movieCount=", i, i2, ", seriesCount=", ", episodeCount=");
        c61.t(sbO, i3, ", gameCount=", i4, ", artistCount=");
        c61.t(sbO, i5, ", programCount=", i6, ", gameSystemCount=");
        c61.t(sbO, i7, ", trailerCount=", i8, ", songCount=");
        c61.t(sbO, i9, ", albumCount=", i10, ", musicVideoCount=");
        c61.t(sbO, i11, ", boxSetCount=", i12, ", bookCount=");
        sbO.append(i13);
        sbO.append(", itemCount=");
        sbO.append(i14);
        sbO.append(")");
        return sbO.toString();
    }

    public ItemCounts(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.movieCount = i;
        this.seriesCount = i2;
        this.episodeCount = i3;
        this.gameCount = i4;
        this.artistCount = i5;
        this.programCount = i6;
        this.gameSystemCount = i7;
        this.trailerCount = i8;
        this.songCount = i9;
        this.albumCount = i10;
        this.musicVideoCount = i11;
        this.boxSetCount = i12;
        this.bookCount = i13;
        this.itemCount = i14;
    }

    public ItemCounts() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16383, null);
    }
}

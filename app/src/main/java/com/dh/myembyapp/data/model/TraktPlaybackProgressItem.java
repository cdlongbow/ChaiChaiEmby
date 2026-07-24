package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktPlaybackProgressItem {
    

    @SerializedName("episode")
    private final TraktEpisode episode;

    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    @SerializedName("movie")
    private final TraktMovie movie;

    @SerializedName("paused_at")
    private final String pausedAt;

    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final double progress;

    @SerializedName("show")
    private final TraktShow show;

    @SerializedName(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    private final String type;

    public /* synthetic */ TraktPlaybackProgressItem(double d, String str, Long l, String str2, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : traktMovie, (i & 32) != 0 ? null : traktShow, (i & 64) != 0 ? null : traktEpisode);
    }

    public static /* synthetic */ TraktPlaybackProgressItem copy$default(TraktPlaybackProgressItem traktPlaybackProgressItem, double d, String str, Long l, String str2, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode, int i, Object obj) {
        if ((i & 1) != 0) {
            d = traktPlaybackProgressItem.progress;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = traktPlaybackProgressItem.pausedAt;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            l = traktPlaybackProgressItem.id;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str2 = traktPlaybackProgressItem.type;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            traktMovie = traktPlaybackProgressItem.movie;
        }
        return traktPlaybackProgressItem.copy(d2, str3, l2, str4, traktMovie, (i & 32) != 0 ? traktPlaybackProgressItem.show : traktShow, (i & 64) != 0 ? traktPlaybackProgressItem.episode : traktEpisode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final TraktPlaybackProgressItem copy(double progress, String pausedAt, Long id, String type, TraktMovie movie, TraktShow show, TraktEpisode episode) {
        return new TraktPlaybackProgressItem(progress, pausedAt, id, type, movie, show, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktPlaybackProgressItem)) {
            return false;
        }
        TraktPlaybackProgressItem traktPlaybackProgressItem = (TraktPlaybackProgressItem) other;
        return Double.compare(this.progress, traktPlaybackProgressItem.progress) == 0 && Intrinsics.areEqual(this.pausedAt, traktPlaybackProgressItem.pausedAt) && Intrinsics.areEqual(this.id, traktPlaybackProgressItem.id) && Intrinsics.areEqual(this.type, traktPlaybackProgressItem.type) && Intrinsics.areEqual(this.movie, traktPlaybackProgressItem.movie) && Intrinsics.areEqual(this.show, traktPlaybackProgressItem.show) && Intrinsics.areEqual(this.episode, traktPlaybackProgressItem.episode);
    }








    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.progress);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        String str = this.pausedAt;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TraktMovie traktMovie = this.movie;
        int iHashCode4 = (iHashCode3 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.show;
        int iHashCode5 = (iHashCode4 + (traktShow == null ? 0 : traktShow.hashCode())) * 31;
        TraktEpisode traktEpisode = this.episode;
        return iHashCode5 + (traktEpisode != null ? traktEpisode.hashCode() : 0);
    }

    public String toString() {
        return "TraktPlaybackProgressItem(progress=" + this.progress + ", pausedAt=" + this.pausedAt + ", id=" + this.id + ", type=" + this.type + ", movie=" + this.movie + ", show=" + this.show + ", episode=" + this.episode + ")";
    }

    public TraktPlaybackProgressItem(double d, String str, Long l, String str2, TraktMovie traktMovie, TraktShow traktShow, TraktEpisode traktEpisode) {
        this.progress = d;
        this.pausedAt = str;
        this.id = l;
        this.type = str2;
        this.movie = traktMovie;
        this.show = traktShow;
        this.episode = traktEpisode;
    }

    public TraktPlaybackProgressItem() {
        this(0.0d, null, null, null, null, null, null, 127, null);
    }
}

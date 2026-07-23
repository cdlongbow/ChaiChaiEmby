package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/dh/myembyapp/data/model/TraktPlaybackProgressItem;", "", NotificationCompat.CATEGORY_PROGRESS, "", "pausedAt", "", TtmlNode.ATTR_ID, "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "movie", "Lcom/dh/myembyapp/data/model/TraktMovie;", "show", "Lcom/dh/myembyapp/data/model/TraktShow;", "episode", "Lcom/dh/myembyapp/data/model/TraktEpisode;", "<init>", "(DLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktMovie;Lcom/dh/myembyapp/data/model/TraktShow;Lcom/dh/myembyapp/data/model/TraktEpisode;)V", "getProgress", "()D", "getPausedAt", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getMovie", "()Lcom/dh/myembyapp/data/model/TraktMovie;", "getShow", "()Lcom/dh/myembyapp/data/model/TraktShow;", "getEpisode", "()Lcom/dh/myembyapp/data/model/TraktEpisode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(DLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktMovie;Lcom/dh/myembyapp/data/model/TraktShow;Lcom/dh/myembyapp/data/model/TraktEpisode;)Lcom/dh/myembyapp/data/model/TraktPlaybackProgressItem;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktPlaybackProgressItem {
    public static final int $stable = 0;

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

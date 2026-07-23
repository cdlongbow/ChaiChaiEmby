package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/TraktScrobbleRequest;", "", NotificationCompat.CATEGORY_PROGRESS, "", "movie", "Lcom/dh/myembyapp/data/model/TraktScrobbleMovie;", "show", "Lcom/dh/myembyapp/data/model/TraktScrobbleShow;", "episode", "Lcom/dh/myembyapp/data/model/TraktScrobbleEpisode;", "<init>", "(DLcom/dh/myembyapp/data/model/TraktScrobbleMovie;Lcom/dh/myembyapp/data/model/TraktScrobbleShow;Lcom/dh/myembyapp/data/model/TraktScrobbleEpisode;)V", "getProgress", "()D", "getMovie", "()Lcom/dh/myembyapp/data/model/TraktScrobbleMovie;", "getShow", "()Lcom/dh/myembyapp/data/model/TraktScrobbleShow;", "getEpisode", "()Lcom/dh/myembyapp/data/model/TraktScrobbleEpisode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktScrobbleRequest {
    public static final int $stable = 0;

    @SerializedName("episode")
    private final TraktScrobbleEpisode episode;

    @SerializedName("movie")
    private final TraktScrobbleMovie movie;

    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final double progress;

    @SerializedName("show")
    private final TraktScrobbleShow show;

    public /* synthetic */ TraktScrobbleRequest(double d, TraktScrobbleMovie traktScrobbleMovie, TraktScrobbleShow traktScrobbleShow, TraktScrobbleEpisode traktScrobbleEpisode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? null : traktScrobbleMovie, (i & 4) != 0 ? null : traktScrobbleShow, (i & 8) != 0 ? null : traktScrobbleEpisode);
    }

    public static /* synthetic */ TraktScrobbleRequest copy$default(TraktScrobbleRequest traktScrobbleRequest, double d, TraktScrobbleMovie traktScrobbleMovie, TraktScrobbleShow traktScrobbleShow, TraktScrobbleEpisode traktScrobbleEpisode, int i, Object obj) {
        if ((i & 1) != 0) {
            d = traktScrobbleRequest.progress;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            traktScrobbleMovie = traktScrobbleRequest.movie;
        }
        TraktScrobbleMovie traktScrobbleMovie2 = traktScrobbleMovie;
        if ((i & 4) != 0) {
            traktScrobbleShow = traktScrobbleRequest.show;
        }
        TraktScrobbleShow traktScrobbleShow2 = traktScrobbleShow;
        if ((i & 8) != 0) {
            traktScrobbleEpisode = traktScrobbleRequest.episode;
        }
        return traktScrobbleRequest.copy(d2, traktScrobbleMovie2, traktScrobbleShow2, traktScrobbleEpisode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final TraktScrobbleRequest copy(double progress, TraktScrobbleMovie movie, TraktScrobbleShow show, TraktScrobbleEpisode episode) {
        return new TraktScrobbleRequest(progress, movie, show, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktScrobbleRequest)) {
            return false;
        }
        TraktScrobbleRequest traktScrobbleRequest = (TraktScrobbleRequest) other;
        return Double.compare(this.progress, traktScrobbleRequest.progress) == 0 && Intrinsics.areEqual(this.movie, traktScrobbleRequest.movie) && Intrinsics.areEqual(this.show, traktScrobbleRequest.show) && Intrinsics.areEqual(this.episode, traktScrobbleRequest.episode);
    }





    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.progress);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        TraktScrobbleMovie traktScrobbleMovie = this.movie;
        int iHashCode = (i + (traktScrobbleMovie == null ? 0 : traktScrobbleMovie.hashCode())) * 31;
        TraktScrobbleShow traktScrobbleShow = this.show;
        int iHashCode2 = (iHashCode + (traktScrobbleShow == null ? 0 : traktScrobbleShow.hashCode())) * 31;
        TraktScrobbleEpisode traktScrobbleEpisode = this.episode;
        return iHashCode2 + (traktScrobbleEpisode != null ? traktScrobbleEpisode.hashCode() : 0);
    }

    public String toString() {
        return "TraktScrobbleRequest(progress=" + this.progress + ", movie=" + this.movie + ", show=" + this.show + ", episode=" + this.episode + ")";
    }

    public TraktScrobbleRequest(double d, TraktScrobbleMovie traktScrobbleMovie, TraktScrobbleShow traktScrobbleShow, TraktScrobbleEpisode traktScrobbleEpisode) {
        this.progress = d;
        this.movie = traktScrobbleMovie;
        this.show = traktScrobbleShow;
        this.episode = traktScrobbleEpisode;
    }
}

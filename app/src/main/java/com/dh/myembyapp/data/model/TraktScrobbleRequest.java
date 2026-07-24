package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktScrobbleRequest {
    

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

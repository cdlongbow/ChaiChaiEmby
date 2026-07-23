package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/dh/myembyapp/data/model/TraktScrobbleMovie;", "", DlnaConstants.EXTRA_TITLE, "", "year", "", "ids", "Lcom/dh/myembyapp/data/model/TraktIds;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;)V", "getTitle", "()Ljava/lang/String;", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIds", "()Lcom/dh/myembyapp/data/model/TraktIds;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/dh/myembyapp/data/model/TraktIds;)Lcom/dh/myembyapp/data/model/TraktScrobbleMovie;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TraktScrobbleMovie {
    public static final int $stable = 0;

    @SerializedName("ids")
    private final TraktIds ids;

    @SerializedName(DlnaConstants.EXTRA_TITLE)
    private final String title;

    @SerializedName("year")
    private final Integer year;

    public /* synthetic */ TraktScrobbleMovie(String str, Integer num, TraktIds traktIds, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, traktIds);
    }

    public static /* synthetic */ TraktScrobbleMovie copy$default(TraktScrobbleMovie traktScrobbleMovie, String str, Integer num, TraktIds traktIds, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traktScrobbleMovie.title;
        }
        if ((i & 2) != 0) {
            num = traktScrobbleMovie.year;
        }
        if ((i & 4) != 0) {
            traktIds = traktScrobbleMovie.ids;
        }
        return traktScrobbleMovie.copy(str, num, traktIds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final TraktScrobbleMovie copy(String title, Integer year, TraktIds ids) {
        ids.getClass();
        return new TraktScrobbleMovie(title, year, ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraktScrobbleMovie)) {
            return false;
        }
        TraktScrobbleMovie traktScrobbleMovie = (TraktScrobbleMovie) other;
        return Intrinsics.areEqual(this.title, traktScrobbleMovie.title) && Intrinsics.areEqual(this.year, traktScrobbleMovie.year) && Intrinsics.areEqual(this.ids, traktScrobbleMovie.ids);
    }




    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.year;
        return this.ids.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "TraktScrobbleMovie(title=" + this.title + ", year=" + this.year + ", ids=" + this.ids + ")";
    }

    public TraktScrobbleMovie(String str, Integer num, TraktIds traktIds) {
        traktIds.getClass();
        this.title = str;
        this.year = num;
        this.ids = traktIds;
    }
}

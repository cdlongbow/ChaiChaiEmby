package com.dh.myembyapp.data.model;

import com.dh.myembyapp.dlna.DlnaConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class TraktScrobbleMovie {
    

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

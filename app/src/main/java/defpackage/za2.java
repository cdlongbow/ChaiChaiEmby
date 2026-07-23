package defpackage;

import com.dh.myembyapp.data.model.TraktScrobbleRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class za2 {
    public final TraktScrobbleRequest a;
    public final Double b;
    public final Long c;
    public final String d;
    public final String e;

    public za2(TraktScrobbleRequest traktScrobbleRequest, Double d, Long l, String str, String str2, int i) {
        d = (i & 2) != 0 ? null : d;
        l = (i & 4) != 0 ? null : l;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        this.a = traktScrobbleRequest;
        this.b = d;
        this.c = l;
        this.d = str;
        this.e = str2;
    }


    public final TraktScrobbleRequest b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za2)) {
            return false;
        }
        za2 za2Var = (za2) obj;
        return Intrinsics.areEqual(this.a, za2Var.a) && Intrinsics.areEqual((Object) this.b, (Object) za2Var.b) && Intrinsics.areEqual(this.c, za2Var.c) && Intrinsics.areEqual(this.d, za2Var.d) && Intrinsics.areEqual(this.e, za2Var.e);
    }

    public final int hashCode() {
        TraktScrobbleRequest traktScrobbleRequest = this.a;
        int iHashCode = (traktScrobbleRequest == null ? 0 : traktScrobbleRequest.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktScrobbleBuildResult(request=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", runtimeMs=");
        sb.append(this.c);
        sb.append(", idSource=");
        sb.append(this.d);
        sb.append(", skipReason=");
        return s01.w(sb, this.e, ")");
    }
}

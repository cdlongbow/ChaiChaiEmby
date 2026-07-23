package defpackage;

import com.dh.myembyapp.data.model.TraktIds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class st1 {
    public final TraktIds a;
    public final String b;
    public final TraktIds c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Integer h;

    public /* synthetic */ st1(TraktIds traktIds, String str, TraktIds traktIds2, Integer num, Integer num2, Integer num3, int i) {
        this(traktIds, str, (i & 4) != 0 ? null : traktIds2, num, num2, null, null, (i & 128) != 0 ? null : num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st1)) {
            return false;
        }
        st1 st1Var = (st1) obj;
        return Intrinsics.areEqual(this.a, st1Var.a) && Intrinsics.areEqual(this.b, st1Var.b) && Intrinsics.areEqual(this.c, st1Var.c) && Intrinsics.areEqual(this.d, st1Var.d) && Intrinsics.areEqual(this.e, st1Var.e) && Intrinsics.areEqual(this.f, st1Var.f) && Intrinsics.areEqual(this.g, st1Var.g) && Intrinsics.areEqual(this.h, st1Var.h);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        TraktIds traktIds = this.c;
        int iHashCode = (i + (traktIds == null ? 0 : traktIds.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.h;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ResolvedEpisodeIds(ids=" + this.a + ", source=" + this.b + ", showIds=" + this.c + ", season=" + this.d + ", episode=" + this.e + ", episodeTitle=" + this.f + ", showTitle=" + this.g + ", showYear=" + this.h + ")";
    }

    public st1(TraktIds traktIds, String str, TraktIds traktIds2, Integer num, Integer num2, String str2, String str3, Integer num3) {
        traktIds.getClass();
        this.a = traktIds;
        this.b = str;
        this.c = traktIds2;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = num3;
    }
}

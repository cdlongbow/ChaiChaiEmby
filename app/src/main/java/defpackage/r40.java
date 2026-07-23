package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r40 {
    public final String a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ r40(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj;
        return Intrinsics.areEqual(this.a, r40Var.a) && Intrinsics.areEqual(this.b, r40Var.b) && Intrinsics.areEqual(this.c, r40Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "DetailMoviePlaybackSelection(itemId=" + this.a + ", audioStreamIndex=" + this.b + ", subtitleStreamIndex=" + this.c + ")";
    }

    public r40(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }
}

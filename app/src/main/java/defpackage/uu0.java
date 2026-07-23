package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uu0 {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public uu0(Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return Intrinsics.areEqual(this.a, uu0Var.a) && Intrinsics.areEqual(this.b, uu0Var.b) && Intrinsics.areEqual(this.c, uu0Var.c) && Intrinsics.areEqual(this.d, uu0Var.d) && this.e == uu0Var.e && this.f == uu0Var.f && this.g == uu0Var.g && this.h == uu0Var.h && this.i == uu0Var.i && this.j == uu0Var.j;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return ((((((((((((iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntroOutroChapterMarkers(autoIntroStartTime=");
        sb.append(this.a);
        sb.append(", autoIntroEndTime=");
        sb.append(this.b);
        sb.append(", autoIntroTime=");
        sb.append(this.c);
        sb.append(", autoOutroTime=");
        sb.append(this.d);
        sb.append(", usedMarkerType=");
        i9.r(sb, this.e, ", hasIntroStart=", this.f, ", hasIntroEnd=");
        i9.r(sb, this.g, ", hasCreditsStart=", this.h, ", hasChineseIntro=");
        sb.append(this.i);
        sb.append(", hasChineseOutro=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}

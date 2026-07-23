package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class i92 {
    public final boolean a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public i92(boolean z, String str, String str2, long j, boolean z2, boolean z3, int i) {
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z2;
        this.f = z3;
        this.g = i;
    }

    public static i92 a(i92 i92Var, boolean z, String str, String str2, long j, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = i92Var.a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            str = i92Var.b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = i92Var.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            j = i92Var.d;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            z2 = i92Var.e;
        }
        boolean z5 = z2;
        boolean z6 = (i2 & 32) != 0 ? i92Var.f : z3;
        int i3 = (i2 & 64) != 0 ? i92Var.g : i;
        str3.getClass();
        str4.getClass();
        return new i92(z4, str3, str4, j2, z5, z6, i3);
    }

    public static boolean c() {
        return (StringsKt.isBlank("1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6") || StringsKt.isBlank("0adc6e4aa2ddd7858eb346db6467d9678709322badd984c655514c97c36a8847")) ? false : true;
    }

    public final boolean b() {
        return this.a && this.f && c() && d();
    }

    public final boolean d() {
        return (StringsKt.isBlank(this.b) || StringsKt.isBlank(this.c)) ? false : true;
    }

    public final i92 e() {
        return a(this, false, StringsKt.trim((CharSequence) this.b).toString(), StringsKt.trim((CharSequence) this.c).toString(), 0L, false, false, RangesKt.coerceIn(((RangesKt.coerceIn(this.g, 10, 300) + 5) / 10) * 10, 10, 300), 57);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i92)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return this.a == i92Var.a && Intrinsics.areEqual(this.b, i92Var.b) && Intrinsics.areEqual(this.c, i92Var.c) && this.d == i92Var.d && this.e == i92Var.e && this.f == i92Var.f && this.g == i92Var.g;
    }

    public final int hashCode() {
        int i = i02.i(i02.i((this.a ? 1231 : 1237) * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return ((((((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g;
    }

    public final String toString() {
        return "TraktConfig(enabled=" + this.a + ", accessToken=" + this.b + ", refreshToken=" + this.c + ", accessTokenExpiresAtMs=" + this.d + ", promptCloudProgress=" + this.e + ", syncLocalProgressToTrakt=" + this.f + ", minimumProgressDifferenceSeconds=" + this.g + ")";
    }
}

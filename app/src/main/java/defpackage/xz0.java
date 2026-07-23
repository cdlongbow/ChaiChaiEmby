package defpackage;

import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class xz0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public xz0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz0)) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        return Color.m5153equalsimpl0(this.a, xz0Var.a) && Color.m5153equalsimpl0(this.b, xz0Var.b) && Color.m5153equalsimpl0(this.c, xz0Var.c) && Color.m5153equalsimpl0(this.d, xz0Var.d) && Color.m5153equalsimpl0(this.e, xz0Var.e) && Color.m5153equalsimpl0(this.f, xz0Var.f) && Color.m5153equalsimpl0(this.g, xz0Var.g) && Color.m5153equalsimpl0(this.h, xz0Var.h) && Color.m5153equalsimpl0(this.i, xz0Var.i) && Color.m5153equalsimpl0(this.j, xz0Var.j) && Color.m5153equalsimpl0(this.k, xz0Var.k);
    }

    public final int hashCode() {
        return Color.m5159hashCodeimpl(this.k) + s01.s(this.j, s01.s(this.i, s01.s(this.h, s01.s(this.g, s01.s(this.f, s01.s(this.e, s01.s(this.d, s01.s(this.c, s01.s(this.b, Color.m5159hashCodeimpl(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM5160toStringimpl = Color.m5160toStringimpl(this.a);
        String strM5160toStringimpl2 = Color.m5160toStringimpl(this.b);
        String strM5160toStringimpl3 = Color.m5160toStringimpl(this.c);
        String strM5160toStringimpl4 = Color.m5160toStringimpl(this.d);
        String strM5160toStringimpl5 = Color.m5160toStringimpl(this.e);
        String strM5160toStringimpl6 = Color.m5160toStringimpl(this.f);
        String strM5160toStringimpl7 = Color.m5160toStringimpl(this.g);
        String strM5160toStringimpl8 = Color.m5160toStringimpl(this.h);
        String strM5160toStringimpl9 = Color.m5160toStringimpl(this.i);
        String strM5160toStringimpl10 = Color.m5160toStringimpl(this.j);
        String strM5160toStringimpl11 = Color.m5160toStringimpl(this.k);
        StringBuilder sbZ = kb0.z("LightThemeAccentPalette(primary=", strM5160toStringimpl, ", primaryContainer=", strM5160toStringimpl2, ", onPrimaryContainer=");
        i02.v(sbZ, strM5160toStringimpl3, ", secondary=", strM5160toStringimpl4, ", secondaryContainer=");
        i02.v(sbZ, strM5160toStringimpl5, ", onSecondaryContainer=", strM5160toStringimpl6, ", tertiary=");
        i02.v(sbZ, strM5160toStringimpl7, ", selectedSurface=", strM5160toStringimpl8, ", selectedSurfaceFocused=");
        i02.v(sbZ, strM5160toStringimpl9, ", navigationSelectedSurface=", strM5160toStringimpl10, ", navigationSelectedSurfaceFocused=");
        return s01.w(sbZ, strM5160toStringimpl11, ")");
    }
}

package defpackage;

import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes4.dex */
public final class sx0 {
    public final int a;
    public final float b;
    public final float c;

    public sx0(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return this.a == sx0Var.a && Dp.m7818equalsimpl0(this.b, sx0Var.b) && Dp.m7818equalsimpl0(this.c, sx0Var.c);
    }

    public final int hashCode() {
        return Dp.m7819hashCodeimpl(this.c) + s01.q(this.b, this.a * 31, 31);
    }

    public final String toString() {
        String strM7824toStringimpl = Dp.m7824toStringimpl(this.b);
        String strM7824toStringimpl2 = Dp.m7824toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("LibraryPosterGridMetrics(columns=");
        sb.append(this.a);
        sb.append(", horizontalPadding=");
        sb.append(strM7824toStringimpl);
        sb.append(", horizontalSpacing=");
        return s01.w(sb, strM7824toStringimpl2, ")");
    }
}

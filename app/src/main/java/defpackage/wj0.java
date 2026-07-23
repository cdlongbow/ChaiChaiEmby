package defpackage;

import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes4.dex */
public final class wj0 {
    public final int a;
    public final float b;
    public final float c;

    public wj0(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj0)) {
            return false;
        }
        wj0 wj0Var = (wj0) obj;
        return this.a == wj0Var.a && Dp.m7818equalsimpl0(this.b, wj0Var.b) && Dp.m7818equalsimpl0(this.c, wj0Var.c);
    }

    public final int hashCode() {
        return Dp.m7819hashCodeimpl(this.c) + s01.q(this.b, this.a * 31, 31);
    }

    public final String toString() {
        String strM7824toStringimpl = Dp.m7824toStringimpl(this.b);
        String strM7824toStringimpl2 = Dp.m7824toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("FavoritePosterGridMetrics(columns=");
        sb.append(this.a);
        sb.append(", horizontalPadding=");
        sb.append(strM7824toStringimpl);
        sb.append(", horizontalSpacing=");
        return s01.w(sb, strM7824toStringimpl2, ")");
    }
}

package defpackage;

import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class ic2 {
    public final long a;
    public final long b;
    public final long c;

    public ic2(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic2)) {
            return false;
        }
        ic2 ic2Var = (ic2) obj;
        return Color.m5153equalsimpl0(this.a, ic2Var.a) && Color.m5153equalsimpl0(this.b, ic2Var.b) && Color.m5153equalsimpl0(this.c, ic2Var.c);
    }

    public final int hashCode() {
        return Color.m5159hashCodeimpl(this.c) + s01.s(this.b, Color.m5159hashCodeimpl(this.a) * 31, 31);
    }

    public final String toString() {
        String strM5160toStringimpl = Color.m5160toStringimpl(this.a);
        String strM5160toStringimpl2 = Color.m5160toStringimpl(this.b);
        return s01.w(kb0.z("TvButtonPalette(containerColor=", strM5160toStringimpl, ", focusedContainerColor=", strM5160toStringimpl2, ", contentColor="), Color.m5160toStringimpl(this.c), ")");
    }
}

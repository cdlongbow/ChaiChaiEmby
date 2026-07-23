package defpackage;

import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class gb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final float g;

    public gb(long j, long j2, long j3, long j4, boolean z, float f) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return Color.m5153equalsimpl0(this.a, gbVar.a) && Color.m5153equalsimpl0(this.b, gbVar.b) && Color.m5153equalsimpl0(this.c, gbVar.c) && Color.m5153equalsimpl0(this.d, gbVar.d) && this.e == gbVar.e && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f, gbVar.f) == 0 && Float.compare(this.g, gbVar.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + qi0.e(this.f, qi0.e(0.0f, (s01.s(this.d, s01.s(this.c, s01.s(this.b, Color.m5159hashCodeimpl(this.a) * 31, 31), 31), 31) + (this.e ? 1231 : 1237)) * 31, 31), 31);
    }

    public final String toString() {
        String strM5160toStringimpl = Color.m5160toStringimpl(this.a);
        String strM5160toStringimpl2 = Color.m5160toStringimpl(this.b);
        String strM5160toStringimpl3 = Color.m5160toStringimpl(this.c);
        String strM5160toStringimpl4 = Color.m5160toStringimpl(this.d);
        StringBuilder sbZ = kb0.z("AppBackgroundPalette(backgroundColor=", strM5160toStringimpl, ", startColor=", strM5160toStringimpl2, ", midColor=");
        i02.v(sbZ, strM5160toStringimpl3, ", endColor=", strM5160toStringimpl4, ", isGradient=");
        sbZ.append(this.e);
        sbZ.append(", startStop=0.0, midStop=");
        sbZ.append(this.f);
        sbZ.append(", endStop=");
        sbZ.append(this.g);
        sbZ.append(")");
        return sbZ.toString();
    }

    public /* synthetic */ gb(long j, long j2, long j3, long j4, boolean z) {
        this(j, j2, j3, j4, z, 0.5f);
    }
}

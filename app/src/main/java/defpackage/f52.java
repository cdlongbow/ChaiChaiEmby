package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f52 {
    public final bw1 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final n32 g;
    public final boolean h;
    public final boolean i;

    public f52(bw1 bw1Var, boolean z, boolean z2, int i, int i2, boolean z3, n32 n32Var, boolean z4, boolean z5) {
        this.a = bw1Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = z3;
        this.g = n32Var;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f52)) {
            return false;
        }
        f52 f52Var = (f52) obj;
        return Intrinsics.areEqual(this.a, f52Var.a) && this.b == f52Var.b && this.c == f52Var.c && this.d == f52Var.d && this.e == f52Var.e && this.f == f52Var.f && Intrinsics.areEqual(this.g, f52Var.g) && this.h == f52Var.h && this.i == f52Var.i;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31;
        n32 n32Var = this.g;
        return ((((iHashCode + (n32Var == null ? 0 : n32Var.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleTrackChangeResult(inspection=");
        sb.append(this.a);
        sb.append(", supportsExternalSubtitleDelay=");
        sb.append(this.b);
        sb.append(", shouldResetBitmapCueCache=");
        sb.append(this.c);
        sb.append(", subtitleCanvasWidth=");
        sb.append(this.d);
        sb.append(", subtitleCanvasHeight=");
        sb.append(this.e);
        sb.append(", consumedPendingSubtitleLabel=");
        sb.append(this.f);
        sb.append(", displaySettingsUpdate=");
        sb.append(this.g);
        sb.append(", shouldCleanupTempSubtitleFiles=");
        sb.append(this.h);
        sb.append(", shouldDeferSelectedTrackStateUpdate=");
        return i9.i(sb, this.i, ")");
    }
}

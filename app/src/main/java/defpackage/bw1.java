package defpackage;

import androidx.media3.common.Format;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bw1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Format f;
    public final String g;
    public final String h;
    public final String i;

    public bw1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Format format, String str, String str2, String str3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = format;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw1)) {
            return false;
        }
        bw1 bw1Var = (bw1) obj;
        return this.a == bw1Var.a && this.b == bw1Var.b && this.c == bw1Var.c && this.d == bw1Var.d && this.e == bw1Var.e && Intrinsics.areEqual(this.f, bw1Var.f) && Intrinsics.areEqual(this.g, bw1Var.g) && Intrinsics.areEqual(this.h, bw1Var.h) && Intrinsics.areEqual(this.i, bw1Var.i);
    }

    public final int hashCode() {
        int i = (((((((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        Format format = this.f;
        int iHashCode = (i + (format == null ? 0 : format.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedSubtitleTrackInspection(hasSelectedTrack=");
        sb.append(this.a);
        sb.append(", needsNativeRender=");
        sb.append(this.b);
        sb.append(", isExternal=");
        i9.r(sb, this.c, ", isBitmap=", this.d, ", isAssText=");
        sb.append(this.e);
        sb.append(", selectedFormat=");
        sb.append(this.f);
        sb.append(", selectedBitmapCueTrackKey=");
        i02.v(sb, this.g, ", externalSubtitleUrl=", this.h, ", externalSubtitleFormat=");
        return s01.w(sb, this.i, ")");
    }
}

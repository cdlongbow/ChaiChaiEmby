package defpackage;

import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n32 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final SubtitlePreferences.SubtitleColor g;

    public n32(int i, String str, String str2, int i2, int i3, float f, SubtitlePreferences.SubtitleColor subtitleColor) {
        subtitleColor.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = f;
        this.g = subtitleColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n32)) {
            return false;
        }
        n32 n32Var = (n32) obj;
        return this.a == n32Var.a && Intrinsics.areEqual(this.b, n32Var.b) && Intrinsics.areEqual(this.c, n32Var.c) && this.d == n32Var.d && this.e == n32Var.e && Float.compare(this.f, n32Var.f) == 0 && this.g == n32Var.g;
    }

    public final int hashCode() {
        int i = i02.i(this.a * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + qi0.e(this.f, (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + this.e) * 31, 31);
    }

    public final String toString() {
        return "SubtitleDisplaySettingsUpdate(trackIndex=" + this.a + ", languageType=" + this.b + ", subtitleTitle=" + this.c + ", verticalOffset=" + this.d + ", scale=" + this.e + ", delay=" + this.f + ", color=" + this.g + ")";
    }
}

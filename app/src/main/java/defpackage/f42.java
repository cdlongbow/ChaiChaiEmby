package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class f42 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public f42(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f42)) {
            return false;
        }
        f42 f42Var = (f42) obj;
        return this.a == f42Var.a && this.b == f42Var.b && this.c == f42Var.c && this.d == f42Var.d && this.e == f42Var.e && this.f == f42Var.f && this.g == f42Var.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleLanguageProfile(isSimplifiedChinese=");
        sb.append(this.a);
        sb.append(", isTraditionalChinese=");
        sb.append(this.b);
        sb.append(", isChinese=");
        i9.r(sb, this.c, ", isEnglish=", this.d, ", isJapanese=");
        i9.r(sb, this.e, ", isKorean=", this.f, ", isBilingual=");
        return i9.i(sb, this.g, ")");
    }
}

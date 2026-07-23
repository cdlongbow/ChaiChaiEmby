package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h52 implements js0 {
    public final pr0 a;
    public final fs0 b;
    public final o00 c;
    public final g41 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public h52(pr0 pr0Var, fs0 fs0Var, o00 o00Var, g41 g41Var, String str, boolean z, boolean z2) {
        this.a = pr0Var;
        this.b = fs0Var;
        this.c = o00Var;
        this.d = g41Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.js0
    public final fs0 a() {
        return this.b;
    }

    @Override // defpackage.js0
    public final pr0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return Intrinsics.areEqual(this.a, h52Var.a) && Intrinsics.areEqual(this.b, h52Var.b) && this.c == h52Var.c && Intrinsics.areEqual(this.d, h52Var.d) && Intrinsics.areEqual(this.e, h52Var.e) && this.f == h52Var.f && this.g == h52Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        g41 g41Var = this.d;
        int iHashCode2 = (iHashCode + (g41Var == null ? 0 : g41Var.hashCode())) * 31;
        String str = this.e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return i9.i(sb, this.g, ")");
    }
}

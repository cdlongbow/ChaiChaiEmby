package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bn0 implements lw1 {
    public final String a;
    public final lw1 b;
    public final lw1 c;

    public bn0(String str, lw1 lw1Var, lw1 lw1Var2) {
        this.a = str;
        this.b = lw1Var;
        this.c = lw1Var2;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1
    public final int c() {
        return 2;
    }

    @Override // defpackage.lw1
    public final String d(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        if (i < 0) {
            lc1.f(s01.w(i02.q(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        rd1.o("Unreached");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return Intrinsics.areEqual(this.a, bn0Var.a) && Intrinsics.areEqual(this.b, bn0Var.b) && Intrinsics.areEqual(this.c, bn0Var.c);
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final boolean g(int i) {
        if (i >= 0) {
            return false;
        }
        lc1.f(s01.w(i02.q(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    @Override // defpackage.lw1
    public final ig2 getKind() {
        return l32.g;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}

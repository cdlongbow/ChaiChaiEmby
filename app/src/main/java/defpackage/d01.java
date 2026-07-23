package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d01 implements lw1 {
    public final lw1 a;

    public d01(lw1 lw1Var) {
        this.a = lw1Var;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1
    public final int c() {
        return 1;
    }

    @Override // defpackage.lw1
    public final String d(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        if (i >= 0) {
            return this.a;
        }
        n41.q(i02.q(i, "Illegal index ", ", "), f(), " expects only non-negative indices");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d01)) {
            return false;
        }
        d01 d01Var = (d01) obj;
        return Intrinsics.areEqual(this.a, d01Var.a) && Intrinsics.areEqual(f(), d01Var.f());
    }

    @Override // defpackage.lw1
    public final boolean g(int i) {
        if (i >= 0) {
            return false;
        }
        n41.q(i02.q(i, "Illegal index ", ", "), f(), " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.lw1
    public final ig2 getKind() {
        return l32.f;
    }

    public final int hashCode() {
        return f().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return f() + '(' + this.a + ')';
    }
}

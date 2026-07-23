package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n12 {
    public static final n12 c;
    public final ab0 a;
    public final ab0 b;

    static {
        za0 za0Var = za0.a;
        c = new n12(za0Var, za0Var);
    }

    public n12(ab0 ab0Var, ab0 ab0Var2) {
        this.a = ab0Var;
        this.b = ab0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n12)) {
            return false;
        }
        n12 n12Var = (n12) obj;
        return Intrinsics.areEqual(this.a, n12Var.a) && Intrinsics.areEqual(this.b, n12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}

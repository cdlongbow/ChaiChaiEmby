package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xg0 implements js0 {
    public final pr0 a;
    public final fs0 b;
    public final Throwable c;

    public xg0(pr0 pr0Var, fs0 fs0Var, Throwable th) {
        this.a = pr0Var;
        this.b = fs0Var;
        this.c = th;
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
        if (!(obj instanceof xg0)) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        return Intrinsics.areEqual(this.a, xg0Var.a) && Intrinsics.areEqual(this.b, xg0Var.b) && Intrinsics.areEqual(this.c, xg0Var.c);
    }

    public final int hashCode() {
        pr0 pr0Var = this.a;
        int iHashCode = pr0Var == null ? 0 : pr0Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}

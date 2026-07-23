package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y10 {
    public final pr0 a;
    public final boolean b;

    public y10(pr0 pr0Var, boolean z) {
        this.a = pr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y10)) {
            return false;
        }
        y10 y10Var = (y10) obj;
        return Intrinsics.areEqual(this.a, y10Var.a) && this.b == y10Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}

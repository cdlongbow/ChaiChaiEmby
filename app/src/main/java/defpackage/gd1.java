package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gd1 {
    public final ye2 a;
    public final ve2 b;

    public gd1(ye2 ye2Var, ve2 ve2Var) {
        ve2Var.getClass();
        this.a = ye2Var;
        this.b = ve2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd1)) {
            return false;
        }
        gd1 gd1Var = (gd1) obj;
        return Intrinsics.areEqual(this.a, gd1Var.a) && Intrinsics.areEqual(this.b, gd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingDownloadConfirmation(config=" + this.a + ", preview=" + this.b + ")";
    }
}

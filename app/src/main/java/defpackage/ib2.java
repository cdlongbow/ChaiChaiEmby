package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib2 {
    public final i92 a;
    public final String b;

    public ib2(i92 i92Var, String str) {
        this.a = i92Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return Intrinsics.areEqual(this.a, ib2Var.a) && Intrinsics.areEqual(this.b, ib2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TraktSyncSession(config=" + this.a + ", accessToken=" + this.b + ")";
    }
}

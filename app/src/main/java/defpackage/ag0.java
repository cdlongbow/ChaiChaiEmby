package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ag0 {
    public final pr0 a;
    public final boolean b;
    public final o00 c;
    public final String d;

    public ag0(pr0 pr0Var, boolean z, o00 o00Var, String str) {
        this.a = pr0Var;
        this.b = z;
        this.c = o00Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag0)) {
            return false;
        }
        ag0 ag0Var = (ag0) obj;
        return Intrinsics.areEqual(this.a, ag0Var.a) && this.b == ag0Var.b && this.c == ag0Var.c && Intrinsics.areEqual(this.d, ag0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}

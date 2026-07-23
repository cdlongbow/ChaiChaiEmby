package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ur0 implements ak0 {
    public final pr0 a;
    public final boolean b;
    public final o00 c;

    public ur0(pr0 pr0Var, boolean z, o00 o00Var) {
        this.a = pr0Var;
        this.b = z;
        this.c = o00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return Intrinsics.areEqual(this.a, ur0Var.a) && this.b == ur0Var.b && this.c == ur0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o22 implements ak0 {
    public final ks0 a;
    public final String b;
    public final o00 c;

    public o22(ks0 ks0Var, String str, o00 o00Var) {
        this.a = ks0Var;
        this.b = str;
        this.c = o00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) obj;
        return Intrinsics.areEqual(this.a, o22Var.a) && Intrinsics.areEqual(this.b, o22Var.b) && this.c == o22Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}

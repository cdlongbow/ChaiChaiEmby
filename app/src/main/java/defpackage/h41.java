package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h41 {
    public final pr0 a;
    public final Map b;

    public h41(pr0 pr0Var, Map map) {
        this.a = pr0Var;
        this.b = ku.Q(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h41)) {
            return false;
        }
        h41 h41Var = (h41) obj;
        return Intrinsics.areEqual(this.a, h41Var.a) && Intrinsics.areEqual(this.b, h41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class od0 {
    public final List a;
    public final int b;

    public od0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od0)) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return Intrinsics.areEqual(this.a, od0Var.a) && this.b == od0Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PagedResult(items=" + this.a + ", totalCount=" + this.b + ")";
    }
}

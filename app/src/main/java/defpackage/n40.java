package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n40 {
    public final String a;
    public final o40 b;
    public final List c;

    public n40(String str, o40 o40Var, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = o40Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return Intrinsics.areEqual(this.a, n40Var.a) && Intrinsics.areEqual(this.b, n40Var.b) && Intrinsics.areEqual(this.c, n40Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o40 o40Var = this.b;
        return this.c.hashCode() + ((iHashCode + (o40Var == null ? 0 : o40Var.hashCode())) * 31);
    }

    public final String toString() {
        return "DetailMediaSection(key=" + this.a + ", summary=" + this.b + ", cards=" + this.c + ")";
    }
}

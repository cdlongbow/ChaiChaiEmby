package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g41 {
    public final String a;
    public final Map b;

    public g41(String str, Map map) {
        this.a = str;
        this.b = ku.Q(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41Var = (g41) obj;
        return Intrinsics.areEqual(this.a, g41Var.a) && Intrinsics.areEqual(this.b, g41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}

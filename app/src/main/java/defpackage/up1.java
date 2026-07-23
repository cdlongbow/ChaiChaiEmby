package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class up1 {
    public final List a;
    public final int b;
    public final int c;
    public final tw d;

    public up1(List list, int i, int i2, tw twVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up1)) {
            return false;
        }
        up1 up1Var = (up1) obj;
        return Intrinsics.areEqual(this.a, up1Var.a) && this.b == up1Var.b && this.c == up1Var.c && Intrinsics.areEqual(this.d, up1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        return "PreparedDanmakuData(items=" + this.a + ", originalCount=" + this.b + ", processedCount=" + this.c + ", loadPlan=" + this.d + ")";
    }
}

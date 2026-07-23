package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g31 {
    public final Long a;
    public final Long b;

    public g31(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        g31 g31Var = (g31) obj;
        return Intrinsics.areEqual(this.a, g31Var.a) && Intrinsics.areEqual(this.b, g31Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "ManualIntroOutroMarkers(manualIntroTime=" + this.a + ", manualOutroRemainingMs=" + this.b + ")";
    }
}

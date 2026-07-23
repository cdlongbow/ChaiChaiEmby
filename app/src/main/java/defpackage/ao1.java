package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ao1 {
    public final bo1 a;
    public final zn1 b;

    public ao1(bo1 bo1Var, zn1 zn1Var) {
        this.a = bo1Var;
        this.b = zn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao1)) {
            return false;
        }
        ao1 ao1Var = (ao1) obj;
        return Intrinsics.areEqual(this.a, ao1Var.a) && Intrinsics.areEqual(this.b, ao1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zn1 zn1Var = this.b;
        return iHashCode + (zn1Var == null ? 0 : zn1Var.hashCode());
    }

    public final String toString() {
        return "PlayerTranscodeSwitchPreparation(playbackRequest=" + this.a + ", subtitleCacheRequest=" + this.b + ")";
    }
}

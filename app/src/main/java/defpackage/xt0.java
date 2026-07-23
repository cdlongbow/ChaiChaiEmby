package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xt0 extends xo1 {
    public final boolean l;

    public xt0(String str, yt0 yt0Var) {
        super(str, yt0Var, 1);
        this.l = true;
    }

    @Override // defpackage.xo1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xt0) {
            lw1 lw1Var = (lw1) obj;
            if (Intrinsics.areEqual(this.a, lw1Var.f())) {
                xt0 xt0Var = (xt0) obj;
                if (xt0Var.l && Arrays.equals((lw1[]) this.j.getValue(), (lw1[]) xt0Var.j.getValue())) {
                    int iC = lw1Var.c();
                    int i = this.c;
                    if (i == iC) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.areEqual(e(i2).f(), lw1Var.e(i2).f()) && Intrinsics.areEqual(e(i2).getKind(), lw1Var.e(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.xo1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

}

package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pg0 extends xo1 {
    public final qw1 l;
    public final Lazy m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.l = qw1.e;
        this.m = LazyKt.lazy(new og0(i, str, this));
    }

    @Override // defpackage.xo1, defpackage.lw1
    public final lw1 e(int i) {
        return ((lw1[]) this.m.getValue())[i];
    }

    @Override // defpackage.xo1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lw1)) {
            return false;
        }
        lw1 lw1Var = (lw1) obj;
        return lw1Var.getKind() == qw1.e && Intrinsics.areEqual(this.a, lw1Var.f()) && Intrinsics.areEqual(hg2.m(this), hg2.m(lw1Var));
    }

    @Override // defpackage.xo1, defpackage.lw1

    @Override // defpackage.xo1
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        ow1 ow1Var = new ow1(this);
        int iHashCode2 = 1;
        while (ow1Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) ow1Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.xo1
    public final String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(new pw1(this), ", ", qb2.i(new StringBuilder(), this.a, '('), ")", 0, null, null, 56, null);
    }
}

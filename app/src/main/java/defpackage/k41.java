package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class k41 implements vu {
    public final int a;
    public final boolean b;

    public k41(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        if (((HashSet) x11Var.m.b).contains(y11.a)) {
            return new l41(this);
        }
        r01.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}

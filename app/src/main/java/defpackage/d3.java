package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends ig2 {
    @Override // defpackage.ig2
    public final int A(b3 b3Var) {
        int i;
        synchronized (b3Var) {
            i = b3Var.j - 1;
            b3Var.j = i;
        }
        return i;
    }

    @Override // defpackage.ig2
    public final void z(b3 b3Var, Set set) {
        synchronized (b3Var) {
            try {
                if (b3Var.i == null) {
                    b3Var.i = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

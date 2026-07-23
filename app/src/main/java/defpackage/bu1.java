package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bu1 implements aj, ou {
    public final x11 a;
    public final ej b;
    public mz1 c;

    public bu1(x11 x11Var, gj gjVar, au1 au1Var) {
        this.a = x11Var;
        ej ejVarA = au1Var.a.a();
        this.b = ejVarA;
        gjVar.e(ejVarA);
        ejVarA.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.aj
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
    }
}

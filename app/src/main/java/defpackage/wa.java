package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wa {
    public static final aa a = aa.f("k", "x", "y");

    public static va a(uv0 uv0Var, g11 g11Var) {
        ArrayList arrayList = new ArrayList();
        if (uv0Var.l() == 1) {
            uv0Var.b();
            while (uv0Var.g()) {
                uv0 uv0Var2 = uv0Var;
                g11 g11Var2 = g11Var;
                arrayList.add(new dd1(g11Var2, fw0.b(uv0Var2, g11Var2, wd2.c(), yq.e, uv0Var.l() == 3, false)));
                uv0Var = uv0Var2;
                g11Var = g11Var2;
            }
            uv0Var.d();
            gw0.b(arrayList);
        } else {
            arrayList.add(new dw0(vv0.b(uv0Var, wd2.c())));
        }
        return new va(arrayList);
    }

    public static db b(uv0 uv0Var, g11 g11Var) {
        uv0Var.c();
        va vaVarA = null;
        ua uaVarG = null;
        boolean z = false;
        ua uaVarG2 = null;
        while (uv0Var.l() != 4) {
            int iN = uv0Var.n(a);
            if (iN == 0) {
                vaVarA = a(uv0Var, g11Var);
            } else if (iN != 1) {
                if (iN != 2) {
                    uv0Var.o();
                    uv0Var.p();
                } else if (uv0Var.l() == 6) {
                    uv0Var.p();
                    z = true;
                } else {
                    uaVarG = tl0.G(uv0Var, g11Var, true);
                }
            } else if (uv0Var.l() == 6) {
                uv0Var.p();
                z = true;
            } else {
                uaVarG2 = tl0.G(uv0Var, g11Var, true);
            }
        }
        uv0Var.e();
        if (z) {
            g11Var.a("Lottie doesn't support expressions.");
        }
        return vaVarA != null ? vaVarA : new xa(uaVarG2, uaVarG);
    }
}

package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gw0 {
    public static final aa a = aa.f("k");

    public static ArrayList a(tv0 tv0Var, g11 g11Var, float f, fe2 fe2Var, boolean z) {
        tv0 tv0Var2;
        g11 g11Var2;
        float f2;
        fe2 fe2Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (tv0Var.l() == 6) {
            g11Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        tv0Var.c();
        while (tv0Var.g()) {
            if (tv0Var.n(a) != 0) {
                tv0Var.p();
            } else if (tv0Var.l() == 1) {
                tv0Var.b();
                if (tv0Var.l() == 7) {
                    tv0 tv0Var3 = tv0Var;
                    g11 g11Var3 = g11Var;
                    float f3 = f;
                    fe2 fe2Var3 = fe2Var;
                    boolean z3 = z;
                    dw0 dw0VarB = fw0.b(tv0Var3, g11Var3, f3, fe2Var3, false, z3);
                    tv0Var2 = tv0Var3;
                    g11Var2 = g11Var3;
                    f2 = f3;
                    fe2Var2 = fe2Var3;
                    z2 = z3;
                    arrayList.add(dw0VarB);
                } else {
                    tv0Var2 = tv0Var;
                    g11Var2 = g11Var;
                    f2 = f;
                    fe2Var2 = fe2Var;
                    z2 = z;
                    while (tv0Var2.g()) {
                        arrayList.add(fw0.b(tv0Var2, g11Var2, f2, fe2Var2, true, z2));
                    }
                }
                tv0Var2.d();
                tv0Var = tv0Var2;
                g11Var = g11Var2;
                f = f2;
                fe2Var = fe2Var2;
                z = z2;
            } else {
                tv0 tv0Var4 = tv0Var;
                arrayList.add(fw0.b(tv0Var4, g11Var, f, fe2Var, false, z));
                tv0Var = tv0Var4;
            }
        }
        tv0Var.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            dw0 dw0Var = (dw0) arrayList.get(i2);
            i2++;
            dw0 dw0Var2 = (dw0) arrayList.get(i2);
            dw0Var.h = Float.valueOf(dw0Var2.g);
            if (dw0Var.c == null && (obj = dw0Var2.b) != null) {
                dw0Var.c = obj;
                if (dw0Var instanceof dd1) {
                    ((dd1) dw0Var).d();
                }
            }
        }
        dw0 dw0Var3 = (dw0) arrayList.get(i);
        if ((dw0Var3.b == null || dw0Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(dw0Var3);
        }
    }
}

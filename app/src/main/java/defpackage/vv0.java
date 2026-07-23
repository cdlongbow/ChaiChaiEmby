package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vv0 {
    public static final aa a = aa.f("x", "y");

    public static int a(tv0 tv0Var) {
        tv0Var.b();
        int i = (int) (tv0Var.i() * 255.0d);
        int i2 = (int) (tv0Var.i() * 255.0d);
        int i3 = (int) (tv0Var.i() * 255.0d);
        while (tv0Var.g()) {
            tv0Var.p();
        }
        tv0Var.d();
        return Color.argb(255, i, i2, i3);
    }

    public static PointF b(tv0 tv0Var, float f) {
        int iD = w11.D(tv0Var.l());
        if (iD == 0) {
            tv0Var.b();
            float fI = (float) tv0Var.i();
            float fI2 = (float) tv0Var.i();
            while (tv0Var.l() != 2) {
                tv0Var.p();
            }
            tv0Var.d();
            return new PointF(fI * f, fI2 * f);
        }
        if (iD != 2) {
            if (iD != 6) {
                ra.q("Unknown point starts with ".concat(en0.D(tv0Var.l())));
                return null;
            }
            float fI3 = (float) tv0Var.i();
            float fI4 = (float) tv0Var.i();
            while (tv0Var.g()) {
                tv0Var.p();
            }
            return new PointF(fI3 * f, fI4 * f);
        }
        tv0Var.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (tv0Var.g()) {
            int iN = tv0Var.n(a);
            if (iN == 0) {
                fD = d(tv0Var);
            } else if (iN != 1) {
                tv0Var.o();
                tv0Var.p();
            } else {
                fD2 = d(tv0Var);
            }
        }
        tv0Var.e();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(tv0 tv0Var, float f) {
        ArrayList arrayList = new ArrayList();
        tv0Var.b();
        while (tv0Var.l() == 1) {
            tv0Var.b();
            arrayList.add(b(tv0Var, f));
            tv0Var.d();
        }
        tv0Var.d();
        return arrayList;
    }

    public static float d(tv0 tv0Var) {
        int iL = tv0Var.l();
        int iD = w11.D(iL);
        if (iD != 0) {
            if (iD == 6) {
                return (float) tv0Var.i();
            }
            ra.q("Unknown value for token of type ".concat(en0.D(iL)));
            return 0.0f;
        }
        tv0Var.b();
        float fI = (float) tv0Var.i();
        while (tv0Var.g()) {
            tv0Var.p();
        }
        tv0Var.d();
        return fI;
    }
}

package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yq implements fe2, bj, zm0 {
    public static final yq b = new yq(0);
    public static final yq c = new yq(1);
    public static final yq d = new yq(2);
    public static final yq e = new yq(3);
    public static final yq f = new yq(4);
    public static final yq g = new yq(5);
    public static final yq h = new yq(6);
    public final /* synthetic */ int a;

    public /* synthetic */ yq(int i) {
        this.a = i;
    }

    public static ne i(String str) {
        Object next;
        Iterator<E> it = ne.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.equals(((ne) next).a, str, true));
        ne neVar = (ne) next;
        return neVar == null ? ne.HTTPS : neVar;
    }

    @Override // defpackage.bj
    public boolean a(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.bj
    public dw0 b() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.zm0
    public boolean c(n12 n12Var) {
        ab0 ab0Var = n12Var.a;
        if ((ab0Var instanceof ya0 ? ((ya0) ab0Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        ab0 ab0Var2 = n12Var.b;
        return (ab0Var2 instanceof ya0 ? ((ya0) ab0Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.bj
    public boolean d(float f2) {
        return false;
    }

    @Override // defpackage.zm0
    public boolean e() {
        boolean z;
        synchronized (dk0.a) {
            try {
                int i = dk0.c;
                dk0.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > dk0.d + 30000) {
                    dk0.c = 0;
                    dk0.d = SystemClock.uptimeMillis();
                    String[] list = dk0.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    dk0.e = list.length < 800;
                }
                z = dk0.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.bj
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.fe2
    public Object g(tv0 tv0Var, float f2) {
        boolean z;
        switch (this.a) {
            case 0:
                z = tv0Var.l() == 1;
                if (z) {
                    tv0Var.b();
                }
                double dI = tv0Var.i();
                double dI2 = tv0Var.i();
                double dI3 = tv0Var.i();
                double dI4 = tv0Var.l() == 7 ? tv0Var.i() : 1.0d;
                if (z) {
                    tv0Var.d();
                }
                if (dI <= 1.0d && dI2 <= 1.0d && dI3 <= 1.0d) {
                    dI *= 255.0d;
                    dI2 *= 255.0d;
                    dI3 *= 255.0d;
                    if (dI4 <= 1.0d) {
                        dI4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dI4, (int) dI, (int) dI2, (int) dI3));
            case 1:
                return Float.valueOf(vv0.d(tv0Var) * f2);
            case 2:
                return Integer.valueOf(Math.round(vv0.d(tv0Var) * f2));
            case 3:
                return vv0.b(tv0Var, f2);
            case 4:
                int iL = tv0Var.l();
                if (iL == 1) {
                    return vv0.b(tv0Var, f2);
                }
                if (iL == 3) {
                    return vv0.b(tv0Var, f2);
                }
                if (iL != 7) {
                    ra.q("Cannot convert json to point. Next token is ".concat(en0.D(iL)));
                    return null;
                }
                PointF pointF = new PointF(((float) tv0Var.i()) * f2, ((float) tv0Var.i()) * f2);
                while (tv0Var.g()) {
                    tv0Var.p();
                }
                return pointF;
            default:
                z = tv0Var.l() == 1;
                if (z) {
                    tv0Var.b();
                }
                float fI = (float) tv0Var.i();
                float fI2 = (float) tv0Var.i();
                while (tv0Var.g()) {
                    tv0Var.p();
                }
                if (z) {
                    tv0Var.d();
                }
                return new vu1((fI / 100.0f) * f2, (fI2 / 100.0f) * f2);
        }
    }

    @Override // defpackage.bj
    public float h() {
        return 1.0f;
    }

    @Override // defpackage.bj
    public boolean isEmpty() {
        return true;
    }
}

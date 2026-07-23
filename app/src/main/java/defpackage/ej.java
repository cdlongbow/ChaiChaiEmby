package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ej {
    public final bj c;
    public i21 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public ej(List list) {
        bj djVar;
        if (list.isEmpty()) {
            djVar = new yq(8);
        } else {
            djVar = list.size() == 1 ? new dj(list) : new cj(list);
        }
        this.c = djVar;
    }

    public final void a(aj ajVar) {
        this.a.add(ajVar);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.h();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        dw0 dw0VarB = this.c.b();
        if (dw0VarB == null || dw0VarB.c() || (interpolator = dw0VarB.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        dw0 dw0VarB = this.c.b();
        if (dw0VarB.c()) {
            return 0.0f;
        }
        return (this.d - dw0VarB.b()) / (dw0VarB.a() - dw0VarB.b());
    }

    public Object e() {
        float fD = d();
        i21 i21Var = this.e;
        bj bjVar = this.c;
        if (i21Var == null && bjVar.a(fD) && !k()) {
            return this.f;
        }
        dw0 dw0VarB = bjVar.b();
        Interpolator interpolator = dw0VarB.e;
        Interpolator interpolator2 = dw0VarB.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(dw0VarB, c()) : g(dw0VarB, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(dw0 dw0Var, float f);

    public Object g(dw0 dw0Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((aj) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        bj bjVar = this.c;
        if (bjVar.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = bjVar.f();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = bjVar.f();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (bjVar.d(f)) {
            h();
        }
    }

    public final void j(i21 i21Var) {
        i21 i21Var2 = this.e;
        if (i21Var2 != null) {
            i21Var2.getClass();
        }
        this.e = i21Var;
    }

    public boolean k() {
        return false;
    }
}

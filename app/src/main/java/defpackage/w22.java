package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class w22 extends ej {
    public final PointF i;
    public final PointF j;
    public final mk0 k;
    public final mk0 l;
    public i21 m;
    public i21 n;

    public w22(mk0 mk0Var, mk0 mk0Var2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = mk0Var;
        this.l = mk0Var2;
        i(this.d);
    }

    @Override // defpackage.ej
    public final Object e() {
        return l();
    }

    @Override // defpackage.ej
    public final /* bridge */ /* synthetic */ Object f(dw0 dw0Var, float f) {
        return l();
    }

    @Override // defpackage.ej
    public final void i(float f) {
        mk0 mk0Var = this.k;
        mk0Var.i(f);
        mk0 mk0Var2 = this.l;
        mk0Var2.i(f);
        this.i.set(((Float) mk0Var.e()).floatValue(), ((Float) mk0Var2.e()).floatValue());
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

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final PointF l() {
        Float f;
        Float f2 = null;
        if (this.m != null) {
            mk0 mk0Var = this.k;
            dw0 dw0VarB = mk0Var.c.b();
            if (dw0VarB != null) {
                Float f3 = dw0VarB.h;
                i21 i21Var = this.m;
                float f4 = dw0VarB.g;
                f = (Float) i21Var.b(f4, f3 == null ? f4 : f3.floatValue(), (Float) dw0VarB.b, (Float) dw0VarB.c, mk0Var.c(), mk0Var.d(), mk0Var.d);
            } else {
                f = null;
            }
        } else {
            f = null;
        }
        if (this.n != null) {
            mk0 mk0Var2 = this.l;
            dw0 dw0VarB2 = mk0Var2.c.b();
            if (dw0VarB2 != null) {
                Float f5 = dw0VarB2.h;
                i21 i21Var2 = this.n;
                float f6 = dw0VarB2.g;
                f2 = (Float) i21Var2.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) dw0VarB2.b, (Float) dw0VarB2.c, mk0Var2.c(), mk0Var2.d(), mk0Var2.d);
            }
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }
}

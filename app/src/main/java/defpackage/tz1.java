package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tz1 extends gj {
    public final pu D;
    public final au E;
    public final bd0 F;

    public tz1(x11 x11Var, mw0 mw0Var, au auVar, g11 g11Var) {
        super(x11Var, mw0Var);
        this.E = auVar;
        pu puVar = new pu(x11Var, this, new qz1("__container", mw0Var.a, false), g11Var);
        this.D = puVar;
        List list = Collections.EMPTY_LIST;
        puVar.b(list, list);
        ab abVar = this.p.x;
        if (abVar != null) {
            this.F = new bd0(this, this, abVar);
        }
    }

    @Override // defpackage.gj, defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.n, z);
    }

    @Override // defpackage.gj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        PointF pointF = c21.a;
        bd0 bd0Var = this.F;
        if (obj == 5 && bd0Var != null) {
            bd0Var.c.j(i21Var);
            return;
        }
        if (obj == c21.B && bd0Var != null) {
            bd0Var.c(i21Var);
            return;
        }
        if (obj == c21.C && bd0Var != null) {
            bd0Var.e.j(i21Var);
            return;
        }
        if (obj == c21.D && bd0Var != null) {
            bd0Var.f.j(i21Var);
        } else {
            if (obj != c21.E || bd0Var == null) {
                return;
            }
            bd0Var.g.j(i21Var);
        }
    }

    @Override // defpackage.gj
    public final void j(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        bd0 bd0Var = this.F;
        if (bd0Var != null) {
            yc0Var = bd0Var.b(matrix, i);
        }
        this.D.g(canvas, matrix, i, yc0Var);
    }

    @Override // defpackage.gj
    public final ri k() {
        ri riVar = this.p.w;
        return riVar != null ? riVar : this.E.p.w;
    }

    @Override // defpackage.gj
    public final void o(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        this.D.c(zv0Var, i, arrayList, zv0Var2);
    }
}

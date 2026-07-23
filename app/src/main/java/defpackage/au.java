package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class au extends gj {
    public ej D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final m91 I;
    public final l91 J;
    public float K;
    public boolean L;
    public final bd0 M;

    public au(x11 x11Var, mw0 mw0Var, List list, g11 g11Var) {
        gj gjVar;
        gj auVar;
        String str;
        super(x11Var, mw0Var);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new m91();
        this.J = new l91(0);
        this.L = true;
        ua uaVar = mw0Var.s;
        if (uaVar != null) {
            mk0 mk0VarA = uaVar.a();
            this.D = mk0VarA;
            e(mk0VarA);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(g11Var.j.size());
        gj gjVar2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            mw0 mw0Var2 = (mw0) list.get(size);
            int iD = w11.D(mw0Var2.e);
            if (iD == 0) {
                auVar = new au(x11Var, mw0Var2, (List) g11Var.c.get(mw0Var2.g), g11Var);
            } else if (iD == 1) {
                auVar = new n22(x11Var, mw0Var2);
            } else if (iD == 2) {
                auVar = new wr0(x11Var, mw0Var2);
            } else if (iD == 3) {
                auVar = new c91(x11Var, mw0Var2);
            } else if (iD == 4) {
                auVar = new tz1(x11Var, mw0Var2, this, g11Var);
            } else if (iD != 5) {
                switch (mw0Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                r01.b("Unknown layer type ".concat(str));
                auVar = null;
            } else {
                auVar = new f72(x11Var, mw0Var2);
            }
            if (auVar != null) {
                longSparseArray.put(auVar.p.d, auVar);
                if (gjVar2 != null) {
                    gjVar2.s = auVar;
                    gjVar2 = null;
                } else {
                    this.E.add(0, auVar);
                    int iD2 = w11.D(mw0Var2.u);
                    if (iD2 == 1 || iD2 == 2) {
                        gjVar2 = auVar;
                    }
                }
            }
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            gj gjVar3 = (gj) longSparseArray.get(longSparseArray.keyAt(i));
            if (gjVar3 != null && (gjVar = (gj) longSparseArray.get(gjVar3.p.f)) != null) {
                gjVar3.t = gjVar;
            }
        }
        ab abVar = this.p.x;
        if (abVar != null) {
            this.M = new bd0(this, this, abVar);
        }
    }

    @Override // defpackage.gj, defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((gj) arrayList.get(size)).d(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.gj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        if (obj == c21.z) {
            ee2 ee2Var = new ee2(i21Var, null);
            this.D = ee2Var;
            ee2Var.a(this);
            e(this.D);
            return;
        }
        bd0 bd0Var = this.M;
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
        Canvas canvasE;
        bd0 bd0Var = this.M;
        int i2 = 0;
        boolean z = (yc0Var == null && bd0Var == null) ? false : true;
        x11 x11Var = this.o;
        boolean z2 = x11Var.t;
        ArrayList arrayList = this.E;
        boolean z3 = (z2 && arrayList.size() > 1 && i != 255) || (z && x11Var.u);
        int i3 = z3 ? 255 : i;
        if (bd0Var != null) {
            yc0Var = bd0Var.b(matrix, i3);
        }
        boolean z4 = this.L;
        mw0 mw0Var = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(mw0Var.c)) {
            rectF.set(0.0f, 0.0f, mw0Var.o, mw0Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                RectF rectF2 = this.H;
                ((gj) obj).d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        m91 m91Var = this.I;
        if (z3) {
            l91 l91Var = this.J;
            l91Var.b = null;
            l91Var.a = i;
            if (yc0Var != null) {
                if (Color.alpha(yc0Var.d) > 0) {
                    l91Var.b = yc0Var;
                } else {
                    l91Var.b = null;
                }
                yc0Var = null;
            }
            canvasE = m91Var.e(canvas, rectF, l91Var);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((gj) arrayList.get(size2)).g(canvasE, matrix, i3, yc0Var);
            }
        }
        if (z3) {
            m91Var.c();
        }
        canvas.restore();
    }

    @Override // defpackage.gj
    public final void o(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((gj) arrayList2.get(i2)).c(zv0Var, i, arrayList, zv0Var2);
            i2++;
        }
    }

    @Override // defpackage.gj
    public final void p(boolean z) {
        super.p(z);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gj) obj).p(z);
        }
    }

    @Override // defpackage.gj
    public final void q(float f) {
        this.K = f;
        super.q(f);
        ej ejVar = this.D;
        mw0 mw0Var = this.p;
        if (ejVar != null) {
            g11 g11Var = this.o.a;
            f = ((((Float) ejVar.e()).floatValue() * mw0Var.b.n) - mw0Var.b.l) / ((g11Var.m - g11Var.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = mw0Var.n;
            g11 g11Var2 = mw0Var.b;
            f -= f2 / (g11Var2.m - g11Var2.l);
        }
        if (mw0Var.m != 0.0f && !"__container".equals(mw0Var.c)) {
            f /= mw0Var.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((gj) arrayList.get(size)).q(f);
        }
    }
}

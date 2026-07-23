package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes4.dex */
public final class k32 extends oj {
    public final gj q;
    public final String r;
    public final boolean s;
    public final vq t;
    public ee2 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public k32(x11 x11Var, gj gjVar, wz1 wz1Var) {
        int iD = w11.D(wz1Var.g);
        Paint.Cap cap = iD != 0 ? iD != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iD2 = w11.D(wz1Var.h);
        super(x11Var, gjVar, cap, iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, wz1Var.i, wz1Var.e, wz1Var.f, wz1Var.c, wz1Var.b);
        this.q = gjVar;
        this.r = wz1Var.a;
        this.s = wz1Var.j;
        ej ejVarA = wz1Var.d.a();
        this.t = (vq) ejVarA;
        ejVarA.a(this);
        gjVar.e(ejVarA);
    }

    @Override // defpackage.oj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        PointF pointF = c21.a;
        vq vqVar = this.t;
        if (obj == 2) {
            vqVar.j(i21Var);
            return;
        }
        if (obj == c21.F) {
            ee2 ee2Var = this.u;
            gj gjVar = this.q;
            if (ee2Var != null) {
                gjVar.n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.u = ee2Var2;
            ee2Var2.a(this);
            gjVar.e(vqVar);
        }
    }

    @Override // defpackage.oj, defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        if (this.s) {
            return;
        }
        vq vqVar = this.t;
        int iL = vqVar.l(vqVar.c.b(), vqVar.c());
        jw0 jw0Var = this.i;
        jw0Var.setColor(iL);
        ee2 ee2Var = this.u;
        if (ee2Var != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var.e());
        }
        super.g(canvas, matrix, i, yc0Var);
    }

}

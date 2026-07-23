package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public final class bd0 implements aj {
    public final gj a;
    public final gj b;
    public final vq c;
    public final mk0 d;
    public final mk0 e;
    public final mk0 f;
    public final mk0 g;
    public Matrix h;

    public bd0(gj gjVar, gj gjVar2, ab abVar) {
        this.b = gjVar;
        this.a = gjVar2;
        ej ejVarA = ((ta) abVar.a).a();
        this.c = (vq) ejVarA;
        ejVarA.a(this);
        gjVar2.e(ejVarA);
        mk0 mk0VarA = ((ua) abVar.c).a();
        this.d = mk0VarA;
        mk0VarA.a(this);
        gjVar2.e(mk0VarA);
        mk0 mk0VarA2 = ((ua) abVar.d).a();
        this.e = mk0VarA2;
        mk0VarA2.a(this);
        gjVar2.e(mk0VarA2);
        mk0 mk0VarA3 = ((ua) abVar.b).a();
        this.f = mk0VarA3;
        mk0VarA3.a(this);
        gjVar2.e(mk0VarA3);
        mk0 mk0VarA4 = ((ua) abVar.e).a();
        this.g = mk0VarA4;
        mk0VarA4.a(this);
        gjVar2.e(mk0VarA4);
    }

    @Override // defpackage.aj
    public final void a() {
        this.b.a();
    }

    public final yc0 b(Matrix matrix, int i) {
        float fL = this.e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fL;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.e()).floatValue();
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        yc0 yc0Var = new yc0();
        yc0Var.a = fFloatValue2 * 0.33f;
        yc0Var.b = fSin;
        yc0Var.c = fCos;
        yc0Var.d = iArgb;
        yc0Var.e = null;
        yc0Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        yc0Var.c(this.h);
        return yc0Var;
    }

    public final void c(i21 i21Var) {
        this.d.j(new ad0(i21Var));
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class n22 extends gj {
    public final RectF D;
    public final jw0 E;
    public final float[] F;
    public final Path G;
    public final mw0 H;
    public ee2 I;
    public ee2 J;

    public n22(x11 x11Var, mw0 mw0Var) {
        super(x11Var, mw0Var);
        this.D = new RectF();
        jw0 jw0Var = new jw0();
        this.E = jw0Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = mw0Var;
        jw0Var.setAlpha(0);
        jw0Var.setStyle(Paint.Style.FILL);
        jw0Var.setColor(mw0Var.l);
    }

    @Override // defpackage.gj, defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        mw0 mw0Var = this.H;
        float f = mw0Var.j;
        float f2 = mw0Var.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.gj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        if (obj == c21.F) {
            this.I = new ee2(i21Var, null);
        } else if (obj == 1) {
            this.J = new ee2(i21Var, null);
        }
    }

    @Override // defpackage.gj
    public final void j(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        mw0 mw0Var = this.H;
        int iAlpha = Color.alpha(mw0Var.l);
        if (iAlpha == 0) {
            return;
        }
        ee2 ee2Var = this.J;
        Integer num = ee2Var == null ? null : (Integer) ee2Var.e();
        jw0 jw0Var = this.E;
        if (num != null) {
            jw0Var.setColor(num.intValue());
        } else {
            jw0Var.setColor(mw0Var.l);
        }
        ej ejVar = this.w.j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (ejVar == null ? 100 : ((Integer) ejVar.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        jw0Var.setAlpha(iIntValue);
        if (yc0Var == null || Color.alpha(yc0Var.d) <= 0) {
            jw0Var.clearShadowLayer();
        } else {
            jw0Var.setShadowLayer(Math.max(yc0Var.a, Float.MIN_VALUE), yc0Var.b, yc0Var.c, yc0Var.d);
        }
        ee2 ee2Var2 = this.I;
        if (ee2Var2 != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = mw0Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = mw0Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, jw0Var);
        }
    }
}

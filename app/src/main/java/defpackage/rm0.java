package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class rm0 extends oj {
    public ee2 A;
    public final String q;
    public final boolean r;
    public final LongSparseArray s;
    public final LongSparseArray t;
    public final RectF u;
    public final int v;
    public final int w;
    public final lm0 x;
    public final lm0 y;
    public final lm0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public rm0(x11 x11Var, gj gjVar, qm0 qm0Var) {
        int iD = w11.D(qm0Var.h);
        Paint.Cap cap = iD != 0 ? iD != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iD2 = w11.D(qm0Var.i);
        super(x11Var, gjVar, cap, iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, qm0Var.j, qm0Var.d, qm0Var.g, qm0Var.k, qm0Var.l);
        this.s = new LongSparseArray();
        this.t = new LongSparseArray();
        this.u = new RectF();
        this.q = qm0Var.a;
        this.v = qm0Var.b;
        this.r = qm0Var.m;
        this.w = (int) (x11Var.a.b() / 32.0f);
        ej ejVarA = qm0Var.c.a();
        this.x = (lm0) ejVarA;
        ejVarA.a(this);
        gjVar.e(ejVarA);
        ej ejVarA2 = qm0Var.e.a();
        this.y = (lm0) ejVarA2;
        ejVarA2.a(this);
        gjVar.e(ejVarA2);
        ej ejVarA3 = qm0Var.f.a();
        this.z = (lm0) ejVarA3;
        ejVarA3.a(this);
        gjVar.e(ejVarA3);
    }

    public final int[] e(int[] iArr) {
        ee2 ee2Var = this.A;
        if (ee2Var != null) {
            Integer[] numArr = (Integer[]) ee2Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.oj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        if (obj == c21.G) {
            ee2 ee2Var = this.A;
            gj gjVar = this.f;
            if (ee2Var != null) {
                gjVar.n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.A = ee2Var2;
            ee2Var2.a(this);
            gjVar.e(this.A);
        }
    }

    @Override // defpackage.oj, defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        d(this.u, matrix, false);
        int i2 = this.v;
        lm0 lm0Var = this.x;
        lm0 lm0Var2 = this.z;
        lm0 lm0Var3 = this.y;
        if (i2 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.s;
            shader = (LinearGradient) longSparseArray.get(jH);
            if (shader == null) {
                PointF pointF = (PointF) lm0Var3.e();
                PointF pointF2 = (PointF) lm0Var2.e();
                km0 km0Var = (km0) lm0Var.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(km0Var.b), km0Var.a, Shader.TileMode.CLAMP);
                longSparseArray.put(jH, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jH2 = h();
            LongSparseArray longSparseArray2 = this.t;
            shader = (RadialGradient) longSparseArray2.get(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) lm0Var3.e();
                PointF pointF4 = (PointF) lm0Var2.e();
                km0 km0Var2 = (km0) lm0Var.e();
                int[] iArrE = e(km0Var2.b);
                float[] fArr = km0Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrE, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, yc0Var);
    }

    @Override // defpackage.ou

    public final int h() {
        float f = this.y.d;
        float f2 = this.w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.z.d * f2);
        int iRound3 = Math.round(this.x.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}

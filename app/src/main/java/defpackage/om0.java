package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class om0 implements vc0, aj, bw0 {
    public final String a;
    public final boolean b;
    public final gj c;
    public final LongSparseArray d = new LongSparseArray();
    public final LongSparseArray e = new LongSparseArray();
    public final Path f;
    public final jw0 g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final lm0 k;
    public final vq l;
    public final lm0 m;
    public final lm0 n;
    public ee2 o;
    public ee2 p;
    public final x11 q;
    public final int r;
    public ej s;
    public float t;

    public om0(x11 x11Var, g11 g11Var, gj gjVar, nm0 nm0Var) {
        Path path = new Path();
        this.f = path;
        this.g = new jw0(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = gjVar;
        this.a = nm0Var.g;
        this.b = nm0Var.h;
        this.q = x11Var;
        this.j = nm0Var.a;
        path.setFillType(nm0Var.b);
        this.r = (int) (g11Var.b() / 32.0f);
        ej ejVarA = nm0Var.c.a();
        this.k = (lm0) ejVarA;
        ejVarA.a(this);
        gjVar.e(ejVarA);
        ej ejVarA2 = nm0Var.d.a();
        this.l = (vq) ejVarA2;
        ejVarA2.a(this);
        gjVar.e(ejVarA2);
        ej ejVarA3 = nm0Var.e.a();
        this.m = (lm0) ejVarA3;
        ejVarA3.a(this);
        gjVar.e(ejVarA3);
        ej ejVarA4 = nm0Var.f.a();
        this.n = (lm0) ejVarA4;
        ejVarA4.a(this);
        gjVar.e(ejVarA4);
        if (gjVar.k() != null) {
            mk0 mk0VarA = ((ua) gjVar.k().b).a();
            this.s = mk0VarA;
            mk0VarA.a(this);
            gjVar.e(this.s);
        }
    }

    @Override // defpackage.aj
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            ou ouVar = (ou) list2.get(i);
            if (ouVar instanceof cd1) {
                this.i.add((cd1) ouVar);
            }
        }
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        s41.g(zv0Var, i, arrayList, zv0Var2, this);
    }

    @Override // defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((cd1) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        ee2 ee2Var = this.p;
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

    @Override // defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        PointF pointF = c21.a;
        if (obj == 4) {
            this.l.j(i21Var);
            return;
        }
        ColorFilter colorFilter = c21.F;
        gj gjVar = this.c;
        if (obj == colorFilter) {
            ee2 ee2Var = this.o;
            if (ee2Var != null) {
                gjVar.n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.o = ee2Var2;
            ee2Var2.a(this);
            gjVar.e(this.o);
            return;
        }
        if (obj == c21.G) {
            ee2 ee2Var3 = this.p;
            if (ee2Var3 != null) {
                gjVar.n(ee2Var3);
            }
            this.d.clear();
            this.e.clear();
            ee2 ee2Var4 = new ee2(i21Var, null);
            this.p = ee2Var4;
            ee2Var4.a(this);
            gjVar.e(this.p);
            return;
        }
        if (obj == c21.e) {
            ej ejVar = this.s;
            if (ejVar != null) {
                ejVar.j(i21Var);
                return;
            }
            ee2 ee2Var5 = new ee2(i21Var, null);
            this.s = ee2Var5;
            ee2Var5.a(this);
            gjVar.e(this.s);
        }
    }

    @Override // defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        Shader shader;
        Shader radialGradient;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((cd1) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        lm0 lm0Var = this.k;
        lm0 lm0Var2 = this.n;
        lm0 lm0Var3 = this.m;
        if (i3 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.d;
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
            LongSparseArray longSparseArray2 = this.e;
            shader = (RadialGradient) longSparseArray2.get(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) lm0Var3.e();
                PointF pointF4 = (PointF) lm0Var2.e();
                km0 km0Var2 = (km0) lm0Var.e();
                int[] iArrE = e(km0Var2.b);
                float[] fArr = km0Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrE, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        jw0 jw0Var = this.g;
        jw0Var.setShader(shader);
        ee2 ee2Var = this.o;
        if (ee2Var != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var.e());
        }
        ej ejVar = this.s;
        if (ejVar != null) {
            float fFloatValue = ((Float) ejVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                jw0Var.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                jw0Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = ((Integer) this.l.e()).intValue() / 100.0f;
        jw0Var.setAlpha(s41.c((int) (i * fIntValue)));
        if (yc0Var != null) {
            yc0Var.a((int) (fIntValue * 255.0f), jw0Var);
        }
        canvas.drawPath(path, jw0Var);
    }

    @Override // defpackage.ou

    public final int h() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}

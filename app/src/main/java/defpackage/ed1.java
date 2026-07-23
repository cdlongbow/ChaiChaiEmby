package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ed1 extends ew0 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public dd1 m;

    public ed1(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        float f2;
        dd1 dd1Var = (dd1) dw0Var;
        Path path = dd1Var.q;
        i21 i21Var = this.e;
        if (i21Var == null || dw0Var.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) i21Var.b(dd1Var.g, dd1Var.h.floatValue(), (PointF) dd1Var.b, (PointF) dd1Var.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) dw0Var.b;
        }
        dd1 dd1Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (dd1Var2 != dd1Var) {
            pathMeasure.setPath(path, false);
            this.m = dd1Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}

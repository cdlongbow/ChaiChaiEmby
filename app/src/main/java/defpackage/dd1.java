package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes4.dex */
public final class dd1 extends dw0 {
    public Path q;
    public final dw0 r;

    public dd1(g11 g11Var, dw0 dw0Var) {
        super(g11Var, (PointF) dw0Var.b, (PointF) dw0Var.c, dw0Var.d, dw0Var.e, dw0Var.f, dw0Var.g, dw0Var.h);
        this.r = dw0Var;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void d() {
        boolean z;
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        if (obj2 == null || obj3 == null) {
            z = false;
        } else {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj;
        dw0 dw0Var = this.r;
        PointF pointF4 = dw0Var.o;
        PointF pointF5 = dw0Var.p;
        Matrix matrix = wd2.a;
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF4.x + pointF2.x;
            float f2 = pointF2.y + pointF4.y;
            float f3 = pointF3.x;
            float f4 = f3 + pointF5.x;
            float f5 = pointF3.y;
            path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
        }
        this.q = path;
    }
}

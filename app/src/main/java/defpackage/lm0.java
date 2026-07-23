package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lm0 extends ew0 {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm0(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new vu1();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    km0 km0Var = (km0) ((dw0) list.get(i2)).b;
                    if (km0Var != null) {
                        iMax = Math.max(iMax, km0Var.b.length);
                    }
                }
                this.j = new km0(new int[iMax], new float[iMax]);
                break;
        }
    }

    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        Object obj;
        float f2;
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                km0 km0Var = (km0) obj2;
                km0 km0Var2 = (km0) dw0Var.b;
                km0 km0Var3 = (km0) dw0Var.c;
                int[] iArr = km0Var.b;
                float[] fArr = km0Var.a;
                boolean zEquals = km0Var2.equals(km0Var3);
                int[] iArr2 = km0Var2.b;
                if (zEquals || f <= 0.0f) {
                    km0Var.a(km0Var2);
                } else if (f >= 1.0f) {
                    km0Var.a(km0Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = km0Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        ra.q(ll0.f(sb, iArr3.length, ")"));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = s41.f(km0Var2.a[i2], km0Var3.a[i2], f);
                        iArr[i2] = ig2.D(f, iArr2[i2], iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return km0Var;
            case 1:
                return l(dw0Var, f, f, f);
            default:
                vu1 vu1Var = (vu1) obj2;
                Object obj3 = dw0Var.b;
                if (obj3 == null || (obj = dw0Var.c) == null) {
                    rd1.o("Missing values for keyframe.");
                    return null;
                }
                vu1 vu1Var2 = (vu1) obj3;
                vu1 vu1Var3 = (vu1) obj;
                i21 i21Var = this.e;
                if (i21Var != null) {
                    f2 = f;
                    vu1 vu1Var4 = (vu1) i21Var.b(dw0Var.g, dw0Var.h.floatValue(), vu1Var2, vu1Var3, f2, d(), this.d);
                    if (vu1Var4 != null) {
                        return vu1Var4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = s41.f(vu1Var2.a, vu1Var3.a, f2);
                float f4 = s41.f(vu1Var2.b, vu1Var3.b, f2);
                vu1Var.a = f3;
                vu1Var.b = f4;
                return vu1Var;
        }
    }

    @Override // defpackage.ej
    public /* bridge */ /* synthetic */ Object g(dw0 dw0Var, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(dw0Var, f, f2, f3);
            default:
                return super.g(dw0Var, f, f2, f3);
        }
    }

    public PointF l(dw0 dw0Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = dw0Var.b;
        if (obj2 == null || (obj = dw0Var.c) == null) {
            rd1.o("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        i21 i21Var = this.e;
        if (i21Var != null && (pointF = (PointF) i21Var.b(dw0Var.g, dw0Var.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float fH = kb0.H(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(fH, kb0.H(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}

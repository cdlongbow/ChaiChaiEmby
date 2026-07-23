package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vq extends ew0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        int i;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(dw0Var, f));
            case 1:
                Object obj2 = dw0Var.b;
                if (obj2 == null) {
                    rd1.o("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = dw0Var.c;
                if (obj3 == null) {
                    if (dw0Var.k == 784923401) {
                        dw0Var.k = ((Integer) obj2).intValue();
                    }
                    i = dw0Var.k;
                } else {
                    if (dw0Var.l == 784923401) {
                        dw0Var.l = ((Integer) obj3).intValue();
                    }
                    i = dw0Var.l;
                }
                int i2 = i;
                i21 i21Var = this.e;
                if (i21Var == null || (num = (Integer) i21Var.b(dw0Var.g, dw0Var.h.floatValue(), (Integer) obj2, Integer.valueOf(i2), f, d(), this.d)) == null) {
                    if (dw0Var.k == 784923401) {
                        dw0Var.k = ((Integer) obj2).intValue();
                    }
                    int i3 = dw0Var.k;
                    PointF pointF = s41.a;
                    iIntValue = (int) ((f * (i2 - i3)) + i3);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = dw0Var.b;
                i21 i21Var2 = this.e;
                if (i21Var2 == null) {
                    return (f != 1.0f || (obj = dw0Var.c) == null) ? (ac0) obj4 : (ac0) obj;
                }
                float f2 = dw0Var.g;
                Float f3 = dw0Var.h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                ac0 ac0Var = (ac0) obj4;
                Object obj5 = dw0Var.c;
                return (ac0) i21Var2.b(f2, fFloatValue, ac0Var, obj5 == null ? ac0Var : (ac0) obj5, f, c(), this.d);
        }
    }

    public int l(dw0 dw0Var, float f) {
        float f2;
        Float f3;
        Object obj = dw0Var.b;
        Object obj2 = dw0Var.b;
        if (obj == null || dw0Var.c == null) {
            rd1.o("Missing values for keyframe.");
            return 0;
        }
        i21 i21Var = this.e;
        if (i21Var == null || (f3 = dw0Var.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) i21Var.b(dw0Var.g, f3.floatValue(), (Integer) obj2, (Integer) dw0Var.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return ig2.D(s41.b(f2, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) dw0Var.c).intValue());
    }
}

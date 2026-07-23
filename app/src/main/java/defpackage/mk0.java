package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mk0 extends ew0 {
    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        return Float.valueOf(m(dw0Var, f));
    }

    public final float l() {
        return m(this.c.b(), c());
    }

    public final float m(dw0 dw0Var, float f) {
        float f2;
        Object obj = dw0Var.b;
        Object obj2 = dw0Var.b;
        if (obj == null || dw0Var.c == null) {
            rd1.o("Missing values for keyframe.");
            return 0.0f;
        }
        i21 i21Var = this.e;
        if (i21Var != null) {
            f2 = f;
            Float f3 = (Float) i21Var.b(dw0Var.g, dw0Var.h.floatValue(), (Float) obj2, (Float) dw0Var.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (dw0Var.i == -3987645.8f) {
            dw0Var.i = ((Float) obj2).floatValue();
        }
        float f4 = dw0Var.i;
        if (dw0Var.j == -3987645.8f) {
            dw0Var.j = ((Float) dw0Var.c).floatValue();
        }
        return s41.f(f4, dw0Var.j, f2);
    }
}

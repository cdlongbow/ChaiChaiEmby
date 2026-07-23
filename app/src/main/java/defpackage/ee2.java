package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class ee2 extends ej {
    public final Object i;

    public ee2(i21 i21Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(i21Var);
        this.i = obj;
    }

    @Override // defpackage.ej
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.ej
    public final Object e() {
        i21 i21Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return i21Var.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        return e();
    }

    @Override // defpackage.ej
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.ej
    public final void i(float f) {
        this.d = f;
    }
}

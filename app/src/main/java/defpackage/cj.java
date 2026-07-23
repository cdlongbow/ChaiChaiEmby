package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cj implements bj {
    public final List a;
    public dw0 c = null;
    public float d = -1.0f;
    public dw0 b = c(0.0f);

    public cj(List list) {
        this.a = list;
    }

    @Override // defpackage.bj
    public final boolean a(float f) {
        dw0 dw0Var = this.c;
        dw0 dw0Var2 = this.b;
        if (dw0Var == dw0Var2 && this.d == f) {
            return true;
        }
        this.c = dw0Var2;
        this.d = f;
        return false;
    }

    @Override // defpackage.bj
    public final dw0 b() {
        return this.b;
    }

    public final dw0 c(float f) {
        List list = this.a;
        dw0 dw0Var = (dw0) wn.h(1, list);
        if (f >= dw0Var.b()) {
            return dw0Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            dw0 dw0Var2 = (dw0) list.get(size);
            if (this.b != dw0Var2 && f >= dw0Var2.b() && f < dw0Var2.a()) {
                return dw0Var2;
            }
        }
        return (dw0) list.get(0);
    }

    @Override // defpackage.bj
    public final boolean d(float f) {
        dw0 dw0Var = this.b;
        if (f >= dw0Var.b() && f < dw0Var.a()) {
            return !this.b.c();
        }
        this.b = c(f);
        return true;
    }

    @Override // defpackage.bj
    public final float f() {
        return ((dw0) this.a.get(0)).b();
    }

    @Override // defpackage.bj
    public final float h() {
        return ((dw0) wn.h(1, this.a)).a();
    }

    @Override // defpackage.bj
    public final boolean isEmpty() {
        return false;
    }
}

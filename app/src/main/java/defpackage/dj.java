package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dj implements bj {
    public final dw0 a;
    public float b = -1.0f;

    public dj(List list) {
        this.a = (dw0) list.get(0);
    }

    @Override // defpackage.bj
    public final boolean a(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.bj
    public final dw0 b() {
        return this.a;
    }

    @Override // defpackage.bj
    public final boolean d(float f) {
        return !this.a.c();
    }

    @Override // defpackage.bj
    public final float f() {
        return this.a.b();
    }

    @Override // defpackage.bj
    public final float h() {
        return this.a.a();
    }

    @Override // defpackage.bj
    public final boolean isEmpty() {
        return false;
    }
}

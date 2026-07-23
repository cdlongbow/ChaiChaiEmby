package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class qt0 extends rs0 {
    @Override // defpackage.ss0
    public final ss0 a(Object obj) {
        obj.getClass();
        c(obj);
        return this;
    }

    public final st0 f() {
        int i = this.b;
        if (i == 0) {
            int i2 = st0.c;
            return kt1.k;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            st0 st0VarI = st0.i(i, objArr);
            this.b = st0VarI.size();
            this.c = true;
            return st0VarI;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = st0.c;
        return new m12(obj);
    }
}

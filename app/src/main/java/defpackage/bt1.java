package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class bt1 extends at0 {
    public static final bt1 e = new bt1(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public bt1(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.at0, defpackage.ts0
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ts0
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.ts0

    @Override // defpackage.ts0
    public final int e() {
        return 0;
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ig2.p(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List

    @Override // defpackage.at0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

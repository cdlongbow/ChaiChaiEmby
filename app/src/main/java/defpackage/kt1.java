package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kt1 extends st0 {
    public static final Object[] j;
    public static final kt1 k;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] g;
    public final transient int h;
    public final transient int i;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        k = new kt1(objArr, objArr, 0, 0, 0);
    }

    public kt1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.g = objArr2;
        this.h = i2;
        this.i = i3;
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ts0
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.g;
            if (objArr.length != 0) {
                int iN = ku.N(obj);
                while (true) {
                    int i = iN & this.h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iN = i + 1;
                }
            }
        }
        return false;
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

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.st0, java.util.Collection, java.util.Set

    @Override // defpackage.st0
    public final at0 k() {
        return at0.h(this.i, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set

    @Override // defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

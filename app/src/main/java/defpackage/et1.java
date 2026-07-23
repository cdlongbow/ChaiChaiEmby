package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class et1 extends st0 {
    public final transient ft0 d;
    public final transient ft1 e;

    public et1(ft0 ft0Var, ft1 ft1Var) {
        this.d = ft0Var;
        this.e = ft1Var;
    }

    @Override // defpackage.st0, defpackage.ts0
    public final at0 a() {
        return this.e;
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        return this.e.b(i, objArr);
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((gt1) this.d).g;
    }

    @Override // defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

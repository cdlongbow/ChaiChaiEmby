package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class m12 extends st0 {
    public final transient Object d;

    public m12(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.st0, defpackage.ts0
    public final at0 a() {
        return at0.o(this.d);
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return new pv0(this.d);
    }

    @Override // defpackage.st0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

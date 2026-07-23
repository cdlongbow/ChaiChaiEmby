package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ht1 extends ut0 {
    public final /* synthetic */ jt1 d;

    public ht1(jt1 jt1Var) {
        this.d = jt1Var;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ut0
    public final Object get(int i) {
        h91 h91Var = this.d.e;
        ig2.p(i, h91Var.c);
        return h91Var.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.e.c;
    }

    @Override // defpackage.ut0, defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

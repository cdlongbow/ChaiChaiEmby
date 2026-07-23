package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kt0 extends ts0 {
    private static final long serialVersionUID = 0;
    public final transient lt0 b;

    public kt0(lt0 lt0Var) {
        this.b = lt0Var;
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        bl0 bl0VarListIterator = ((at0) this.b.e.values()).listIterator(0);
        while (bl0VarListIterator.hasNext()) {
            i = ((ts0) bl0VarListIterator.next()).b(i, objArr);
        }
        return i;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        lt0 lt0Var = this.b;
        lt0Var.getClass();
        return new ht0(lt0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.g;
    }

    @Override // defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

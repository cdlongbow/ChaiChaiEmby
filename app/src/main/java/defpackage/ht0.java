package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ht0 extends qd2 {
    public final qd2 a;
    public qd2 b = mv0.d;

    public ht0(lt0 lt0Var) {
        this.a = ((at0) lt0Var.e.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((ts0) this.a.next()).iterator();
        }
        return this.b.next();
    }
}

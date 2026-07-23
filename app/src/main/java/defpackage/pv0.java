package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pv0 extends qd2 {
    public final Object a;
    public boolean b;

    public pv0(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            r02.p();
            return null;
        }
        this.b = true;
        return this.a;
    }
}

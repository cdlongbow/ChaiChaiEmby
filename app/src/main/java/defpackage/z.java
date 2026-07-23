package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z extends qd2 implements ListIterator {
    public final int a;
    public int b;

    public z(int i, int i2) {
        ig2.u(i2, i);
        this.a = i;
        this.b = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            r02.p();
            return null;
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            r02.p();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

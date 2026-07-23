package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i01 extends sb2 implements ListIterator {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i01(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.b = i;
        this.c = abstractList;
    }

    @Override // defpackage.sb2
    public final Object a(Object obj) {
        int i = this.b;
        AbstractList abstractList = this.c;
        switch (i) {
            case 0:
                return ((j01) abstractList).b.apply(obj);
            default:
                return ((k01) abstractList).b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

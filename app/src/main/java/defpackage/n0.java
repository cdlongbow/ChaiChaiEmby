package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends f0 implements ListIterator {
    public final /* synthetic */ o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, int i) {
        super(o0Var, ((List) o0Var.b).listIterator(i));
        this.e = o0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        o0 o0Var = this.e;
        boolean zIsEmpty = o0Var.isEmpty();
        b().add(obj);
        o0Var.g.g++;
        if (zIsEmpty) {
            o0Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var) {
        super(o0Var);
        this.e = o0Var;
    }
}

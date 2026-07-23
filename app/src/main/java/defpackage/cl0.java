package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class cl0 extends dl0 {
    public final /* synthetic */ Iterable[] a;

    public cl0(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bl0 bl0Var = new bl0(this, this.a.length);
        nv0 nv0Var = new nv0();
        nv0Var.b = mv0.d;
        nv0Var.c = bl0Var;
        return nv0Var;
    }
}

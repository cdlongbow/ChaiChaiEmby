package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zs0 extends at0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ at0 e;

    public zs0(at0 at0Var, int i, int i2) {
        this.e = at0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ts0
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.ts0
    public final int d() {
        return this.e.e() + this.c + this.d;
    }

    @Override // defpackage.ts0
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ig2.p(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.at0, defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.at0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List

    @Override // defpackage.at0, java.util.List
    /* JADX INFO: renamed from: t */
    public final at0 subList(int i, int i2) {
        ig2.v(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.at0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.at0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}

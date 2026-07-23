package defpackage;

import java.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ct1 extends at0 {
    public final /* synthetic */ dt1 c;

    public ct1(dt1 dt1Var) {
        this.c = dt1Var;
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dt1 dt1Var = this.c;
        ig2.p(i, dt1Var.g);
        Object[] objArr = dt1Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.g;
    }

    @Override // defpackage.at0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}

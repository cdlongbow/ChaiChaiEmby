package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pf {
    public final Object a;
    public final cf b;
    public final ks1 c;

    public pf(Object obj, cf cfVar, ks1 ks1Var) {
        this.a = obj;
        this.b = cfVar;
        this.c = ks1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        cf cfVar = pfVar.b;
        cf cfVar2 = this.b;
        return Intrinsics.areEqual(cfVar2, cfVar) && cfVar2.a(this.a, pfVar.a) && Intrinsics.areEqual(this.c, pfVar.c);
    }

    public final int hashCode() {
        cf cfVar = this.b;
        return this.c.hashCode() + ((cfVar.b(this.a) + (cfVar.hashCode() * 31)) * 31);
    }
}

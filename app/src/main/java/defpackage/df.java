package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class df {
    public final ks1 a;
    public final fs0 b;
    public final cf c;

    public df(ks1 ks1Var, fs0 fs0Var, cf cfVar) {
        this.a = ks1Var;
        this.b = fs0Var;
        this.c = cfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        if (!Intrinsics.areEqual(this.a, dfVar.a)) {
            return false;
        }
        cf cfVar = dfVar.c;
        cf cfVar2 = this.c;
        return Intrinsics.areEqual(cfVar2, cfVar) && cfVar2.a(this.b, dfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cf cfVar = this.c;
        return cfVar.b(this.b) + ((cfVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}

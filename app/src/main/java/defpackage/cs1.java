package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class cs1 implements lp1, Serializable {
    public static final cs1 c = new cs1(ew.b, dw.b);
    private static final long serialVersionUID = 0;
    public final gw a;
    public final gw b;

    public cs1(gw gwVar, gw gwVar2) {
        this.a = gwVar;
        this.b = gwVar2;
        if (gwVar.compareTo(gwVar2) > 0 || gwVar == dw.b || gwVar2 == ew.b) {
            StringBuilder sb = new StringBuilder(16);
            gwVar.b(sb);
            sb.append("..");
            gwVar2.c(sb);
            ra.q("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    @Override // defpackage.lp1
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.e(comparable) && !this.b.e(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return this.a.equals(cs1Var.a) && this.b.equals(cs1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public Object readResolve() {
        cs1 cs1Var = c;
        return equals(cs1Var) ? cs1Var : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }
}

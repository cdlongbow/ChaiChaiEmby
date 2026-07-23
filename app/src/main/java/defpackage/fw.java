package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fw extends gw {
    private static final long serialVersionUID = 0;

    @Override // defpackage.gw
    public final void b(StringBuilder sb) {
        sb.append('[');
        sb.append(this.a);
    }

    @Override // defpackage.gw
    public final void c(StringBuilder sb) {
        sb.append(this.a);
        sb.append(')');
    }

    @Override // defpackage.gw
    public final boolean e(Comparable comparable) {
        cs1 cs1Var = cs1.c;
        return this.a.compareTo(comparable) <= 0;
    }

    @Override // defpackage.gw
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\\" + this.a + "/";
    }
}

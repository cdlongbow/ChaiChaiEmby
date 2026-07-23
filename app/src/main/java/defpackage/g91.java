package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class g91 {
    public final Object a;
    public int b;
    public final /* synthetic */ h91 c;

    public g91(h91 h91Var, int i) {
        this.c = h91Var;
        this.a = h91Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        h91 h91Var = this.c;
        if (i == -1 || i >= h91Var.c || !tl0.n(obj, h91Var.a[i])) {
            this.b = h91Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return h91Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g91) {
            g91 g91Var = (g91) obj;
            if (a() == g91Var.a() && tl0.n(this.a, g91Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gw implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    public final Comparable a;

    public gw(Comparable comparable) {
        this.a = comparable;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gw gwVar) {
        if (gwVar == ew.b) {
            return 1;
        }
        if (gwVar == dw.b) {
            return -1;
        }
        Comparable comparable = gwVar.a;
        cs1 cs1Var = cs1.c;
        int iCompareTo = this.a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(false, false);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public Comparable d() {
        return this.a;
    }

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof gw) {
            try {
                if (compareTo((gw) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}

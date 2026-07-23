package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mp1 implements lp1, Serializable {
    private static final long serialVersionUID = 0;
    public final List a;

    public mp1(List list) {
        this.a = list;
    }

    @Override // defpackage.lp1
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((lp1) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp1) {
            return this.a.equals(((mp1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

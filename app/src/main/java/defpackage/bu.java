package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class bu extends xa1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator[] a;

    public bu(bn bnVar, bn bnVar2) {
        this.a = new Comparator[]{bnVar, bnVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bu) {
            return Arrays.equals(this.a, ((bu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return s01.w(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}

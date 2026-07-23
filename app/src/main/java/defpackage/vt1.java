package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class vt1 extends xa1 implements Serializable {
    public static final vt1 a = new vt1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.xa1
    public final xa1 a() {
        return w61.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

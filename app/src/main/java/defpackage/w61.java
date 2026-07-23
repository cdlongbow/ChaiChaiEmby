package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class w61 extends xa1 implements Serializable {
    public static final w61 a = new w61();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.xa1
    public final xa1 a() {
        return vt1.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class wt1 extends xa1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final xa1 a;

    public wt1(xa1 xa1Var) {
        this.a = xa1Var;
    }

    @Override // defpackage.xa1
    public final xa1 a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wt1) {
            return this.a.equals(((wt1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}

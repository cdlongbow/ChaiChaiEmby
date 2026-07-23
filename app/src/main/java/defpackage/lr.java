package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class lr extends xa1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final z9 a;

    public lr(z9 z9Var) {
        this.a = z9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lr) && this.a == ((lr) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

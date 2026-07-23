package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class bn extends xa1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final xl0 a;
    public final xa1 b;

    public bn(xl0 xl0Var, xa1 xa1Var) {
        this.a = xl0Var;
        this.b = xa1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xl0 xl0Var = this.a;
        return this.b.compare(xl0Var.apply(obj), xl0Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return this.a.equals(bnVar.a) && this.b.equals(bnVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

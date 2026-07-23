package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class d21 {
    public final g11 a;
    public final Throwable b;

    public d21(g11 g11Var) {
        this.a = g11Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj;
        g11 g11Var = this.a;
        if (g11Var != null && g11Var == d21Var.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || d21Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public d21(Throwable th) {
        this.b = th;
        this.a = null;
    }
}

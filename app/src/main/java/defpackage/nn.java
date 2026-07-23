package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nn {
    public static final nn b = new nn();
    public final v81 a;

    public nn() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nn) {
            return Intrinsics.areEqual(this.a, ((nn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        v81 v81Var = this.a;
        if (v81Var != null) {
            return v81Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public nn(v81 v81Var) {
        this.a = v81Var;
    }
}

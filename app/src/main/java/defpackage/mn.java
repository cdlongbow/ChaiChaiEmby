package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mn {
    public final v81 a;

    public mn(v81 v81Var) {
        this.a = v81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mn) {
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.a, ((mn) obj).a);
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
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}

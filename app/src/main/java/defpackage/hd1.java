package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hd1 {
    public final ye2 a;

    public hd1(ye2 ye2Var) {
        this.a = ye2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd1) && Intrinsics.areEqual(this.a, ((hd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PendingUploadConfirmation(config=" + this.a + ")";
    }
}

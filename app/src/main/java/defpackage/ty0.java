package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ty0 {
    public final String a;
    public final hy0 b;

    public ty0(String str, hy0 hy0Var) {
        str.getClass();
        this.a = str;
        this.b = hy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0)) {
            return false;
        }
        ty0 ty0Var = (ty0) obj;
        return Intrinsics.areEqual(this.a, ty0Var.a) && this.b == ty0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LibrarySortFocusTarget(libraryId=" + this.a + ", action=" + this.b + ")";
    }
}

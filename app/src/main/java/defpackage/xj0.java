package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xj0 {
    public final String a;
    public final String b;

    public xj0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj0)) {
            return false;
        }
        xj0 xj0Var = (xj0) obj;
        return Intrinsics.areEqual(this.a, xj0Var.a) && Intrinsics.areEqual(this.b, xj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("FavoriteRestoreTarget(sectionTitle=", this.a, ", itemId=", this.b, ")");
    }
}

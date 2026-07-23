package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m82 {
    public final String a;
    public final String b;

    public m82(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m82)) {
            return false;
        }
        m82 m82Var = (m82) obj;
        return Intrinsics.areEqual(this.a, m82Var.a) && Intrinsics.areEqual(this.b, m82Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return mr.s("TitleLogoTarget(itemId=", this.a, ", tag=", this.b, ")");
    }
}

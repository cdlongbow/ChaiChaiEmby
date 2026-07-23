package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iv0 {
    public final String a;
    public final String b;

    public iv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return Intrinsics.areEqual(this.a, iv0Var.a) && Intrinsics.areEqual(this.b, iv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("IpInfo(ip=", this.a, ", country=", this.b, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nb0 {
    public final String a;
    public final String b;
    public final String c;

    public nb0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        return Intrinsics.areEqual(this.a, nb0Var.a) && Intrinsics.areEqual(this.b, nb0Var.b) && Intrinsics.areEqual(this.c, nb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s01.w(kb0.z("DlnaPlayRequestData(uri=", this.a, ", title=", this.b, ", metadata="), this.c, ")");
    }
}

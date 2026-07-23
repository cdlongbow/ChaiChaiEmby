package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o40 {
    public final String a;
    public final String b;
    public final String c;

    public o40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return Intrinsics.areEqual(this.a, o40Var.a) && Intrinsics.areEqual(this.b, o40Var.b) && Intrinsics.areEqual(this.c, o40Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return s01.w(kb0.z("DetailMediaSummary(referenceLabel=", this.a, ", path=", this.b, ", metaLine="), this.c, ")");
    }
}

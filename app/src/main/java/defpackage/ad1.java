package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ad1 {
    public final String a;
    public final String b;
    public final Integer c;

    public ad1(String str, String str2, Integer num) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad1)) {
            return false;
        }
        ad1 ad1Var = (ad1) obj;
        return Intrinsics.areEqual(this.a, ad1Var.a) && Intrinsics.areEqual(this.b, ad1Var.b) && Intrinsics.areEqual(this.c, ad1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("ParsedUrl(host=", this.a, ", protocol=", this.b, ", port=");
        sbZ.append(this.c);
        sbZ.append(")");
        return sbZ.toString();
    }
}

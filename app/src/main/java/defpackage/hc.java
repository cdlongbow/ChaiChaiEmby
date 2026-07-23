package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hc {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public hc(String str, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return this.a == hcVar.a && this.b == hcVar.b && this.c == hcVar.c && Intrinsics.areEqual(this.d, hcVar.d) && this.e == hcVar.e;
    }

    public final int hashCode() {
        int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbO = c61.o("ParsedVersion(major=", this.a, this.b, ", minor=", ", patch=");
        sbO.append(this.c);
        sbO.append(", preLabel=");
        sbO.append(this.d);
        sbO.append(", preNumber=");
        return ll0.f(sbO, this.e, ")");
    }
}

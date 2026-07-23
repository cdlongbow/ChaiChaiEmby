package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wr1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public wr1(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final String a() {
        String str = this.b;
        boolean zIsBlank = StringsKt.isBlank(str);
        String str2 = this.a;
        if (zIsBlank || Intrinsics.areEqual(str, str2)) {
            return str2;
        }
        return str + " (" + str2 + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr1)) {
            return false;
        }
        wr1 wr1Var = (wr1) obj;
        return Intrinsics.areEqual(this.a, wr1Var.a) && Intrinsics.areEqual(this.b, wr1Var.b) && Intrinsics.areEqual(this.c, wr1Var.c) && this.d == wr1Var.d;
    }

    public final int hashCode() {
        return i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("QrNetworkInterfaceOption(interfaceName=", this.a, ", displayName=", this.b, ", ipAddress=");
        sbZ.append(this.c);
        sbZ.append(", isActive=");
        sbZ.append(this.d);
        sbZ.append(")");
        return sbZ.toString();
    }
}

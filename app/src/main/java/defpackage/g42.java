package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g42 {
    public final String a;
    public final String b;
    public final Function0 c;

    public g42(String str, String str2, Function0 function0) {
        function0.getClass();
        this.a = str;
        this.b = str2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g42)) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return Intrinsics.areEqual(this.a, g42Var.a) && Intrinsics.areEqual(this.b, g42Var.b) && Intrinsics.areEqual(this.c, g42Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("SubtitleMenuItem(label=", this.a, ", status=", this.b, ", onClick=");
        sbZ.append(this.c);
        sbZ.append(")");
        return sbZ.toString();
    }
}

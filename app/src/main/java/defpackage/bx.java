package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bx {
    public final String a;
    public final String b;
    public final Function0 c;

    public bx(String str, String str2, Function0 function0) {
        function0.getClass();
        this.a = str;
        this.b = str2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return Intrinsics.areEqual(this.a, bxVar.a) && Intrinsics.areEqual(this.b, bxVar.b) && Intrinsics.areEqual(this.c, bxVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("DanmakuMenuItem(label=", this.a, ", status=", this.b, ", onClick=");
        sbZ.append(this.c);
        sbZ.append(")");
        return sbZ.toString();
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cq0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public cq0(String str, String str2, boolean z, String str3, String str4) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }




    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq0)) {
            return false;
        }
        cq0 cq0Var = (cq0) obj;
        return Intrinsics.areEqual(this.a, cq0Var.a) && Intrinsics.areEqual(this.b, cq0Var.b) && this.c == cq0Var.c && Intrinsics.areEqual(this.d, cq0Var.d) && Intrinsics.areEqual(this.e, cq0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int i = (i02.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31;
        String str2 = this.d;
        int iHashCode = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("HomeServerContext(id=", this.a, ", alias=", this.b, ", directOnly=");
        sbZ.append(this.c);
        sbZ.append(", iconPath=");
        sbZ.append(this.d);
        sbZ.append(", activeBackupRouteId=");
        return s01.w(sbZ, this.e, ")");
    }
}

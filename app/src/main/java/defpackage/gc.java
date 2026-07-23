package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public gc(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return Intrinsics.areEqual(this.a, gcVar.a) && Intrinsics.areEqual(this.b, gcVar.b) && Intrinsics.areEqual(this.c, gcVar.c) && Intrinsics.areEqual(this.d, gcVar.d) && Intrinsics.areEqual(this.e, gcVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("LatestReleaseResponse(tagName=", this.a, ", name=", this.b, ", body=");
        i02.v(sbZ, this.c, ", htmlUrl=", this.d, ", assets=");
        sbZ.append(this.e);
        sbZ.append(")");
        return sbZ.toString();
    }
}

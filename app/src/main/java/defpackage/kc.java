package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kc {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;

    public kc(boolean z, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return this.a == kcVar.a && Intrinsics.areEqual(this.b, kcVar.b) && Intrinsics.areEqual(this.c, kcVar.c) && Intrinsics.areEqual(this.d, kcVar.d) && Intrinsics.areEqual(this.e, kcVar.e) && Intrinsics.areEqual(this.f, kcVar.f) && Intrinsics.areEqual(this.g, kcVar.g) && this.h == kcVar.h;
    }

    public final int hashCode() {
        int i = i02.i(i02.i(i02.i(i02.i((this.a ? 1231 : 1237) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.h;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCheckResult(hasUpdate=");
        sb.append(this.a);
        sb.append(", currentVersion=");
        sb.append(this.b);
        sb.append(", latestVersion=");
        i02.v(sb, this.c, ", releaseNotes=", this.d, ", releasePageUrl=");
        i02.v(sb, this.e, ", apkDownloadUrl=", this.f, ", apkFileName=");
        sb.append(this.g);
        sb.append(", apkSizeBytes=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

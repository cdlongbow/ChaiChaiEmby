package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jw {
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public jw(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        str5.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return Intrinsics.areEqual(this.a, jwVar.a) && Intrinsics.areEqual(this.b, jwVar.b) && Intrinsics.areEqual(this.c, jwVar.c) && Intrinsics.areEqual(this.d, jwVar.d) && Intrinsics.areEqual(this.e, jwVar.e) && Intrinsics.areEqual(this.f, jwVar.f);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DanmakuAutoMatchResult(comments=");
        sb.append(this.a);
        sb.append(", loadSource=");
        sb.append(this.b);
        sb.append(", apiUrl=");
        i02.v(sb, this.c, ", animeTitle=", this.d, ", episodeTitle=");
        sb.append(this.e);
        sb.append(", toastMessage=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

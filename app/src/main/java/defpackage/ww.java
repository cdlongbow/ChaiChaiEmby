package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ww {
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ww(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
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
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        return Intrinsics.areEqual(this.a, wwVar.a) && Intrinsics.areEqual(this.b, wwVar.b) && Intrinsics.areEqual(this.c, wwVar.c) && Intrinsics.areEqual(this.d, wwVar.d) && Intrinsics.areEqual(this.e, wwVar.e) && Intrinsics.areEqual(this.f, wwVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i02.i(i02.i(i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DanmakuManualSearchResult(comments=");
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

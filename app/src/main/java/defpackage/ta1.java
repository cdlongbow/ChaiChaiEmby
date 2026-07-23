package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ta1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ta1(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta1)) {
            return false;
        }
        ta1 ta1Var = (ta1) obj;
        return Intrinsics.areEqual(this.a, ta1Var.a) && Intrinsics.areEqual(this.b, ta1Var.b) && Intrinsics.areEqual(this.c, ta1Var.c) && Intrinsics.areEqual(this.d, ta1Var.d) && Intrinsics.areEqual(this.e, ta1Var.e) && Intrinsics.areEqual(this.f, ta1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i02.i(i02.i(i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("OnlineSubtitleTrack(id=", this.a, ", label=", this.b, ", filePath=");
        i02.v(sbZ, this.c, ", mimeType=", this.d, ", format=");
        sbZ.append(this.e);
        sbZ.append(", language=");
        sbZ.append(this.f);
        sbZ.append(")");
        return sbZ.toString();
    }
}

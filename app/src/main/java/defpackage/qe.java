package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qe {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public qe(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return Intrinsics.areEqual(this.a, qeVar.a) && Intrinsics.areEqual(this.b, qeVar.b) && Intrinsics.areEqual(this.c, qeVar.c) && Intrinsics.areEqual(this.d, qeVar.d) && Intrinsics.areEqual(this.e, qeVar.e) && Intrinsics.areEqual(this.f, qeVar.f) && Intrinsics.areEqual(this.g, qeVar.g) && Intrinsics.areEqual(this.h, qeVar.h) && Intrinsics.areEqual(this.i, qeVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + i02.i(i02.i(i02.i(i02.i(i02.i(i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("SearchItem(id=", this.a, ", title=", this.b, ", nativeName=");
        i02.v(sbZ, this.c, ", language=", this.d, ", releaseSite=");
        i02.v(sbZ, this.e, ", fileName=", this.f, ", updateTime=");
        i02.v(sbZ, this.g, ", rating=", this.h, ", ratingCount=");
        return s01.w(sbZ, this.i, ")");
    }
}

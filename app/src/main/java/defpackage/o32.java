package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o32 {
    public final String a;
    public final String b;
    public final String c;

    public o32(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }



    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o32)) {
            return false;
        }
        o32 o32Var = (o32) obj;
        return Intrinsics.areEqual(this.a, o32Var.a) && Intrinsics.areEqual(this.b, o32Var.b) && Intrinsics.areEqual(this.c, o32Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s01.w(kb0.z("SubtitleFontEntry(id=", this.a, ", name=", this.b, ", path="), this.c, ")");
    }
}

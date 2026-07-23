package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uv1 {
    public final String a;
    public final String b;
    public final String c;

    public uv1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv1)) {
            return false;
        }
        uv1 uv1Var = (uv1) obj;
        return Intrinsics.areEqual(this.a, uv1Var.a) && Intrinsics.areEqual(this.b, uv1Var.b) && Intrinsics.areEqual(this.c, uv1Var.c) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return s01.w(kb0.z("SectionItem(id=", this.a, ", name=", this.b, ", imageUrl="), this.c, ", logoUrl=null)");
    }
}

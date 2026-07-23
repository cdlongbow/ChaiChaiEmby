package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u51 {
    public final String a;
    public final String b;
    public final String c;

    public u51(String str, String str2, String str3) {
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
        if (!(obj instanceof u51)) {
            return false;
        }
        u51 u51Var = (u51) obj;
        return Intrinsics.areEqual(this.a, u51Var.a) && Intrinsics.areEqual(this.b, u51Var.b) && Intrinsics.areEqual(this.c, u51Var.c);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return s01.w(kb0.z("MoviePlaybackDialogOption(key=", this.a, ", title=", this.b, ", meta="), this.c, ")");
    }
}

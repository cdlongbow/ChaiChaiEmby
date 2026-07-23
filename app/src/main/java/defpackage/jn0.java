package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jn0 {
    public final String a;
    public final String b;
    public final boolean c;

    public jn0(String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return Intrinsics.areEqual(this.a, jn0Var.a) && Intrinsics.areEqual(this.b, jn0Var.b) && this.c == jn0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return i02.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return i9.i(kb0.z("HomeContentIdentity(serverId=", this.a, ", userId=", this.b, ", hidePlayed="), this.c, ")");
    }
}

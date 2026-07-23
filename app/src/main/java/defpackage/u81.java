package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u81 {
    public final String a;
    public final String b;
    public final t81 c;
    public final pi0 d;

    public u81(String str, String str2, t81 t81Var, pi0 pi0Var) {
        this.a = str;
        this.b = str2;
        this.c = t81Var;
        this.d = pi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u81)) {
            return false;
        }
        u81 u81Var = (u81) obj;
        return Intrinsics.areEqual(this.a, u81Var.a) && Intrinsics.areEqual(this.b, u81Var.b) && Intrinsics.areEqual(this.c, u81Var.c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.d, u81Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbZ.append(this.c);
        sbZ.append(", body=null, extras=");
        sbZ.append(this.d);
        sbZ.append(")");
        return sbZ.toString();
    }
}

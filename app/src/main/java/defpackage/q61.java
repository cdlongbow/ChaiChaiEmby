package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q61 {
    public final String a;
    public final String b;

    public q61(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q61)) {
            return false;
        }
        q61 q61Var = (q61) obj;
        return Intrinsics.areEqual(this.a, q61Var.a) && Intrinsics.areEqual(this.b, q61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("ImageRequestAuth(token=", this.a, ", deviceId=", this.b, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p92 {
    public final String a;
    public final String b;

    public p92(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p92)) {
            return false;
        }
        p92 p92Var = (p92) obj;
        return Intrinsics.areEqual(this.a, p92Var.a) && Intrinsics.areEqual(this.b, p92Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("TraktIdLookup(idType=", this.a, ", id=", this.b, ")");
    }
}

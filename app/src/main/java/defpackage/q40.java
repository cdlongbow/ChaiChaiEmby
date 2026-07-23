package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q40 {
    public final String a;
    public final String b;

    public q40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return Intrinsics.areEqual(this.a, q40Var.a) && Intrinsics.areEqual(this.b, q40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("DetailMetadataRow(label=", this.a, ", value=", this.b, ")");
    }
}

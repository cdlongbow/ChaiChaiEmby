package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v90 extends z90 {
    public final String a;
    public final String b;

    public v90(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }



    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return Intrinsics.areEqual(this.a, v90Var.a) && Intrinsics.areEqual(this.b, v90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return mr.s("Available(itemId=", this.a, ", url=", this.b, ")");
    }
}

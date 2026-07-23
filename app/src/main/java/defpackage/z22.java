package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z22 {
    public final int a;
    public final long b;
    public final long c;
    public final String d;

    public z22(int i, long j, long j2, String str) {
        str.getClass();
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z22)) {
            return false;
        }
        z22 z22Var = (z22) obj;
        return this.a == z22Var.a && this.b == z22Var.b && this.c == z22Var.c && Intrinsics.areEqual(this.d, z22Var.d);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SrtEntry(index=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        id.m(sb, ", endTime=", this.c, ", text=");
        return s01.w(sb, this.d, ")");
    }
}

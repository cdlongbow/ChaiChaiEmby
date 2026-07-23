package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e62 {
    public final boolean a;
    public final int b;
    public final long c;
    public final String d;

    public e62(boolean z, int i, long j, String str) {
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e62)) {
            return false;
        }
        e62 e62Var = (e62) obj;
        return this.a == e62Var.a && this.b == e62Var.b && this.c == e62Var.c && Intrinsics.areEqual(this.d, e62Var.d);
    }

    public final int hashCode() {
        int i = (((this.a ? 1231 : 1237) * 31) + this.b) * 31;
        long j = this.c;
        return this.d.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "TestResult(success=" + this.a + ", statusCode=" + this.b + ", duration=" + this.c + ", message=" + this.d + ")";
    }
}

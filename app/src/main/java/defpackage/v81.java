package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v81 {
    public final int a;
    public final long b;
    public final long c;
    public final t81 d;
    public final q22 e;
    public final Object f;

    public v81(int i, long j, long j2, t81 t81Var, q22 q22Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = t81Var;
        this.e = q22Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v81)) {
            return false;
        }
        v81 v81Var = (v81) obj;
        return this.a == v81Var.a && this.b == v81Var.b && this.c == v81Var.c && Intrinsics.areEqual(this.d, v81Var.d) && Intrinsics.areEqual(this.e, v81Var.e) && Intrinsics.areEqual(this.f, v81Var.f);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iHashCode = (this.d.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        q22 q22Var = this.e;
        int iHashCode2 = (iHashCode + (q22Var == null ? 0 : q22Var.a.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        id.m(sb, ", responseMillis=", this.c, ", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

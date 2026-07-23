package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w81 {
    public final e62 a;
    public final e62 b;
    public final String c;
    public final String d;

    public w81(e62 e62Var, e62 e62Var2, String str, String str2) {
        e62Var.getClass();
        e62Var2.getClass();
        this.a = e62Var;
        this.b = e62Var2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        return Intrinsics.areEqual(this.a, w81Var.a) && Intrinsics.areEqual(this.b, w81Var.b) && Intrinsics.areEqual(this.c, w81Var.c) && Intrinsics.areEqual(this.d, w81Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i02.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "NetworkTestResult(googleResult=" + this.a + ", baiduResult=" + this.b + ", publicIp=" + this.c + ", country=" + this.d + ")";
    }
}

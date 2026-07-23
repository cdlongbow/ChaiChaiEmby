package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zp1 implements lw1 {
    public final String a;
    public final yp1 b;

    public zp1(String str, yp1 yp1Var) {
        yp1Var.getClass();
        this.a = str;
        this.b = yp1Var;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1
    public final int c() {
        return 0;
    }

    @Override // defpackage.lw1
    public final String d(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1Var = (zp1) obj;
        return Intrinsics.areEqual(this.a, zp1Var.a) && Intrinsics.areEqual(this.b, zp1Var.b);
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final boolean g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.lw1

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return qb2.i(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}

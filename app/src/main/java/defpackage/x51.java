package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x51 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public x51(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x51)) {
            return false;
        }
        x51 x51Var = (x51) obj;
        return this.a == x51Var.a && this.b == x51Var.b && this.c == x51Var.c && this.d == x51Var.d && this.e == x51Var.e && this.f == x51Var.f && this.g == x51Var.g;
    }

    public final int hashCode() {
        return (((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbO = c61.o("CompositionObject(objectId=", this.a, this.b, ", x=", ", y=");
        c61.t(sbO, this.c, ", cropX=", this.d, ", cropY=");
        c61.t(sbO, this.e, ", cropWidth=", this.f, ", cropHeight=");
        return ll0.f(sbO, this.g, ")");
    }
}
